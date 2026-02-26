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
 * Builds JSP stream EMBED-MODELPARAMS!PZDEFINITIONTARGET.
 */
public class ra_stream_pzdefinitiontarget_778ac12edbd05ba6353a1690c10e547c extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzDefinitionTarget.Embed_ModelParams.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1146082678;
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
	public ra_stream_pzdefinitiontarget_778ac12edbd05ba6353a1690c10e547c(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "78108f6eaa5156537cac9018ab89ae0b942c4f4e";
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
/* Instance RULE-HTML-SECTION EMBED-MODELPARAMS PZDEFINITIONTARGET #20230618T003136.579 GMT	Pega-Desktop:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "78108f6eaa5156537cac9018ab89ae0b942c4f4e";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzDefinitionTarget",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION EMBED-MODELPARAMS PZDEFINITIONTARGET #20230618T003136.579 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION EMBED-MODELPARAMS PZDEFINITIONTARGET #20230618T003136.579 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Section");
final Map prevPropDefs_3 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_3);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_3);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_3();

}
}
} catch (Throwable thr) {
	pzSection.abortComponent();
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_3);
	mStreamResponse.setJspBaseClass(prevClass_3);
	pz_CurrentRuleKey = prevRuleKey_3;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION EMBED-MODELPARAMS PZDEFINITIONTARGET #20230618T003136.579 GMT */
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
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Section:PZDEFINITIONTARGET", 
	"Rule-Obj-Property:PYSORTACTIONPROPLIST", 
	"Rule-Obj-Property:PYPARAMETERS", 
	"Rule-Obj-Property:PYPROPERTIESNAME", 
	"Rule-Obj-Property:PYACTIONNAME", 
	"Rule-HTML-Property:PXICON", 
	"Rule-HTML-Property:MESSAGESPAGELIST", 
	"Rule-HTML-Property:MESSAGES", 
	"Rule-HTML-Property:PXHIDDEN"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZDEFINITIONTARGET","Rule-HTML-Section","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-23-01","RULE-HTML-SECTION EMBED-MODELPARAMS PZDEFINITIONTARGET #20230618T003136.579 GMT","!PZDEFINITIONTARGET",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1146082678), 
		new DependentRuleInfo("PYSORTACTIONPROPLIST","Rule-Obj-Property","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYSORTACTIONPROPLIST #20180713T135025.206 GMT","!PYSORTACTIONPROPLIST",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYPARAMETERS","Rule-Obj-Property","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPARAMETERS #20180713T135025.155 GMT","!PYPARAMETERS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYPROPERTIESNAME","Rule-Obj-Property","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT","!PYPROPERTIESNAME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME","Rule-Obj-Property","EMBED-MODELPARAMS",true,"Embed-ModelParams","Pega-Desktop","08-01-01","RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT","!PYACTIONNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXICON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT","PXICON",true,false,"ABSOLUTE_CLASSLESS",-794576025), 
		new DependentRuleInfo("MESSAGESPAGELIST","Rule-HTML-Property","",false,"","Pega-Desktop","08-01-01","RULE-HTML-PROPERTY MESSAGESPAGELIST #20180713T135129.113 GMT","MESSAGESPAGELIST",true,false,"ABSOLUTE_CLASSLESS",1462500672), 
		new DependentRuleInfo("MESSAGES","Rule-HTML-Property","",false,"","Pega-UIDesign","08-01-01","RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT","MESSAGES",true,false,"ABSOLUTE_CLASSLESS",-794757422), 
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
//	RULE-HTML-SECTION EMBED-MODELPARAMS PZDEFINITIONTARGET #20230618T003136.579 GMT:20230618T003136.579 GMT
//	RULE-HTML-PROPERTY PXHIDDEN #20180713T133435.722 GMT:20180713T133435.722 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-HTML-PROPERTY PXHIDDEN #20180713T133435.722 GMT:20180713T133435.722 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYSORTACTIONPROPLIST #20180713T135025.206 GMT:20180713T135025.206 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYSORTACTIONPROPLIST #20180713T135025.206 GMT:20180713T135025.206 GMT
//	RULE-HTML-PROPERTY MESSAGESPAGELIST #20180713T135129.113 GMT:20180713T135129.113 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT:20180713T133634.985 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPARAMETERS #20180713T135025.155 GMT:20180713T135025.155 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPARAMETERS #20180713T135025.155 GMT:20180713T135025.155 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYPROPERTIESNAME #20180713T135025.174 GMT:20180713T135025.174 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T133337.901 GMT:20180713T133337.901 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDSECTIONBODYELEMENTS--(STRINGFC27BFECDD5F0250930FF8FA168BE1FF #20180713T133338.055 GMT:20180713T133338.055 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETFIELDDESCRIPTION #20180713T133339.962 GMT:20180713T133339.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONPOSTVALUE--(BOOLEAN,CLIPBOARDPAGE,CLIPBOARDPAGE) #20200623T114924.749 GMT:20200626T092833.607 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEHIDDEN--(CLIPBOARDPAGEE2BC591D2BB656F265183A20B6CFAC93 #20180713T133346.239 GMT:20180713T133346.239 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
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
		return "c55b3232249691f93becc340b55dde45";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-ModelParams";
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
  pzSection.beginSection("pzDefinitionTarget",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzDefinitionTarget','insKey':'RULE-HTML-SECTION EMBED-MODELPARAMS PZDEFINITIONTARGET #20230618T003136.579 GMT','sectionType':'standard'}");
pzLayout_1();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")) ){
pzLayout_2();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_7")) ){
pzLayout_3();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_9")) ){
pzLayout_4();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_11")) ){
pzLayout_5();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_15")) ){
pzLayout_6();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_17")) ){
pzLayout_7();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_21")) ){
pzLayout_8();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_25")) ){
pzLayout_9();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_27")) ){
pzLayout_10();
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
config = new HashMap<String, String>();
config.put("ActionSection", "pyModalTemplate");
config.put("NewTaskStatus", "pzShowSortActionProp");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyOverlayTemplate");
config.put("NewTaskStatus", "pzShowSortActionProp");
pega.getUIEngine().getUIAction("localAction", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "setClass");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyModalTemplate");
config.put("NewTaskStatus", "pzShowModelParamsFlowAction");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyOverlayTemplate");
config.put("NewTaskStatus", "pzShowModelParamsFlowAction");
pega.getUIEngine().getUIAction("localAction", config).register();
}
public void pzLayoutBodyWrapper_10() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_9();
}
tools.putSaveValue("rowClass","");
}
public void 
labelIncludeInCell_1(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20141008080155048543686") + "  ");
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


public void layoutBody_9() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("FREEFORM",".pySections(10)") + "  section_index='10'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(10).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "width:100%;",false,"","");labelIncludeInCell_1("","","","",false,"",false,false,"Standard",false);
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_10() {
pzSection.getLayout().setExpandParam("SubSectionpzDefinitionTargetBBBBBBBBBB","",false);
}
public void pzLayout_10() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxpzDefinitionNoTarget","pzDefinitionNoTarget", "layout", "visible" )) {pzSetExpandParam_10();
pzLayoutBodyWrapper_10();
}
}
}
public void pzLayoutBodyWrapper_9() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_8();
}
tools.putSaveValue("rowClass","");
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__9(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
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
if (_jspx_meth_pega_param__1(pageContext, "OverLabel", "[comment]")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "-1")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "DisableInputBox", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Width", "100%")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "-1")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Property")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
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


public void field_OpenRuleAdvanced_OverLabel_8() { 
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 22625 bytes
 */
if (_jspx_meth_pega_reference__9(pageContext, ".pyPropertiesName", "input", "OpenRuleAdvanced_OverLabel")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public void layoutBody_8() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("FREEFORM",".pySections(9)") + "  section_index='9'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("OpenRuleAdvanced_OverLabel",".pyPropertiesName",".pySections(9).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "width:100%;",false,"","");tools.appendString("<nobr>");
tools.putSaveValue("parentLayouttype","");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_26")) {	field_OpenRuleAdvanced_OverLabel_8();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString("</nobr>");
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_9() {
pzSection.getLayout().setExpandParam("SubSectionpzDefinitionTargetBBBBBBBBB","",false);
}
public void pzLayout_9() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2== rx.pyActionName cqCOMMENT",".pyActionName== \'COMMENT\'", "layout", "visible" )) {pzSetExpandParam_9();
pzLayoutBodyWrapper_9();
}
}
}
public void pzLayoutBodyWrapper_8() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_7();
}
tools.putSaveValue("rowClass","");
}


public void field_Messages_1() { 
try {

/*
 * reference tag
 * Cannot inline because: parameters prevent us from inlining
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__1 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__1.setPageContext(pageContext);
_jspx_th_pega_reference__1.setParent(mParentTag);
_jspx_th_pega_reference__1.setName(".pyParameters");
_jspx_th_pega_reference__1.setMode("input");
_jspx_th_pega_reference__1.setFormat("Messages");
int _jspx_eval_pega_reference__1 = _jspx_th_pega_reference__1.doStartTag();
if (_jspx_eval_pega_reference__1 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_1 = mParentTag;
mParentTag = _jspx_th_pega_reference__1;
tools.putParamValue("bLocalize","false");
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
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__8(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
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
if (_jspx_meth_pega_param__1(pageContext, "DisableInputBox", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "OverLabel", "[Data Transform]")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ApplyTo", "pyClassName")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Model")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Width", "100%")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
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


public void field_OpenRuleAdvanced_OverLabel_7() { 
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 22625 bytes
 */
if (_jspx_meth_pega_reference__8(pageContext, ".pyPropertiesName", "input", "OpenRuleAdvanced_OverLabel")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public void pxIcon_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_24")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDefinitionTarget_"+ referenceString+ "_41'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("ViewDataTransformParametersIcon") + "  href='"+hrefValue+"' ");
		tools.appendString("onclick='pd(event);' ");
		tools.appendString("data-ctl='Icon'"); tools.appendString(" class='");
		tools.appendString("iconExplore' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title = 'View Data Transform Parameters"+ " "+repeatIndx+"' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"runScript\", [\"setClass(pega.control.Actions.prototype.runScript.caller.arguments[0])\"]");

		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}
		if((com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"!pzIsPegaExpress",null,false)
		)){if(isBehaviorAdded && true){ tools.appendString(","); }{
	StringMap keyMap = new HashStringMap();
	keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
	keyMap.putString("pyActionName", "pzShowModelParamsFlowAction");
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
	pzPackageRuntime.packageLocalAction("pzShowModelParamsFlowAction", offlineUsingPage , strLAClassName);
	pzPackageRuntime.packageSection("pyModalTemplate", offlineUsingPage , strLAClassName, true);
	}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		try{
			pzPackageRuntime.packageSection("pzDefinitionTarget",
			tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
			}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
			}
			}
			if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
			String usingPage = "";
			if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
			if("true".equals(bHasPrivilege )) {
				tools.appendString("[\"processAction\", [\"pzShowModelParamsFlowAction\",\"true\",\":event\",\"\",\""+streamType+"\",\"\",\"\",\"%7B%22isCustomMobileAnim%22%3A%22true%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22none%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%2C%22mobile%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-offbottom-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
				} else {
					tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
					}
					}

		tools.appendString("]");isBehaviorAdded = true;
		}if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}
		if((com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pzIsPegaExpress",null,false)
		)){if(isBehaviorAdded && true){ tools.appendString(","); }					{
						StringMap keyMap = new HashStringMap();
						keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
						keyMap.putString("pyActionName", "pzShowModelParamsFlowAction");
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
						pzPackageRuntime.packageLocalAction("pzShowModelParamsFlowAction", offlineUsingPage , strLAClassName);
						pzPackageRuntime.packageSection("pyOverlayTemplate", offlineUsingPage, strLAClassName, true);
						}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
						if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
							try{
								pzPackageRuntime.packageSection("pzDefinitionTarget",
								tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
								}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
								}
								}
								if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
								String usingPage = "";
								if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
								if("true".equals(bHasPrivilege )) {
									tools.appendString("[\"processAction\", [\"pzShowModelParamsFlowAction\",\"overlay\",\":event\",\"\",\""+streamType+"\",\"\",\"pzModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"true\",\"false\",\"\",\"\"]");
									} else {
										tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
										}
										}

		tools.appendString("]");isBehaviorAdded = true;
		}
		tools.appendString("]' ");
		}
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");										tools.putParamValue("doAutoFormatting", "false");
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



public void layoutBody_7() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("FREEFORM",".pySections(8)") + "  section_index='8'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("OpenRuleAdvanced_OverLabel",".pyPropertiesName",".pySections(8).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "width:94%;",false,"","");tools.putSaveValue("parentLayouttype","");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_22")) {field_OpenRuleAdvanced_OverLabel_7();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent(); pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Messages",".pyParameters",".pySections(8).pySectionBody(1).pyTable.pyRows(1).pyCells(2)"),"  ",pzSection.getCustomStyle(false,"","showMessage","showMessage"), "width:2%;",false,"","");tools.appendString("<nobr>");
tools.putSaveValue("parentLayouttype","");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_23")) {	field_Messages_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString("</nobr>");
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(8).pySectionBody(1).pyTable.pyRows(1).pyCells(3)"),"  ",pzSection.getCustomStyle(false,"","padding-r-1x","padding-r-1x"), "width:3%;",false,"","");tools.appendString("<nobr>");
tools.putSaveValue("parentLayouttype","");	pxIcon_2();
	tools.appendString("</nobr>");
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_8() {
pzSection.getLayout().setExpandParam("SubSectionpzDefinitionTargetBBBBBBBB","",false);
}
public void pzLayout_8() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2== rx.pyActionName cqAPPLY_MODEL",".pyActionName = \'APPLY_MODEL\'", "layout", "visible" )) {pzSetExpandParam_8();
pzLayoutBodyWrapper_8();
}
}
}
public void pzLayoutBodyWrapper_7() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_6();
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
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	secInfo.put("pxGadgetClass", "PegaGadget-ExpressionBuilder");
	Map<String, String> advanceParams = new HashMap<String, String>();
	advanceParams.put("pxObjClass", "PegaGadget-ExpressionBuilder");
	advanceParams.put("pyShowCustomPages", "true");
	advanceParams.put("pyShowLocalVariables", "false");
	advanceParams.put("pyTargetElementId", "pyPropertiesName");
	advanceParams.put("pyShowParameters", "true");
	advanceParams.put("pyPromptClass", "");
	advanceParams.put("pyIsLaunchAsOverlay", "true");
	secInfo.put("advanceParams", advanceParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_20","pxExpressionBuilder", secInfo);
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
pzGenerateAdvParam_2() {{ String newSectionID = "GID_" + (((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique());
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
		ClipboardPage pyAdvParams = tools.createPage("PegaGadget-ExpressionBuilder","");
		
								pyAdvParams.putString("pxObjClass","PegaGadget-ExpressionBuilder");
								pyAdvParams.putString("pyShowCustomPages","true");
								pyAdvParams.putString("pyShowLocalVariables","false");
								pyAdvParams.putString("pyTargetElementId","pyPropertiesName");
								pyAdvParams.putString("pyShowParameters","true");
								pyAdvParams.putString("pyPromptClass","");
								pyAdvParams.putString("pyIsLaunchAsOverlay","true");
		pyAdvParams.putString("SectionName","pxExpressionBuilder");
		pyGadgets.add(newSectionID, pyAdvParams);
			 } 
				 } 
				tools.putParamValue("newSectionID",newSectionID); } 
				}


public void sectionIncludeInCell_pxExpressionBuilder_2(){
pzGenerateAdvParam_2();
sectionBodyIncludeInCell_2(false,false,"","pxExpressionBuilder");elementModel_1("pxExpressionBuilder","pzDefinitionTarget","","");
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
	secInfo.put("pxGadgetClass", "PegaGadget-ExpressionBuilder");
	Map<String, String> advanceParams = new HashMap<String, String>();
	advanceParams.put("pxObjClass", "PegaGadget-ExpressionBuilder");
	advanceParams.put("pyShowCustomPages", "true");
	advanceParams.put("pyShowLocalVariables", "false");
	advanceParams.put("pyTargetElementId", "pyPropertiesName");
	advanceParams.put("pyShowParameters", "true");
	advanceParams.put("pyPromptClass", "");
	advanceParams.put("pyIsLaunchAsOverlay", "false");
	secInfo.put("advanceParams", advanceParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_19","pxExpressionBuilder", secInfo);
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
		ClipboardPage pyAdvParams = tools.createPage("PegaGadget-ExpressionBuilder","");
		
								pyAdvParams.putString("pxObjClass","PegaGadget-ExpressionBuilder");
								pyAdvParams.putString("pyShowCustomPages","true");
								pyAdvParams.putString("pyShowLocalVariables","false");
								pyAdvParams.putString("pyTargetElementId","pyPropertiesName");
								pyAdvParams.putString("pyShowParameters","true");
								pyAdvParams.putString("pyPromptClass","");
								pyAdvParams.putString("pyIsLaunchAsOverlay","false");
		pyAdvParams.putString("SectionName","pxExpressionBuilder");
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


public void sectionIncludeInCell_pxExpressionBuilder_1(){
pzGenerateAdvParam_1();
sectionBodyIncludeInCell_1(false,false,"","pxExpressionBuilder");elementModel_1("pxExpressionBuilder","pzDefinitionTarget","","");
 } 
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__7(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
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
if (_jspx_meth_pega_param__1(pageContext, "OverLabel", "[condition]")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
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
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-When")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
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


public void field_OpenRuleAdvanced_OverLabel_6() { 
String mode1 = getActionsForCustomControls_2();
tools.putSaveValue("mode1Action",mode1);
String mode2 = getActionsForCustomControls_2();
tools.putSaveValue("mode2Action",mode2);
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 22625 bytes
 */
if (_jspx_meth_pega_reference__7(pageContext, ".pyPropertiesName", "input", "OpenRuleAdvanced_OverLabel")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public void layoutBody_6() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("FREEFORM",".pySections(7)") + "  section_index='7'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("OpenRuleAdvanced_OverLabel",".pyPropertiesName",".pySections(7).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","padding-r-1x","padding-r-1x"), "width:100%;",false,"","");tools.putSaveValue("parentLayouttype","");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_18")) {field_OpenRuleAdvanced_OverLabel_6();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent(); pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("SUB_SECTION","pxExpressionBuilder",".pySections(7).pySectionBody(1).pyTable.pyRows(1).pyCells(2)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "",false," o1! wxpzIsPegaExpress","!pzIsPegaExpress");if(pzAuto.handleEvaluateWhen(" o1! wxpzIsPegaExpress","!pzIsPegaExpress", "cell", "visible" )) {sectionIncludeInCell_pxExpressionBuilder_1();}
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("SUB_SECTION","pxExpressionBuilder",".pySections(7).pySectionBody(1).pyTable.pyRows(1).pyCells(3)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "",false," wxpzIsPegaExpress","pzIsPegaExpress");if(pzAuto.handleEvaluateWhen(" wxpzIsPegaExpress","pzIsPegaExpress", "cell", "visible" )) {sectionIncludeInCell_pxExpressionBuilder_2();}
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_7() {
pzSection.getLayout().setExpandParam("SubSectionpzDefinitionTargetBBBBBBB","",false);
}
public void pzLayout_7() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxpzDefinitionWhenWithRelations","pzDefinitionWhenWithRelations", "layout", "visible" )) {pzSetExpandParam_7();
pzLayoutBodyWrapper_7();
}
}
}
public void pzLayoutBodyWrapper_6() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_5();
}
tools.putSaveValue("rowClass","");
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__6(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
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
if (_jspx_meth_pega_param__1(pageContext, "DisableInputBox", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "OverLabel", "[page list / group]")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ApplyTo", "pyClassName")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Property")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Width", "100%")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
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


public void field_OpenRuleAdvanced_OverLabel_5() { 
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 22625 bytes
 */
if (_jspx_meth_pega_reference__6(pageContext, ".pyPropertiesName", "input", "OpenRuleAdvanced_OverLabel")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public void layoutBody_5() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("FREEFORM",".pySections(6)") + "  section_index='6'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("OpenRuleAdvanced_OverLabel",".pyPropertiesName",".pySections(6).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "width:100%;",false,"","");tools.putSaveValue("parentLayouttype","");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_16")) {field_OpenRuleAdvanced_OverLabel_5();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent(); pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_6() {
pzSection.getLayout().setExpandParam("SubSectionpzDefinitionTargetBBBBBB","",false);
}
public void pzLayout_6() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2== rx.pyActionName cqFOR_EACH_PAGE_IN",".pyActionName = \'FOR_EACH_PAGE_IN\'", "layout", "visible" )) {pzSetExpandParam_6();
pzLayoutBodyWrapper_6();
}
}
}
public void pzLayoutBodyWrapper_5() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_4();
}
tools.putSaveValue("rowClass","");
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__5(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
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
if (_jspx_meth_pega_param__1(pageContext, "PropertyName", "pySortActionProp")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
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
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue(aParam1), aParam2)));
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__2(PageContext aPageContext, java.lang.String aN) throws Throwable {
/* p:r */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_p_r_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_p_r_.setPageContext(pageContext);
_jspx_th_p_r_.setParent(mParentTag);
_jspx_th_p_r_.setN(aN);
int _jspx_eval_p_r_ = _jspx_th_p_r_.doStartTag();
if (_jspx_th_p_r_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_r_);
return false;
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__1(PageContext aPageContext, java.lang.String aN, java.lang.String aM) throws Throwable {
/* p:r */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_p_r_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_p_r_.setPageContext(pageContext);
_jspx_th_p_r_.setParent(mParentTag);
_jspx_th_p_r_.setN(aN);
_jspx_th_p_r_.setM(aM);
int _jspx_eval_p_r_ = _jspx_th_p_r_.doStartTag();
if (_jspx_th_p_r_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_r_);
return false;
}
private void performStream_1() throws Throwable {


boolean isBadVal = false;

if (tools.getActive().getMessages().length() == 0) {
	isBadVal = tools.getActive().isBad();
} else {
	isBadVal = true;
}
tools.putSaveValue("isBad",Boolean.toString(isBadVal));



tools.appendString(" ");
pzAuto.putSaveRef("messages", "$this-message", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue("isBad"), "false"))) {
tools.appendString(" ");


	String message = tools.getSaveValue("messages");

	try {
		message = tools.getLocalizedTextForString("pxRequestor.pyMessageLabel", message);
	} catch(Exception e) {
		oLog.error(e);
	}
	message = XMLUtils.encodeString(message);

	if(message != null) {
		if(tools.getSaveValue("FieldError").equals("ERRORTEXT")){
			 message= message.replaceAll("\n"," "); 

		}
	         else{
			message= message.replaceAll("\n","&#10");
		}
		tools.putSaveValue("localizedMessage",message);
	}

tools.appendString(" ");
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "");
tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "inputErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "inputError");
tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString("  ");
tools.putSaveValue("errorDivStyle", "iconErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "iconError");
tools.appendString(" ");
}
tools.appendString("  <div id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("Error\" class=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(errorDivStyle)"
 */
if (_jspx_meth_p_r__2(pageContext, "$SAVE(errorDivStyle)")) {
	return;
}
tools.appendString(" ");
	if (when_1("parentLayoutVal", "SIMPLELAYOUT")) {
tools.appendString(" dynamic-icon-error-div ");
	}
tools.appendString("\" style=\"display:block;\" > <span class=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(errorSpanStyle)"
 */
if (_jspx_meth_p_r__2(pageContext, "$SAVE(errorSpanStyle)")) {
	return;
}
tools.appendString(" ");
	if (when_1("parentLayoutVal", "SIMPLELAYOUT")) {
tools.appendString(" dynamic-icon-error ");
	}
tools.appendString("\" errId=\"\" title=\"");

/*
 * reference tag
 * Cannot inline because: mode is "javascript"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "javascript")) {
	return;
}
tools.appendString("\" ");
	if (when_1("isBad", "true")) {
tools.appendString(" id=\"PegaRULESErrorFlag\" ");
	}
tools.appendString(" > ");
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" <b style=\"font-family: wingdings;color:red;cursor:hand\">x</b> ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString("  </span> </div> ");
	}
}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "Internal");
	oStreamProperties_2.put("pyClassName", "");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-UIDesign");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "Messages");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Embed_ModelParams_Messages
 */
private void property_Embed_ModelParams_Messages() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT	Pega-UIDesign:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_2 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_2);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_2);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_2)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_2);
	mStreamResponse.setJspBaseClass(prevClass_2);
	pz_CurrentRuleKey = prevRuleKey_2;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_2,true);
}
/* end RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Embed_ModelParams_Messages();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_2() throws Throwable {

int size = tools.getActive().size();
String propertyName = tools.getParamValue("PropertyName");

/*
BUG-65009: tempPage added to copy original pageList property if a message exists.  pageList property is copied back
to prevent duplicate error messages on clipboard
*/
ClipboardPage tempPage = null;

for(int i = 1; i <= size; i++){
	boolean isBadVal = false;
	ClipboardProperty currentProp = tools.getActive().getPageValue(i).getProperty(propertyName);
	if (currentProp.getMessages().length() == 0) {
		isBadVal = currentProp.isBad();
	} else {
		isBadVal = true;
	}
	if(isBadVal ){
		if(tempPage == null){
			tempPage = tools.createPage("", "");
			tempPage.put(tools.getActive());
		}
		tools.getActive().addMessage(currentProp.getMessages());
	}	
}

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_1();

tools.appendString(" ");

if(tempPage != null){
	tools.getStepPage().put(tempPage.getProperty(tools.getActive().getName()));
	tempPage.removeFromClipboard();
}

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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY MESSAGESPAGELIST #20180713T135129.113 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "MessagesPageList");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Embed_ModelParams_MessagesPageList
 */
private void property_Embed_ModelParams_MessagesPageList() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY MESSAGESPAGELIST #20180713T135129.113 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY MESSAGESPAGELIST #20180713T135129.113 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY MESSAGESPAGELIST #20180713T135129.113 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_2();

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
/* end RULE-HTML-PROPERTY MESSAGESPAGELIST #20180713T135129.113 GMT */
}
}


public void field_MessagesPageList_1() { 
try {
final ParameterPage params_1 = new ParameterPage();
params_1.putString("PropertyName", "pySortActionProp");
params_1.putString("AJAXTrackID", pega.getValue("param.AJAXTrackID"));
params_1.putString("bLocalize", "false");
	final ClipboardProperty currentProperty_1 = tools.getProperty(".pySortActionPropList");
	if (currentProperty_1 != null && currentProperty_1.getParentPage().getClassName().equals("Embed-ModelParams")) {
		final ClipboardProperty propPrevActive_1 = tools.putActive(currentProperty_1);
		final boolean prevInputMode_1 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput((tools.hasInputEnabled()  || tools.hasEditableEnabled()) && !currentProperty_1.hasAttrProtected());
		final PRStackFrame stack_1 = ((PegaAPI) tools).pushStackFrame( params_1, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "MessagesPageList" );
		try {
			final String currentPropertyRef_1 = currentProperty_1.getReference();
			if (((PegaStreamAPI) tools).isResearchMode()) {
				pega.researchPropertyReference("input", currentPropertyRef_1);
			} else {
				((PegaThread) tools.getThread()).noteInputProperty(currentPropertyRef_1);
				pega.checkIfActivePropertyMissing();
property_Embed_ModelParams_MessagesPageList();
			}
		} finally {
			pega.popStackFrame(stack_1, false);
			tools.putActive(propPrevActive_1);
		}
	} else {
if (_jspx_meth_pega_reference__5(pageContext, ".pySortActionPropList", "input", "MessagesPageList")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__4(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
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
if (_jspx_meth_pega_param__1(pageContext, "OverLabel", "[page list]")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
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
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Property")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
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


public void field_OpenRuleAdvanced_OverLabel_4() { 
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 22625 bytes
 */
if (_jspx_meth_pega_reference__4(pageContext, ".pyPropertiesName", "input", "OpenRuleAdvanced_OverLabel")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public void pxIcon_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_14")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDefinitionTarget_"+ referenceString+ "_21'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("ViewSortingPropertiesIcon") + "  href='"+hrefValue+"' ");
		tools.appendString("onclick='pd(event);' ");
		tools.appendString("data-ctl='Icon'"); tools.appendString(" class='");
		tools.appendString("iconExplore' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title = 'View Sorting Properties"+ " "+repeatIndx+"' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}
		if((com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"!pzIsPegaExpress",null,false)
		)){if(isBehaviorAdded && true){ tools.appendString(","); }{
	StringMap keyMap = new HashStringMap();
	keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
	keyMap.putString("pyActionName", "pzShowSortActionProp");
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
	pzPackageRuntime.packageLocalAction("pzShowSortActionProp", offlineUsingPage , strLAClassName);
	pzPackageRuntime.packageSection("pyModalTemplate", offlineUsingPage , strLAClassName, true);
	}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		try{
			pzPackageRuntime.packageSection("pzDefinitionTarget",
			tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
			}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
			}
			}
			if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
			String usingPage = "";
			if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
			if("true".equals(bHasPrivilege )) {
				tools.appendString("[\"processAction\", [\"pzShowSortActionProp\",\"true\",\":event\",\"\",\""+streamType+"\",\"\",\"\",\"%7B%22isCustomMobileAnim%22%3A%22true%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22none%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%2C%22mobile%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-offbottom-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
				} else {
					tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
					}
					}

		tools.appendString("]");isBehaviorAdded = true;
		}if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}
		if((com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pzIsPegaExpress",null,false)
		)){if(isBehaviorAdded && true){ tools.appendString(","); }					{
						StringMap keyMap = new HashStringMap();
						keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
						keyMap.putString("pyActionName", "pzShowSortActionProp");
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
						pzPackageRuntime.packageLocalAction("pzShowSortActionProp", offlineUsingPage , strLAClassName);
						pzPackageRuntime.packageSection("pyOverlayTemplate", offlineUsingPage, strLAClassName, true);
						}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
						if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
							try{
								pzPackageRuntime.packageSection("pzDefinitionTarget",
								tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
								}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
								}
								}
								if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
								String usingPage = "";
								if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
								if("true".equals(bHasPrivilege )) {
									tools.appendString("[\"processAction\", [\"pzShowSortActionProp\",\"overlay\",\":event\",\"\",\""+streamType+"\",\"\",\"pzModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"true\",\"false\",\"\",\"\"]");
									} else {
										tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
										}
										}

		tools.appendString("]");isBehaviorAdded = true;
		}
		tools.appendString("]' ");
		}
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");										tools.putParamValue("doAutoFormatting", "false");
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



public void layoutBody_4() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("FREEFORM",".pySections(5)") + "  section_index='5'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("OpenRuleAdvanced_OverLabel",".pyPropertiesName",".pySections(5).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "width:94%;",false,"","");tools.putSaveValue("parentLayouttype","");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_12")) {field_OpenRuleAdvanced_OverLabel_4();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent(); pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("MessagesPageList",".pySortActionPropList",".pySections(5).pySectionBody(1).pyTable.pyRows(1).pyCells(2)"),"  ",pzSection.getCustomStyle(false,"","showMessage","showMessage"), "width:2%;",false,"","");tools.appendString("<nobr>");
tools.putSaveValue("parentLayouttype","");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_13")) {	field_MessagesPageList_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString("</nobr>");
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(5).pySectionBody(1).pyTable.pyRows(1).pyCells(3)"),"  ",pzSection.getCustomStyle(false,"","padding-r-1x","padding-r-1x"), "width:3%;",false,"","");tools.appendString("<nobr>");
tools.putSaveValue("parentLayouttype","");	pxIcon_1();
	tools.appendString("</nobr>");
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_5() {
pzSection.getLayout().setExpandParam("SubSectionpzDefinitionTargetBBBBB","",false);
}
public void pzLayout_5() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2== rx.pyActionName cqSORT",".pyActionName = \'SORT\'", "layout", "visible" )) {pzSetExpandParam_5();
pzLayoutBodyWrapper_5();
}
}
}
public void pzLayoutBodyWrapper_4() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_3();
}
tools.putSaveValue("rowClass","");
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__3(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
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
if (_jspx_meth_pega_param__1(pageContext, "DisableInputBox", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "OverLabel", "[page list]")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ApplyTo", "pyClassName")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Property")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Width", "100%")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
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


public void field_OpenRuleAdvanced_OverLabel_3() { 
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 22625 bytes
 */
if (_jspx_meth_pega_reference__3(pageContext, ".pyPropertiesName", "input", "OpenRuleAdvanced_OverLabel")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public void layoutBody_3() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("FREEFORM",".pySections(4)") + "  section_index='4'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("OpenRuleAdvanced_OverLabel",".pyPropertiesName",".pySections(4).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "width:100%;",false,"","");tools.putSaveValue("parentLayouttype","");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_10")) {field_OpenRuleAdvanced_OverLabel_3();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent(); pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpzDefinitionTargetBBBB","",false);
}
public void pzLayout_4() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxpzDefinitionAppendTo","pzDefinitionAppendTo", "layout", "visible" )) {pzSetExpandParam_4();
pzLayoutBodyWrapper_4();
}
}
}
public void pzLayoutBodyWrapper_3() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_2();
}
tools.putSaveValue("rowClass","");
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
if (_jspx_meth_pega_param__1(pageContext, "DisableInputBox", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "OverLabel", "[page]")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ApplyTo", "pyClassName")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Property")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Width", "100%")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
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


public void field_OpenRuleAdvanced_OverLabel_2() { 
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 22625 bytes
 */
if (_jspx_meth_pega_reference__2(pageContext, ".pyPropertiesName", "input", "OpenRuleAdvanced_OverLabel")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public void layoutBody_2() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("FREEFORM",".pySections(3)") + "  section_index='3'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("OpenRuleAdvanced_OverLabel",".pyPropertiesName",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "width:100%;",false,"","");tools.putSaveValue("parentLayouttype","");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_8")) {field_OpenRuleAdvanced_OverLabel_2();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent(); pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpzDefinitionTargetBBB","",false);
}
public void pzLayout_3() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2== rx.pyActionName cqUPDATE_PAGE",".pyActionName = \'UPDATE_PAGE\'", "layout", "visible" )) {pzSetExpandParam_3();
pzLayoutBodyWrapper_3();
}
}
}
public void pzLayoutBodyWrapper_2() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_1();
}
tools.putSaveValue("rowClass","");
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
if (_jspx_meth_pega_param__1(pageContext, "OverLabel", "[value]")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
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
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Property")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
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
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }{String strStreamName="";String strPropertyTarget ="";String strPageName ="";strStreamName="pzDefinitionTarget";if(tools.getPrimaryPage() != null){ strPageName = tools.getPrimaryPage().getName();}if(tools.getActive() != null){strPropertyTarget = tools.getActive().getEntryHandle();}Map<String, String> config = new HashMap<String, String>();config.put("pyActivity", "pzRunActionWrapper");config.put("pzActivity", "ReloadCell");config.put("StreamName", strStreamName);config.put("pyPropertyTarget", strPropertyTarget ); config.put("pySubAction","runAct");config.put("inStandardsMode","true");pega.getUIEngine().getUIAction("runActivity", config).register();com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();actionRequest.registerFixedParameter("pyActivity", "ReloadCell"); actionRequest.registerFixedParameter("pyPropertyTarget", strPropertyTarget ); actionRequest.registerFixedParameter("StreamName", strStreamName); actionRequest.registerFixedParameter("pzPrimaryPageName", strPageName); pzAuto.registerActionRequest(actionRequest);}	tools.appendString("[\"postValue\",[\":event\"]");

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


public void field_OpenRuleAdvanced_OverLabel_1() { 
String mode1 = getActionsForCustomControls_1();
tools.putSaveValue("mode1Action",mode1);
String mode2 = getActionsForCustomControls_2();
tools.putSaveValue("mode2Action",mode2);
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 22625 bytes
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyPropertiesName", "input", "OpenRuleAdvanced_OverLabel")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public void layoutBody_1() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("FREEFORM",".pySections(2)") + "  section_index='2'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("OpenRuleAdvanced_OverLabel",".pyPropertiesName",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "width:100%;",false,"","");tools.putSaveValue("parentLayouttype","");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")) {field_OpenRuleAdvanced_OverLabel_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent(); pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzDefinitionTargetBB","",false);
}
public void pzLayout_2() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2|| o2== rx.pyActionName cqSET o2== rx.pyActionName cqREMOVE",".pyActionName = \'SET\' || .pyActionName = \'REMOVE\'", "layout", "visible" )) {pzSetExpandParam_2();
pzLayoutBodyWrapper_2();
}
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
	cellPage.put("pyValue",".pyActionName");
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);	cellPage.put("pyID","pyActionName");
	modePage2.put("pyContent","associated");
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("2014100808015504793975",true));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyActionName");
	String spxUniqueStreamHash4 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash4 != null && !"".equals(spxUniqueStreamHash4)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash4,pxUniqueStreamHash+"_4");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_4");
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
	tools.appendString("<input  type=\"hidden\"  " + pzCell.getTestIdIfEnabled("2014100808015504793975") + "  id=\"");
		tools.appendString(tools.getHTMLIDForProperty(true,"hidden"));
tools.appendString("\" value=\"");if(bUITemplatized){
	tools.appendString(pzAuto.getUIComponentRuntime().getRuntimeContextTree().generateContextToken("pyActionName"));}else {
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
	cellPage.put("pyValue",".pyActionName");
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);	cellPage.put("pyID","pyActionName");
	modePage2.put("pyContent","associated");
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("2014100808015504793975",true));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyActionName");
	String spxUniqueStreamHash3 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash3 != null && !"".equals(spxUniqueStreamHash3)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash3,pxUniqueStreamHash+"_3");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_3");
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
	tools.appendString("<input  type=\"hidden\"  " + pzCell.getTestIdIfEnabled("2014100808015504793975") + "  id=\"");
		tools.appendString(tools.getHTMLIDForProperty(true,"hidden"));
tools.appendString("\" value=\"");if(bUITemplatized){
	tools.appendString(pzAuto.getUIComponentRuntime().getRuntimeContextTree().generateContextToken("pyActionName"));}else {
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
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxHidden_1(".pyActionName",0,"","","Text");
	return index;
}


public int simpleLayoutTemplateCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxHidden_2(".pyActionName",0,"","","Text");
	index++;
	return index;
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzDefinitionTargetB","",false);
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201712221135090074826") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + " content  layout-content-default  clearfix" + "'  ");
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
		pg_dlmeta.put("format","default");
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
	String paramName = "EXPANDEDSubSectionpzDefinitionTargetB";
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
pzLayoutBodyWrapper_1();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}










private void performStream_3() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_3 = new HashMap();
static {
	oPropDefinitions_3.put("Embed-ModelParams.pySortActionPropList", new LiteweightPropertyDefinition("Embed-ModelParams", "pySortActionPropList", "L*NEmbed-ModelSortParams", false, true, "Default", false));
	oPropDefinitions_3.put("Embed-ModelParams.pyPropertiesName", new LiteweightPropertyDefinition("Embed-ModelParams", "pyPropertiesName", "sTN", false, true, "Default", false));
	oPropDefinitions_3.put("Embed-ModelParams.pyParameters", new LiteweightPropertyDefinition("Embed-ModelParams", "pyParameters", "L*NEmbed-MethodParams", false, true, "Default", false));
}
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "Internal");
	oStreamProperties_3.put("pyClassName", "Embed-ModelParams");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-SECTION EMBED-MODELPARAMS PZDEFINITIONTARGET #20230618T003136.579 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "pzDefinitionTarget");
	oStreamProperties_3.put("pyRuleSetVersion", "08-23-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION EMBED-MODELPARAMS PZDEFINITIONTARGET #20230618T003136.579 GMT", "Embed-ModelParams pzDefinitionTarget", "Pega-Desktop", "08-23-01", "20230618T003136.579 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT", "Messages", "Pega-UIDesign", "08-01-01", "20180713T133634.985 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY MESSAGESPAGELIST #20180713T135129.113 GMT", "MessagesPageList", "Pega-Desktop", "08-01-01", "20180713T135129.113 GMT");
}
