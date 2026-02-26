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
 * Builds JSP stream RULE-APPLICATION!PZDOCUMENTATION.
 */
public class ra_stream_pzdocumentation_764cf5e6ba962b9b49b06804fb6f0ae9 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzDocumentation.Rule_Application.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 502470867;
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
	public ra_stream_pzdocumentation_764cf5e6ba962b9b49b06804fb6f0ae9(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "8141a3085fdb1ea12af60d655b6d7c292a317d2b";
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
/* Instance RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT	Pega-AppDefinition:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "8141a3085fdb1ea12af60d655b6d7c292a317d2b";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzDocumentation",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT */
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
	"Rule-HTML-Section:PZDOCUMENTATION", 
	"Rule-Obj-Property:PYNAME", 
	"Rule-Obj-Property:PYPROJECTMETHODOLOGY", 
	"Rule-HTML-Property:PXTEXTAREA", 
	"Rule-HTML-Property:PXLINK", 
	"Rule-HTML-Property:PXDROPDOWN", 
	"Rule-HTML-Property:PXADDLISTITEM", 
	"Rule-HTML-Property:PXDELETELISTITEM"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZDOCUMENTATION","Rule-HTML-Section","RULE-APPLICATION",false,"","Pega-AppDefinition","08-02-01","RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT","!PZDOCUMENTATION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",502470867), 
		new DependentRuleInfo("PYNAME","Rule-Obj-Property","EMBED-APPLICATION-METADATA",true,"Embed-Application-MetaData","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY EMBED-APPLICATION-METADATA PYNAME #20180713T131857.491 GMT","!PYNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYPROJECTMETHODOLOGY","Rule-Obj-Property","RULE-APPLICATION",true,"Rule-Application","Pega-Desktop","08-01-01","RULE-OBJ-PROPERTY RULE-APPLICATION PYPROJECTMETHODOLOGY #20180713T135036.953 GMT","!PYPROJECTMETHODOLOGY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXTEXTAREA","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXTEXTAREA #20190131T183501.680 GMT","PXTEXTAREA",true,false,"ABSOLUTE_CLASSLESS",-1168558220), 
		new DependentRuleInfo("PXLINK","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT","PXLINK",true,false,"ABSOLUTE_CLASSLESS",-1085887471), 
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
//	RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT:20181004T134039.059 GMT
//	RULE-HTML-PROPERTY PXTEXTAREA #20190131T183501.680 GMT:20190131T183501.680 GMT
//	RULE-OBJ-PROPERTY EMBED-APPLICATION-METADATA PYNAME #20180713T131857.491 GMT:20180713T131857.491 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-HTML-PROPERTY PXTEXTAREA #20190131T183501.680 GMT:20190131T183501.680 GMT
//	RULE-OBJ-PROPERTY EMBED-APPLICATION-METADATA PYNAME #20180713T131857.491 GMT:20180713T131857.491 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-OBJ-PROPERTY EMBED-APPLICATION-METADATA PYNAME #20180713T131857.491 GMT:20180713T131857.491 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-OBJ-PROPERTY EMBED-APPLICATION-METADATA PYNAME #20180713T131857.491 GMT:20180713T131857.491 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-OBJ-PROPERTY EMBED-APPLICATION-METADATA PYNAME #20180713T131857.491 GMT:20180713T131857.491 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-OBJ-PROPERTY EMBED-APPLICATION-METADATA PYNAME #20180713T131857.491 GMT:20180713T131857.491 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-HTML-PROPERTY PXTEXTAREA #20190131T183501.680 GMT:20190131T183501.680 GMT
//	RULE-OBJ-PROPERTY EMBED-APPLICATION-METADATA PYNAME #20180713T131857.491 GMT:20180713T131857.491 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY EMBED-APPLICATION-METADATA PYNAME #20180713T131857.491 GMT:20180713T131857.491 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-HTML-PROPERTY PXADDLISTITEM #20180713T133433.426 GMT:20180713T133433.426 GMT
//	RULE-OBJ-PROPERTY EMBED-APPLICATION-METADATA PYNAME #20180713T131857.491 GMT:20180713T131857.491 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-HTML-PROPERTY PXADDLISTITEM #20180713T133433.426 GMT:20180713T133433.426 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY RULE-APPLICATION PYPROJECTMETHODOLOGY #20180713T135036.953 GMT:20180713T135036.953 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(
//	pzLayout_4(
//	pzLayout_5(
//	pzLayout_3(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME CURRENTDATETIME #20180713T131432.995 GMT:20180713T131432.995 GMT
//	RULE-UTILITY-FUNCTION DATETIME FORMATDATETIME #20180713T131433.041 GMT:20180713T131433.041 GMT
//	RULE-UTILITY-FUNCTION DATETIME GETCURRENTTIMESTAMPUNIQUE #20180713T131433.071 GMT:20180713T131433.071 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS #20180713T131438.133 GMT:20180713T131438.133 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PXADDGUARDRAILMESSAGE #20180713T131742.411 GMT:20180713T131742.411 GMT
//	RULE-UTILITY-FUNCTION GRID PZMIGRATEGRIDRIGHTCLICKACTION #20180713T133337.796 GMT:20180713T133337.796 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLDEFAULTVALUES #20180713T133337.840 GMT:20180713T133337.840 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDHEADERELEMENTS--(STRINGBUFFE2CEB5A8FA884B8FB8C9CC7705D04E287 #20200407T102458.616 GMT:20200427T060350.869 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDSECTIONBODYELEMENTS--(STRINGFC27BFECDD5F0250930FF8FA168BE1FF #20180713T133338.055 GMT:20180713T133338.055 GMT
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
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELCELLCONTENT #20190410T165241.183 GMT:20190410T165241.183 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATENOROWSMESSAGE #20180713T133339.845 GMT:20180713T133339.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETFIELDDESCRIPTION #20180713T133339.962 GMT:20180713T133339.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDEHEADERICON #20180713T133341.204 GMT:20180713T133341.204 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODY #20221007T070330.438 GMT:20221010T104158.645 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODYCONTENT--(CL762755102FCAC7F04E931D9162F7533A #20180713T133341.219 GMT:20180713T133341.219 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATECONTROL--(CLIPBOARDPAGE,CLIPBOARDPROPERTY) #20190930T091802.162 GMT:20190930T091802.162 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONADDROW #20190204T044757.846 GMT:20190204T044757.846 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONDELETEROW--(CLIPBOARDPAG0B11B94B773838E3A9E06E99689ED6C8 #20180915T103511.007 GMT:20180915T103511.007 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECALCULATEDVALUE--(CLIP25E448149E37EDE02190B4A70F76AB5B #20210527T114234.915 GMT:20210527T114234.915 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEDROPDOWN #20230618T001619.478 GMT:20230618T001619.478 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFIELDVALUEAPI #20200312T061421.553 GMT:20200319T144505.401 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT--(STRING,CLIPBOE3B9AB14D60C9BC144A59D967BEF48D3 #20231111T205726.843 GMT:20231111T205726.843 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEICON #20220323T120107.529 GMT:20220323T120107.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATETEXTAREA--(CLIPBOARDPA67BFBD8D308BDD60B73596A4DF27E213 #20230618T001619.543 GMT:20230618T001619.543 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETCONTROLSFORMAT--(CLIPBOARDP67982A3A95FEBEAA95783F4B64F7D734 #20231101T074700.438 GMT:20231101T074700.438 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZVALIDATEFIELDVALUE #20180713T133346.618 GMT:20180713T133346.618 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION STRING TRIM #20180713T131442.833 GMT:20180713T131442.833 GMT
//	RULE-UTILITY-FUNCTION UTILITIES PZVALIDATEFIELDVALUEREFERENCE #20231004T060003.271 GMT:20231004T060003.271 GMT
//	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE2 #20180713T131446.070 GMT:20180713T131446.070 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ab45f8d8361d99c63f82762bed8649d7";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Application";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_12")){
pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_15")){
pzLayoutBodyWrapper_2();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_18")){
pzLayoutBodyWrapper_3();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzLayoutBodyWrapper_4();
pzLayoutBodyWrapper_4();
pzLayoutBodyWrapper_4();
pzLayoutBodyWrapper_4();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzDocumentation",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzDocumentation','insKey':'RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT','sectionType':'standard'}");
pzLayout_1();
pzLayout_2();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_21")) ){
pzLayout_3();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_28")) ){
pzLayout_4();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_31")) ){
pzLayout_5();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzLayout_6();
pzLayout_7();
pzLayout_8();
pzLayout_9();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void pzLayoutHeader_6() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionpzDocumentationBBBBBBBBB"));
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("DCO settings", "pyCaption");
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("title","DCO settings");
metadataPage.put("uniqueid", "202602211403220258");
metadataPage.put("automationId", " " + pzCell.getTestIdIfEnabled("201810021155240242434") + " ");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_6() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_13() {
 String clsScroll= "";tools.appendString("<div section_index='9' class='" + clsScroll + " layout-body'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void inclFormattedVal_4(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {if (isSecuredProp) { tools.putParamValue("proSecurity_isSecuredProp", isSecuredProp);tools.putParamValue("proSecurity_activePropValue", activePropValue);}
		pega.checkIfActivePropertyMissing();
		tools.appendString(pega_uiengine_formatter.pxFormatText(pega_uiengine_pzcontrol.pzGetCaptionValue("associated","null","null","","","","null","null",true,(PegaStreamAPI)tools),false,"","",true,"caption"));
		if("".equals(pega_uiengine_pzcontrol.pzGetCaptionValue("associated","null","null","","","","null","null",true,(PegaStreamAPI)tools)) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals(pega_uiengine_pzcontrol.pzGetCaptionValue("associated","null","null","","","","null","null",true,(PegaStreamAPI)tools)) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}if (isSecuredProp) { tools.putParamValue("proSecurity_isSecuredProp", "");tools.putParamValue("proSecurity_activePropValue", "");}
}


public void drodownButtonIncludes_1() {
if (pzAuto.doOnlyOnce("pzDropdown")) {
pzAuto.emitIncludeStreamReference("pzDropdownButtonIncludes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
}
public void inclFormattedVal_3(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_38")){
inclCalVal_1("pxDropdown","NF","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_39")){
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
	IUIComponentMetadata pyUserData = pzAuto.getUIComponentRuntime().createMetadata();
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201505210603380580297440",true));
	cellPage.put("pyValue",".pyProjectMethodology");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyProjectMethodology");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyProjectMethodology", ".pyCaption");
	String pyTooltip="";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyTooltip","Impacts the sizing wizard and default specification format\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Impacts the sizing wizard and default specification format", ".pyTooltip");
	}
	pyTooltip = "Impacts the sizing wizard and default specification format";
	cellPage.put("tooltip",pyTooltip);
	modePage1.put("pyHasNoSelection","false");
	String ddPropRef = tools.getActive().getReference();
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, pyStringType,pegaValidation.toString());
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addErrors(".pyProjectMethodology",pxUniqueStreamHash+"_40");
	IUIComponentMetadata pxErrorIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxErrorIdentifiers",pxErrorIdentifiers);
	pxErrorIdentifiers.put("pyErrorId",pxUniqueStreamHash+"_40");
	modePage1.put("clintValidAttrs",clientValidationAttributes);
	modePage1.put("pyID","pyProjectMethodology");
	modePage1.put("pyControlLoadMode","auto");
	String strPropName= tools.getActive().getName();
	String strClassName = tools.getDictionary().fromDefinition(tools.getActive(),"pyClassName");
	if ("".equals(strClassName)) {
	strClassName = "Rule-Application";
	}
	String tableInfo[] =  tools.getDictionary().getTableEditInfo(strClassName,strPropName);
	ClipboardProperty cbpResults = pega_rulesengine_utilities.pzGetValidValues(strClassName,strPropName,false,tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_TABLEOPTION],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_TABLECLASS],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_TABLESELECTOR],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_FIELDNAME],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_FIELDCLASS],true);
	StringBuilder results = new StringBuilder("");
	int listSize = cbpResults.size();
	if(cbpResults != null && listSize > 0){
	java.util.Iterator resIter = cbpResults.iterator();
	results.append("[");
	for(int i=0; i< listSize; i++){
	ClipboardPage cbpRow = ((ClipboardProperty)resIter.next()).getPageValue();
	String sDisplay = cbpRow.getString(".pyLabel");
	String sValue = cbpRow.getString(".pyFieldValue");
	results.append("{");
	results.append("\"pyLabel\":" +"\"" +StringUtils.escapeIntoJSONString(sDisplay)+"\"");
	results.append(",\"pyFieldValue\":" + "\""+ StringUtils.escapeIntoJSONString(sValue)+"\"");
	results.append("}");
	if(i != listSize-1){
	results.append(",");
	}
	}
	results.append("]");
	}
	if(results.toString().equals("")){
	results = new StringBuilder("{ \"pxResults\" : \"\"}");
	}
	else{
	results = new StringBuilder("{ \"pxResults\" : "+ results +"}"); 
	}
	modePage1.put("pyTempText",results.toString());
	modePage1.put("pyValue",".pyFieldValue");
	modePage1.put("pyPrompt",".pyLabel");
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	modePage1.put("pySpecifySize","auto");
	modePage1.put("styleOther","standard");
	String spxUniqueStreamHash41 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash41 != null && !"".equals(spxUniqueStreamHash41)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash41,pxUniqueStreamHash+"_41");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_41");
	}
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201505210603380580297440",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyProjectMethodology");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyProjectMethodology", ".pyCaption");
	pyValueR = ".pyProjectMethodology";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyProjectMethodology");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyProjectMethodology", ".pyCaption");
	pyValueOrig = ".pyProjectMethodology";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","caption");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","none");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyShowValueAs","");
	String spxUniqueStreamHash42 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash42 != null && !"".equals(spxUniqueStreamHash42)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash42,pxUniqueStreamHash+"_42");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_42");
	}
	
			 Boolean pyUseAccessibleDropdown = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
	modePage1.put("pyUseAccessibleDropdown",pyUseAccessibleDropdown+"");
	modePage1.put("hasChangeEvent","false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addAdditionalScripts("pxDisplayText","pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.addDependentScripts("pzpega_ui_template_dropdown.js","pzpega_control_dropdown.js","pzpega_ui_dropdown.js","pzpega_control_dropdownbutton.js");
	ctrlComponent.beginComponent("pxDropdown",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
} else {
	String ddPropRef = tools.getActive().getReference();
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
			ClipboardPage cbpRes=null;
			ClipboardProperty cbpResults=null;
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();boolean beginNonTemplate = true;if(bOptimizedMarkup){beginNonTemplate = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_43");}if(beginNonTemplate){			HashStringMap params = new HashStringMap();
			String strClassName = tools.getDictionary().fromDefinition(tools.getActive(), "pyClassName");
			if("".equals(strClassName)){
			strClassName = "Rule-Application";
			}
			String tableInfo[] =  tools.getDictionary().getTableEditInfo(strClassName,strPropName);
			if(tableInfo!=null) {
			
		cbpResults = pega_rulesengine_utilities.pzGetValidValues(strClassName,strPropName,false,tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_TABLEOPTION],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_TABLECLASS],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_TABLESELECTOR],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_FIELDNAME],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_FIELDCLASS],true);
			}

		String strActiveValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);			String strValue = isSecuredProp ? activePropValue : tools.getProperty(ddPropRef).getStringValue();
			String displayString ="";
			String valueString ="";
			String selected ="";
			String groupbyString ="";
			boolean isAccessible = false && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
			if(!isAccessible) {
				tools.appendString("<select data-ctl='[\"Dropdown\"]' ");
				tools.appendString(" " + pzCell.getTestIdIfEnabled("201505210603380580297440") + " ");
				tools.appendString(styleAttribute + disabled_ctrl + " id='");
				tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
			tools.appendString("'");
			} else {
			tools.appendString("<input type='hidden' data-ctl='[\"Dropdown\"]'" + disabled_ctrl);
			}

		String dropdownName = "";			tools.appendString(" name='");
if(bOptimizedMarkup){
		tools.appendCSF(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));
		dropdownName=StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));			tools.appendString("' ");
tools.appendString(" data-bindprops='value' ");} else{			tools.appendString(ddPropEntryHandle);

		dropdownName=ddPropEntryHandle;			tools.appendString("' ");
}
		tools.appendString("aria-describedby='"+dropdownName+"Error'");			tools.appendString(" ");
			pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
			tools.appendString(" ");
			if(isAccessible) {
				tools.appendString(" value='");
				if("".equals(strValue) && cbpResults != null && cbpResults.size() > 0) {
					String pyValueProp = "pyFieldValue";
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
			tools.appendString(" " + pzCell.getTestIdIfEnabled("201505210603380580297440") + " ");
			tools.appendString(styleAttribute + disabled_ctrl + " id='");
			tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
		tools.appendString("'");
		}
		tools.appendString(" title=\"");
		tools.appendString(tools.getLocalizedTextForString(".pyToolTip","Impacts the sizing wizard and default specification format",StreamBuilder.FMT_NORMAL));
		tools.appendString("\" style='width:auto' >");
		if (cbpResults != null && cbpResults.size() > 0) {
			int iListSize = cbpResults.size();
			java.util.Iterator resIter = cbpResults.iterator();
			while(resIter.hasNext()) {
				ClipboardPage cbpRow = ((ClipboardProperty)resIter.next()).getPageValue();
				displayString = cbpRow.getStringIfPresent("pyLabel");
				valueString = cbpRow.getStringIfPresent("pyFieldValue");
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
			pzAuto.getPropertyActionRequest().registerEnumeratedParameter(ddPropEntryHandle, valueString);
			if("".equals(displayString))
				displayString = valueString ;
			selected = (valueString.equals(strValue)) ? "selected " : ""; 
		tools.appendString("<option " + selected + " value=\"" + tools.getXMLUtils().encodeString(valueString) + "\">" + StringUtils.crossScriptingFilter(displayString) + "</option>");
		}
	}
	tools.appendString("</select >");
	if(isAccessible) {
		String pyBtnLbl = ".pyButtonLabel";
		String ctrName = "Select";
		tools.appendString("<input " + disabled_ctrl + " name='SB_" + ddPropEntryHandle + "' type='button' data-ctl='[\"DropdownButton\"]' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' style='width:auto;' />");
		drodownButtonIncludes_1();
	}
	try { if(cbpResults != null){ cbpResults.getParentPage().removeFromClipboard(); } } catch(Exception e){}
	pega_uiengine_pzcontrol.pzAddMessages(tools,"SIMPLELAYOUT");
}if(bOptimizedMarkup){pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}}

		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("201505210603380580297440") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_44")){inclFormattedVal_4(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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


	pzAuto.getSection().getControl().includeShowMe(isEditable);
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
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDropdown",".pyProjectMethodology",".pySections(9).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("201505210603380580297440-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyProjectMethodology"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","Project methodology") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201505210603380580297440-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyProjectMethodology"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","Project methodology") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDropdown_1(".pyProjectMethodology",0,"","","Text");
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
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("useLabel","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201505210603380580297440-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDropdown");
	pgCells.put("forLabel",".pyProjectMethodology");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDropdown",".pyProjectMethodology",".pySections(9).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDropdown_1(".pyProjectMethodology",0,"","","Text");labelName = "Project methodology";
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
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(9).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-label item-" + Integer.toString(index) + "   '  STRING_TYPE='label' RESERVE_SPACE='false'><div class='content-inner '>" + "<div  " + pzCell.getTestIdIfEnabled("201505210603380580298756") + "  class='field-item " + pzSection.getCustomStyle(false, "","dataLabelRead helper_text_dataLabelRead","dataLabelWrite helper_text_dataLabelWrite") + "' >");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","This choice sets the default specification format, sizing wizard template and document wizard template") + "</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("pyType","label");
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("useLabel","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201505210603380580298756")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("spanClass","iconRequired helper_text_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("labelReadClass","dataLabelRead helper_text_dataLabelRead");
	pgCells.put("labelWriteClass","dataLabelWrite helper_text_dataLabelWrite");
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(9).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "This choice sets the default specification format, sizing wizard template and document wizard template";
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
public void pzSetExpandParam_9() {
pzSection.getLayout().setExpandParam("SubSectionpzDocumentationBBBBBBBBB","",true);
}
public void LayoutWrapperTableStart_9() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(9)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpzDocumentationBBBBBBBBB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\">");
}

 public void pzHeaderBody_9(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","DCO settings");
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel8015' data-layout-id='202602211403220241" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel8015'>" + l_sectionTitle + "</h2><nobr>");
inclAction_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzDocumentationBBBBBBBBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash37 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash37 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash37 != null && !"".equals(spxUniqueStreamHash37)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash37,pxUniqueStreamHash+"_37");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201810021155240242434") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString(" class='" + " content  layout-content-stacked content-stacked " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash37 != null && !"".equals(spxUniqueStreamHash37)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_37");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","stacked");
		pg_dlmeta.put("isFlex","false");
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
	public void LayoutWrapperTableEnd_3() {
	tools.appendString("</div>");
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
	String paramName = "EXPANDEDSubSectionpzDocumentationBBBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(9)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-default");
	metadataPage.put("sectionIndex","9");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutHeader_6();
	pzLayoutBody_6();
	containerComponent.endComponent();
	}
public void pzLayout_9() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_9();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_9(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_9();
}
pzLayoutBodyWrapper_13();
 LayoutWrapperTableEnd_3(); }
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_6();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutHeader_5() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionpzDocumentationBBBBBBBB"));
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Organization", "pyCaption");
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("title","Organization");
metadataPage.put("uniqueid", "202602211403220240");
metadataPage.put("automationId", "");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_5() {
includeSectionBody_5();
}
public void pzLayoutBodyWrapper_12() {
 String clsScroll= "";tools.appendString("<div section_index='8' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_5();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_5() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_36","pzOrgDivUnit", secInfo);
}


public void includeSectionBody_5() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_5();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzOrgDivUnit";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_8() {
pzSection.getLayout().setExpandParam("SubSectionpzDocumentationBBBBBBBB","",true);
}
public void LayoutWrapperTableStart_8() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(8)','clipboardPath':'pzOrgDivUnit'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpzDocumentationBBBBBBBB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\">");
}

 public void pzHeaderBody_8(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Organization");
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel5188' data-layout-id='202602211403220234" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel5188'>" + l_sectionTitle + "</h2><nobr>");
inclAction_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzDocumentationBBBBBBBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

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
String paramName = "EXPANDEDSubSectionpzDocumentationBBBBBBBB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(8)','clipboardPath':'pzOrgDivUnit'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("prefix","-default");
metadataPage.put("sectionIndex","8");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Inline-block");
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
pzLayoutHeader_5();
pzLayoutBody_5();
containerComponent.endComponent();
}
public void pzLayout_8() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_8();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_8(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_8();
}
pzLayoutBodyWrapper_12();
 LayoutWrapperTableEnd_1(); }
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_5();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutHeader_4() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionpzDocumentationBBBBBBB"));
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Attachments", "pyCaption");
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("title","Attachments");
metadataPage.put("uniqueid", "202602211403220234");
metadataPage.put("automationId", "");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_4() {
includeSectionBody_4();
}
public void pzLayoutBodyWrapper_11() {
 String clsScroll= "";tools.appendString("<div section_index='7' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_4();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_4() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_35","ApplicationCustomFields", secInfo);
}


public void includeSectionBody_4() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_4();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "ApplicationCustomFields";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_7() {
pzSection.getLayout().setExpandParam("SubSectionpzDocumentationBBBBBBB","",true);
}
public void LayoutWrapperTableStart_7() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(7)','clipboardPath':'ApplicationCustomFields'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpzDocumentationBBBBBBB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\">");
}

 public void pzHeaderBody_7(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Attachments");
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel1437' data-layout-id='202602211403220227" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel1437'>" + l_sectionTitle + "</h2><nobr>");
inclAction_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzDocumentationBBBBBBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

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
String paramName = "EXPANDEDSubSectionpzDocumentationBBBBBBB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(7)','clipboardPath':'ApplicationCustomFields'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("prefix","-default");
metadataPage.put("sectionIndex","7");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Inline-block");
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
pzLayoutHeader_4();
pzLayoutBody_4();
containerComponent.endComponent();
}
public void pzLayout_7() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_7();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_7(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_7();
}
pzLayoutBodyWrapper_11();
 LayoutWrapperTableEnd_1(); }
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_4();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutHeader_3() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionpzDocumentationBBBBBB"));
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Actors", "pyCaption");
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("title","Actors");
metadataPage.put("uniqueid", "202602211403220226");
metadataPage.put("automationId", "");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_3() {
includeSectionBody_3();
}
public void pzLayoutBodyWrapper_10() {
 String clsScroll= "";tools.appendString("<div section_index='6' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_3();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_3() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_34","pzActorList", secInfo);
}


public void includeSectionBody_3() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_3();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzActorList";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_6() {
pzSection.getLayout().setExpandParam("SubSectionpzDocumentationBBBBBB","",true);
}
public void LayoutWrapperTableStart_6() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(6)','clipboardPath':'pzActorList'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpzDocumentationBBBBBB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\">");
}

 public void pzHeaderBody_6(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Actors");
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel1762' data-layout-id='202602211403220219" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel1762'>" + l_sectionTitle + "</h2><nobr>");
inclAction_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzDocumentationBBBBBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

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
String paramName = "EXPANDEDSubSectionpzDocumentationBBBBBB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(6)','clipboardPath':'pzActorList'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("prefix","-default");
metadataPage.put("sectionIndex","6");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Inline-block");
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
pzLayoutHeader_3();
pzLayoutBody_3();
containerComponent.endComponent();
}
public void pzLayout_6() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_6();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_6(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_6();
}
pzLayoutBodyWrapper_10();
 LayoutWrapperTableEnd_1(); }
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_9() {
 String clsScroll= "";tools.appendString("<div section_index='5' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_6();gridCentreLayout_3();layoutBody_3();
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


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_33")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDocumentation_"+ referenceString+ "_120'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Add item\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201505210603380578268869") + "  href='"+hrefValue+"' ");
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



public void layoutBody_3() { 
	tools.appendString("\n\t\t\t\t\t\t<div id='RULE_KEY' node_type = 'SECTION_BODY' body_type='DEFINE' body_index='3' class = 'gridActionBottom'>" + "<table role='presentation'  cellpadding='0' cellspacing='0' ID=''>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("pxAddListItem",".pyTemplateInputBox",".pySections(5).pySectionBody(3).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "height:28px;width:182px;",false,"","");tools.putSaveValue("parentLayouttype","ACTION");pxAddListItem_2();
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>\n\n\t\t\t\t\t\t</div>");
 } 


public void pxDeleteListItem_9() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_32")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDocumentation_"+ referenceString+ "_116'";
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
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201505210603380578264178") + "  href='"+hrefValue+"' ");
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

public void repeatingDataCell_14() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(5).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_9();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_9();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyIterations","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","115"};oCellRuntimeParamsMap.put("115||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT",paramValues);oControlPathsMap.put("115||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT",".pySections(5).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
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
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("201505210822430259370565") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(5).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyIterations5colWidthCache2").equals("")){ tools.appendParamCSF("PpyIterations5colWidthCache2"); } else { tools.appendString("18"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:30px;'"); } 
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
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("201505210822430259369903") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(5).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyIterations5colWidthCache1").equals("")){ tools.appendParamCSF("PpyIterations5colWidthCache1"); } else { tools.appendString("509"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:30px;'"); } 
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
public void pzSetExpandParam_5() {
pzSection.getLayout().setExpandParam("SubSectionpzDocumentationBBBBB","",true);
}
public void LayoutWrapperTableStart_5() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(5)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzDocumentationBBBBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\">");
}

 public void pzHeaderBody_5(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
String labelName = "Iterations";
labelName =  tools.getLocalizedTextForString(".pyCaption","Iterations");
l_sectionTitle = labelName;
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel8515' data-layout-id='202602211403220206" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel8515'>" + l_sectionTitle + "</h2><nobr>");
inclAction_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzDocumentationBBBBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}
public void 
gridBeginLayout_6() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "None"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPage_pyIterationsL21=null;

 Map selUniqMap_pyIterationsL21 = null;
tools.appendString("<div ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyIterations");tools.appendString("_pzDocumentation_5'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault numberedgrid   ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201703010437240345237") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readWrite' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='true' OAFunc='openRuleByKeys' ");
pyBusinessFunctionList_1();
tools.appendString("><div  id='PEGA_GRID_SKIN' class='default'>");
}


public void gridCentreLayout_3() {/*gridCentreLayout*/
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

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyIterations");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pyName .pyTemplateInputBox  ' class='yui-skin-sam gPXAuto grid-responsive-default ");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString(" floated ");

					}tools.appendString("' style='");

					if(!pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("display:"); if(pzAuto.getBrowserUtils().isIE()) {  tools.appendString(" inline; "); } else {  tools.appendString("inline-block;"); } }tools.appendString("' gPropIndex='PpyIterations5' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201703010437240345237-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "pyIterations";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' ><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyIterations5colWidthGBL\" id=\"PpyIterations5colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyIterations5colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyIterations5colWidthGBR\" id=\"PpyIterations5colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyIterations5colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyIterations5colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("' style='width:");

					 if(!tools.getParamValue("PpyIterations5colWidthGBL").equals("")) { tools.appendParamCSF("PpyIterations5colWidthGBL"); } else { 

					tools.appendString("554.0"); } 

					tools.appendString("px;' cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='pyIterations' PL_PROP='");

					
tools.appendString(".pyIterations");

					tools.appendString("' PL_PROP_CLASS='Embed-Application-MetaData' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' ><td class='cellCont rowHandleHead  ' style='height:32px;'>");

					if(pzAuto.getBrowserUtils().isIE()){

					tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>");

					 } 

					tools.appendString("<span></span></td>");

					 repeatingHeaderCell_5(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_6(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyIterations").iterator(); 

					
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

					tools.appendString(" ng-repeat=\"Item in rootData..pyIterations\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
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

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyIterations")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyIterations5") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyIterations"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201703010437240345237-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' ><td class='cellCont ");

					tools.appendString("rowHandle  ' style='height:34px;'>");

					if(!pzAuto.getBrowserUtils().isIE()){

					tools.appendString("<DIV class='oflowDiv'");

					if(pzAuto.getBrowserUtils().isFF() || pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){

					tools.appendString("style='height:34px;'");

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

					 repeatingDataCell_8(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_14(); 

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

					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"3\" class=\"dataLabelRead gridCell\" >");

					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
								 tools.putParamValue("RenderSingle",""); 

					
									 ClipboardPage tempNoRespg = tools.createPage("Embed-Application-MetaData", "tempNoRespg");

					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					tools.appendString(tools.getLocalizedTextForString("pyCaption","NoIterationsDefined"));

					
									  pega.popStackFrame(frame, false);  

					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
								 tools.putParamValue("showOnLoadMsg", ""); 

					
 tempNoRespg.removeFromClipboard();

					tools.appendString("\n </td></tr>");

					 } } }   

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					 tools.putSaveValue("isGrid", "false"); 

					 tools.putSaveValue("bUseMenuInline", "false");

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyIterations5") && tools.getParamValue("partialRefresh").equals("false")) {

						 tools.putParamValue("partialTrigger",""); 
}

					
					 /* GenerateGrid: End */

					}
public void pzLayout_5() {
String gridLayoutMethodName="pzLayout_5";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
pzSetExpandParam_5();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_5(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_5();
}
pzLayoutBodyWrapper_9();
 LayoutWrapperTableEnd_2(); tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBodyWrapper_8() {
 String clsScroll= "";tools.appendString("<div section_index='4' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_5();gridCentreLayout_2();layoutBody_2();
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


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_30")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDocumentation_"+ referenceString+ "_99'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Add item\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201505210603380578268869") + "  href='"+hrefValue+"' ");
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
	tools.appendString("\n\t\t\t\t\t\t<div id='RULE_KEY' node_type = 'SECTION_BODY' body_type='DEFINE' body_index='3' class = 'gridActionBottom'>" + "<table role='presentation'  cellpadding='0' cellspacing='0' ID=''>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("pxAddListItem",".pyTemplateInputBox",".pySections(4).pySectionBody(3).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "height:28px;width:182px;",false,"","");tools.putSaveValue("parentLayouttype","ACTION");pxAddListItem_1();
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>\n\n\t\t\t\t\t\t</div>");
 } 


public void pxDeleteListItem_8() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_29")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDocumentation_"+ referenceString+ "_95'";
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
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201505210603380578264178") + "  href='"+hrefValue+"' ");
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

public void repeatingDataCell_13() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_8();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_8();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyReleases","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","94"};oCellRuntimeParamsMap.put("94||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT",paramValues);oControlPathsMap.put("94||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT",".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
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
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("201505210835100363536975") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(4).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyReleases4colWidthCache2").equals("")){ tools.appendParamCSF("PpyReleases4colWidthCache2"); } else { tools.appendString("18"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:30px;'"); } 
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
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("201505210835100362535563") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(4).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyReleases4colWidthCache1").equals("")){ tools.appendParamCSF("PpyReleases4colWidthCache1"); } else { tools.appendString("509"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:30px;'"); } 
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
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpzDocumentationBBBB","",true);
}
public void LayoutWrapperTableStart_4() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(4)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzDocumentationBBBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\">");
}

 public void pzHeaderBody_4(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
String labelName = "Releases";
labelName =  tools.getLocalizedTextForString(".pyCaption","Releases");
l_sectionTitle = labelName;
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel4817' data-layout-id='202602211403220189" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel4817'>" + l_sectionTitle + "</h2><nobr>");
inclAction_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzDocumentationBBBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}
public void 
gridBeginLayout_5() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "None"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPage_pyReleasesL17=null;

 Map selUniqMap_pyReleasesL17 = null;
tools.appendString("<div ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyReleases");tools.appendString("_pzDocumentation_4'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault numberedgrid   ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("20170301043724034286") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readWrite' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='true' OAFunc='openRuleByKeys' ");
pyBusinessFunctionList_1();
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

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyReleases");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pyName .pyTemplateInputBox  ' class='yui-skin-sam gPXAuto grid-responsive-default ");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString(" floated ");

					}tools.appendString("' style='");

					if(!pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("display:"); if(pzAuto.getBrowserUtils().isIE()) {  tools.appendString(" inline; "); } else {  tools.appendString("inline-block;"); } }tools.appendString("' gPropIndex='PpyReleases4' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("20170301043724034286-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "pyReleases";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' ><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyReleases4colWidthGBL\" id=\"PpyReleases4colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyReleases4colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyReleases4colWidthGBR\" id=\"PpyReleases4colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyReleases4colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyReleases4colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("' style='width:");

					 if(!tools.getParamValue("PpyReleases4colWidthGBL").equals("")) { tools.appendParamCSF("PpyReleases4colWidthGBL"); } else { 

					tools.appendString("554.0"); } 

					tools.appendString("px;' cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='pyReleases' PL_PROP='");

					
tools.appendString(".pyReleases");

					tools.appendString("' PL_PROP_CLASS='Embed-Application-MetaData' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' ><td class='cellCont rowHandleHead  ' style='height:32px;'>");

					if(pzAuto.getBrowserUtils().isIE()){

					tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>");

					 } 

					tools.appendString("<span></span></td>");

					 repeatingHeaderCell_3(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_4(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyReleases").iterator(); 

					
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

					tools.appendString(" ng-repeat=\"Item in rootData..pyReleases\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
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

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyReleases")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyReleases4") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyReleases"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("20170301043724034286-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' ><td class='cellCont ");

					tools.appendString("rowHandle  ' style='height:34px;'>");

					if(!pzAuto.getBrowserUtils().isIE()){

					tools.appendString("<DIV class='oflowDiv'");

					if(pzAuto.getBrowserUtils().isFF() || pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){

					tools.appendString("style='height:34px;'");

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

					 repeatingDataCell_5(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_13(); 

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

					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"3\" class=\"dataLabelRead gridCell\" >");

					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
								 tools.putParamValue("RenderSingle",""); 

					
									 ClipboardPage tempNoRespg = tools.createPage("Embed-Application-MetaData", "tempNoRespg");

					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					tools.appendString(tools.getLocalizedTextForString("pyCaption","NoReleasesDefined"));

					
									  pega.popStackFrame(frame, false);  

					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
								 tools.putParamValue("showOnLoadMsg", ""); 

					
 tempNoRespg.removeFromClipboard();

					tools.appendString("\n </td></tr>");

					 } } }   

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					 tools.putSaveValue("isGrid", "false"); 

					 tools.putSaveValue("bUseMenuInline", "false");

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyReleases4") && tools.getParamValue("partialRefresh").equals("false")) {

						 tools.putParamValue("partialTrigger",""); 
}

					
					 /* GenerateGrid: End */

					}

					public void LayoutWrapperTableEnd_2() {

					tools.appendString("</div>");

					}
public void pzLayout_4() {
String gridLayoutMethodName="pzLayout_4";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
pzSetExpandParam_4();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_4(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_4();
}
pzLayoutBodyWrapper_8();
 LayoutWrapperTableEnd_2(); tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBodyWrapper_7() {
 String clsScroll= "";tools.appendString("<div section_index='3' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_4();gridCentreLayout_1();layoutBody_1();
				gridEndLayout_1();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
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


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_27")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDocumentation_"+ referenceString+ "_78'";
	 String securedPropValue = null;
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201510050847120654170379") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"INSERTAFTER\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-plus-circle";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Add business objective",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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



public void layoutBody_1() { 
	tools.appendString("\n\t\t\t\t\t\t<div id='RULE_KEY' node_type = 'SECTION_BODY' body_type='DEFINE' body_index='3' class = 'gridActionBottom'>" + "<table role='presentation'  cellpadding='0' cellspacing='0' ID=''>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("pxLink",".pyTemplateInputBox",".pySections(3).pySectionBody(3).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "height:29px;width:182px;",false,"","");tools.appendString("<nobr>");
tools.putSaveValue("parentLayouttype","ACTION");	pxLink_1();
	tools.appendString("</nobr>");
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>\n\n\t\t\t\t\t\t</div>");
 } 


public void pxDeleteListItem_7() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_26")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDocumentation_"+ referenceString+ "_74'";
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
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201505210603380578264178") + "  href='"+hrefValue+"' ");
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
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(3).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:28px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_7();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_7();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxTextArea_3(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
inclCalVal_1("pxTextArea","NF","leftJustifyStyle");inclAction_1();
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
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_24")){String errorClass = "";
		if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
errorClass += " ErrorShade";
		}
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();
		String placeHolderR = "";
		placeHolderR = tools.getLocalizedTextForString(".pyActionPrompt","Enter a new business objective",StreamBuilder.FMT_LITERAL);
		textAreaIncludes_1();String disabled_ctrl = "";

		tools.appendString("<span class=\"TextAreaContainer\">");
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		tools.appendString("<span  class=\"textAreaExpandStyle set-width-auto "+errorClass+"\" id=\"CTRL_TA\"  style = \" width:100%\">");
		String activeValue = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		 if(isSecuredProp){
				 activeValue = activePropValue;
		}
		tools.appendString("<textarea  " + pzCell.getTestIdIfEnabled("201505210603380578263246") + "  id=\"");
		tools.appendString(tools.getHTMLIDForProperty(true,"textarea"));
		tools.appendString("\" ");
		if(placeHolderR.length() > 0) {
		tools.appendString(" "+(!pzAuto.getBrowserUtils().isIE()?"placeholder":"ph")+"=\""+StringUtils.crossScriptingFilter(placeHolderR)+"\"");
		tools.appendString((!pzAuto.getBrowserUtils().isIE() || activeValue.length() >0) ? "" : " isplaceholder=\"true\"");
		}
		tools.appendString(" class=\"TANORM");
		if(placeHolderR.length() > 0) {
		tools.appendString(((!pzAuto.getBrowserUtils().isIE() || activeValue.length() >0) ? "" : " placeholder"));
		}
		String textAreaName = "";
		tools.appendString(" textAreaStyle\" name=\"");if(bOptimizedMarkup){
		tools.appendCSF(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getActive().getEntryHandle(),"entryhandle"));
		textAreaName = StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getActive().getEntryHandle(),"entryhandle"));}else{
		tools.appendString(tools.getActive().getEntryHandle());
		textAreaName = tools.getActive().getEntryHandle();}
		pzAuto.getPropertyActionRequest().registerClientParameter(tools.getActive().getEntryHandle());
		tools.appendString("\"");
		tools.appendString("aria-describedby='"+textAreaName+"Error");
		tools.appendString("'");
		tools.appendString("style=\"width: 100%;overflow: hidden;\" ");
		tools.appendString("data-exp='Enter to Collapse'");
		tools.appendString("data-col='Enter to Expand'");
		tools.appendString(" rows=\"1\" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());tools.appendString(disabled_ctrl);
if(bOptimizedMarkup){
		tools.appendString(" data-bindprops='title,value,data-cdb-innerHTML' ");}
		tools.appendString(" data-ctl='[\"TextArea\",{\"height\":\"content|1|rows\"}] ' ");if(bOptimizedMarkup){
		if(!pzAuto.getBrowserUtils().isIE() || activeValue.length() >0){
		tools.appendString(" data-cdb-innerHTML=\"");
		tools.appendCSF(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyName").getReference()));
		tools.appendString("\" >");
		} else{
		tools.appendString(">");
		tools.appendCSF(placeHolderR);
		}} else{
		tools.appendString(">");
		tools.appendCSF((!pzAuto.getBrowserUtils().isIE() || activeValue.length() >0) ? activeValue : placeHolderR);}
		tools.appendString("</textarea></span>");
		tools.appendString("</span>");
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxTextArea");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("201505210603380578263246") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_25")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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


	pzAuto.getSection().getControl().includeShowMe(isEditable);
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
 String columnHeaderValue = "Description"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextArea",".pyName", ".pySections(3).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:30px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextArea_3(".pyName",0,"","","Text");
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextArea_3(".pyName",0,"","","Text");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
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
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("201505210603380577261766") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(3).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyBusinessFunctionList3colWidthCache2").equals("")){ tools.appendParamCSF("PpyBusinessFunctionList3colWidthCache2"); } else { tools.appendString("4"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:30px;'"); } 
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
tools.appendString(" role='columnheader' aria-label='Description' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("2015052106033805772603") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Description"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(3).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:32px;");tools.appendString("width:"); if(!tools.getParamValueCSF("PpyBusinessFunctionList3colWidthCache1").equals("")){ tools.appendParamCSF("PpyBusinessFunctionList3colWidthCache1"); } else { tools.appendString("688"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:30px;'"); } 
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


public void pzGridIncludes_1() {
pzAuto.emitIncludeStreamReference("pzGrid_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpzDocumentationBBB","",true);
}
public void LayoutWrapperTableStart_3() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(3)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzDocumentationBBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\">");
}

 public void pzHeaderBody_3(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
String labelName = "Business objectives";
labelName =  tools.getLocalizedTextForString(".pyCaption","Business objectives");
l_sectionTitle = labelName;
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel3688' data-layout-id='202602211403220173" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel3688'>" + l_sectionTitle + "</h2><nobr>");
inclAction_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzDocumentationBBB","tdRightStyle");}
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

 ClipboardPage gFCritPage_pyBusinessFunctionListL13=null;

 Map selUniqMap_pyBusinessFunctionListL13 = null;
tools.appendString("<div ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyBusinessFunctionList");tools.appendString("_pzDocumentation_3'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201703010437240339144") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readWrite' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='true' OAFunc='openRuleByKeys' ");
pyBusinessFunctionList_1();
tools.appendString("><div  id='PEGA_GRID_SKIN' class='transparent'>");
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

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyBusinessFunctionList");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pyName .pyTemplateInputBox  ' class='yui-skin-sam gPXAuto grid-responsive-default ");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString(" floated ");

					}tools.appendString("' style='");

					if(!pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("display:"); if(pzAuto.getBrowserUtils().isIE()) {  tools.appendString(" inline; "); } else {  tools.appendString("inline-block;"); } }tools.appendString("' gPropIndex='PpyBusinessFunctionList3' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201703010437240339144-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "pyBusinessFunctionList";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' ><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyBusinessFunctionList3colWidthGBL\" id=\"PpyBusinessFunctionList3colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyBusinessFunctionList3colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyBusinessFunctionList3colWidthGBR\" id=\"PpyBusinessFunctionList3colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyBusinessFunctionList3colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyBusinessFunctionList3colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("' style='width:");

					 if(!tools.getParamValue("PpyBusinessFunctionList3colWidthGBL").equals("")) { tools.appendParamCSF("PpyBusinessFunctionList3colWidthGBL"); } else { 

					tools.appendString("692.0"); } 

					tools.appendString("px;' cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='pyBusinessFunctionList' PL_PROP='");

					
tools.appendString(".pyBusinessFunctionList");

					tools.appendString("' PL_PROP_CLASS='Embed-Application-MetaData' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' >");

					 repeatingHeaderCell_1(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_2(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyBusinessFunctionList").iterator(); 

					
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

					tools.appendString(" ng-repeat=\"Item in rootData..pyBusinessFunctionList\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
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

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyBusinessFunctionList")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyBusinessFunctionList3") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyBusinessFunctionList"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201703010437240339144-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_11(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_12(); 

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

					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"2\" class=\"dataLabelRead gridCell\" >");

					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
								 tools.putParamValue("RenderSingle",""); 

					
									 ClipboardPage tempNoRespg = tools.createPage("Embed-Application-MetaData", "tempNoRespg");

					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					tools.appendString(tools.getLocalizedTextForString("pyCaption","pzNoBusinessObjectivesDefined"));

					
									  pega.popStackFrame(frame, false);  

					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
								 tools.putParamValue("showOnLoadMsg", ""); 

					
 tempNoRespg.removeFromClipboard();

					tools.appendString("\n </td></tr>");

					 } } }   

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					 tools.putSaveValue("isGrid", "false"); 

					 tools.putSaveValue("bUseMenuInline", "false");

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyBusinessFunctionList3") && tools.getParamValue("partialRefresh").equals("false")) {

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
public void pzLayout_3() {
String gridLayoutMethodName="pzLayout_3";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_3(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_3();
}
pzLayoutBodyWrapper_7();
 LayoutWrapperTableEnd_1(); tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutHeader_2() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionpzDocumentationBB"));
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Supporting specification types", "pyCaption");
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("title","Supporting specification types");
metadataPage.put("uniqueid", "202602211403220172");
metadataPage.put("automationId", "");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_2() {
includeSectionBody_2();
}
public void pzLayoutBodyWrapper_6() {
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_2();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_2() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_20","pzSpecifications", secInfo);
}


public void includeSectionBody_2() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzSpecifications";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzDocumentationBB","",true);
}
public void LayoutWrapperTableStart_2() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2)','clipboardPath':'pzSpecifications'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpzDocumentationBB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\">");
}

 public void pzHeaderBody_2(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Supporting specification types");
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel9092' data-layout-id='202602211403220166" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel9092'>" + l_sectionTitle + "</h2><nobr>");
inclAction_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzDocumentationBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

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
String paramName = "EXPANDEDSubSectionpzDocumentationBB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2)','clipboardPath':'pzSpecifications'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("prefix","-default");
metadataPage.put("sectionIndex","2");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Inline-block");
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
pzLayoutHeader_2();
pzLayoutBody_2();
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
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_2(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_2();
}
pzLayoutBodyWrapper_6();
 LayoutWrapperTableEnd_1(); }
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutHeader_1() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionpzDocumentationB"));
metadataPage.put("titleType","Field Value");
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
String sectionTitle = "ApplicationGuide";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("ApplicationGuide", "pyCaption");
metadataPage.put("title", sectionTitle);
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("uniqueid", "202602211403220165");
metadataPage.put("automationId", "");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_1() {
includeSectionBody_1();
}
public void pzLayoutBodyWrapper_5() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_1();
}
tools.appendString("</div>");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_19","pzGuides", secInfo);
}
public void buildWhiteList_1() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("StreamName", "pzDocumentation");
pega.getUIEngine().getUIAction("sort", config).register();
pega.getUIEngine().getUIAction("reorder", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyActivity", "pzGetACData");
config.put("pyListSource", "datapage");
config.put("pySourceName", "D_pzGuidesList");
pega.getUIEngine().getUIAction("autocompleteListBased", config).register();
config = new HashMap<String, String>();
config.put("StreamName", "pzDocumentation");
config.put("pyActivity", "pzRunActionWrapper");
config.put("pySubAction", "runAct");
config.put("inStandardsMode", "true");
config.put("pzActivity", "ReloadCell");
pega.getUIEngine().getUIAction("autocompleteSetAdditionalProperty", config).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzSetKeyForRule");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
pega.getUIEngine().getUIAction("openRule", null).register();
pega.getUIEngine().getUIAction("addRow", null).register();
config = new HashMap<String, String>();
config.put("StreamType", "Rule-Obj-FlowAction");
config.put("isModalFlowAction", "true");
config.put("ActionSection", "pzModalTemplate");
config.put("StreamClass", "Rule-HTML-Section");
config.put("ModalSection", "pzModalTemplate");
config.put("bIsModal", "true");
config.put("bIsOverlay", "false");
config.put("rowClass", "@baseclass");
config.put("pyActivity", "@baseclass.pzDoListPreAddItem");
config.put("layoutType", "Grid");
config.put("DSName", ".pxResults");
config.put("IntermediatePageName", "IntermediateAddPage");
config.put("PageListProperty", ".pxResults");
pega.getUIEngine().getUIAction("addRow", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("addRow", null).register();
config = new HashMap<String, String>();
config.put("StreamType", "Rule-Obj-FlowAction");
config.put("isModalFlowAction", "true");
config.put("ActionSection", "pzModalTemplate");
config.put("StreamClass", "Rule-HTML-Section");
config.put("ModalSection", "pzModalTemplate");
config.put("bIsModal", "true");
config.put("bIsOverlay", "false");
config.put("rowClass", "");
config.put("pyActivity", "@baseclass.pzDoListPreAddItem");
config.put("layoutType", "Grid");
config.put("DSName", ".pxResults");
config.put("IntermediatePageName", "IntermediateAddPage");
config.put("PageListProperty", ".pxResults");
pega.getUIEngine().getUIAction("addRow", config).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("addRow", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("addRow", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}


public void includeSectionBody_1() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzGuides";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzDocumentationB","",true);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pzGuides'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpzDocumentationB";
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
l_sectionTitle=StringUtils.escapeIntoJavaString(tools.getLocalizedTextForParameterizedString("pyCaption","ApplicationGuide"));
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel2665' data-layout-id='202602211403220147" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel2665'>" + l_sectionTitle + "</h2><nobr>");
inclAction_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzDocumentationB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}
public void LayoutWrapperTableEnd_1() {
tools.appendString("</div>");
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
String paramName = "EXPANDEDSubSectionpzDocumentationB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pzGuides'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("prefix","-default");
metadataPage.put("sectionIndex","1");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Flexbox");
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
pzLayoutHeader_1();
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
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_1();
}
pzLayoutBodyWrapper_5();
 LayoutWrapperTableEnd_1(); }
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_4() {

tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_3() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_3();gridDoPartialRefresh_3();gridLastRow_3();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxDeleteListItem_6() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_17")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDocumentation_"+ referenceString+ "_116'";
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
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201505210603380578264178") + "  href='"+hrefValue+"' ");
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

public void repeatingDataCell_10() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(5).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_6();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_6();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyIterations","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","115"};oCellRuntimeParamsMap.put("115||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT",paramValues);oControlPathsMap.put("115||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT",".pySections(5).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}


public void pxDeleteListItem_5() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_16")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDocumentation_"+ referenceString+ "_116'";
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
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201505210603380578264178") + "  href='"+hrefValue+"' ");
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
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(5).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_5();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_5();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxTextInput_2() {String key="115||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyIterations","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","115"};oCellRuntimeParamsMap.put("115||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT",paramValues);oControlPathsMap.put("115||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT",".pySections(5).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
public void repeatingDataCell_8() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyName", ".pySections(5).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextInput_2();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextInput_2();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void pzLayoutBodyWrapper_2() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();gridDoPartialRefresh_2();gridLastRow_2();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxDeleteListItem_4() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_14")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDocumentation_"+ referenceString+ "_95'";
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
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201505210603380578264178") + "  href='"+hrefValue+"' ");
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

public void repeatingDataCell_7() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_4();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_4();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyReleases","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","94"};oCellRuntimeParamsMap.put("94||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT",paramValues);oControlPathsMap.put("94||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT",".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}


public void pxDeleteListItem_3() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_13")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDocumentation_"+ referenceString+ "_95'";
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
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201505210603380578264178") + "  href='"+hrefValue+"' ");
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

public void repeatingDataCell_6() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
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


public void pxTextInput_1() {String key="94||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyReleases","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","94"};oCellRuntimeParamsMap.put("94||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT",paramValues);oControlPathsMap.put("94||RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT",".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
public void repeatingDataCell_5() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyName", ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
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


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_11")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDocumentation_"+ referenceString+ "_74'";
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
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201505210603380578264178") + "  href='"+hrefValue+"' ");
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

public void repeatingDataCell_4() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(3).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:28px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
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


public void pxTextArea_2(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_7")){
inclCalVal_1("pxTextArea","NF","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_8")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_9")){String errorClass = "";
		if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
errorClass += " ErrorShade";
		}
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();
		String placeHolderR = "";
		placeHolderR = tools.getLocalizedTextForString(".pyActionPrompt","Enter a new business objective",StreamBuilder.FMT_LITERAL);
		textAreaIncludes_1();String disabled_ctrl = "";

		tools.appendString("<span class=\"TextAreaContainer\">");
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		tools.appendString("<span  class=\"textAreaExpandStyle set-width-auto "+errorClass+"\" id=\"CTRL_TA\"  style = \" width:100%\">");
		String activeValue = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		 if(isSecuredProp){
				 activeValue = activePropValue;
		}
		tools.appendString("<textarea  " + pzCell.getTestIdIfEnabled("201505210603380578263246") + "  id=\"");
		tools.appendString(tools.getHTMLIDForProperty(true,"textarea"));
		tools.appendString("\" ");
		if(placeHolderR.length() > 0) {
		tools.appendString(" "+(!pzAuto.getBrowserUtils().isIE()?"placeholder":"ph")+"=\""+StringUtils.crossScriptingFilter(placeHolderR)+"\"");
		tools.appendString((!pzAuto.getBrowserUtils().isIE() || activeValue.length() >0) ? "" : " isplaceholder=\"true\"");
		}
		tools.appendString(" class=\"TANORM");
		if(placeHolderR.length() > 0) {
		tools.appendString(((!pzAuto.getBrowserUtils().isIE() || activeValue.length() >0) ? "" : " placeholder"));
		}
		String textAreaName = "";
		tools.appendString(" textAreaStyle\" name=\"");if(bOptimizedMarkup){
		tools.appendCSF(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getActive().getEntryHandle(),"entryhandle"));
		textAreaName = StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getActive().getEntryHandle(),"entryhandle"));}else{
		tools.appendString(tools.getActive().getEntryHandle());
		textAreaName = tools.getActive().getEntryHandle();}
		pzAuto.getPropertyActionRequest().registerClientParameter(tools.getActive().getEntryHandle());
		tools.appendString("\"");
		tools.appendString("aria-describedby='"+textAreaName+"Error");
		tools.appendString("'");
		tools.appendString("style=\"width: 100%;overflow: hidden;\" ");
		tools.appendString("data-exp='Enter to Collapse'");
		tools.appendString("data-col='Enter to Expand'");
		tools.appendString(" rows=\"1\" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());tools.appendString(disabled_ctrl);
if(bOptimizedMarkup){
		tools.appendString(" data-bindprops='title,value,data-cdb-innerHTML' ");}
		tools.appendString(" data-ctl='[\"TextArea\",{\"height\":\"content|1|rows\"}] ' ");if(bOptimizedMarkup){
		if(!pzAuto.getBrowserUtils().isIE() || activeValue.length() >0){
		tools.appendString(" data-cdb-innerHTML=\"");
		tools.appendCSF(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyName").getReference()));
		tools.appendString("\" >");
		} else{
		tools.appendString(">");
		tools.appendCSF(placeHolderR);
		}} else{
		tools.appendString(">");
		tools.appendCSF((!pzAuto.getBrowserUtils().isIE() || activeValue.length() >0) ? activeValue : placeHolderR);}
		tools.appendString("</textarea></span>");
		tools.appendString("</span>");
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxTextArea");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("201505210603380578263246") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_10")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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


	pzAuto.getSection().getControl().includeShowMe(isEditable);
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
 String columnHeaderValue = "Description"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextArea",".pyName", ".pySections(3).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:30px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextArea_2(".pyName",0,"","","Text");
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextArea_2(".pyName",0,"","","Text");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDeleteListItem_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDocumentation_"+ referenceString+ "_74'";
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
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201505210603380578264178") + "  href='"+hrefValue+"' ");
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

public void repeatingDataCell_2() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(3).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:28px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
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
public void inclFormattedVal_2(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		tools.appendString(pega_uiengine_formatter.pxFormatText((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),false,"","",true,"associated"));
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}


public void textAreaIncludes_1() {
if (pzAuto.doOnlyOnce("Textarea")) {
pzAuto.emitIncludeStreamReference("pzTextareaIncludes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
}
public void inclFormattedVal_1(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		tools.appendString(pega_uiengine_formatter.pxFormatText((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),false,"","",true,"associated"));
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


public void pxTextArea_1(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
inclCalVal_1("pxTextArea","NF","leftJustifyStyle");inclAction_1();
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
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){String errorClass = "";
		if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
errorClass += " ErrorShade";
		}
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();
		String placeHolderR = "";
		placeHolderR = tools.getLocalizedTextForString(".pyActionPrompt","Enter a new business objective",StreamBuilder.FMT_LITERAL);
		textAreaIncludes_1();String disabled_ctrl = "";

		tools.appendString("<span class=\"TextAreaContainer\">");
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		tools.appendString("<span  class=\"textAreaExpandStyle set-width-auto "+errorClass+"\" id=\"CTRL_TA\"  style = \" width:100%\">");
		String activeValue = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		 if(isSecuredProp){
				 activeValue = activePropValue;
		}
		tools.appendString("<textarea  " + pzCell.getTestIdIfEnabled("201505210603380578263246") + "  id=\"");
		tools.appendString(tools.getHTMLIDForProperty(true,"textarea"));
		tools.appendString("\" ");
		if(placeHolderR.length() > 0) {
		tools.appendString(" "+(!pzAuto.getBrowserUtils().isIE()?"placeholder":"ph")+"=\""+StringUtils.crossScriptingFilter(placeHolderR)+"\"");
		tools.appendString((!pzAuto.getBrowserUtils().isIE() || activeValue.length() >0) ? "" : " isplaceholder=\"true\"");
		}
		tools.appendString(" class=\"TANORM");
		if(placeHolderR.length() > 0) {
		tools.appendString(((!pzAuto.getBrowserUtils().isIE() || activeValue.length() >0) ? "" : " placeholder"));
		}
		String textAreaName = "";
		tools.appendString(" textAreaStyle\" name=\"");if(bOptimizedMarkup){
		tools.appendCSF(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getActive().getEntryHandle(),"entryhandle"));
		textAreaName = StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getActive().getEntryHandle(),"entryhandle"));}else{
		tools.appendString(tools.getActive().getEntryHandle());
		textAreaName = tools.getActive().getEntryHandle();}
		pzAuto.getPropertyActionRequest().registerClientParameter(tools.getActive().getEntryHandle());
		tools.appendString("\"");
		tools.appendString("aria-describedby='"+textAreaName+"Error");
		tools.appendString("'");
		tools.appendString("style=\"width: 100%;overflow: hidden;\" ");
		tools.appendString("data-exp='Enter to Collapse'");
		tools.appendString("data-col='Enter to Expand'");
		tools.appendString(" rows=\"1\" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());tools.appendString(disabled_ctrl);
if(bOptimizedMarkup){
		tools.appendString(" data-bindprops='title,value,data-cdb-innerHTML' ");}
		tools.appendString(" data-ctl='[\"TextArea\",{\"height\":\"content|1|rows\"}] ' ");if(bOptimizedMarkup){
		if(!pzAuto.getBrowserUtils().isIE() || activeValue.length() >0){
		tools.appendString(" data-cdb-innerHTML=\"");
		tools.appendCSF(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyName").getReference()));
		tools.appendString("\" >");
		} else{
		tools.appendString(">");
		tools.appendCSF(placeHolderR);
		}} else{
		tools.appendString(">");
		tools.appendCSF((!pzAuto.getBrowserUtils().isIE() || activeValue.length() >0) ? activeValue : placeHolderR);}
		tools.appendString("</textarea></span>");
		tools.appendString("</span>");
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxTextArea");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("201505210603380578263246") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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


	pzAuto.getSection().getControl().includeShowMe(isEditable);
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
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Description"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextArea",".pyName", ".pySections(3).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:30px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextArea_1(".pyName",0,"","","Text");
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextArea_1(".pyName",0,"","","Text");}
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


public void pyBusinessFunctionList_1() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"INSERTAFTER\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":-1}]");

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

					if(tools.getParamValue("partialTrigger").equals("appendTo.pyBusinessFunctionList3")|| tools.getParamValue("partialTrigger").equals("editRow.pyBusinessFunctionList3") ){

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

					ClipboardProperty pageListProp = tools.getProperty(".pyBusinessFunctionList");

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

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyBusinessFunctionList\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 }}catch(Exception e){}

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyBusinessFunctionList")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyBusinessFunctionList3") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyBusinessFunctionList"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201703010437240339144-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					

					 repeatingDataCell_1(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_2(); 

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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyBusinessFunctionList3")) {

					
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

					
		 pageListProp = tools.getProperty(".pyBusinessFunctionList");

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyBusinessFunctionList3") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty(".pyBusinessFunctionList");

					
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

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyBusinessFunctionList\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyBusinessFunctionList")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyBusinessFunctionList3") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyBusinessFunctionList"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201703010437240339144-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					

					
					 repeatingDataCell_3(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_4(); 

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyReleases4")|| tools.getParamValue("partialTrigger").equals("editRow.pyReleases4") ){

					
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

					
					ClipboardProperty pageListProp = tools.getProperty(".pyReleases");

					
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

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyReleases\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
 }}catch(Exception e){}

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyReleases")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyReleases4") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyReleases"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("20170301043724034286-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' ><td class='cellCont ");

					
					tools.appendString("rowHandle  ' style='height:34px;'>");

					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					tools.appendString("<DIV class='oflowDiv'");

					
					if(pzAuto.getBrowserUtils().isFF() || pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){

					
					tools.appendString("style='height:34px;'");

					
					}

					
					tools.appendString(">");

					
					}

					
					tools.appendString("<div class=\"divCont\" ><span class=\"wspan\"></span><div class=\"cellIn\"><span style='width:auto;' onclick='return false;' class='pageIndex' >");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("</span></div></div>");

					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					tools.appendString("</DIV>");

					
					}

					
					tools.appendString("</td>");

					
					

					
					 repeatingDataCell_5(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_6(); 

					
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

					
					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyReleases4")) {

					
					
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

					
					
		 pageListProp = tools.getProperty(".pyReleases");

					
					
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

					
					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyReleases4") ){

					
					
					tools.putParamValue("partialRefresh", "false");

					
					
					if(tools instanceof StreamBuilderToolKit) {

					
					
					ClipboardProperty pageListProp = tools.getProperty(".pyReleases");

					
					
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

					
					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyReleases\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					gridOpenActionIncl_1();

					
					
					tools.appendString(" id='");

					
					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					
					{

					
					
					String tempTestID = "";

					
					
					String rowTestID = "R";

					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyReleases")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyReleases4") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					String strEntryHandlePLProp = "";

					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyReleases"); } catch (Exception ex) { }

					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					}

					
					
					}

					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("20170301043724034286-" + rowTestID) + " ");

					
					
					}

					
					
					tools.appendString(" PL_INDEX = '");

					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' ><td class='cellCont ");

					
					
					tools.appendString("rowHandle  ' style='height:34px;'>");

					
					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					
					tools.appendString("<DIV class='oflowDiv'");

					
					
					if(pzAuto.getBrowserUtils().isFF() || pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){

					
					
					tools.appendString("style='height:34px;'");

					
					
					}

					
					
					tools.appendString(">");

					
					
					}

					
					
					tools.appendString("<div class=\"divCont\" ><span class=\"wspan\"></span><div class=\"cellIn\"><span style='width:auto;' onclick='return false;' class='pageIndex' >");

					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("</span></div></div>");

					
					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					
					tools.appendString("</DIV>");

					
					
					}

					
					
					tools.appendString("</td>");

					
					
					

					
					
					 repeatingDataCell_5(); 

					
					
					activeName = tools.getActiveName(); 

					
					
					 repeatingDataCell_7(); 

					
					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
						 tools.putParamValue("expandRL","false");

					
					
					
									  pega.popStackFrame(frame_3, false); 

					
					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					
					
					 } 

					
					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					
					 /* GenerateGrid: End */

					
					
					}

					
					
					public void 
gridBeginLayout_3
					
					
					() {

					
					
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					}

					
					

public void gridDoPartialRefresh_3() { /*gridDoPartialRefresh*/

					
					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					
					java.util.Map functionsMap = null;

					
					java.util.Map classesMap = null;

					
					tools.putSaveValue("bAllowRowUpdate","true");

					
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyIterations5")|| tools.getParamValue("partialTrigger").equals("editRow.pyIterations5") ){

					
					
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

					
					
					ClipboardProperty pageListProp = tools.getProperty(".pyIterations");

					
					
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

					
					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyIterations\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
					
 }}catch(Exception e){}

					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					gridOpenActionIncl_1();

					
					
					tools.appendString(" id='");

					
					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					
					{

					
					
					String tempTestID = "";

					
					
					String rowTestID = "R";

					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyIterations")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyIterations5") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					String strEntryHandlePLProp = "";

					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyIterations"); } catch (Exception ex) { }

					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					}

					
					
					}

					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201703010437240345237-" + rowTestID) + " ");

					
					
					}

					
					
					tools.appendString(" PL_INDEX = '");

					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' ><td class='cellCont ");

					
					
					tools.appendString("rowHandle  ' style='height:34px;'>");

					
					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					
					tools.appendString("<DIV class='oflowDiv'");

					
					
					if(pzAuto.getBrowserUtils().isFF() || pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){

					
					
					tools.appendString("style='height:34px;'");

					
					
					}

					
					
					tools.appendString(">");

					
					
					}

					
					
					tools.appendString("<div class=\"divCont\" ><span class=\"wspan\"></span><div class=\"cellIn\"><span style='width:auto;' onclick='return false;' class='pageIndex' >");

					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("</span></div></div>");

					
					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					
					tools.appendString("</DIV>");

					
					
					}

					
					
					tools.appendString("</td>");

					
					
					

					
					
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

					
					
					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyIterations5")) {

					
					
					
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

					
					
					
		 pageListProp = tools.getProperty(".pyIterations");

					
					
					
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

					
					
					

public void gridLastRow_3() { /*gridLastRow*/

					
					
					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					
					
					java.util.Map functionsMap = null;

					
					
					java.util.Map classesMap = null;

					
					
					tools.putSaveValue("bAllowRowUpdate","true");

					
					
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					
					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					
					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyIterations5") ){

					
					
					
					tools.putParamValue("partialRefresh", "false");

					
					
					
					if(tools instanceof StreamBuilderToolKit) {

					
					
					
					ClipboardProperty pageListProp = tools.getProperty(".pyIterations");

					
					
					
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

					
					
					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyIterations\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					
					gridOpenActionIncl_1();

					
					
					
					tools.appendString(" id='");

					
					
					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					
					
					{

					
					
					
					String tempTestID = "";

					
					
					
					String rowTestID = "R";

					
					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyIterations")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyIterations5") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					
					String strEntryHandlePLProp = "";

					
					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyIterations"); } catch (Exception ex) { }

					
					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					
					}

					
					
					
					}

					
					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201703010437240345237-" + rowTestID) + " ");

					
					
					
					}

					
					
					
					tools.appendString(" PL_INDEX = '");

					
					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' ><td class='cellCont ");

					
					
					
					tools.appendString("rowHandle  ' style='height:34px;'>");

					
					
					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					
					
					tools.appendString("<DIV class='oflowDiv'");

					
					
					
					if(pzAuto.getBrowserUtils().isFF() || pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){

					
					
					
					tools.appendString("style='height:34px;'");

					
					
					
					}

					
					
					
					tools.appendString(">");

					
					
					
					}

					
					
					
					tools.appendString("<div class=\"divCont\" ><span class=\"wspan\"></span><div class=\"cellIn\"><span style='width:auto;' onclick='return false;' class='pageIndex' >");

					
					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("</span></div></div>");

					
					
					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					
					
					tools.appendString("</DIV>");

					
					
					
					}

					
					
					
					tools.appendString("</td>");

					
					
					
					

					
					
					
					 repeatingDataCell_8(); 

					
					
					
					activeName = tools.getActiveName(); 

					
					
					
					 repeatingDataCell_10(); 

					
					
					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
					
						 tools.putParamValue("expandRL","false");

					
					
					
					
									  pega.popStackFrame(frame_3, false); 

					
					
					
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
	oStreamProperties_1.put("pyClassName", "Rule-Application");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-AppDefinition");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzDocumentation");
	oStreamProperties_1.put("pyRuleSetVersion", "08-02-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("pzLayout_4", new String[][] {});
pzExternalMethodMapping.put("pzLayout_5", new String[][] {});
pzExternalMethodMapping.put("pzLayout_3", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-APPLICATION PZDOCUMENTATION #20181004T134039.059 GMT", "Rule-Application pzDocumentation", "Pega-AppDefinition", "08-02-01", "20181004T134039.059 GMT");
}
