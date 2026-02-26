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
 * Builds JSP stream PEGA-COLUMNFILTERCRITERIA!PYUNIQUEVALUESGRID.
 */
public class ra_stream_pyuniquevaluesgrid_dc4c92f7f12e09d7ad8d973479a9ef3f extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pyUniqueValuesGrid.Pega_ColumnFilterCriteria.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -748087933;
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
	public ra_stream_pyuniquevaluesgrid_dc4c92f7f12e09d7ad8d973479a9ef3f(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "288a98f4fad76dca948e9da66fdbf4c2f95cca6b";
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
/* Instance RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYUNIQUEVALUESGRID #20180713T133450.863 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "288a98f4fad76dca948e9da66fdbf4c2f95cca6b";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pyUniqueValuesGrid",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYUNIQUEVALUESGRID #20180713T133450.863 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYUNIQUEVALUESGRID #20180713T133450.863 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYUNIQUEVALUESGRID #20180713T133450.863 GMT */
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
	"Rule-HTML-Section:PYUNIQUEVALUESGRID", 
	"Rule-Obj-Property:PYSELECTED", 
	"Rule-Obj-Property:PYSELECTED", 
	"Rule-HTML-Property:PXCHECKBOX"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("WEBWB!PZPEGA_CONTROL_CHECKBOX!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_CHECKBOX!JS #20180713T133232.019 GMT","WEBWB!PZPEGA_CONTROL_CHECKBOX!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYUNIQUEVALUESGRID","Rule-HTML-Section","PEGA-COLUMNFILTERCRITERIA",false,"","Pega-Gadgets","08-01-01","RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYUNIQUEVALUESGRID #20180713T133450.863 GMT","!PYUNIQUEVALUESGRID",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-748087933), 
		new DependentRuleInfo("PYSELECTED","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA-UNIQUEVALUES",true,"Pega-ColumnFilterCriteria-UniqueValues","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA-UNIQUEVALUES PYSELECTED #20180713T133405.983 GMT","!PYSELECTED",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYSELECTED","Rule-Obj-Property","@BASECLASS",false,"","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYSELECTED #20180713T131842.942 GMT","!PYSELECTED",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXCHECKBOX","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXCHECKBOX #20190131T183501.527 GMT","PXCHECKBOX",true,false,"ABSOLUTE_CLASSLESS",-1770834696)
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
//	RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYUNIQUEVALUESGRID #20180713T133450.863 GMT:20180713T133450.863 GMT
//	RULE-HTML-PROPERTY PXCHECKBOX #20190131T183501.527 GMT:20190131T183501.527 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_CHECKBOX!JS #20180713T133232.019 GMT:20180713T133232.019 GMT
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA-UNIQUEVALUES PYSELECTED #20180713T133405.983 GMT:20180713T133405.983 GMT
//	RULE-HTML-PROPERTY PXCHECKBOX #20190131T183501.527 GMT:20190131T183501.527 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_CHECKBOX!JS #20180713T133232.019 GMT:20180713T133232.019 GMT
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA-UNIQUEVALUES PYSELECTED #20180713T133405.983 GMT:20180713T133405.983 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSELECTED #20180713T131842.942 GMT:20180713T131842.942 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSELECTED #20180713T131842.942 GMT:20180713T131842.942 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSELECTED #20180713T131842.942 GMT:20180713T131842.942 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSELECTED #20180713T131842.942 GMT:20180713T131842.942 GMT
//	RULE-HTML-PROPERTY PXCHECKBOX #20190131T183501.527 GMT:20190131T183501.527 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_CHECKBOX!JS #20180713T133232.019 GMT:20180713T133232.019 GMT
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA-UNIQUEVALUES PYSELECTED #20180713T133405.983 GMT:20180713T133405.983 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSELECTED #20180713T131842.942 GMT:20180713T131842.942 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSELECTED #20180713T131842.942 GMT:20180713T131842.942 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	pzLayout_1(
//	pzLayout_3(
//	pzLayout_2(
//	pzLayout_4(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS #20180713T131438.133 GMT:20180713T131438.133 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION GRID PZMIGRATEGRIDRIGHTCLICKACTION #20180713T133337.796 GMT:20180713T133337.796 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLDEFAULTVALUES #20180713T133337.840 GMT:20180713T133337.840 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T132449.639 GMT:20180713T132449.639 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDISABLEWHEN #20180713T133339.725 GMT:20180713T133339.725 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATENOROWSMESSAGE #20180713T133339.845 GMT:20180713T133339.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECALCULATEDVALUE--(CLIP25E448149E37EDE02190B4A70F76AB5B #20210527T114234.915 GMT:20210527T114234.915 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECHECKBOX #20220110T052602.744 GMT:20220210T153209.831 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT--(STRING,CLIPBOE3B9AB14D60C9BC144A59D967BEF48D3 #20231111T205726.843 GMT:20231111T205726.843 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETCONTROLSFORMAT--(CLIPBOARDP67982A3A95FEBEAA95783F4B64F7D734 #20231101T074700.438 GMT:20231101T074700.438 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "f8adea8f997e425b19881ad2ed000557";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-ColumnFilterCriteria";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_10")){
pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_11")){
pzLayoutBodyWrapper_2();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_12")){
pzLayoutBodyWrapper_3();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_13")){
pzLayoutBodyWrapper_4();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pyUniqueValuesGrid",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pyUniqueValuesGrid','insKey':'RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYUNIQUEVALUESGRID #20180713T133450.863 GMT','sectionType':'standard'}");
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_14")) ){
pzLayout_1();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_19")) ){
pzLayout_2();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_20")) ){
pzLayout_3();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_21")) ){
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
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBodyWrapper_8() {
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_8();gridCentreLayout_4();
				gridEndLayout_1();
}
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}
public void repeatingDataCell_26() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzUniqueValuesGridFields", ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	if(Integer.parseInt(tools.getSaveValue("rowsDisplayed")) == 1) {tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues4colWidthCache2").equals("")) { tools.appendParamCSF("PpyUniqueValues4colWidthCache2");} else { tools.appendString("auto;"); }}tools.appendString("");getInlineStyle_4(); tools.appendString(""); tools.appendString("'>");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzUniqueValuesGridFields_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void repeatingDataCell_25() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pyShowFilterCheckboxes", ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString(" class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("height:35px;");if(Integer.parseInt(tools.getSaveValue("rowsDisplayed")) == 1) {tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues4colWidthCache1").equals("")) { tools.appendParamCSF("PpyUniqueValues4colWidthCache1");} else { tools.appendString("16.9811320754717"); }tools.appendString("%;");}tools.appendString("");getInlineStyle_2(); tools.appendString(""); tools.appendString("'>");
	if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
	
								if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pyShowFilterCheckboxes_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void repeatingDataCell_24() {
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141009093030062392671") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(4).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" gridCell");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues4colWidthCache2").equals("")) { tools.appendParamCSF("PpyUniqueValues4colWidthCache2");} else { tools.appendString("auto;"); }tools.appendString("");getInlineStyle_5(); tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:18px;'"); } 
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
public void repeatingDataCell_23() {
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141009093030062391452") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(4).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" gridCell");tools.appendString(" ");tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:18px;");tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues4colWidthCache1").equals("")) { tools.appendParamCSF("PpyUniqueValues4colWidthCache1");} else { tools.appendString("16.9811320754717"); }tools.appendString("%;");tools.appendString("");getInlineStyle_1(); tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:18px;'"); } 
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
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpyUniqueValuesGridBBBB","",false);
}
public void LayoutWrapperTableStart_4() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(4)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpyUniqueValuesGridBBBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\"><tr><td>");
}
public void 
gridBeginLayout_8() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "None"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPage_pyUniqueValuesL15=null;

 Map selUniqMap_pyUniqueValuesL15 = null;
tools.appendString("<div  section_index='4' ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyUniqueValues");tools.appendString("_pyUniqueValuesGrid_4'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201707031053310490820") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readWrite' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='false' OAFunc='openRuleByKeys' ");
pyUniqueValues_1();
tools.appendString("><div  id='PEGA_GRID_SKIN' class='transparent'>");
}


public void gridCentreLayout_4() {/*gridCentreLayout*/
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

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyUniqueValues");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='   ' class='yui-skin-sam gPercent");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					}tools.appendString("' style='");

					tools.appendString("height:150px;");tools.appendString(" overflow-y:auto;");tools.appendString("' gPropIndex='PpyUniqueValues4' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\" hasHeight='true'>\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201707031053310490820-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyUniqueValues4colWidthGBL\" id=\"PpyUniqueValues4colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyUniqueValues4colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyUniqueValues4colWidthGBR\" id=\"PpyUniqueValues4colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyUniqueValues4colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyUniqueValues4colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("'  fixedSize='true'width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='' PL_PROP='");

					
tools.appendString(".pyUniqueValues");

					tools.appendString("' PL_PROP_CLASS='Pega-ColumnFilterCriteria-UniqueValues' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' style=\"display:none;\">");

					 repeatingDataCell_23(); 

					activeName = tools.getActiveName();  repeatingDataCell_24(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyUniqueValues").iterator(); 

					
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

					tools.appendString(" ng-repeat=\"Item in rootData..pyUniqueValues\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
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

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyUniqueValues")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues4") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyUniqueValues"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707031053310490820-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_25(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_26(); 

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

					
									 ClipboardPage tempNoRespg = tools.createPage("Pega-ColumnFilterCriteria-UniqueValues", "tempNoRespg");

					
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

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues4") && tools.getParamValue("partialRefresh").equals("false")) {

						 tools.putParamValue("partialTrigger",""); 
}

					
					 /* GenerateGrid: End */

					}
public void pzLayout_4() {
String gridLayoutMethodName="pzLayout_4";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o2== rx.IsReportDef cqtrue o2|| o2== pxparam.pyColumnType cqDate o2== pxparam.pyColumnType cqDateTime",".IsReportDef == \'true\' && (param.pyColumnType=\'Date\' || param.pyColumnType=\'DateTime\')", "layout", "visible" )) {pzSetExpandParam_4();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_4(); 
pzLayoutBodyWrapper_8();
 LayoutWrapperTableEnd_2(); }
}
tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBodyWrapper_7() {
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_7();gridCentreLayout_3();
				gridEndLayout_1();
}
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}
public void repeatingDataCell_22() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzUniqueValuesGridFields", ".pySections(3).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	if(Integer.parseInt(tools.getSaveValue("rowsDisplayed")) == 1) {tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues3colWidthCache2").equals("")) { tools.appendParamCSF("PpyUniqueValues3colWidthCache2");} else { tools.appendString("auto;"); }}tools.appendString("");getInlineStyle_3(); tools.appendString(""); tools.appendString("'>");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzUniqueValuesGridFields_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void repeatingDataCell_21() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pyShowFilterCheckboxes", ".pySections(3).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString(" class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("height:35px;");if(Integer.parseInt(tools.getSaveValue("rowsDisplayed")) == 1) {tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues3colWidthCache1").equals("")) { tools.appendParamCSF("PpyUniqueValues3colWidthCache1");} else { tools.appendString("18.120805369127517"); }tools.appendString("%;");}tools.appendString("");getInlineStyle_2(); tools.appendString(""); tools.appendString("'>");
	if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
	
								if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pyShowFilterCheckboxes_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void repeatingDataCell_20() {
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("2014100909303006176735") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(3).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" gridCell");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues3colWidthCache2").equals("")) { tools.appendParamCSF("PpyUniqueValues3colWidthCache2");} else { tools.appendString("auto;"); }tools.appendString("");getInlineStyle_5(); tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:18px;'"); } 
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
public void repeatingDataCell_19() {
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141009093030061766663") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(3).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" gridCell");tools.appendString(" ");tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:18px;");tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues3colWidthCache1").equals("")) { tools.appendParamCSF("PpyUniqueValues3colWidthCache1");} else { tools.appendString("18.120805369127517"); }tools.appendString("%;");tools.appendString("");getInlineStyle_1(); tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:18px;'"); } 
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
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpyUniqueValuesGridBBB","",false);
}
public void LayoutWrapperTableStart_3() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(3)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpyUniqueValuesGridBBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\"><tr><td>");
}
public void 
gridBeginLayout_7() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "None"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPage_pyUniqueValuesL11=null;

 Map selUniqMap_pyUniqueValuesL11 = null;
tools.appendString("<div  section_index='3' ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyUniqueValues");tools.appendString("_pyUniqueValuesGrid_3'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201707031053310489722") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readWrite' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='false' OAFunc='openRuleByKeys' ");
pyUniqueValues_1();
tools.appendString("><div  id='PEGA_GRID_SKIN' class='transparent'>");
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

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyUniqueValues");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='   ' class='yui-skin-sam gPercent");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					}tools.appendString("' style='");

					tools.appendString("height:150px;");tools.appendString(" overflow-y:auto;");tools.appendString("' gPropIndex='PpyUniqueValues3' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\" hasHeight='true'>\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201707031053310489722-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyUniqueValues3colWidthGBL\" id=\"PpyUniqueValues3colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyUniqueValues3colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyUniqueValues3colWidthGBR\" id=\"PpyUniqueValues3colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyUniqueValues3colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyUniqueValues3colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("'  fixedSize='true'width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='' PL_PROP='");

					
tools.appendString(".pyUniqueValues");

					tools.appendString("' PL_PROP_CLASS='Pega-ColumnFilterCriteria-UniqueValues' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' style=\"display:none;\">");

					 repeatingDataCell_19(); 

					activeName = tools.getActiveName();  repeatingDataCell_20(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyUniqueValues").iterator(); 

					
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

					tools.appendString(" ng-repeat=\"Item in rootData..pyUniqueValues\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
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

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyUniqueValues")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues3") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyUniqueValues"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707031053310489722-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_21(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_22(); 

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

					
									 ClipboardPage tempNoRespg = tools.createPage("Pega-ColumnFilterCriteria-UniqueValues", "tempNoRespg");

					
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

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues3") && tools.getParamValue("partialRefresh").equals("false")) {

						 tools.putParamValue("partialTrigger",""); 
}

					
					 /* GenerateGrid: End */

					}
public void pzLayout_3() {
String gridLayoutMethodName="pzLayout_3";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o2== rx.IsReportDef cqtrue o1! o2|| o2== pxparam.pyColumnType cqDate o2== pxparam.pyColumnType cqDateTime",".IsReportDef == \'true\' && !(param.pyColumnType=\'Date\' || param.pyColumnType=\'DateTime\')", "layout", "visible" )) {pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_3(); 
pzLayoutBodyWrapper_7();
 LayoutWrapperTableEnd_2(); }
}
tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBodyWrapper_6() {
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_6();gridCentreLayout_2();
				gridEndLayout_1();
}
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}
public void repeatingDataCell_18() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzUniqueValuesGridFields", ".pySections(2).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	if(Integer.parseInt(tools.getSaveValue("rowsDisplayed")) == 1) {tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues2colWidthCache2").equals("")) { tools.appendParamCSF("PpyUniqueValues2colWidthCache2");} else { tools.appendString("auto;"); }}tools.appendString("");getInlineStyle_4(); tools.appendString(""); tools.appendString("'>");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzUniqueValuesGridFields_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void 
pegaReferenceTag_3() {
try {

/*
 * reference tag
 * Cannot inline because: parameters prevent us from inlining
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__3 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__3.setPageContext(pageContext);
_jspx_th_pega_reference__3.setParent(mParentTag);
_jspx_th_pega_reference__3.setName(".pySelected");
_jspx_th_pega_reference__3.setMode("input");
_jspx_th_pega_reference__3.setFormat("Checkbox");
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
public void repeatingDataCell_17() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("Checkbox",".pySelected", ".pySections(2).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:32px;");if(Integer.parseInt(tools.getSaveValue("rowsDisplayed")) == 1) {tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues2colWidthCache1").equals("")) { tools.appendParamCSF("PpyUniqueValues2colWidthCache1");} else { tools.appendString("16.9811320754717"); }tools.appendString("%;");}tools.appendString("");getInlineStyle_2(); tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {
				pegaReferenceTag_3();
				hiddenPropParamStringMethod_1(); } 
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {
				pegaReferenceTag_3();
				hiddenPropParamStringMethod_1(); } }
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingDataCell_16() {
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141009093030061042648") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(2).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" gridCell");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues2colWidthCache2").equals("")) { tools.appendParamCSF("PpyUniqueValues2colWidthCache2");} else { tools.appendString("auto;"); }tools.appendString("");getInlineStyle_5(); tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:18px;'"); } 
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
public void repeatingDataCell_15() {
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141009093030060941392") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(2).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" gridCell");tools.appendString(" ");tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:18px;");tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues2colWidthCache1").equals("")) { tools.appendParamCSF("PpyUniqueValues2colWidthCache1");} else { tools.appendString("16.9811320754717"); }tools.appendString("%;");tools.appendString("");getInlineStyle_1(); tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:18px;'"); } 
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
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpyUniqueValuesGridBB","",false);
}
public void LayoutWrapperTableStart_2() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(2)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpyUniqueValuesGridBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\"><tr><td>");
}
public void 
gridBeginLayout_6() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "None"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPage_pyUniqueValuesL7=null;

 Map selUniqMap_pyUniqueValuesL7 = null;
tools.appendString("<div  section_index='2' ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyUniqueValues");tools.appendString("_pyUniqueValuesGrid_2'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201707031053310488308") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readWrite' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='false' OAFunc='openRuleByKeys' ");
pyUniqueValues_1();
tools.appendString("><div  id='PEGA_GRID_SKIN' class='transparent'>");
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

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyUniqueValues");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pySelected   ' class='yui-skin-sam gPercent");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					}tools.appendString("' style='");

					tools.appendString("height:150px;");tools.appendString(" overflow-y:auto;");tools.appendString("' gPropIndex='PpyUniqueValues2' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\" hasHeight='true'>\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201707031053310488308-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyUniqueValues2colWidthGBL\" id=\"PpyUniqueValues2colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyUniqueValues2colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyUniqueValues2colWidthGBR\" id=\"PpyUniqueValues2colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyUniqueValues2colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyUniqueValues2colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("'  fixedSize='true'width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='' PL_PROP='");

					
tools.appendString(".pyUniqueValues");

					tools.appendString("' PL_PROP_CLASS='Pega-ColumnFilterCriteria-UniqueValues' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' style=\"display:none;\">");

					 repeatingDataCell_15(); 

					activeName = tools.getActiveName();  repeatingDataCell_16(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyUniqueValues").iterator(); 

					
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

					tools.appendString(" ng-repeat=\"Item in rootData..pyUniqueValues\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
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

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyUniqueValues")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues2") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyUniqueValues"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707031053310488308-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_17(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_18(); 

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

					
									 ClipboardPage tempNoRespg = tools.createPage("Pega-ColumnFilterCriteria-UniqueValues", "tempNoRespg");

					
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

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues2") && tools.getParamValue("partialRefresh").equals("false")) {

						 tools.putParamValue("partialTrigger",""); 
}

					
					 /* GenerateGrid: End */

					}

					public void LayoutWrapperTableEnd_2() {

					tools.appendString("</td></tr></table>");

					}
public void pzLayout_2() {
String gridLayoutMethodName="pzLayout_2";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o2!= rx.IsReportDef cqtrue o2|| o2== pxparam.pyColumnType cqDate o2== pxparam.pyColumnType cqDateTime",".IsReportDef != \'true\' && (param.pyColumnType=\'Date\' || param.pyColumnType=\'DateTime\')", "layout", "visible" )) {pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_2(); 
pzLayoutBodyWrapper_6();
 LayoutWrapperTableEnd_2(); }
}
tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBodyWrapper_5() {
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_5();gridCentreLayout_1();
				gridEndLayout_1();
}
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}
public void repeatingDataCell_14() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzUniqueValuesGridFields", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	if(Integer.parseInt(tools.getSaveValue("rowsDisplayed")) == 1) {tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues1colWidthCache2").equals("")) { tools.appendParamCSF("PpyUniqueValues1colWidthCache2");} else { tools.appendString("auto;"); }}tools.appendString("");getInlineStyle_3(); tools.appendString(""); tools.appendString("'>");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzUniqueValuesGridFields_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_15")){
inclCalVal_1("pxCheckbox","TF&&text&&false&&True&&False","leftJustifyStyle");inclAction_1();
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
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_17")){String disabled_ctrl = "";

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

		tools.appendString(" /><input type='checkbox'  " + pzCell.getTestIdIfEnabled("20141009093030060319301") + "   class='checkbox chkBxCtl"+errorClass+"' value='true' ");if(bOptimizedMarkup){  tools.appendString(" data-bindprops='value' "); }
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
		tools.appendString(" />");
		tools.appendString("<label  class=' cb_standard' for='");if(bOptimizedMarkup){
		tools.appendString(propName.substring(propName.lastIndexOf(".")+1)+pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getReference(),"",true)+"' ");} else{
		tools.appendString(tools.getHTMLIDForProperty(true,"checkbox")+"' ");}
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20141009093030060319301") + " ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_18")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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

public void repeatingDataCell_13() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxCheckbox",".pySelected", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:43px;");if(Integer.parseInt(tools.getSaveValue("rowsDisplayed")) == 1) {tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues1colWidthCache1").equals("")) { tools.appendParamCSF("PpyUniqueValues1colWidthCache1");} else { tools.appendString("11.020408163265307"); }tools.appendString("%;");}tools.appendString("");getInlineStyle_2(); tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {pxCheckbox_3(".pySelected",0,"","","True-False"); } 
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {pxCheckbox_3(".pySelected",0,"","","True-False"); } }
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
getInlineStyle_5() {
try {
tools.appendString("text-align:left;width:120px;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_12() {
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141009093030060217645") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" gridCell");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues1colWidthCache2").equals("")) { tools.appendParamCSF("PpyUniqueValues1colWidthCache2");} else { tools.appendString("auto;"); }tools.appendString("");getInlineStyle_5(); tools.appendString(""); tools.appendString("'>");
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
public void repeatingDataCell_11() {
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141009093030060216304") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" gridCell");tools.appendString(" ");tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:21px;");tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUniqueValues1colWidthCache1").equals("")) { tools.appendParamCSF("PpyUniqueValues1colWidthCache1");} else { tools.appendString("11.020408163265307"); }tools.appendString("%;");tools.appendString("");getInlineStyle_1(); tools.appendString(""); tools.appendString("'>");
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
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpyUniqueValuesGridB","",false);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpyUniqueValuesGridB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\"><tr><td>");
}
public void 
gridBeginLayout_5() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "None"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPage_pyUniqueValuesL3=null;

 Map selUniqMap_pyUniqueValuesL3 = null;
tools.appendString("<div  section_index='1' ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyUniqueValues");tools.appendString("_pyUniqueValuesGrid_1'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201707031053310487264") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readWrite' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='false' OAFunc='openRuleByKeys' ");
pyUniqueValues_1();
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

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyUniqueValues");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pySelected   ' class='yui-skin-sam gPercent");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					}tools.appendString("' style='");

					tools.appendString("height:150px;");tools.appendString(" overflow-y:auto;");tools.appendString("' gPropIndex='PpyUniqueValues1' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\" hasHeight='true'>\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201707031053310487264-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyUniqueValues1colWidthGBL\" id=\"PpyUniqueValues1colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyUniqueValues1colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyUniqueValues1colWidthGBR\" id=\"PpyUniqueValues1colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyUniqueValues1colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyUniqueValues1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("'  fixedSize='true'width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='' PL_PROP='");

					
tools.appendString(".pyUniqueValues");

					tools.appendString("' PL_PROP_CLASS='Pega-ColumnFilterCriteria-UniqueValues' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' style=\"display:none;\">");

					 repeatingDataCell_11(); 

					activeName = tools.getActiveName();  repeatingDataCell_12(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyUniqueValues").iterator(); 

					
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

					tools.appendString(" ng-repeat=\"Item in rootData..pyUniqueValues\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
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

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyUniqueValues")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyUniqueValues"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707031053310487264-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_13(); 

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

					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"2\" class=\"dataLabelRead gridCell\" >");

					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
								 tools.putParamValue("RenderSingle",""); 

					
									 ClipboardPage tempNoRespg = tools.createPage("Pega-ColumnFilterCriteria-UniqueValues", "tempNoRespg");

					
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

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues1") && tools.getParamValue("partialRefresh").equals("false")) {

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
tools.appendString("</td></tr></table>");
}
public void pzLayout_1() {
String gridLayoutMethodName="pzLayout_1";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o2!= rx.IsReportDef cqtrue o1! o2|| o2== pxparam.pyColumnType cqDate o2== pxparam.pyColumnType cqDateTime",".IsReportDef != \'true\' && !(param.pyColumnType=\'Date\' || param.pyColumnType=\'DateTime\')", "layout", "visible" )) {pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
pzLayoutBodyWrapper_5();
 LayoutWrapperTableEnd_1(); }
}
tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBodyWrapper_4() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_4();gridDoPartialRefresh_4();gridLastRow_4();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}
public void repeatingDataCell_10() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzUniqueValuesGridFields", ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("");getInlineStyle_4(); tools.appendString(""); tools.appendString("'>");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzUniqueValuesGridFields_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void repeatingDataCell_9() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pyShowFilterCheckboxes", ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString(" class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("height:35px;");tools.appendString("");getInlineStyle_2(); tools.appendString(""); tools.appendString("'>");
	if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
	
								if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pyShowFilterCheckboxes_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void pzLayoutBodyWrapper_3() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_3();gridDoPartialRefresh_3();gridLastRow_3();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}
public void repeatingDataCell_8() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzUniqueValuesGridFields", ".pySections(3).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("");getInlineStyle_3(); tools.appendString(""); tools.appendString("'>");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzUniqueValuesGridFields_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}


public void pyShowFilterCheckboxes_1() {
pzAuto.emitIncludeStreamReference("pyShowFilterCheckboxes", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_7() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pyShowFilterCheckboxes", ".pySections(3).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString(" class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("height:35px;");tools.appendString("");getInlineStyle_2(); tools.appendString(""); tools.appendString("'>");
	if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
	
								if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pyShowFilterCheckboxes_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void pzLayoutBodyWrapper_2() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();gridDoPartialRefresh_2();gridLastRow_2();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}
public void 
pegaReferenceTag_2() {
try {

/*
 * reference tag
 * Cannot inline because: parameters prevent us from inlining
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__2 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__2.setPageContext(pageContext);
_jspx_th_pega_reference__2.setParent(mParentTag);
_jspx_th_pega_reference__2.setName(".pySelected");
_jspx_th_pega_reference__2.setMode("input");
_jspx_th_pega_reference__2.setFormat("Checkbox");
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
public void repeatingDataCell_6() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("Checkbox",".pySelected", ".pySections(2).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:32px;");tools.appendString("");getInlineStyle_2(); tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {
				pegaReferenceTag_2();
				hiddenPropParamStringMethod_1(); } 
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {
				pegaReferenceTag_2();
				hiddenPropParamStringMethod_1(); } }
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
getInlineStyle_4() {
try {
tools.appendString("text-align:left;width:130px;white-space:normal;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_5() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzUniqueValuesGridFields", ".pySections(2).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("");getInlineStyle_4(); tools.appendString(""); tools.appendString("'>");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzUniqueValuesGridFields_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void 
hiddenPropParamStringMethod_1() {
}
public void 
pegaReferenceTag_1() {
try {

/*
 * reference tag
 * Cannot inline because: parameters prevent us from inlining
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__1 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__1.setPageContext(pageContext);
_jspx_th_pega_reference__1.setParent(mParentTag);
_jspx_th_pega_reference__1.setName(".pySelected");
_jspx_th_pega_reference__1.setMode("input");
_jspx_th_pega_reference__1.setFormat("Checkbox");
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
public void repeatingDataCell_4() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("Checkbox",".pySelected", ".pySections(2).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:32px;");tools.appendString("");getInlineStyle_2(); tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {
				pegaReferenceTag_1();
				hiddenPropParamStringMethod_1(); } 
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {
				pegaReferenceTag_1();
				hiddenPropParamStringMethod_1(); } }
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


public void pxCheckbox_2(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
inclCalVal_1("pxCheckbox","TF&&text&&false&&True&&False","leftJustifyStyle");inclAction_1();
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
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_8")){String disabled_ctrl = "";

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

		tools.appendString(" /><input type='checkbox'  " + pzCell.getTestIdIfEnabled("20141009093030060319301") + "   class='checkbox chkBxCtl"+errorClass+"' value='true' ");if(bOptimizedMarkup){  tools.appendString(" data-bindprops='value' "); }
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
		tools.appendString(" />");
		tools.appendString("<label  class=' cb_standard' for='");if(bOptimizedMarkup){
		tools.appendString(propName.substring(propName.lastIndexOf(".")+1)+pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getReference(),"",true)+"' ");} else{
		tools.appendString(tools.getHTMLIDForProperty(true,"checkbox")+"' ");}
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20141009093030060319301") + " ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_9")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxCheckbox",".pySelected", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:43px;");tools.appendString("");getInlineStyle_2(); tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {pxCheckbox_2(".pySelected",0,"","","True-False"); } 
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {pxCheckbox_2(".pySelected",0,"","","True-False"); } }
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pzUniqueValuesGridFields_1() {
pzAuto.emitIncludeStreamReference("pzUniqueValuesGridFields", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void 
getInlineStyle_3() {
try {
tools.appendString("text-align:left;width:120px;white-space:normal;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_2() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzUniqueValuesGridFields", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("");getInlineStyle_3(); tools.appendString(""); tools.appendString("'>");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzUniqueValuesGridFields_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void inclFormattedVal_2(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {
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

		tools.appendString(" /><input type='checkbox'  " + pzCell.getTestIdIfEnabled("20141009093030060319301") + "   class='checkbox chkBxCtl"+errorClass+"' value='true' ");if(bOptimizedMarkup){  tools.appendString(" data-bindprops='value' "); }
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
		tools.appendString(" />");
		tools.appendString("<label  class=' cb_standard' for='");if(bOptimizedMarkup){
		tools.appendString(propName.substring(propName.lastIndexOf(".")+1)+pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getReference(),"",true)+"' ");} else{
		tools.appendString(tools.getHTMLIDForProperty(true,"checkbox")+"' ");}
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20141009093030060319301") + " ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxCheckbox",".pySelected", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:43px;");tools.appendString("");getInlineStyle_2(); tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {pxCheckbox_1(".pySelected",0,"","","True-False"); } 
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pySeparator cttrue",".pySeparator != true", "cell", "visible" )) {pxCheckbox_1(".pySelected",0,"","","True-False"); } }
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
tools.appendString("text-align:left; width : 25px;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void 
getInlineStyle_2() {
try {
tools.appendString("text-align:left; width : 25px;height:21px;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public void pyUniqueValues_1() {
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

					if(tools.getParamValue("partialTrigger").equals("appendTo.pyUniqueValues1")|| tools.getParamValue("partialTrigger").equals("editRow.pyUniqueValues1") ){

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

					ClipboardProperty pageListProp = tools.getProperty(".pyUniqueValues");

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

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyUniqueValues\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 }}catch(Exception e){}

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyUniqueValues")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyUniqueValues"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707031053310487264-" + rowTestID) + " ");

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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyUniqueValues1")) {

					
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

					
		 pageListProp = tools.getProperty(".pyUniqueValues");

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyUniqueValues1") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty(".pyUniqueValues");

					
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

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyUniqueValues\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyUniqueValues")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyUniqueValues"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707031053310487264-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					

					
					 repeatingDataCell_3(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_2(); 

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyUniqueValues2")|| tools.getParamValue("partialTrigger").equals("editRow.pyUniqueValues2") ){

					
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

					
					ClipboardProperty pageListProp = tools.getProperty(".pyUniqueValues");

					
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

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyUniqueValues\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
 }}catch(Exception e){}

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyUniqueValues")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues2") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyUniqueValues"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707031053310488308-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					

					
					 repeatingDataCell_4(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_5(); 

					
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

					
					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyUniqueValues2")) {

					
					
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

					
					
		 pageListProp = tools.getProperty(".pyUniqueValues");

					
					
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

					
					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyUniqueValues2") ){

					
					
					tools.putParamValue("partialRefresh", "false");

					
					
					if(tools instanceof StreamBuilderToolKit) {

					
					
					ClipboardProperty pageListProp = tools.getProperty(".pyUniqueValues");

					
					
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

					
					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyUniqueValues\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					gridOpenActionIncl_1();

					
					
					tools.appendString(" id='");

					
					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					
					{

					
					
					String tempTestID = "";

					
					
					String rowTestID = "R";

					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyUniqueValues")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues2") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					String strEntryHandlePLProp = "";

					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyUniqueValues"); } catch (Exception ex) { }

					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					}

					
					
					}

					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707031053310488308-" + rowTestID) + " ");

					
					
					}

					
					
					tools.appendString(" PL_INDEX = '");

					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					
					

					
					
					 repeatingDataCell_6(); 

					
					
					activeName = tools.getActiveName(); 

					
					
					 repeatingDataCell_5(); 

					
					
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

					
					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyUniqueValues3")|| tools.getParamValue("partialTrigger").equals("editRow.pyUniqueValues3") ){

					
					
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

					
					
					ClipboardProperty pageListProp = tools.getProperty(".pyUniqueValues");

					
					
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

					
					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyUniqueValues\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
					
 }}catch(Exception e){}

					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					gridOpenActionIncl_1();

					
					
					tools.appendString(" id='");

					
					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					
					{

					
					
					String tempTestID = "";

					
					
					String rowTestID = "R";

					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyUniqueValues")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues3") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					String strEntryHandlePLProp = "";

					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyUniqueValues"); } catch (Exception ex) { }

					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					}

					
					
					}

					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707031053310489722-" + rowTestID) + " ");

					
					
					}

					
					
					tools.appendString(" PL_INDEX = '");

					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					
					

					
					
					 repeatingDataCell_7(); 

					
					
					activeName = tools.getActiveName(); 

					
					
					 repeatingDataCell_8(); 

					
					
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

					
					
					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyUniqueValues3")) {

					
					
					
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

					
					
					
		 pageListProp = tools.getProperty(".pyUniqueValues");

					
					
					
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

					
					
					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyUniqueValues3") ){

					
					
					
					tools.putParamValue("partialRefresh", "false");

					
					
					
					if(tools instanceof StreamBuilderToolKit) {

					
					
					
					ClipboardProperty pageListProp = tools.getProperty(".pyUniqueValues");

					
					
					
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

					
					
					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyUniqueValues\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					
					gridOpenActionIncl_1();

					
					
					
					tools.appendString(" id='");

					
					
					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					
					
					{

					
					
					
					String tempTestID = "";

					
					
					
					String rowTestID = "R";

					
					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyUniqueValues")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues3") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					
					String strEntryHandlePLProp = "";

					
					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyUniqueValues"); } catch (Exception ex) { }

					
					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					
					}

					
					
					
					}

					
					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707031053310489722-" + rowTestID) + " ");

					
					
					
					}

					
					
					
					tools.appendString(" PL_INDEX = '");

					
					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					
					
					

					
					
					
					 repeatingDataCell_7(); 

					
					
					
					activeName = tools.getActiveName(); 

					
					
					
					 repeatingDataCell_8(); 

					
					
					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
					
						 tools.putParamValue("expandRL","false");

					
					
					
					
									  pega.popStackFrame(frame_3, false); 

					
					
					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					
					
					
					 } 

					
					
					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					
					
					 /* GenerateGrid: End */

					
					
					
					}

					
					
					
					public void 
gridBeginLayout_4
					
					
					
					() {

					
					
					
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					
					}

					
					
					

public void gridDoPartialRefresh_4() { /*gridDoPartialRefresh*/

					
					
					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					
					
					java.util.Map functionsMap = null;

					
					
					java.util.Map classesMap = null;

					
					
					tools.putSaveValue("bAllowRowUpdate","true");

					
					
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					
					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					
					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyUniqueValues4")|| tools.getParamValue("partialTrigger").equals("editRow.pyUniqueValues4") ){

					
					
					
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

					
					
					
					ClipboardProperty pageListProp = tools.getProperty(".pyUniqueValues");

					
					
					
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

					
					
					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyUniqueValues\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
					
					
 }}catch(Exception e){}

					
					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					
					gridOpenActionIncl_1();

					
					
					
					tools.appendString(" id='");

					
					
					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					
					
					{

					
					
					
					String tempTestID = "";

					
					
					
					String rowTestID = "R";

					
					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyUniqueValues")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues4") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					
					String strEntryHandlePLProp = "";

					
					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyUniqueValues"); } catch (Exception ex) { }

					
					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					
					}

					
					
					
					}

					
					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707031053310490820-" + rowTestID) + " ");

					
					
					
					}

					
					
					
					tools.appendString(" PL_INDEX = '");

					
					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					
					
					

					
					
					
					 repeatingDataCell_9(); 

					
					
					
					activeName = tools.getActiveName(); 

					
					
					
					 repeatingDataCell_10(); 

					
					
					
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

					
					
					
					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyUniqueValues4")) {

					
					
					
					
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

					
					
					
					
		 pageListProp = tools.getProperty(".pyUniqueValues");

					
					
					
					
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

					
					
					
					

public void gridLastRow_4() { /*gridLastRow*/

					
					
					
					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					
					
					
					java.util.Map functionsMap = null;

					
					
					
					java.util.Map classesMap = null;

					
					
					
					tools.putSaveValue("bAllowRowUpdate","true");

					
					
					
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					
					
					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					
					
					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyUniqueValues4") ){

					
					
					
					
					tools.putParamValue("partialRefresh", "false");

					
					
					
					
					if(tools instanceof StreamBuilderToolKit) {

					
					
					
					
					ClipboardProperty pageListProp = tools.getProperty(".pyUniqueValues");

					
					
					
					
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

					
					
					
					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyUniqueValues\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					
					
					gridOpenActionIncl_1();

					
					
					
					
					tools.appendString(" id='");

					
					
					
					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					
					
					
					{

					
					
					
					
					String tempTestID = "";

					
					
					
					
					String rowTestID = "R";

					
					
					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyUniqueValues")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyUniqueValues4") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					
					
					String strEntryHandlePLProp = "";

					
					
					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyUniqueValues"); } catch (Exception ex) { }

					
					
					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					
					
					}

					
					
					
					
					}

					
					
					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707031053310490820-" + rowTestID) + " ");

					
					
					
					
					}

					
					
					
					
					tools.appendString(" PL_INDEX = '");

					
					
					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					
					
					
					

					
					
					
					
					 repeatingDataCell_9(); 

					
					
					
					
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
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Pega-ColumnFilterCriteria.pySelected", new LiteweightPropertyDefinition("Pega-ColumnFilterCriteria", "pySelected", "sSN", false, true, "CheckBoxSmall", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Pega-ColumnFilterCriteria");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYUNIQUEVALUESGRID #20180713T133450.863 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pyUniqueValuesGrid");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("pzLayout_1", new String[][] {});
pzExternalMethodMapping.put("pzLayout_3", new String[][] {});
pzExternalMethodMapping.put("pzLayout_2", new String[][] {});
pzExternalMethodMapping.put("pzLayout_4", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYUNIQUEVALUESGRID #20180713T133450.863 GMT", "Pega-ColumnFilterCriteria pyUniqueValuesGrid", "Pega-Gadgets", "08-01-01", "20180713T133450.863 GMT");
}
