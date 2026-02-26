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
 * Builds JSP stream @BASECLASS!PXBROWSEPROPERTIES.
 */
public class ra_stream_pxbrowseproperties_7dc8d8a1333ef66ab472c7b848632d24 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pxBrowseProperties.Rule_HTML_Section.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -14264598;
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
	public ra_stream_pxbrowseproperties_7dc8d8a1333ef66ab472c7b848632d24(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "472b7d8cf9fd7770dc4b98af33cd7966a61509a6";
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
/* Instance RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT	Pega-ProcessArchitect:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "472b7d8cf9fd7770dc4b98af33cd7966a61509a6";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pxBrowseProperties",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT */
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
	"Rule-HTML-Section:PXBROWSEPROPERTIES", 
	"Rule-Obj-Property:PYSEARCHTEXT", 
	"Rule-Obj-Property:PXRESULTCOUNT", 
	"Rule-Obj-Property:PYTEMPLATEINPUTBOX", 
	"Rule-HTML-Property:PXLINK", 
	"Rule-HTML-Property:PXICON"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXBROWSEPROPERTIES","Rule-HTML-Section","@BASECLASS",false,"","Pega-ProcessArchitect","08-06-01","RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT","!PXBROWSEPROPERTIES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-14264598), 
		new DependentRuleInfo("PYSEARCHTEXT","Rule-Obj-Property","@BASECLASS",true,"Code-Pega-List","Pega-EndUserUI","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYSEARCHTEXT #20180713T134648.480 GMT","!PYSEARCHTEXT",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXRESULTCOUNT","Rule-Obj-Property","CODE-PEGA-LIST",true,"Code-Pega-List","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-LIST PXRESULTCOUNT #20180713T131205.815 GMT","!PXRESULTCOUNT",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYTEMPLATEINPUTBOX","Rule-Obj-Property","@BASECLASS",false,"","Pega-UIDesign","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEINPUTBOX #20180713T133539.879 GMT","!PYTEMPLATEINPUTBOX",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXLINK","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT","PXLINK",true,false,"ABSOLUTE_CLASSLESS",-1085887471), 
		new DependentRuleInfo("PXICON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT","PXICON",true,false,"ABSOLUTE_CLASSLESS",-794576025)
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
//	RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT:20200819T104940.290 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEINPUTBOX #20180713T133539.879 GMT:20180713T133539.879 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEINPUTBOX #20180713T133539.879 GMT:20180713T133539.879 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEINPUTBOX #20180713T133539.879 GMT:20180713T133539.879 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEINPUTBOX #20180713T133539.879 GMT:20180713T133539.879 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSEARCHTEXT #20180713T134648.480 GMT:20180713T134648.480 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-LIST PXRESULTCOUNT #20180713T131205.815 GMT:20180713T131205.815 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	pzLayout_11(
//	simpleLayout_5(
//	simpleLayout_4(
//	simpleLayout_2(
//	simpleLayout_6(
//	simpleLayout_1(
//	simpleLayout_3(
//	simpleLayout_10(
//	simpleLayout_11(
//	simpleLayout_9(
//	simpleLayout_7(
//	simpleLayout_8(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION GRID GETTOTALRECORDS #20180713T133337.740 GMT:20180718T092706.975 GMT
//	RULE-UTILITY-FUNCTION GRID PZGETPROPERTYCLASSNAME #20180713T133337.766 GMT:20180713T133337.766 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T133337.901 GMT:20180713T133337.901 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDSECTIONBODYELEMENTS--(STRINGFC27BFECDD5F0250930FF8FA168BE1FF #20180713T133338.055 GMT:20180713T133338.055 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
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
//	RULE-UTILITY-FUNCTION HARNESS PZGETPREDATATRANSFORM #20180713T133339.990 GMT:20180713T133339.990 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONREFRESH--(CLIPBOARDPAGE,8AECDFE4A5256F13DC3F6C7D56453947 #20190320T065455.847 GMT:20190424T132824.042 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNACTIVITY #20190830T074358.805 GMT:20190830T074358.805 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNDATATRANSFORM--(CLIPB9514A9C33ADD6709FD6A843ADA2991DD #20220104T102659.447 GMT:20220104T102659.447 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZENABLEDSKIPLOCALIZATION #20180713T133344.810 GMT:20180713T133344.810 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEICON #20220323T120107.529 GMT:20220323T120107.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
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
		return "99227a3cd104f35709487384d9f87872";
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
pzLayoutBodyWrapper_2();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pxBrowseProperties",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pxBrowseProperties','insKey':'RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT','sectionType':'standard'}");
pzLayout_1();
pzLayout_12();
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
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzSearchBrowseFields");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzPushAndPop");
config.put("PushOrPull", "clearsearch");
config.put("pzDataTransformStaticParams", "PushOrPull&PageClass");
config.put("PageClass", "");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzBrowseProperties");
config.put("StaticActivityParams", "SourcePage=&AddActivity=");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzSearchBrowseFields");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzPushAndPop");
config.put("PushOrPull", "clearsearch");
config.put("pzDataTransformStaticParams", "PushOrPull&PageClass");
config.put("PageClass", "");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzBrowseProperties");
config.put("StaticActivityParams", "SourcePage=&AddActivity=");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzSearchBrowseFields");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzPushAndPop");
config.put("PushOrPull", "clearsearch");
config.put("pzDataTransformStaticParams", "PushOrPull&PageClass");
config.put("PageClass", "");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzBrowseProperties");
config.put("StaticActivityParams", "SourcePage=&AddActivity=");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("Context", "Header");
config.put("pzActivityStaticParams", "SourcePage&Context");
config.put("SourcePage", "");
config.put("pzActivity", "pzAddField");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("Context", "Header");
config.put("pzActivityStaticParams", "SourcePage&Context");
config.put("SourcePage", "");
config.put("pzActivity", "pzAddField");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("Context", "Header");
config.put("pzActivityStaticParams", "SourcePage&Context");
config.put("SourcePage", "");
config.put("pzActivity", "pzAddField");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("Context", "Header");
config.put("pzActivityStaticParams", "SourcePage&Context");
config.put("SourcePage", "");
config.put("pzActivity", "pzAddField");
pega.getUIEngine().getUIAction("runActivity", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzPushAndPop");
config.put("PushOrPull", "pop");
config.put("pzDataTransformStaticParams", "PushOrPull");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzBrowseProperties");
config.put("StaticActivityParams", "ClassName=&SourcePage=");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzPushAndPop");
config.put("PushOrPull", "pop");
config.put("pzDataTransformStaticParams", "PushOrPull");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzBrowseProperties");
config.put("StaticActivityParams", "ClassName=&SourcePage=");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzPushAndPop");
config.put("PushOrPull", "pop");
config.put("pzDataTransformStaticParams", "PushOrPull");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzBrowseProperties");
config.put("StaticActivityParams", "ClassName=&SourcePage=");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzPushAndPop");
config.put("PushOrPull", "pop");
config.put("pzDataTransformStaticParams", "PushOrPull");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzBrowseProperties");
config.put("StaticActivityParams", "ClassName=&SourcePage=");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzPushAndPop");
config.put("PushOrPull", "clearsearch");
config.put("pzDataTransformStaticParams", "PushOrPull");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzBrowseProperties");
config.put("StaticActivityParams", "ClassName=&SourcePage=");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("paginate", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("StreamName", "pxBrowseProperties");
pega.getUIEngine().getUIAction("sort", config).register();
pega.getUIEngine().getUIAction("paginate", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("addRow", null).register();
}
public void pzLayoutBody_11() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_11");simpleLayout_11();layoutBody_9();
}
public void pzLayoutBodyWrapper_14() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_11");simpleLayout_11();layoutBody_9();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void 
labelIncludeInCell_1(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201601071427360832362632") + "  ");
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
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUT",".pySections(2)") + "  section_index='2'  cellpadding='0' cellspacing='0' ID=''>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(2).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "height:22px;width:130px;",false,"","");labelIncludeInCell_1("","","","",false,"",true,false,"Standard",false);
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzLayoutBodyWrapper_13() {
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();if(!tools.getParamValue("gridAction").equals("PAGINATE")){}gridCentreLayout_1();if(!tools.getParamValue("gridAction").equals("PAGINATE")){
  

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
  

				gridEndLayout_1();}
}
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}
public void repeatingDataCell_3() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzBrowseProperty", ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(7).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString(" class='");
	tools.appendString(pzSection.getCustomStyle(false,"","container-hover","container-hover"));tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("height:36px;");if(Integer.parseInt(tools.getSaveValue("rowsDisplayed")) == 1) {tools.appendString("width:"); if(!tools.getParamValueCSF("D_BrowsePropertiesPpxResults1colWidthCache1").equals("")) { tools.appendParamCSF("D_BrowsePropertiesPpxResults1colWidthCache1");} else { tools.appendString("auto;"); }}tools.appendString(""); tools.appendString("'>");
	if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzBrowseProperty_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void repeatingDataCell_2() {
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141112072854066668870") + " ");
		tools.appendString(" class='");
		tools.appendString("hiddenCell");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:0px;");tools.appendString("width:"); if(!tools.getParamValueCSF("D_BrowsePropertiesPpxResults1colWidthCache1").equals("")) { tools.appendParamCSF("D_BrowsePropertiesPpxResults1colWidthCache1");} else { tools.appendString("auto;"); }tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:0px;'"); } 
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
public void pzSetExpandParam_12() {
pzSection.getLayout().setExpandParam("SubSectionpxBrowsePropertiesBBBBBBBBBBBB","",false);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(7).pySections(1)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpxBrowsePropertiesBBBBBBBBBBBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\"><tr><td>");
}
public void 
gridBeginLayout_2() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "Progressive Load"; 

 String strPageSize = "10"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPageD_BrowseProperties_pxResultsL14=null;

 Map selUniqMapD_BrowseProperties_pxResultsL14 = null;

 Set filteredIndicesSetD_BrowseProperties_pxResultsL14 = null;

	 String strFCPage = "pyFilterCriteria_D_BrowseProperties.pxResults_pxBrowseProperties_1";

	 strFCPage = strFCPage.replaceAll("[^\\w]","_");

	 ClipboardPage pg_fcPage = tools.findPage(strFCPage, true);

if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")){

	 if(pg_fcPage!=null){pg_fcPage.removeFromClipboard();}

}

	 gFCritPageD_BrowseProperties_pxResultsL14 = tools.findPage(strFCPage, true);

	 if(gFCritPageD_BrowseProperties_pxResultsL14==null){gFCritPageD_BrowseProperties_pxResultsL14 = tools.createPage("Pega-GridFilterCriteria", strFCPage);}

tools.putParamValue("pyGridFilterCriteriaPage", strFCPage);

gFCritPageD_BrowseProperties_pxResultsL14.getProperty("pyRowVisibleWhenCondition").setValue("!pzHideCreateInConfigureView");

  selUniqMapD_BrowseProperties_pxResultsL14 = null; // reset the variable

 if(gFCritPageD_BrowseProperties_pxResultsL14 != null){ 

 		 filteredIndicesSetD_BrowseProperties_pxResultsL14 = pega_uiengine_uiengine.pzPopulateFilteredindicesMap(gFCritPageD_BrowseProperties_pxResultsL14, "D_BrowseProperties.pxResults");

 		 tools.getParameterPage().put("filteredIndicesSet", filteredIndicesSetD_BrowseProperties_pxResultsL14);

 tools.putParamValue("populateSelectedUIValues", "true");

 		 selUniqMapD_BrowseProperties_pxResultsL14 = pega_uiengine_uiengine.pzPopulateSelectedValues(gFCritPageD_BrowseProperties_pxResultsL14); 

 		 tools.getParameterPage().put("selUniqMapD_BrowseProperties_pxResultsL14", selUniqMapD_BrowseProperties_pxResultsL14);

 tools.putParamValue("populateSelectedUIValues", "");

 }
if(tools.getParamValue("gridAction")!=null && !tools.getParamValue("gridAction").equals("PAGINATE")) {
tools.appendString("<div  section_index='1' ");
tools.appendString(" dataSource='");if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_BrowseProperties.pxResults").getReference());tools.appendString("_pxBrowseProperties_1'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201704141635220288252") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='true' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='true' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='true'");
if(tools.getParamValue("pyGridFilterCriteriaPage")!="" ) {
tools.appendString(" bFilteredGrid = 'true'");
}
tools.appendString(" bRangeFilterByFormat='false' bRowVisibleWhen = 'true' openOnDblClick='false' OAFunc='openRuleByKeys' ");
D_BrowseProperties_pxResults_1();
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
if(tools.findPage("D_BrowseProperties", true)!=null) {
pageListProp = tools.getProperty("D_BrowseProperties.pxResults");
}

 if(pageListProp!=null) { 

 tools.putParamValue("PageListProperty",pageListProp.getReference()); 

 } else {

 tools.putParamValue("PageListProperty","D_BrowseProperties.pxResults");}
/* to calculate the total number of records in case of filtering with pagination..false*/
/* to calculate the total number of records in case of filtering with pagination..*/
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

 {int counter = 0; int rowsDisplayed = 0; 
ClipboardProperty propActivePrev = tools.getActive(); 

	Iterator itr = tools.getProperty("D_BrowseProperties.pxResults").iterator();
		Set filteredResultsSet = new HashSet();
			while(itr.hasNext()){
				ClipboardProperty cp_eachProp = (ClipboardProperty)itr.next();
				ClipboardPage pg_eachProp = cp_eachProp.getPageValue();
				PRStackFrame frame = pega.pushStackFrame("FilteredGrid", null, pg_eachProp, false, false);
				tools.putActive(cp_eachProp);
				boolean bFilterResult = false;
				if(gFCritPageD_BrowseProperties_pxResultsL14!= null){
				bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_BrowseProperties_pxResultsL14, selUniqMapD_BrowseProperties_pxResultsL14);
				}
				if(bFilterResult){
					int itemIndex = cp_eachProp.indexOf() ;
						filteredResultsSet.add((Integer)itemIndex);
						}
						
 			 if (gFCritPageD_BrowseProperties_pxResultsL14== null || bFilterResult) {
						
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
						pageListProp = tools.getProperty("D_BrowseProperties.pxResults"); }
						
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

						if (endIndex == 0 && gFCritPageD_BrowseProperties_pxResultsL14 != null && tools.getParamValue("gridAction").toLowerCase().equals("submitrow")) {
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
				ClipboardPage gFCritPageD_BrowseProperties_pxResultsL14=null;
				Map selUniqMapD_BrowseProperties_pxResultsL14 = null;
				selUniqMapD_BrowseProperties_pxResultsL14 = null; // reset the variable
				gFCritPageD_BrowseProperties_pxResultsL14=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));
						 selUniqMapD_BrowseProperties_pxResultsL14 = (Map)tools.getParameterPage().getObject("selUniqMapD_BrowseProperties_pxResultsL14");
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

					
					
					
					
					ClipboardProperty prop = tools.getProperty("D_BrowseProperties.pxResults");

					
					
					
					
					}

					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='  ' class='yui-skin-sam gPercent");

					
					
					
					
					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					
					
					
					
					}tools.appendString("' style='");

					
					
					
					
					tools.appendString("' gPropIndex='D_BrowsePropertiesPpxResults1' editRowIndex='");

					
					
					
					
					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					
					
					
					
					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					
					
					
					
					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					
					
					
					
					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					
					
					
					
					tools.appendString("gridActiveRow='");

					
					
					
					
					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					
					
					
					
					tools.getParameterPage().remove("gridActiveRow"); 

					
					
					
					
					}

					
					
					
					
					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"true\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"false\"");

					
					
					
					
					if(tools.getParamValue("showFADetails").equals("true")) { tools.appendString("callFADetails='true'"); }if(tools.getParamValue("showNextFADetails").equals("true")) { tools.appendString("callNextFADetails='true'");}if(tools.getParamValue("refreshLayoutFromConfig").equals("true")) { tools.appendString("refreshLayoutFromConfig='true'");}if(tools.getParamValue("refreshLayout").equals("true") && !tools.getParamValueCSF("editRowIndex").equals("") && !tools.getParamValue("pyGridFilterCriteriaPage").equals("")) { tools.appendString("reloadSomePages='true'"); }tools.appendString(" pyGridAutoHeight=\"true\" pyPageSize = '");

					
					
					
					
					tools.appendParamCSF("pyPageSize"); tools.appendString("' pyReturnResultCount = '");

					
					
					
					
					tools.appendParamCSF("pyReturnResultCount"); tools.appendString("' pyPageMode= '");

					
					
					
					
					tools.appendParamCSF("pyPageMode"); tools.appendString("' totalRecords= '");

					
					
					
					
					tools.appendParamCSF("totalRecords"); tools.appendString("' currentPageIndex='");

					
					
					
					
					tools.appendParamCSF("currentPageIndex"); tools.appendString("' pySortHandled=\"false\" pyFilterHandled=\"false\">\n\t\t\t\t\t\t\t<div id='gridLayoutWrapper' noWidth='true' noHeight='true' style=\"height:360px;overflow-y:auto;\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					
					
					
					
					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201704141635220288252-layout") + " ");

					
					
					
					
					tools.appendString(" class='gridTable ");

					
					
					
					
					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					
					
					
					
					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					
					
					
					
					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					
					
					
					
					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"D_BrowsePropertiesPpxResults1colWidthGBL\" id=\"D_BrowsePropertiesPpxResults1colWidthGBL\" value=\"");

					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_BrowsePropertiesPpxResults1colWidthGBL"));tools.appendString("\" />");

					
					
					
					
					
						 tools.putParamValue("expandRL","false"); 

					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					tools.appendString("</td><td valign='top' class='mainGridTableCell' width='100.0%'><input type=\"hidden\" name=\"D_BrowsePropertiesPpxResults1colWidthGBR\" id=\"D_BrowsePropertiesPpxResults1colWidthGBR\" value=\"");

					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_BrowsePropertiesPpxResults1colWidthGBR"));

					
					
					
					
					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >");

					
					
					
					
					
							 if(!tools.getParamValue("gridAction").equals("PAGINATE")) {

					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t<div id='grid-topBuffer'></div> ");

					
					
					
					
					
							 }

					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					
					
					
					
					 if(!("".equals(tools.getParamValue("D_BrowsePropertiesPpxResults1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					
					
					
					
					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right' PL_PROP='");

					
					
					
					
					
tools.appendString("D_BrowseProperties.pxResults");

					
					
					
					
					tools.appendString("' PL_PROP_CLASS='Rule-Obj-Property' PRIM_PAGE='");

					
					
					
					
					tools.appendString(tools.getPrimaryPage().getName());

					
					
					
					
					tools.appendString("' GRID_REF_PAGE='");

					
					
					
					
					tools.appendString(tools.getStepPage().getReference());

					
					
					
					
					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t<tbody>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' style=\"display:none;\">");

					
					
					
					
					
Boolean inputEnabled = tools.hasInputEnabled();

					
					
					
					
					
	 tools.setInput(false);

					
					
					
					
					 repeatingDataCell_2(); 

					
					
					
					
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

					
					
					
					
					
								 itr_3 = tools.getProperty("D_BrowseProperties.pxResults").iterator(); 

					
					
					
					
					
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
										 } else if(gFCritPageD_BrowseProperties_pxResultsL14!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_BrowseProperties_pxResultsL14, selUniqMapD_BrowseProperties_pxResultsL14);
										 }
										 if (gFCritPageD_BrowseProperties_pxResultsL14== null || 

					
					
					
					
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

					
					
					
					
					tools.appendString(" ng-repeat=\"Item in rootData.D_BrowseProperties.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					
					 
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

					
					
					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_BrowseProperties.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_BrowseProperties.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					
					
					String strEntryHandlePLProp = "";

					
					
					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_BrowseProperties.pxResults"); } catch (Exception ex) { }

					
					
					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					
					
					}

					
					
					
					
					}

					
					
					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201704141635220288252-" + rowTestID) + " ");

					
					
					
					
					}

					
					
					
					
					tools.appendString(" PL_INDEX = '");

					
					
					
					
					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					
					
					
					
					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					 repeatingDataCell_3(); 

					
					
					
					
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

					
					
					
					
					
									 ClipboardPage tempNoRespg = tools.createPage("Rule-Obj-Property", "tempNoRespg");

					
					
					
					
					
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

					
					
					
					
					 if(!"".equals(tools.getParamValue("totalRecords"))) tools.appendString(Integer.toString((Integer.parseInt(tools.getParamValue("totalRecords"))-(2*10))*36));

					
					
					
					
					tools.appendString("px;'></div> \n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					
					
					
					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					
					
					 tools.putSaveValue("bUseMenuInline", "false");

					
					
					
					
					 if( tools.getParamValue("partialTrigger").equals("getChildNodesD_BrowseProperties.pxResults1") && tools.getParamValue("partialRefresh").equals("false")) {

					
					
					
					
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

					
					
					
					public void LayoutWrapperTableEnd_1() {

					
					
					
					tools.appendString("</td></tr></table>");

					
					
					
					}
public void pzLayout_11() {
String gridLayoutMethodName="pzLayout_11";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2> rxD_BrowseProperties.pxResultCount ci0","D_BrowseProperties.pxResultCount > 0", "layout", "visible" )) {pzSetExpandParam_12();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
pzLayoutBodyWrapper_13();
 LayoutWrapperTableEnd_1(); }
}
tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBody_10() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_10");simpleLayout_10();layoutBody_8();
}
public void pzLayoutBodyWrapper_12() {
tools.appendString("<div class='layout layout-noheader layout-noheader-explorer_list_item'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_10");simpleLayout_10();layoutBody_8();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void layoutBody_8() { 
tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(6).pySections(1)") + "  section_index='1'   cellpadding='0' cellspacing='0' ID='' width='100%'>\n\t\t\t\t\t\t\t</table>");
 } 


public int simpleLayoutCell_19( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(6).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-label item-" + Integer.toString(index) + "   '  STRING_TYPE='label' RESERVE_SPACE='false'><div class='content-inner '>" + "<div  " + pzCell.getTestIdIfEnabled("201412230752040302198690") + "  class='field-item " + pzSection.getCustomStyle(false, "","dataLabelRead","dataLabelWrite") + "' >");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","Data types Not Defined") + "</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_19( int index) {
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201412230752040302198690")).append(" ").toString().replace("data-test-id=","").trim());
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(6).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "Data types Not Defined";
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
public void pzSetExpandParam_11() {
pzSection.getLayout().setExpandParam("SubSectionpxBrowsePropertiesBBBBBBBBBBB","",false);
}


public void simpleLayout_10() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash67 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash67 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash67 != null && !"".equals(spxUniqueStreamHash67)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash67,pxUniqueStreamHash+"_67");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201712211824440840169") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(6).pySections(1)'}") + " class='" + " content  layout-content-default content-default " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash67 != null && !"".equals(spxUniqueStreamHash67)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_67");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","default");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(6).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_19(index);
	}else{
		index=simpleLayoutTemplateCell_19(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_10() {
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
	String paramName = "EXPANDEDSubSectionpxBrowsePropertiesBBBBBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(6).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-explorer_list_item");
	metadataPage.put("sectionIndex","35");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqdatatypes", pxUniqueStreamHash+"_70");metadataPage.put("dlChild","true");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_70");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_10();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_10() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqdatatypes","D_BrowseProperties.pxResultCount = 0 && D_BrowseProperties.pyBrowseContext == \'datatypes\'", "layout", "visible" )) {pzSetExpandParam_11();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_12();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_10();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_9() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_9");simpleLayout_9();layoutBody_7();
}
public void pzLayoutBodyWrapper_11() {
tools.appendString("<div class='layout layout-noheader layout-noheader-explorer_list_item'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_9");simpleLayout_9();layoutBody_7();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void layoutBody_7() { 
tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(5).pySections(1)") + "  section_index='1'   cellpadding='0' cellspacing='0' ID='' width='100%'>\n\t\t\t\t\t\t\t</table>");
 } 


public int simpleLayoutCell_17( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(5).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-label item-" + Integer.toString(index) + "   '  STRING_TYPE='label' RESERVE_SPACE='false'><div class='content-inner '>" + "<div  " + pzCell.getTestIdIfEnabled("201412230752040302198690") + "  class='field-item " + pzSection.getCustomStyle(false, "","dataLabelRead","dataLabelWrite") + "' >");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","Forms Not Defined") + "</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_17( int index) {
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201412230752040302198690")).append(" ").toString().replace("data-test-id=","").trim());
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(5).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "Forms Not Defined";
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
public void pzSetExpandParam_10() {
pzSection.getLayout().setExpandParam("SubSectionpxBrowsePropertiesBBBBBBBBBB","",false);
}


public void simpleLayout_9() {
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201712211824440839489") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(5).pySections(1)'}") + " class='" + " content  layout-content-default content-default " + "'  ");
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
		pg_dlmeta.put("format","default");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(5).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_17(index);
	}else{
		index=simpleLayoutTemplateCell_17(index);
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
	String paramName = "EXPANDEDSubSectionpxBrowsePropertiesBBBBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(5).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-explorer_list_item");
	metadataPage.put("sectionIndex","31");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqforms", pxUniqueStreamHash+"_64");metadataPage.put("dlChild","true");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_64");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_9();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_9() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqforms","D_BrowseProperties.pxResultCount = 0 && D_BrowseProperties.pyBrowseContext == \'forms\'", "layout", "visible" )) {pzSetExpandParam_10();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_11();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_9();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_8() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_8");simpleLayout_8();layoutBody_6();
}
public void pzLayoutBodyWrapper_10() {
tools.appendString("<div class='layout layout-noheader layout-noheader-explorer_list_item'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_8");simpleLayout_8();layoutBody_6();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void layoutBody_6() { 
tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1)") + "  section_index='1'   cellpadding='0' cellspacing='0' ID='' width='100%'>\n\t\t\t\t\t\t\t</table>");
 } 


public int simpleLayoutCell_15( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-label item-" + Integer.toString(index) + "   '  STRING_TYPE='label' RESERVE_SPACE='false'><div class='content-inner '>" + "<div  " + pzCell.getTestIdIfEnabled("201412230752040302198690") + "  class='field-item " + pzSection.getCustomStyle(false, "","dataLabelRead","dataLabelWrite") + "' >");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","Fields Not Defined") + "</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_15( int index) {
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201412230752040302198690")).append(" ").toString().replace("data-test-id=","").trim());
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "Fields Not Defined";
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
pzSection.getLayout().setExpandParam("SubSectionpxBrowsePropertiesBBBBBBBBB","",false);
}


public void simpleLayout_8() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash55 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash55 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash55 != null && !"".equals(spxUniqueStreamHash55)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash55,pxUniqueStreamHash+"_55");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201712211824440839785") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1)'}") + " class='" + " content  layout-content-default content-default " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash55 != null && !"".equals(spxUniqueStreamHash55)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_55");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","default");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_15(index);
	}else{
		index=simpleLayoutTemplateCell_15(index);
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
	String paramName = "EXPANDEDSubSectionpxBrowsePropertiesBBBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-explorer_list_item");
	metadataPage.put("sectionIndex","27");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqfields", pxUniqueStreamHash+"_58");metadataPage.put("dlChild","true");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_58");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_8();
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
if(pzAuto.handleEvaluateWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqfields","D_BrowseProperties.pxResultCount = 0 && D_BrowseProperties.pyBrowseContext == \'fields\'", "layout", "visible" )) {pzSetExpandParam_9();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_10();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_8();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_7() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_7");simpleLayout_7();layoutBody_5();
}
public void pzLayoutBodyWrapper_9() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_7");simpleLayout_7();layoutBody_5();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void layoutBody_5() { 
tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)") + "  section_index='1'   cellpadding='0' cellspacing='0' ID='' width='100%'>\n\t\t\t\t\t\t\t</table>");
 } 


public void pxDisplayText_1() {String key="25||RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","false");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","","","","false","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","N","true","0","","","Integer","true","25"};oCellRuntimeParamsMap.put("25||RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT",paramValues);oControlPathsMap.put("25||RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");}
public String 
getUIActionsMetaData_5() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
		com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
		actionRequestD.registerFixedParameter("pyModelName","pzPushAndPop");
			String usingPageString = "";
			usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
			tools.appendString("[\"runDataTransform\", [\"pzPushAndPop\", \"PushOrPull=clearsearch");
			actionRequestD.registerFixedParameter("PushOrPull","clearsearch");
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
			pzPackageRuntime.packageDataTransform(contextClass, "pzPushAndPop");
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
									pzPackageRuntime.packageSection("pxBrowseProperties",
									tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
									}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
									}
									refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
									refreshActionRequest.registerFixedParameter("SectionName", "");
									refreshActionRequest.registerFixedParameter("PreActivity", "pzBrowseProperties");
									staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
									staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
									staticURLStr.append("&PreActivity=pzBrowseProperties");
									tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzBrowseProperties\", \"");
									refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
									preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"ClassName\":\"\"");
									preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
									tools.appendString("\", \"\", \",");
									refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
									tools.appendString("\",\":event\",\"1\",[\"");
									if(!"".equals(preActParamStr.toString())) {
										staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
										}
										if(!"".equals(preDTParamStr.toString())) {
											staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
											}
											tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
											pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}											String returnString = actionsStringBuilder.toString();
											tools.popStreamBody();
											return returnString;
										}


public void pxLink_2() {boolean isDisplayTextWithParam = false;
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
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20141108010353014515756",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","pxBrowseProperties_$CTX$_24");
		String repeatIndx = "";
	modePage2.put("styles","Article_heading");
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Clear search results\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Clear search results", ".pyActionPrompt");
	}
	pyTooltip = "Clear search results";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("imgSrc","styleclass");
	modePage2.put("image","pi pi-caret-left");
	modePage2.put("actionImgPos","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Search results\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Search results", ".pyButtonLabel");
	}
	pyLabel = "Search results";
	modePage2.put("pyLabel",pyLabel);
	modePage2.put("captionType","text");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	modePage2.put("pyFormatTypeActionable","none");
	String pyFormatValue = "";
	modePage2.put("pyFormatValue",pyFormatValue);
	String spxUniqueStreamHash47 = getUIActionsMetaData_5();
	if(spxUniqueStreamHash47 != null && !"".equals(spxUniqueStreamHash47)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash47,pxUniqueStreamHash+"_47");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_47");
	}
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_link.js");
	ctrlComponent.beginComponent("pxLink",metadataPage);
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
		 String buttonUID = "name='pxBrowseProperties_"+ referenceString+ "_24'";
	 String securedPropValue = null;
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141108010353014515756") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
		com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
		actionRequestD.registerFixedParameter("pyModelName","pzPushAndPop");
			String usingPageString = "";
			usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
			tools.appendString("[\"runDataTransform\", [\"pzPushAndPop\", \"PushOrPull=clearsearch");
			actionRequestD.registerFixedParameter("PushOrPull","clearsearch");
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
			pzPackageRuntime.packageDataTransform(contextClass, "pzPushAndPop");
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
									pzPackageRuntime.packageSection("pxBrowseProperties",
									tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
									}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
									}
									refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
									refreshActionRequest.registerFixedParameter("SectionName", "");
									refreshActionRequest.registerFixedParameter("PreActivity", "pzBrowseProperties");
									staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
									staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
									staticURLStr.append("&PreActivity=pzBrowseProperties");
									tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzBrowseProperties\", \"");
									refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
									preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"ClassName\":\"\"");
									preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
									tools.appendString("\", \"\", \",");
									refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
									tools.appendString("\",\":event\",\"1\",[\"");
									if(!"".equals(preActParamStr.toString())) {
										staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
										}
										if(!"".equals(preDTParamStr.toString())) {
											staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
											}
											tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
											pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Clear search results\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString(" class='Article_heading");tools.appendString("'");
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-caret-left";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Search results",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</a>");										}

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



public int simpleLayoutCell_12( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxLink",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxLink_2();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141108010353014515756-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxLink");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxLink",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxLink_2();labelName = "";
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


public int simpleLayoutCell_13( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDisplayText","D_BrowseProperties.pxResultCount",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item dataValueRead'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxDisplayText_1();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201505081046230948129167-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDisplayText");
	pgCells.put("forLabel","D_BrowseProperties.pxResultCount");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDisplayText","D_BrowseProperties.pxResultCount",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
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
public void pzSetExpandParam_8() {
pzSection.getLayout().setExpandParam("SubSectionpxBrowsePropertiesBBBBBBBB","",false);
}


public void simpleLayout_7() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash45 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash45 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash45 != null && !"".equals(spxUniqueStreamHash45)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash45,pxUniqueStreamHash+"_45");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201712211824440838578") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + " class='" + " content  layout-content-inline_bottom content-inline_bottom container-hover" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash45 != null && !"".equals(spxUniqueStreamHash45)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_45");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","container-hover");
		pg_dlmeta.put("format","inline_bottom");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + "").append("\"").toString();
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
	String paramName = "EXPANDEDSubSectionpxBrowsePropertiesBBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","22");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" wxpzIsBrowseFieldsSearch", pxUniqueStreamHash+"_52");metadataPage.put("dlChild","true");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_52");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_7();
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
if(pzAuto.handleEvaluateWhen(" wxpzIsBrowseFieldsSearch","pzIsBrowseFieldsSearch", "layout", "visible" )) {pzSetExpandParam_8();
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
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_6");simpleLayout_6();layoutBody_4();
}
public void pzLayoutBodyWrapper_8() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_6");simpleLayout_6();layoutBody_4();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void layoutBody_4() { 
tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)") + "  section_index='1'   cellpadding='0' cellspacing='0' ID='' width='100%'>\n\t\t\t\t\t\t\t</table>");
 } 
public void pzLayoutBody_5() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_5");simpleLayout_5();layoutBody_3();
}
public void pzLayoutBodyWrapper_7() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_5");simpleLayout_5();layoutBody_3();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void layoutBody_3() { 
tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)") + "  section_index='1'   cellpadding='0' cellspacing='0' ID='' width='100%'>\n\t\t\t\t\t\t\t</table>");
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
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20141108010353014515756",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","pxBrowseProperties_$CTX$_19");
		String repeatIndx = "";
	modePage2.put("styles","Article_heading");
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","View fields in parent object\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("View fields in parent object", ".pyActionPrompt");
	}
	pyTooltip = "View fields in parent object";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("imgSrc","none");
	modePage2.put("actionImgPos","left");
	String customStyles = null;
	String pyLabel = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty("D_BrowseProperties.pyBrowsePages(<LAST>).pyLabel");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("D_BrowseProperties.pyBrowsePages(<LAST>).pyLabel", ".pyButtonLabel");
	pyLabel = "D_BrowseProperties.pyBrowsePages(<LAST>).pyLabel";
	modePage2.put("pyLabel",pyLabel);
	modePage2.put("captionType","propertyReference");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	modePage2.put("pyFormatTypeActionable","none");
	String pyFormatValue = "";
	modePage2.put("pyFormatValue",pyFormatValue);
	String spxUniqueStreamHash37 = getUIActionsMetaData_4();
	if(spxUniqueStreamHash37 != null && !"".equals(spxUniqueStreamHash37)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash37,pxUniqueStreamHash+"_37");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_37");
	}
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_link.js");
	ctrlComponent.beginComponent("pxLink",metadataPage);
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
		 String buttonUID = "name='pxBrowseProperties_"+ referenceString+ "_19'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty("D_BrowseProperties.pyBrowsePages(<LAST>).pyLabel"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty("D_BrowseProperties.pyBrowsePages(<LAST>).pyLabel").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141108010353014515756") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
		com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
		actionRequestD.registerFixedParameter("pyModelName","pzPushAndPop");
			String usingPageString = "";
			usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
			tools.appendString("[\"runDataTransform\", [\"pzPushAndPop\", \"PushOrPull=pop");
			actionRequestD.registerFixedParameter("PushOrPull","pop");
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
			pzPackageRuntime.packageDataTransform(contextClass, "pzPushAndPop");
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
									pzPackageRuntime.packageSection("pxBrowseProperties",
									tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
									}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
									}
									refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
									refreshActionRequest.registerFixedParameter("SectionName", "");
									refreshActionRequest.registerFixedParameter("PreActivity", "pzBrowseProperties");
									staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
									staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
									staticURLStr.append("&PreActivity=pzBrowseProperties");
									tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzBrowseProperties\", \"");
									refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
									preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"ClassName\":\"\"");
									preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
									tools.appendString("\", \"\", \",");
									refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
									tools.appendString("\",\":event\",\"1\",[\"");
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
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }											{
												com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
												actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
												com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
												actionRequestD.registerFixedParameter("pyModelName","pzPushAndPop");
													String usingPageString = "";
													usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
													tools.appendString("[\"runDataTransform\", [\"pzPushAndPop\", \"PushOrPull=pop");
													actionRequestD.registerFixedParameter("PushOrPull","pop");
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
													pzPackageRuntime.packageDataTransform(contextClass, "pzPushAndPop");
													}
														pzAuto.registerActionRequest(actionRequest);
														}
														tools.appendString("\",\":event\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }															{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
																com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
																	StringBuffer staticURLStr = new StringBuffer();
																	StringBuffer preActParamStr = new StringBuffer();
																	StringBuffer preDTParamStr = new StringBuffer();
																	String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
																	tools.putParamValue("runTimeSecStreamName", "");
																	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
																		try{
																			pzPackageRuntime.packageSection("pxBrowseProperties",
																			tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
																			}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
																			}
																			refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
																			refreshActionRequest.registerFixedParameter("SectionName", "");
																			refreshActionRequest.registerFixedParameter("PreActivity", "pzBrowseProperties");
																			staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
																			staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
																			staticURLStr.append("&PreActivity=pzBrowseProperties");
																			tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzBrowseProperties\", \"");
																			refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																			preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"ClassName\":\"\"");
																			preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
																			tools.appendString("\", \"\", \",");
																			refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																			tools.appendString("\",\":event\",\"1\",[\"");
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
		}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","View fields in parent object\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString(" class='Article_heading");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty("D_BrowseProperties.pyBrowsePages(<LAST>).pyLabel").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");																				}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }																				tools.putParamValue("doAutoFormatting", "false");
																				tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}																				} catch (Exception e) {

																				
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'																				&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }																					}


}



public int simpleLayoutCell_9( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxLink","D_BrowseProperties.pyBrowsePages(<LAST>).pyLabel",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "    " + pzSection.getCustomStyle(false, "","clickable","clickable")  + " '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxLink_1();
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141108010353014515756-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxLink");
	pgCells.put("forLabel","D_BrowseProperties.pyBrowsePages(<LAST>).pyLabel");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("customROStyles","clickable");
	pgCells.put("customRWStyles","clickable");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxLink","D_BrowseProperties.pyBrowsePages(<LAST>).pyLabel",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxLink_1();labelName = "";
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
public void pzSetExpandParam_7() {
pzSection.getLayout().setExpandParam("SubSectionpxBrowsePropertiesBBBBBBB","",false);
}


public void simpleLayout_5() {
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201712211824440837339") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + " class='" + " content  set-width-auto layout-content-inline_middle content-inline_middle  clearfix" + "'  " + "role='presentation' tabindex='-1' ");
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
		pg_dlmeta.put("skipTarget"," tabindex='-1' ");
		pg_dlmeta.put("class","set-width-auto clearfix");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("ariaRole","presentation");
		pg_dlmeta.put("ariaRoleType","document");
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_9(index);
	}else{
		index=simpleLayoutTemplateCell_9(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
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
	String paramName = "EXPANDEDSubSectionpxBrowsePropertiesBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","17");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_5();
	containerComponent.endComponent();
	}
public void pzLayout_5() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_7();
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
public String 
getUIActionsMetaData_4() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
		com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
		actionRequestD.registerFixedParameter("pyModelName","pzPushAndPop");
			String usingPageString = "";
			usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
			tools.appendString("[\"runDataTransform\", [\"pzPushAndPop\", \"PushOrPull=pop");
			actionRequestD.registerFixedParameter("PushOrPull","pop");
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
			pzPackageRuntime.packageDataTransform(contextClass, "pzPushAndPop");
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
									pzPackageRuntime.packageSection("pxBrowseProperties",
									tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
									}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
									}
									refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
									refreshActionRequest.registerFixedParameter("SectionName", "");
									refreshActionRequest.registerFixedParameter("PreActivity", "pzBrowseProperties");
									staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
									staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
									staticURLStr.append("&PreActivity=pzBrowseProperties");
									tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzBrowseProperties\", \"");
									refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
									preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"ClassName\":\"\"");
									preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
									tools.appendString("\", \"\", \",");
									refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
									tools.appendString("\",\":event\",\"1\",[\"");
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
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }											{
												com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
												actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
												com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
												actionRequestD.registerFixedParameter("pyModelName","pzPushAndPop");
													String usingPageString = "";
													usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
													tools.appendString("[\"runDataTransform\", [\"pzPushAndPop\", \"PushOrPull=pop");
													actionRequestD.registerFixedParameter("PushOrPull","pop");
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
													pzPackageRuntime.packageDataTransform(contextClass, "pzPushAndPop");
													}
														pzAuto.registerActionRequest(actionRequest);
														}
														tools.appendString("\",\":event\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }															{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
																com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
																	StringBuffer staticURLStr = new StringBuffer();
																	StringBuffer preActParamStr = new StringBuffer();
																	StringBuffer preDTParamStr = new StringBuffer();
																	String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
																	tools.putParamValue("runTimeSecStreamName", "");
																	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
																		try{
																			pzPackageRuntime.packageSection("pxBrowseProperties",
																			tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
																			}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
																			}
																			refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
																			refreshActionRequest.registerFixedParameter("SectionName", "");
																			refreshActionRequest.registerFixedParameter("PreActivity", "pzBrowseProperties");
																			staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
																			staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
																			staticURLStr.append("&PreActivity=pzBrowseProperties");
																			tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzBrowseProperties\", \"");
																			refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																			preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"ClassName\":\"\"");
																			preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
																			tools.appendString("\", \"\", \",");
																			refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																			tools.appendString("\",\":event\",\"1\",[\"");
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
		}																					String returnString = actionsStringBuilder.toString();
																					tools.popStreamBody();
																					return returnString;
																				}


public void pxIcon_3() {boolean isDisplayTextWithParam = false;
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
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.put("generateName","true");
	cellPage.put("pyStreamName","pxBrowseProperties");
	cellPage.put("pyCellID","16");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDataPageInfo();
	String repeatIndx = "";
	boolean disable = false;
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	modePage1.put("helpertype","none");
	modePage1.put("isActionabale","true");
	modePage1.put("isClickable","true");
	String pyFormatValue = "";
	StringMap whenHc=new HashStringMap();
	whenHc.putString("pyBlockName", "pyIsHybridClient");
	String classProp = "";
	classProp ="pi pi-caret-left";
	modePage1.put("class",classProp);
	if(disable){
	modePage1.put("pyDisabled",disable+"");
	}
	modePage1.put("iconSrc","styleclass");
	modePage1.put("pyFormatTypeActionable","none");
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20141108010353014515756") + " ");
	String spxUniqueStreamHash30 = getUIActionsMetaData_4();
	if(spxUniqueStreamHash30 != null && !"".equals(spxUniqueStreamHash30)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash30,pxUniqueStreamHash+"_30");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_30");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_icon.js");
	ctrlComponent.beginComponent("pxIcon",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {

		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pxBrowseProperties_"+ referenceString+ "_16'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String classProp = "";
		 classProp ="pi pi-caret-left";
		tools.appendString("<i  " + pzCell.getTestIdIfEnabled("20141108010353014515756") + "  href='' onclick='pd(event);' data-ctl='Icon' "); tools.appendString(" class='");
		tools.appendString(" icons "+classProp+"' ");
		tools.appendString("tabindex='0' role='link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" alt= ''");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
			com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
			actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
			com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
			actionRequestD.registerFixedParameter("pyModelName","pzPushAndPop");
				String usingPageString = "";
				usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
				tools.appendString("[\"runDataTransform\", [\"pzPushAndPop\", \"PushOrPull=pop");
				actionRequestD.registerFixedParameter("PushOrPull","pop");
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
				pzPackageRuntime.packageDataTransform(contextClass, "pzPushAndPop");
				}
					pzAuto.registerActionRequest(actionRequest);
					}
					tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }						{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
							com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
								StringBuffer staticURLStr = new StringBuffer();
								StringBuffer preActParamStr = new StringBuffer();
								StringBuffer preDTParamStr = new StringBuffer();
								String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
								tools.putParamValue("runTimeSecStreamName", "");
								if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
									try{
										pzPackageRuntime.packageSection("pxBrowseProperties",
										tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
										}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
										}
										refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
										refreshActionRequest.registerFixedParameter("SectionName", "");
										refreshActionRequest.registerFixedParameter("PreActivity", "pzBrowseProperties");
										staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
										staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
										staticURLStr.append("&PreActivity=pzBrowseProperties");
										tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzBrowseProperties\", \"");
										refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
										preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"ClassName\":\"\"");
										preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
										tools.appendString("\", \"\", \",");
										refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
										tools.appendString("\",\":event\",\"1\",[\"");
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
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }												{
													com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
													actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
													com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
													actionRequestD.registerFixedParameter("pyModelName","pzPushAndPop");
														String usingPageString = "";
														usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
														tools.appendString("[\"runDataTransform\", [\"pzPushAndPop\", \"PushOrPull=pop");
														actionRequestD.registerFixedParameter("PushOrPull","pop");
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
														pzPackageRuntime.packageDataTransform(contextClass, "pzPushAndPop");
														}
															pzAuto.registerActionRequest(actionRequest);
															}
															tools.appendString("\",\":event\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }																{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
																	com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
																		StringBuffer staticURLStr = new StringBuffer();
																		StringBuffer preActParamStr = new StringBuffer();
																		StringBuffer preDTParamStr = new StringBuffer();
																		String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
																		tools.putParamValue("runTimeSecStreamName", "");
																		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
																			try{
																				pzPackageRuntime.packageSection("pxBrowseProperties",
																				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
																				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
																				}
																				refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
																				refreshActionRequest.registerFixedParameter("SectionName", "");
																				refreshActionRequest.registerFixedParameter("PreActivity", "pzBrowseProperties");
																				staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
																				staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
																				staticURLStr.append("&PreActivity=pzBrowseProperties");
																				tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzBrowseProperties\", \"");
																				refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																				preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"ClassName\":\"\"");
																				preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
																				tools.appendString("\", \"\", \",");
																				refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																				tools.appendString("\",\":event\",\"1\",[\"");
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
		}
			tools.appendString(" ></i>");
		}																						}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }																						tools.putParamValue("doAutoFormatting", "false");
																						tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}																						} catch (Exception e) {

																						
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'																						&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }																							}


}



public int simpleLayoutCell_7( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing    " + pzSection.getCustomStyle(false, "","clickable","clickable")  + " " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxIcon_3();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("partialClass","remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141108010353014515756-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxIcon");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","clickable");
	pgCells.put("customRWStyles","clickable");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxIcon_3();labelName = "";
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
pzSection.getLayout().setExpandParam("SubSectionpxBrowsePropertiesBBBBBB","",false);
}


public void simpleLayout_4() {
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
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201712211824440837391") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + "flex  content  set-width-auto layout-content-inline_middle content-inline_middle " + "'  " + "role='presentation' tabindex='-1' ");
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
		pg_dlmeta.put("skipTarget"," tabindex='-1' ");
		pg_dlmeta.put("class","set-width-auto");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("ariaRole","presentation");
		pg_dlmeta.put("ariaRoleType","document");
		pg_dlmeta.put("isDLChild","true");
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
	String paramName = "EXPANDEDSubSectionpxBrowsePropertiesBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","14");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Flexbox");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_4();
	containerComponent.endComponent();
	}
public void pzLayout_4() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_6();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_6();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_4();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_3() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();layoutBody_2();
}
public void pzLayoutBodyWrapper_5() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();layoutBody_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void layoutBody_2() { 
tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)") + "  section_index='1'   cellpadding='0' cellspacing='0' ID='' width='100%'>\n\t\t\t\t\t\t\t</table>");
 } 
public String 
getUIActionsMetaData_3() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzAddField");
		tools.appendString("[\"runActivity\", [\"\", \"");
		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"Context\":\"Header\"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }			{
				StringBuffer ractURLStr = new StringBuffer();
				StringBuffer ractParamStr = new StringBuffer();
				ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzAddField");
				tools.appendString("[\"runActivity\", [\"\", \"");
				ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
				ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"Context\":\"Header\"");
				ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
				tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
				if(!"".equals(ractParamStr.toString())) {
					ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
					}
					tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
					}
					tools.appendString("\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}					String returnString = actionsStringBuilder.toString();
					tools.popStreamBody();
					return returnString;
				}


public void pxIcon_2() {boolean isDisplayTextWithParam = false;
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
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.put("generateName","true");
	cellPage.put("pyStreamName","pxBrowseProperties");
	cellPage.put("pyCellID","12");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDataPageInfo();
	String repeatIndx = "";
	boolean disable = false;
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Add object to form\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Add object to form", ".pyActionPrompt");
	}
	pyTooltip = "Add object to form";
	modePage1.put("tooltip",pyTooltip);
	modePage1.put("helpertype","tooltip");
	modePage1.put("isActionabale","true");
	modePage1.put("isClickable","true");
	String pyFormatValue = "";
	StringMap whenHc=new HashStringMap();
	whenHc.putString("pyBlockName", "pyIsHybridClient");
	String classProp = "";
	classProp ="pi pi-plus-circle";
	modePage1.put("class",classProp);
	if(disable){
	modePage1.put("pyDisabled",disable+"");
	}
	modePage1.put("iconSrc","styleclass");
	modePage1.put("pyFormatTypeActionable","none");
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("201412112346280604357151") + " ");
	String spxUniqueStreamHash22 = getUIActionsMetaData_3();
	if(spxUniqueStreamHash22 != null && !"".equals(spxUniqueStreamHash22)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash22,pxUniqueStreamHash+"_22");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_22");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_icon.js");
	ctrlComponent.beginComponent("pxIcon",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {

		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pxBrowseProperties_"+ referenceString+ "_12'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Add object to form\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		String alttempText = tools.getLocalizedTextForString(".pyActionPrompt","Add object to form\t" + repeatIndx ,StreamBuilder.FMT_LITERAL);
		String classProp = "";
		 classProp ="pi pi-plus-circle";
		tools.appendString("<i  " + pzCell.getTestIdIfEnabled("201412112346280604357151") + "  href='' onclick='pd(event);' data-ctl='Icon' "); tools.appendString(" class='");
		tools.appendString(" icons "+classProp+"' ");
		tools.appendString("tabindex='0' role='link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
			tools.appendString(" alt= '");
			tools.appendString(alttempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
			StringBuffer ractURLStr = new StringBuffer();
			StringBuffer ractParamStr = new StringBuffer();
			ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzAddField");
			tools.appendString("[\"runActivity\", [\"\", \"");
			ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
			ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"Context\":\"Header\"");
			ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
			tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
			if(!"".equals(ractParamStr.toString())) {
				ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
				}
				tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
				}
				tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }				{
					StringBuffer ractURLStr = new StringBuffer();
					StringBuffer ractParamStr = new StringBuffer();
					ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzAddField");
					tools.appendString("[\"runActivity\", [\"\", \"");
					ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
					ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"Context\":\"Header\"");
					ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
					tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
					if(!"".equals(ractParamStr.toString())) {
						ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
						}
						tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
						}
						tools.appendString("\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></i>");
		}						}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }						tools.putParamValue("doAutoFormatting", "false");
						tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}						} catch (Exception e) {

						
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'						&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }							}


}



public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxpzObjectNotSelected","pzObjectNotSelected","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-right-spacing    " + pzSection.getCustomStyle(false, "","clickable show-on-hover","clickable show-on-hover")  + " '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxIcon_2();
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
	pgCells.put("partialClass","remove-right-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201412112346280604357151-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxIcon");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("customROStyles","clickable show-on-hover");
	pgCells.put("customRWStyles","clickable show-on-hover");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpzObjectNotSelected",pxUniqueStreamHash+"_24");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_24");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pzObjectNotSelected");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","@baseclass");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_24");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpzObjectNotSelected", pxUniqueStreamHash+"_24"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxIcon_2();}
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
public void pzSetExpandParam_5() {
pzSection.getLayout().setExpandParam("SubSectionpxBrowsePropertiesBBBBB","",false);
}


public void simpleLayout_3() {
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
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201712211824440836829") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + " content  set-width-auto layout-content-inline_middle content-inline_middle  clearfix" + "'  " + "role='presentation' tabindex='-1' ");
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
		pg_dlmeta.put("skipTarget"," tabindex='-1' ");
		pg_dlmeta.put("class","set-width-auto clearfix");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("ariaRole","presentation");
		pg_dlmeta.put("ariaRoleType","document");
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
	String paramName = "EXPANDEDSubSectionpxBrowsePropertiesBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","10");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" wxpzDisplayAddObjectIcon", pxUniqueStreamHash+"_25");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Inline-block");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_25");
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
if(pzAuto.handleEvaluateWhen(" wxpzDisplayAddObjectIcon","pzDisplayAddObjectIcon", "layout", "visible" )) {pzSetExpandParam_5();
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
	if(!pzAuto.handleEvaluateWhen(" wxpzDisplayAddObjectIcon","pzDisplayAddObjectIcon","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " float-right set-width-auto   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner set-width-auto'>");
	pzLayout_3();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
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
	pgCells.put("partialClass","float-right set-width-auto");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	isExpression = false;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpzDisplayAddObjectIcon",pxUniqueStreamHash+"_27");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_27");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pzDisplayAddObjectIcon");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","@baseclass");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_27");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpzDisplayAddObjectIcon", pxUniqueStreamHash+"_27"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_3();
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


public int simpleLayoutCell_8( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " float-left set-width-auto   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner set-width-auto'>");
	pzLayout_4();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
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
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","float-left set-width-auto");
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
	pzLayout_4();
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


public int simpleLayoutCell_10( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " float-left set-width-auto   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner set-width-auto'>");
	pzLayout_5();
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
	pgCells.put("partialClass","float-left set-width-auto");
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
	pzLayout_5();
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
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpxBrowsePropertiesBBBB","",false);
}


public void simpleLayout_6() {
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
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201712211824440836926") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + " content  auto-width-column layout-content-inline_middle content-inline_middle container-hover reuse-gadget-text-header" + "'  ");
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
		pg_dlmeta.put("customClassName","container-hover reuse-gadget-text-header");
		pg_dlmeta.put("class","auto-width-column");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
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
		index=simpleLayoutCell_8(index);
	}else{
		index=simpleLayoutTemplateCell_8(index);
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
	String paramName = "EXPANDEDSubSectionpxBrowsePropertiesBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","8");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o1! wxpzIsBrowseFieldsSearch wxpzAreBrowsePagesExist", pxUniqueStreamHash+"_42");metadataPage.put("dlChild","true");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_42");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_6();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_6() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o1! wxpzIsBrowseFieldsSearch wxpzAreBrowsePagesExist","!pzIsBrowseFieldsSearch && pzAreBrowsePagesExist", "layout", "visible" )) {pzSetExpandParam_4();
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
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();layoutBody_1();
}
public void pzLayoutBodyWrapper_4() {
tools.appendString("<div class='layout layout-noheader layout-noheader-explorer_list_item'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();layoutBody_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void layoutBody_1() { 
tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)") + "  section_index='1'   cellpadding='0' cellspacing='0' ID='' width='100%'>\n\t\t\t\t\t\t\t</table>");
 } 
public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
				tools.putParamValue("runTimeSecStreamName", "");
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					try{
						pzPackageRuntime.packageSection("pxBrowseProperties",
						tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
						}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
						}
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("SectionName", "");
						refreshActionRequest.registerFixedParameter("PreActivity", "pzSearchBrowseFields");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
						staticURLStr.append("&PreActivity=pzSearchBrowseFields");
						tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzSearchBrowseFields\", \"");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						tools.appendString("=\", \"\", \",");
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

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty("D_BrowseProperties.pySearchText").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty("D_BrowseProperties.pySearchText").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }								{
									com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
									actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
									com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
									actionRequestD.registerFixedParameter("pyModelName","pzPushAndPop");
										String usingPageString = "";
										usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
										tools.appendString("[\"runDataTransform\", [\"pzPushAndPop\", \"PushOrPull=clearsearch");
										actionRequestD.registerFixedParameter("PushOrPull","clearsearch");
										tools.appendString("&PageClass=");
										actionRequestD.registerFixedParameter("PageClass","");
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
										pzPackageRuntime.packageDataTransform(contextClass, "pzPushAndPop");
										}
											pzAuto.registerActionRequest(actionRequest);
											}
											tools.appendString("\",\":event\"]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty("D_BrowseProperties.pySearchText").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty("D_BrowseProperties.pySearchText").getStringValue(),"=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }												{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
													com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
														StringBuffer staticURLStr = new StringBuffer();
														StringBuffer preActParamStr = new StringBuffer();
														StringBuffer preDTParamStr = new StringBuffer();
														String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
														tools.putParamValue("runTimeSecStreamName", "");
														if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
															try{
																pzPackageRuntime.packageSection("pxBrowseProperties",
																tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
																}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
																}
																refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
																refreshActionRequest.registerFixedParameter("SectionName", "");
																refreshActionRequest.registerFixedParameter("PreActivity", "pzBrowseProperties");
																staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
																staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
																staticURLStr.append("&PreActivity=pzBrowseProperties");
																tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzBrowseProperties\", \"");
																refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
																preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"AddActivity\":\"\"");
																tools.appendString("\", \"\", \",");
																refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																tools.appendString("\",\":event\",\"1\",[\"");
																if(!"".equals(preActParamStr.toString())) {
																	staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
																	}
																	if(!"".equals(preDTParamStr.toString())) {
																		staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
																		}
																		tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
																		pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty("D_BrowseProperties.pySearchText").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty("D_BrowseProperties.pySearchText").getStringValue(),"=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }																			{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
																				com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
																					StringBuffer staticURLStr = new StringBuffer();
																					StringBuffer preActParamStr = new StringBuffer();
																					StringBuffer preDTParamStr = new StringBuffer();
																					String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
																					tools.putParamValue("runTimeSecStreamName", "");
																					if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
																						try{
																							pzPackageRuntime.packageSection("pxBrowseProperties",
																							tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
																							}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
																							}
																							refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
																							refreshActionRequest.registerFixedParameter("SectionName", "");
																							refreshActionRequest.registerFixedParameter("PreActivity", "pzSearchBrowseFields");
																							staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
																							staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
																							staticURLStr.append("&PreActivity=pzSearchBrowseFields");
																							tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzSearchBrowseFields\", \"");
																							refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																							tools.appendString("=\", \"\", \",");
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

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty("D_BrowseProperties.pySearchText").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty("D_BrowseProperties.pySearchText").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }																									{
																										com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
																										actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
																										com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
																										actionRequestD.registerFixedParameter("pyModelName","pzPushAndPop");
																											String usingPageString = "";
																											usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
																											tools.appendString("[\"runDataTransform\", [\"pzPushAndPop\", \"PushOrPull=clearsearch");
																											actionRequestD.registerFixedParameter("PushOrPull","clearsearch");
																											tools.appendString("&PageClass=");
																											actionRequestD.registerFixedParameter("PageClass","");
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
																											pzPackageRuntime.packageDataTransform(contextClass, "pzPushAndPop");
																											}
																												pzAuto.registerActionRequest(actionRequest);
																												}
																												tools.appendString("\",\":event\"]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty("D_BrowseProperties.pySearchText").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty("D_BrowseProperties.pySearchText").getStringValue(),"=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }																													{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
																														com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
																															StringBuffer staticURLStr = new StringBuffer();
																															StringBuffer preActParamStr = new StringBuffer();
																															StringBuffer preDTParamStr = new StringBuffer();
																															String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
																															tools.putParamValue("runTimeSecStreamName", "");
																															if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
																																try{
																																	pzPackageRuntime.packageSection("pxBrowseProperties",
																																	tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
																																	}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
																																	}
																																	refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
																																	refreshActionRequest.registerFixedParameter("SectionName", "");
																																	refreshActionRequest.registerFixedParameter("PreActivity", "pzBrowseProperties");
																																	staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
																																	staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
																																	staticURLStr.append("&PreActivity=pzBrowseProperties");
																																	tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzBrowseProperties\", \"");
																																	refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																																	preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
																																	preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"AddActivity\":\"\"");
																																	tools.appendString("\", \"\", \",");
																																	refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																																	tools.appendString("\",\":event\",\"1\",[\"");
																																	if(!"".equals(preActParamStr.toString())) {
																																		staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
																																		}
																																		if(!"".equals(preDTParamStr.toString())) {
																																			staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
																																			}
																																			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
																																			pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty("D_BrowseProperties.pySearchText").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty("D_BrowseProperties.pySearchText").getStringValue(),"=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}																																			String returnString = actionsStringBuilder.toString();
																																			tools.popStreamBody();
																																			return returnString;
																																		}


public void pxIcon_1() {boolean isDisplayTextWithParam = false;
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
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.put("generateName","true");
	cellPage.put("pyStreamName","pxBrowseProperties");
	cellPage.put("pyCellID","6");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDataPageInfo();
	String repeatIndx = "";
	boolean disable = false;
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	modePage1.put("helpertype","none");
	modePage1.put("isActionabale","true");
	modePage1.put("isClickable","true");
	String pyFormatValue = "";
	StringMap whenHc=new HashStringMap();
	whenHc.putString("pyBlockName", "pyIsHybridClient");
	String classProp = "";
	classProp ="pi pi-search";
	modePage1.put("class",classProp);
	if(disable){
	modePage1.put("pyDisabled",disable+"");
	}
	modePage1.put("iconSrc","styleclass");
	modePage1.put("pyFormatTypeActionable","none");
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("2014112702152903875463") + " ");
	String spxUniqueStreamHash14 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash14 != null && !"".equals(spxUniqueStreamHash14)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash14,pxUniqueStreamHash+"_14");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_14");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_icon.js");
	ctrlComponent.beginComponent("pxIcon",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {

		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pxBrowseProperties_"+ referenceString+ "_6'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String classProp = "";
		 classProp ="pi pi-search";
		tools.appendString("<i  " + pzCell.getTestIdIfEnabled("2014112702152903875463") + "  href='' onclick='pd(event);' data-ctl='Icon' "); tools.appendString(" class='");
		tools.appendString(" icons "+classProp+"' ");
		tools.appendString("tabindex='0' role='link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" alt= ''");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }			{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
				com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
					StringBuffer staticURLStr = new StringBuffer();
					StringBuffer preActParamStr = new StringBuffer();
					StringBuffer preDTParamStr = new StringBuffer();
					String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
					tools.putParamValue("runTimeSecStreamName", "");
					if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
						try{
							pzPackageRuntime.packageSection("pxBrowseProperties",
							tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
							}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
							}
							refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
							refreshActionRequest.registerFixedParameter("SectionName", "");
							refreshActionRequest.registerFixedParameter("PreActivity", "pzSearchBrowseFields");
							staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
							staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
							staticURLStr.append("&PreActivity=pzSearchBrowseFields");
							tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzSearchBrowseFields\", \"");
							refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
							tools.appendString("=\", \"\", \",");
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

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty("D_BrowseProperties.pySearchText").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty("D_BrowseProperties.pySearchText").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }									{
										com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
										actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
										com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
										actionRequestD.registerFixedParameter("pyModelName","pzPushAndPop");
											String usingPageString = "";
											usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
											tools.appendString("[\"runDataTransform\", [\"pzPushAndPop\", \"PushOrPull=clearsearch");
											actionRequestD.registerFixedParameter("PushOrPull","clearsearch");
											tools.appendString("&PageClass=");
											actionRequestD.registerFixedParameter("PageClass","");
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
											pzPackageRuntime.packageDataTransform(contextClass, "pzPushAndPop");
											}
												pzAuto.registerActionRequest(actionRequest);
												}
												tools.appendString("\",\":event\"]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty("D_BrowseProperties.pySearchText").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty("D_BrowseProperties.pySearchText").getStringValue(),"=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }													{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
														com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
															StringBuffer staticURLStr = new StringBuffer();
															StringBuffer preActParamStr = new StringBuffer();
															StringBuffer preDTParamStr = new StringBuffer();
															String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
															tools.putParamValue("runTimeSecStreamName", "");
															if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
																try{
																	pzPackageRuntime.packageSection("pxBrowseProperties",
																	tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
																	}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
																	}
																	refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
																	refreshActionRequest.registerFixedParameter("SectionName", "");
																	refreshActionRequest.registerFixedParameter("PreActivity", "pzBrowseProperties");
																	staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
																	staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
																	staticURLStr.append("&PreActivity=pzBrowseProperties");
																	tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzBrowseProperties\", \"");
																	refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																	preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
																	preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"AddActivity\":\"\"");
																	tools.appendString("\", \"\", \",");
																	refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																	tools.appendString("\",\":event\",\"1\",[\"");
																	if(!"".equals(preActParamStr.toString())) {
																		staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
																		}
																		if(!"".equals(preDTParamStr.toString())) {
																			staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
																			}
																			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
																			pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty("D_BrowseProperties.pySearchText").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty("D_BrowseProperties.pySearchText").getStringValue(),"=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }																				{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
																					com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
																						StringBuffer staticURLStr = new StringBuffer();
																						StringBuffer preActParamStr = new StringBuffer();
																						StringBuffer preDTParamStr = new StringBuffer();
																						String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
																						tools.putParamValue("runTimeSecStreamName", "");
																						if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
																							try{
																								pzPackageRuntime.packageSection("pxBrowseProperties",
																								tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
																								}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
																								}
																								refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
																								refreshActionRequest.registerFixedParameter("SectionName", "");
																								refreshActionRequest.registerFixedParameter("PreActivity", "pzSearchBrowseFields");
																								staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
																								staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
																								staticURLStr.append("&PreActivity=pzSearchBrowseFields");
																								tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzSearchBrowseFields\", \"");
																								refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																								tools.appendString("=\", \"\", \",");
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

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty("D_BrowseProperties.pySearchText").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty("D_BrowseProperties.pySearchText").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }																										{
																											com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
																											actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
																											com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
																											actionRequestD.registerFixedParameter("pyModelName","pzPushAndPop");
																												String usingPageString = "";
																												usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
																												tools.appendString("[\"runDataTransform\", [\"pzPushAndPop\", \"PushOrPull=clearsearch");
																												actionRequestD.registerFixedParameter("PushOrPull","clearsearch");
																												tools.appendString("&PageClass=");
																												actionRequestD.registerFixedParameter("PageClass","");
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
																												pzPackageRuntime.packageDataTransform(contextClass, "pzPushAndPop");
																												}
																													pzAuto.registerActionRequest(actionRequest);
																													}
																													tools.appendString("\",\":event\"]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty("D_BrowseProperties.pySearchText").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty("D_BrowseProperties.pySearchText").getStringValue(),"=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }																														{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
																															com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
																																StringBuffer staticURLStr = new StringBuffer();
																																StringBuffer preActParamStr = new StringBuffer();
																																StringBuffer preDTParamStr = new StringBuffer();
																																String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
																																tools.putParamValue("runTimeSecStreamName", "");
																																if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
																																	try{
																																		pzPackageRuntime.packageSection("pxBrowseProperties",
																																		tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
																																		}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
																																		}
																																		refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
																																		refreshActionRequest.registerFixedParameter("SectionName", "");
																																		refreshActionRequest.registerFixedParameter("PreActivity", "pzBrowseProperties");
																																		staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
																																		staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pxBrowseProperties"));
																																		staticURLStr.append("&PreActivity=pzBrowseProperties");
																																		tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzBrowseProperties\", \"");
																																		refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																																		preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"SourcePage\":\"\"");
																																		preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"AddActivity\":\"\"");
																																		tools.appendString("\", \"\", \",");
																																		refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
																																		tools.appendString("\",\":event\",\"1\",[\"");
																																		if(!"".equals(preActParamStr.toString())) {
																																			staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
																																			}
																																			if(!"".equals(preDTParamStr.toString())) {
																																				staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
																																				}
																																				tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
																																				pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty("D_BrowseProperties.pySearchText").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty("D_BrowseProperties.pySearchText").getStringValue(),"=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></i>");
		}																																				}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }																																				tools.putParamValue("doAutoFormatting", "false");
																																				tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}																																				} catch (Exception e) {

																																				
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'																																				&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }																																					}


}



public void pxTextInput_1() {String key="5||RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","false");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "","","","","false","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","0","","","Text","true","5"};oCellRuntimeParamsMap.put("5||RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT",paramValues);oControlPathsMap.put("5||RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");}


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxTextInput","D_BrowseProperties.pySearchText",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-bottom-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxTextInput_1();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("partialClass","remove-bottom-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141112014509021959544-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxTextInput");
	pgCells.put("forLabel","D_BrowseProperties.pySearchText");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("pyGenerateUniqueIdForLabel","false");
	pgCells.put("spanClass","iconRequired _iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("labelReadClass","dataLabelForRead _dataLabelForRead");
	pgCells.put("labelWriteClass","dataLabelForWrite _dataLabelForWrite");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	pgCells.put("pyReadOnlyWhenCond","Editable");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxTextInput","D_BrowseProperties.pySearchText",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxTextInput_1();labelName = "";
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


public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-bottom-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxIcon_1();
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
	pgCells.put("partialClass","remove-bottom-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014112702152903875463-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxIcon");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxIcon_1();labelName = "";
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
pzSection.getLayout().setExpandParam("SubSectionpxBrowsePropertiesBBB","",false);
}


public void simpleLayout_2() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash10 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash10 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash10 != null && !"".equals(spxUniqueStreamHash10)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash10,pxUniqueStreamHash+"_10");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201712211824440835518") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + " content  set-width-auto layout-content-inline_middle content-inline_middle nowrap clearfix" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash10 != null && !"".equals(spxUniqueStreamHash10)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_10");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","nowrap");
		pg_dlmeta.put("class","set-width-auto clearfix");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
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
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_3(index);
	}else{
		index=simpleLayoutTemplateCell_3(index);
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
	String paramName = "EXPANDEDSubSectionpxBrowsePropertiesBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-explorer_list_item");
	metadataPage.put("sectionIndex","3");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_2();
	containerComponent.endComponent();
	}
public void pzLayout_2() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_3();
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


public int simpleLayoutCell_4( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " set-width-auto   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner set-width-auto'>");
	pzLayout_2();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","set-width-auto");
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


public int simpleLayoutCell_11( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o1! wxpzIsBrowseFieldsSearch wxpzAreBrowsePagesExist","!pzIsBrowseFieldsSearch && pzAreBrowsePagesExist","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner '>");
	pzLayout_6();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o1! wxpzIsBrowseFieldsSearch wxpzAreBrowsePagesExist",pxUniqueStreamHash+"_44");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_44");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","!pzIsBrowseFieldsSearch && pzAreBrowsePagesExist");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","@baseclass");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_44");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o1! wxpzIsBrowseFieldsSearch wxpzAreBrowsePagesExist", pxUniqueStreamHash+"_44"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_6();
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


public int simpleLayoutCell_14( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxpzIsBrowseFieldsSearch","pzIsBrowseFieldsSearch","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner '>");
	pzLayout_7();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
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
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	isExpression = false;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpzIsBrowseFieldsSearch",pxUniqueStreamHash+"_54");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_54");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pzIsBrowseFieldsSearch");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","@baseclass");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_54");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpzIsBrowseFieldsSearch", pxUniqueStreamHash+"_54"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_7();
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


public int simpleLayoutCell_16( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqfields","D_BrowseProperties.pxResultCount = 0 && D_BrowseProperties.pyBrowseContext == \'fields\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner '>");
	pzLayout_8();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_16( int index) {
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
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqfields",pxUniqueStreamHash+"_60");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_60");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","D_BrowseProperties.pxResultCount = 0 && D_BrowseProperties.pyBrowseContext == 'fields'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","@baseclass");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_60");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqfields", pxUniqueStreamHash+"_60"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_8();
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


public int simpleLayoutCell_18( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqforms","D_BrowseProperties.pxResultCount = 0 && D_BrowseProperties.pyBrowseContext == \'forms\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner '>");
	pzLayout_9();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_18( int index) {
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
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqforms",pxUniqueStreamHash+"_66");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_66");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","D_BrowseProperties.pxResultCount = 0 && D_BrowseProperties.pyBrowseContext == 'forms'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","@baseclass");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_66");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqforms", pxUniqueStreamHash+"_66"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_9();
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


public int simpleLayoutCell_20( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqdatatypes","D_BrowseProperties.pxResultCount = 0 && D_BrowseProperties.pyBrowseContext == \'datatypes\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner '>");
	pzLayout_10();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_20( int index) {
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
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqdatatypes",pxUniqueStreamHash+"_72");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_72");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","D_BrowseProperties.pxResultCount = 0 && D_BrowseProperties.pyBrowseContext == 'datatypes'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","@baseclass");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_72");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== rxD_BrowseProperties.pxResultCount ci0 o2== rxD_BrowseProperties.pyBrowseContext cqdatatypes", pxUniqueStreamHash+"_72"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_10();
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


public int simpleLayoutCell_21( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2> rxD_BrowseProperties.pxResultCount ci0","D_BrowseProperties.pxResultCount > 0","cell", "visible" )) {
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner '>");
	
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_73")) ){pzLayout_11();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_21( int index) {
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
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2> rxD_BrowseProperties.pxResultCount ci0",pxUniqueStreamHash+"_75");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_75");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","D_BrowseProperties.pxResultCount > 0");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","@baseclass");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_75");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2> rxD_BrowseProperties.pxResultCount ci0", pxUniqueStreamHash+"_75"); 
	}
	if(pyDLCellVisibility) {
	
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_73")) ){pzLayout_11();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
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
pzSection.getLayout().setExpandParam("SubSectionpxBrowsePropertiesBB","",false);
}


public void simpleLayout_11() {
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
	strMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
	if("".equals(strMethodName)) {
	strMethodName = tools.getParamCSF("pyLayoutMethodName");
	}
	refreshAttributes += "data-refresh=true data-methodName=\"";
	refreshAttributes += strMethodName;
	refreshAttributes +="\""; 
	refreshAttributes += " RWP=\".pyRefreshBrowseGadget\" RW=\"D_BrowseProperties.pyRefreshBrowseGadget Changes\" ";
	
	String strDTransform = "";
	strDTransform = "";
	try{
		if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
			com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking("D_BrowseProperties.pyRefreshBrowseGadget"), -1);
		}
	}catch(Exception e){}
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201712211824440834126") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + " class='" + " content  auto-width-column layout-content-simple_list content-simple_list browse-properties clearfix" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		expressionId = pxUniqueStreamHash+"_9";
		try{
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  "D_BrowseProperties.pyRefreshBrowseGadget Changes", expressionId);
		expressionId = expression.getId();
		}
		catch(ClassCastException e){
		expressionId = "";
		}
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash8 != null && !"".equals(spxUniqueStreamHash8)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_8");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","browse-properties");
		pg_dlmeta.put("class","auto-width-column clearfix");
		pg_dlmeta.put("format","simple_list");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_4(index);
	}else{
		index=simpleLayoutTemplateCell_4(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_11(index);
	}else{
		index=simpleLayoutTemplateCell_11(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_14(index);
	}else{
		index=simpleLayoutTemplateCell_14(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_16(index);
	}else{
		index=simpleLayoutTemplateCell_16(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_18(index);
	}else{
		index=simpleLayoutTemplateCell_18(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_20(index);
	}else{
		index=simpleLayoutTemplateCell_20(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_21(index);
	}else{
		index=simpleLayoutTemplateCell_21(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_11() {
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
	String paramName = "EXPANDEDSubSectionpxBrowsePropertiesBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","2");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_11();
	containerComponent.endComponent();
	}
public void pzLayout_12() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_14();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_11();
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


public void field_pzSetBrowsePropertiesContext_2() { 
try {

/*
 * reference tag
 * Cannot inline because: parameters prevent us from inlining
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__2 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__2.setPageContext(pageContext);
_jspx_th_pega_reference__2.setParent(mParentTag);
_jspx_th_pega_reference__2.setName(".pyTemplateInputBox");
_jspx_th_pega_reference__2.setMode("input");
_jspx_th_pega_reference__2.setFormat("pzSetBrowsePropertiesContext");
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


public void field_pzSetBrowsePropertiesContext_1() { 
try {

/*
 * reference tag
 * Cannot inline because: parameters prevent us from inlining
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__1 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__1.setPageContext(pageContext);
_jspx_th_pega_reference__1.setParent(mParentTag);
_jspx_th_pega_reference__1.setName(".pyTemplateInputBox");
_jspx_th_pega_reference__1.setMode("input");
_jspx_th_pega_reference__1.setFormat("pzSetBrowsePropertiesContext");
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
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pzSetBrowsePropertiesContext",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")) {	field_pzSetBrowsePropertiesContext_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201412030504570521128680-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pzSetBrowsePropertiesContext");
	pgCells.put("forLabel",".pyTemplateInputBox");
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
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("pzSetBrowsePropertiesContext",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_7")) {	field_pzSetBrowsePropertiesContext_2();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();labelName = "";
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
pzSection.getLayout().setExpandParam("SubSectionpxBrowsePropertiesB","",false);
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
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201712211824440834663") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + " content  layout-content-simple_list content-simple_list  clearfix" + "'  ");
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
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","simple_list");
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
	String paramName = "EXPANDEDSubSectionpxBrowsePropertiesB";
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
public void pzLayoutBodyWrapper_2() {

if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_1();gridDoPartialRefresh_1();gridLastRow_1();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pzBrowseProperty_1() {
pzAuto.emitIncludeStreamReference("pzBrowseProperty", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_1() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzBrowseProperty", ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(7).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString(" class='");
	tools.appendString(pzSection.getCustomStyle(false,"","container-hover","container-hover"));tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("height:36px;");tools.appendString(""); tools.appendString("'>");
	if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzBrowseProperty_1();
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


public void D_BrowseProperties_pxResults_1() {
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

					if(tools.getParamValue("partialTrigger").equals("appendToD_BrowseProperties.pxResults1")|| tools.getParamValue("partialTrigger").equals("editRowD_BrowseProperties.pxResults1") ){

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

					ClipboardProperty pageListProp = tools.getProperty("D_BrowseProperties.pxResults");

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

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_BrowseProperties.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 }}catch(Exception e){}

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_BrowseProperties.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_BrowseProperties.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_BrowseProperties.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201704141635220288252-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdropD_BrowseProperties.pxResults1")) {

					
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

					
		 pageListProp = tools.getProperty("D_BrowseProperties.pxResults");

					
		 String strSizeBD= tools.getParamValue("PLSizeBeforeDelete");

					
		 if(!strSizeBD.equals("")){

					
		 int iSizeBeforeDelete = Integer.parseInt(strSizeBD);

					
		 if(iSizeBeforeDelete == pageListProp.size()+1) {

					tools.appendString("\n\t\t\t PEGA_GRID_DELETE||DELETE_SUCCESS||");

					
		 } }

					
			tools.putParamValue("partialRefresh", "false");

					
	 }

					
  } 

					
 if(tools.getParamValue("partialTrigger").equals("filterpopupD_BrowseProperties.pxResults1")) { 

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendToD_BrowseProperties.pxResults1") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty("D_BrowseProperties.pxResults");

					
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

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_BrowseProperties.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_BrowseProperties.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_BrowseProperties.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_BrowseProperties.pxResults"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201704141635220288252-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					 repeatingDataCell_1(); 

					
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
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Rule-HTML-Section.pyTemplateInputBox", new LiteweightPropertyDefinition("Rule-HTML-Section", "pyTemplateInputBox", "sTN", false, true, "Default", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "@baseclass");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pxBrowseProperties");
	oStreamProperties_1.put("pyRuleSetVersion", "08-06-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("pzLayout_11", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_5", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_4", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_6", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_10", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_11", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_9", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_7", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_8", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS PXBROWSEPROPERTIES #20200819T104940.290 GMT", "@baseclass pxBrowseProperties", "Pega-ProcessArchitect", "08-06-01", "20200819T104940.290 GMT");
}
