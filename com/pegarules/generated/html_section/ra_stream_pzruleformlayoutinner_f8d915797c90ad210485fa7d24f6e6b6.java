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
 * Builds JSP stream RULE-OBJ-ACTIVITY!PZRULEFORMLAYOUTINNER.
 */
public class ra_stream_pzruleformlayoutinner_f8d915797c90ad210485fa7d24f6e6b6 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzRuleFormLayoutInner.Rule_Obj_Activity.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -664691840;
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
	public ra_stream_pzruleformlayoutinner_f8d915797c90ad210485fa7d24f6e6b6(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "e79888b98b5da78281fbea36b85eea5eafbdf62e";
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
final PegaThread thread_1 = (PegaThread) pega.getThread();
Date ruleResolutionDate_1 = thread_1.getRuleDateOverride();
if (ruleResolutionDate_1 == null) {
	ruleResolutionDate_1 = new Date();
}
final RuleChooser ruleChooser_1 = ((PegaDatabase) tools.getDatabase()).getRuleChooser(tools.getThread());
/* handling 1 of 2 definitions  */
if (ruleChooser_1.ruleApplies(new RuleCharacteristicsImpl(".pyActivityType", "AUTOMATION", null, RuleResolutionStatistics.CircumstanceType.valueOf("PROPERTY") ,null, null, null, tools))) {
/* Instance RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20191217T071019.403 GMT	Pega-Desktop:08-05-01	.pyActivityType=AUTOMATION	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_1();
/* handling 2 of 2 definitions (isLast)  */
} else {
/* Instance RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20180713T135246.131 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_2();
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
	"Rule-HTML-Section:PZRULEFORMLAYOUTINNER", 
	"Rule-HTML-Section:PZRULEFORMLAYOUTINNER", 
	"Rule-HTML-Property:PXLINK"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZRULEFORMLAYOUTINNER","Rule-HTML-Section","RULE-OBJ-ACTIVITY",false,"","Pega-Desktop","08-01-01","RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20180713T135246.131 GMT","!PZRULEFORMLAYOUTINNER",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-664691840), 
		new DependentRuleInfo("PZRULEFORMLAYOUTINNER","Rule-HTML-Section","RULE-OBJ-ACTIVITY",false,"","Pega-Desktop","08-05-01","RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20191217T071019.403 GMT","!PZRULEFORMLAYOUTINNER",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-459542593), 
		new DependentRuleInfo("PXLINK","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT","PXLINK",true,false,"ABSOLUTE_CLASSLESS",-1085887471)
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
//	RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20191217T071019.403 GMT:20200304T115924.719 GMT
//	RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20180713T135246.131 GMT:20180713T135246.131 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME CURRENTDATETIME #20180713T131432.995 GMT:20180713T131432.995 GMT
//	RULE-UTILITY-FUNCTION DATETIME FORMATDATETIME #20180713T131433.041 GMT:20180713T131433.041 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS DEFERLOADRETRIEVALACTIVITY #20180713T132449.546 GMT:20180713T132449.546 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATETABBEDSECTIONLAYOUT--(ST0BC8EFD5459D738EF7AAAF219E7289B6 #20191016T111148.764 GMT:20191016T111148.764 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDHEADERELEMENTS--(STRINGBUFFE2CEB5A8FA884B8FB8C9CC7705D04E287 #20200407T102458.616 GMT:20200427T060350.869 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENAKEY #20180713T133339.591 GMT:20180713T133339.591 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEHEADERTITLE #20180713T133339.778 GMT:20180713T133339.778 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELCELLCONTENT #20190410T165241.183 GMT:20190410T165241.183 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTGROUPHTML #20180713T133339.802 GMT:20180713T133339.802 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDEHEADERICON #20180713T133341.204 GMT:20180713T133341.204 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODY #20221007T070330.438 GMT:20221010T104158.645 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODYCONTENT--(CL762755102FCAC7F04E931D9162F7533A #20180713T133341.219 GMT:20180713T133341.219 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISPARENTDLG--(CLIPBOARDPAGE) #20180713T133341.284 GMT:20180713T133341.284 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZSECTIONINCLUDEINCELL--(CLIPBOAF2BD5B648774E376BD18CD12B064353F #20180713T133341.324 GMT:20180713T133341.324 GMT
//	RULE-UTILITY-FUNCTION HARNESS VALIDATEFORLOCALIZATIONTOKEN #20180713T132451.245 GMT:20180713T132451.245 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDSTRING #20180713T133342.971 GMT:20180713T133342.971 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONREFRESH--(CLIPBOARDPAGE,8AECDFE4A5256F13DC3F6C7D56453947 #20190320T065455.847 GMT:20190424T132824.042 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFIELDVALUEAPI #20200312T061421.553 GMT:20200319T144505.401 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
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
		return "f942cae3f036c8c9c699c42044ffbf6d";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Activity";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_2() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzRuleFormLayoutInner",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzRuleFormLayoutInner','insKey':'RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20180713T135246.131 GMT','sectionType':'standard'}");
pxIsNonTemplateStream = true;
if( pzAuto.getUIComponentRuntime().isTemplateRendering() ) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");
}
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){
pzGroup_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void groupHeaderEnd_1() {
tools.appendString("<li class='rightborder'  style='list-style:none' ><span id='TABSPAN'><table cellspacing='0' cellpadding='0'><tr></tr></table></span></li></ul>");
if(pzAuto.isOrientationRTL()) {
tools.appendString("<div style=\"display:inline;height:100%;width:100%;\" class=\"rightborder\"></div>");
}else{
tools.appendString("<div style=\"display:inline-block;height:100%;width:100%;\" class=\"rightborder\"></div>");
}
if(!tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString("</div></div>");
}
}
public void pzLayoutBodyWrapper_13() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormLayoutInnerBBBBBBBB",null,false);
tools.appendString("<div section_index='8' id='INNERDIV-SubSectionpzRuleFormLayoutInnerBBBBBBBB' class='tabbed_expandInnerDivStyle'  style=\"display:none\"  >");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
includeSectionBody_8();
if(isParentTemplate){
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('N');
}
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_14() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_10","RuleFormHistory", secInfo);
}


public void includeSectionBody_8() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_14();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "RuleFormHistory";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_20(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="History";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_8(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"History\" title=\"History\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='8' id='Tab8' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
tools.appendString(">");
String l_title="History";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602230422380987" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_20();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
public void invokeDeferLoadPreActivity_2() {
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()&&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){

						  {
						ParameterPage newParamsPage = new ParameterPage();
						 String strPropertyValue="";
						 String[] arReturn;
						 strPropertyValue="<pyDeferLoadRetrievalActivityParams/>";
						 arReturn = new String[2];
						if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),"<pyDeferLoadRetrievalActivityParams/>",arReturn)){
						 strPropertyValue = arReturn[0];
						}else {
						 strPropertyValue = "";
						 }
						 newParamsPage.putString("pxObjClass", strPropertyValue);
						 strPropertyValue="TempPlaceHolder";
						 arReturn = new String[2];
						if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),"TempPlaceHolder",arReturn)){
						 strPropertyValue = arReturn[0];
						}else {
						 strPropertyValue = "";
						 }
						 newParamsPage.putString("pyTempPlaceHolder", strPropertyValue);
						 newParamsPage.putString("pyTempPlaceHolder", "TempPlaceHolder");
						 HashStringMap keys = new HashStringMap();
						 keys.putString("pxObjClass", "Rule-Obj-Activity");
						 keys.putString("pyClassName",  tools.getStepPage().getString("pxObjClass") );
						 keys.putString("pyActivityName", "pzGetAssociatedSpecifications");
						 tools.doActivity(keys, tools.getStepPage(), newParamsPage);
						 } 
}
}
public void pzLayoutBodyWrapper_12() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormLayoutInnerBBBBBBB",null,false);
boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
String param_Index=tools.getParamValue("index");
	String expandedSecId="";
String expandRLExprValue=(bExpandRL?param_Index:"");
expandedSecId="EXPANDEDSubSectionpzRuleFormLayoutInnerBBBBBBB" + expandRLExprValue;
tools.putSaveValue("expandParam", expandedSecId);
pega_rules_utilities.pzRegisterActivity(tools, "Show-Harness");
if(pzSection.getLayout().loadLayoutHeader()) {
tools.appendString("<div section_index='7' id='INNERDIV-SubSectionpzRuleFormLayoutInnerBBBBBBB' class='tabbed_expandInnerDivStyle'  style=\"display:none\"  >");
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
invokeDeferLoadPreActivity_2();
includeSectionBody_7();
} else {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage("LazyLoad");
tools.appendString("<div section_index='7' id='INNERDIV-SubSectionpzRuleFormLayoutInnerBBBBBBB' class='tabbed_expandInnerDivStyle'  style='display:none'  >");
if(true && (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()  || "true".equals(tools.getParamValue("pyPegaDesignMode")))){
includeSectionBody_7();
}
}
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_13() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_9","pzSpecifications", secInfo);
}


public void includeSectionBody_7() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_13();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzSpecifications";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_19(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="Specifications";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_7(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
 if(pzAuto.handleEvaluateWhen(" wxpzIsLinkableRuleType","pzIsLinkableRuleType", "tab", "visible" )) {
tools.appendString("<li role=\"tab\"  aria-label=\"Specifications\" title=\"Specifications\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='7' id='Tab7' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
 if(tools.getParamValue("EXPAND_ALL").equals("true") || (tools.getParamValue("EXPANDEDSubSectionpzRuleFormLayoutInnerBBBBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):"")).equals("true") && tools.getParamValue("RenderSingle").equals(""))  ||tools.getParamValue("RenderSingle").equals("EXPANDEDSubSectionpzRuleFormLayoutInnerBBBBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""))){
tools.appendString(" isLoadDeferred='false' sectionBodyId='SubSectionpzRuleFormLayoutInnerBBBBBBB'");
}else{
tools.appendString(" isLoadDeferred='true' readonly='" + !tools.hasInputEnabled() + "' sectionBodyId='SubSectionpzRuleFormLayoutInnerBBBBBBB'");
}
tools.appendString(">");
String l_title="Specifications";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602230422380984" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_19();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
}
public void pzLayoutBodyWrapper_11() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormLayoutInnerBBBBBB",null,false);
tools.appendString("<div section_index='6' id='INNERDIV-SubSectionpzRuleFormLayoutInnerBBBBBB' class='tabbed_expandInnerDivStyle'  style=\"display:none\"  >");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
includeSectionBody_6();
if(isParentTemplate){
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('N');
}
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_12() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_8","pzUnitTestCases", secInfo);
}


public void includeSectionBody_6() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_12();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzUnitTestCases";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_18(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="Test cases";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_6(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
 if(pzAuto.handleEvaluateWhen(" o2&& o2!= rx.pxInsName cq wxpzPegaUnitEnabled",".pxInsName != \'\' && pzPegaUnitEnabled", "tab", "visible" )) {
tools.appendString("<li role=\"tab\"  aria-label=\"Test cases\" title=\"Test cases\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='6' id='Tab6' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
tools.appendString(">");
String l_title="Test cases";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602230422380980" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_18();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
}
public void invokeDeferLoadPreActivity_1() {
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()&&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){

}
}
public void pzLayoutBodyWrapper_10() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormLayoutInnerBBBBB",null,false);
boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
String param_Index=tools.getParamValue("index");
	String expandedSecId="";
String expandRLExprValue=(bExpandRL?param_Index:"");
expandedSecId="EXPANDEDSubSectionpzRuleFormLayoutInnerBBBBB" + expandRLExprValue;
tools.putSaveValue("expandParam", expandedSecId);
pega_rules_utilities.pzRegisterActivity(tools, "Show-Harness");
if(pzSection.getLayout().loadLayoutHeader()) {
tools.appendString("<div section_index='5' id='INNERDIV-SubSectionpzRuleFormLayoutInnerBBBBB' class='tabbed_expandInnerDivStyle'  style=\"display:none\"  >");
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
invokeDeferLoadPreActivity_1();
includeSectionBody_5();
} else {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage("LazyLoad");
tools.appendString("<div section_index='5' id='INNERDIV-SubSectionpzRuleFormLayoutInnerBBBBB' class='tabbed_expandInnerDivStyle'  style='display:none'  >");
if(true && (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()  || "true".equals(tools.getParamValue("pyPegaDesignMode")))){
includeSectionBody_5();
}
}
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_11() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_7","pzTestCases", secInfo);
}


public void includeSectionBody_5() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_11();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzTestCases";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_17(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="Test Cases";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_5(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
 if(pzAuto.handleEvaluateWhen(" wxAutoTestEnabled","AutoTestEnabled", "tab", "visible" )) {
tools.appendString("<li role=\"tab\"  aria-label=\"Test Cases\" title=\"Test Cases\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='5' id='Tab5' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
 if(tools.getParamValue("EXPAND_ALL").equals("true") || (tools.getParamValue("EXPANDEDSubSectionpzRuleFormLayoutInnerBBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):"")).equals("true") && tools.getParamValue("RenderSingle").equals(""))  ||tools.getParamValue("RenderSingle").equals("EXPANDEDSubSectionpzRuleFormLayoutInnerBBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""))){
tools.appendString(" isLoadDeferred='false' sectionBodyId='SubSectionpzRuleFormLayoutInnerBBBBB'");
}else{
tools.appendString(" isLoadDeferred='true' readonly='" + !tools.hasInputEnabled() + "' sectionBodyId='SubSectionpzRuleFormLayoutInnerBBBBB'");
}
tools.appendString(">");
String l_title="Test Cases";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602230422380973" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_17();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
}
public void pzLayoutBodyWrapper_9() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormLayoutInnerBBBB",null,false);
tools.appendString("<div section_index='4' id='INNERDIV-SubSectionpzRuleFormLayoutInnerBBBB' class='tabbed_expandInnerDivStyle'  style=\"display:none\"  >");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
includeSectionBody_4();
if(isParentTemplate){
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('N');
}
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_10() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_6","pzSecurity", secInfo);
}


public void includeSectionBody_4() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_10();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzSecurity";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_16(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="Security";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_4(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"Security\" title=\"Security\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='4' id='Tab4' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
tools.appendString(">");
String l_title="Security";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602230422380966" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_16();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
public void pzLayoutBodyWrapper_8() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormLayoutInnerBBB",null,false);
tools.appendString("<div section_index='3' id='INNERDIV-SubSectionpzRuleFormLayoutInnerBBB' class='tabbed_expandInnerDivStyle'  style=\"display:none\"  >");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
includeSectionBody_3();
if(isParentTemplate){
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('N');
}
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_9() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",false);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secParams.put("HideModeColumn","true");
	secParams.put("HasDeprecatedMode","true");
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_5","RuleFormPagesAndClasses", secInfo);
}


public void includeSectionBody_3() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_9();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("HideModeColumn","true");tools.putParamValue("HasDeprecatedMode","true");tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "RuleFormPagesAndClasses";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_15(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String valueString="Pages & Classes";
String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="Pages & Classes";
l_sectionTitle=valueString;
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_3(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"Pages & Classes\" title=\"Pages & Classes\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='3' id='Tab3' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
tools.appendString(">");
String l_title="Pages & Classes";
l_title="";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602230422380963" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_15();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
public void pzLayoutBodyWrapper_7() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormLayoutInnerBB",null,false);
tools.appendString("<div section_index='2' id='INNERDIV-SubSectionpzRuleFormLayoutInnerBB' class='tabbed_expandInnerDivStyle'  style=\"display:none\"  >");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
includeSectionBody_2();
if(isParentTemplate){
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('N');
}
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_8() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_4","pzParameters", secInfo);
}


public void includeSectionBody_2() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_8();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzParameters";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_14(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="Parameters";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_2(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"Parameters\" title=\"Parameters\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='2' id='Tab2' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
tools.appendString(">");
String l_title="Parameters";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602230422380960" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_14();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
public void pzLayoutBodyWrapper_6() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormLayoutInnerB",null,false);
tools.appendString("<div section_index='1' id='INNERDIV-SubSectionpzRuleFormLayoutInnerB' class='tabbed_expandInnerDivStyle'  >");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
includeSectionBody_1();
if(isParentTemplate){
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('N');
}
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_7() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_3","pzSteps", secInfo);
}
public void buildWhiteList_2() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
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
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "pzGetAssociatedSpecifications");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}


public void includeSectionBody_1() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_7();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzSteps";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void groupHeaderStart_1() {
	if(!tools.getParamValue("pyPegaDesignMode").equals("true")) {
		tools.appendString("<div class='scrlCntr' data-hide-tab-scroll='true'>");
		pzAuto.emitIncludeStreamReference("pzMenuBarInclude", null, "null","Rule-HTML-Fragment",null);
		tools.appendString("<div class='harnessHeaderIcons rightborder'><span id='TABSPAN'><table cellspacing='0' cellpadding='0'><tr>");
		pzLayout.includeHeaderIcon("","tdRightStyle");tools.appendString("</tr></table></span></div><ol  title='" + tools.getLocalizedTextForString(".pyActionPrompt", "Currently open") + "' class=\"yui-nav tsb-menu tab-ul tab-ul-t tab-ul-t-ns  headerTabsList\"><li sel_prefix='tab-li-t-ns' class=\"tab-li tab-li-t tab-li-t-ns \" ><a  role= \"link\"  aria-haspopup=\"true\"  id=\"TABANCHOR\" tabindex=\"0\" aria-label=\"" + tools.getLocalizedTextForString(".pyActionPrompt", "Currently open") + "\"> <span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \" style=\"white-space: nowrap;\"><span class=\"textMiddle\"><span class=\"textIn\" inAnchor=\"\">&#x25BC;</span></span></span></a></li></ol><div class='tStrCntr'>");
		}
	tools.appendString("<ul role = \"tablist\" class=\"yui-nav tab-ul tab-ul-t tab-ul-t-ns  headerTabsList\"");
	tools.appendString("");tools.appendString(">");
}

 public void pzHeaderBody_13(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="Steps";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_1(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"Steps\" title=\"Steps\"  aria-selected=\"true\" tabindex=\"0\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='1' id='Tab1' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns selected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
tools.appendString(">");
String l_title="Steps";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602230422380955" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_13();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
public void pzGroup_1() {
	String expandedGrpId=tools.getParamCSF("EXPANDEDTGpzRuleFormLayoutInnerA");
	String activatedGrpId=tools.getParamCSF("ACTIVATEDTGpzRuleFormLayoutInnerA");
	String param_renderSingle=tools.getParamValue("RenderSingle");
	if(!expandedGrpId.equals("")){
		tools.putSaveValue("defaultTab", expandedGrpId);
	}else{
		tools.putSaveValue("defaultTab" ,"1");
	}
	
	activatedGrpId=tools.getParamCSF("ACTIVATEDTGpzRuleFormLayoutInnerA");
	if(!activatedGrpId.equals("")){
		tools.putSaveValue("activeTab",activatedGrpId);
	}else{
		tools.putSaveValue("activeTab" ,"");
	}
	if(param_renderSingle.equals("") && !tools.getSaveValue("activeTab").equals("")) {
		tools.putSaveValue("defaultTab",tools.getSaveValue("activeTab"));
	}
	String defaultTabSaveValue=tools.getSaveValue("defaultTab");
	String activeTabSaveValue=tools.getSaveValue("activeTab");
	String bIsScreenLayout = tools.getParamValue("bIsScreenLayout");
	if("".equals(bIsScreenLayout)){
	 ClipboardPage pg_DDisplay = tools.findPage("Declare_pyDisplay",true);
	 if(pg_DDisplay != null){
				 ClipboardProperty cp_display =  pg_DDisplay.getIfPresent("pyDisplay");
						 if(cp_display != null){
	 String modelName = tools.getThread().getThreadPage().getString("pxPortal");
	 ClipboardPage pg_portalModel = cp_display.getPageValue(modelName);
	 if(pg_portalModel.getIfPresent("pyUIElements") != null &&  pg_portalModel.getIfPresent("pyUIElements").size() >0){
	 bIsScreenLayout = "true";
	 tools.putParamValue("bIsScreenLayout","true");
	}}}}
	String sectionHasDynamicLayout = "false";
	if(("true").equalsIgnoreCase(bIsScreenLayout) && ("true").equals(sectionHasDynamicLayout)){
	tools.appendString("<div class = \"dc-main\">");
	}
	tools.appendString("<div " + pzSection.getLayout().getInspectorData("TABGROUP", ".pySections(1)") + " id='PEGA_TABBED'   tabGroupId='TGpzRuleFormLayoutInnerA' tabGroupName='' activeWhenTab = '" + activeTabSaveValue + "' defaultTab='" + defaultTabSaveValue + "' class= 'yui-navset pegaTabGrp yui-navset-top headerTabbed headerTabbed-t' data-taberror=\"" + tools.getLocalizedTextForString("pxRequestor.pyMessageLabel","TabErrorTooltip")  + " \"  data-pos=\"Top\">");
	if(!("true").equalsIgnoreCase(bIsScreenLayout) || !("true").equals(sectionHasDynamicLayout)){
	if(param_renderSingle.equals("")){
		boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
	 String param_Index=tools.getParamValue("index");
	String expandedSecId="";
	 String expandRLExprValue=(bExpandRL?param_Index:"");expandedSecId="EXPANDEDSubSectionpzRuleFormLayoutInnerB"+ expandRLExprValue;if(defaultTabSaveValue.equals("1")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionpzRuleFormLayoutInnerBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("2")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionpzRuleFormLayoutInnerBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("3")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionpzRuleFormLayoutInnerBBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("4")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionpzRuleFormLayoutInnerBBBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("5")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionpzRuleFormLayoutInnerBBBBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("6")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionpzRuleFormLayoutInnerBBBBBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("7")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionpzRuleFormLayoutInnerBBBBBBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("8")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}
		groupHeaderStart_1();
groupHeaderItem_1();
groupHeaderItem_2();
groupHeaderItem_3();
groupHeaderItem_4();
groupHeaderItem_5();
groupHeaderItem_6();
groupHeaderItem_7();
groupHeaderItem_8();
groupHeaderEnd_1();
	}
	}
	if(("true").equalsIgnoreCase(bIsScreenLayout)){
	tools.appendString("<div  data-stcd=\"1\" class=\"yui-content contents tabContent");
	}else{
	tools.appendString("<div  data-stcd=\"1\" class=\"yui-content tabContent");
	}
	tools.appendString("\">");
	boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
	if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_6();if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_7();if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_8();if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_9();if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");} if(pzAuto.handleEvaluateWhen(" wxAutoTestEnabled","AutoTestEnabled", "layout", "visible" )) {pzLayoutBodyWrapper_10();}if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");} if(pzAuto.handleEvaluateWhen(" o2&& o2!= rx.pxInsName cq wxpzPegaUnitEnabled",".pxInsName != \'\' && pzPegaUnitEnabled", "layout", "visible" )) {pzLayoutBodyWrapper_11();}if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");} if(pzAuto.handleEvaluateWhen(" wxpzIsLinkableRuleType","pzIsLinkableRuleType", "layout", "visible" )) {pzLayoutBodyWrapper_12();}if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_13();
	tools.appendString("</div><input type='hidden' name='EXPANDEDTGpzRuleFormLayoutInnerA");
	new java.util.Random().nextInt();tools.appendString("'  value='" + expandedGrpId + "'/>");
	
	if(!("true").equalsIgnoreCase(bIsScreenLayout) || !("true").equals(sectionHasDynamicLayout)){
	}
	tools.appendString("</div>");
	if(("true").equalsIgnoreCase(bIsScreenLayout) && ("true").equals(sectionHasDynamicLayout)){
	tools.appendString("</div>");
	}
}
private void performStream_2() throws Throwable {
buildWhiteList_2();pzSectionBody_2();}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "Internal");
	oStreamProperties_2.put("pyClassName", "Rule-Obj-Activity");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20180713T135246.131 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pzRuleFormLayoutInner");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_2() {	 return true;}public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzRuleFormLayoutInner",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzRuleFormLayoutInner','insKey':'RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20191217T071019.403 GMT','sectionType':'standard'}");
pzLayout_1();
pzLayout_5();
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
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzHandleModelerDraftModeToolbarClick");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzUpdateSimulationMappings");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBody_5() {
tools.putParamValue("LAYOUT_METHOD_NAME","layoutGroup_1");layoutGroup_1();
}
public void pzLayoutBodyWrapper_5() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";if(!pzAuto.isMobile()) { clsScroll = "container-scroll";}tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","layoutGroup_1");layoutGroup_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_6() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_24","pzRuleFormHistoryNoUsage", secInfo);
}


public void sectionBodyIncludeInCell_6() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_6();
	return;
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
	String sectionName = "pzRuleFormHistoryNoUsage"; 
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

 public void pzHeaderBody_11(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230422380911" + rptDynamicIndex + "'");
if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
	String l_sectionTitleReference="";
	String l_sectionTitleType="";
	String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","History");
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
		tools.appendString(l_sectionTitle);
		}
	tools.appendString("'");
	} else {
		tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","History");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
		tools.appendString("'");
		}
		tools.appendString("><h3  aria-level='3' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","History");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
			tools.appendString("</h3>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
			}
			
 public void pzHeaderBody_12(){ 
			String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
			String strSaveTextValue="";String l_sectionTitle="";
			String l_sectionTitleFVMeta = "";
			l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
			l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","History");
			String sectionImageTitle="";
			sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
			

	/***-- Grid HeaderElements: Begin --**/
			tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel9806' data-layout-id='202602230422380911" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel9806'>" + l_sectionTitle + "</h2><nobr>");
			pzHeaderCellContent_1();
			tools.appendString("</nobr>");
			boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
			tools.appendString("<span class='header-element header-title-table'>");
			if(showContainerIcons){
			tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
			}
			if(showContainerIcons){
			pzLayout.includeHeaderIcon("SubSectionCellpzRuleFormLayoutInner218","tdRightStyle");}
			if(showContainerIcons){
			tools.appendString("</tr></table>");
			}
			tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");
			
	 /***Grid HeaderElements: End ***/

			}
public void pzLayoutHeader_3() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
String l_sectionTitleReference="";
String l_sectionTitleType="";
String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","History");
if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString(l_sectionTitle);
	}
	metadataPage.put("isActiveLayout", tools.getParamValue("isActiveLayout"));
	if(!"".equals(l_sectionTitle))metadataPage.put("title", l_sectionTitle);
	metadataPage.put("headingLevel", "h3");
	metadataPage.put("layoutHeaderKey", tools.getParamValue("pzAKey"));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", "pyActionPrompt");
	metadataPage.put("headingLevel","h3");
	metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionCellpzRuleFormLayoutInner218"));
	String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	if(!"".equals(sectionTitleFVMeta)){
	metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("History", "pyCaption");
	String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(inspectorFVData)){
	metadataPage.put("fieldValueInspectorData",inspectorFVData);
	}
	metadataPage.put("title","History");
	metadataPage.put("uniqueid", "202602230422380910");
	metadataPage.put("automationId", "");
	headerComponent.beginComponent("pxLayoutHeader",metadataPage);
	headerComponent.endComponent();
	}
	public void pzLayoutBody_4() {
	sectionBodyIncludeInCell_5();
	}
public void pzLayoutBodyWrapper_4() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix' tabindex='0' role='tabpanel'>");
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_5();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_5() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_23","pzRuleFormHistoryNoUsage", secInfo);
}


public void sectionBodyIncludeInCell_5() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_5();
	return;
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
	String sectionName = "pzRuleFormHistoryNoUsage"; 
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
pzSection.getLayout().setExpandParam("SubSectionCellpzRuleFormLayoutInner218","",true);
}

 public void pzHeaderBody_9(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230422380909" + rptDynamicIndex + "'");
if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
	String l_sectionTitleReference="";
	String l_sectionTitleType="";
	String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","History");
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
		tools.appendString(l_sectionTitle);
		}
	tools.appendString("'");
	} else {
		tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","History");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
		tools.appendString("'");
		}
		tools.appendString("><h3  aria-level='3' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","History");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
			tools.appendString("</h3>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
			}
			
 public void pzHeaderBody_10(){ 
			String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
			String strSaveTextValue="";String l_sectionTitle="";
			String l_sectionTitleFVMeta = "";
			l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
			l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","History");
			String sectionImageTitle="";
			sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
			

	/***-- Grid HeaderElements: Begin --**/
			tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel8263' data-layout-id='202602230422380909" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel8263'>" + l_sectionTitle + "</h2><nobr>");
			pzHeaderCellContent_1();
			tools.appendString("</nobr>");
			boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
			tools.appendString("<span class='header-element header-title-table'>");
			if(showContainerIcons){
			tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
			}
			if(showContainerIcons){
			pzLayout.includeHeaderIcon("SubSectionCellpzRuleFormLayoutInner218","tdRightStyle");}
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
			String paramName = "EXPANDEDSubSectionCellpzRuleFormLayoutInner218";
			metadataPage.put("paramName", paramName);
			String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)','clipboardPath':'pzRuleFormHistoryNoUsage'}");
			if(!inspectorLayoutData.isEmpty()) {
			metadataPage.put("liveUI", inspectorLayoutData);
			}
			String pyPrefix = null;
			metadataPage.put("sectionIndex","14");
			IUIComponent containerComponent = pzAuto.getUIComponent();
			metadataPage.put("isSectionIncl","true");
			metadataPage.put("dlChild","true");
			metadataPage.put("lgChild","true");
			metadataPage.put("lMode","Inline-block");
			containerComponent.beginComponent("pxLayoutContainer",metadataPage);
			pzLayoutHeader_3();
			pzLayoutBody_4();
			containerComponent.endComponent();
			}
public void pzLayout_4() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_5();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");

pzHeaderBody_9();
pzLayoutBodyWrapper_4();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_4();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void buildSection_4() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	String spxUniqueStreamHash20 = getUIActionsMetaData_3();
	if(spxUniqueStreamHash20 != null && !"".equals(spxUniqueStreamHash20)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash20,pxUniqueStreamHash+"_20");
	secInfo.put("secActionStringID", pxUniqueStreamHash+"_20");
	}
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_19","pzImplementation", secInfo);
}


public void sectionBodyIncludeInCell_4() { 
	tools.putParamValue("classForAction"," has-action ");
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_4();
	return;
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
	String sectionName = "pzImplementation"; 
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
	tools.putParamValue("section_actions_string", getUIActionsMetaData_3());
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
	tools.putParamValue("section_actions_string", "");
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

 public void pzHeaderBody_7(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230422380906" + rptDynamicIndex + "'");

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
		com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
			StringBuffer staticURLStr = new StringBuffer();
			StringBuffer preActParamStr = new StringBuffer();
			StringBuffer preDTParamStr = new StringBuffer();
			refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
			refreshActionRequest.registerFixedParameter("StreamList", "pzSimulationMappings|Rule-HTML-Section|:");
			staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
			staticURLStr.append("&PreActivity=pzUpdateSimulationMappings");
			tools.appendString("[\"refresh\", [\"otherSection\",\"pzSimulationMappings\", \"pzUpdateSimulationMappings\", \"");
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

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}					if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
						tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
						String l_sectionTitleReference="";
						String l_sectionTitleType="";
						String l_sectionTitle=StringUtils.crossScriptingFilter(tools.getLocalizedTextForParameterizedString("pyCaption","Implementation"));
						if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
							tools.appendString(l_sectionTitle);
							}
						tools.appendString("'");
						} else {
							tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
							String l_sectionTitleReference="";
							String l_sectionTitleType="";
							String l_sectionTitle=StringUtils.crossScriptingFilter(tools.getLocalizedTextForParameterizedString("pyCaption","Implementation"));
							if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
								tools.appendString(l_sectionTitle);
								}
							tools.appendString("'");
							}
							tools.appendString("><h3  data-click='.' aria-level='3' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
							String l_sectionTitleReference="";
							String l_sectionTitleType="";
							String l_sectionTitle=StringUtils.crossScriptingFilter(tools.getLocalizedTextForParameterizedString("pyCaption","Implementation"));
							if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
								tools.appendString(l_sectionTitle);
								}
								tools.appendString("</h3>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
								}
								
 public void pzHeaderBody_8(){ 
								String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
								String strSaveTextValue="";String l_sectionTitle="";
								String l_sectionTitleFVMeta = "";
								l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
								String labelName = "Implementation";
								labelName =  tools.getLocalizedTextForString(".pyCaption","Implementation");
								l_sectionTitle = labelName;
								String sectionImageTitle="";
								sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
								

	/***-- Grid HeaderElements: Begin --**/
								tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel7692' data-layout-id='202602230422380906" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel7692'>" + l_sectionTitle + "</h2><nobr>");
								pzHeaderCellContent_2();
								tools.appendString("</nobr>");
								boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
								tools.appendString("<span class='header-element header-title-table'>");
								if(showContainerIcons){
								tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
								}
								if(showContainerIcons){
								pzLayout.includeHeaderIcon("SubSectionCellpzRuleFormLayoutInner437","tdRightStyle");}
								if(showContainerIcons){
								tools.appendString("</tr></table>");
								}
								tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");
								
	 /***Grid HeaderElements: End ***/

								}
public void pzLayoutHeader_2() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
String l_sectionTitleReference="";
String l_sectionTitleType="";
String l_sectionTitle=StringUtils.crossScriptingFilter(tools.getLocalizedTextForParameterizedString("pyCaption","Implementation"));
if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString(l_sectionTitle);
	}
	metadataPage.put("isActiveLayout", tools.getParamValue("isActiveLayout"));
	if(!"".equals(l_sectionTitle))metadataPage.put("title", l_sectionTitle);
	metadataPage.put("headingLevel", "h3");
	metadataPage.put("layoutHeaderKey", tools.getParamValue("pzAKey"));
	metadataPage.put("LGBehaviorPropertiesCount"," data-click='.'");
	metadataPage.put("LGActionString",getUIActionsMetaData_3());
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", "pyActionPrompt");
	metadataPage.put("headingLevel","h3");
	metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionCellpzRuleFormLayoutInner437"));
	metadataPage.put("titleType","Field Value");
	String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	if(!"".equals(sectionTitleFVMeta)){
	metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
	}
	String sectionTitle = "Implementation";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Implementation", "pyCaption");
	metadataPage.put("title", sectionTitle);
	String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(inspectorFVData)){
	metadataPage.put("fieldValueInspectorData",inspectorFVData);
	}
	metadataPage.put("uniqueid", "202602230422380905");
	metadataPage.put("automationId", " " + pzCell.getTestIdIfEnabled("202003040615520739250") + " ");
	headerComponent.beginComponent("pxLayoutHeader",metadataPage);
	headerComponent.endComponent();
	}
	public void pzLayoutBody_3() {
	sectionBodyIncludeInCell_3();
	}
public void pzLayoutBodyWrapper_3() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix' tabindex='0' role='tabpanel'>");
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_3();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public String 
getUIActionsMetaData_3() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
				refreshActionRequest.registerFixedParameter("StreamList", "pzSimulationMappings|Rule-HTML-Section|:");
				staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
				staticURLStr.append("&PreActivity=pzUpdateSimulationMappings");
				tools.appendString("[\"refresh\", [\"otherSection\",\"pzSimulationMappings\", \"pzUpdateSimulationMappings\", \"");
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

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}						String returnString = actionsStringBuilder.toString();
						tools.popStreamBody();
						return returnString;
					}
public void buildSection_3() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	String spxUniqueStreamHash18 = getUIActionsMetaData_3();
	if(spxUniqueStreamHash18 != null && !"".equals(spxUniqueStreamHash18)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash18,pxUniqueStreamHash+"_18");
	secInfo.put("secActionStringID", pxUniqueStreamHash+"_18");
	}
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_17","pzImplementation", secInfo);
}


public void sectionBodyIncludeInCell_3() { 
	tools.putParamValue("classForAction"," has-action ");
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_3();
	return;
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
	String sectionName = "pzImplementation"; 
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
	tools.putParamValue("section_actions_string", getUIActionsMetaData_3());
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
	tools.putParamValue("section_actions_string", "");
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
public void pzHeaderCellContent_2() {
tools.putSaveValue("parentLayouttype","");}
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionCellpzRuleFormLayoutInner437","",true);
}

 public void pzHeaderBody_5(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230422380902" + rptDynamicIndex + "'");

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
		com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
			StringBuffer staticURLStr = new StringBuffer();
			StringBuffer preActParamStr = new StringBuffer();
			StringBuffer preDTParamStr = new StringBuffer();
			refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
			refreshActionRequest.registerFixedParameter("StreamList", "pzSimulationMappings|Rule-HTML-Section|:");
			staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
			staticURLStr.append("&PreActivity=pzUpdateSimulationMappings");
			tools.appendString("[\"refresh\", [\"otherSection\",\"pzSimulationMappings\", \"pzUpdateSimulationMappings\", \"");
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

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}					if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
						tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
						String l_sectionTitleReference="";
						String l_sectionTitleType="";
						String l_sectionTitle=StringUtils.crossScriptingFilter(tools.getLocalizedTextForParameterizedString("pyCaption","Implementation"));
						if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
							tools.appendString(l_sectionTitle);
							}
						tools.appendString("'");
						} else {
							tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
							String l_sectionTitleReference="";
							String l_sectionTitleType="";
							String l_sectionTitle=StringUtils.crossScriptingFilter(tools.getLocalizedTextForParameterizedString("pyCaption","Implementation"));
							if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
								tools.appendString(l_sectionTitle);
								}
							tools.appendString("'");
							}
							tools.appendString("><h3  data-click='.' aria-level='3' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
							String l_sectionTitleReference="";
							String l_sectionTitleType="";
							String l_sectionTitle=StringUtils.crossScriptingFilter(tools.getLocalizedTextForParameterizedString("pyCaption","Implementation"));
							if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
								tools.appendString(l_sectionTitle);
								}
								tools.appendString("</h3>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
								}
								
 public void pzHeaderBody_6(){ 
								String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
								String strSaveTextValue="";String l_sectionTitle="";
								String l_sectionTitleFVMeta = "";
								l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
								String labelName = "Implementation";
								labelName =  tools.getLocalizedTextForString(".pyCaption","Implementation");
								l_sectionTitle = labelName;
								String sectionImageTitle="";
								sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
								

	/***-- Grid HeaderElements: Begin --**/
								tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel2455' data-layout-id='202602230422380902" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel2455'>" + l_sectionTitle + "</h2><nobr>");
								pzHeaderCellContent_2();
								tools.appendString("</nobr>");
								boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
								tools.appendString("<span class='header-element header-title-table'>");
								if(showContainerIcons){
								tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
								}
								if(showContainerIcons){
								pzLayout.includeHeaderIcon("SubSectionCellpzRuleFormLayoutInner437","tdRightStyle");}
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
								String paramName = "EXPANDEDSubSectionCellpzRuleFormLayoutInner437";
								metadataPage.put("paramName", paramName);
								String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)','clipboardPath':'pzImplementation'}");
								if(!inspectorLayoutData.isEmpty()) {
								metadataPage.put("liveUI", inspectorLayoutData);
								}
								String pyPrefix = null;
								metadataPage.put("sectionIndex","9");
								IUIComponent containerComponent = pzAuto.getUIComponent();
								metadataPage.put("isSectionIncl","true");
								metadataPage.put("dlChild","true");
								metadataPage.put("lgChild","true");
								metadataPage.put("lMode","Inline-block");
								containerComponent.beginComponent("pxLayoutContainer",metadataPage);
								pzLayoutHeader_2();
								pzLayoutBody_3();
								containerComponent.endComponent();
								}
public void pzLayout_3() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_4();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");

pzHeaderBody_5();
pzLayoutBodyWrapper_3();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3();
tools.putParamValue("pyInlineStyleSec","");
}
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_14","pzDefinition", secInfo);
}


public void sectionBodyIncludeInCell_2() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
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
	String sectionName = "pzDefinition"; 
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

 public void pzHeaderBody_3(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230422380900" + rptDynamicIndex + "'");
if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
	String l_sectionTitleReference="";
	String l_sectionTitleType="";
	String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Definition");
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
		tools.appendString(l_sectionTitle);
		}
	tools.appendString("'");
	} else {
		tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Definition");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
		tools.appendString("'");
		}
		tools.appendString("><h3  aria-level='3' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Definition");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
			tools.appendString("</h3>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
			}
			
 public void pzHeaderBody_4(){ 
			String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
			String strSaveTextValue="";String l_sectionTitle="";
			String l_sectionTitleFVMeta = "";
			l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
			l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Definition");
			String sectionImageTitle="";
			sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
			

	/***-- Grid HeaderElements: Begin --**/
			tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel4189' data-layout-id='202602230422380900" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel4189'>" + l_sectionTitle + "</h2><nobr>");
			pzHeaderCellContent_1();
			tools.appendString("</nobr>");
			boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
			tools.appendString("<span class='header-element header-title-table'>");
			if(showContainerIcons){
			tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
			}
			if(showContainerIcons){
			pzLayout.includeHeaderIcon("SubSectionCellpzRuleFormLayoutInner322","tdRightStyle");}
			if(showContainerIcons){
			tools.appendString("</tr></table>");
			}
			tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");
			
	 /***Grid HeaderElements: End ***/

			}
public void pzLayoutHeader_1() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
String l_sectionTitleReference="";
String l_sectionTitleType="";
String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Definition");
if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString(l_sectionTitle);
	}
	metadataPage.put("isActiveLayout", tools.getParamValue("isActiveLayout"));
	if(!"".equals(l_sectionTitle))metadataPage.put("title", l_sectionTitle);
	metadataPage.put("headingLevel", "h3");
	metadataPage.put("layoutHeaderKey", tools.getParamValue("pzAKey"));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", "pyActionPrompt");
	metadataPage.put("headingLevel","h3");
	metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionCellpzRuleFormLayoutInner322"));
	String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	if(!"".equals(sectionTitleFVMeta)){
	metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Definition", "pyCaption");
	String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(inspectorFVData)){
	metadataPage.put("fieldValueInspectorData",inspectorFVData);
	}
	metadataPage.put("title","Definition");
	metadataPage.put("uniqueid", "202602230422380899");
	metadataPage.put("automationId", "");
	headerComponent.beginComponent("pxLayoutHeader",metadataPage);
	headerComponent.endComponent();
	}
	public void pzLayoutBody_2() {
	sectionBodyIncludeInCell_1();
	}
public void pzLayoutBodyWrapper_2() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix' tabindex='0' role='tabpanel'>");
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_1();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_13","pzDefinition", secInfo);
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
	String sectionName = "pzDefinition"; 
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
public void pzHeaderCellContent_1() {
}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionCellpzRuleFormLayoutInner322","",true);
}

 public void pzHeaderBody_1(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230422380898" + rptDynamicIndex + "'");
if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
	String l_sectionTitleReference="";
	String l_sectionTitleType="";
	String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Definition");
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
		tools.appendString(l_sectionTitle);
		}
	tools.appendString("'");
	} else {
		tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Definition");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
		tools.appendString("'");
		}
		tools.appendString("><h3  aria-level='3' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Definition");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
			tools.appendString("</h3>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
			}
			
 public void pzHeaderBody_2(){ 
			String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
			String strSaveTextValue="";String l_sectionTitle="";
			String l_sectionTitleFVMeta = "";
			l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
			l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Definition");
			String sectionImageTitle="";
			sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
			

	/***-- Grid HeaderElements: Begin --**/
			tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel3829' data-layout-id='202602230422380898" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel3829'>" + l_sectionTitle + "</h2><nobr>");
			pzHeaderCellContent_1();
			tools.appendString("</nobr>");
			boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
			tools.appendString("<span class='header-element header-title-table'>");
			if(showContainerIcons){
			tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
			}
			if(showContainerIcons){
			pzLayout.includeHeaderIcon("SubSectionCellpzRuleFormLayoutInner322","tdRightStyle");}
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
			String paramName = "EXPANDEDSubSectionCellpzRuleFormLayoutInner322";
			metadataPage.put("paramName", paramName);
			String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)','clipboardPath':'pzDefinition'}");
			if(!inspectorLayoutData.isEmpty()) {
			metadataPage.put("liveUI", inspectorLayoutData);
			}
			String pyPrefix = null;
			metadataPage.put("sectionIndex","4");
			IUIComponent containerComponent = pzAuto.getUIComponent();
			metadataPage.put("isSectionIncl","true");
			metadataPage.put("dlChild","true");
			metadataPage.put("lgChild","true");
			metadataPage.put("lMode","Inline-block");
			containerComponent.beginComponent("pxLayoutContainer",metadataPage);
			pzLayoutHeader_1();
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
tools.putParamValue("RWClasses","");

pzHeaderBody_1();
pzLayoutBodyWrapper_2();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
}


public void pzLayoutGroupIncludes_1() {
pzAuto.emitIncludeStreamReference("pzLayoutGroup_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}


public int layoutGroupTemplateCell_1( int index, int numVisibleLayouts ) {
	String labelName="";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String pyLGInspectorData = "";
	 StringBuilder lgCustomClass = new StringBuilder("layout "); 
	if( index == 1 ) {
		 lgCustomClass.append(" active multiactive ");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	String pyLGCustomClass = lgCustomClass.append("count-"+numVisibleLayouts).toString();
	tools.appendString(" ");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("RWActive","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isLG","true");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("lgClass",pyLGCustomClass);
	pgCells.put("lgInspectorData",pyLGInspectorData);
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzDefinition",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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
	return index;
}


public int layoutGroupCell_1( int index, int numVisibleLayouts ) {
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_2();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzDefinition",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " data-lg-child-id='1' data-refreshOnClick='false' class='layout");
	if( index == 1) {
		tools.appendString(" active multiactive");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	tools.appendString(" count-" + numVisibleLayouts + "' >");
	pzHeaderBody_3();tools.appendString("<div class=\"layout-body\" role=\"tabpanel\" tabindex=\"0\">");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_2();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
	index++;
	return index;
}


public int layoutGroupTemplateCell_2( int index, int numVisibleLayouts ) {
	String labelName="";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String pyLGInspectorData = "";
	 StringBuilder lgCustomClass = new StringBuilder("layout "); 
	if( index == 2 ) {
		 lgCustomClass.append(" active multiactive ");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	String pyLGCustomClass = lgCustomClass.append("count-"+numVisibleLayouts).toString();
	tools.appendString(" ");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("RWActive","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isLG","true");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("lgClass",pyLGCustomClass);
	pgCells.put("lgInspectorData",pyLGInspectorData);
	pgCells.put("LGCellIndex","2");
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzImplementation",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
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
	return index;
}


public int layoutGroupCell_2( int index, int numVisibleLayouts ) {
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_2();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzImplementation",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " data-lg-child-id='2' data-refreshOnClick='false' class='layout");
	if( index == 2) {
		tools.appendString(" active multiactive");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	tools.appendString(" count-" + numVisibleLayouts + "' >");
	pzHeaderBody_7();tools.appendString("<div class=\"layout-body\" role=\"tabpanel\" tabindex=\"0\">");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_4();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
	index++;
	return index;
}


public int layoutGroupTemplateCell_3( int index, int numVisibleLayouts ) {
	String labelName="";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String pyLGInspectorData = "";
	 StringBuilder lgCustomClass = new StringBuilder("layout "); 
	if( index == 3 ) {
		 lgCustomClass.append(" active multiactive ");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	String pyLGCustomClass = lgCustomClass.append("count-"+numVisibleLayouts).toString();
	tools.appendString(" ");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("RWActive","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isLG","true");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("lgClass",pyLGCustomClass);
	pgCells.put("lgInspectorData",pyLGInspectorData);
	pgCells.put("LGCellIndex","3");
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzRuleFormHistoryNoUsage",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
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
	return index;
}


public int layoutGroupCell_3( int index, int numVisibleLayouts ) {
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_2();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzRuleFormHistoryNoUsage",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " data-lg-child-id='3' data-refreshOnClick='false' class='layout");
	if( index == 3) {
		tools.appendString(" active multiactive");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	tools.appendString(" count-" + numVisibleLayouts + "' >");
	pzHeaderBody_11();tools.appendString("<div class=\"layout-body\" role=\"tabpanel\" tabindex=\"0\">");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_6();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
	index++;
	return index;
}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormLayoutInnerBB","",false);
}


public void layoutGroup_1() {
	if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	}
	String lgExpandedGrpIdHidden = "";
	if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	pzLayoutGroupIncludes_1();
	}
	String commaSeparateList = "";
	int indexActiveLayout= 0;
	String expressionForActiveWhenId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expressionForActiveWhen = null;
	IUIComponentMetadata pxWhenIdentifiersForActiveWhen = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pg_layoutGroupMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponent cc_lg = null;
	cc_lg = pzAuto.getUIComponent();
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
		cc_lg.beginComponent("LayoutGroup",pg_layoutGroupMeta);
		}
		boolean isMobile = pzAuto.isMobile();
		 String classTabFlow = ""; 
		if(!isMobile){
		 classTabFlow = "tab-overflow "; 
		}
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
			tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUTGROUP','pgRef':'.pySections(2)'}") + " data-lg-id='LGLayoutGrouppzRuleFormLayoutInnerS2' role= 'tablist'  class='" + classTabFlow + " content content-layout-group layout-group-tab count-3'>");
			if(!isMobile){
			tools.appendString(" <div class=\"tab-arrow left-tab-nav-controls left-arrow pi pi-caret-left\"></div>");
			}
			tools.appendString(" <div class=\"right-tab-nav-controls\">");
			if(!isMobile){
			tools.appendString("<div class=\"tab-arrow right-arrow pi pi-caret-right\"></div>");
			}
			tools.appendString("<div bsimplelayout='true' data-click='[[\"runScript\",[\"LayoutGroupModule.showActiveTabListMenu(event)\"]]]' class='layout-group-tablist-menu'data-menu-config='{\"usingPage\":\"" + tools.getStepPage().getReference() + "\",\"datasource\":\"\",\"isNavNLDeferLoaded\":\"false\",\"isNavTypeCustom\":\"false\",\"className\":\"\",\"menuAlign\":\"right\",\"format\":\"menu-format-standard\",\"loadBehavior\":\"ondisplay\",\"ellipsisAfter\":\"999\",\"useNewMenu\":\"true\",\"navPageName\":\"\",\"ContextPage\":\"\",\"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\"}'><a href='#' onclick='pd(event);' class='pi pi-caret-solid-down layout-group-tablist-menu-nav'></a></div></div>");
			if(!isMobile){
			tools.appendString("<div class=\"tab-indicator\"> <div class=\"current-selected-tab-indicator\"></div> </div>");
			}
			String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
			tools.appendString("<div class='layout-group-nav' tabindex='0'' data-layout-id='202602230422380896" + rptDynamicIndex + "'aria-haspopup='true' role='menuitem'><h2 class='layout-group-nav-title' ><i class='icon icon-openclose'></i>");
			}
			int defaultIndexActiveLayout= 0;
			int numVisibleLayouts = 0;
			boolean isActiveLayout = false;
			int prioritizedActiveLayout = 0;
			List<Integer> notVisibleLayoutsList = new ArrayList<Integer>();
			int flagAnyActiveWhenState = 0;
			ArrayList activeWhenList = new ArrayList<String>();
			String sectionName = "LayoutGrouppzRuleFormLayoutInnerS2";
			String LGTabGrpId = "EXPANDEDLG"+pega_rules_string.stripSpecialChars(sectionName);
			String expandedGrpId = tools.getParamCSF(LGTabGrpId); 
			if(expandedGrpId.equals("0")){expandedGrpId = "";}
			String LGTypeHiddenId = "LGTypeLG"+pega_rules_string.stripSpecialChars(sectionName);
			String LGType = tools.getParamCSF(LGTypeHiddenId); 
			 Map<String, String> repeatSelected = new HashMap<String, String>();
			String LGTypeParentRepeatSize = tools.getParamCSF(LGTypeHiddenId+"RepeatSize"); 
			if(LGTypeParentRepeatSize != null && LGTypeParentRepeatSize != ""){
			 try{ 
			 int size = Integer.parseInt(LGTypeParentRepeatSize);
			 String expandedGrpIdRepeat = "";
			 String LGTabGrpIdRepeat = "";
			 for(int i=1; i<size+1; i++){ 
			 LGTabGrpIdRepeat = "EXPANDEDLG"+pega_rules_string.stripSpecialChars(sectionName)+i;
			 expandedGrpIdRepeat = tools.getParamCSF(LGTabGrpIdRepeat);
			 repeatSelected.put(i+"", expandedGrpIdRepeat);
			 } 
			 }catch(Exception e){ 
			 } 
			}
			int expandedGrpIdIndex = 1;
			String[] indexExpAccordian = null; 
			if("accordion".equals(LGType)){
			 if(expandedGrpId != "" && expandedGrpId != null) { 
			indexExpAccordian = expandedGrpId.split(","); 
			}
			} else{
			if(expandedGrpId != "" && expandedGrpId != null && expandedGrpId.length() != 0) { try  { expandedGrpIdIndex = Integer.parseInt(expandedGrpId);} catch(NumberFormatException nfe){expandedGrpIdIndex = 1;} } 
			}
			isActiveLayout=false;
			if((expandedGrpId == "" || expandedGrpId == null) && defaultIndexActiveLayout==0){
				defaultIndexActiveLayout= 1; /*if(1 != 1) prioritizedActiveLayout = 1;*/
			}else {if(prioritizedActiveLayout == 0) defaultIndexActiveLayout = expandedGrpIdIndex;}
			if((isActiveLayout && indexActiveLayout== 0) || (prioritizedActiveLayout == 0 && expandedGrpId != null && expandedGrpId.length()!= 0 && expandedGrpIdIndex == 1)) { 
				indexActiveLayout= 1;
				if(!"menu".equalsIgnoreCase(LGType) && !("".equalsIgnoreCase(LGType))){
				String l_sectionTitleReference="";
				String l_sectionTitleType="";
				String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Definition");
				if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
					tools.appendString(l_sectionTitle);
					}
					if(!"".equals(l_sectionTitle))
					pg_layoutGroupMeta.put("title",l_sectionTitle);
					}
				}
				isActiveLayout=false;
				if((expandedGrpId == "" || expandedGrpId == null) && defaultIndexActiveLayout==0){
					defaultIndexActiveLayout= 2; /*if(2 != 1) prioritizedActiveLayout = 2;*/
				}else {if(prioritizedActiveLayout == 0) defaultIndexActiveLayout = expandedGrpIdIndex;}
				if((isActiveLayout && indexActiveLayout== 0) || (prioritizedActiveLayout == 0 && expandedGrpId != null && expandedGrpId.length()!= 0 && expandedGrpIdIndex == 2)) { 
					indexActiveLayout= 2;
					if(!"menu".equalsIgnoreCase(LGType) && !("".equalsIgnoreCase(LGType))){
					String l_sectionTitleReference="";
					String l_sectionTitleType="";
					String l_sectionTitle=StringUtils.crossScriptingFilter(tools.getLocalizedTextForParameterizedString("pyCaption","Implementation"));
					if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
						tools.appendString(l_sectionTitle);
						}
						if(!"".equals(l_sectionTitle))
						pg_layoutGroupMeta.put("title",l_sectionTitle);
						}
					}
					isActiveLayout=false;
					if((expandedGrpId == "" || expandedGrpId == null) && defaultIndexActiveLayout==0){
						defaultIndexActiveLayout= 3; /*if(3 != 1) prioritizedActiveLayout = 3;*/
					}else {if(prioritizedActiveLayout == 0) defaultIndexActiveLayout = expandedGrpIdIndex;}
					if((isActiveLayout && indexActiveLayout== 0) || (prioritizedActiveLayout == 0 && expandedGrpId != null && expandedGrpId.length()!= 0 && expandedGrpIdIndex == 3)) { 
						indexActiveLayout= 3;
						if(!"menu".equalsIgnoreCase(LGType) && !("".equalsIgnoreCase(LGType))){
						String l_sectionTitleReference="";
						String l_sectionTitleType="";
						String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","History");
						if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
							tools.appendString(l_sectionTitle);
							}
							if(!"".equals(l_sectionTitle))
							pg_layoutGroupMeta.put("title",l_sectionTitle);
							}
						}
						if(defaultIndexActiveLayout != 0 && defaultIndexActiveLayout != indexActiveLayout) { 
							 /*if(flagAnyActiveWhenState == 1){ prioritizedActiveLayout = indexActiveLayout; } */ indexActiveLayout=0;
							if(prioritizedActiveLayout!=0) defaultIndexActiveLayout=prioritizedActiveLayout;
						}
						if(flagAnyActiveWhenState == 2) { if(prioritizedActiveLayout != 0) defaultIndexActiveLayout = prioritizedActiveLayout; else defaultIndexActiveLayout = expandedGrpIdIndex; indexActiveLayout = 0; }
						 int j = 0;
						 while (notVisibleLayoutsList.size() > j) {
						 if(notVisibleLayoutsList.contains(defaultIndexActiveLayout)) { 
						 defaultIndexActiveLayout = (notVisibleLayoutsList.get(j) + 1); 
						 if(!notVisibleLayoutsList.contains(defaultIndexActiveLayout)) break;
						 }
						 j++;
						 }
						if (indexActiveLayout == 0 || (("menu".equalsIgnoreCase(LGType)) || ("".equalsIgnoreCase(LGType)))) { 
							if(defaultIndexActiveLayout== 0) { 
								defaultIndexActiveLayout= 1;
							}
							if(defaultIndexActiveLayout==1) { 
								indexActiveLayout= 1;
								String l_sectionTitleReference="";
								String l_sectionTitleType="";
								String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Definition");
								if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
									tools.appendString(l_sectionTitle);
									}
									if(!"".equals(l_sectionTitle))
									pg_layoutGroupMeta.put("title",l_sectionTitle);
								}
								if(defaultIndexActiveLayout==2) { 
									indexActiveLayout= 2;
									String l_sectionTitleReference="";
									String l_sectionTitleType="";
									String l_sectionTitle=StringUtils.crossScriptingFilter(tools.getLocalizedTextForParameterizedString("pyCaption","Implementation"));
									if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
										tools.appendString(l_sectionTitle);
										}
										if(!"".equals(l_sectionTitle))
										pg_layoutGroupMeta.put("title",l_sectionTitle);
									}
									if(defaultIndexActiveLayout==3) { 
										indexActiveLayout= 3;
										String l_sectionTitleReference="";
										String l_sectionTitleType="";
										String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","History");
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
											tools.appendString(l_sectionTitle);
											}
											if(!"".equals(l_sectionTitle))
											pg_layoutGroupMeta.put("title",l_sectionTitle);
										}
									}
									numVisibleLayouts+=3;
									if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
										tools.appendString("</h2></div>");
										}
										List<Integer> visibleLayoutsListInAccordion = new ArrayList<Integer>();
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
											pg_layoutGroupMeta.put("liveUI","" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUTGROUP','pgRef':'.pySections(2)'}") + "");
											if(!repeatSelected.isEmpty()){
											org.json.simple.JSONObject JSONRepeatObj = new org.json.simple.JSONObject(repeatSelected);
											pg_layoutGroupMeta.put("lgActiveMap",JSONRepeatObj.toString());
											}
											pg_layoutGroupMeta.put("labelJSP","false");
											pg_layoutGroupMeta.put("tabGrpId","pzRuleFormLayoutInnerS2");
											pg_layoutGroupMeta.put("format","tab");
											pg_layoutGroupMeta.put("nVisibleLayout","3");
											pg_layoutGroupMeta.put("class"," count-3");
											pg_layoutGroupMeta.put("headinglev","h2");
											pg_layoutGroupMeta.put("menuPage",tools.getStepPage().getReference());
											pg_layoutGroupMeta.put("isMobile",isMobile);
											pg_layoutGroupMeta.put("uniqueid","202602230422380896");
											if(!"".equals(LGType))
											pg_layoutGroupMeta.put("lgType",LGType);
										}
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
											if("accordion".equals(LGType)){
											if(indexExpAccordian != null && Arrays.asList(indexExpAccordian).contains("1")){
											indexActiveLayout = 1; visibleLayoutsListInAccordion.add(indexActiveLayout);
											} else  {
											 if(indexExpAccordian != null && 1==1){ indexActiveLayout = 0; }  } if(prioritizedActiveLayout !=0 && !notVisibleLayoutsList.contains(prioritizedActiveLayout)) indexActiveLayout = prioritizedActiveLayout;
											}
											layoutGroupTemplateCell_1(indexActiveLayout, numVisibleLayouts );
	 }else{ 
											if("accordion".equals(LGType)){
											if(indexExpAccordian != null && Arrays.asList(indexExpAccordian).contains("1")){
											indexActiveLayout = 1; visibleLayoutsListInAccordion.add(indexActiveLayout);
											} else  {
											 if(indexExpAccordian != null && 1==1){ indexActiveLayout = 0; }  } if(prioritizedActiveLayout !=0 && !notVisibleLayoutsList.contains(prioritizedActiveLayout)) indexActiveLayout = prioritizedActiveLayout;
											}
											layoutGroupCell_1(indexActiveLayout, numVisibleLayouts );
	}
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
											if("accordion".equals(LGType)){
											if(indexExpAccordian != null && Arrays.asList(indexExpAccordian).contains("2")){
											indexActiveLayout = 2; visibleLayoutsListInAccordion.add(indexActiveLayout);
											} else  {
											 if(indexExpAccordian != null && 2==1){ indexActiveLayout = 0; }  } if(prioritizedActiveLayout !=0 && !notVisibleLayoutsList.contains(prioritizedActiveLayout)) indexActiveLayout = prioritizedActiveLayout;
											}
											layoutGroupTemplateCell_2(indexActiveLayout, numVisibleLayouts );
	 }else{ 
											if("accordion".equals(LGType)){
											if(indexExpAccordian != null && Arrays.asList(indexExpAccordian).contains("2")){
											indexActiveLayout = 2; visibleLayoutsListInAccordion.add(indexActiveLayout);
											} else  {
											 if(indexExpAccordian != null && 2==1){ indexActiveLayout = 0; }  } if(prioritizedActiveLayout !=0 && !notVisibleLayoutsList.contains(prioritizedActiveLayout)) indexActiveLayout = prioritizedActiveLayout;
											}
											layoutGroupCell_2(indexActiveLayout, numVisibleLayouts );
	}
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
											if("accordion".equals(LGType)){
											if(indexExpAccordian != null && Arrays.asList(indexExpAccordian).contains("3")){
											indexActiveLayout = 3; visibleLayoutsListInAccordion.add(indexActiveLayout);
											} else  {
											 if(indexExpAccordian != null && 3==1){ indexActiveLayout = 0; }  } if(prioritizedActiveLayout !=0 && !notVisibleLayoutsList.contains(prioritizedActiveLayout)) indexActiveLayout = prioritizedActiveLayout;
											}
											layoutGroupTemplateCell_3(indexActiveLayout, numVisibleLayouts );
	 }else{ 
											if("accordion".equals(LGType)){
											if(indexExpAccordian != null && Arrays.asList(indexExpAccordian).contains("3")){
											indexActiveLayout = 3; visibleLayoutsListInAccordion.add(indexActiveLayout);
											} else  {
											 if(indexExpAccordian != null && 3==1){ indexActiveLayout = 0; }  } if(prioritizedActiveLayout !=0 && !notVisibleLayoutsList.contains(prioritizedActiveLayout)) indexActiveLayout = prioritizedActiveLayout;
											}
											layoutGroupCell_3(indexActiveLayout, numVisibleLayouts );
	}
										lgExpandedGrpIdHidden= (tools.getParamCSF("EXPANDEDLGLayoutGrouppzRuleFormLayoutInnerS2") != "" && tools.getParamCSF("EXPANDEDLGLayoutGrouppzRuleFormLayoutInnerS2") != null) ? tools.getParamCSF("EXPANDEDLGLayoutGrouppzRuleFormLayoutInnerS2") : indexActiveLayout+"";
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
										}
										if(!"accordion".equals(LGType)){
										if(indexActiveLayout == 0) {
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
											tools.appendString("<input type='hidden' name='EXPANDEDLGLayoutGrouppzRuleFormLayoutInnerS2' value='" + lgExpandedGrpIdHidden + "'/>");
											
										}
									} else {
									if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
										tools.appendString("<input type='hidden' name='EXPANDEDLGLayoutGrouppzRuleFormLayoutInnerS2' value='" + indexActiveLayout + "'/>");
										
									}
								}
								}else {
								if(visibleLayoutsListInAccordion.size() > 0){
								commaSeparateList = visibleLayoutsListInAccordion.toString().replaceAll("[\\s\\[\\]]", "");
								if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
									tools.appendString("<input type='hidden' name='EXPANDEDLGLayoutGrouppzRuleFormLayoutInnerS2' value='" + commaSeparateList + "'/>");
									
								}
								} else {
								if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
									tools.appendString("<input type='hidden' name='EXPANDEDLGLayoutGrouppzRuleFormLayoutInnerS2' value='" + lgExpandedGrpIdHidden + "'/>");
									
								}
								}
								}
								if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
									tools.appendString("<input type='hidden' name='LGTypeLGLayoutGrouppzRuleFormLayoutInnerS2' value='" + tools.getParamCSF(LGTypeHiddenId) + "'/>");
									
								tools.appendString("</div>");
								}
								if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
									cc_lg.addPropertyToMetadata("expandGrpId",lgExpandedGrpIdHidden);
									if(!"".equals(commaSeparateList)) 
									cc_lg.addPropertyToMetadata("activeList",commaSeparateList);
									cc_lg.addPropertyToMetadata("indexActive",indexActiveLayout+"");
									cc_lg.addAdditionalBundles("LGBundle","pzPega_layout_group_scripts");
									cc_lg.addAdditionalBundles("ControlMenu","pzPega_control_menu_scripts");
									cc_lg.endComponent();
								}
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
							String paramName = "EXPANDEDSubSectionpzRuleFormLayoutInnerBB";
							metadataPage.put("paramName", paramName);
							String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUTGROUP','pgRef':'.pySections(2)'}");
							if(!inspectorLayoutData.isEmpty()) {
							metadataPage.put("liveUI", inspectorLayoutData);
							}
							String pyPrefix = null;
							metadataPage.put("sectionIndex","2");
							IUIComponent containerComponent = pzAuto.getUIComponent();
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
pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_5();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_5();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_1(String lazyLoadToken) {
if("deferLoad".equals(lazyLoadToken)) {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() && !"true".equals(tools.getParamValue("pyPegaDesignMode"))) {tools.appendString("<div class='lazyload-layout' data-deferinvoke='simpleLayout_1'>");pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage("pyLoadingMessage");pzAuto.emitIncludeStreamReference("pyLoadingMessage",null,null,"Rule-HTML-Section",null);tools.appendString("</div>");}else{simpleLayout_1();}
}else {
Map<String, Object> loadingSectionInfo = new HashMap<String, Object>();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_10", "pyLoadingMessage", loadingSectionInfo);
}
}
public void pzLayoutBodyWrapper_1() {
tools.appendString("<div class='layout layout-noheader layout-noheader-warnings'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() && !"true".equals(tools.getParamValue("pyPegaDesignMode"))) {tools.appendString("<div class='lazyload-layout' data-deferinvoke='simpleLayout_1'>");pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage("pyLoadingMessage");pzAuto.emitIncludeStreamReference("pyLoadingMessage",null,null,"Rule-HTML-Section",null);tools.appendString("</div>");}else{simpleLayout_1();}
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
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
public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
				tools.putParamValue("runTimeSecStreamName", "");
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					try{
						pzPackageRuntime.packageSection("pzRuleFormLayoutInner",
						tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
						}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
						}
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("SectionName", "");
						refreshActionRequest.registerFixedParameter("PreActivity", "pzHandleModelerDraftModeToolbarClick");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzRuleFormLayoutInner"));
						staticURLStr.append("&PreActivity=pzHandleModelerDraftModeToolbarClick");
						tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzHandleModelerDraftModeToolbarClick\", \"");
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

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}								String returnString = actionsStringBuilder.toString();
								tools.popStreamBody();
								return returnString;
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20190904044239087146265",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","pzRuleFormLayoutInner_$CTX$_2");
		String repeatIndx = "";
	modePage2.put("styles","");
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyActionPrompt");
	}
	pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("imgSrc","none");
	modePage2.put("actionImgPos","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Exit draft mode\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Exit draft mode", ".pyButtonLabel");
	}
	pyLabel = "Exit draft mode";
	modePage2.put("pyLabel",pyLabel);
	modePage2.put("captionType","text");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	modePage2.put("pyFormatTypeActionable","none");
	String pyFormatValue = "";
	modePage2.put("pyFormatValue",pyFormatValue);
	String spxUniqueStreamHash6 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash6 != null && !"".equals(spxUniqueStreamHash6)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash6,pxUniqueStreamHash+"_6");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_6");
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
		 String buttonUID = "name='pzRuleFormLayoutInner_"+ referenceString+ "_2'";
	 String securedPropValue = null;
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20190904044239087146265") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
				tools.putParamValue("runTimeSecStreamName", "");
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					try{
						pzPackageRuntime.packageSection("pzRuleFormLayoutInner",
						tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
						}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
						}
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("SectionName", "");
						refreshActionRequest.registerFixedParameter("PreActivity", "pzHandleModelerDraftModeToolbarClick");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzRuleFormLayoutInner"));
						staticURLStr.append("&PreActivity=pzHandleModelerDraftModeToolbarClick");
						tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzHandleModelerDraftModeToolbarClick\", \"");
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

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Exit draft mode",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</a>");							}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }							tools.putParamValue("doAutoFormatting", "false");
							tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}							} catch (Exception e) {

							
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'							&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Link");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }								}


}



public void generateClientWhenDiv_2() {
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
	generateClientWhenDiv_2();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-label item-" + Integer.toString(index) + "    " + pzSection.getCustomStyle(false, "","standard_dataLabelRead","standard_dataLabelWrite")  + " '  STRING_TYPE='label' RESERVE_SPACE='false'><div class='content-inner '>" + "<div  " + pzCell.getTestIdIfEnabled("2014100809571002462831") + "  class='field-item " + pzSection.getCustomStyle(false, "","dataLabelRead","dataLabelWrite") + "' >");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","DraftModeWarningMessage") + "</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014100809571002462831")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("labelReadClass","dataLabelRead");
	pgCells.put("labelWriteClass","dataLabelWrite");
	pgCells.put("customROStyles","standard_dataLabelRead");
	pgCells.put("customRWStyles","standard_dataLabelWrite");
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "DraftModeWarningMessage";
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
	generateClientWhenDiv_2();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxLink",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxLink_1();
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20190904044239087146265-Label")).append(" ").toString().replace("data-test-id=","").trim());
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxLink",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxLink_1();labelName = "Link";
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


public void generateClientWhenDiv_1() {
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
tools.appendString(" SWP=\".pyDraftModeON\"  SHOW_WHEN=\".pyDraftModeON\"");
if(currentTemplatingStatus =='N')
tools.appendString(" data-simplelayout = \"true\" ");
else
clientWhenAttr += "data-simplelayout=true ";
if(pzAuto.evaluateWhen(".pyDraftModeON",null,true)){
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
if(currentTemplatingStatus =='N')
tools.appendString("'");
else
clientWhenAttr += "'";
if(currentTemplatingStatus =='N')
tools.appendString(">");
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges(tools.getStepPage().getReference()+".pyDraftModeON", -1);
	}
}catch(Exception e){}
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormLayoutInnerB","",false);
}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201805161116110127442") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + " content  layout-content-inline_middle content-inline_middle  clearfix" + "'  ");
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
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.forceReload();
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
	public void pzLayoutContainer_1(String methodName) {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	expressionId = pxUniqueStreamHash+"_9";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen", ".pyDraftModeON", expressionId);
	expressionId = expression.getId();
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId)) {
		metadataPage.put("pyExpressionId",expressionId);
	}
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionpzRuleFormLayoutInnerB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-warnings");
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
	metadataPage.put("methodnm", "simpleLayout_1");
	}
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Inline-block");
	if("".equals(methodName)) {
	containerComponent.forceReload();
	}
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
	methodName = "";
	}
	pzLayoutBody_1("".equals(methodName) ? "deferLoad" : "");
	containerComponent.endComponent();
	}
public void pzLayout_1() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
boolean templateStatusDisabled = !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(templateStatusDisabled)
generateClientWhenDiv_1();
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_1();
}
if(templateStatusDisabled)
tools.appendString("\n\t\t</div>");
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1("pzLayoutContainer_1");
tools.putParamValue("pyInlineStyleSec","");
}
}


private void performStream_1() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "AUTOMATION");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Rule-Obj-Activity");
	oStreamProperties_1.put("pyCircumstanceProp", ".pyActivityType");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20191217T071019.403 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzRuleFormLayoutInner");
	oStreamProperties_1.put("pyRuleSetVersion", "08-05-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}private void executeStream_1() {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_CIRCUMSTANCED, "true");pxUniqueStreamHash = "e79888b98b5da78281fbea36b85eea5eafbdf62e";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzRuleFormLayoutInner",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20191217T071019.403 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20191217T071019.403 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20191217T071019.403 GMT */
}
private void executeStream_2() {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_CIRCUMSTANCED, "true");pxUniqueStreamHash = "7e57f8e893f228c94ca04b1aac0c0d15261b1d06";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzRuleFormLayoutInner",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_2();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20180713T135246.131 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20180713T135246.131 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_1)) {
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20180713T135246.131 GMT */
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_1;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_1.getRuleSetName(), oTraceInfo_1.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20191217T071019.403 GMT", "Rule-Obj-Activity pzRuleFormLayoutInner", "Pega-Desktop", "08-05-01", "20200304T115924.719 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-OBJ-ACTIVITY PZRULEFORMLAYOUTINNER #20180713T135246.131 GMT", "Rule-Obj-Activity pzRuleFormLayoutInner", "Pega-Desktop", "08-01-01", "20180713T135246.131 GMT");
}
