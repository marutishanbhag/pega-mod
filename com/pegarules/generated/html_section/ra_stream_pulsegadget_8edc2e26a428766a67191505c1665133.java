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
 * Builds JSP stream WORK-!PULSEGADGET.
 */
public class ra_stream_pulsegadget_8edc2e26a428766a67191505c1665133 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.PulseGadget.OFON2J_ProcessO_Work_Onboarding.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 987719780;
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
	public ra_stream_pulsegadget_8edc2e26a428766a67191505c1665133(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "e0d3b75abe35a9854d16760a572138b4672f367b";
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
String appliesToClass = tools.getPrimaryPage() != null ? tools.getPrimaryPage().getString("pxObjClass") : "OFON2J-ProcessO-Work-Onboarding";
final RuleChooser ruleChooser_1 = ((PegaDatabase) tools.getDatabase()).getRuleChooser(appliesToClass, tools.getThread());
/* handling 1 of 2 definitions  */
if (ruleChooser_1.ruleApplies(new RuleCharacteristicsImpl("pxDeviceType", "Phone", null, RuleResolutionStatistics.CircumstanceType.valueOf("TEMPLATE") ,null, null, null, tools))) {
/* Instance RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.689 GMT	Theme-Cosmos:04-01-01	pxDeviceType=Phone	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
executeStream_1();
/* handling 2 of 2 definitions (isLast)  */
} else {
/* Instance RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.681 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
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
	"Rule-HTML-Section:PULSEGADGET", 
	"Rule-HTML-Section:PULSEGADGET"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PULSEGADGET","Rule-HTML-Section","WORK-",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.689 GMT","!PULSEGADGET",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1874538401), 
		new DependentRuleInfo("PULSEGADGET","Rule-HTML-Section","WORK-",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.681 GMT","!PULSEGADGET",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",987719780)
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
//	RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.689 GMT:20210506T204027.689 GMT
//	RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.681 GMT:20210506T204027.681 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODY #20221007T070330.438 GMT:20221010T104158.645 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODYCONTENT--(CL762755102FCAC7F04E931D9162F7533A #20180713T133341.219 GMT:20180713T133341.219 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
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
		return "7bbbf59d56c7af9469b48b91298b5c18";
	}

	public String getDefinitionAppliesToClass() {
		return "Work-";
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
  pzSection.beginSection("PulseGadget",1,"Rule-HTML-Section","{'type':'Section','ruleName':'PulseGadget','insKey':'RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.681 GMT','sectionType':'standard'}");
pzLayout_2();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void pzLayoutBody_2() {
includeSectionBody_2();
}
public void pzLayoutBodyWrapper_2() {
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_2();
}
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
	secParams.put("Context",".pzInsKey");
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	}
	secInfo.put("pxGadgetClass", "PegaGadget-Feed");
	secInfo.put("paramxml","<?xml version=\"1.0\"?><pagedata><pxObjClass>PegaGadget-Feed</pxObjClass><pyIsPostingEnabled>true</pyIsPostingEnabled><pyLabel>Pulse</pyLabel><pyPostContexts REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-PostContext</pxObjClass><pyKeyString>.pzInsKey</pyKeyString><pyName>Message on this case</pyName></rowdata></pyPostContexts><pyDataSources REPEATINGTYPE=\"PageList\"/><pySelectedPostTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pyCategory>Message</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Message</pyClassName><pyIsEnabled>true</pyIsEnabled><pyDescription>Visible to everyone</pyDescription><pyLabel>Post</pyLabel><pyImage>pi pi-globe</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTemplateDisplayText/><pzRuleParametersShowSkills>false</pzRuleParametersShowSkills><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Message</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyDataSourceReference>D_pxPosts</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyTemplateInputBox/><pyAllowFilter>true</pyAllowFilter><pyNote>RH_1.pySections(1).pySectionBody(1).pzSectionParamPage.pySelectedPostTypes(1)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyMessages</pyLabel><pyMessage/><pySelected>true</pySelected><pzRuleParameters REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-MethodParams</pxObjClass><pyTemplateInputBox/><pyParametersParamValue/><pyParametersParamIntelliValidateAs/><pyParametersParamName>Context</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParameterRequired/><pyParametersParamDesc>Context</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>Embed-MethodParams</pxObjClass><pyParametersParamIntelliValidateAs/><pyParametersParamName>retrieveTags</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParametersParamDesc>true or false</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>0</pyParametersParamReq></rowdata></pzRuleParameters><pzSourceDataPageParameters><Context>.pzInsKey</Context><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata><rowdata REPEATINGINDEX=\"2\"><pyCategory>Private</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Post-Private</pyClassName><pyIsEnabled>true</pyIsEnabled><pyDescription>Visible to specific users</pyDescription><pyLabel>Private post</pyLabel><pyImage>pi pi-eye-off</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTemplateDisplayText/><pzRuleParametersShowSkills>false</pzRuleParametersShowSkills><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Post-Private</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyDataSourceReference>D_pxDirectMessages</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyTemplateInputBox/><pyAllowFilter>true</pyAllowFilter><pyNote>RH_1.pySections(1).pySectionBody(1).pzSectionParamPage.pySelectedPostTypes(2)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyDirectMessages</pyLabel><pyMessage/><pySelected>true</pySelected><pzRuleParameters REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-MethodParams</pxObjClass><pyParametersParamIntelliValidateAs/><pyParametersParamName>Context</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParametersParamDesc>Context</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>-1</pyParametersParamReq></rowdata></pzRuleParameters><pzSourceDataPageParameters><Context>.pzInsKey</Context></pzSourceDataPageParameters></pyFeedDataSource><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata><rowdata REPEATINGINDEX=\"3\"><pyCategory>Task</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>Work-Cover-Task</pyClassName><pyIsEnabled>true</pyIsEnabled><pyDescription>Create and assign task</pyDescription><pyLabel>Task</pyLabel><pyImage>pi pi-clipboard-check</pyImage><pySelected>false</pySelected><pyFeedDataSource><pyTemplateDisplayText/><pzRuleParametersShowSkills>false</pzRuleParametersShowSkills><pyIconReference>pi pi-clipboard-check</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxCreateDateTime</pyPostedWhenReference><pyIconType>iconclass</pyIconType><pyClassName>Work-Cover-Task</pyClassName><pyCommentContext>.pzInsKey</pyCommentContext><pyMessageReference>pyPostDetails</pyMessageReference><pyIsCommentingEnabled>true</pyIsCommentingEnabled><pyDataSourceReference>D_pxTasks</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyTemplateInputBox/><pyAllowFilter>true</pyAllowFilter><pyNote>RH_1.pySections(1).pySectionBody(1).pzSectionParamPage.pySelectedPostTypes(3)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyTasks</pyLabel><pyMessage/><pySelected>true</pySelected><pzRuleParameters REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-MethodParams</pxObjClass><pyParametersParamIntelliValidateAs/><pyParametersParamName>AssignedTo</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParametersParamDesc>Assigned to operator</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"2\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>CreatedBy</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180831T082908.248 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Created by operator</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"3\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>Context</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180831T082908.843 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Context</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>-1</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"4\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>Application</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180831T084117.830 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Application name</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"5\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>UpdateTime</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180828T135952.571 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Before date time</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>0</pyParametersParamReq></rowdata></pzRuleParameters><pzSourceDataPageParameters><Context>.pzInsKey</Context><AssignedTo>varunkadmin</AssignedTo><CreatedBy>varunkadmin</CreatedBy><UpdateTime/><Application>AgileStu</Application></pzSourceDataPageParameters></pyFeedDataSource><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata></pySelectedPostTypes><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pagedata>");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_2","pyCaseFeed", secInfo);
}


public void includeSectionBody_2() { 
	buildWhiteList_1();
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
								ClipboardPage pyAdvParams = tools.createPage("PegaGadget-Feed","");
								pyAdvParams.adoptXMLForm("<?xml version=\"1.0\"?><pagedata><pxObjClass>PegaGadget-Feed</pxObjClass><pyIsPostingEnabled>true</pyIsPostingEnabled><pyLabel>Pulse</pyLabel><pyPostContexts REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-PostContext</pxObjClass><pyKeyString>.pzInsKey</pyKeyString><pyName>Message on this case</pyName></rowdata></pyPostContexts><pyDataSources REPEATINGTYPE=\"PageList\"/><pySelectedPostTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pyCategory>Message</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Message</pyClassName><pyIsEnabled>true</pyIsEnabled><pyDescription>Visible to everyone</pyDescription><pyLabel>Post</pyLabel><pyImage>pi pi-globe</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTemplateDisplayText/><pzRuleParametersShowSkills>false</pzRuleParametersShowSkills><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Message</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyDataSourceReference>D_pxPosts</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyTemplateInputBox/><pyAllowFilter>true</pyAllowFilter><pyNote>RH_1.pySections(1).pySectionBody(1).pzSectionParamPage.pySelectedPostTypes(1)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyMessages</pyLabel><pyMessage/><pySelected>true</pySelected><pzRuleParameters REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-MethodParams</pxObjClass><pyTemplateInputBox/><pyParametersParamValue/><pyParametersParamIntelliValidateAs/><pyParametersParamName>Context</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParameterRequired/><pyParametersParamDesc>Context</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>Embed-MethodParams</pxObjClass><pyParametersParamIntelliValidateAs/><pyParametersParamName>retrieveTags</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParametersParamDesc>true or false</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>0</pyParametersParamReq></rowdata></pzRuleParameters><pzSourceDataPageParameters><Context>.pzInsKey</Context><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata><rowdata REPEATINGINDEX=\"2\"><pyCategory>Private</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Post-Private</pyClassName><pyIsEnabled>true</pyIsEnabled><pyDescription>Visible to specific users</pyDescription><pyLabel>Private post</pyLabel><pyImage>pi pi-eye-off</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTemplateDisplayText/><pzRuleParametersShowSkills>false</pzRuleParametersShowSkills><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Post-Private</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyDataSourceReference>D_pxDirectMessages</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyTemplateInputBox/><pyAllowFilter>true</pyAllowFilter><pyNote>RH_1.pySections(1).pySectionBody(1).pzSectionParamPage.pySelectedPostTypes(2)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyDirectMessages</pyLabel><pyMessage/><pySelected>true</pySelected><pzRuleParameters REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-MethodParams</pxObjClass><pyParametersParamIntelliValidateAs/><pyParametersParamName>Context</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParametersParamDesc>Context</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>-1</pyParametersParamReq></rowdata></pzRuleParameters><pzSourceDataPageParameters><Context>.pzInsKey</Context></pzSourceDataPageParameters></pyFeedDataSource><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata><rowdata REPEATINGINDEX=\"3\"><pyCategory>Task</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>Work-Cover-Task</pyClassName><pyIsEnabled>true</pyIsEnabled><pyDescription>Create and assign task</pyDescription><pyLabel>Task</pyLabel><pyImage>pi pi-clipboard-check</pyImage><pySelected>false</pySelected><pyFeedDataSource><pyTemplateDisplayText/><pzRuleParametersShowSkills>false</pzRuleParametersShowSkills><pyIconReference>pi pi-clipboard-check</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxCreateDateTime</pyPostedWhenReference><pyIconType>iconclass</pyIconType><pyClassName>Work-Cover-Task</pyClassName><pyCommentContext>.pzInsKey</pyCommentContext><pyMessageReference>pyPostDetails</pyMessageReference><pyIsCommentingEnabled>true</pyIsCommentingEnabled><pyDataSourceReference>D_pxTasks</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyTemplateInputBox/><pyAllowFilter>true</pyAllowFilter><pyNote>RH_1.pySections(1).pySectionBody(1).pzSectionParamPage.pySelectedPostTypes(3)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyTasks</pyLabel><pyMessage/><pySelected>true</pySelected><pzRuleParameters REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-MethodParams</pxObjClass><pyParametersParamIntelliValidateAs/><pyParametersParamName>AssignedTo</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParametersParamDesc>Assigned to operator</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"2\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>CreatedBy</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180831T082908.248 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Created by operator</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"3\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>Context</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180831T082908.843 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Context</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>-1</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"4\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>Application</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180831T084117.830 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Application name</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"5\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>UpdateTime</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180828T135952.571 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Before date time</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>0</pyParametersParamReq></rowdata></pzRuleParameters><pzSourceDataPageParameters><Context>.pzInsKey</Context><AssignedTo>varunkadmin</AssignedTo><CreatedBy>varunkadmin</CreatedBy><UpdateTime/><Application>AgileStu</Application></pzSourceDataPageParameters></pyFeedDataSource><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata></pySelectedPostTypes><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pagedata>");
								pyAdvParams.putString("SectionName","pyCaseFeed");
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
	if(tools.getIfPresent(".pzInsKey") != null){tools.putParamValue("Context",tools.getIfPresent(".pzInsKey").getStringValue());}else{tools.putParamValue("Context",".pzInsKey");}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
		}}catch(Exception e){}tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pyCaseFeed";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
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
String paramName = "EXPANDEDSubSectionPulseGadgetB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pyCaseFeed'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("sectionIndex","1");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Inline-block");
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
containerComponent.addPropertyToMetadata("rwclass", "padding-lr-1x");
containerComponent.addPropertyToMetadata("roclass", "padding-lr-1x");
pzLayoutBody_2();
containerComponent.endComponent();
}
public void pzLayout_2() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pyCaseFeed'}") + ">");
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
String RWClasses = "";
RWClasses += " ";
RWClasses += pzSection.getCustomStyle(false, "","padding-lr-1x","padding-lr-1x") ;
RWClasses += " ";
tools.putParamValue("RWClasses",RWClasses);
pzLayoutBodyWrapper_2();
}
if(bWrapIncSection){
tools.appendString("</span>");
}if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
String RWClassesHelper = "";
RWClassesHelper += " ";
RWClassesHelper += pzSection.getCustomStyle(false, "","padding-lr-1x","padding-lr-1x") ;
RWClassesHelper += " ";
tools.putParamValue("RWClasses",RWClassesHelper);
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
}

private void performStream_2() throws Throwable {
buildWhiteList_1();pzSectionBody_2();}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Yes");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "");
	oStreamProperties_2.put("pyClassName", "Work-");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.681 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "PulseGadget");
	oStreamProperties_2.put("pyRuleSetVersion", "04-01-01");
}
private boolean hasNonTemplateMethod_2() {	 return false;}public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("PulseGadget",1,"Rule-HTML-Section","{'type':'Section','ruleName':'PulseGadget','insKey':'RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.689 GMT','sectionType':'standard'}");
pzLayout_1();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void pzLayoutBody_1() {
includeSectionBody_1();
}
public void pzLayoutBodyWrapper_1() {
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_1();
}
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
	secParams.put("Context",".pzInsKey");
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	}
	secInfo.put("pxGadgetClass", "PegaGadget-Feed");
	secInfo.put("paramxml","<?xml version=\"1.0\"?><pagedata><pxObjClass>PegaGadget-Feed</pxObjClass><pyIsPostingEnabled>true</pyIsPostingEnabled><pyLabel>Pulse</pyLabel><pyPostContexts REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-PostContext</pxObjClass><pyKeyString>.pzInsKey</pyKeyString><pyName>Message on this case</pyName></rowdata></pyPostContexts><pyDataSources REPEATINGTYPE=\"PageList\"/><pySelectedPostTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pyCategory>Message</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Message</pyClassName><pyDescription>Visible to everyone</pyDescription><pyLabel>Post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-globe</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTemplateDisplayText/><pzRuleParametersShowSkills>false</pzRuleParametersShowSkills><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Message</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyDataSourceReference>D_pxPosts</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyTemplateInputBox/><pyAllowFilter>true</pyAllowFilter><pyNote>TempRecordForDVPropPanel.pySections(1).pySectionBody(1).pzSectionParamPage.pySelectedPostTypes(1)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyMessages</pyLabel><pyMessage/><pySelected>true</pySelected><pzRuleParameters REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-MethodParams</pxObjClass><pyTemplateInputBox/><pyParametersParamValue/><pyParametersParamIntelliValidateAs/><pyParametersParamName>Context</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParameterRequired/><pyParametersParamDesc>Context</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>Embed-MethodParams</pxObjClass><pyParametersParamIntelliValidateAs/><pyParametersParamName>retrieveTags</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParametersParamDesc>true or false</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>0</pyParametersParamReq></rowdata></pzRuleParameters><pzSourceDataPageParameters><Context>.pzInsKey</Context><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata><rowdata REPEATINGINDEX=\"2\"><pyCategory>Private</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Post-Private</pyClassName><pyDescription>Visible to specific users</pyDescription><pyLabel>Private post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-eye-off</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTemplateDisplayText/><pzRuleParametersShowSkills>false</pzRuleParametersShowSkills><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Post-Private</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyDataSourceReference>D_pxDirectMessages</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyTemplateInputBox/><pyAllowFilter>true</pyAllowFilter><pyNote>TempRecordForDVPropPanel.pySections(1).pySectionBody(1).pzSectionParamPage.pySelectedPostTypes(2)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyDirectMessages</pyLabel><pyMessage/><pySelected>true</pySelected><pzRuleParameters REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-MethodParams</pxObjClass><pyParametersParamIntelliValidateAs/><pyParametersParamName>Context</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParametersParamDesc>Context</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>-1</pyParametersParamReq></rowdata></pzRuleParameters><pzSourceDataPageParameters><Context>.pzInsKey</Context><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata><rowdata REPEATINGINDEX=\"3\"><pyCategory>Task</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>Work-Cover-Task</pyClassName><pyDescription>Create and assign task</pyDescription><pyLabel>Task</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-clipboard-check</pyImage><pySelected>false</pySelected><pyFeedDataSource><pyTemplateDisplayText/><pzRuleParametersShowSkills>false</pzRuleParametersShowSkills><pyIconReference>pi pi-clipboard-check</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxCreateDateTime</pyPostedWhenReference><pyIconType>iconclass</pyIconType><pyClassName>Work-Cover-Task</pyClassName><pyCommentContext>.pzInsKey</pyCommentContext><pyMessageReference>pyPostDetails</pyMessageReference><pyIsCommentingEnabled>true</pyIsCommentingEnabled><pyDataSourceReference>D_pxTasks</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyTemplateInputBox/><pyAllowFilter>true</pyAllowFilter><pyNote>TempRecordForDVPropPanel.pySections(1).pySectionBody(1).pzSectionParamPage.pySelectedPostTypes(3)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyTasks</pyLabel><pyMessage/><pySelected>true</pySelected><pzRuleParameters REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-MethodParams</pxObjClass><pyParametersParamIntelliValidateAs/><pyParametersParamName>AssignedTo</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParametersParamDesc>Assigned to operator</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"2\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>CreatedBy</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180831T082908.248 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Created by operator</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"3\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>Context</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180831T082908.843 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Context</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>-1</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"4\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>Application</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180831T084117.830 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Application name</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"5\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>UpdateTime</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180828T135952.571 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Before date time</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>0</pyParametersParamReq></rowdata></pzRuleParameters><pzSourceDataPageParameters><Context>.pzInsKey</Context><AssignedTo>zarlm</AssignedTo><CreatedBy>zarlm</CreatedBy><UpdateTime/><Application>DevBnB</Application><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata></pySelectedPostTypes><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pagedata>");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_2","pyCaseFeed", secInfo);
}
public void buildWhiteList_1() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
}


public void includeSectionBody_1() { 
	buildWhiteList_1();
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
								ClipboardPage pyAdvParams = tools.createPage("PegaGadget-Feed","");
								pyAdvParams.adoptXMLForm("<?xml version=\"1.0\"?><pagedata><pxObjClass>PegaGadget-Feed</pxObjClass><pyIsPostingEnabled>true</pyIsPostingEnabled><pyLabel>Pulse</pyLabel><pyPostContexts REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-PostContext</pxObjClass><pyKeyString>.pzInsKey</pyKeyString><pyName>Message on this case</pyName></rowdata></pyPostContexts><pyDataSources REPEATINGTYPE=\"PageList\"/><pySelectedPostTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pyCategory>Message</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Message</pyClassName><pyDescription>Visible to everyone</pyDescription><pyLabel>Post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-globe</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTemplateDisplayText/><pzRuleParametersShowSkills>false</pzRuleParametersShowSkills><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Message</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyDataSourceReference>D_pxPosts</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyTemplateInputBox/><pyAllowFilter>true</pyAllowFilter><pyNote>TempRecordForDVPropPanel.pySections(1).pySectionBody(1).pzSectionParamPage.pySelectedPostTypes(1)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyMessages</pyLabel><pyMessage/><pySelected>true</pySelected><pzRuleParameters REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-MethodParams</pxObjClass><pyTemplateInputBox/><pyParametersParamValue/><pyParametersParamIntelliValidateAs/><pyParametersParamName>Context</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParameterRequired/><pyParametersParamDesc>Context</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>Embed-MethodParams</pxObjClass><pyParametersParamIntelliValidateAs/><pyParametersParamName>retrieveTags</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParametersParamDesc>true or false</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>0</pyParametersParamReq></rowdata></pzRuleParameters><pzSourceDataPageParameters><Context>.pzInsKey</Context><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata><rowdata REPEATINGINDEX=\"2\"><pyCategory>Private</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Post-Private</pyClassName><pyDescription>Visible to specific users</pyDescription><pyLabel>Private post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-eye-off</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTemplateDisplayText/><pzRuleParametersShowSkills>false</pzRuleParametersShowSkills><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Post-Private</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyDataSourceReference>D_pxDirectMessages</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyTemplateInputBox/><pyAllowFilter>true</pyAllowFilter><pyNote>TempRecordForDVPropPanel.pySections(1).pySectionBody(1).pzSectionParamPage.pySelectedPostTypes(2)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyDirectMessages</pyLabel><pyMessage/><pySelected>true</pySelected><pzRuleParameters REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-MethodParams</pxObjClass><pyParametersParamIntelliValidateAs/><pyParametersParamName>Context</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParametersParamDesc>Context</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>-1</pyParametersParamReq></rowdata></pzRuleParameters><pzSourceDataPageParameters><Context>.pzInsKey</Context><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata><rowdata REPEATINGINDEX=\"3\"><pyCategory>Task</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>Work-Cover-Task</pyClassName><pyDescription>Create and assign task</pyDescription><pyLabel>Task</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-clipboard-check</pyImage><pySelected>false</pySelected><pyFeedDataSource><pyTemplateDisplayText/><pzRuleParametersShowSkills>false</pzRuleParametersShowSkills><pyIconReference>pi pi-clipboard-check</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxCreateDateTime</pyPostedWhenReference><pyIconType>iconclass</pyIconType><pyClassName>Work-Cover-Task</pyClassName><pyCommentContext>.pzInsKey</pyCommentContext><pyMessageReference>pyPostDetails</pyMessageReference><pyIsCommentingEnabled>true</pyIsCommentingEnabled><pyDataSourceReference>D_pxTasks</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyTemplateInputBox/><pyAllowFilter>true</pyAllowFilter><pyNote>TempRecordForDVPropPanel.pySections(1).pySectionBody(1).pzSectionParamPage.pySelectedPostTypes(3)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyTasks</pyLabel><pyMessage/><pySelected>true</pySelected><pzRuleParameters REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-MethodParams</pxObjClass><pyParametersParamIntelliValidateAs/><pyParametersParamName>AssignedTo</pyParametersParamName><pyParametersParamDefaultValue/><pyParametersParamIntelliRule/><pyParametersParamDesc>Assigned to operator</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pyParametersParamType>STRING</pyParametersParamType><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"2\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>CreatedBy</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180831T082908.248 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Created by operator</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"3\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>Context</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180831T082908.843 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Context</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>-1</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"4\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>Application</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180831T084117.830 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Application name</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>0</pyParametersParamReq></rowdata><rowdata REPEATINGINDEX=\"5\"><pyParametersParamIntelliRule/><pyParametersParamType>STRING</pyParametersParamType><pxObjClass>Embed-MethodParams</pxObjClass><pxCreateOperator>areks1_casecube</pxCreateOperator><pyParametersParamIntelliValidateAs/><pyParametersParamName>UpdateTime</pyParametersParamName><pyParametersParamDefaultValue/><pxCreateDateTime>20180828T135952.571 GMT</pxCreateDateTime><pxCreateSystemID>pega</pxCreateSystemID><pyParametersParamDesc>Before date time</pyParametersParamDesc><pyParametersParamInOut>IN</pyParametersParamInOut><pxCreateOpName>Sandeep Arekath</pxCreateOpName><pyParametersParamReq>0</pyParametersParamReq></rowdata></pzRuleParameters><pzSourceDataPageParameters><Context>.pzInsKey</Context><AssignedTo>zarlm</AssignedTo><CreatedBy>zarlm</CreatedBy><UpdateTime/><Application>DevBnB</Application><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata></pySelectedPostTypes><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pagedata>");
								pyAdvParams.putString("SectionName","pyCaseFeed");
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
	if(tools.getIfPresent(".pzInsKey") != null){tools.putParamValue("Context",tools.getIfPresent(".pzInsKey").getStringValue());}else{tools.putParamValue("Context",".pzInsKey");}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
		}}catch(Exception e){}tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pyCaseFeed";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionPulseGadgetB","",false);
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
String paramName = "EXPANDEDSubSectionPulseGadgetB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pyCaseFeed'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("sectionIndex","1");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Inline-block");
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
containerComponent.addPropertyToMetadata("rwclass", "padding-lr-1x");
containerComponent.addPropertyToMetadata("roclass", "padding-lr-1x");
pzLayoutBody_1();
containerComponent.endComponent();
}
public void pzLayout_1() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pyCaseFeed'}") + ">");
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
String RWClasses = "";
RWClasses += " ";
RWClasses += pzSection.getCustomStyle(false, "","padding-lr-1x","padding-lr-1x") ;
RWClasses += " ";
tools.putParamValue("RWClasses",RWClasses);
pzLayoutBodyWrapper_1();
}
if(bWrapIncSection){
tools.appendString("</span>");
}if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
String RWClassesHelper = "";
RWClassesHelper += " ";
RWClassesHelper += pzSection.getCustomStyle(false, "","padding-lr-1x","padding-lr-1x") ;
RWClassesHelper += " ";
tools.putParamValue("RWClasses",RWClassesHelper);
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}

private void performStream_1() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "Phone");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Work-");
	oStreamProperties_1.put("pyCircumstanceProp", "pxDeviceType");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.689 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "PulseGadget");
	oStreamProperties_1.put("pyRuleSetVersion", "04-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}private void executeStream_1() {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_CIRCUMSTANCED, "true");pxUniqueStreamHash = "e0d3b75abe35a9854d16760a572138b4672f367b";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("PulseGadget",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.689 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.689 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.689 GMT */
}
private void executeStream_2() {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_CIRCUMSTANCED, "true");pxUniqueStreamHash = "64b2e1a9454c2af798b69efdccc05d9284543ff7";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("PulseGadget",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_2();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.681 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.681 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.681 GMT */
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_1;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_1.getRuleSetName(), oTraceInfo_1.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.689 GMT", "Work- PulseGadget", "Theme-Cosmos", "04-01-01", "20210506T204027.689 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION WORK- PULSEGADGET #20210506T204027.681 GMT", "Work- PulseGadget", "Theme-Cosmos", "04-01-01", "20210506T204027.681 GMT");
}
