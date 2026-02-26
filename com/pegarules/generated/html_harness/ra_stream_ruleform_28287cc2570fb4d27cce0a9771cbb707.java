package com.pegarules.generated.html_harness;
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
import com.pega.pegarules.priv.runtime.ICellRuntime;
import com.pega.pegarules.priv.runtime.IControlRuntime;
import com.pega.pegarules.priv.runtime.IHarnessRuntime;
import com.pega.pegarules.priv.runtime.ILayoutRuntime;
import com.pega.pegarules.priv.runtime.IPackageRuntime;
import com.pega.pegarules.priv.runtime.ISectionRuntime;
import com.pega.pegarules.priv.runtime.IStaticContentRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
import com.pega.pegarules.priv.runtime.jsp.JSPTagHandlerPool;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderBase;
import com.pega.pegarules.priv.util.JSPResponse;
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
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream RULE-OBJ-CLASS!RULEFORM.
 */
public class ra_stream_ruleform_28287cc2570fb4d27cce0a9771cbb707 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Harness.RuleForm.Rule_Obj_Class.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 11444763;
private static boolean pz_isValidAssembly= true;
/** The current stream builder. */
	IHarnessRuntime pzHarness;
	ISectionRuntime pzSection;
	ILayoutRuntime pzLayout;
	ICellRuntime pzCell;
	IControlRuntime pzControl;

	IPackageRuntime pzPackageRuntime;

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
	public ra_stream_ruleform_28287cc2570fb4d27cce0a9771cbb707(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "385a0171064048e21fda5b6b7176f9aea434a8a5";
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
/* Instance RULE-HTML-HARNESS RULE-OBJ-CLASS RULEFORM #20180713T135119.536 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-HARNESS RULE-OBJ-CLASS RULEFORM #20180713T135119.536 GMT
 * Set up context.
 */
final String prevRuleKey_19 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-HARNESS RULE-OBJ-CLASS RULEFORM #20180713T135119.536 GMT";final String prevClass_19 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Harness");
final Map prevPropDefs_19 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_19);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_19);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_17();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_19);
	mStreamResponse.setJspBaseClass(prevClass_19);
	pz_CurrentRuleKey = prevRuleKey_19;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
}
/* end RULE-HTML-HARNESS RULE-OBJ-CLASS RULEFORM #20180713T135119.536 GMT */
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
	"Rule-Obj-HTML:PZONLYONCECHANGES", 
	"Rule-Obj-HTML:PZCLIENTDYNAMICDATABOTTOM", 
	"Rule-Obj-HTML:PYDOMAINOVERRIDE", 
	"Rule-Obj-HTML:PZINCLUDESKELETONS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_GUIDE!JS", 
	"Rule-File-Text:WEBWB!RF_RULEOBJCLASSSCRIPT!JS", 
	"Rule-File-Text:WEBWB!ZUTILITIES_HARNESS!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_SCREEN_CAP_VIDEO_REC!JS", 
	"Rule-File-Text:WEBWB!PZAGILESMARTFEEDBACK!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_PANELHELPER_EXPRESS!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UWT_UI!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_JITJ!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_AWPANEL_EXPRESS!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_JITJ_INIT!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_GAPIDENTIFIER!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_DEVELOPERASSISTANTPANEL_EXPRESS!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UWT_DATA!JS", 
	"Rule-HTML-Harness:RULEFORM", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:PZDECLAREEXPRESSIONDEFERRED", 
	"Rule-HTML-Fragment:PYINCLUDEUWT", 
	"Rule-HTML-Fragment:PZINCLUDEWEBANALYTICSDI", 
	"Rule-HTML-Fragment:PYUNSUPPORTEDBROWSERLOGINMESSAGE", 
	"Rule-HTML-Fragment:FORMERRORMARKER", 
	"Rule-HTML-Fragment:PZPORTALICON", 
	"Rule-HTML-Fragment:PZRUNTIMETOOLSINCLUDE", 
	"Rule-HTML-Fragment:PZCPMTHEME", 
	"Rule-HTML-Fragment:PZOPTIMIZEDMIDDLESTATICCONTENT", 
	"Rule-HTML-Fragment:PYBODYSCRIPTSEXTENSION", 
	"Rule-HTML-Fragment:DOCUMENTINFO", 
	"Rule-HTML-Fragment:PZHARNESSBODYSCRIPTS", 
	"Rule-HTML-Fragment:PEGACOMPOSITECONFIG", 
	"Rule-HTML-Fragment:PZOPTIMIZEDBOTTOMSTATICCONTENT", 
	"Rule-File-Bundle:PZPEGA_GUIDE_STATICBUNDLE_SCRIPT!SCRIPT", 
	"Rule-File-Bundle:PZPEGA_GAPIDENTIFIER_SMARTFEEDBACK_SCRIPT!SCRIPT", 
	"Rule-File-Bundle:PZPEGA_AWPANEL_STATICBUNDLE_SCRIPT!SCRIPT", 
	"Rule-File-Bundle:PZPEGA_SCREEN_CAP_VIDEO_REC_SCRIPT!SCRIPT", 
	"Rule-File-Bundle:PZPEGA_GAPIDENTIFIER_STATICBUNDLE_SCRIPT!SCRIPT", 
	"Rule-File-Bundle:PZPEGA_PANELHELPER_STATICBUNDLE_SCRIPT!SCRIPT", 
	"Rule-File-Bundle:PZPEGA_DEVELOPER_ASSISTANT_STATICBUNDLE_SCRIPT!SCRIPT", 
	"Rule-Obj-Property:PYBENCHMARKSTARTTIME", 
	"Rule-Obj-Property:PYBENCHMARKSUBMITTIME", 
	"Rule-Obj-Property:PYPORTALVERSION", 
	"Rule-Obj-Property:PYFILENAME", 
	"Rule-Obj-Property:PZPRODUCTIONLEVEL", 
	"Rule-Obj-Property:PXPORTALHELPURI", 
	"Rule-Obj-Property:PXFORMNAME", 
	"Rule-Obj-Property:PXREQURI", 
	"Rule-Obj-Property:PXURLENCRYPTION", 
	"Rule-Obj-Property:PXASSIGNEDOPERATORID", 
	"Rule-Obj-Property:PXCURRENTAPPLICATIONNAME", 
	"Rule-Obj-Property:PZINSKEY", 
	"Rule-Obj-Property:PXTASKNAME", 
	"Rule-File-Binary:IMAGES!PZPEGAICON16!PNG", 
	"Rule-File-Binary:IMAGES!PZPEGAICON32!PNG"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZONLYONCECHANGES","Rule-Obj-HTML","@BASECLASS",false,"","Pega-UIEngine","08-01-01","RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT","!PZONLYONCECHANGES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1613232256), 
		new DependentRuleInfo("PZCLIENTDYNAMICDATABOTTOM","Rule-Obj-HTML","@BASECLASS",false,"","Pega-UIEngine","08-07-01","RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT","!PZCLIENTDYNAMICDATABOTTOM",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1332820899), 
		new DependentRuleInfo("PYDOMAINOVERRIDE","Rule-Obj-HTML","@BASECLASS",false,"","Pega-UIEngine","08-01-01","RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT","!PYDOMAINOVERRIDE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",326045783), 
		new DependentRuleInfo("PZINCLUDESKELETONS","Rule-Obj-HTML","@BASECLASS",false,"","Pega-UIEngine","08-01-01","RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT","!PZINCLUDESKELETONS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1021157923), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_GUIDE!JS","Rule-File-Text","",false,"","Pega-AppDefinition","","RULE-FILE-TEXT WEBWB PZPEGA_UI_GUIDE!JS #20200603T114456.352 GMT","WEBWB!PZPEGA_UI_GUIDE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!RF_RULEOBJCLASSSCRIPT!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB RF_RULEOBJCLASSSCRIPT!JS #20210831T185133.721 GMT","WEBWB!RF_RULEOBJCLASSSCRIPT!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!ZUTILITIES_HARNESS!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB ZUTILITIES_HARNESS!JS #20180713T135112.808 GMT","WEBWB!ZUTILITIES_HARNESS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_SCREEN_CAP_VIDEO_REC!JS","Rule-File-Text","",false,"","Pega-AppDefinition","","RULE-FILE-TEXT WEBWB PZPEGA_SCREEN_CAP_VIDEO_REC!JS #20190301T122635.926 GMT","WEBWB!PZPEGA_SCREEN_CAP_VIDEO_REC!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZAGILESMARTFEEDBACK!JS","Rule-File-Text","",false,"","Pega-AppDefinition","","RULE-FILE-TEXT WEBWB PZAGILESMARTFEEDBACK!JS #20220520T070046.760 GMT","WEBWB!PZAGILESMARTFEEDBACK!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_PANELHELPER_EXPRESS!JS","Rule-File-Text","",false,"","Pega-AppDefinition","","RULE-FILE-TEXT WEBWB PZPEGA_UI_PANELHELPER_EXPRESS!JS #20190919T182007.423 GMT","WEBWB!PZPEGA_UI_PANELHELPER_EXPRESS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UWT_UI!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_UWT_UI!JS #20180713T133242.269 GMT","WEBWB!PZPEGA_UWT_UI!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_JITJ!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_UI_JITJ!JS #20180927T103424.442 GMT","WEBWB!PZPEGA_UI_JITJ!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_AWPANEL_EXPRESS!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_UI_AWPANEL_EXPRESS!JS #20230630T125859.545 GMT","WEBWB!PZPEGA_UI_AWPANEL_EXPRESS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_JITJ_INIT!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_UI_JITJ_INIT!JS #20181114T174716.486 GMT","WEBWB!PZPEGA_UI_JITJ_INIT!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_GAPIDENTIFIER!JS","Rule-File-Text","",false,"","Pega-AppDefinition","","RULE-FILE-TEXT WEBWB PZPEGA_UI_GAPIDENTIFIER!JS #20211029T063101.775 GMT","WEBWB!PZPEGA_UI_GAPIDENTIFIER!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_DEVELOPERASSISTANTPANEL_EXPRESS!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_UI_DEVELOPERASSISTANTPANEL_EXPRESS!JS #20230618T001610.503 GMT","WEBWB!PZPEGA_UI_DEVELOPERASSISTANTPANEL_EXPRESS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UWT_DATA!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_UWT_DATA!JS #20180713T133242.254 GMT","WEBWB!PZPEGA_UWT_DATA!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("RULEFORM","Rule-HTML-Harness","RULE-OBJ-CLASS",false,"","Pega-Desktop","08-01-01","RULE-HTML-HARNESS RULE-OBJ-CLASS RULEFORM #20180713T135119.536 GMT","!RULEFORM",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",11444763), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-HARNESS",true,"Rule-HTML-Harness","Pega-UIEngine","08-23-01","RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZASSEMBLEPREPROCESS #20230618T001616.622 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-Obj-HTML","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZDECLAREEXPRESSIONDEFERRED","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT","PZDECLAREEXPRESSIONDEFERRED",true,false,"ABSOLUTE_CLASSLESS",89458520), 
		new DependentRuleInfo("PYINCLUDEUWT","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PYINCLUDEUWT #20180713T133243.549 GMT","PYINCLUDEUWT",true,false,"ABSOLUTE_CLASSLESS",-2001926959), 
		new DependentRuleInfo("PZINCLUDEWEBANALYTICSDI","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT","PZINCLUDEWEBANALYTICSDI",true,false,"ABSOLUTE_CLASSLESS",-561733845), 
		new DependentRuleInfo("PYUNSUPPORTEDBROWSERLOGINMESSAGE","Rule-HTML-Fragment","",false,"","Pega-EndUserUI","08-01-01","RULE-HTML-FRAGMENT PYUNSUPPORTEDBROWSERLOGINMESSAGE #20180713T134722.778 GMT","PYUNSUPPORTEDBROWSERLOGINMESSAGE",true,false,"ABSOLUTE_CLASSLESS",-546289379), 
		new DependentRuleInfo("FORMERRORMARKER","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT FORMERRORMARKER #20180713T133243.506 GMT","FORMERRORMARKER",true,false,"ABSOLUTE_CLASSLESS",-1195468444), 
		new DependentRuleInfo("PZPORTALICON","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PZPORTALICON #20180713T133243.831 GMT","PZPORTALICON",true,false,"ABSOLUTE_CLASSLESS",950330263), 
		new DependentRuleInfo("PZRUNTIMETOOLSINCLUDE","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-23-01","RULE-HTML-FRAGMENT PZRUNTIMETOOLSINCLUDE #20230618T001613.960 GMT","PZRUNTIMETOOLSINCLUDE",true,false,"ABSOLUTE_CLASSLESS",2070381031), 
		new DependentRuleInfo("PZCPMTHEME","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PZCPMTHEME #20180713T133243.621 GMT","PZCPMTHEME",true,false,"ABSOLUTE_CLASSLESS",-778600235), 
		new DependentRuleInfo("PZOPTIMIZEDMIDDLESTATICCONTENT","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PZOPTIMIZEDMIDDLESTATICCONTENT #20180713T133243.803 GMT","PZOPTIMIZEDMIDDLESTATICCONTENT",true,false,"ABSOLUTE_CLASSLESS",619721718), 
		new DependentRuleInfo("PYBODYSCRIPTSEXTENSION","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PYBODYSCRIPTSEXTENSION #20180713T133243.534 GMT","PYBODYSCRIPTSEXTENSION",true,false,"ABSOLUTE_CLASSLESS",-808808832), 
		new DependentRuleInfo("DOCUMENTINFO","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT","DOCUMENTINFO",true,false,"ABSOLUTE_CLASSLESS",-414417818), 
		new DependentRuleInfo("PZHARNESSBODYSCRIPTS","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PZHARNESSBODYSCRIPTS #20180713T133243.683 GMT","PZHARNESSBODYSCRIPTS",true,false,"ABSOLUTE_CLASSLESS",-1269525830), 
		new DependentRuleInfo("PEGACOMPOSITECONFIG","Rule-HTML-Fragment","",false,"","Pega-ProCom","08-06-01","RULE-HTML-FRAGMENT PEGACOMPOSITECONFIG #20200721T210858.505 GMT","PEGACOMPOSITECONFIG",true,false,"ABSOLUTE_CLASSLESS",-103155569), 
		new DependentRuleInfo("PZOPTIMIZEDBOTTOMSTATICCONTENT","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-06-01","RULE-HTML-FRAGMENT PZOPTIMIZEDBOTTOMSTATICCONTENT #20210112T172931.878 GMT","PZOPTIMIZEDBOTTOMSTATICCONTENT",true,false,"ABSOLUTE_CLASSLESS",-1614204201), 
		new DependentRuleInfo("PZPEGA_GUIDE_STATICBUNDLE_SCRIPT!SCRIPT","Rule-File-Bundle","",false,"","Pega-AppDefinition","","RULE-FILE-BUNDLE PZPEGA_GUIDE_STATICBUNDLE_SCRIPT SCRIPT #20180713T141659.166 GMT","PZPEGA_GUIDE_STATICBUNDLE_SCRIPT!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZPEGA_GAPIDENTIFIER_SMARTFEEDBACK_SCRIPT!SCRIPT","Rule-File-Bundle","",false,"","Pega-AppDefinition","","RULE-FILE-BUNDLE PZPEGA_GAPIDENTIFIER_SMARTFEEDBACK_SCRIPT SCRIPT #20180713T141659.150 GMT","PZPEGA_GAPIDENTIFIER_SMARTFEEDBACK_SCRIPT!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZPEGA_AWPANEL_STATICBUNDLE_SCRIPT!SCRIPT","Rule-File-Bundle","",false,"","Pega-AppDefinition","","RULE-FILE-BUNDLE PZPEGA_AWPANEL_STATICBUNDLE_SCRIPT SCRIPT #20180713T141659.147 GMT","PZPEGA_AWPANEL_STATICBUNDLE_SCRIPT!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZPEGA_SCREEN_CAP_VIDEO_REC_SCRIPT!SCRIPT","Rule-File-Bundle","",false,"","Pega-AppDefinition","","RULE-FILE-BUNDLE PZPEGA_SCREEN_CAP_VIDEO_REC_SCRIPT SCRIPT #20190301T122635.907 GMT","PZPEGA_SCREEN_CAP_VIDEO_REC_SCRIPT!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZPEGA_GAPIDENTIFIER_STATICBUNDLE_SCRIPT!SCRIPT","Rule-File-Bundle","",false,"","Pega-AppDefinition","","RULE-FILE-BUNDLE PZPEGA_GAPIDENTIFIER_STATICBUNDLE_SCRIPT SCRIPT #20180713T141659.156 GMT","PZPEGA_GAPIDENTIFIER_STATICBUNDLE_SCRIPT!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZPEGA_PANELHELPER_STATICBUNDLE_SCRIPT!SCRIPT","Rule-File-Bundle","",false,"","Pega-AppDefinition","","RULE-FILE-BUNDLE PZPEGA_PANELHELPER_STATICBUNDLE_SCRIPT SCRIPT #20180713T141659.168 GMT","PZPEGA_PANELHELPER_STATICBUNDLE_SCRIPT!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZPEGA_DEVELOPER_ASSISTANT_STATICBUNDLE_SCRIPT!SCRIPT","Rule-File-Bundle","",false,"","Pega-UIEngine","","RULE-FILE-BUNDLE PZPEGA_DEVELOPER_ASSISTANT_STATICBUNDLE_SCRIPT SCRIPT #20220408T065511.797 GMT","PZPEGA_DEVELOPER_ASSISTANT_STATICBUNDLE_SCRIPT!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PYBENCHMARKSTARTTIME","Rule-Obj-Property","@BASECLASS",true,"Code-Pega-Requestor","Pega-UIEngine","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYBENCHMARKSTARTTIME #20180713T133147.225 GMT","!PYBENCHMARKSTARTTIME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PYBENCHMARKSUBMITTIME","Rule-Obj-Property","@BASECLASS",true,"Code-Pega-Requestor","Pega-UIEngine","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYBENCHMARKSUBMITTIME #20180713T133147.232 GMT","!PYBENCHMARKSUBMITTIME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PYPORTALVERSION","Rule-Obj-Property","CODE-PEGA-THREAD",true,"Code-Pega-Thread","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-THREAD PYPORTALVERSION #20180713T131215.611 GMT","!PYPORTALVERSION",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PYFILENAME","Rule-Obj-Property","EMBED-BUNDLECONTENTROW",true,"Embed-BundleContentRow","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY EMBED-BUNDLECONTENTROW PYFILENAME #20180713T131229.640 GMT","!PYFILENAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PZPRODUCTIONLEVEL","Rule-Obj-Property","CODE-PEGA-PROCESS",true,"Code-Pega-Process","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-PROCESS PZPRODUCTIONLEVEL #20180713T131211.669 GMT","!PZPRODUCTIONLEVEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXPORTALHELPURI","Rule-Obj-Property","PEGA-HELPCONTENT",true,"Pega-HelpContent","Pega-ProcessEngine","08-01-01","RULE-OBJ-PROPERTY PEGA-HELPCONTENT PXPORTALHELPURI #20180713T132914.378 GMT","!PXPORTALHELPURI",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXFORMNAME","Rule-Obj-Property","ASSIGN-",true,"Assign-","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PXFORMNAME #20180713T131151.821 GMT","!PXFORMNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXREQURI","Rule-Obj-Property","CODE-PEGA-THREAD",true,"Code-Pega-Thread","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXREQURI #20180713T131215.530 GMT","!PXREQURI",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXURLENCRYPTION","Rule-Obj-Property","CODE-PEGA-REQUESTOR",true,"Code-Pega-Requestor","Pega-RULES","08-06-01","RULE-OBJ-PROPERTY CODE-PEGA-REQUESTOR PXURLENCRYPTION #20200721T210857.076 GMT","!PXURLENCRYPTION",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXASSIGNEDOPERATORID","Rule-Obj-Property","ASSIGN-",true,"Assign-","Pega-RulesEngine","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PXASSIGNEDOPERATORID #20180713T132512.882 GMT","!PXASSIGNEDOPERATORID",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXCURRENTAPPLICATIONNAME","Rule-Obj-Property","CODE-PEGA-THREAD",true,"Code-Pega-Thread","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXCURRENTAPPLICATIONNAME #20180713T131215.398 GMT","!PXCURRENTAPPLICATIONNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PZINSKEY","Rule-Obj-Property","@BASECLASS",true,"Assign-","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PZINSKEY #20180713T131156.617 GMT","!PZINSKEY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXTASKNAME","Rule-Obj-Property","ASSIGN-",true,"Assign-","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PXTASKNAME #20180713T131152.099 GMT","!PXTASKNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("IMAGES!PZPEGAICON16!PNG","Rule-File-Binary","",false,"","Pega-EndUserUI","","RULE-FILE-BINARY IMAGES PZPEGAICON16!PNG #20180713T134709.974 GMT","IMAGES!PZPEGAICON16!PNG",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("IMAGES!PZPEGAICON32!PNG","Rule-File-Binary","",false,"","Pega-EndUserUI","","RULE-FILE-BINARY IMAGES PZPEGAICON32!PNG #20180713T134709.977 GMT","IMAGES!PZPEGAICON32!PNG",true,false,"ABSOLUTE_CLASSLESS",1)
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
//	RULE-HTML-HARNESS RULE-OBJ-CLASS RULEFORM #20180713T135119.536 GMT:20180713T135119.536 GMT
//	RULE-HTML-FRAGMENT PYUNSUPPORTEDBROWSERLOGINMESSAGE #20180713T134722.778 GMT:20180713T134722.778 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT PZPORTALICON #20180713T133243.831 GMT:20180713T133243.831 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-BINARY IMAGES PZPEGAICON32!PNG #20180713T134709.977 GMT:20180713T134709.977 GMT
//	RULE-FILE-BINARY IMAGES PZPEGAICON16!PNG #20180713T134709.974 GMT:20180713T134709.974 GMT
//	RULE-FILE-TEXT WEBWB ZUTILITIES_HARNESS!JS #20180713T135112.808 GMT:20180713T135112.808 GMT
//	RULE-FILE-TEXT WEBWB RF_RULEOBJCLASSSCRIPT!JS #20210831T185133.721 GMT:20210831T185133.721 GMT
//	RULE-HTML-FRAGMENT PZCPMTHEME #20180713T133243.621 GMT:20180713T133243.621 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT PZRUNTIMETOOLSINCLUDE #20230618T001613.960 GMT:20230618T001613.960 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-BUNDLE PZPEGA_SCREEN_CAP_VIDEO_REC_SCRIPT SCRIPT #20190301T122635.907 GMT:20190301T122635.907 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_SCREEN_CAP_VIDEO_REC!JS #20190301T122635.926 GMT:20190509T113332.844 GMT
//	RULE-FILE-BUNDLE PZPEGA_GAPIDENTIFIER_STATICBUNDLE_SCRIPT SCRIPT #20180713T141659.156 GMT:20180713T141659.156 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_GAPIDENTIFIER!JS #20211029T063101.775 GMT:20211029T063101.775 GMT
//	RULE-FILE-BUNDLE PZPEGA_GAPIDENTIFIER_SMARTFEEDBACK_SCRIPT SCRIPT #20180713T141659.150 GMT:20180713T141659.150 GMT
//	RULE-FILE-TEXT WEBWB PZAGILESMARTFEEDBACK!JS #20220520T070046.760 GMT:20220520T070046.760 GMT
//	RULE-FILE-BUNDLE PZPEGA_AWPANEL_STATICBUNDLE_SCRIPT SCRIPT #20180713T141659.147 GMT:20180713T141659.147 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_AWPANEL_EXPRESS!JS #20230630T125859.545 GMT:20230630T125859.545 GMT
//	RULE-FILE-BUNDLE PZPEGA_PANELHELPER_STATICBUNDLE_SCRIPT SCRIPT #20180713T141659.168 GMT:20180713T141659.168 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_PANELHELPER_EXPRESS!JS #20190919T182007.423 GMT:20190919T182301.900 GMT
//	RULE-FILE-BUNDLE PZPEGA_GUIDE_STATICBUNDLE_SCRIPT SCRIPT #20180713T141659.166 GMT:20180713T141659.166 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_GUIDE!JS #20200603T114456.352 GMT:20200612T153743.545 GMT
//	RULE-FILE-BUNDLE PZPEGA_DEVELOPER_ASSISTANT_STATICBUNDLE_SCRIPT SCRIPT #20220408T065511.797 GMT:20220408T065511.797 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_DEVELOPERASSISTANTPANEL_EXPRESS!JS #20230618T001610.503 GMT:20230618T001610.503 GMT
//	RULE-HTML-FRAGMENT FORMERRORMARKER #20180713T133243.506 GMT:20180713T133243.506 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT PYINCLUDEUWT #20180713T133243.549 GMT:20180713T133243.549 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UWT_DATA!JS #20180713T133242.254 GMT:20180713T133242.254 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UWT_UI!JS #20180713T133242.269 GMT:20180713T133242.269 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYBENCHMARKSTARTTIME #20180713T133147.225 GMT:20180713T133147.225 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYBENCHMARKSUBMITTIME #20180713T133147.232 GMT:20180713T133147.232 GMT
//	RULE-HTML-FRAGMENT PZOPTIMIZEDMIDDLESTATICCONTENT #20180713T133243.803 GMT:20180713T133243.803 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY EMBED-BUNDLECONTENTROW PYFILENAME #20180713T131229.640 GMT:20180713T131229.640 GMT
//	RULE-HTML-FRAGMENT PEGACOMPOSITECONFIG #20200721T210858.505 GMT:20200721T210858.505 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXREQURI #20180713T131215.530 GMT:20180713T131215.530 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXCURRENTAPPLICATIONNAME #20180713T131215.398 GMT:20180713T131215.398 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-REQUESTOR PXURLENCRYPTION #20200721T210857.076 GMT:20200721T210857.076 GMT
//	RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT:20180713T133322.434 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-HTML-FRAGMENT PZOPTIMIZEDBOTTOMSTATICCONTENT #20210112T172931.878 GMT:20210112T172931.878 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_JITJ!JS #20180927T103424.442 GMT:20181112T123056.229 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_JITJ_INIT!JS #20181114T174716.486 GMT:20181130T183632.741 GMT
//	RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT:20180713T133243.503 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT:20210618T153855.616 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXFORMNAME #20180713T131151.821 GMT:20180713T131151.821 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PZINSKEY #20180713T131156.617 GMT:20180713T131156.617 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXTASKNAME #20180713T131152.099 GMT:20180713T131152.099 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXASSIGNEDOPERATORID #20180713T132512.882 GMT:20180713T132512.882 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-THREAD PYPORTALVERSION #20180713T131215.611 GMT:20180713T131215.611 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-PROCESS PZPRODUCTIONLEVEL #20180713T131211.669 GMT:20180713T131211.669 GMT
//	RULE-OBJ-PROPERTY PEGA-HELPCONTENT PXPORTALHELPURI #20180713T132914.378 GMT:20180713T132914.378 GMT
//	RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT:20180713T133243.626 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT:20180713T133322.374 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT:20180713T133243.745 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT:20180713T133322.219 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-HTML-FRAGMENT PZHARNESSBODYSCRIPTS #20180713T133243.683 GMT:20180713T133243.683 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT PYBODYSCRIPTSEXTENSION #20180713T133243.534 GMT:20180713T133243.534 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZASSEMBLEPREPROCESS #20230618T001616.622 GMT:20230618T001616.622 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATEHARNESS--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.407 GMT:20180713T133341.407 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "99edf0f47c264b131238c63824182b9f";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Class";
	}
public String getAspect() {
return "Stream";
}
private static final String[] showMeParams_6 = {
"", "", "", "", "", "", "04-02", "Extension", "Rule-HTML-Fragment", "Yes", "", "Pega-UIEngine", "08-01-01", "", "pyBodyScriptsExtension", "", "RULE-HTML-FRAGMENT PYBODYSCRIPTSEXTENSION #20180713T133243.534 GMT" };
private void performStream_15() throws Throwable {
tools.appendString("   ");
}
private static final Map oPropDefinitions_18 = null;
private static final Map oStreamProperties_18 = new HashMap();
static {
	oStreamProperties_18.put("pyRuleAvailable", "Yes");
	oStreamProperties_18.put("pyCircumstanceDateProp", "");
	oStreamProperties_18.put("pyCircumstanceVal", "");
	oStreamProperties_18.put("pyMethodStatus", "Extension");
	oStreamProperties_18.put("pyClassName", "");
	oStreamProperties_18.put("pyCircumstanceProp", "");
	oStreamProperties_18.put("pzInsKey", "RULE-HTML-FRAGMENT PYBODYSCRIPTSEXTENSION #20180713T133243.534 GMT");
	oStreamProperties_18.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_18.put("pyCircumstanceDate", "");
	oStreamProperties_18.put("pyRuleEnds", "");
	oStreamProperties_18.put("pyRuleStarts", "");
	oStreamProperties_18.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_18.put("pyXMLType", "");
	oStreamProperties_18.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_18.put("pyCorrType", "");
	oStreamProperties_18.put("pyStreamName", "pyBodyScriptsExtension");
	oStreamProperties_18.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PYBODYSCRIPTSEXTENSION #20180713T133243.534 GMT
 */
private void include_17() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PYBODYSCRIPTSEXTENSION #20180713T133243.534 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PYBODYSCRIPTSEXTENSION #20180713T133243.534 GMT
 * Set up context.
 */
final String prevRuleKey_18 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PYBODYSCRIPTSEXTENSION #20180713T133243.534 GMT";final String prevClass_18 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_18 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_18);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_18);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_18)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_15();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_18);
	mStreamResponse.setJspBaseClass(prevClass_18);
	pz_CurrentRuleKey = prevRuleKey_18;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_18,true);
}
/* end RULE-HTML-FRAGMENT PYBODYSCRIPTSEXTENSION #20180713T133243.534 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_6);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_16() throws Throwable {
tools.appendString("<script> ");
/* Include stream RULE-HTML-FRAGMENT PYBODYSCRIPTSEXTENSION #20180713T133243.534 GMT */
include_17();

tools.appendString(" </script>");
}
private static final Map oPropDefinitions_17 = null;
private static final Map oStreamProperties_17 = new HashMap();
static {
	oStreamProperties_17.put("pyRuleAvailable", "Final");
	oStreamProperties_17.put("pyCircumstanceDateProp", "");
	oStreamProperties_17.put("pyCircumstanceVal", "");
	oStreamProperties_17.put("pyMethodStatus", "Internal");
	oStreamProperties_17.put("pyClassName", "");
	oStreamProperties_17.put("pyCircumstanceProp", "");
	oStreamProperties_17.put("pzInsKey", "RULE-HTML-FRAGMENT PZHARNESSBODYSCRIPTS #20180713T133243.683 GMT");
	oStreamProperties_17.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_17.put("pyCircumstanceDate", "");
	oStreamProperties_17.put("pyRuleEnds", "");
	oStreamProperties_17.put("pyRuleStarts", "");
	oStreamProperties_17.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_17.put("pyXMLType", "");
	oStreamProperties_17.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_17.put("pyCorrType", "");
	oStreamProperties_17.put("pyStreamName", "pzHarnessBodyScripts");
	oStreamProperties_17.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZHARNESSBODYSCRIPTS #20180713T133243.683 GMT
 */
private void include_18() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZHARNESSBODYSCRIPTS #20180713T133243.683 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZHARNESSBODYSCRIPTS #20180713T133243.683 GMT
 * Set up context.
 */
final String prevRuleKey_17 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZHARNESSBODYSCRIPTS #20180713T133243.683 GMT";final String prevClass_17 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_17 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_17);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_17);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_17)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_16();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_17);
	mStreamResponse.setJspBaseClass(prevClass_17);
	pz_CurrentRuleKey = prevRuleKey_17;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_17,true);
}
/* end RULE-HTML-FRAGMENT PZHARNESSBODYSCRIPTS #20180713T133243.683 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private static final String[] showMeParams_5 = {
"", "", "", "", "@baseclass", "", "04-02", "", "Rule-Obj-HTML", "Yes", "", "Pega-UIEngine", "08-01-01", "", "pyDomainOverride", "", "RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT" };
private static final Map oPropDefinitions_16 = null;
private static final Map oStreamProperties_16 = new HashMap();
static {
	oStreamProperties_16.put("pyRuleAvailable", "Yes");
	oStreamProperties_16.put("pyCircumstanceDateProp", "");
	oStreamProperties_16.put("pyCircumstanceVal", "");
	oStreamProperties_16.put("pyMethodStatus", "");
	oStreamProperties_16.put("pyClassName", "@baseclass");
	oStreamProperties_16.put("pyCircumstanceProp", "");
	oStreamProperties_16.put("pzInsKey", "RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT");
	oStreamProperties_16.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_16.put("pyCircumstanceDate", "");
	oStreamProperties_16.put("pyRuleEnds", "");
	oStreamProperties_16.put("pyRuleStarts", "");
	oStreamProperties_16.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_16.put("pyXMLType", "");
	oStreamProperties_16.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_16.put("pyCorrType", "");
	oStreamProperties_16.put("pyStreamName", "pyDomainOverride");
	oStreamProperties_16.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT
 */
private void include_15() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT
 * Set up context.
 */
final String prevRuleKey_16 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT";final String prevClass_16 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-HTML");
final Map prevPropDefs_16 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_16);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_16);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_16)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_3();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_16);
	mStreamResponse.setJspBaseClass(prevClass_16);
	pz_CurrentRuleKey = prevRuleKey_16;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_16,true);
}
/* end RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_5);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private static final Map oPropDefinitions_15 = null;
private static final Map oStreamProperties_15 = new HashMap();
static {
	oStreamProperties_15.put("pyRuleAvailable", "Final");
	oStreamProperties_15.put("pyCircumstanceDateProp", "");
	oStreamProperties_15.put("pyCircumstanceVal", "");
	oStreamProperties_15.put("pyMethodStatus", "Internal");
	oStreamProperties_15.put("pyClassName", "");
	oStreamProperties_15.put("pyCircumstanceProp", "");
	oStreamProperties_15.put("pzInsKey", "RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT");
	oStreamProperties_15.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_15.put("pyCircumstanceDate", "");
	oStreamProperties_15.put("pyRuleEnds", "");
	oStreamProperties_15.put("pyRuleStarts", "");
	oStreamProperties_15.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_15.put("pyXMLType", "");
	oStreamProperties_15.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_15.put("pyCorrType", "");
	oStreamProperties_15.put("pyStreamName", "pzIncludeWebAnalyticsDI");
	oStreamProperties_15.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT
 */
private void include_14() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT
 * Set up context.
 */
final String prevRuleKey_15 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT";final String prevClass_15 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_15 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_15);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_15);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_15)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_3();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_15);
	mStreamResponse.setJspBaseClass(prevClass_15);
	pz_CurrentRuleKey = prevRuleKey_15;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_15,true);
}
/* end RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_13() throws Throwable {

ArrayList skeletonList = (ArrayList)tools.getParameterPage().getObject("skeletonList");

if(skeletonList != null && skeletonList.size() > 0){
    char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
    pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(com.pega.pegarules.priv.runtime.IUIComponentRuntime.TEMPLATE_STATUS_NO);    
    for(int i =0; i < skeletonList.size(); i++){       
        StringMap  keys = new HashStringMap();
		    keys.putString("pxObjClass", "Rule-HTML-Section");
      
        String skeletonName = "pyLaunchHarnessSkeleton";
        String className = "@baseclass";
        String targetMicroDC = "false";
      
        String skeletonAndClassName = (String)skeletonList.get(i);      
        if(skeletonAndClassName != null){
          String[] skeletonAndClassNameArr = skeletonAndClassName.split("~\\$~");
          if(skeletonAndClassNameArr != null && skeletonAndClassNameArr.length > 0){
            skeletonName = skeletonAndClassNameArr[0];
            className = skeletonAndClassNameArr[1];
            if(skeletonAndClassNameArr.length > 2)
            targetMicroDC = skeletonAndClassNameArr[2];
          }     
        }           
			  keys.putString("pyClassName", className); 
        try{
        
      /*ClipboardPage pg_temp = tools.createPage("Rule-HTML-Section", "");
			pg_temp.putString(".pyStreamName", skeletonName);
			pg_temp.putString(".pyClassName", className);

			boolean bSectionExists = true;
			try
			{
				pg_temp = tools.getDatabase().open(pg_temp, true);
				if (pg_temp == null ) bSectionExists = false;
			}
			catch (Exception e)
			{
				bSectionExists = false;
			}*/
        if(className != null && "@baseclass".equals(className))
          className = "baseclass";      
      
      /*if(!bSectionExists){
        oLog.error("Skeleton: Could not open the  section "+skeletonName+" in class "+className);
        skeletonName = "pyLaunchHarnessSkeleton";
        keys.putString("pyStreamName", skeletonName);
        keys.putString("pyClassName", "@baseclass");
      } else{*/
      /*if(bSectionExists){*/
        keys.putString("pyStreamName", skeletonName);
			  String strSkeleton = tools.getStream(keys, null);
          if("true".equals(targetMicroDC) || (pzAuto.isMobile() && !pzAuto.isTablet())){

tools.appendString("\n      <div id=\"");
out.print(skeletonName);
tools.appendString("-");
out.print(className);
tools.appendString("\" style=\"display:none;\" class=\"skeleton\" data-skeleton='true'>            \n        ");
out.print( strSkeleton );
tools.appendString("\n        <script>\n          if(typeof removeDuplicateSkeleton != \"undefined\"){\n            removeDuplicateSkeleton('");
out.print(skeletonName);
tools.appendString("-");
out.print(className);
tools.appendString("');\n          }\n        </script>\n      </div>\n");
  }   } catch (Exception e){
        oLog.error("Skeleton: from pzIncludeSkeletons: Could not open the section "+skeletonName+" in class "+className);
      } 
        
    }
  pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
} else{
  ClipboardPage pyDocuments = tools.findPage("pyDocuments", true);
  if(pyDocuments != null){
    ClipboardProperty pySkeletons = pyDocuments.getProperty("pySkeletons");
    java.util.Iterator skeletonItr = pySkeletons.iterator();
    if(skeletonItr != null && pySkeletons.size() > 0){                    
      boolean ifPresent = false;
      char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
      pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(com.pega.pegarules.priv.runtime.IUIComponentRuntime.TEMPLATE_STATUS_NO);
      while(skeletonItr.hasNext()){
        ClipboardProperty thisSkeletonWrapper = (ClipboardProperty)skeletonItr.next();
        ClipboardPage thisSkeleton = thisSkeletonWrapper.getPageValue();
        String thisSkeletonStr = thisSkeleton.getString("pySkeletonDetails");          
        if(thisSkeletonStr !=null){
          StringMap  keys = new HashStringMap();
		      keys.putString("pxObjClass", "Rule-HTML-Section");
      
          String skeletonName = "pyLaunchHarnessSkeleton";
          String className = "@baseclass";
          String targetMicroDC = "false";
      
          String skeletonAndClassName = thisSkeletonStr;      
          if(skeletonAndClassName != null){
            String[] skeletonAndClassNameArr = skeletonAndClassName.split("~\\$~");
            if(skeletonAndClassNameArr != null && skeletonAndClassNameArr.length > 0){
              skeletonName = skeletonAndClassNameArr[0];
              className = skeletonAndClassNameArr[1]; 
              if(skeletonAndClassNameArr.length > 2)
              targetMicroDC = skeletonAndClassNameArr[2];
            }     
          }           
			    keys.putString("pyClassName", className); 
          try{
            if(className != null && "@baseclass".equals(className))
              className = "baseclass";
             keys.putString("pyStreamName", skeletonName);
              String strSkeleton = tools.getStream(keys, null);
             if("true".equals(targetMicroDC) || (pzAuto.isMobile() && !pzAuto.isTablet())){

tools.appendString("\n            <div id=\"");
out.print(skeletonName);
tools.appendString("-");
out.print(className);
tools.appendString("\" style=\"display:none;\" class=\"skeleton\" data-skeleton='true'>                             \n              ");
out.print( strSkeleton );
tools.appendString("\n              <script>\n                if(typeof removeDuplicateSkeleton != \"undefined\"){\n                  removeDuplicateSkeleton('");
out.print(skeletonName);
tools.appendString("-");
out.print(className);
tools.appendString("');\n                }\n              </script>\n            </div>\n");
      }  } catch (Exception e){
            oLog.error("Skeleton: from pzIncludeSkeletons: Could not open the section "+skeletonName+" in class "+className);
          } 
            
        }// inner if
      }//while
      pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
    }//if ske
  }//if doc
}// else

}
private static final Map oPropDefinitions_14 = null;
private static final Map oStreamProperties_14 = new HashMap();
static {
	oStreamProperties_14.put("pyRuleAvailable", "Final");
	oStreamProperties_14.put("pyCircumstanceDateProp", "");
	oStreamProperties_14.put("pyCircumstanceVal", "");
	oStreamProperties_14.put("pyMethodStatus", "Internal");
	oStreamProperties_14.put("pyClassName", "@baseclass");
	oStreamProperties_14.put("pyCircumstanceProp", "");
	oStreamProperties_14.put("pzInsKey", "RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT");
	oStreamProperties_14.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_14.put("pyCircumstanceDate", "");
	oStreamProperties_14.put("pyRuleEnds", "");
	oStreamProperties_14.put("pyRuleStarts", "");
	oStreamProperties_14.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_14.put("pyXMLType", "");
	oStreamProperties_14.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_14.put("pyCorrType", "");
	oStreamProperties_14.put("pyStreamName", "pzIncludeSkeletons");
	oStreamProperties_14.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT
 */
private void include_13() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT
 * Set up context.
 */
final String prevRuleKey_14 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT";final String prevClass_14 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-HTML");
final Map prevPropDefs_14 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_14);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_14);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_14)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_13();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_14);
	mStreamResponse.setJspBaseClass(prevClass_14);
	pz_CurrentRuleKey = prevRuleKey_14;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_14,true);
}
/* end RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_12() throws Throwable {

{
  tools.appendString(tools.getSaveValue("pzDeclareExpressionJs"));
}

}
private static final Map oPropDefinitions_13 = null;
private static final Map oStreamProperties_13 = new HashMap();
static {
	oStreamProperties_13.put("pyRuleAvailable", "Final");
	oStreamProperties_13.put("pyCircumstanceDateProp", "");
	oStreamProperties_13.put("pyCircumstanceVal", "");
	oStreamProperties_13.put("pyMethodStatus", "Internal");
	oStreamProperties_13.put("pyClassName", "");
	oStreamProperties_13.put("pyCircumstanceProp", "");
	oStreamProperties_13.put("pzInsKey", "RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT");
	oStreamProperties_13.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_13.put("pyCircumstanceDate", "");
	oStreamProperties_13.put("pyRuleEnds", "");
	oStreamProperties_13.put("pyRuleStarts", "");
	oStreamProperties_13.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_13.put("pyXMLType", "");
	oStreamProperties_13.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_13.put("pyCorrType", "");
	oStreamProperties_13.put("pyStreamName", "pzDeclareExpressionDeferred");
	oStreamProperties_13.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT
 */
private void include_12() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT
 * Set up context.
 */
final String prevRuleKey_13 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT";final String prevClass_13 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_13 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_13);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_13);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_13)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_12();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_13);
	mStreamResponse.setJspBaseClass(prevClass_13);
	pz_CurrentRuleKey = prevRuleKey_13;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_13,true);
}
/* end RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_7() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_5("bFlowAction", "true")) {
tools.appendString(" function SmartPromptFocusHandler(e) { var evt = e || window.event || arguments.callee.caller.arguments[0]; if(typeof(evt) != \"undefined\" ) { var evtTarget = evt.srcElement || evt.target; if (ISnsSmartPromptInitActive(evtTarget, false)) return; } } function zUtil_SmartPromptFocusHandler(e) { var evt = e || window.event || arguments.callee.caller.arguments[0]; SmartPromptFocusHandler(evt); } ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" function SmartPromptFocusHandler() { if (ISnsSmartPromptInitActive(window.event.srcElement, false)) return; } function zUtil_SmartPromptFocusHandler() { SmartPromptFocusHandler(); } ");
}
}
private boolean when_15() throws Throwable {
boolean whenResult_25 = pega.invokeWhen("isAccessible", "", "");
return whenResult_25;
}
private boolean when_14() throws Throwable {
boolean whenResult_23 = pega.invokeWhen("WarnBeforeChangingWindow", "", "");
return whenResult_23;
}
private boolean when_13() throws Throwable {
boolean whenResult_21 = pega.invokeWhen("isAccessible", "", "");
return whenResult_21;
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_6() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_7("HarnessType", "")) {
tools.appendString(" \"processHarnessType\": \"Display\", ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" \"processHarnessType\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__3(pageContext, "param.HarnessType")) {
	return;
}
tools.appendString("\", ");
}
}
/**
 * Implements a pega:option tag.
 */private boolean _jspx_meth_pega_option__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:option */
com.pega.pegarules.jsptags.OptionTag _jspx_th_pega_option_ = (com.pega.pegarules.jsptags.OptionTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.OptionTag.class);
_jspx_th_pega_option_.setPageContext(pageContext);
_jspx_th_pega_option_.setParent(mParentTag);
_jspx_th_pega_option_.setName(aName);
int _jspx_eval_pega_option_ = _jspx_th_pega_option_.doStartTag();
if (_jspx_th_pega_option_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_option_);
return false;
}
/**
 * Implements a pega:url tag.
 */private boolean _jspx_meth_pega_url__1(PageContext aPageContext) throws Throwable {
/* pega:url */
com.pega.pegarules.jsptags.UrlTag _jspx_th_pega_url_ = (com.pega.pegarules.jsptags.UrlTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.UrlTag.class);
_jspx_th_pega_url_.setPageContext(pageContext);
_jspx_th_pega_url_.setParent(mParentTag);
int _jspx_eval_pega_url_ = _jspx_th_pega_url_.doStartTag();
if (_jspx_eval_pega_url_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_url_;
if (_jspx_meth_pega_option__1(pageContext, "long")) {
	return true;
}
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_url_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_url_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_url_);
return false;
}
private boolean when_12() throws Throwable {
boolean whenResult_20 = pega.invokeWhen("pyFocusInsideIframe", "", "");
return whenResult_20;
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_5() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_12()) {
tools.appendString(" \"focusInsideIframe\": true, ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" \"focusInsideIframe\": false, ");
}
}
private boolean when_11() throws Throwable {
boolean whenResult_19 = pega.invokeWhen("pyEnableAgileWorkbench", "", "");
return whenResult_19;
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_4() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_11()) {
tools.appendString(" \"isAgileWorkbenchEnabled\": true, ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" \"isAgileWorkbenchEnabled\": false, ");
}
}
private boolean when_10() throws Throwable {
boolean whenResult_18 = pega.invokeWhen("pyEnableUIInspectorButton", "", "");
return whenResult_18;
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_3() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_10()) {
tools.appendString(" \"isUIInspectorButtonEnabled\": true, ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" \"isUIInspectorButtonEnabled\": false, ");
}
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__1(PageContext aPageContext, java.lang.String aN) throws Throwable {
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
private boolean when_9() throws Throwable {
boolean whenResult_16 = pega.invokeWhen("InCompositeDesktop", "", "");
return whenResult_16;
}
private boolean when_8(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (((!((areValsEqual(tools.getParamValue(aParam1), aParam2)))))));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_8("IndexInList", "")) {
tools.appendString(" \"indexInList\": ");

/*
 * reference tag
 * Cannot inline because: mode is "richtext"
 */
if (_jspx_meth_pega_reference__1(pageContext, "param.IndexInList", "richtext")) {
	return;
}
tools.appendString(", ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" \"indexInList\": 0, ");
}
}
private boolean when_7(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
private boolean when_6() throws Throwable {
boolean whenResult_14 = pega.invokeWhen("pyShowExitConfirmationOnAndroidApp", "", "");
return whenResult_14;
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_6()) {
tools.appendString(" \"showExitConfirmationOnAndroidApp\":true, ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" \"showExitConfirmationOnAndroidApp\":false, ");
}
}
private boolean when_5(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue(aParam1), aParam2)));
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__3(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
private void performStream_11() throws Throwable {
tools.appendString(" function getBrowserFingerprint() { var options = { excludes: { 'enumerateDevices': true, 'sessionStorage': true, 'colorDepth': true, 'indexedDb': true, 'canvas': true, 'hasLiedLanguages': true, 'touchSupport': true, 'plugins': true, 'hasLiedResolution': true, 'adBlock': true, 'hasLiedBrowser': true, 'audio': true, 'hasLiedOs': true, 'fonts': true, 'addBehavior': true, 'openDatabase': true, 'pixelRatio': true, 'doNotTrack': true, 'fontsFlash': true, 'screenResolution': true, 'availableScreenResolution': true, 'webglVendorAndRenderer': true, 'webgl': true } }; var components = {}; Fingerprint2.get(options, function(components) { var values = components.map(function(component) { return component.value; }); fingerprintToken = Fingerprint2.x64hash128(values.join(''), 31); pega.d.browserFingerprint = '{v2}' + fingerprintToken; }); }; if (!pega.u.d.ServerProxy.isDestinationLocal()) { getBrowserFingerprint(); } function setBrowserFingerprint() { var element = document.getElementById(\"pzBFP\"); if (element != null) { document.getElementById(\"pzBFP\").value = pega.d.browserFingerprint; }; }; pega.u.d.attachOnload(setBrowserFingerprint); pega.u.d.attachOnFrameLoads(setBrowserFingerprint); var isCreateStage = \"");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "param.bIsInCreateStage", "normal")) {
	return;
}
tools.appendString("\"; isCreateStage = isCreateStage == \"true\"?true:false; var bottomVars = { \"dynamic_context\" : { \"strHarnessPurpose\": \"");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "param.Purpose", "normal")) {
	return;
}
tools.appendString("\", \"bIsInCreateStage\": isCreateStage, ");

  	tools.putSaveValue("strPageName", tools.getStepPage()!=null?tools.getStepPage().getName():"");

tools.appendString(" \"bActionIframe\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(bFlowAction)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$SAVE(bFlowAction)")) {
	return;
}
tools.appendString("\", ");
	if (when_5("bFlowAction", "true")) {
tools.appendString("  \"bClientValidation\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(bClientValidation)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$SAVE(bClientValidation)")) {
	return;
}
tools.appendString("\", \"bExpressionCalculation\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(bExpressionCalculation)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$SAVE(bExpressionCalculation)")) {
	return;
}
tools.appendString("\", ");
	}
tools.appendString(" ");

String isDesignViewIframe = tools.getParamValue("DesignViewIframe");
boolean isPackaging = pega_uiengine_offlinesupport.pzIsForOfflineTemplate();
boolean isHybridClient = false;
boolean isPegaElectron = false;
boolean isMobileClient = false;

/*changes related to MobileClient URL*/
String pxReqURI = tools.findPage("pxThread").getString("pxReqURI");

tools.appendString(" ");
	if (pega.isPreviewMode() || (areValsEqual(tools.getProperty("pxRequestor.pxIsMobileClient").getStringValue(), "true"))) {
tools.appendString(" ");
  
   /* BUG-527209 : Getting pxReqURI properly using API */
  /* BUG-529778 : PRPC can be deployed at the root context. /prweb is linked with the application context. */
  try {
    pxReqURI = pega.getExternalURLBuilder().useCurrentContext().withServlet("PRAuth").currentApplication().currentAccessGroup().currentThread().build();
    java.net.URL aURL = new java.net.URL(pxReqURI);
    pxReqURI = aURL.getFile();
  } catch (Exception ex) {
    oLog.error("pzClientDynamicData : pega.ctx.pxReqURI will be empty. Applicaiton will not be rendered");
    oLog.error("Exception "+ ex);
  }
      isMobileClient = true;
  
tools.appendString(" ");
	}
tools.appendString(" ");
boolean whenResult_12 = pega.invokeWhen("pyIsHybridClient", "", "");
	if (whenResult_12) {
tools.appendString(" ");
 isHybridClient = true; 
tools.appendString(" ");
	}
tools.appendString(" ");
boolean whenResult_13 = pega.invokeWhen("pyIsPegaElectronContainer", "", "");
	if (whenResult_13) {
tools.appendString(" ");
 isPegaElectron = true; 
tools.appendString(" ");
	}
tools.appendString(" ");
choose_1();
tools.appendString("  ");
 String mUserAgent = pega_rulesengine_utilities.pzGetUserAgentString(tools);
tools.appendString(" ");
 int maxAttachmentSizeBytes = 0;
tools.appendString(" ");
	if (pega.isPreviewMode() || ( mUserAgent.matches(".*(Android|iPhone|iPad|iPod|Electron).*") )) {
tools.appendString("  ");

  int maxAttachmentSizeMB = 100;
String attachmentMaxSize = tools.getSystemSettings().getDynamic("Pega-EndUserUI", "uiengine/mobile/maxattachmentsize");
if (!(attachmentMaxSize == null || "".equals(attachmentMaxSize))) {
  try {
    maxAttachmentSizeMB = Integer.parseInt(attachmentMaxSize);
  } catch (Exception e) {
    maxAttachmentSizeMB = 100;
  }
}
maxAttachmentSizeBytes = maxAttachmentSizeMB * 1048576; //convert to bytes

tools.appendString(" ");
	}
tools.appendString("  \"maxAttachmentSizeBytes\": \"#JSON_PARSE_TO_INT#(\\\"");
out.print( maxAttachmentSizeBytes);
tools.appendString("\\\")\",  \"pySectionShortDesc\":\"");
out.print( StringUtils.escapeIntoJavaString(StringUtils.crossScriptingFilter(tools.getParamValue("pySectionShortDesc"))));
tools.appendString("\", ");
	if (when_7("Purpose", "")) {
tools.appendString(" \"strHarnessPurpose\": \"");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "param.StreamName", "normal")) {
	return;
}
tools.appendString("\", ");
	}
tools.appendString(" \"strHarnessClass\": \"");
out.print(tools.getPrimaryPage()!=null ? tools.getPrimaryPage().getString("pxObjClass") : "");
tools.appendString("\", ");
 
  	String tempstrKey = "";
    try {
      if(tools.getStepPage()!=null)
        tempstrKey = com.pega.pegarules.pub.util.StringUtils.crossScriptingFilter(tools.getDatabase().getHandle(tools.getStepPage()));
    }catch (DatabaseException de) {	}
    tools.putSaveValue("strKey", tempstrKey);

tools.appendString(" ");
	if (pega.isPreviewMode() || tools.getThread().getThreadPage().getString("isWebMashup").equals("true")) {
tools.appendString("  ");
	}
tools.appendString(" \"strPropertyName\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__3(pageContext, "param.PageListProperty")) {
	return;
}
tools.appendString("\", ");
choose_2();
tools.appendString("  ");
	boolean foundChoice_4 = false;
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || tools.findPage("newAssignPage") != null)) {
tools.appendString(" \"strDisplayHarnessParms\": \"&FinishingActivity=DisplayHarness&Purpose=");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "newAssignPage.pxFormName", "normal")) {
	return;
}
tools.appendString("&AssignInsKey=");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "newAssignPage.pzInsKey", "normal")) {
	return;
}
tools.appendString("&AssignTaskName=");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "newAssignPage.pxTaskName", "normal")) {
	return;
}
tools.appendString("&AssignOperator=");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "newAssignPage.pxAssignedOperatorID", "normal")) {
	return;
}
tools.appendString("\", ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4) {
tools.appendString(" \"strDisplayHarnessParms\": \"\", ");
}
tools.appendString("  ");
	boolean foundChoice_5 = false;
tools.appendString(" ");
if (!foundChoice_5 && (pega.isPreviewMode() || ((invokeWhenRule(tools, "EncryptURL"))))) {
tools.appendString(" ");

  	tools.putSaveValue("bEncryptURLs", "true");

tools.appendString(" ");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_5) {
tools.appendString(" ");

  	tools.putSaveValue("bEncryptURLs", "false");

tools.appendString(" ");
}
tools.appendString("  ");
	if (pega.isPreviewMode() || !tools.getParamValue("bExcludeLegacyJS").equalsIgnoreCase("true")) {
tools.appendString(" ");

tempstrKey = "";
String tempinsname = "";
String tempObjClass = "";
String tempPageName = "";

ClipboardPage theStepPage = tools.getStepPage();

if (theStepPage != null) {
  try {
    tempstrKey = tools.getDatabase().getHandle(theStepPage);
  } catch (DatabaseException dbEx) {
    oLog.debug("Failed to calculate handle in PRWBScripts", dbEx);
    tempstrKey = "";
  }

  tempstrKey = pega_rules_utilities.getJSEncodedValue(tempstrKey);
  tempinsname = theStepPage.getString(".pxInsName");
  tempinsname = pega_rules_utilities.getJSEncodedValue(tempinsname);
  tempObjClass = theStepPage.getString(".pxObjClass");
  tempPageName = theStepPage.getName();
  
  tools.putSaveValue("strKey", tempstrKey);
  tools.putSaveValue("strPageName", tempPageName);
}

tools.appendString(" \"insName\": \"");
 tools.appendString(tempinsname); 
tools.appendString("\", \"strClassName\": \"");
 tools.appendString(tempObjClass); 
tools.appendString("\", \"pxReqURI\": \"");
 tools.appendString(pxReqURI); 
tools.appendString("\", \"portalVersion\": \"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "pxThread.pyPortalVersion", "normal")) {
	return;
}
tools.appendString("\", ");
	boolean foundChoice_6 = false;
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue("bFlowAction"), "true")))) {
tools.appendString(" \"gsServerReqURI\": \"");
 tools.appendString(pxReqURI); 
tools.appendString("\", \"safeUrlRequestURI\": \"");
 tools.appendString(pxReqURI); 
tools.appendString("\", ");

  	tools.putSaveValue("bEncryptURLs", "false");

tools.appendString(" ");
boolean whenResult_15 = pega.invokeWhen("EncryptURL", "", "");
	if (whenResult_15) {
tools.appendString(" ");

  	tools.putSaveValue("bEncryptURLs", "true");

tools.appendString(" ");
	}
tools.appendString(" ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6) {
tools.appendString(" ");
}
tools.appendString("  ");
	}
tools.appendString(" \"bEncryptURLs\": ");
out.print( tools.getSaveValue("bEncryptURLs") );
tools.appendString(", \"strKey\": \"");
out.print( tools.getSaveValue("strKey") );
tools.appendString("\", \"strPageName\": \"");
out.print( tools.getSaveValue("strPageName") );
tools.appendString("\" }, \"pega.d\" : { ");
boolean whenResult_17 = pega.invokeWhen("InCompositeDesktop", "", "");
	if (whenResult_17) {
tools.appendString(" \"productionLevel\": \"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "pxProcess.pzProductionLevel", "javascript")) {
	return;
}
tools.appendString("\", \"activeSpaceName\": \"");

/*
 * reference tag
 * Cannot inline because: mode is "javascript"
 */
if (_jspx_meth_pega_reference__1(pageContext, "param.spaceName", "javascript")) {
	return;
}
tools.appendString("\", ");
	}
tools.appendString(" \"obfuscateKey\": \"");
out.print( tools.getObfuscationKey() );
tools.appendString("\", \"globalobfuscateKey\": \"");
out.print( tools.getGlobalObfuscationKey() );
tools.appendString("\", \"pxReqURI\": \"");
 tools.appendString(pxReqURI); 
tools.appendString("\", \"pxHelpURI\": \"");

/*
 * reference tag
 * Cannot inline because: mode is "javascript"
 */
if (_jspx_meth_pega_reference__1(pageContext, "pyPortal.pyHelpContentInformation.pxPortalHelpURI", "javascript")) {
	return;
}
tools.appendString("\" }, \"pega.desktop\" : { \"pyRequestorToken\": \"");
out.print(tools.getRequestor().getRequestorPage().getString("pyRequestorToken") );
tools.appendString("\", \"pxClientSession\": \"");
out.print(tools.getRequestor().getRequestorPage().getString("pxClientSession") );
tools.appendString("\" }, \"pega.u.d\" : { \"bExcludeLegacyJS\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_p_r__1(pageContext, "param.bExcludeLegacyJS")) {
	return;
}
tools.appendString("\", \"portalName\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_p_r__1(pageContext, "param.portalName")) {
	return;
}
tools.appendString("\", \"portalID\": \"");
out.print(tools.findPage("pxThread").getString("pyPortalID"));
tools.appendString("\",   ");
  if( ("true".equals(tools.getRootParamValue("isDCSPA")) || "true".equals(tools.getRootParamValue("isMDC")) || "true".equals(tools.getParamValue("pyIsSPA"))) ){ 
tools.appendString(" ");
	if (when_5("skinRuleName", "")) {
tools.appendString(" \"skinRuleName\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(skinRuleName)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$SAVE(skinRuleName)")) {
	return;
}
tools.appendString("\", ");
	}
tools.appendString(" ");

} else {

tools.appendString(" \"skinRuleName\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(skinRuleName)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$SAVE(skinRuleName)")) {
	return;
}
tools.appendString("\", ");

       }

tools.appendString(" \"documentKey\": \"");
out.print( tools.getPrimaryPage()!= null ? StringUtils.escapeIntoJavaString(StringUtils.crossScriptingFilter(tools.getPrimaryPage().getString("pzDocumentKey"))) : "" );
tools.appendString("\", \"documentTooltip\": \"");
out.print( tools.getPrimaryPage()!= null ? StringUtils.escapeIntoJavaString(StringUtils.crossScriptingFilter(tools.getPrimaryPage().getString("pyDocumentTooltip"))) : "" );
tools.appendString("\", ");
choose_3();
tools.appendString("  ");
choose_4();
tools.appendString("  ");
choose_5();
tools.appendString("  ");

if (((!isPackaging) && (isHybridClient || isPegaElectron )) || isMobileClient ) {
  if(isMobileClient && isPackaging){

tools.appendString(" \"url\": \"");
if (_jspx_meth_pega_url__1(pageContext)) {
	return;
}
tools.appendString("\".replace(\"PRRestService\", \"PRAuth\"), ");
    
}else {

tools.appendString(" \"url\": \"");
if (_jspx_meth_pega_url__1(pageContext)) {
	return;
}
tools.appendString("\", ");
    
  }
}

tools.appendString(" \"keepFixedVisible\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_p_r__1(pageContext, "param.KeepFixedVisible")) {
	return;
}
tools.appendString("\", \"ignoreDirty\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__3(pageContext, "param.IgnoreDirty")) {
	return;
}
tools.appendString("\", \"harnessType\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(harnessType)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$SAVE(harnessType)")) {
	return;
}
tools.appendString("\", \"topHarness\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(topHarness)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$SAVE(topHarness)")) {
	return;
}
tools.appendString("\", \"formPost\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_p_r__1(pageContext, "param.formPost")) {
	return;
}
tools.appendString("\", \"assign_02\": \"if(pega.ui.HarnessContextMap.get(\\\"keepFixedVisible\\\") == \\\"\\\") pega.ui.HarnessContextMap.set(\\\"keepFixedVisible\\\",true);\",  \"AccordionAnimSpeed\": 1, ");
choose_6();
tools.appendString("  ");
boolean whenResult_22 = pega.invokeWhen("isAccessible", "", "");
	if (whenResult_22) {
tools.appendString(" \"isAccessible\": true, ");
boolean whenResult_24 = pega.invokeWhen("WarnBeforeChangingWindow", "", "");
	if (whenResult_24) {
tools.appendString(" \"bWarnBeforeChangingWindow\": true, ");
	}
tools.appendString(" ");
	}
tools.appendString(" ");

  String localizedString="";
if(tools.getPrimaryPage()!=null)
  localizedString = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString( ".pyCaption", tools.getDictionary().fromDefinition(tools.getPrimaryPage().getString("pxObjClass"), "pyLabel"), StreamBuilder.FMT_JAVASCRIPT));

tools.appendString(" \"workLabel\": \"");
out.print( localizedString);
tools.appendString("\", \"formErrorType\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(FormError)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(FormError)")) {
	return;
}
tools.appendString("\", \"fieldErrorType\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(FieldError)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(FieldError)")) {
	return;
}
tools.appendString("\", \"alwaysShowFormLevelErrors\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(AlwaysShowFormLevelErrors)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(AlwaysShowFormLevelErrors)")) {
	return;
}
tools.appendString("\", \"pyCustomError\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(pyCustomError)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(pyCustomError)")) {
	return;
}
tools.appendString("\" }, \"pega.feedback.Globals\" : { ");
	if (pega.isPreviewMode() || tools.getThread().getAuthorization().havePrivilege(tools.getThread(), "UserFeedback", "Pega-Feedback", tools.getStepPage())) {
tools.appendString(" ");
 /* Added below when condition for BUG-117159 */ 
tools.appendString(" ");
	if (pega.isPreviewMode() || !tools.getProperty("pxThread.pxPortal").getStringValue().equals("Developer")) {
tools.appendString(" ");

  /* Check if property exists */
  ClipboardProperty prefProperty = tools.getProperty("OperatorID.pyPreferences.pyToolsPrefs.pyShowFeedbackPin");
String desktopType = tools.getProperty("pyPortal.pyDesktopType").getStringValue();

if (prefProperty == null || (prefProperty != null && prefProperty.getStringValue().equals(""))) {
  tools.putParamValue("Preferred", true);
} else {
  tools.putParamValue("Preferred", prefProperty.toBoolean());
}

tools.appendString(" ");
	if (pega.isPreviewMode() || Boolean.valueOf(tools.getParamValue("Preferred")).booleanValue()) {
tools.appendString(" ");

  String originatorEmail = null;
try {
  originatorEmail = tools.findPage("OperatorID").getProperty("pyAddresses").getProperty("Email").getPageValue().getString("pyEmailAddress");
}
catch(Exception e) {
  originatorEmail = "";
}

tools.appendString(" \"assign_01\": \"pega.namespace(\\\"pega.feedback\\\");\", \"assign_02\": \"pega.u.d.HideFeedback = '");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__3(pageContext, "param.HideFeedback")) {
	return;
}
tools.appendString("';\", \"assign_03\": \"pega.feedback.Globals = {};\", ");
	boolean foundChoice_7 = false;
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("HideFeedback"), "true")))) {
tools.appendString(" ");

  String pmfEnabled = null;
ClipboardPage app = tools.findPage("Application");
if (app != null) {
  pmfEnabled = app.getString("pyProjectManagementEnabled");
}
if (pmfEnabled != null && !pmfEnabled.toLowerCase().equals("true")) {
  tools.appendString("\"assign_03-feedback\": \"pega.feedback.bPMFEnabled = false\",");
}
tools.appendString("  \"originatorEmail\": \"");
out.print(originatorEmail);
tools.appendString("\", \"assign_04\": \"pega.util.Event.addListener(window,\\\"load\\\",handlePushpinOnLoad)\" ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7) {
tools.appendString(" \"originatorEmail\": \"");
out.print(originatorEmail);
tools.appendString("\" ");
}
tools.appendString("  ");
	}
tools.appendString(" ");
	}
tools.appendString(" ");
	}
tools.appendString(" } }; processDynamicData(bottomVars); ");
	boolean foundChoice_8 = false;
tools.appendString(" ");
if (!foundChoice_8 && (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue("bFlowAction"), "true")))) {
tools.appendString("  ");
	if (pega.isPreviewMode() || ((areValsEqual(tools.getSaveValue("bClientValidation"), "true")) || (areValsEqual(tools.getSaveValue("bExpressionCalculation"), "true")))) {
tools.appendString(" ");
	if (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue("bClientValidation"), "true"))) {
tools.appendString(" ");

    String strValidate = tools.getSaveValue("FlowActionValidate");
if(strValidate .equals("")){

  if(tools.getPrimaryPage().getString("pyID").equals("")){
    strValidate="OnAdd";
  }else{
    strValidate="Validate";
  }
}
if(!strValidate.equals("NO_VALIDATION")){
  StringMap validate_keys = new HashStringMap();
  validate_keys.put("pxObjClass", "Rule-Obj-Validate");
  validate_keys.put("pyActivityName", strValidate);
  if(!tools.getPrimaryPage().getName().equals("")){ /* getMetaData PublicAPI throws exception for unnamed page */
    java.util.Map metadata = tools.getMetadata(validate_keys, tools.getPrimaryPage());
    if(metadata!=null){
      if(!metadata.isEmpty()){
        tools.appendString("");
        tools.appendString("function configure_rule_obj_validate(){");
        java.util.Iterator iter_metadata = metadata.keySet().iterator();
        String name;
        String values[];
        try {
          while(iter_metadata .hasNext()){
            name=(String)iter_metadata .next();
            values = (String[])metadata.get(name);
            tools.appendString("rule_obj_validate('"+name+"','"+values[0]+"','"+values[3]+"','");
            if(tools.getRuleMessage(values[4]).startsWith("**"))
              tools.appendString(tools.getLocalizedTextForString("pyMessageLabel", values[4]));
            else
              tools.appendString(tools.getRuleMessage(values[4]));
            tools.appendString("');");
          }
        } catch (Exception e) {
          oLog.error("Exception occurred for " + strValidate + "--" + e.getMessage());
        }
        tools.appendString("}");
        tools.appendString("");
      }
    }else{
      oLog.info("Meta Data is null for "+strValidate +" for page "+tools.getPrimaryPage().getName());
    }
  }
}

tools.appendString(" ");
	}
tools.appendString(" ");
boolean whenResult_26 = pega.invokeWhen("isAccessible", "", "");
	if (whenResult_26) {
tools.appendString(" if(typeof(display_displayConfirm)!='undefined' && typeof(accessibleErrorHandling)!='undefined' && accessibleErrorHandling){ /* function used to show all errors - usually called before submit */ validation_displayErrors = display_displayConfirm; /* function used to show one error - usually called by an event */ validation_displayFieldError = display_displayConfirm; } ");
	}
tools.appendString(" ");
	}
tools.appendString(" ");

foundChoice_8 = !pega.isPreviewMode();
}
tools.appendString("   var harCtxMgr = pega.ui.HarnessContextMgr; var pyRequestorToken = harCtxMgr.get(\"pyRequestorToken\"); var pxClientSession = harCtxMgr.get(\"pxClientSession\"); try { if(window == pega.desktop.support.getDesktopWindow() && window.localStorage){ localStorage.setItem(\"pyRequestorToken\"+pxClientSession, pyRequestorToken); localStorage.setItem(\"pyRequestorToken\", pyRequestorToken); } } catch (e) { console.debug(\"Issue: window.localStorage not supported by browser. Perhaps you are in private/incognito mode.\"); } ");
	if (pega.isPreviewMode() || !tools.getParamValue("bExcludeLegacyJS").equalsIgnoreCase("true")) {
tools.appendString(" ");
choose_7();
tools.appendString("  ");
	}
}
private static final Map oPropDefinitions_12 = null;
private static final Map oStreamProperties_12 = new HashMap();
static {
	oStreamProperties_12.put("pyRuleAvailable", "Final");
	oStreamProperties_12.put("pyCircumstanceDateProp", "");
	oStreamProperties_12.put("pyCircumstanceVal", "");
	oStreamProperties_12.put("pyMethodStatus", "Internal");
	oStreamProperties_12.put("pyClassName", "@baseclass");
	oStreamProperties_12.put("pyCircumstanceProp", "");
	oStreamProperties_12.put("pzInsKey", "RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT");
	oStreamProperties_12.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_12.put("pyCircumstanceDate", "");
	oStreamProperties_12.put("pyRuleEnds", "");
	oStreamProperties_12.put("pyRuleStarts", "");
	oStreamProperties_12.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_12.put("pyXMLType", "");
	oStreamProperties_12.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_12.put("pyCorrType", "");
	oStreamProperties_12.put("pyStreamName", "pzClientDynamicDataBottom");
	oStreamProperties_12.put("pyRuleSetVersion", "08-07-01");
}
/**
 * Build stream RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT
 */
private void include_11() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT	Pega-UIEngine:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT
 * Set up context.
 */
final String prevRuleKey_12 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT";final String prevClass_12 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-HTML");
final Map prevPropDefs_12 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_12);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_12);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_12)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_11();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_12);
	mStreamResponse.setJspBaseClass(prevClass_12);
	pz_CurrentRuleKey = prevRuleKey_12;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_12,true);
}
/* end RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_14() throws Throwable {
tools.appendString(" ");
 
    boolean arePackaging = pega_uiengine_offlinesupport.pzIsForOfflineTemplate(); 
  	String topHarness = tools.getParamValue("topHarness");
   
  	/* If included by harness generated java or in a flow action in iframe */
  	if (tools.getSaveValue("AutoDocInfoInclude").equals("true") || tools.getSaveValue("bFlowAction").equals("true")) { 
   
		/* Add bottom vars for portal harness only when packaging, always set primpary page when packaging */
		if ((arePackaging && topHarness.equals("yes")) || (!arePackaging)) {  
tools.appendString(" <script > ");
/* Include stream RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT */
include_11();

tools.appendString(" </script> ");

		}    
		else if (arePackaging) { 
tools.appendString(" <script> pega.u.d.setPrimaryPage('");
out.print(tools.getPrimaryPage().getName());
tools.appendString("'); </script> ");

    	} 
       
		/* Include prebuilt expression map string if expressions enabled  */
    	if (tools.getSaveValue("bExpressionCalculation").equals("true")) { 
tools.appendString(" <script> ");
/* Include stream RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT */
include_12();

tools.appendString(" </script> ");

        } 
       
tools.appendString(" ");
/* Include stream RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT */
include_13();

tools.appendString(" ");
     
  	/* Not included in harness therefore ajax operation, load any additional script files */
  	} else {
  	
tools.appendString(" ");
/* Include stream RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT */
include_9();

tools.appendString(" ");
/* Include stream RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT */
include_13();

tools.appendString(" ");

  	}

   
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT */
include_14();

tools.appendString(" <script> ");
/* Include stream RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT */
include_15();

tools.appendString(" </script>  ");
 
	// if have no staticContentJSOptimization, include deferredStaticBodyContent as normal
	if (!pzAuto.hasStaticContentJSOptimization()) {
   
		// Insert cached deferred script found during rendering
		pzAuto.insertDeferredStaticBodyContent(); 
	} 

}
private static final Map oPropDefinitions_11 = null;
private static final Map oStreamProperties_11 = new HashMap();
static {
	oStreamProperties_11.put("pyRuleAvailable", "Final");
	oStreamProperties_11.put("pyCircumstanceDateProp", "");
	oStreamProperties_11.put("pyCircumstanceVal", "");
	oStreamProperties_11.put("pyMethodStatus", "Internal");
	oStreamProperties_11.put("pyClassName", "");
	oStreamProperties_11.put("pyCircumstanceProp", "");
	oStreamProperties_11.put("pzInsKey", "RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT");
	oStreamProperties_11.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_11.put("pyCircumstanceDate", "");
	oStreamProperties_11.put("pyRuleEnds", "");
	oStreamProperties_11.put("pyRuleStarts", "");
	oStreamProperties_11.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_11.put("pyXMLType", "");
	oStreamProperties_11.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_11.put("pyCorrType", "");
	oStreamProperties_11.put("pyStreamName", "DocumentInfo");
	oStreamProperties_11.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT
 */
private void include_16() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT
 * Set up context.
 */
final String prevRuleKey_11 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT";final String prevClass_11 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_11 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_11);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_11);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_11)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_14();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_11);
	mStreamResponse.setJspBaseClass(prevClass_11);
	pz_CurrentRuleKey = prevRuleKey_11;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_11,true);
}
/* end RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__6(PageContext aPageContext, java.lang.String aType, java.lang.String aApp) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString(" ");
	IStaticContentRuntime pzStatic__22 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__22.addFile("pzpega_ui_jitj", "11718769264", "js");
tools.appendString(" ");
	IStaticContentRuntime pzStatic__24 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__24.addFile("pzpega_ui_jitj_init", "1972975585", "js");
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
private void performStream_10() throws Throwable {
tools.appendString(" ");
 if (pzAuto.hasStaticContentJSOptimization() && !pzAuto.isOffline()) { 
tools.appendString(" ");

     ClipboardPage cp = tools.findPage("pyPortal.pyStaticContentOptimization");
     if (cp !=null && "true".equals(cp.getString("pyDynamicLoadJS"))) {
  
tools.appendString(" ");
if (_jspx_meth_pega_static__6(pageContext, "script", "webwb")) {
	return;
}
tools.appendString(" ");
 } else { 
tools.appendString(" <script type=\"text/javascript\"> var head = document.getElementsByTagName(\"head\")[0]; var bottomJSON = { \"bottomFiles\": [");

        	ClipboardPage pg_contentOptimization = tools.findPage("pyPortal.pyStaticContentOptimization");
        	ClipboardProperty cp_contentFiles = pg_contentOptimization.getProperty("pyJSStaticContentFiles");
        	java.util.Iterator itr = cp_contentFiles.iterator();

        	while (itr.hasNext()) {
        		ClipboardPage currentRow = ((ClipboardProperty)itr.next()).getPageValue();
        		String fileName = currentRow.getString("pyFileName");
        		boolean includeTop = currentRow.getBoolean("pyIncludeAtTop");
   				  boolean includeMiddle = currentRow.getBoolean("pyIncludeAtMiddle");
            boolean includeDepMap = currentRow.getBoolean("pyIncludeDepMap");

        		if (!includeTop && !includeMiddle && !includeDepMap) {
                  tools.appendString("{\"fileName\" : \"" + fileName + "\"}");
        		  // because need trailing "," in JSON for an array, but not last entry
                  if (itr.hasNext()) {
                      tools.appendString(",");
                  }
        		  }
        	  }


         
tools.appendString("] };  var size = bottomJSON.bottomFiles.length; var head_arScripts = document.getElementsByTagName(\"script\"); for (i = 0; i < size; i++) { var head_bOkToLoad = true; var scriptCount = head_arScripts.length; var scriptName = bottomJSON.bottomFiles[i].fileName; /* check if script exists */ for (j=0; j < scriptCount; j++) { if (head_arScripts[j].src != null) { if (head_arScripts[j].src.indexOf(scriptName) >= 0) { head_bOkToLoad = false; break; } } } /* only load if doesn't already exist */ if (head_bOkToLoad) { var scriptNode = document.createElement(\"script\"); scriptNode.type = \"text/javascript\"; scriptNode.src = bottomJSON.bottomFiles[i].fileName; head.appendChild(scriptNode); } } </script> ");
 } 
tools.appendString(" ");
 } 
}
private static final Map oPropDefinitions_10 = null;
private static final Map oStreamProperties_10 = new HashMap();
static {
	oStreamProperties_10.put("pyRuleAvailable", "Final");
	oStreamProperties_10.put("pyCircumstanceDateProp", "");
	oStreamProperties_10.put("pyCircumstanceVal", "");
	oStreamProperties_10.put("pyMethodStatus", "Internal");
	oStreamProperties_10.put("pyClassName", "");
	oStreamProperties_10.put("pyCircumstanceProp", "");
	oStreamProperties_10.put("pzInsKey", "RULE-HTML-FRAGMENT PZOPTIMIZEDBOTTOMSTATICCONTENT #20210112T172931.878 GMT");
	oStreamProperties_10.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_10.put("pyCircumstanceDate", "");
	oStreamProperties_10.put("pyRuleEnds", "");
	oStreamProperties_10.put("pyRuleStarts", "");
	oStreamProperties_10.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_10.put("pyXMLType", "");
	oStreamProperties_10.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_10.put("pyCorrType", "");
	oStreamProperties_10.put("pyStreamName", "pzOptimizedBottomStaticContent");
	oStreamProperties_10.put("pyRuleSetVersion", "08-06-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZOPTIMIZEDBOTTOMSTATICCONTENT #20210112T172931.878 GMT
 */
private void include_10() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZOPTIMIZEDBOTTOMSTATICCONTENT #20210112T172931.878 GMT	Pega-UIEngine:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZOPTIMIZEDBOTTOMSTATICCONTENT #20210112T172931.878 GMT
 * Set up context.
 */
final String prevRuleKey_10 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZOPTIMIZEDBOTTOMSTATICCONTENT #20210112T172931.878 GMT";final String prevClass_10 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_10 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_10);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_10);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_10)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_10();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_10);
	mStreamResponse.setJspBaseClass(prevClass_10);
	pz_CurrentRuleKey = prevRuleKey_10;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_10,true);
}
/* end RULE-HTML-FRAGMENT PZOPTIMIZEDBOTTOMSTATICCONTENT #20210112T172931.878 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_9() throws Throwable {

final Set names = new TreeSet(pega_rules_pegarulesutilities.getNewOnlyOnceNames(tools));
if (! names.isEmpty()) {
  final Iterator namesIter = names.iterator();
  int i=0;
  StringBuilder sb = new StringBuilder();
  while (namesIter.hasNext()) {
    final String name = (String) namesIter.next();
    if(++i==1){
      sb.append("[\"").append(name).append("\"");
    } else {
      sb.append(",\"").append(name).append("\"");
    }
  }
  if(i>0) {
    sb.append("]");
  }
  
tools.appendString("\n<div style='display:none;' id='PegaOnlyOnce' data-json='");
out.print( sb.toString() );
tools.appendString("'></div>\n");
 } 
}
private static final Map oPropDefinitions_9 = null;
private static final Map oStreamProperties_9 = new HashMap();
static {
	oStreamProperties_9.put("pyRuleAvailable", "Final");
	oStreamProperties_9.put("pyCircumstanceDateProp", "");
	oStreamProperties_9.put("pyCircumstanceVal", "");
	oStreamProperties_9.put("pyMethodStatus", "Internal");
	oStreamProperties_9.put("pyClassName", "@baseclass");
	oStreamProperties_9.put("pyCircumstanceProp", "");
	oStreamProperties_9.put("pzInsKey", "RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT");
	oStreamProperties_9.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_9.put("pyCircumstanceDate", "");
	oStreamProperties_9.put("pyRuleEnds", "");
	oStreamProperties_9.put("pyRuleStarts", "");
	oStreamProperties_9.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_9.put("pyXMLType", "");
	oStreamProperties_9.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_9.put("pyCorrType", "");
	oStreamProperties_9.put("pyStreamName", "pzOnlyOnceChanges");
	oStreamProperties_9.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT
 */
private void include_9() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT
 * Set up context.
 */
final String prevRuleKey_9 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT";final String prevClass_9 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-HTML");
final Map prevPropDefs_9 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_9);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_9);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_9)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_9();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_9);
	mStreamResponse.setJspBaseClass(prevClass_9);
	pz_CurrentRuleKey = prevRuleKey_9;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_9,true);
}
/* end RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private static final String[] showMeParams_4 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Final", "", "Pega-ProCom", "08-06-01", "", "PegaCompositeConfig", "", "RULE-HTML-FRAGMENT PEGACOMPOSITECONFIG #20200721T210858.505 GMT" };
private void performStream_7() throws Throwable {
tools.appendString("<script>\nif (pega.web && pega.web.config) {\n\tpega.web.config.gatewayURL = '");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "pxThread.pxReqURI", "normal")) {
	return;
}
tools.appendString("';\n\tpega.web.config.appName = '");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "pxThread.pxCurrentApplicationName", "normal")) {
	return;
}
tools.appendString("';\n\tpega.web.config.systemID = '';\n\tpega.web.config.thread = '!STANDARD';\n\tpega.web.config.encrypt = ");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "pxRequestor.pxUrlEncryption", "normal")) {
	return;
}
tools.appendString(";\n}\n</script>");
}
private static final Map oPropDefinitions_8 = null;
private static final Map oStreamProperties_8 = new HashMap();
static {
	oStreamProperties_8.put("pyRuleAvailable", "Final");
	oStreamProperties_8.put("pyCircumstanceDateProp", "");
	oStreamProperties_8.put("pyCircumstanceVal", "");
	oStreamProperties_8.put("pyMethodStatus", "");
	oStreamProperties_8.put("pyClassName", "");
	oStreamProperties_8.put("pyCircumstanceProp", "");
	oStreamProperties_8.put("pzInsKey", "RULE-HTML-FRAGMENT PEGACOMPOSITECONFIG #20200721T210858.505 GMT");
	oStreamProperties_8.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_8.put("pyCircumstanceDate", "");
	oStreamProperties_8.put("pyRuleEnds", "");
	oStreamProperties_8.put("pyRuleStarts", "");
	oStreamProperties_8.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_8.put("pyXMLType", "");
	oStreamProperties_8.put("pyRuleSet", "Pega-ProCom");
	oStreamProperties_8.put("pyCorrType", "");
	oStreamProperties_8.put("pyStreamName", "PegaCompositeConfig");
	oStreamProperties_8.put("pyRuleSetVersion", "08-06-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PEGACOMPOSITECONFIG #20200721T210858.505 GMT
 */
private void include_7() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PEGACOMPOSITECONFIG #20200721T210858.505 GMT	Pega-ProCom:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PEGACOMPOSITECONFIG #20200721T210858.505 GMT
 * Set up context.
 */
final String prevRuleKey_8 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PEGACOMPOSITECONFIG #20200721T210858.505 GMT";final String prevClass_8 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_8 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_8);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_8);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_8)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_7();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_8);
	mStreamResponse.setJspBaseClass(prevClass_8);
	pz_CurrentRuleKey = prevRuleKey_8;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_8,true);
}
/* end RULE-HTML-FRAGMENT PEGACOMPOSITECONFIG #20200721T210858.505 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_4);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__2(PageContext aPageContext, java.lang.String aMode, java.lang.String aName) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setMode(aMode);
_jspx_th_pega_reference_.setName(aName);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
private boolean when_4(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getActive().getPageValue().getString(aParam1), aParam2)));
}
/**
 * Implements a pega:forEach tag.
 */private boolean _jspx_meth_pega_forEach__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:forEach */
com.pega.pegarules.jsptags.ForEachTag _jspx_th_pega_forEach_ = (com.pega.pegarules.jsptags.ForEachTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ForEachTag.class);
_jspx_th_pega_forEach_.setPageContext(pageContext);
_jspx_th_pega_forEach_.setParent(mParentTag);
_jspx_th_pega_forEach_.setName(aName);
int _jspx_eval_pega_forEach_ = _jspx_th_pega_forEach_.doStartTag();
if (_jspx_eval_pega_forEach_ != Tag.SKIP_BODY) {
	if (_jspx_eval_pega_forEach_ != Tag.EVAL_BODY_INCLUDE) {
		BodyContent bodyContent = pageContext.pushBody();
		out = bodyContent;
		_jspx_th_pega_forEach_.setBodyContent(bodyContent);
		_jspx_th_pega_forEach_.doInitBody();
	}	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_forEach_;
tools.appendString(" ");
	if (when_4(".pyIncludeAtMiddle", "true")) {
tools.appendString(" <script type=\"text/javascript\" src=\"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, "text", "$this.pyFileName")) {
	return true;
}
tools.appendString("\"></script> ");
	}
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_forEach_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
	if (_jspx_eval_pega_forEach_ != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
		out = pageContext.popBody();
	}
}
if (_jspx_th_pega_forEach_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_forEach_);
return false;
}
private void performStream_8() throws Throwable {
 if (pzAuto.hasStaticContentJSOptimization() && !pzAuto.isOffline()) { 
tools.appendString(" ");
if (_jspx_meth_pega_forEach__1(pageContext, "pyPortal.pyStaticContentOptimization.pyJSStaticContentFiles")) {
	return;
}
tools.appendString(" ");
 } 
tools.appendString(" ");
 if ( pzAuto.hasStaticContentJSOptimization() && !pzAuto.isOffline()) {
     if ( !(pega_uiengine_portal.pzIsPortalSDM()  ||  pega_uiengine_portal.pzIsPortalSPA()) ){  
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT PEGACOMPOSITECONFIG #20200721T210858.505 GMT */
include_7();

tools.appendString(" ");
 } 
}
}
private static final Map oPropDefinitions_7 = null;
private static final Map oStreamProperties_7 = new HashMap();
static {
	oStreamProperties_7.put("pyRuleAvailable", "Final");
	oStreamProperties_7.put("pyCircumstanceDateProp", "");
	oStreamProperties_7.put("pyCircumstanceVal", "");
	oStreamProperties_7.put("pyMethodStatus", "Internal");
	oStreamProperties_7.put("pyClassName", "");
	oStreamProperties_7.put("pyCircumstanceProp", "");
	oStreamProperties_7.put("pzInsKey", "RULE-HTML-FRAGMENT PZOPTIMIZEDMIDDLESTATICCONTENT #20180713T133243.803 GMT");
	oStreamProperties_7.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_7.put("pyCircumstanceDate", "");
	oStreamProperties_7.put("pyRuleEnds", "");
	oStreamProperties_7.put("pyRuleStarts", "");
	oStreamProperties_7.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_7.put("pyXMLType", "");
	oStreamProperties_7.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_7.put("pyCorrType", "");
	oStreamProperties_7.put("pyStreamName", "pzOptimizedMiddleStaticContent");
	oStreamProperties_7.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZOPTIMIZEDMIDDLESTATICCONTENT #20180713T133243.803 GMT
 */
private void include_8() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZOPTIMIZEDMIDDLESTATICCONTENT #20180713T133243.803 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZOPTIMIZEDMIDDLESTATICCONTENT #20180713T133243.803 GMT
 * Set up context.
 */
final String prevRuleKey_7 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZOPTIMIZEDMIDDLESTATICCONTENT #20180713T133243.803 GMT";final String prevClass_7 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_7 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_7);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_7);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_7)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_8();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_7);
	mStreamResponse.setJspBaseClass(prevClass_7);
	pz_CurrentRuleKey = prevRuleKey_7;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_7,true);
}
/* end RULE-HTML-FRAGMENT PZOPTIMIZEDMIDDLESTATICCONTENT #20180713T133243.803 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private static final String[] showMeParams_3 = {
"", "", "", "", "", "", "04-02", "Extension", "Rule-HTML-Fragment", "Yes", "", "Pega-UIEngine", "08-01-01", "", "pyIncludeUWT", "", "RULE-HTML-FRAGMENT PYINCLUDEUWT #20180713T133243.549 GMT" };
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
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__5(PageContext aPageContext, java.lang.String aType, java.lang.String aApp) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString("\n\t");
	IStaticContentRuntime pzStatic__18 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__18.addFile("pzpega_uwt_data", "1574146947", "js");
tools.appendString("\n    ");
	IStaticContentRuntime pzStatic__20 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__20.addFile("pzpega_uwt_ui", "11468690253", "js");
tools.appendString("\n");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
private void performStream_6() throws Throwable {
if (_jspx_meth_pega_static__5(pageContext, "script", "webwb")) {
	return;
}
tools.appendString("\n\n<div id=\"submitTimeDiv\" style=\"display:none;\">\n    ");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "pxRequestor.pyBenchmarkStartTime", "input")) {
	return;
}
tools.appendString("\n    ");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "pxRequestor.pyBenchmarkSubmitTime", "input")) {
	return;
}
tools.appendString("\n</div>\n");
 
    String userStart= "0", preSubmit="0", serverDuration = "0";
	ClipboardPage requestorPG = tools.findPage("pxRequestor");
	
	if(requestorPG != null) {
		userStart = requestorPG.getString("pyBenchmarkStartTime");
		preSubmit = requestorPG.getString("pyBenchmarkSubmitTime");

		ClipboardPage PALPhase = tools.findPage("PALPhase");
		if(PALPhase != null) {
			double palStart = 0;
			double palEnd = 0;
			try {
				palStart = Double.parseDouble(tools.findPage("PALPhase").getString("pxTotalReqTime"));
			} catch(Exception ex) {}
			Set optionalStats = java.util.Collections.singleton("");
			PALPhase.replace(tools.getPAL().getStats(optionalStats));
			try {
				palEnd = Double.parseDouble(tools.findPage("PALPhase").getString("pxTotalReqTime"));
			} catch(Exception ex) {}
			serverDuration = (palEnd - palStart) + "";
			PALPhase.removeFromClipboard();
		}
		requestorPG.remove("pyBenchmarkStartTime");
		requestorPG.remove("pyBenchmarkSubmitTime");
	}

tools.appendString("\n\n<script type=\"text/javascript\">\n\tvar uwtUserStart = '");
out.print( StringUtils.crossScriptingFilter(userStart) );
tools.appendString("';\n\tvar uwtPreSubmit = '");
out.print( StringUtils.crossScriptingFilter(preSubmit) );
tools.appendString("';\n\tvar uwtServerDuration = '");
out.print( serverDuration );
tools.appendString("';\n\n/*UWT is available only in IE*/\nif(typeof(pega) != \"undefined\" && pega && pega.util && pega.util.Event && pega.util.Event.isIE && pega.u && pega.u.d){\n\tvar bRecordEvent= true;\n\tpega.u.d.attachOnload(function(){\n\t\tif(pega.u.d.Timer==undefined){\n   \t\t \tpega.u.d.Timer = new UWTTimer();\n\t\t\tvar userStart = '");
out.print( StringUtils.crossScriptingFilter(userStart) );
tools.appendString("';\n\t\t\tvar preSubmit = '");
out.print( StringUtils.crossScriptingFilter(preSubmit) );
tools.appendString("';\n\t\t\tvar serverDuration ='");
out.print( serverDuration );
tools.appendString("';\n\t\t\tpega.u.d.Timer.createCurrentTimer({\n\t\t\t\tuserStart : (isNaN(userStart)||(userStart==\"\")) ? 0 : parseFloat(userStart),\n\t\t\t\tpreSubmit  : (isNaN(preSubmit)||(preSubmit==\"\")) ? 0 : parseFloat(preSubmit),\n\t\t\t\tserverDuration  : (isNaN(serverDuration)||(serverDuration==\"\")) ? 0 : parseFloat(serverDuration),\n\t\t\t\tclientStart :(isNaN(uwtClientStart)||(uwtClientStart==\"\")) ? 0 : parseFloat(uwtClientStart)\t\t\n\t\t\t});\n\t\t\twindow.uwtUserStart = 0;\n\t\t\twindow.uwtPreSubmit = 0;\n\t\t\twindow.uwtServerDuration = 0;\n\t\t\twindow.uwtClientStart = 0;\n\t\t}\n\t}, false);\n\t\n}else{\n\tvar bRecordEvent= false;\n}\n</script>");
}
private static final Map oPropDefinitions_6 = null;
private static final Map oStreamProperties_6 = new HashMap();
static {
	oStreamProperties_6.put("pyRuleAvailable", "Yes");
	oStreamProperties_6.put("pyCircumstanceDateProp", "");
	oStreamProperties_6.put("pyCircumstanceVal", "");
	oStreamProperties_6.put("pyMethodStatus", "Extension");
	oStreamProperties_6.put("pyClassName", "");
	oStreamProperties_6.put("pyCircumstanceProp", "");
	oStreamProperties_6.put("pzInsKey", "RULE-HTML-FRAGMENT PYINCLUDEUWT #20180713T133243.549 GMT");
	oStreamProperties_6.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_6.put("pyCircumstanceDate", "");
	oStreamProperties_6.put("pyRuleEnds", "");
	oStreamProperties_6.put("pyRuleStarts", "");
	oStreamProperties_6.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_6.put("pyXMLType", "");
	oStreamProperties_6.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_6.put("pyCorrType", "");
	oStreamProperties_6.put("pyStreamName", "pyIncludeUWT");
	oStreamProperties_6.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PYINCLUDEUWT #20180713T133243.549 GMT
 */
private void include_6() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PYINCLUDEUWT #20180713T133243.549 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PYINCLUDEUWT #20180713T133243.549 GMT
 * Set up context.
 */
final String prevRuleKey_6 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PYINCLUDEUWT #20180713T133243.549 GMT";final String prevClass_6 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_6 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_6);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_6);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_6)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_6();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_6);
	mStreamResponse.setJspBaseClass(prevClass_6);
	pz_CurrentRuleKey = prevRuleKey_6;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_6,true);
}
/* end RULE-HTML-FRAGMENT PYINCLUDEUWT #20180713T133243.549 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_3);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_3() throws Throwable {
boolean whenResult_10 = pega.invokeWhen("recordEvent", "", "");
return whenResult_10;
}


public void elementModel_1() { 

	try {

 ClipboardPage pg_dec_PyDisplay = tools.findPage("Declare_pyDisplay");

 ClipboardProperty cp_tempPage = pg_dec_PyDisplay.getIfPresent("pyDisplay");

				 ClipboardPage pg_DisplayState = pg_dec_PyDisplay.getProperty("pyDCDisplayState").getPageValue();

  pg_DisplayState.getEntryHandle("pyActiveDocumentType");

 ClipboardPage pg_prevDisplay= null;

 String portalName = tools.findPage("pxThread").getString("pxPortal");

 if(cp_tempPage != null ){

 pg_prevDisplay = cp_tempPage.getPageValue(portalName);

}

 ClipboardPage pg_displayTemp = tools.findPage("pyDisplayTemp", true);

if(pg_displayTemp != null) {

				 pg_DisplayState.putString("pyActiveDocumentType","HOME");

	ClipboardPage pg_display = tools.createPage("Pega-UI-RunTime-Display", "pyDisplay");

	 pg_display.getProperty("pyPortalName").setValue(portalName);

		if(pg_displayTemp.getProperty("pyElements").size() > 0) {

			ClipboardProperty cp_SectionTabs = pg_displayTemp.getProperty("pyElements");

			Iterator iter_elements = cp_SectionTabs.iterator();

			while(iter_elements.hasNext()){

				ClipboardPage pg_elem = ((ClipboardProperty)iter_elements.next()).getPageValue();

				Iterator iter_elements2 = null;

				iter_elements2 = pg_elem.getProperty("pyUIElements").iterator();

				while(iter_elements2.hasNext()){

					ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

					 if(!"".equalsIgnoreCase(pg_innerElem.getStringIfPresent("pyMode"))){pg_display.putString("pyMode",pg_innerElem.getString("pyMode"));

					 pg_innerElem.getProperty("pyMode").removeFromClipboard(); 

					 try{ if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){

					 com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					 dataModelChangeTracker.trackValueChanges(tools.findPage("Declare_pyDisplay").getProperty("pyDisplay").getPageValue(portalName).getProperty("pyCandidateIndices"),-1);

					}}catch(Exception e){} }

					 else{

					 try{ if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){

					 com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					 }}catch(Exception e){} 

					 }

					pg_display.movePage("pyUIElements(<APPEND>)", pg_innerElem);

				}

				iter_elements2 = pg_elem.getProperty("pyUIActive").iterator(); 

				while(iter_elements2.hasNext()){ 

					ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

						if(!("").equalsIgnoreCase(pg_innerElem.getString("pyMode"))){pg_innerElem.getProperty("pyMode").removeFromClipboard();} 

					pg_display.movePage("pyUIActive(<APPEND>)", pg_innerElem);

				}

			}

		}

		if(pg_display.getProperty("pyUIElements").size() == 0){

			pg_display.removeFromClipboard();

		} else {

			pg_display.put(pg_displayTemp.getProperty("pyContainerList"));

		}

		tools.findPage("pyDisplayTemp").removeFromClipboard();

	 if(pg_prevDisplay !=null){

 boolean bIsDCSPA =  pg_prevDisplay.getBoolean("pyIsDCSPA");

 boolean isActivateDocCase =  "activate".equals(tools.getRootParamValue("api"));

 boolean isHistoryStateNull = "true".equals(tools.getRootParamValue("isHistoryStateNull"));
if("NoHeader".equalsIgnoreCase(pg_display.getString("pyMode"))){

	 pg_display.putString("pyCandidateIndices",pg_prevDisplay.getString("pyCandidateIndices"));

					 try{ if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){

					 com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					 dataModelChangeTracker.trackValueChanges(tools.findPage("Declare_pyDisplay").getProperty("pyDisplay").getPageValue(portalName).getProperty("pyCandidateIndices"),-1);

					}}catch(Exception e){} }

	 pg_display.getProperty("pyHANotify").setValue("false");

	 ClipboardProperty cp_DisplayLayouts = pg_prevDisplay.getIfPresent("pyLayout");

	 int prevElementsCnt = pg_prevDisplay.getProperty("pyUIElements").size();

	 int elementsCnt =pg_displayTemp.getIfPresent("pyElements").size();

 String activeCtdID="";

 boolean  isStaticEleActive=false;

 ClipboardProperty pg_prevUIActive = pg_prevDisplay.getProperty("pyUIActive");

 if(pg_prevUIActive!=null && pg_prevUIActive.size()>0){

 activeCtdID = pg_prevUIActive.getPageValue(1).getString("pyElementName");

 isStaticEleActive = pg_prevUIActive.getPageValue(1).getBoolean("pyIsStatic");

 if(bIsDCSPA && (!isActivateDocCase && !isHistoryStateNull)){

	 pg_display.getProperty("pyUIActive").setValue(pg_prevUIActive);

 }

	 } 

 if(cp_DisplayLayouts == null){

 Iterator iter_prevDisplay = pg_prevDisplay.getProperty("pyUIElements").iterator();

 elementsCnt =0;

 while(iter_prevDisplay.hasNext()){

 elementsCnt++; 
 ClipboardPage pg_prevUIElement = ((ClipboardProperty)iter_prevDisplay.next()).getPageValue();

 if(bIsDCSPA){

 ClipboardPage pg_currentElement = pg_display.getProperty("pyUIElements").getPageValue(1);

	 if(!isActivateDocCase && !isHistoryStateNull){

	 pg_currentElement.replace(pg_prevUIElement);

	 }

	 continue;

}

 if(pg_prevUIElement.getString("pyIsStatic").equals("false")){

						 pg_prevUIElement.putString("pyStatus","Deferred");
int isize = 0; ClipboardProperty cp_currElems = pg_display.getIfPresent("pyUIElements");
if(cp_currElems != null){
 isize = cp_currElems.size();
}
 isize++; pg_prevUIElement.putString("pyIndex", isize+"");

 if( pg_prevUIElement != null && pg_prevUIElement.getBoolean("pyIsActive")){ 

  pg_display.getProperty("pyUIActive").getPropertyValue(1).setValue(pg_prevUIElement);

 }

 pg_display.movePage("pyUIElements(<APPEND>)", pg_prevUIElement); 

	}else {
ClipboardProperty staticUIElements = pg_display.getIfPresent("pyUIElements");
if(staticUIElements != null && staticUIElements.size() > 0){
String strCtdId = pg_prevUIElement.getString("pyElementName");

 Iterator iter_staticEles = staticUIElements.iterator();
 while(iter_staticEles.hasNext()){
 ClipboardPage pg_staticEle = ((ClipboardProperty)iter_staticEles.next()).getPageValue();
 String stroldEleCntdID = pg_staticEle.getString("pyElementName");
 String strIsStatic = pg_staticEle.getString("pyIsStatic");
 if("true".equalsIgnoreCase(strIsStatic)){
 if(!"".equals(stroldEleCntdID) && stroldEleCntdID !=null && stroldEleCntdID.equalsIgnoreCase(strCtdId)){
 pg_prevUIElement.putString("pyIndex",pg_staticEle.getString("pyIndex"));
 pg_staticEle.replace(pg_prevUIElement);break;
}
}else{break;}
}
}

	if(isStaticEleActive){
ClipboardProperty UIElements = pg_display.getIfPresent("pyUIElements");
if(UIElements != null && UIElements.size() > 0){

 Iterator iter_Eles = UIElements.iterator();
 while(iter_Eles.hasNext()){
 ClipboardPage pg_staticEle = ((ClipboardProperty)iter_Eles.next()).getPageValue();
 String strEleCntdID = pg_staticEle.getString("pyElementName");
 String strIsStatic = pg_staticEle.getString("pyIsStatic");
 if("true".equalsIgnoreCase(strIsStatic) && strEleCntdID.equalsIgnoreCase(activeCtdID)){
 	pg_staticEle.putString("pyIsActive","true"); 

  pg_display.getProperty("pyUIActive").getPropertyValue(1).setValue(pg_staticEle);
}else{
 	pg_staticEle.putString("pyIsActive","false");

	 }}}

	 }

	}}}

	   }

	 ClipboardProperty dcp_Display = pg_dec_PyDisplay.getProperty("pyDisplay");

	 ClipboardPage tpyDip=dcp_Display.getPageValue(portalName);

	 String strMode = tpyDip.getString("pyMode");

	 if("NoFrame".equals(strMode) || "NoIFrame".equals(strMode)){

	 tpyDip.putString("pyMode","NoIFrame");

	 }else{

	 ClipboardProperty pyMicroDCDisplay = tpyDip.getIfPresent("pyMicroDCDisplay");

	 if(pyMicroDCDisplay != null){ 

	 pg_display.getProperty("pyMicroDCDisplay").setValue(pyMicroDCDisplay);

	 }

	 tpyDip.clear(); ClipboardProperty cp_pyLayouts = tpyDip.getProperty("pyLayout");

	 cp_pyLayouts.removeFromClipboard();

	 }

	 String pyIsDCSPA = tools.getParamValue("pyIsDCSPA");

	 if(pyIsDCSPA != null && !("").equalsIgnoreCase(pyIsDCSPA)){

		 tpyDip.putString("pyIsDCSPA",pyIsDCSPA);

		 if("true".equals(tools.getParamValue("pyIsMultiSession")) || "true".equals(tools.getParamValue("bMultiPortalSession"))){

		 tpyDip.putString("bIsMultiSession","true");

		 tpyDip.putString("pxThreadName", tools.findPage("pxThread").getString("pxThreadName"));

		 }

	 }

	  tpyDip.putAll(pg_display,ClipboardPage.PUTALL_KEEPNEW);

 pg_display.removeFromClipboard();}

					 try{ if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){

					 com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					 dataModelChangeTracker.trackValueChanges(tools.findPage("Declare_pyDisplay").getProperty("pyDCDisplayState").getPageValue().getProperty("pyActiveDocumentType"),-1);

					}}catch(Exception e){} 

	} catch(Exception e){

		
}

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
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_3","RuleFormMain", secInfo);
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
}


public void includeSectionBody_1() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	
	
	String includedSectionName = "";includedSectionName = "RuleFormMain";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public IUIComponentMetadata 
generateContainerMetaData_1() {
	IUIComponentMetadata pg_harnesscontainer = pzAuto.getUIComponentRuntime().createMetadata();
	boolean strExpandedWhenResult= false;
	boolean visibleWhenResult= false;
	if(pzAuto.isInspectMode()){
		pg_harnesscontainer.put("liveUI",pega_uiengine_pzinspection.pzGenerateMetadata("Container", null, null, null, null, null));
	}
	pg_harnesscontainer.put("containerType","NONE");
	if(!pzAuto.getUIComponentRuntime().isTemplateRendering()){
		pg_harnesscontainer.put("JSRCompliant","false");
	}
	pg_harnesscontainer.put("isClientWhen",false);
	pg_harnesscontainer.put("isVisibilityOption","");
	 return pg_harnesscontainer;
}
public void buildHarnessContainer_1() {
	IUIComponentMetadata containteMetadata = generateContainerMetaData_1();
	if(containteMetadata!= null){
	IUIBuilder containerBuilder = pzHarness.getContainerBuilder();
	containerBuilder.begin(containteMetadata);
try {
tools.appendString("  <div class='harnessBodyNoHead'> ");
	if (pega.isPreviewMode() || (areValsEqual(tools.getParamValue("RenderSingle"), ""))) {
includeSectionBody_1();
	}
tools.appendString(" </div>  ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	containerBuilder.end(containteMetadata);
	}
}
private static final String[] showMeParams_2 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Final", "", "Pega-UIEngine", "08-01-01", "", "FormErrorMarker", "", "RULE-HTML-FRAGMENT FORMERRORMARKER #20180713T133243.506 GMT" };
private void performStream_5() throws Throwable {
	if (pega.isPreviewMode() || !tools.getParamValue("ShowMsg").equals("0") && tools.getPrimaryPage() != null) {
tools.appendString(" ");

boolean bDisplayErrorSection=true;
if(tools.getParamValue("ShowConflict")!=null && tools.getParamValue("ShowConflict").equalsIgnoreCase("true")){
 java.util.Map errorMap = tools.getPrimaryPage().getMessagesMapByEntryHandle();
if(errorMap != null && errorMap.size()==1){
	java.util.Iterator iter_errorMap = errorMap.keySet().iterator();
	while(iter_errorMap.hasNext()){
		String strKey  = (String)iter_errorMap.next();
/* This condition is to filter the error message and show pzShowConflict section in case of work-object parallel update */
		if(strKey.endsWith("$ppyCaseUpdateInfo$ppyNewMessage")){
			bDisplayErrorSection=false;
		}
	}
}
} if(bDisplayErrorSection){

tools.appendString(" ");
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || !tools.getParamValue("FormError").equals("NONE"))) {
tools.appendString(" ");
{
			    if(tools.getPrimaryPage().getMessageCountAll() > 0){
				StringMap keys = new HashStringMap();
				keys.putString("pxObjClass", "Rule-HTML-Section");
				keys.putString("pyStreamName","Errors");
				String strStream = tools.getStream(keys, null);
				tools.appendString(strStream);
			    }
			}
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2) {
tools.appendString(" ");
	if (pega.isPreviewMode() || !tools.getParamValue("pyCustomError").equals("")) {
tools.appendString(" <div id=\"pyCustomError\" style=\"display:none;\"> ");
{
				/*BUG-107145: While reloading only a grid layout, we set the RenderSingle param to get only single layout.
				 * If there are error messages set on the page, then the custom error section is not getting the content as the RenderSingle param is clashing. 
				 * So, cache the param in a temporary variable and reset it after rendering custom error section. */
				String tempRenderSingle = tools.getParamValue("RenderSingle");
				tools.putParamValue("RenderSingle", "");
				StringMap keys = new HashStringMap();
				keys.putString("pxObjClass", "Rule-HTML-Section");
				keys.putString("pyStreamName",tools.getParamValue("pyCustomError"));
				String strStream = tools.getStream(keys, null);
				tools.appendString(strStream);
				tools.putParamValue("RenderSingle",tempRenderSingle); /*Reset RenderSingle param to old value.*/
				}
				/*Generate this span when there are error messages.*/
				if(tools.getPrimaryPage().getMessageCountAll() > 0){
tools.appendString(" <span id=\"customErrorMsg\" /> ");
}
tools.appendString(" </div> ");
	}
tools.appendString(" ");
}
tools.appendString("  ");
 }


tools.appendString(" ");
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || tools.getParamValue("ShowConflict").equals("true") && tools.getParamValue("ShowOnTop").equals("true"))) {
tools.appendString(" ");
{
				if(tools.getPrimaryPage().getMessageCountAll() > 0){
                                	StringMap keys = new HashStringMap();
                                 	keys.putString("pxObjClass", "Rule-HTML-Section");
                               		keys.putString("pyStreamName","pzShowConflict");
                                	String strStream = tools.getStream(keys, null);
                                	tools.appendString(strStream);
				}
				tools.putParamValue("ShowOnTop","false");
				tools.getPrimaryPage().getPage("pyCaseUpdateInfo").clearMessages();
			}
tools.appendString(" ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString("  ");
	}
}
private static final Map oPropDefinitions_5 = null;
private static final Map oStreamProperties_5 = new HashMap();
static {
	oStreamProperties_5.put("pyRuleAvailable", "Final");
	oStreamProperties_5.put("pyCircumstanceDateProp", "");
	oStreamProperties_5.put("pyCircumstanceVal", "");
	oStreamProperties_5.put("pyMethodStatus", "");
	oStreamProperties_5.put("pyClassName", "");
	oStreamProperties_5.put("pyCircumstanceProp", "");
	oStreamProperties_5.put("pzInsKey", "RULE-HTML-FRAGMENT FORMERRORMARKER #20180713T133243.506 GMT");
	oStreamProperties_5.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_5.put("pyCircumstanceDate", "");
	oStreamProperties_5.put("pyRuleEnds", "");
	oStreamProperties_5.put("pyRuleStarts", "");
	oStreamProperties_5.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_5.put("pyXMLType", "");
	oStreamProperties_5.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_5.put("pyCorrType", "");
	oStreamProperties_5.put("pyStreamName", "FormErrorMarker");
	oStreamProperties_5.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT FORMERRORMARKER #20180713T133243.506 GMT
 */
private void include_5() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT FORMERRORMARKER #20180713T133243.506 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT FORMERRORMARKER #20180713T133243.506 GMT
 * Set up context.
 */
final String prevRuleKey_5 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT FORMERRORMARKER #20180713T133243.506 GMT";final String prevClass_5 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_5 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_5);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_5);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_5)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_5();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_5);
	mStreamResponse.setJspBaseClass(prevClass_5);
	pz_CurrentRuleKey = prevRuleKey_5;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_5,true);
}
/* end RULE-HTML-FRAGMENT FORMERRORMARKER #20180713T133243.506 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_2);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
public void processHarnessContainers_1() {
	buildHarnessContainer_1();
}
public void pzGenerateHarnessHeaderAndFooter_1() {
try {
tools.appendString(" ");
tools.putParamValue("showContainerIcons","false");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void createFormElement_1() {
	IUIComponentMetadata pg_form = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata hcMetdata = pzAuto.getUIComponentRuntime().createMetadata();
	pg_form.put("target",StringUtils.crossScriptingFilter(tools.getRootParamValue("target")));
	pg_form.put("pzHarnessID",tools.getParamValue("pzHarnessID"));
	pg_form.put("pzCTkn",tools.getCSRFToken(tools.getThread()));
	pg_form.put("pzBFP",((PegaAPI)tools).getBrowserFingerprint());
	if("".equals(tools.getParamValue("RenderSingle"))){
		pg_form.put("streamName","RuleForm");
		pg_form.put("RO",StringUtils.crossScriptingFilter(tools.getParamValue("ReadOnly")));
		pg_form.put("customErrorSection","DisplayRFHarnessErrors");
		pg_form.put("folderKey",StringUtils.crossScriptingFilter(tools.getParamValue("FolderKey")));
		pg_form.put("inputEnabled",String.valueOf(tools.hasInputEnabled()));
		pg_form.put("formPost",tools.getPrimaryPage().getProperty("pyFormPost").getEntryHandle());
		StringMap keys =  new HashStringMap();
		keys.putString("pxObjClass", "Rule-Obj-When");
		keys.putString("pyClassName", tools.getStepPage().getClassName());
		keys.putString("pyBlockName", "pyGeolocationTrackingIsEnabled");
		boolean isGeoTrackingEnabled = tools.evaluateWhen(keys);
		String strIsMDC = tools.getRootParamValue("isMDC");
		pg_form.put("isGeoEnabled",isGeoTrackingEnabled);
		if(isGeoTrackingEnabled) {
			pg_form.put("lat",tools.getThread().getRequestorPage().getProperty("pyLatitude").getEntryHandle());
			pg_form.put("latValue",tools.getThread().getRequestorPage().getProperty("pyLatitude").getStringValue());
			pg_form.put("long",tools.getThread().getRequestorPage().getProperty("pyLongitude").getEntryHandle());
			pg_form.put("longValue",tools.getThread().getRequestorPage().getProperty("pyLongitude").getStringValue());
		}
		pg_form.put("compData",tools.getPrimaryPage().getProperty("pySpecialtyComponentData").getEntryHandle());
		pg_form.put("fromActionURL",pzHarness.getBuilder().getFormActionURL("formaction"));
		pg_form.put("isMDC","true".equals(strIsMDC)?true:false);
		pzHarness.getBuilder().beginForm(pg_form);
		pzHarness.getBuilder().beginHarnessContent(hcMetdata);
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_2");
		}
		if(!"ACTION".equals(tools.getParamValue("HarnessMode"))){
try {
/* Include stream RULE-HTML-FRAGMENT FORMERRORMARKER #20180713T133243.506 GMT */
include_5();

} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		}
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		}
	}
	processHarnessContainers_1();
	if("".equals(tools.getParamValue("RenderSingle"))){
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_4");
		}
		if(!"ACTION".equals(tools.getParamValue("HarnessMode"))){
try {
/* Include stream RULE-HTML-FRAGMENT FORMERRORMARKER #20180713T133243.506 GMT */
include_5();

} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		}
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		}
		pzHarness.getBuilder().endHarnessContent(hcMetdata);
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_5");
		}
		pzAddCustomCSS2_1();
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		}
		pzHarness.getBuilder().endForm(pg_form);
	}
}
/**
 * Implements a pega:file tag.
 */private boolean _jspx_meth_pega_file__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:file */
com.pega.pegarules.jsptags.FileTag _jspx_th_pega_file_ = (com.pega.pegarules.jsptags.FileTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.FileTag.class);
_jspx_th_pega_file_.setPageContext(pageContext);
_jspx_th_pega_file_.setParent(mParentTag);
_jspx_th_pega_file_.setName(aName);
int _jspx_eval_pega_file_ = _jspx_th_pega_file_.doStartTag();
if (_jspx_th_pega_file_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_file_);
return false;
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__4(PageContext aPageContext, java.lang.String aType, java.lang.String aApp) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString(" ");
/*
 * Could not inline file tag because: name attribute is symbolic: "$save(runtimeToolSheet)"
 */if (_jspx_meth_pega_file__1(pageContext, "$save(runtimeToolSheet)")) {
	return true;
}
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__2(PageContext aPageContext, java.lang.String aType, java.lang.String aApp, boolean aMoveToEnd) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
_jspx_th_pega_static_.setMoveToEnd(aMoveToEnd);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString(" ");
	IStaticContentRuntime pzStatic__13 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__13.addBundle("pzpega_guide_staticbundle_script", "1182780405");
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
private boolean when_2() throws Throwable {
boolean whenResult_2 = pega.invokeWhen("pzIsExpressModeOverview", "", "");
return whenResult_2;
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__1(PageContext aPageContext, java.lang.String aType, java.lang.String aApp, boolean aMoveToEnd) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
_jspx_th_pega_static_.setMoveToEnd(aMoveToEnd);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString(" ");
	IStaticContentRuntime pzStatic__3 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__3.addBundle("pzpega_screen_cap_video_rec_script", "1222233152");
tools.appendString(" ");
	IStaticContentRuntime pzStatic__5 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__5.addBundle("pzpega_gapidentifier_staticbundle_script", "1219218484");
tools.appendString(" ");
	IStaticContentRuntime pzStatic__7 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__7.addBundle("pzpega_gapidentifier_smartfeedback_script", "1223347259");
tools.appendString(" ");
boolean whenResult_3 = pega.invokeWhen("pzIsExpressModeOverview", "", "");
	if (whenResult_3) {
tools.appendString(" ");
	IStaticContentRuntime pzStatic__9 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__9.addBundle("pzpega_awpanel_staticbundle_script", "1227869252");
tools.appendString(" ");
	IStaticContentRuntime pzStatic__11 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__11.addBundle("pzpega_panelhelper_staticbundle_script", "1189530634");
tools.appendString(" ");
	}
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__3(PageContext aPageContext, java.lang.String aType, java.lang.String aApp, boolean aMoveToEnd) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
_jspx_th_pega_static_.setMoveToEnd(aMoveToEnd);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString(" ");
	IStaticContentRuntime pzStatic__15 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__15.addBundle("pzpega_developer_assistant_staticbundle_script", "1222888508");
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
/**
 * OnlyOnce condition: DeveloperAssistant
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_3() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("DeveloperAssistant")) {
tools.appendString(" ");
if (_jspx_meth_pega_static__3(pageContext, "script", "webwb", true)) {
	return;
}
tools.appendString(" ");
}
}
private void performStream_4() throws Throwable {
 if( tools.getParamValue("topHarness").equals("yes") && !pzAuto.isMobile()){ 
   /*
   Evaluate the tools to see if any of the tools have been enabled.
   These parameters are used in the section to control the availability of the 
   tool so that When rules are not continually evaluated
   */ 
   
tools.appendString(" ");
if (!pega.isResearchMode() && !pega.checkOnlyOnce("GapIdentifier")) {
tools.appendString(" ");
boolean whenResult_1 = pega.invokeWhen("pyEnableAgileWorkbench", "", "");
	if (whenResult_1) {
tools.appendString(" ");
 pega_rules_utilities.pzRegisterActivity(tools,"Pega-Agile-SmartFeedback.pzSetExtensionInstalled");
               pega_rules_utilities.pzRegisterActivity(tools,"pzClearGapIdentifierPages");
               pega_rules_utilities.pzRegisterRefresh(tools,"SingleSection",null,"pzInitGapPanel",null,null);
               pega_rules_utilities.pzRegisterRefresh(tools,"SingleSection",null,"pzShowWorkItem",null,null);
               pega_rules_utilities.pzRegisterRefresh(tools,"SingleSection",null,"pzCreateWorkItemWrapper",null,null);
               pega_rules_utilities.pzRegisterRefresh(tools,"SingleSection",null,"pzRefreshAppOverview",null,null);
               pega_rules_utilities.pzRegisterRefresh(tools,"SingleSection",null,"pzShowWorkItemByFeature",null,null);
               
tools.appendString(" ");
if (_jspx_meth_pega_static__1(pageContext, "script", "webwb", true)) {
	return;
}
tools.appendString(" <script> </script> ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getProperty("pyPortal.pyCategory").getStringValue(), "workspace"))) {
tools.appendString(" ");
  tools.putParamValue("isAgileWorkbenchEnabled", "true");
           tools.putParamValue("displayRuntimeToolbar", "true"); 
tools.appendString(" ");
	}
tools.appendString(" ");
	}
tools.appendString(" ");
}
tools.appendString(" ");
boolean whenResult_4 = pega.invokeWhen("pyEnableApplicationGuide", "", "");
	if (whenResult_4) {
tools.appendString(" ");
 
         pega_rules_utilities.pzRegisterRefresh(tools,"SingleSection",null,"pzInitAppGuidePanelWrapper",null,null);
         
tools.appendString(" ");
if (_jspx_meth_pega_static__2(pageContext, "script", "webwb", true)) {
	return;
}
tools.appendString(" ");
  tools.putParamValue("isApplicationGuideEnabled", "true");
         tools.putParamValue("displayRuntimeToolbar", "true"); 
tools.appendString(" ");
	}
tools.appendString(" ");
boolean whenResult_5 = pega.invokeWhen("pyEnableUIInspector", "", "");
	if (whenResult_5) {
tools.appendString(" ");
  tools.putParamValue("isLiveUIEnabled", "true"); 
tools.appendString(" ");
boolean whenResult_6 = pega.invokeWhen("pyEnableUIInspectorButton", "", "");
	if (whenResult_6) {
tools.appendString(" ");
 tools.putParamValue("showLiveUIButton", "true");
                tools.putParamValue("displayRuntimeToolbar", "true"); 
tools.appendString(" ");
	}
tools.appendString(" ");
	}
tools.appendString(" ");
boolean whenResult_7 = pega.invokeWhen("pzEnableFVInspector", "", "");
	if (whenResult_7) {
tools.appendString(" ");
  tools.putParamValue("isLocalizationInspectorEnabled", "true");
             tools.putParamValue("displayRuntimeToolbar", "true"); 
tools.appendString(" ");
	}
tools.appendString(" ");
 /*   Express is a bit unigue. All other tools rely on the user having dev access so if
             they do not have access then do turn off the bar */ 
tools.appendString(" ");
boolean whenResult_8 = pega.invokeWhen("pzIsPegaExpress", "", "");
	if (whenResult_8) {
tools.appendString(" ");
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (((invokeWhenRule(tools, "pyDisplayExpressEditOptions"))) && ((invokeWhenRule(tools, "pyDisplayExpressTopBar")))))) {
tools.appendString(" ");
 tools.putParamValue("isEditOptionsEnabled", "true");
                     tools.putParamValue("displayRuntimeToolbar", "true"); 
tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || ((invokeWhenRule(tools, "pxUserHasDeveloperPortalAccess"))))) {
tools.appendString(" ");
  tools.putParamValue("displayRuntimeToolbar", "true"); 
tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" ");
  tools.putParamValue("displayRuntimeToolbar", "false"); 
tools.appendString(" ");
}
tools.appendString("  ");
	}
tools.appendString(" ");
onlyOnce_3();
tools.appendString(" </pega:when> ");
 /* Based on privialge for Express this does not rely on Dev Access */ 
tools.appendString(" ");
boolean whenResult_9 = pega.invokeWhen("pyEnableFunctionalTesting", "", "");
	if (whenResult_9) {
tools.appendString(" ");
  tools.putParamValue("isFunctionalTestingEnabled", "true");
                         tools.putParamValue("displayRuntimeToolbar", "true"); 
tools.appendString(" ");
	}
tools.appendString(" ");
 
                         /* Since the skin controls agile workbench and others we need to still include the skin even if toolbar is disabled */
                         if("true".equals(tools.getParamValue("displayRuntimeToolbar")) ||
                         "true".equals(tools.getParamValue("isAgileWorkbenchEnabled")) || 
                         "true".equals(tools.getParamValue("isLiveUIEnabled")) || 
                         "true".equals(tools.getParamValue("isApplicationGuideEnabled"))) {

                         /* If Agile Workbench or LiveUI is enabled - then load the 'pz-runtimetools' skin */   
                         ClipboardPage cp = tools.createPage("", "");
                         ParameterPage skinParamPage = new ParameterPage();
                         skinParamPage.putParamValue("pyAction","getStyleRuleName");
                         skinParamPage.putParamValue("pyActionStyleType","AppWork");

                         HashStringMap params = new HashStringMap();
                         params.putString("pxObjClass", "Rule-PortalSkin");
                         params.putString("pyPurpose", "pzruntime-tools");
                         tools.doAction(params, cp, skinParamPage );
                         String sAppWorkStyle = skinParamPage.getString("pyActionStyleRuleName");
                         if(tools.getRequestor().getTextOrientation() == PRRequestor.ORIENTATION_RIGHT_TO_LEFT) {
                         sAppWorkStyle = skinParamPage.getString("pyWorkStyle_rtl");
                         }
                         tools.putSaveValue("runtimeToolSheet", sAppWorkStyle + ".css");   
                         
tools.appendString(" ");
if (_jspx_meth_pega_static__4(pageContext, "style", "webwb")) {
	return;
}
tools.appendString(" ");
  }
                           } 
}
private static final Map oPropDefinitions_4 = null;
private static final Map oStreamProperties_4 = new HashMap();
static {
	oStreamProperties_4.put("pyRuleAvailable", "Final");
	oStreamProperties_4.put("pyCircumstanceDateProp", "");
	oStreamProperties_4.put("pyCircumstanceVal", "");
	oStreamProperties_4.put("pyMethodStatus", "Internal");
	oStreamProperties_4.put("pyClassName", "");
	oStreamProperties_4.put("pyCircumstanceProp", "");
	oStreamProperties_4.put("pzInsKey", "RULE-HTML-FRAGMENT PZRUNTIMETOOLSINCLUDE #20230618T001613.960 GMT");
	oStreamProperties_4.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_4.put("pyCircumstanceDate", "");
	oStreamProperties_4.put("pyRuleEnds", "");
	oStreamProperties_4.put("pyRuleStarts", "");
	oStreamProperties_4.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_4.put("pyXMLType", "");
	oStreamProperties_4.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_4.put("pyCorrType", "");
	oStreamProperties_4.put("pyStreamName", "pzRuntimeToolsInclude");
	oStreamProperties_4.put("pyRuleSetVersion", "08-23-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZRUNTIMETOOLSINCLUDE #20230618T001613.960 GMT
 */
private void include_4() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZRUNTIMETOOLSINCLUDE #20230618T001613.960 GMT	Pega-UIEngine:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZRUNTIMETOOLSINCLUDE #20230618T001613.960 GMT
 * Set up context.
 */
final String prevRuleKey_4 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZRUNTIMETOOLSINCLUDE #20230618T001613.960 GMT";final String prevClass_4 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_4 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_4);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_4);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_4)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_4();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_4);
	mStreamResponse.setJspBaseClass(prevClass_4);
	pz_CurrentRuleKey = prevRuleKey_4;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_4,true);
}
/* end RULE-HTML-FRAGMENT PZRUNTIMETOOLSINCLUDE #20230618T001613.960 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_3() throws Throwable {
}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Yes");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "Internal");
	oStreamProperties_3.put("pyClassName", "");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-FRAGMENT PZCPMTHEME #20180713T133243.621 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "pzCPMTheme");
	oStreamProperties_3.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZCPMTHEME #20180713T133243.621 GMT
 */
private void include_3() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZCPMTHEME #20180713T133243.621 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZCPMTHEME #20180713T133243.621 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZCPMTHEME #20180713T133243.621 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_3)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_3();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_3);
	mStreamResponse.setJspBaseClass(prevClass_3);
	pz_CurrentRuleKey = prevRuleKey_3;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_3,true);
}
/* end RULE-HTML-FRAGMENT PZCPMTHEME #20180713T133243.621 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
public void pzAddCustomCSS2_1() {
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getProperty(aParam1).getStringValue(), aParam2)));
}
private static final String[] showMeParams_1 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Yes", "", "Pega-EndUserUI", "08-01-01", "", "pyUnsupportedBrowserLoginMessage", "", "RULE-HTML-FRAGMENT PYUNSUPPORTEDBROWSERLOGINMESSAGE #20180713T134722.778 GMT" };
private void performStream_1() throws Throwable {
tools.appendString("<!doctype html>\n<html>\n<head>\n  <title>Unsupported browser</title>\n  <style>\n\t\thtml,\n\t\tbody {\n\t\t\theight: 100%;\n\t\t}\n\t\tbody {\n\t\t\tfont: 16px/1 \"Open Sans\", sans-serif;\n\t\t\tpadding: 0;\n\t\t\tmargin: 0;\n\t\t}\n\t</style>\n</head>\n<body>\n<div style=\"background:#06374A; height: 100%; width: 100%; position: fixed; z-index: 10000;\">\n  <div style=\"margin: 10% auto 0 auto; width: 780px;\">\n    <div style=\"font-size: 150px; line-height: normal; color: #fff; float:left; width: 130px\">:(</div>\n    <div style=\"float: left;margin-top: 15px; width: 650px\">\n      <div id=\"unsupportedbrowser\">\n        <p style=\"font-size: 16px; line-height: 1.45em; color: #fff; margin: 16px 0;\">You are using an unsupported browser. To access the Pega 7 Platform, use Google Chrome, Apple Safari, Mozilla Firefox or Microsoft Internet Explorer 11 or Edge.</p>\n      </div>\n      <div id=\"compatibilitymode\" style=\"display:none\">\n        <p style=\"font-size: 16px; line-height: 1.45em; color: #fff; margin: 16px 0;\">To access the Pega 7 Platform, disable compatibility mode by accessing the Compatibility View settings.</p>\n      </div>\n    </div>\n  </div>\n</div>\n\n<!--[if IE]>\n<script>\nvar msIEVersion = TridentVersion = 0;\nvar msie = navigator.userAgent.match(/MSIE (\\d+)/);\nif (msie) {\n\tmsIEVersion = parseInt(msie[1]);\n        TridentVersion = msIEVersion;\n}\nvar trident = navigator.userAgent.match(/Trident\\/(\\d+)/);\nif (trident) {\n\tTridentVersion = parseInt(trident[1], 10) + 4;\n}\n\nif(TridentVersion > 0 && msIEVersion > 0 && TridentVersion != msIEVersion ) {\n        document.getElementById(\"unsupportedbrowser\").style.display = 'none';\n        document.getElementById(\"compatibilitymode\").style.display = 'block';\n}\n</script>\n<![endif]-->\n</body>\n</html>");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-FRAGMENT PYUNSUPPORTEDBROWSERLOGINMESSAGE #20180713T134722.778 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-EndUserUI");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pyUnsupportedBrowserLoginMessage");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PYUNSUPPORTEDBROWSERLOGINMESSAGE #20180713T134722.778 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PYUNSUPPORTEDBROWSERLOGINMESSAGE #20180713T134722.778 GMT	Pega-EndUserUI:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PYUNSUPPORTEDBROWSERLOGINMESSAGE #20180713T134722.778 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PYUNSUPPORTEDBROWSERLOGINMESSAGE #20180713T134722.778 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
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
/* end RULE-HTML-FRAGMENT PYUNSUPPORTEDBROWSERLOGINMESSAGE #20180713T134722.778 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_1);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
public void updateClipboardModel_1() {
	StringMap parameters = new HashStringMap();
	parameters.putString("pyHarnessNameForUpdate","RuleForm");
	pzHarness.updateClipboardModels(parameters);
}
public void setHarnessConfigurations_1() {
	 tools.putSaveValue("bClientValidation", "true");
	tools.putParamValue("InHarness", "true");
	if(pzAuto.isAccessible()) tools.putSaveValue("bAccessible", "true");
	tools.putParamValue("FormError", "NONE");
	tools.putParamValue("FieldError", "");
	tools.putParamValue("AlwaysShowFormLevelErrors", "false");
	tools.putParamValue("KeepFixedVisible", "true"); 
	tools.putParamValue("pyCustomError", "DisplayRFHarnessErrors");
	tools.putParamValue("IgnoreDirty", "false");
	tools.putParamValue("enableTemplate", "default");
	pzHarness.getBuilder().setTarget();
}
public void pzAddHTMLHeader_1() {
try {
tools.appendString(" ");
 if(pega_uiengine_harness.pzDoctypeSupportedForBrowser(tools)) {
tools.appendString("<!DOCTYPE html>");
tools.putParamValue("inStandardsMode", true);
}

} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void pzAddHTMLMeta_1() {
try {
tools.appendString(" ");

	if(pzAuto.getBrowserUtils().isIE()){
tools.appendString(" ");
}
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pyMetaTags", null, null, null, null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
/**
 * OnlyOnce condition: pzPortalIcon
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("pzPortalIcon")) {
tools.appendString(" <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"");

// BinaryFileReference
tools.appendString("images/pzpegaicon32_13852824416.png!!.png");
tools.appendString("\"> <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"");

// BinaryFileReference
tools.appendString("images/pzpegaicon16_12739199918.png!!.png");
tools.appendString("\"> <link rel=\"shortcut icon\" href=\"images/pzPegaIcon.ico\"> ");
}
}
private void performStream_2() throws Throwable {
onlyOnce_1();
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
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-FRAGMENT PZPORTALICON #20180713T133243.831 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pzPortalIcon");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZPORTALICON #20180713T133243.831 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZPORTALICON #20180713T133243.831 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZPORTALICON #20180713T133243.831 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZPORTALICON #20180713T133243.831 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_2)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_2();

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
/* end RULE-HTML-FRAGMENT PZPORTALICON #20180713T133243.831 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * OnlyOnce condition: pzPortalFavIcon
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_2() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("pzPortalFavIcon")) {
/* Include stream RULE-HTML-FRAGMENT PZPORTALICON #20180713T133243.831 GMT */
include_2();

}
}
public void includeScripts_1() {
	String bRemoteCase = pzHarness.getBuilder().getParameterFromRootStackFrame("isRemoteCase");
	if(("").equals(bRemoteCase) || bRemoteCase == null) {
IStaticContentRuntime pzStatic__1 = pzAuto.getStaticBlock("script");
	pzStatic__1.addFile("zutilities_harness", "12209924327", "js");
	pzStatic__1.addFile("rf_ruleobjclassscript", "1490640012", "js");
pzStatic__1.emitContent();
	}
}
public void includeStyles_1() {
	pzAddCustomCSS2_1();
}
public void pzGenerateDocStatetrack_1() {
try {
if("yes".equals(tools.getParamValue("topHarness"))){com.pega.pegarules.pub.context.PRAuthorization auth = tools.getAuthorizationHandle();com.pega.pegarules.pub.util.PRSystemSettings syssettings = tools.getSystemSettings();boolean hasPriv = auth.havePrivilege ( tools.getThread(), "pxClientActivityTracking",  "@baseclass", null);String strHasSut = syssettings.getDynamic("Pega-Rules", "pzPegaSUT");if (hasPriv || "true".equals(strHasSut)) { 
tools.appendString("<div class='document-statetracker' data-state-busy-status='busy'></div>");
}} 
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void createPegaHarnessDIV_1() {
	IUIComponentMetadata pg_harnesscnt = pzAuto.getUIComponentRuntime().createMetadata();
	if("".equals(tools.getParamValue("RenderSingle"))){
		if(pzAuto.isInspectMode()){
			pg_harnesscnt.put("liveUI",pzHarness.getInspectorData());
		}
		pg_harnesscnt.put("streamName","RuleForm");
		pg_harnesscnt.put("className",pzAuto.getClassName());
		pg_harnesscnt.put("insHandle",pzAuto.getHandle());
		pg_harnesscnt.put("primaryPageClass",tools.getStepPage().getClassName());
		if("true".equals(pzHarness.getBuilder().getParameterFromRootStackFrame("isRemoteCase"))){
			pg_harnesscnt.put("thread",tools.getThread().getName());
		}if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
			pg_harnesscnt.put("primaryPage",tools.getPrimaryPage() == null ? "" : tools.getPrimaryPage().getName());
		} else {
			pg_harnesscnt.put("JSRCompliant",false);
		}
		pzHarness.getBuilder().beginHarnessDIV(pg_harnesscnt);
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_1");
		}
		tools.appendString("<div id='HEADER_BUTTON_HTML' style='display:none'>");
		pzGenerateHarnessHeaderAndFooter_1();
		tools.appendString(" </div>");
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		}
		tools.putParamValue("headerButtonsAdded","false");
	}
	createFormElement_1();
	if("".equals(tools.getParamValue("RenderSingle"))){
		pzHarness.getBuilder().endHarnessDIV(pg_harnesscnt);
	}
}
public void includePortalPanel_1(String position) {
	if(pzHarness.getBuilder().hasLayout(position)){
		ClipboardProperty cp_Layout = pzHarness.getBuilder().getLayout(position);
		pzHarness.getBuilder().createPortalChrome(cp_Layout,position,true, pzHarness.getInspectorDataForPanel(position));
		if(cp_Layout != null && cp_Layout.getPageValue().getBoolean("pyHasDynamicContainer")){
			createPegaHarnessDIV_1();
		}else{
	pzHarness.getBuilder().includePanelSection(cp_Layout);
}
pzHarness.getBuilder().createPortalChrome(cp_Layout,position,false, null);
}
}
public void includePegaHarnessContent_1() {
	if(pzHarness.getBuilder().isSDMSelfNavigation()){
		pzHarness.getBuilder().createHTMLElementForDataModel();
		ClipboardProperty pyLayouts = pzHarness.getBuilder().getPortalLayout();
		if(pyLayouts != null){
			pzHarness.getBuilder().createPortalChrome(null,"MAIN",true, pzHarness.getInspectorData());
			includePortalPanel_1("TOP");
			includePortalPanel_1("LEFT");
			includePortalPanel_1("CENTER");
			includePortalPanel_1("RIGHT");
			includePortalPanel_1("BOTTOM");
			pzHarness.getBuilder().createPortalChrome(null,"MAIN",false, null);
		}else{
			createPegaHarnessDIV_1();
		}
	}else{
		createPegaHarnessDIV_1();
	}
}
public void pzGenerateElementModel_1() {
try {
elementModel_1();
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void buildHarnessMarkup_1() {
	if(!pzHarness.getBuilder().canProcessStream()){
		return;
	}
	pzHarness.getBuilder().setTools();
	pzHarness.getBuilder().setAutoStream();
	if("true".equals(tools.findPage("pxRequestor").getString("pxIsUnsupportedBrowser"))) {
try {
/* Include stream RULE-HTML-FRAGMENT PYUNSUPPORTEDBROWSERLOGINMESSAGE #20180713T134722.778 GMT */
include_1();

} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		return;
	}
	String hID = pzAuto.createActionRequestRegistrar();
	tools.putParamValue("pzHarnessID",hID);
	pzHarness.resetQueryStringRegistration();
	pzHarness.getBuilder().setMashupProperty();
	pzHarness.setAjaxContainerProperties();
	pzHarness.getBuilder().initHarnessTracker();
	updateClipboardModel_1();
	setHarnessConfigurations_1();
	boolean pxIsMobileClient = pega.getUIEngine().getWhenEvaluator().evaluate("pxIsMobileClient");
		boolean isOfflineMobileClient = pzAuto.isOffline() && pxIsMobileClient;
			boolean isPMCScriptInclusion = pzAuto.isOffline() && pxIsMobileClient && !"true".equals(tools.getParamValue("isForPackagingTempWorkPage"));
			if(isOfflineMobileClient) {
			pzAuto.enableCacheManifest();
			}
			if("".equals(tools.getParamValue("RenderSingle"))){
				if("true".equals(tools.getParamValue("EnableDirectStreaming"))){
					pega.enableDirectStreaming();
				}
				if(!(pzAuto.isOffline() && pega.getPackageRuntime().canPackage()) || isPMCScriptInclusion){
					pzAddHTMLHeader_1();
					tools.appendString("<html lang=\"");
					tools.appendString(tools.findPage("pxRequestor").getString("pxReqLocale").replace("_", "-"));
					tools.appendString("\"class=\"");
					tools.appendString(pzHarness.getBuilder().getClassStringForHeader());
					tools.appendString("\"");
					if(pzAuto.isOrientationRTL()){
					tools.appendString(" dir=\"rtl\"");
					}tools.appendString("><head>");
					pzAddHTMLMeta_1();
					tools.appendString("<title>");
					tools.appendString(pzHarness.getBuilder().getTitle("RuleForm",true));
					tools.appendString("</title>");
try {
	if (when_1("pxThread.pxLimitedAccess", "Dev")) {
onlyOnce_2();
	}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
				}else{
					tools.putParamValue("inStandardsMode", true);
				}
				boolean UseCompactStylesforPDF = tools.getParamAsBoolean(ImmutablePropertyInfo.MODE_STRING, "UseCompactStylesforPDF"); 
				if(!(pzAuto.isOffline() && pega.getPackageRuntime().canPackage()) || isPMCScriptInclusion) {
					pzHarness.getBuilder().setTemplatingStatus("default");
				}
				if(!(pzAuto.isOffline() && pega.getPackageRuntime().canPackage()) || isPMCScriptInclusion) {
					if(!UseCompactStylesforPDF){ 
try {
pzAuto.emitIncludeStreamReference("WorkFormStandard", null, null, null, null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
					}else{ 
try {
pzAuto.emitIncludeStreamReference("pzCompactPDFStyles", null, null, null, null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
					} 
				}
				pzAuto.getUIComponentRuntime().enableScriptCapturing();
				includeScripts_1();
				tools.appendString(pzHarness.getBuilder().processPortalHarness());
				pzAuto.getUIComponentRuntime().disableScriptCapturing();
				includeStyles_1();
				if(!(pzAuto.isOffline() && pega.getPackageRuntime().canPackage()) || isPMCScriptInclusion) {
try {
/* Include stream RULE-HTML-FRAGMENT PZCPMTHEME #20180713T133243.621 GMT */
include_3();

} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
try {
/* Include stream RULE-HTML-FRAGMENT PZRUNTIMETOOLSINCLUDE #20230618T001613.960 GMT */
include_4();

} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
				}
				if(!(pzAuto.isOffline() && pega.getPackageRuntime().canPackage()) || isPMCScriptInclusion) {
					tools.appendString(pzHarness.getCanonicalElement());
					tools.appendString("</head>");
					pega.flushToBrowser();
					tools.appendString("<body class=\"harnessBody");
					if(pzHarness.getBuilder().isSDMSelfNavigation()){
					tools.appendString(" screen-layout-body with-fixed-header ");
					}
					tools.appendString("\"");
					if("true".equals(tools.getParamValue("isDcStretch"))){
					tools.appendString(" style=\"overflow-y:hidden;\" ");
					}
					if(pzAuto.isOffline()){
					tools.appendString(" ng-app=\"PegaOffline\" ng-controller=\"OfflineController\"");
					}
					if(pzHarness.getBuilder().isSDMSelfNavigation()){
					tools.appendString(" onload=\"screenLayoutResize\"");
					} else {
					tools.appendString(" onload=\"checkContainersExpanded();\" onresize=\"doHarnessResize()\"");
					}
					tools.appendString(">");
					pzHarness.getBuilder().includeSkipLinks();
				} else {
try {
/* Include stream RULE-HTML-FRAGMENT PZCPMTHEME #20180713T133243.621 GMT */
include_3();

} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
				}
				pzGenerateDocStatetrack_1();
				if(pzHarness.canRecoverPassivatedData()){
					((PegaAPI)tools).getUIEngine().getDCInstance().createDataModel();
					tools.appendString(pzHarness.getHAMessage());
				}
				if(pzHarness.shouldSendAssociateReqData()){
					tools.appendString(pzHarness.getBuilder().getAssociateRequestorDataModel());
				}
				tools.appendString(pzHarness.getFormErrorMarkerDiv());
				tools.appendString("<script>pega.u.d.pyStreamNameForGadget=\"");
				tools.appendString(pzAuto.getRuleName());
				tools.appendString("\";</script>");
				pzAuto.getSection().includeShowMeHarnessInsert();
			}
			includePegaHarnessContent_1();
			pzGenerateElementModel_1();
			tools.putSaveValue("AutoDocInfoInclude", "true");
			pzHarness.getBuilder().includeLazyLoadInfo();
			if("".equals(tools.getParamValue("RenderSingle"))){
try {
boolean whenResult_11 = pega.invokeWhen("recordEvent", "", "");
	if (whenResult_11) {
/* Include stream RULE-HTML-FRAGMENT PYINCLUDEUWT #20180713T133243.549 GMT */
include_6();

	}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
				String iconPath = pega_processengine_workutilities.pxGetWorkIcon(tools);
				if(iconPath != null && !iconPath.equals("")) {
					tools.appendString("<ins id=\"WAIcon\" data-WAIcon=\"");
					tools.appendString(iconPath);
					tools.appendString("\" style=\"display:none;\" ></ins>");
				}
				if(pzAuto.hasStaticContentJSOptimization()){
					if(pzAuto.doOnlyOnce("IncludeOptimizedStaticContentMiddle")){
try {
/* Include stream RULE-HTML-FRAGMENT PZOPTIMIZEDMIDDLESTATICCONTENT #20180713T133243.803 GMT */
include_8();

} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
					}
				}
try {
/* Include stream RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT */
include_9();

} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
				if(!"true".equals(tools.getParamValue("skipTrackerChanges"))){
					pzHarness.getBuilder().includeChangeTrackerContent();
				}
				if(pzAuto.getUIComponentRuntime().getScriptLoader().isTemplateScriptReorderEnabled()){
					pzAuto.getUIComponentRuntime().getScriptLoader().emitTemplateDeferedScripts();
				}
				if(pzAuto.hasStaticContentJSOptimization()){
					if(pzAuto.doOnlyOnce("IncludeOptimizedStaticContentBottom")){
try {
/* Include stream RULE-HTML-FRAGMENT PZOPTIMIZEDBOTTOMSTATICCONTENT #20210112T172931.878 GMT */
include_10();

} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
					}
				}
try {
/* Include stream RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT */
include_16();

} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
				if(!pzAuto.getUIComponentRuntime().getScriptLoader().isTemplateScriptReorderEnabled()){
					pzAuto.getUIComponentRuntime().getScriptLoader().emitTemplateDeferedScripts();
				}
				if(!(pzAuto.isOffline() && pega.getPackageRuntime().canPackage()) || isPMCScriptInclusion){
try {
/* Include stream RULE-HTML-FRAGMENT PZHARNESSBODYSCRIPTS #20180713T133243.683 GMT */
include_18();

} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
					tools.appendString("</body></html>");
					if(isOfflineMobileClient && pega.getPackageRuntime().canPackage()) {
					String portalAndAppDataIncludeUrl = tools.getSaveValue("portalAndAppDataIncludeURL");
						pzAuto.addCacheManifestURL(portalAndAppDataIncludeUrl);
						String manifestURLs = pzAuto.getCacheManifestURLs();
						pega.getPackageRuntime().packageHarnessStaticAssets(manifestURLs);
					}
				}
			}
		}
private void performStream_17() throws Throwable {
buildHarnessMarkup_1();
}
private static final Map oPropDefinitions_19 = null;
private static final Map oStreamProperties_19 = new HashMap();
static {
	oStreamProperties_19.put("pyRuleAvailable", "Final");
	oStreamProperties_19.put("pyCircumstanceDateProp", "");
	oStreamProperties_19.put("pyCircumstanceVal", "");
	oStreamProperties_19.put("pyMethodStatus", "Internal");
	oStreamProperties_19.put("pyClassName", "Rule-Obj-Class");
	oStreamProperties_19.put("pyCircumstanceProp", "");
	oStreamProperties_19.put("pzInsKey", "RULE-HTML-HARNESS RULE-OBJ-CLASS RULEFORM #20180713T135119.536 GMT");
	oStreamProperties_19.put("pxObjClass", "Rule-HTML-Harness");
	oStreamProperties_19.put("pyCircumstanceDate", "");
	oStreamProperties_19.put("pyRuleEnds", "");
	oStreamProperties_19.put("pyRuleStarts", "");
	oStreamProperties_19.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_19.put("pyXMLType", "");
	oStreamProperties_19.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_19.put("pyCorrType", "");
	oStreamProperties_19.put("pyStreamName", "RuleForm");
	oStreamProperties_19.put("pyRuleSetVersion", "08-01-01");
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public void cleanForReuse(PegaAPI aContext) {
	tools = (StreamBuilderToolKit)aContext;
	pega = (com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext;
	if( pega != null ) {
		pzAuto = pega.getAutoStreamRuntime();
	pzHarness = pzAuto.getHarness();
	pzSection = pzAuto.getSection();
	pzLayout = pzSection.getLayout();
	pzCell = pzLayout.getCell();
	pzControl = pzCell.getControl();
	pzPackageRuntime = pega.getPackageRuntime();
	}
	else {
		pzAuto = null;
	}
	mParentTag = null;
	mStreamResponse = (JSPResponse) tools;
	mHttpServlet = aContext == null ? null : (HttpServlet) aContext.getHttpServlet();
	request = aContext == null ? null : (HttpServletRequest)aContext.getHttpServletRequest();
	mParentStreamProperties = null;
	pz_CurrentRuleKey = null;
	if( pega != null ) pega.setTrackMissingProperties("Rule-HTML-Harness");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_16 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT", "@baseclass pyDomainOverride", "Pega-UIEngine", "08-01-01", "20180713T133322.219 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_17 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZHARNESSBODYSCRIPTS #20180713T133243.683 GMT", "pzHarnessBodyScripts", "Pega-UIEngine", "08-01-01", "20180713T133243.683 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_18 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PYBODYSCRIPTSEXTENSION #20180713T133243.534 GMT", "pyBodyScriptsExtension", "Pega-UIEngine", "08-01-01", "20180713T133243.534 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_8 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PEGACOMPOSITECONFIG #20200721T210858.505 GMT", "PegaCompositeConfig", "Pega-ProCom", "08-06-01", "20200721T210858.505 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_7 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZOPTIMIZEDMIDDLESTATICCONTENT #20180713T133243.803 GMT", "pzOptimizedMiddleStaticContent", "Pega-UIEngine", "08-01-01", "20180713T133243.803 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_9 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT", "@baseclass pzOnlyOnceChanges", "Pega-UIEngine", "08-01-01", "20180713T133322.434 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_4 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZRUNTIMETOOLSINCLUDE #20230618T001613.960 GMT", "pzRuntimeToolsInclude", "Pega-UIEngine", "08-23-01", "20230618T001613.960 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_3 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZCPMTHEME #20180713T133243.621 GMT", "pzCPMTheme", "Pega-UIEngine", "08-01-01", "20180713T133243.621 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_6 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PYINCLUDEUWT #20180713T133243.549 GMT", "pyIncludeUWT", "Pega-UIEngine", "08-01-01", "20180713T133243.549 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_5 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT FORMERRORMARKER #20180713T133243.506 GMT", "FormErrorMarker", "Pega-UIEngine", "08-01-01", "20180713T133243.506 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-HARNESS RULE-OBJ-CLASS RULEFORM #20180713T135119.536 GMT", "Rule-Obj-Class RuleForm", "Pega-Desktop", "08-01-01", "20180713T135119.536 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZPORTALICON #20180713T133243.831 GMT", "pzPortalIcon", "Pega-UIEngine", "08-01-01", "20180713T133243.831 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_10 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZOPTIMIZEDBOTTOMSTATICCONTENT #20210112T172931.878 GMT", "pzOptimizedBottomStaticContent", "Pega-UIEngine", "08-06-01", "20210112T172931.878 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PYUNSUPPORTEDBROWSERLOGINMESSAGE #20180713T134722.778 GMT", "pyUnsupportedBrowserLoginMessage", "Pega-EndUserUI", "08-01-01", "20180713T134722.778 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_11 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT", "DocumentInfo", "Pega-UIEngine", "08-01-01", "20180713T133243.503 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_12 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT", "@baseclass pzClientDynamicDataBottom", "Pega-UIEngine", "08-07-01", "20210618T153855.616 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_13 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT", "pzDeclareExpressionDeferred", "Pega-UIEngine", "08-01-01", "20180713T133243.626 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_14 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT", "@baseclass pzIncludeSkeletons", "Pega-UIEngine", "08-01-01", "20180713T133322.374 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_15 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT", "pzIncludeWebAnalyticsDI", "Pega-UIEngine", "08-01-01", "20180713T133243.745 GMT");
}
