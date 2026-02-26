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
 * Builds JSP stream EMBED-STAGE!PZCASETYPESTAGEENTRYCRITERIA.
 */
public class ra_stream_pzcasetypestageentrycriteria_915318b84dbca2186cf0bb4761f72bcf extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzCaseTypeStageEntryCriteria.Embed_Stage.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 373026046;
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
	public ra_stream_pzcasetypestageentrycriteria_915318b84dbca2186cf0bb4761f72bcf(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "6741497296eb1b468a1d605abd963cccd744fd59";
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
/* Instance RULE-HTML-SECTION EMBED-STAGE PZCASETYPESTAGEENTRYCRITERIA #20180713T140844.731 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "6741497296eb1b468a1d605abd963cccd744fd59";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzCaseTypeStageEntryCriteria",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION EMBED-STAGE PZCASETYPESTAGEENTRYCRITERIA #20180713T140844.731 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION EMBED-STAGE PZCASETYPESTAGEENTRYCRITERIA #20180713T140844.731 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION EMBED-STAGE PZCASETYPESTAGEENTRYCRITERIA #20180713T140844.731 GMT */
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
	"Rule-HTML-Section:PZCASETYPESTAGEENTRYCRITERIA", 
	"Rule-Obj-Property:PYCLASSNAME", 
	"Rule-Obj-Property:PYEXPRESSIONTOSKIPORALLOW", 
	"Rule-Obj-Property:PYVALIDATE", 
	"Rule-Obj-Property:PYSKIPSTAGEWHEN", 
	"Rule-Obj-Property:PYSKIPORALLOWTYPE", 
	"Rule-HTML-Property:PXLINK", 
	"Rule-HTML-Property:PXICON", 
	"Rule-HTML-Property:PXDROPDOWN", 
	"Rule-HTML-Property:OPENRULE", 
	"Rule-HTML-Property:PXHIDDEN", 
	"Rule-File-Binary:WEBWB!PYGRIDICONS!PNG", 
	"Rule-File-Binary:WEBWB!PYGRIDICONS!PNG"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZCASETYPESTAGEENTRYCRITERIA","Rule-HTML-Section","EMBED-STAGE",false,"","Pega-ProcessArchitect","08-01-01","RULE-HTML-SECTION EMBED-STAGE PZCASETYPESTAGEENTRYCRITERIA #20180713T140844.731 GMT","!PZCASETYPESTAGEENTRYCRITERIA",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",373026046), 
		new DependentRuleInfo("PYCLASSNAME","Rule-Obj-Property","RULE-",true,"Rule-Obj-CaseType","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT","!PYCLASSNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYEXPRESSIONTOSKIPORALLOW","Rule-Obj-Property","@BASECLASS",false,"","Pega-ProcessEngine","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYEXPRESSIONTOSKIPORALLOW #20180713T132856.486 GMT","!PYEXPRESSIONTOSKIPORALLOW",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYVALIDATE","Rule-Obj-Property","EMBED-STAGE",false,"","Pega-ProcessEngine","08-01-01","RULE-OBJ-PROPERTY EMBED-STAGE PYVALIDATE #20180713T132912.328 GMT","!PYVALIDATE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYSKIPSTAGEWHEN","Rule-Obj-Property","EMBED-STAGE",false,"","Pega-ProcessEngine","08-01-01","RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT","!PYSKIPSTAGEWHEN",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYSKIPORALLOWTYPE","Rule-Obj-Property","@BASECLASS",true,"Embed-Stage","Pega-ProcessEngine","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYSKIPORALLOWTYPE #20180713T132856.676 GMT","!PYSKIPORALLOWTYPE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXLINK","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT","PXLINK",true,false,"ABSOLUTE_CLASSLESS",-1085887471), 
		new DependentRuleInfo("PXICON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT","PXICON",true,false,"ABSOLUTE_CLASSLESS",-794576025), 
		new DependentRuleInfo("PXDROPDOWN","Rule-HTML-Property","",false,"","Pega-Gadgets","08-04-01","RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT","PXDROPDOWN",true,false,"ABSOLUTE_CLASSLESS",1414051726), 
		new DependentRuleInfo("OPENRULE","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY OPENRULE #20180713T132012.839 GMT","OPENRULE",true,false,"ABSOLUTE_CLASSLESS",1742741163), 
		new DependentRuleInfo("PXHIDDEN","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY PXHIDDEN #20180713T133435.722 GMT","PXHIDDEN",true,false,"ABSOLUTE_CLASSLESS",1000971257), 
		new DependentRuleInfo("WEBWB!PYGRIDICONS!PNG","Rule-File-Binary","",false,"","","","","WEBWB!PYGRIDICONS!PNG",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PYGRIDICONS!PNG","Rule-File-Binary","",false,"","Pega-Gadgets","","RULE-FILE-BINARY WEBWB PYGRIDICONS!PNG #20180713T133416.139 GMT","WEBWB!PYGRIDICONS!PNG",true,false,"ABSOLUTE_CLASSLESS",1)
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
//	RULE-HTML-SECTION EMBED-STAGE PZCASETYPESTAGEENTRYCRITERIA #20180713T140844.731 GMT:20180713T140844.731 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-FILE-BINARY WEBWB PYGRIDICONS!PNG #20180713T133416.139 GMT:20180713T133416.139 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-FILE-BINARY WEBWB PYGRIDICONS!PNG #20180713T133416.139 GMT:20180713T133416.139 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSKIPORALLOWTYPE #20180713T132856.676 GMT:20180713T132856.676 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYEXPRESSIONTOSKIPORALLOW #20180713T132856.486 GMT:20180713T132856.486 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYEXPRESSIONTOSKIPORALLOW #20180713T132856.486 GMT:20180713T132856.486 GMT
//	RULE-HTML-PROPERTY OPENRULE #20180713T132012.839 GMT:20180713T132012.839 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYEXPRESSIONTOSKIPORALLOW #20180713T132856.486 GMT:20180713T132856.486 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYEXPRESSIONTOSKIPORALLOW #20180713T132856.486 GMT:20180713T132856.486 GMT
//	RULE-HTML-PROPERTY OPENRULE #20180713T132012.839 GMT:20180713T132012.839 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSKIPSTAGEWHEN #20180713T132912.286 GMT:20180713T132912.286 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYVALIDATE #20180713T132912.328 GMT:20180713T132912.328 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYVALIDATE #20180713T132912.328 GMT:20180713T132912.328 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYVALIDATE #20180713T132912.328 GMT:20180713T132912.328 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYVALIDATE #20180713T132912.328 GMT:20180713T132912.328 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYVALIDATE #20180713T132912.328 GMT:20180713T132912.328 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYVALIDATE #20180713T132912.328 GMT:20180713T132912.328 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYVALIDATE #20180713T132912.328 GMT:20180713T132912.328 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYVALIDATE #20180713T132912.328 GMT:20180713T132912.328 GMT
//	RULE-HTML-PROPERTY PXHIDDEN #20180713T133435.722 GMT:20180713T133435.722 GMT
//	RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT:20180713T131307.906 GMT
//	RULE-HTML-PROPERTY PXHIDDEN #20180713T133435.722 GMT:20180713T133435.722 GMT
//	RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT:20180713T131307.906 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-FILE-BINARY WEBWB PYGRIDICONS!PNG #20180713T133416.139 GMT:20180713T133416.139 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_6(
//	simpleLayout_8(
//	simpleLayout_9(
//	simpleLayout_2(
//	simpleLayout_3(
//	pzLayout_11(
//	simpleLayout_7(
//	simpleLayout_5(
//	simpleLayout_1(
//	simpleLayout_4(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS #20180713T131438.133 GMT:20180713T131438.133 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION GRID PZMIGRATEGRIDRIGHTCLICKACTION #20180713T133337.796 GMT:20180713T133337.796 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLDEFAULTVALUES #20180713T133337.840 GMT:20180713T133337.840 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T133337.901 GMT:20180713T133337.901 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
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
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELCELLCONTENT #20190410T165241.183 GMT:20190410T165241.183 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPREDATATRANSFORM #20180713T133339.990 GMT:20180713T133339.990 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONPOSTVALUE--(BOOLEAN,CLIPBOARDPAGE,CLIPBOARDPAGE) #20200623T114924.749 GMT:20200626T092833.607 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSETSTYLE #20180713T133344.632 GMT:20180713T133344.632 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBUILDPARAMETERPAGE #20180713T133344.777 GMT:20180713T133344.777 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECALCULATEDVALUE--(CLIP25E448149E37EDE02190B4A70F76AB5B #20210527T114234.915 GMT:20210527T114234.915 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZVALIDATEFIELDVALUE #20180713T133346.618 GMT:20180713T133346.618 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
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
		return "07a9d2edad7ee18b090e6140fd7063eb";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-Stage";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
String actionName = tools.getParamValue("pyAction");
if(!actionName.equals("PostValue") && !actionName.equals("ReadonlyFormat")){
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){
pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzCaseTypeStageEntryCriteria",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzCaseTypeStageEntryCriteria','insKey':'RULE-HTML-SECTION EMBED-STAGE PZCASETYPESTAGEENTRYCRITERIA #20180713T140844.731 GMT','sectionType':'standard'}");
sectionDefaultValues_1();
pzLayout_7();
pzLayout_8();
pzLayout_9();
pzLayout_10();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_73")) ){
pzLayout_11();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
 tools.putSaveValue("ContainerID", "");
if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {tools.putParamValue("setPostValueURL", "true");} else {tools.appendString("<div style=\"display:none;\" data-postvalue-url=\"" + StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", "pyActivity=ReloadCell&StreamName=pzCaseTypeStageEntryCriteria")) + "\"></div>");}
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
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pySectionName", "pzCaseTypeStageEntryCriteria");
config.put("pySectionClass", "Embed-Stage");
pega.getUIEngine().getUIAction("deleteRow", config).register();
pega.getUIEngine().getUIAction("addRow", null).register();
pega.getUIEngine().getUIAction("addRow", null).register();
}
public void 
getControlMarkup_1() {
try {
if(tools.getParamValue("pyPropertyTarget").equals(tools.getStepPage().getProperty(".pySkipOrAllowType").getEntryHandle())){if(tools.getParamValue("UITemplatingStatus").equals("Y")) {
	pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
}pxDropdown_1(".pySkipOrAllowType",0,"","","Text");pzAuto.getUIComponentRuntime().insertTemplateScripts();}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void pzLayoutBodyWrapper_12() {
 String clsScroll= "";tools.appendString("<div section_index='5' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();gridCentreLayout_1();layoutBody_1();
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


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_75")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzCaseTypeStageEntryCriteria_"+ referenceString+ "_43'";
	 String securedPropValue = null;
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141230054119037026633") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"INSERTAFTER\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";
		if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, "CaseTypeStages.pxInstanceLockedBy != '' || .pyCheckedOutOrLocked != ''", null, false)){
			tools.appendString(" disabled tabIndex='-1' ");
			bDisabled = true;
		}tools.appendString(" class='Simple");tools.appendString("'");
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-plus-circle";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Add required attachment",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("pxLink",".pyTemplateInputBox",".pySections(5).pySectionBody(3).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "",false," o1! wxpzStageLocked","!pzStageLocked");if(pzAuto.handleEvaluateWhen(" o1! wxpzStageLocked","!pzStageLocked", "cell", "visible" )) {tools.appendString("<nobr>");
tools.putSaveValue("parentLayouttype","ACTION");	pxLink_1();
	tools.appendString("</nobr>");
	}
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>\n\n\t\t\t\t\t\t</div>");
 } 


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}


public void pxIcon_3() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_74")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzCaseTypeStageEntryCriteria_"+ referenceString+ "_39'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
			repeatIndx = tools.getSaveValue("index");
			if(repeatIndx != null && repeatIndx.matches("^[0-9]+$"))
				repeatIndx = PRNumberFormat.format(null,"",false, null, Integer.parseInt(repeatIndx));
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Delete row\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
			if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, "CaseTypeStages.pxInstanceLockedBy != '' || .pyCheckedOutOrLocked != ''", null, false)){
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141230054119036922804") + "  ");
		tools.appendString("onclick_func='pd(event);' href='' ");
		tools.appendString(" data-ctl='Icon' "); tools.appendString(" IsSprite='true' href_original='' class='cursordefault' disabled='disabled' style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,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");
		}
		else{
		
		tools.appendString("webwb/pygridicons_12892877635.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-128px -32px; width:16px; height:16px;' ");
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-128px -16px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
				tools.appendString(" disabled ");
			} else {
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141230054119036922804") + "  ");
		tools.appendString("onclick='pd(event);' href='' ");
		tools.appendString("tabindex='0' ");
		tools.appendString("IsSprite='true' data-ctl='Icon' "); tools.appendString("style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,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");
		}
		else{
		
		tools.appendString("webwb/pygridicons_12892877635.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-128px top; width:16px; height:16px;' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-128px -16px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
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
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox", ".pySections(5).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'style='");
	tools.appendString("width:auto;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxIcon_3();
									tools.appendString("</DIV>"); } else { pxIcon_3();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingDataCell_6() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzDisplayAttachmentCategory", ".pySections(5).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString(" class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("height:40px;");if(Integer.parseInt(tools.getSaveValue("rowsDisplayed")) == 1) {tools.appendString("width:"); if(!tools.getParamValueCSF("PpyRequiredCategories5colWidthCache1").equals("")){ tools.appendParamCSF("PpyRequiredCategories5colWidthCache1"); } else { tools.appendString("226"); } tools.appendString("px;");}tools.appendString(""); tools.appendString("'>");
	if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzDisplayAttachmentCategory_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void repeatingDataCell_5() {
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141230054119036718796") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(5).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" class='");
		tools.appendString(" gridCell");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyRequiredCategories5colWidthCache2").equals("")){ tools.appendParamCSF("PpyRequiredCategories5colWidthCache2"); } else { tools.appendString("18"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:21px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("&nbsp;");if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</td>");
	}
public void repeatingDataCell_4() {
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141230054119036516802") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(5).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" class='");
		tools.appendString(pzSection.getCustomStyle(false,"","helper_text_dataLabelRead ","helper_text_dataLabelWrite "));tools.appendString(" gridCell");tools.appendString(" ");tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:21px;");tools.appendString("width:"); if(!tools.getParamValueCSF("PpyRequiredCategories5colWidthCache1").equals("")){ tools.appendParamCSF("PpyRequiredCategories5colWidthCache1"); } else { tools.appendString("226"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:21px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(!pzAuto.getBrowserUtils().isIE()){
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
public void pzSetExpandParam_11() {
pzSection.getLayout().setExpandParam("SubSectionpzCaseTypeStageEntryCriteriaBBBBBBBBBB","",true);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(5)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzCaseTypeStageEntryCriteriaBBBBBBBBBB";
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
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Attachments required for stage entry");
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel7783' data-layout-id='202602230415420726" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel7783'>" + l_sectionTitle + "</h2><nobr>");
inclAction_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzCaseTypeStageEntryCriteriaBBBBBBBBBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}
public void 
gridBeginLayout_2() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "None"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPage_pyRequiredCategoriesL12=null;

 Map selUniqMap_pyRequiredCategoriesL12 = null;
tools.appendString("<div ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyRequiredCategories");tools.appendString("_pzCaseTypeStageEntryCriteria_5'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201803230729100813280") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readWrite' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='true' OAFunc='openRuleByKeys' ");
pyRequiredCategories_1();
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

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyRequiredCategories");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList=' .pyTemplateInputBox  ' class='yui-skin-sam gPXAuto");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString(" floated ");

					}tools.appendString("' style='");

					if(!pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("display:"); if(pzAuto.getBrowserUtils().isIE()) {  tools.appendString(" inline; "); } else {  tools.appendString("inline-block;"); } }tools.appendString("' gPropIndex='PpyRequiredCategories5' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201803230729100813280-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "Attachment Validation";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' ><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyRequiredCategories5colWidthGBL\" id=\"PpyRequiredCategories5colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyRequiredCategories5colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyRequiredCategories5colWidthGBR\" id=\"PpyRequiredCategories5colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyRequiredCategories5colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyRequiredCategories5colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("' style='width:");

					 if(!tools.getParamValue("PpyRequiredCategories5colWidthGBL").equals("")) { tools.appendParamCSF("PpyRequiredCategories5colWidthGBL"); } else { 

					tools.appendString("244.0"); } 

					tools.appendString("px;' cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='Attachment Validation' PL_PROP='");

					
tools.appendString(".pyRequiredCategories");

					tools.appendString("' PL_PROP_CLASS='Embed-AttachmentCategory' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' style=\"display:none;\">");

					 repeatingDataCell_4(); 

					activeName = tools.getActiveName();  repeatingDataCell_5(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyRequiredCategories").iterator(); 

					
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

					tools.appendString(" ng-repeat=\"Item in rootData..pyRequiredCategories\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
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

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyRequiredCategories")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyRequiredCategories5") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyRequiredCategories"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201803230729100813280-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_6(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_7(); 

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

					
									 ClipboardPage tempNoRespg = tools.createPage("Embed-AttachmentCategory", "tempNoRespg");

					
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

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyRequiredCategories5") && tools.getParamValue("partialRefresh").equals("false")) {

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
public void pzLayout_11() {
String gridLayoutMethodName="pzLayout_11";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
pzSetExpandParam_11();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_1();
}
pzLayoutBodyWrapper_12();
 LayoutWrapperTableEnd_1(); tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBody_9() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_9");simpleLayout_9();
}
public void pzLayoutBodyWrapper_11() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='4' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_9");simpleLayout_9();
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
	cellPage.put("pyValue","CaseTypeStages.pyClassName");
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);	cellPage.put("pyID","pyClassName");
	modePage2.put("pyContent","associated");
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("2014123005411903636645",true));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty("CaseTypeStages.pyClassName");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("CaseTypeStages.pyClassName", ".pyCaption");
	String spxUniqueStreamHash72 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash72 != null && !"".equals(spxUniqueStreamHash72)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash72,pxUniqueStreamHash+"_72");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_72");
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
	tools.appendString("<input  type=\"hidden\"  " + pzCell.getTestIdIfEnabled("2014123005411903636645") + "  id=\"");
		tools.appendString(tools.getHTMLIDForProperty(true,"hidden"));
tools.appendString("\" value=\"");if(bUITemplatized){
	tools.appendString(pzAuto.getUIComponentRuntime().getRuntimeContextTree().generateContextToken("pyClassName"));}else {
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
	cellPage.put("pyValue","CaseTypeStages.pyClassName");
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);	cellPage.put("pyID","pyClassName");
	modePage2.put("pyContent","associated");
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("2014123005411903636645",true));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty("CaseTypeStages.pyClassName");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("CaseTypeStages.pyClassName", ".pyCaption");
	String spxUniqueStreamHash71 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash71 != null && !"".equals(spxUniqueStreamHash71)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash71,pxUniqueStreamHash+"_71");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_71");
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
	tools.appendString("<input  type=\"hidden\"  " + pzCell.getTestIdIfEnabled("2014123005411903636645") + "  id=\"");
		tools.appendString(tools.getHTMLIDForProperty(true,"hidden"));
tools.appendString("\" value=\"");if(bUITemplatized){
	tools.appendString(pzAuto.getUIComponentRuntime().getRuntimeContextTree().generateContextToken("pyClassName"));}else {
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



public int simpleLayoutCell_14( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxHidden_1("CaseTypeStages.pyClassName",0,"","","Identifier");
	return index;
}


public int simpleLayoutTemplateCell_14( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxHidden_2("CaseTypeStages.pyClassName",0,"","","Identifier");
	index++;
	return index;
}
public void pzSetExpandParam_10() {
pzSection.getLayout().setExpandParam("SubSectionpzCaseTypeStageEntryCriteriaBBBBBBBBB","",false);
}


public void simpleLayout_9() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash70 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash70 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash70 != null && !"".equals(spxUniqueStreamHash70)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash70,pxUniqueStreamHash+"_70");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201803230729100801578") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(4)'}") + " class='" + " content  layout-content-default  clearfix" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash70 != null && !"".equals(spxUniqueStreamHash70)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_70");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","default");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(4)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_14(index);
	}else{
		index=simpleLayoutTemplateCell_14(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_9() {
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
	String paramName = "EXPANDEDSubSectionpzCaseTypeStageEntryCriteriaBBBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(4)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","4");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_9();
	containerComponent.endComponent();
	}
public void pzLayout_10() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_10();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_11();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_9();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_8() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_8");simpleLayout_8();
}
public void pzLayoutBodyWrapper_10() {
tools.appendString("<div class='layout layout-noheader layout-noheader-default'>");
 String clsScroll= "";tools.appendString("<div section_index='3' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_8");simpleLayout_8();
tools.appendString("</div></div>");
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
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "SkipClientValidation", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "DisableInputBox", "-1")) {
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
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Validate")) {
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


public void field_OpenRuleAdvanced_4() { 
String mode1 = getActionsForCustomControls_2();
tools.putSaveValue("mode1Action",mode1);
String mode2 = getActionsForCustomControls_2();
tools.putSaveValue("mode2Action",mode2);
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__5(pageContext, ".pyValidate", "input", "OpenRuleAdvanced")) {
	return;
}
} catch(Throwable t) {
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
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Validate")) {
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


public void field_OpenRuleAdvanced_3() { 
String mode1 = getActionsForCustomControls_2();
tools.putSaveValue("mode1Action",mode1);
String mode2 = getActionsForCustomControls_2();
tools.putSaveValue("mode2Action",mode2);
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__4(pageContext, ".pyValidate", "input", "OpenRuleAdvanced")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public int simpleLayoutCell_12( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== rxCaseTypeStages.pxInstanceLockedBy cq o2== rx.pyCheckedOutOrLocked cq","CaseTypeStages.pxInstanceLockedBy == \'\' && .pyCheckedOutOrLocked == \'\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyValidate",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("2014123005411903614578-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	tools.appendString("for='pyValidate" + tools.getParamValueCSF("pega_RLindex") + "'");
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","Set entry validation") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("2014123005411903614578-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	tools.appendString("for='pyValidate" + tools.getParamValueCSF("pega_RLindex") + "'");
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","Set entry validation") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_62")) {field_OpenRuleAdvanced_3();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014123005411903614578-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","OpenRuleAdvanced");
	pgCells.put("forLabel",".pyValidate");
	pgCells.put("pyAutoHTML","false");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== rxCaseTypeStages.pxInstanceLockedBy cq o2== rx.pyCheckedOutOrLocked cq",pxUniqueStreamHash+"_64");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_64");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","CaseTypeStages.pxInstanceLockedBy == '' && .pyCheckedOutOrLocked == ''");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Embed-Stage");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_64");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== rxCaseTypeStages.pxInstanceLockedBy cq o2== rx.pyCheckedOutOrLocked cq", pxUniqueStreamHash+"_64"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyValidate",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_65")) {	field_OpenRuleAdvanced_3();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "Set entry validation";
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


public int simpleLayoutCell_13( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2|| o2!= rxCaseTypeStages.pxInstanceLockedBy cq o2!= rx.pyCheckedOutOrLocked cq","CaseTypeStages.pxInstanceLockedBy != \'\' || .pyCheckedOutOrLocked != \'\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyValidate",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("2014123005411903614578-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	tools.appendString("for='pyValidate" + tools.getParamValueCSF("pega_RLindex") + "'");
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","Set entry validation") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("2014123005411903614578-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	tools.appendString("for='pyValidate" + tools.getParamValueCSF("pega_RLindex") + "'");
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","Set entry validation") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_66")) {field_OpenRuleAdvanced_4();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014123005411903614578-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","OpenRuleAdvanced");
	pgCells.put("forLabel",".pyValidate");
	pgCells.put("pyAutoHTML","false");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2|| o2!= rxCaseTypeStages.pxInstanceLockedBy cq o2!= rx.pyCheckedOutOrLocked cq",pxUniqueStreamHash+"_68");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_68");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","CaseTypeStages.pxInstanceLockedBy != '' || .pyCheckedOutOrLocked != ''");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Embed-Stage");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_68");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2|| o2!= rxCaseTypeStages.pxInstanceLockedBy cq o2!= rx.pyCheckedOutOrLocked cq", pxUniqueStreamHash+"_68"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyValidate",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_69")) {	field_OpenRuleAdvanced_4();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "Set entry validation";
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
public void pzSetExpandParam_9() {
pzSection.getLayout().setExpandParam("SubSectionpzCaseTypeStageEntryCriteriaBBBBBBBB","",false);
}


public void simpleLayout_8() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash61 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash61 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash61 != null && !"".equals(spxUniqueStreamHash61)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash61,pxUniqueStreamHash+"_61");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201803230729100801252") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(3)'}") + " class='" + " content  layout-content-default content-default  clearfix" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash61 != null && !"".equals(spxUniqueStreamHash61)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_61");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","default");
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
		index=simpleLayoutCell_12(index);
	}else{
		index=simpleLayoutTemplateCell_12(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_13(index);
	}else{
		index=simpleLayoutTemplateCell_13(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_8() {
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
	String paramName = "EXPANDEDSubSectionpzCaseTypeStageEntryCriteriaBBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(3)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-default");
	metadataPage.put("sectionIndex","3");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_8();
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
pzLayoutBodyWrapper_10();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_8();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_7() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_7");simpleLayout_7();
}
public void pzLayoutBodyWrapper_9() {
tools.appendString("<div class='layout layout-noheader layout-noheader-default'>");
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_7");simpleLayout_7();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public int simpleLayoutCell_11( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-label item-" + Integer.toString(index) + "   '  STRING_TYPE='label' RESERVE_SPACE='false'><div class='content-inner '>" + "<div  " + pzCell.getTestIdIfEnabled("2014092314595604348609") + "  class='field-item " + pzSection.getCustomStyle(false, "","dataLabelRead","dataLabelWrite") + "' >");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","Skip stage when: The last stage cannot be skipped") + "</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("pyType","label");
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014092314595604348609")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "Skip stage when: The last stage cannot be skipped";
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
public void pzSetExpandParam_8() {
pzSection.getLayout().setExpandParam("SubSectionpzCaseTypeStageEntryCriteriaBBBBBBB","",false);
}


public void simpleLayout_7() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash57 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash57 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash57 != null && !"".equals(spxUniqueStreamHash57)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash57,pxUniqueStreamHash+"_57");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201803230729100800577") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + " class='" + " content  layout-content-default content-default " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash57 != null && !"".equals(spxUniqueStreamHash57)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_57");
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
		pg_dlmeta.put("isFlex","false");
		pg_dlmeta.put("clear","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
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
	String paramName = "EXPANDEDSubSectionpzCaseTypeStageEntryCriteriaBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-default");
	metadataPage.put("sectionIndex","2");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o1! wxpzIsAlternateStage wxpzIsLastStage", pxUniqueStreamHash+"_60");metadataPage.put("lMode","Inline-block");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_60");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_7();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_8() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o1! wxpzIsAlternateStage wxpzIsLastStage","!pzIsAlternateStage && pzIsLastStage", "layout", "visible" )) {pzSetExpandParam_8();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_9();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_7();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_6() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_6");simpleLayout_6();
}
public void pzLayoutBodyWrapper_8() {
tools.appendString("<div class='layout layout-noheader layout-noheader-default'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_6");simpleLayout_6();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_5() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_5");simpleLayout_5();
}
public void pzLayoutBodyWrapper_7() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_5");simpleLayout_5();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_4() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
}
public void pzLayoutBodyWrapper_6() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
tools.appendString("</div></div>");
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
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "SkipClientValidation", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "DisableInputBox", "-1")) {
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
if (_jspx_meth_pega_param__1(pageContext, "NoEventOnPick", "0")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
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


public void field_OpenRuleAdvanced_2() { 
String mode1 = getActionsForCustomControls_1();
tools.putSaveValue("mode1Action",mode1);
String mode2 = getActionsForCustomControls_2();
tools.putSaveValue("mode2Action",mode2);
if(pzAuto.handleEvaluateWhen(" wxpzIsLastStage","pzIsLastStage", "cell", "readonly" )){
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__3(pageContext, ".pySkipStageWhen", "display", "OpenRuleAdvanced")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
 } 
 else {try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__3(pageContext, ".pySkipStageWhen", "input", "OpenRuleAdvanced")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
 } 
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
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-When")) {
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
String mode1 = getActionsForCustomControls_1();
tools.putSaveValue("mode1Action",mode1);
String mode2 = getActionsForCustomControls_2();
tools.putSaveValue("mode2Action",mode2);
if(pzAuto.handleEvaluateWhen(" wxpzIsLastStage","pzIsLastStage", "cell", "readonly" )){
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__2(pageContext, ".pySkipStageWhen", "display", "OpenRuleAdvanced")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
 } 
 else {try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__2(pageContext, ".pySkipStageWhen", "input", "OpenRuleAdvanced")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
 } 
}


public int simpleLayoutCell_7( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2== rxCaseTypeStages.pxInstanceLockedBy cq","CaseTypeStages.pxInstanceLockedBy == \'\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pySkipStageWhen",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item ");
	if(pzAuto.handleEvaluateWhen(" wxpzIsLastStage","pzIsLastStage","cell", "visible")) {
	tools.appendString("dataValueRead");
	} else {
	tools.appendString(pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite"));
	}
	tools.appendString("'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_39")) {	field_OpenRuleAdvanced_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014092314595604327281-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","OpenRuleAdvanced");
	pgCells.put("forLabel",".pySkipStageWhen");
	pgCells.put("pyAutoHTML","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	tools.putParamValue("editModeReadonlyCondition", " wxpzIsLastStage");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpzIsLastStage",pxUniqueStreamHash+"_42");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	pxWhenIdentifiers.put("pyReadOnlyWhenId",pxUniqueStreamHash+"_42");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2== rxCaseTypeStages.pxInstanceLockedBy cq",pxUniqueStreamHash+"_41");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_41");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","CaseTypeStages.pxInstanceLockedBy == ''");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Embed-Stage");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_41");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2== rxCaseTypeStages.pxInstanceLockedBy cq", pxUniqueStreamHash+"_41"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pySkipStageWhen",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_43")) {	field_OpenRuleAdvanced_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
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


public int simpleLayoutCell_8( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2!= rxCaseTypeStages.pxInstanceLockedBy cq","CaseTypeStages.pxInstanceLockedBy != \'\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pySkipStageWhen",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item ");
	if(pzAuto.handleEvaluateWhen(" wxpzIsLastStage","pzIsLastStage","cell", "visible")) {
	tools.appendString("dataValueRead");
	} else {
	tools.appendString(pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite"));
	}
	tools.appendString("'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_44")) {	field_OpenRuleAdvanced_2();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014092314595604327281-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","OpenRuleAdvanced");
	pgCells.put("forLabel",".pySkipStageWhen");
	pgCells.put("pyAutoHTML","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	tools.putParamValue("editModeReadonlyCondition", " wxpzIsLastStage");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpzIsLastStage",pxUniqueStreamHash+"_47");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	pxWhenIdentifiers.put("pyReadOnlyWhenId",pxUniqueStreamHash+"_47");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2!= rxCaseTypeStages.pxInstanceLockedBy cq",pxUniqueStreamHash+"_46");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_46");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","CaseTypeStages.pxInstanceLockedBy != ''");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Embed-Stage");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_46");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2!= rxCaseTypeStages.pxInstanceLockedBy cq", pxUniqueStreamHash+"_46"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pySkipStageWhen",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_48")) {	field_OpenRuleAdvanced_2();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
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
public void pzSetExpandParam_7() {
pzSection.getLayout().setExpandParam("SubSectionpzCaseTypeStageEntryCriteriaBBBBBB","",false);
}


public void simpleLayout_4() {
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
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201803230729100800577") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + " content  layout-content-stacked content-stacked " + "'  ");
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
		pg_dlmeta.put("format","stacked");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pg_dlmeta.put("clear","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
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
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
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
	String paramName = "EXPANDEDSubSectionpzCaseTypeStageEntryCriteriaBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","12");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o2== rx.pySkipOrAllowType cqwhen o1! wxpzIsLastStage", pxUniqueStreamHash+"_49");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Inline-block");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_49");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_4();
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
if(pzAuto.handleEvaluateWhen(" o2&& o2== rx.pySkipOrAllowType cqwhen o1! wxpzIsLastStage",".pySkipOrAllowType = \'when\' && !pzIsLastStage", "layout", "visible" )) {pzSetExpandParam_7();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_6();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_4();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_3() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
}
public void pzLayoutBodyWrapper_5() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_4() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
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
	secInfo.put("pxGadgetClass", "PegaGadget-ExpressionBuilder");
	Map<String, String> advanceParams = new HashMap<String, String>();
	advanceParams.put("pxObjClass", "PegaGadget-ExpressionBuilder");
	advanceParams.put("pyShowCustomPages", "true");
	advanceParams.put("pyShowLocalVariables", "false");
	advanceParams.put("pyTargetElementId", "pyExpressionToSkipOrAllow");
	advanceParams.put("pyShowParameters", "true");
	advanceParams.put("pyPromptClass", "");
	advanceParams.put("pyIsLaunchAsOverlay", "false");
	secInfo.put("advanceParams", advanceParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_32","pxExpressionBuilder", secInfo);
}


public void sectionBodyIncludeInCell_2() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
try {
tools.appendString("  ");
{ String newSectionID = "GID_" + (((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique());
 
tools.appendString(" ");
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
								pyAdvParams.putString("pyTargetElementId","pyExpressionToSkipOrAllow");
								pyAdvParams.putString("pyShowParameters","true");
								pyAdvParams.putString("pyPromptClass","");
								pyAdvParams.putString("pyIsLaunchAsOverlay","false");
								pyAdvParams.putString("SectionName","pxExpressionBuilder");
								pyGadgets.add(newSectionID, pyAdvParams);
								 } 
								 } 
								tools.putParamValue("newSectionID",newSectionID); 
} 
tools.appendString(" ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
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
	String sectionName = "pxExpressionBuilder"; 
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
public void pzSetExpandParam_6() {
pzSection.getLayout().setExpandParam("SubSectionCellpzCaseTypeStageEntryCriteria699","",false);
}
public void pzLayout_2() {
pzSetExpandParam_6();
pzLayoutBodyWrapper_3();
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	secInfo.put("pxGadgetClass", "PegaGadget-ExpressionBuilder");
	Map<String, String> advanceParams = new HashMap<String, String>();
	advanceParams.put("pxObjClass", "PegaGadget-ExpressionBuilder");
	advanceParams.put("pyShowCustomPages", "true");
	advanceParams.put("pyShowLocalVariables", "false");
	advanceParams.put("pyTargetElementId", "pyExpressionToSkipOrAllow");
	advanceParams.put("pyShowParameters", "true");
	advanceParams.put("pyPromptClass", "");
	advanceParams.put("pyIsLaunchAsOverlay", "false");
	secInfo.put("advanceParams", advanceParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_28","pxExpressionBuilder", secInfo);
}


public void sectionBodyIncludeInCell_1() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
try {
tools.appendString("  ");
{ String newSectionID = "GID_" + (((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique());
 
tools.appendString(" ");
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
								pyAdvParams.putString("pyTargetElementId","pyExpressionToSkipOrAllow");
								pyAdvParams.putString("pyShowParameters","true");
								pyAdvParams.putString("pyPromptClass","");
								pyAdvParams.putString("pyIsLaunchAsOverlay","false");
								pyAdvParams.putString("SectionName","pxExpressionBuilder");
								pyGadgets.add(newSectionID, pyAdvParams);
								 } 
								 } 
								tools.putParamValue("newSectionID",newSectionID); 
} 
tools.appendString(" ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
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
	String sectionName = "pxExpressionBuilder"; 
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
								pyAdvParams.putString("pyTargetElementId","pyExpressionToSkipOrAllow");
								pyAdvParams.putString("pyShowParameters","true");
								pyAdvParams.putString("pyPromptClass","");
								pyAdvParams.putString("pyIsLaunchAsOverlay","false");
		pyAdvParams.putString("SectionName","pxExpressionBuilder");
		pyGadgets.add(newSectionID, pyAdvParams);
			 } 
				 } 
				tools.putParamValue("newSectionID",newSectionID); } 
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
tools.appendString(" SWP=\".pxInstanceLockedBy\"  SHOW_WHEN=\"CaseTypeStages.pxInstanceLockedBy == ''\"");
if(pzAuto.evaluateWhen("CaseTypeStages.pxInstanceLockedBy == ''",null,true)){
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
		changeTracker.trackValueChanges("CaseTypeStages.pxInstanceLockedBy", -1);
	}
}catch(Exception e){}
}


public int simpleLayoutCell_4( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_3();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pxExpressionBuilder",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + "   flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	pzGenerateAdvParam_1();
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_1();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
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
	expressionId = pxUniqueStreamHash+"_31";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  "CaseTypeStages.pxInstanceLockedBy == ''", expressionId);
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pxExpressionBuilder",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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
public void pzSetExpandParam_5() {
pzSection.getLayout().setExpandParam("SubSectionpzCaseTypeStageEntryCriteriaBBBBB","",false);
}


public void simpleLayout_2() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash27 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash27 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash27 != null && !"".equals(spxUniqueStreamHash27)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash27,pxUniqueStreamHash+"_27");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201805071116400778167") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + "flex  content  layout-content-simple_list content-simple_list " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash27 != null && !"".equals(spxUniqueStreamHash27)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_27");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","simple_list");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isDLChild","true");
		pg_dlmeta.put("lMode","SimpleDiv");
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
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionpzCaseTypeStageEntryCriteriaBBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_2();
	containerComponent.endComponent();
	}
public void pzLayout_3() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_5();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_4();
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
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void field_OpenRule_2() { 
String mode1 = getActionsForCustomControls_1();
tools.putSaveValue("mode1Action",mode1);
String mode2 = getActionsForCustomControls_2();
tools.putSaveValue("mode2Action",mode2);
try {
final ParameterPage params_2 = new ParameterPage();
params_2.putString("NoOpenRule", "-1");
params_2.putString("ApplyTo", "pyClassName");
params_2.putString("Class", "Rule-Obj-Property");
params_2.putString("Width", "100%");
params_2.putString("NoSmartPrompt", "0");
params_2.putString("AJAXTrackID", pega.getValue("param.AJAXTrackID"));
params_2.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_2 = tools.getProperty(".pyExpressionToSkipOrAllow");
	if (currentProperty_2 != null && currentProperty_2.getParentPage().getClassName().equals("Embed-Stage")) {
		final ClipboardProperty propPrevActive_2 = tools.putActive(currentProperty_2);
		final boolean prevInputMode_2 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput((tools.hasInputEnabled()  || tools.hasEditableEnabled()) && !currentProperty_2.hasAttrProtected());
		final PRStackFrame stack_2 = ((PegaAPI) tools).pushStackFrame( params_2, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "OpenRule" );
		try {
			final String currentPropertyRef_2 = currentProperty_2.getReference();
			if (((PegaStreamAPI) tools).isResearchMode()) {
				pega.researchPropertyReference("input", currentPropertyRef_2);
			} else {
				((PegaThread) tools.getThread()).noteInputProperty(currentPropertyRef_2);
				pega.checkIfActivePropertyMissing();
property_Embed_Stage_OpenRule();
			}
		} finally {
			pega.popStackFrame(stack_2, false);
			tools.putActive(propPrevActive_2);
		}
	} else {
if (_jspx_meth_pega_reference__1(pageContext, ".pyExpressionToSkipOrAllow", "input", "OpenRule")) {
	return;
}
	}} catch(Throwable t) {
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
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }{String strStreamName="";String strPropertyTarget ="";String strPageName ="";strStreamName="pzCaseTypeStageEntryCriteria";if(tools.getPrimaryPage() != null){ strPageName = tools.getPrimaryPage().getName();}if(tools.getActive() != null){strPropertyTarget = tools.getActive().getEntryHandle();}Map<String, String> config = new HashMap<String, String>();config.put("pyActivity", "pzRunActionWrapper");config.put("pzActivity", "ReloadCell");config.put("StreamName", strStreamName);config.put("pyPropertyTarget", strPropertyTarget ); config.put("pySubAction","runAct");config.put("inStandardsMode","true");pega.getUIEngine().getUIAction("runActivity", config).register();com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();actionRequest.registerFixedParameter("pyActivity", "ReloadCell"); actionRequest.registerFixedParameter("pyPropertyTarget", strPropertyTarget ); actionRequest.registerFixedParameter("StreamName", strStreamName); actionRequest.registerFixedParameter("pzPrimaryPageName", strPageName); pzAuto.registerActionRequest(actionRequest);}	tools.appendString("[\"postValue\",[\":event\"]");

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
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "-1")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ApplyTo", "pyClassName")) {
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
/**
 * Implements a pega:include tag.
 */private boolean _jspx_meth_pega_include__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:include */
com.pega.pegarules.jsptags.IncludeTag _jspx_th_pega_include_ = (com.pega.pegarules.jsptags.IncludeTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.IncludeTag.class);
_jspx_th_pega_include_.setPageContext(pageContext);
_jspx_th_pega_include_.setParent(mParentTag);
_jspx_th_pega_include_.setName(aName);
int _jspx_eval_pega_include_ = _jspx_th_pega_include_.doStartTag();
if (_jspx_eval_pega_include_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_include_;
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_include_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_include_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_include_);
return false;
}
private void performStream_1() throws Throwable {
if (_jspx_meth_pega_include__1(pageContext, "OpenRuleAdvanced")) {
	return;
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY OPENRULE #20180713T132012.839 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProCom");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "OpenRule");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Embed_Stage_OpenRule
 */
private void property_Embed_Stage_OpenRule() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY OPENRULE #20180713T132012.839 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY OPENRULE #20180713T132012.839 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY OPENRULE #20180713T132012.839 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY OPENRULE #20180713T132012.839 GMT */
}
}


public void field_OpenRule_1() { 
String mode1 = getActionsForCustomControls_1();
tools.putSaveValue("mode1Action",mode1);
String mode2 = getActionsForCustomControls_2();
tools.putSaveValue("mode2Action",mode2);
try {
final ParameterPage params_1 = new ParameterPage();
params_1.putString("NoOpenRule", "-1");
params_1.putString("ApplyTo", "pyClassName");
params_1.putString("Class", "Rule-Obj-Property");
params_1.putString("Width", "100%");
params_1.putString("NoSmartPrompt", "0");
params_1.putString("AJAXTrackID", pega.getValue("param.AJAXTrackID"));
params_1.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_1 = tools.getProperty(".pyExpressionToSkipOrAllow");
	if (currentProperty_1 != null && currentProperty_1.getParentPage().getClassName().equals("Embed-Stage")) {
		final ClipboardProperty propPrevActive_1 = tools.putActive(currentProperty_1);
		final boolean prevInputMode_1 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput((tools.hasInputEnabled()  || tools.hasEditableEnabled()) && !currentProperty_1.hasAttrProtected());
		final PRStackFrame stack_1 = ((PegaAPI) tools).pushStackFrame( params_1, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "OpenRule" );
		try {
			final String currentPropertyRef_1 = currentProperty_1.getReference();
			if (((PegaStreamAPI) tools).isResearchMode()) {
				pega.researchPropertyReference("input", currentPropertyRef_1);
			} else {
				((PegaThread) tools.getThread()).noteInputProperty(currentPropertyRef_1);
				pega.checkIfActivePropertyMissing();
property_Embed_Stage_OpenRule();
			}
		} finally {
			pega.popStackFrame(stack_1, false);
			tools.putActive(propPrevActive_1);
		}
	} else {
if (_jspx_meth_pega_reference__1(pageContext, ".pyExpressionToSkipOrAllow", "input", "OpenRule")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("OpenRule",".pyExpressionToSkipOrAllow",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_21")) {	field_OpenRule_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20180327083238040014643-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","OpenRule");
	pgCells.put("forLabel",".pyExpressionToSkipOrAllow");
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
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("OpenRule",".pyExpressionToSkipOrAllow",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_24")) {	field_OpenRule_2();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();labelName = "";
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
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpzCaseTypeStageEntryCriteriaBBBB","",false);
}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash20 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash20 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash20 != null && !"".equals(spxUniqueStreamHash20)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash20,pxUniqueStreamHash+"_20");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201805071116400778253") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + "flex  content  layout-content-simple_list content-simple_list " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash20 != null && !"".equals(spxUniqueStreamHash20)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_20");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","simple_list");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isDLChild","true");
		pg_dlmeta.put("lMode","SimpleDiv");
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
	public void pzLayoutContainer_1() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionpzCaseTypeStageEntryCriteriaBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
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
public void pzLayout_1() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_4();
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


public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout column-1 remove-top-spacing remove-left-spacing   '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_1();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	pgCells.put("partialClass","column-1 remove-top-spacing remove-left-spacing");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isCL","true");
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


public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout column-2 remove-bottom-spacing remove-right-spacing   '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_3();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","column-2 remove-bottom-spacing remove-right-spacing");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isCL","true");
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
	pzLayout_3();
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
pzSection.getLayout().setExpandParam("SubSectionpzCaseTypeStageEntryCriteriaBBB","",false);
}


public void simpleLayout_3() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash19 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash19 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash19 != null && !"".equals(spxUniqueStreamHash19)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash19,pxUniqueStreamHash+"_19");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201805071116400778156") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICCOLUMN','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + "flex  content  two-col-main-sidebar two-col-main-sidebar_field_and_icon " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash19 != null && !"".equals(spxUniqueStreamHash19)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_19");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","two-col-main-sidebar two-col-main-sidebar_field_and_icon");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICCOLUMN','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isDLChild","true");
		pg_dlmeta.put("clear","false");
		pg_dlmeta.put("isCL","true");
		pg_dlmeta.put("lMode","SimpleDiv");
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
		index=simpleLayoutCell_5(index);
	}else{
		index=simpleLayoutTemplateCell_5(index);
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
	public void pzLayoutContainer_3() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionpzCaseTypeStageEntryCriteriaBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICCOLUMN','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2== rx.pySkipOrAllowType cqexpression", pxUniqueStreamHash+"_35");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_35");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_3();
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
if(pzAuto.handleEvaluateWhen(" o2== rx.pySkipOrAllowType cqexpression",".pySkipOrAllowType = \'expression\'", "layout", "visible" )) {pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_5();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3();
tools.putParamValue("pyInlineStyleSec","");
}
}


public int simpleLayoutCell_6( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2== rx.pySkipOrAllowType cqexpression",".pySkipOrAllowType = \'expression\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-top-spacing remove-left-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_4();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-top-spacing remove-left-spacing flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2== rx.pySkipOrAllowType cqexpression",pxUniqueStreamHash+"_37");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_37");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName",".pySkipOrAllowType = 'expression'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Embed-Stage");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_37");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2== rx.pySkipOrAllowType cqexpression", pxUniqueStreamHash+"_37"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_4();
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
	index++;
	return index;
}


public int simpleLayoutCell_9( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== rx.pySkipOrAllowType cqwhen o1! wxpzIsLastStage",".pySkipOrAllowType = \'when\' && !pzIsLastStage","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-bottom-spacing remove-right-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_5();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-bottom-spacing remove-right-spacing flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== rx.pySkipOrAllowType cqwhen o1! wxpzIsLastStage",pxUniqueStreamHash+"_51");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_51");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName",".pySkipOrAllowType = 'when' && !pzIsLastStage");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Embed-Stage");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_51");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== rx.pySkipOrAllowType cqwhen o1! wxpzIsLastStage", pxUniqueStreamHash+"_51"); 
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
	index++;
	return index;
}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzCaseTypeStageEntryCriteriaBB","",false);
}


public void simpleLayout_5() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash16 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash16 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash16 != null && !"".equals(spxUniqueStreamHash16)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash16,pxUniqueStreamHash+"_16");
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
	refreshAttributes += " RWP=\".pySkipOrAllowType\" RW=\".pySkipOrAllowType Changes\" ";
	
	String strDTransform = "";
	strDTransform = "";
	try{
		if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
			com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pySkipOrAllowType"), -1);
		}
	}catch(Exception e){}
	IUIComponent cc_dl = null;
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201804030234190326221") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + "flex  content  layout-content-stacked content-stacked " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		expressionId = pxUniqueStreamHash+"_17";
		try{
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  ".pySkipOrAllowType Changes", expressionId);
		expressionId = expression.getId();
		}
		catch(ClassCastException e){
		expressionId = "";
		}
		if(StringUtils.isBlank(expressionId)) {
			expressionId = pxUniqueStreamHash+"_18";
		}
			expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  ".pySkipOrAllowType != 'never'",expressionId);
			if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash16 != null && !"".equals(spxUniqueStreamHash16)){
			pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_16");
			}
			if(!StringUtils.isBlank(expressionId)) {
			pg_dlmeta.put("pyExpressionId",expressionId);
			}
			if(!"".equals(strMethodName))
			pg_dlmeta.put("methodnm",strMethodName);
			pg_dlmeta.put("format","stacked");
			String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
			if(!inspectorData.equals("\"\"")) {
			pg_dlmeta.put("liveUI",inspectorData);
			}
			pg_dlmeta.put("isDLChild","true");
			pg_dlmeta.put("clear","false");
			pg_dlmeta.put("lMode","SimpleDiv");
			pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
			cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
			}
			int index = 1;
			if(currentTemplatingStatus != 'Y') {
			index=simpleLayoutCell_6(index);
	}else{
			index=simpleLayoutTemplateCell_6(index);
	}
			if(currentTemplatingStatus != 'Y') {
			index=simpleLayoutCell_9(index);
	}else{
			index=simpleLayoutTemplateCell_9(index);
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
		public void pzLayoutContainer_5() {
		IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		expressionId = pxUniqueStreamHash+"_52";
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen", ".pySkipOrAllowType != \'never\'", expressionId);
		expressionId = expression.getId();
		String expressionId_BV = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
		if(!StringUtils.isBlank(expressionId_BV)) {
			metadataPage.put("expressionId_BV",expressionId_BV);
		}
		String paramName = "EXPANDEDSubSectionpzCaseTypeStageEntryCriteriaBB";
		String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
		if(!inspectorLayoutData.isEmpty()) {
		metadataPage.put("liveUI", inspectorLayoutData);
		}
		String pyPrefix = null;
		IUIComponent containerComponent = pzAuto.getUIComponent();
		metadataPage.put("dlChild","true");
		metadataPage.put("lMode","SimpleDiv");
		containerComponent.beginComponent("pxLayoutContainer",metadataPage);
		pzLayoutBody_5();
		containerComponent.endComponent();
		}
public void pzLayout_6() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_7();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_5();
tools.putParamValue("pyInlineStyleSec","");
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
if(currentTemplatingStatus =='N')
tools.appendString(" SWP=\".pySkipOrAllowType\"  SHOW_WHEN=\".pySkipOrAllowType != 'never'\"");
if(pzAuto.evaluateWhen(".pySkipOrAllowType != 'never'",null,true)){
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
		changeTracker.trackValueChanges(tools.getStepPage().getReference()+".pySkipOrAllowType", -1);
	}
}catch(Exception e){}
}
public void inclFormattedVal_2(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {if (isSecuredProp) { tools.putParamValue("proSecurity_isSecuredProp", isSecuredProp);tools.putParamValue("proSecurity_activePropValue", activePropValue);}
		pega.checkIfActivePropertyMissing();
		tools.appendString(pega_uiengine_formatter.pxFormatText(pega_uiengine_pzcontrol.pzGetCaptionValue("datapage","null","D_pzSkipOrAllowOptions","","","D_pzSkipOrAllowOptions:skiporallow$skip",".pyPromptValue",".pyStandardValue",true,(PegaStreamAPI)tools),false,"","",true,"caption"));
		if("".equals(pega_uiengine_pzcontrol.pzGetCaptionValue("datapage","null","D_pzSkipOrAllowOptions","","","D_pzSkipOrAllowOptions:skiporallow$skip",".pyPromptValue",".pyStandardValue",true,(PegaStreamAPI)tools)) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals(pega_uiengine_pzcontrol.pzGetCaptionValue("datapage","null","D_pzSkipOrAllowOptions","","","D_pzSkipOrAllowOptions:skiporallow$skip",".pyPromptValue",".pyStandardValue",true,(PegaStreamAPI)tools)) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}if (isSecuredProp) { tools.putParamValue("proSecurity_isSecuredProp", "");tools.putParamValue("proSecurity_activePropValue", "");}
}


public void drodownButtonIncludes_1() {
if (pzAuto.doOnlyOnce("pzDropdown")) {
pzAuto.emitIncludeStreamReference("pzDropdownButtonIncludes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
}
public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }{String strStreamName="";String strPropertyTarget ="";String strPageName ="";strStreamName="pzCaseTypeStageEntryCriteria";if(tools.getPrimaryPage() != null){ strPageName = tools.getPrimaryPage().getName();}if(tools.getActive() != null){strPropertyTarget = tools.getActive().getEntryHandle();}com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();actionRequest.registerFixedParameter("pyActivity", "ReloadCell"); actionRequest.registerFixedParameter("pyPropertyTarget", strPropertyTarget ); actionRequest.registerFixedParameter("StreamName", strStreamName); actionRequest.registerFixedParameter("pzPrimaryPageName", strPageName); pzAuto.registerActionRequest(actionRequest);}	tools.appendString("[\"postValue\",[\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}	String returnString = actionsStringBuilder.toString();
	tools.popStreamBody();
	return returnString;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")){
inclCalVal_1("pxDropdown","NF","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("2014092314595604327281",true));
	cellPage.put("pyValue",".pySkipOrAllowType");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pySkipOrAllowType");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pySkipOrAllowType", ".pyCaption");
	boolean is4Offline = pega_uiengine_offlinesupport.pzIsForOfflineTemplate();
	if(is4Offline) {
	String defaultValue="";
	defaultValue = "never";
	modePage1.put("defaultValue","never");
	}
	modePage1.put("pyHasNoSelection","false");
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, pyStringType,pegaValidation.toString());
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addErrors(".pySkipOrAllowType",pxUniqueStreamHash+"_8");
	IUIComponentMetadata pxErrorIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxErrorIdentifiers",pxErrorIdentifiers);
	pxErrorIdentifiers.put("pyErrorId",pxUniqueStreamHash+"_8");
	modePage1.put("clintValidAttrs",clientValidationAttributes);
	modePage1.put("pyID","pySkipOrAllowType");
	modePage1.put("pyControlLoadMode","auto");
	modePage1.put("pyEnableGrouping","false");
	modePage1.put("pyGroupOrder","asc");
	Map<String, Object> listProperties = new HashMap<String, Object>();
	if(listProperties.containsKey(".pyPromptValue")){
	Set<String> currentPropFieldNames = (Set<String>)listProperties.get(".pyPromptValue");
	currentPropFieldNames.add("pyCaption");
	listProperties.put(".pyPromptValue",currentPropFieldNames);
	}else{
	Set<String> fieldNames = new HashSet<String>();
	fieldNames.add("pyCaption");
	listProperties.put(".pyPromptValue",fieldNames);
	}
	if(listProperties.containsKey(".pyStandardValue")){
	Set<String> currentPropFieldNames = (Set<String>)listProperties.get(".pyStandardValue");
	listProperties.put(".pyStandardValue",currentPropFieldNames);
	}else{
	Set<String> fieldNames = new HashSet<String>();
	listProperties.put(".pyStandardValue",fieldNames);
	}
	if(listProperties.containsKey(".pyPromptValue")){
	Set<String> currentPropFieldNames = (Set<String>)listProperties.get(".pyPromptValue");
	currentPropFieldNames.add("pyTooltip");
	listProperties.put(".pyPromptValue",currentPropFieldNames);
	}else{
	Set<String> fieldNames = new HashSet<String>();
	fieldNames.add("pyTooltip");
	listProperties.put(".pyPromptValue",fieldNames);
	}
	modePage1.put("pyResultsUniqueID",pxUniqueStreamHash+"_9");
	tools.putParamValue("skiporallow", 
	"skip"
	);
	Map<String, String> sourceDPParams = new HashMap<String, String>();
	sourceDPParams.put("skiporallow", "skip");
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
	tools.findPage("D_pzSkipOrAllowOptions");
	}
	tools.putParamValue("bListOptionsLocalize","true");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadDataPage("D_pzSkipOrAllowOptions", listProperties, pxUniqueStreamHash+"_9", sourceDPParams);
	tools.putParamValue("bListOptionsLocalize","");
	IUIComponentMetadata pyDataPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pyListDataSource = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pyDataPageParams = null;  
	pyDataPageParams = pzAuto.getUIComponentRuntime().createMetadata();  
	pyDataPageParams.put("pyName","skiporallow");
	pyDataPageParams.put("pyValue","skip");
	pyDataPage.addMetadataInArray("pyDataPageParams",pyDataPageParams);
	pyListDataSource.putMetadata("pyDataPage",pyDataPage);
	modePage1.putMetadata("pyListDataSource",pyListDataSource);
	String pageName = "D_pzSkipOrAllowOptions";
	String dataPageName = "D_pzSkipOrAllowOptions";
	if(tools.findPage("D_pzSkipOrAllowOptions") != null){
	pageName = tools.findPage("D_pzSkipOrAllowOptions").getReference();
	}
	modePage1.put("pySourceName",dataPageName);
	modePage1.put("pyHashedDataPage",pageName);
	pageName = "D_pzSkipOrAllowOptions";
	modePage1.put("tooltip",".pyPromptValue");
	modePage1.put("pyGroupLabel","");
	modePage1.put("pyValue",".pyStandardValue");
	modePage1.put("pyPrompt",".pyPromptValue");
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	modePage1.put("pySpecifySize","custom");
	modePage1.put("pyWidth","100");
	modePage1.put("pyWidthUnits","%");
	modePage1.put("styleOther","standard");
	String spxUniqueStreamHash10 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash10 != null && !"".equals(spxUniqueStreamHash10)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash10,pxUniqueStreamHash+"_10");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_10");
	}
	modePage2.put("pySourceName","D_pzSkipOrAllowOptions");
	modePage2.put("pyPrompt",".pyPromptValue");
	modePage2.put("pyValue",".pyStandardValue");
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("2014092314595604327281",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pySkipOrAllowType");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pySkipOrAllowType", ".pyCaption");
	pyValueR = ".pySkipOrAllowType";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pySkipOrAllowType");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pySkipOrAllowType", ".pyCaption");
	pyValueOrig = ".pySkipOrAllowType";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","caption");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","none");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyShowValueAs","");
	String spxUniqueStreamHash11 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash11 != null && !"".equals(spxUniqueStreamHash11)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash11,pxUniqueStreamHash+"_11");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_11");
	}
	
			 Boolean pyUseAccessibleDropdown = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
	modePage1.put("pyUseAccessibleDropdown",pyUseAccessibleDropdown+"");
	modePage1.put("hasChangeEvent","true");
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
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();boolean beginNonTemplate = true;if(bOptimizedMarkup){beginNonTemplate = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_12");}if(beginNonTemplate){			HashStringMap params = new HashStringMap();
			tools.putParamValue("skiporallow", 
			"skip"
			);
			String pageName ="D_pzSkipOrAllowOptions";
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

		String strActiveValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);			String strValue = isSecuredProp ? activePropValue : tools.getProperty(ddPropRef).getStringValue();
			String displayString ="";
			String valueString ="";
			String selected ="";
			String groupbyString ="";
			boolean isAccessible = true && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
			if(!isAccessible) {
				tools.appendString("<select data-ctl='[\"Dropdown\"]' ");
				tools.appendString(" " + pzCell.getTestIdIfEnabled("2014092314595604327281") + " ");
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
tools.appendString(" data-bindprops='value' ");			tools.appendString(" data-bindDefaultValue='never'");
} else{			tools.appendString(ddPropEntryHandle);

		dropdownName=ddPropEntryHandle;			tools.appendString("' ");
}
		tools.appendString("aria-describedby='"+dropdownName+"Error'");			tools.appendString(" ");
			pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
			tools.appendString(" ");

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }{String strStreamName="";String strPropertyTarget ="";String strPageName ="";strStreamName="pzCaseTypeStageEntryCriteria";if(tools.getPrimaryPage() != null){ strPageName = tools.getPrimaryPage().getName();}if(tools.getActive() != null){strPropertyTarget = tools.getActive().getEntryHandle();}com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();actionRequest.registerFixedParameter("pyActivity", "ReloadCell"); actionRequest.registerFixedParameter("pyPropertyTarget", strPropertyTarget ); actionRequest.registerFixedParameter("StreamName", strStreamName); actionRequest.registerFixedParameter("pzPrimaryPageName", strPageName); pzAuto.registerActionRequest(actionRequest);}			tools.appendString("[\"postValue\",[\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}			if(isAccessible) {
				tools.appendString(" value='");
				if("".equals(strValue) && cbpResults != null && cbpResults.size() > 0) {
					String pyValueProp = ".pyStandardValue";
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
			tools.appendString(" " + pzCell.getTestIdIfEnabled("2014092314595604327281") + " ");
			tools.appendString(styleAttribute + disabled_ctrl + " id='");
			tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
		tools.appendString("'");
		}
		tools.appendString(" style='width:100%' >");
		if (cbpResults != null && cbpResults.size() > 0) {
			int iListSize = cbpResults.size();
			java.util.Iterator resIter = cbpResults.iterator();
			while(resIter.hasNext()) {
				ClipboardPage cbpRow = ((ClipboardProperty)resIter.next()).getPageValue();
				displayString = cbpRow.getStringIfPresent(".pyPromptValue");
				valueString = cbpRow.getStringIfPresent(".pyStandardValue");
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
			String titleString = cbpRow.getString(".pyPromptValue");
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
	pega_uiengine_pzcontrol.pzAddMessages(tools,"SIMPLELAYOUT");
}if(bOptimizedMarkup){pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}}

		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("2014092314595604327281") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_13")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
		metadata.put("cellInfo", "Skip stage");
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
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDropdown",".pySkipOrAllowType",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("2014092314595604327281-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pySkipOrAllowType"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","Skip stage") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("2014092314595604327281-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pySkipOrAllowType"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","Skip stage") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDropdown_1(".pySkipOrAllowType",0,"","","Text");
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014092314595604327281-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDropdown");
	pgCells.put("forLabel",".pySkipOrAllowType");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDropdown",".pySkipOrAllowType",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDropdown_1(".pySkipOrAllowType",0,"","","Text");labelName = "Skip stage";
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


public int simpleLayoutCell_10( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_2();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner '>");
	pzLayout_6();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
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
	expressionId = pxUniqueStreamHash+"_55";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  ".pySkipOrAllowType != 'never'", expressionId);
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
	pzLayout_6();
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
pzSection.getLayout().setExpandParam("SubSectionpzCaseTypeStageEntryCriteriaB","",false);
}


public void simpleLayout_6() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash5 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash5 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash5 != null && !"".equals(spxUniqueStreamHash5)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash5,pxUniqueStreamHash+"_5");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201803230729100800577") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + " content  layout-content-default content-default " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash5 != null && !"".equals(spxUniqueStreamHash5)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_5");
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
		index=simpleLayoutCell_10(index);
	}else{
		index=simpleLayoutTemplateCell_10(index);
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
	String paramName = "EXPANDEDSubSectionpzCaseTypeStageEntryCriteriaB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-default");
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o1! wxpzIsAlternateStage o1! wxpzIsLastStage", pxUniqueStreamHash+"_56");metadataPage.put("lMode","Inline-block");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_56");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_6();
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
if(pzAuto.handleEvaluateWhen(" o2&& o1! wxpzIsAlternateStage o1! wxpzIsLastStage","!pzIsAlternateStage && !pzIsLastStage", "layout", "visible" )) {pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_8();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_6();
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
	if(pzAuto.handleEvaluateWhen(" o2== rx.pySkipOrAllowType cq",".pySkipOrAllowType", "cell", "active" )) {
		 tools.getProperty(".pySkipOrAllowType").setValue("never");if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){String tempDefault=tools.getProperty(".pySkipOrAllowType").toString();
		 tools.getProperty(".pySkipOrAllowType").setValue("");pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDefaultValue(".pySkipOrAllowType",tempDefault);}
}
	tools.getInfEngUtils().forwardChain(tools);
	}}
public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_1();gridDoPartialRefresh_1();gridLastRow_1();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxIcon_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzCaseTypeStageEntryCriteria_"+ referenceString+ "_39'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
			repeatIndx = tools.getSaveValue("index");
			if(repeatIndx != null && repeatIndx.matches("^[0-9]+$"))
				repeatIndx = PRNumberFormat.format(null,"",false, null, Integer.parseInt(repeatIndx));
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Delete row\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
			if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, "CaseTypeStages.pxInstanceLockedBy != '' || .pyCheckedOutOrLocked != ''", null, false)){
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141230054119036922804") + "  ");
		tools.appendString("onclick_func='pd(event);' href='' ");
		tools.appendString(" data-ctl='Icon' "); tools.appendString(" IsSprite='true' href_original='' class='cursordefault' disabled='disabled' style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,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");
		}
		else{
		
		tools.appendString("webwb/pygridicons_12892877635.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-128px -32px; width:16px; height:16px;' ");
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-128px -16px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
				tools.appendString(" disabled ");
			} else {
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141230054119036922804") + "  ");
		tools.appendString("onclick='pd(event);' href='' ");
		tools.appendString("tabindex='0' ");
		tools.appendString("IsSprite='true' data-ctl='Icon' "); tools.appendString("style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,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");
		}
		else{
		
		tools.appendString("webwb/pygridicons_12892877635.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-128px top; width:16px; height:16px;' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-128px -16px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
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

public void repeatingDataCell_3() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox", ".pySections(5).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:38px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxIcon_2();
									tools.appendString("</DIV>"); } else { pxIcon_2();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxIcon_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzCaseTypeStageEntryCriteria_"+ referenceString+ "_39'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
			repeatIndx = tools.getSaveValue("index");
			if(repeatIndx != null && repeatIndx.matches("^[0-9]+$"))
				repeatIndx = PRNumberFormat.format(null,"",false, null, Integer.parseInt(repeatIndx));
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Delete row\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
			if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, "CaseTypeStages.pxInstanceLockedBy != '' || .pyCheckedOutOrLocked != ''", null, false)){
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141230054119036922804") + "  ");
		tools.appendString("onclick_func='pd(event);' href='' ");
		tools.appendString(" data-ctl='Icon' "); tools.appendString(" IsSprite='true' href_original='' class='cursordefault' disabled='disabled' style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMAAAABACAYAAABMbHjfAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAABi1SURBVHhe5Z1r7DfFVcdpBcodg0IFAmhBTblDhZqG6BsQuQaJxoI2RkQubeANWB4SsBaoWBJuchFUrHeu0QAhJRAgpPCCwAsghPv9Um4BEuAFJSGP388+c349e/5n97e7s38gcZLPf2bOOTM7Z3+zuzOzs8+z3np/95DnC+J3xNni38T/lpg8cvStMmvXrq1CddxaS1bvFFTXUv+TMp5dxV+JfxWUJSaPPNrOxb+E/I7iL8UV4sbC5UWGzttGX2r991wn/O9EPrPzfPr9z1X2K+Ji8UPBwbYS65eYPHL02A1ugGx6Oyj6WrJ6x6J6BvsfygF2J4trxCFi6yIjJo8cPTIrMxecA2LqPkn8p/gjsVORbSS+Iv5YoPuO2FA05WfyP8Pa1ZWPVPU/pfHpT8Q/Ci4cYvIb+vZGrKJtBXerQ0u+C/TYYd/Isko9sll2AdRSfQGojoX/md5AX+y2dTKg4/2N2LjkI8jRY5fp+zhM/EBs6WQeOhYd5VyxRnS1AdCdKaiPMuZDrf9AB21uSAPB3spW9T/FXxIXiDMETzl8IyaP/EvW3giFeaxcJDjRdqA+sMO+eRz5ynb/3h0rkM2tmdyXq4H6M/lQih+N/5k+gl2xb4YDihnecIffRJA3kPk8nQ/Z2OHQH4qrBWV/vcg8dCaeLnTsFUOEBGywpYzla/w3aMc2Lt8HdtiTXhy/5Jexov8p5k6/xrfTkJyL4NhMBxj8rvBXo+eqRAbYU65VWencdPhltMrVoDYsHWJlcqP48cNM1wX2lCtpxvi/L0h77Af2MBzCPsr74AL4M/E1wXj4IOH1HOffRbwA+8CWuhgm1fpvIKMtQ+HOTLnq/qeY4c5Ovo1DoTCPZsZY/gAGDc3k2FOuVRkdOyKbpsNHfLkaqD+TGwP0jf9Bdpn4akl/lXzQN/6X9H+IXxakPdm5Y05Ax4tyD2P23xYnir8WPxLc4dDx6Kdtfj5xg/AdC+LTJ4N5AhPjWv89mc8Z3q66/ylmzL++b2OR7y8Y7tliAOn9WjYS/Jf4RWGVe7oawMSk+SF9ZRmyqRqiLGNZ/QP0jf9B9huCjndEiX8z6Bv/S5pzZJ2Rjkc+Yh0SO34s0pFfEH8guKDOEhx7b8EEdjFpFVwg3xXcQWmHr2MMvypYKar134OvUZbh7ar7n2KeADuGNn5LMHT8huCJB6SRfWthp0w8yD8UWQS52Sx+SH/QDNlMvgCGlF1mM1UvORMu/F4xMZSs8b+k53gCMIn7vmAiu5jg9cD491TRNUQYQ63/Hu+zpWPcl4bR/U/xn4ozXPv2E5ybTU3mdJsW3f5NXonP7RNgSNloQ34ZwT67AzJR5c73eyXeNej9HXDMHAC7bA7A0iR3dZ4CUZdBPZx/nhCZfgy1/nu8z5aOcUzP8QSwVaDvlvzfim9YeyPoxA+atBLVY7DVQvUPugCMLn0mN6TPxsB/L3Yp6V3IB70fA9sqUFx+jC+oulaBdhB0MoY23Nm4e50gzhc82png2goJei4Wxui2Hs6d8ddKegq1/nt8f7F0jGN6lv6ndPMeoKQpt4npItLxW9zQpJWonoWvFqp/6QWwjGV1FD9qV0GGvgfI7v5/Lhj7/5b4Z/E9QYdn7M/aPxNgVoG46zV3OcHFYuWPF990+S6om47hYQI9h/8GdcZ0jGN69v4nOX71XQCcvxubtBLV67Bzofo4Mb1k5fpYVkb6hf+ZPoJdsffr4NyZ7U0wwxPmBMiIySOn83OnZ1XFysGF4i/ElWLnIvOwDMrFwxOFdHPeHSxlTl0G5ZzO4b9BfTEd45ievf9JzmrP4CEQVL2JWy1U/6o/AaD4Q4cY8iYUu+xNKDC8oaNzjpikEZO3YQ+dP14E14p/Eps7mYdO/99iXyeLTH0R1pwbxXP5P+UCgFn7n+Qsfw6eBBtxL8YvCe5ixOSRr9iLUUtsoEf66gtgKDrWYP9DubHEi+AWwR0p2hkMg7JVJg/tZAWJjs0PnNkAd35sbCvE4vwqPYf/Uy8AmNT/fFs80vllUIagQJrO31oG9XB34GDsvmPjFA0l7tyNJ7CZjG90ZJl+bnS8pf4nZabgLwImtH6dfyp0Fr8ZjnV+ZMAkmXkCOr8ZrnV+la/1H/u+CxDQY5fpRve/2B6P9F8X8UVYc+df2EhQC42sIatzMN6Zz4KsTQOh87PakulqYFWJiTGrQ/9TYH6BDJ23/VHm0xhCfdyls984YtsgqsnaNIZY4RfFMYLH8mviZ+KnJY8cfSxTy9paolNTUV1L/U/KeA4QjOlfFZQlJo882s7FSyG/m7hEPCk+Fh+Kx4psd+Ftoy+1/nveE/53Ip/ZeUb3v9iesfjKWHZ7SPxE8LjcTvCoJCaPHD12gxsgG0W5DtDXEuucguoZ7H8oBxsIthW8KBiGsBWXssTkkaPHzsrMBeeAmOPx4cubgnE+nZ3jMeTYR7C9Ah1j4MVy7Uz+Z1i7uvKRqv6nND7xNv1ZwYVDTH5j396IVcTyG3erb5d8F+ixWyzXZZV6ZKMo14HVU4GqyeseiupY+J/pDfTFbmcnAzrej0XXSg5y9Nhl+j4Ys98l2EaR6elYdJQ7BePcrjYAupsE9VHGfKj1H+igzQ1pINhb2ar+p5jJ/f3iesETEN+IySPvficgJY+VBwUn2g7UB3bYN48jX1m261M2azO5L1cD9UfZGIofjf+ZPoJdsW+GA4oZ3rwgthDkDWQ+T+dDNnY4xEcuTwueIrwljno6E08XOna2SBHBBlvKkK/136AdvJPwsi6ww550df9TfI5oXmxFJOelWPPWOgODY4W/Gj1PJTLAnnKtykrnpsMvo1WuBrVBUa6DAfrG/0zXBfaUK2nG+GxdIO2xH9jDcAj7KO+DC4BtEXxLwHj4OOH1HOd1ES/APrClLoZJtf4byGjLUO4TlKvuf4oZ7uzu2zgUCvNoZozlD2DQ0EyOPeValdGxI7JpOnzEl6uB+qPMM0Df+B9kj4rmTSKxeCToG/9L+g0RV1cgO3fMCZjcRbmHMftRguVRVkxeFoxl0fHop22s6jRDGPG+8B0LeFr4OjOYJzAxrvXfk/mc4e2q+59ixvwb+jYWOdu57xYfFEgf3rKR4G3xZWGVe7oawMSEO0jrgBmyUZTr5mBZ/QP0jf9BxptEOt4pJf560Df+lzTnyDojHY98xDokdvxYpCOs158uuKBuFmx3PlCw49Pv/dlM8C8sMLalHb6OMewpWB2q9d+Dr1GW4e2q+59ingC7hTaeJxg6Hi144gFpZOct7JSJB3miyCLIzWbxQ/qDZshGUa5bxpCyy2ym6iVnqwB+r5gYStb4X9JzPAGYxN0u7hDsvoz6CON49hex1JnpxyA32v6B5EP993ifLR3jvjSM7n+KeQve7O4s+cMFw6fWNu+iY+s15+2IJq/E5/YJMKRstCG/jGCf3QGZqHLn4+UR8QFB7++AY+YA2GVzAF7Zc1fnKRB1GdTD+Y/fB0+h1n+P99nSMY7pOZ4Atgp0XcnfI4629kbQibubtBLVY7DVQvUrynUGNkbUwbI6pM/GwA+Lr5U0H6M/HPR+DGyrQHH5Mb6g6loFYqMcnYyxP+v27Ha8VNwrnhFMcG2FhDsf6/iPCFsP5864V0lPodZ/j+8vlo5xTM/S/5Ru3gOUNOW2MF1EOn6L95u0EtWz8NVC9SvKdUNZVkfxo3YVZOh7gOzuz7aA0wQ7HZ8Xtwk6PC+vWPtnAswqEDsgWTnhSeH327BBjL0yvs4M6qZjeJhAz+G/QZ0xHeOYnr3/SY5ffRcA86gPmrQS1euwc6H6ODG9xDLLWFZG+jnWwf2bYP41B+YE3K2JySOn878i4s7PBwTfBDwusi3PLINy8fBE4d+4iWv9LGVOXQblnM7hv0F9MR3jmJ69/0nOas/gIRBUvYlbLVS/olw3lCF1FH/oEEPehDKJzd6EAsMbOjrniEkaMXkb9tD540XwrnhO8MWXyTx0+nfEwU4WmfoiTC7M6v+UCwBm7X+Ss/zJRHfQJNiIezG2F9zFiMkjX7EXo5bYQI/0inLd3OhYg/0P5cYSL4JPBHekaGfwr6hlq0we2slWCDp21z+hCNz5sbGtEHJhVv+nXgAwqf/5tnik88ugDEGBNMOq1jKoh8eK7cZ7S9BQ4s7deAKbyVhDMpbp50bHW+q/2a5Zs6ZBsin4i4AJrV/nnwqdxW+G26PIgEky8wR0fjPcWvNjrP+GZB7s+y5AQI9dphvd/2J7PNIfKRgOsSMWSDd3/oWNBLXQyMnYD1CLd+rTwI4rH6ZC52e1JdPVwKoS38yyOvRRgfkFsvgvUrxce/5Cfdyl0985YNsgqsnaNIbFD1n4ojhG3CJeEz8TPy155OhbZbJGjUF1cBHUkjo3FtWz1H9nu8J/5Q8Q14pXBWWJycelz9lQ3a3lVuV3E5eIJ8XH4kPxWJGt+B5Asoax/huxPkO27wn/G6XfA0juGd3/YnvG4iv7inhI/ER8U2wnNiwxeeTosRvUgGLT2UGdvpa0/jGojsH+F/uG8iNuIK4QL4qTxI6CssTkkaNf8T2AZLU0/guOd7l4U5wpdhe0a1OxjzhLoLtKbCxiPaP8d+etC2tXVz5S1f+Uxqfvi2cFFw4x+f7vAWQAOwvuVt8u+S7QY4d9I8sqNYpNZwe1OiqpvgBUfuF/pjfQF7uF/wU63o/F5k7mQY4eu0zfx3fEXWJrJ/PgPx3lTnGj6GoDoLtJUB9lTD7afycz6KC0ZSjYW9mq/qd4E3G/uF7wBMQ3YvLIu78HkJLHyoOCE20H6gM77JvHka+s6CM4u0Luy02l1NXU36PvPZ50C/8zfQS7Ym+PY4Y9L4gtSt5A5vN0PmTYe/kyCE8LniL7iajHf54udOwvFFkf2GBLGfKT/S95g3bs5PJ9YGf9orr/KT5HpN8DSH6D6P4eQMpjhb8aPU8lMsCecq3Kig7HltEqNxXq6atvmR6ka/zPdF1gX8qRZox/Qkl7muMGGA5hH+V9EM4XhwjGw8cJr+c4r4t4AfaBLXUxTJrsf0kbyGjLUO4TlKvuf4oZ7kz7HkAFeTQzxvIHMGhoJseecq3KnN6T1uHLTaXU1dQ/RQ/SNf4H2aOi2Q9PLFr74bEXjf/iDbFDSXsyv5kTMLmLcg9j9qPEZeJWwUoNY1l0PPpp25XChjDvC47l4Wnh68xgnsDEeLL/Je3JfM7wdtX9TzFj/g19G4v8CHG3+KBAuv09gARviy8Lq9zT1QAmJtxBWgeMFNumjkzfRynbkOmh6DvrX6YH6Rr/g2x/Qcc7pcSt/fDKL/wX1G+dkY5HPmIdEjt+LNKR9cXpggvqZnGqOFDsLTYSZreZuE4wtqUdvo4x7ClYHZrsf0l78DXKMrxddf9TzBOg9T2A8ucJho5HC554QBrZz1+EKRMP8kSRRZCbzeKH9AeNFFvKpvo+hpSNNiUfafQRV4eitO6T0YkVE0PJfEee4wnAJO52cYfYpcj6YBx/jWCpM9OPIT3Hki31v6Q93mdLx7gvDaP7n+JzxeJ7AKUPFwyfVmyFQCY4b+u2QijxeX4C9Jb1Ng7yy/B1ZHdAJqrc+Y4vcWs/vPL+CTBmDoBdNge4WnBX5ykQdRnUw/EPcrKpTPa/pD3eZ0vHOKbneALYKlDzPYDie0TnZjh0Yt1mOCWqx2BdOPtU30cp1xw/04OzMUzmSeWujmwM/LBo9sMTkw/6hf/CVoHi8uNLId+1CrSroJMx9mfd/jBxqbhXPCOY4NoKCXc+1vEfEbYezp1xr5KewmT/S9rjz7WlYxzTs/Q/pZv3ACVNuc7t0NLxW6z7HkCJ6ln4HLi6PekJ6CuT1NnU4eUe6SavglBvYeh7gOzuf4E4TRwqnhe3CTo8L69Y+2cCzCrQtoKVE54UXCxW/mJxtst3Qd2cCw8T6Mn+l7SnOdchHeOYnr3/SY5ffRcA86h13wMoUb0OOwelbk7MMtLyGdguKyPd5HVwYcfwb4JPFMwJuFsTk0dO539FsKpi5eABcaF4XOxbZB4CFw9PlDNEXOtnKXPqMijnZrL/Je9pznVIxzimZ+9/krPaM3gIBFVv4ubA6gv4E7UgK59R7Js6Mr0hPf7QIYa8CWUSu/A/wPCGjs45YpJGTN6GPXT+eBG8K54TWzmZh07/jjjYySJTX4TZ+R3tv5N5sk4e45iGWfuf5Cx/MtEdNAk24l6M7QV3MWLyyFfsxZiD2EgouuZEZfohWP1D6pDNYP+L/VTiRfCJ4I4U7YxtRLbK5KGdbIWgY29ZZBnc+bGxrRC+I47y3503T9bJYxzTxqT+59vikc4vgzIEBdIMq1rLoB4eK7Yb7y1BQ4k7d+MJbGpY0XhA3qdfDXSspf472xr8RcCE1q/zT4XO4jfD7VFkwCSZeULcDNecXxjrf8d5wL7vAgT0i+MGRve/2B6P9EcKhkPsiAXS7e8BJKiFRtbQarSB3Mj0nzW+fROh87PakulqYFXpIsHq0EcF5hfI0HlbVp+adObjEFxdwF06+40jtg2imqxNY4gCrvBjxC3iNcHLDtZ7ySNv3QGyBo1F9cwRFm2qZLD/Hb6wXn6teFVQlph8XPqcDdXdWm5Vnjeil4gnxcfiQ/FYkTFhbpU3pINRvz9kdYF07wkf+D4gs/OMPn4tPsPYjm8QWRJjXXg7wf4KYvLI0bfGgAMgZHJjjpDVO5ZR/ocfcQNxhXhRnCT4b/spS0weOXpWi1plDemmQiDmeJeLN8WZgs1htIv/KG4fcZZAd5XI9sjP/fsT+vKR2uPjE+8BnhVcOMTk+78HKAlm9dytelcBBHrsFqsAAyBk8rkgZPIx1PpPx+PF0OZO5kGOHrtM3wfLk3eJrZ3MQ6Cj3CnYEtzVBkB3k6A+yph8jt+fDjomYG9la4/Pfv/7xfWCJyC+EZNH3v09gP7wWHlQDFoHFthhP/RxRMjkc0HI5EOp9Z9hzwsivnhB5vN0PmStbQUDYLPS04KnyH5F5iHwdKFjr/hP7BKwwZYy5Of6/Qk7CS/rAjsC6TmOf45IvwcQ7BHq/h5Af3ij569Gz1OJDLBv3gQmDAlZuakQMrlByORGn/9deP8Z459Q0h5ClDEcwj7K++ACOF8cIhgPHye8nvC66HzzmYAtdTFMqvXfy8aE+wTl+o4/tP8x3Jn2PYD+8GhmjLVCKQiZHPtmL8gACJl8LgiZ3CBkciPz/1Fh/9M4cWs/vPD+vyF2KGkPIcqYEzC5i3IPY/ajxGWC/8b0ZdHscRE8+mnblcKGMOxpiYGnha8zg3kCE+Na/z2EKMsgWDo7vkHI5PH4jPn9kM5gyZM3vmx7ANLt7wH0523R2g3oIGRyJibcQTJdhJDJ54KQyQ1CJjcy//m/ZOl4p5S4tR9eeP8JdvLpeFmwDokdP5bV41lfnC64oG4Wp4oDxd5iI2F2mwl2PTK2pR2+jjHsKVgdqvXfQ4iyDIKl5+h/PAFa3wMIXnYxdGRLBE88II3s5y/C9IfgCz6BIAnIzabvh4wQMvkQCJncQ8jkBiGTG4RMfrIgZBMz7/8cTwAmabeLO8QuRdYH4/hrBEudmX4MhEw+1H8PIaZj3JeGKf3vXLH4HkBwl2f4tGIrRJFx3tZthdCfz/MTgJDJPYSYXxa8feY/E1XufMeXOE5cvf9j5gDYZXOAqwV3dZ4CUZdBPRz/ICebSq3/HkJMxzim5+h/tgrUfA8g7hGdm+EEunWb4fRnjjHYakHI5B4fuvSZ3Mj8Z/97sx++xK398ML7T+dgdScuP74U8l2rQLsKOhljf9btDxOXinvFM4IJrq2QcOdjHZ8xua2Hc2fcq6SnUOu/hxDTMY7p7PgGIZNnx7f3AKQJfYsC/BbrvgfQnzlm4asFIZOPgZDJjT7/u4j+D30PkN39LxCniUPF8+I2QYfn5RVr//yorAJtK1g54S7HxWLlLxZnu3wX1B0DnWAO/w1CTMc4pvuOP7X/4VffBcA8at33APoz1zrwHAwJWbk+CJncmMN//yb4RMGcgLs1MXnkdP5XhK2uGA+IC8XjYt8i87AMysXDE+UMEdf6Wf6bugxKmPP3J8R0jGN6zuMbDG8GD4FgjjeBqwEhk4+BkMk9+EOHGOI/k9gu/xne0NE5R0zSiMnbsIfOHy+Cd8VzYisn89Dp3xEHO1lk6oswArK5/CfEdIxjGqhvzv7HBJeJ7qBJsBH3YmwvuIsRk0c+Zi/IHBAy+WrwafkfL4JPRN/dahuRrTJ5aCdbIejYWxZZBnd+bGwrBMF0c/hPiOkYx7Qx9/n3y6AMQYE0w6rWMqiHx4rtxntLEIj7duPVhlifh5DJV4sp/k/BXwRMaP06/1ToLH4z3B5FBkySmSfEzXAEX0et/4S+CxDQEzLd3Of/SMFQhx2xQLr9PYDPTKQ2ZHX+f4DOH1dX5oBVpYsEq0MfFZhfIEPnbVl98vlauEsPCbYN4jNm7Xr/B3R081R+GjSzAAAAAElFTkSuQmCC");
		}
		else{
		
		tools.appendString("webwb/pygridicons_12892877635.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-128px -32px; width:16px; height:16px;' ");
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-128px -16px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
				tools.appendString(" disabled ");
			} else {
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141230054119036922804") + "  ");
		tools.appendString("onclick='pd(event);' href='' ");
		tools.appendString("tabindex='0' ");
		tools.appendString("IsSprite='true' data-ctl='Icon' "); tools.appendString("style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,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");
		}
		else{
		
		tools.appendString("webwb/pygridicons_12892877635.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-128px top; width:16px; height:16px;' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-128px -16px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
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
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox", ".pySections(5).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:38px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxIcon_1();
									tools.appendString("</DIV>"); } else { pxIcon_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pzDisplayAttachmentCategory_1() {
pzAuto.emitIncludeStreamReference("pzDisplayAttachmentCategory", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_1() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzDisplayAttachmentCategory", ".pySections(5).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString(" class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("height:40px;");tools.appendString(""); tools.appendString("'>");
	if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzDisplayAttachmentCategory_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}


public void gridOpenActionIncl_1() {
pzAuto.emitIncludeStreamReference("pzGridOpenAction", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Fragment", null);
}
public void 
getInlineStyle_1() {
}


public void pyRequiredCategories_1() {
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

					if(tools.getParamValue("partialTrigger").equals("appendTo.pyRequiredCategories5")|| tools.getParamValue("partialTrigger").equals("editRow.pyRequiredCategories5") ){

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

					ClipboardProperty pageListProp = tools.getProperty(".pyRequiredCategories");

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

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyRequiredCategories\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 }}catch(Exception e){}

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyRequiredCategories")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyRequiredCategories5") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyRequiredCategories"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201803230729100813280-" + rowTestID) + " ");

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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyRequiredCategories5")) {

					
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

					
		 pageListProp = tools.getProperty(".pyRequiredCategories");

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyRequiredCategories5") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty(".pyRequiredCategories");

					
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

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyRequiredCategories\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyRequiredCategories")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyRequiredCategories5") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyRequiredCategories"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201803230729100813280-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					

					
					 repeatingDataCell_1(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_3(); 

					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
						 tools.putParamValue("expandRL","false");

					
					
									  pega.popStackFrame(frame_3, false); 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					
					 } 

					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					 /* GenerateGrid: End */

					
					}









private void performStream_2() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_2 = new HashMap();
static {
	oPropDefinitions_2.put("Embed-Stage.pyExpressionToSkipOrAllow", new LiteweightPropertyDefinition("Embed-Stage", "pyExpressionToSkipOrAllow", "sTN", false, true, "pxTextInput", false));
	oPropDefinitions_2.put("Embed-Stage.pyValidate", new LiteweightPropertyDefinition("Embed-Stage", "pyValidate", "sTN", false, true, "Default", false));
	oPropDefinitions_2.put("Embed-Stage.pySkipStageWhen", new LiteweightPropertyDefinition("Embed-Stage", "pySkipStageWhen", "sTN", false, true, "Default", false));
}
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "Internal");
	oStreamProperties_2.put("pyClassName", "Embed-Stage");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-SECTION EMBED-STAGE PZCASETYPESTAGEENTRYCRITERIA #20180713T140844.731 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pzCaseTypeStageEntryCriteria");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_6", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_8", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_9", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
pzExternalMethodMapping.put("pzLayout_11", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_7", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_5", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_4", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION EMBED-STAGE PZCASETYPESTAGEENTRYCRITERIA #20180713T140844.731 GMT", "Embed-Stage pzCaseTypeStageEntryCriteria", "Pega-ProcessArchitect", "08-01-01", "20180713T140844.731 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY OPENRULE #20180713T132012.839 GMT", "OpenRule", "Pega-ProCom", "08-01-01", "20180713T132012.839 GMT");
}
