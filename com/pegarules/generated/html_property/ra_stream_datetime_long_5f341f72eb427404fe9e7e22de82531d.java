package com.pegarules.generated.html_property;
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
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream DATETIME-LONG.
 */
public class ra_stream_datetime_long_5f341f72eb427404fe9e7e22de82531d extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.DateTime_Long.Stream");
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
	public ra_stream_datetime_long_5f341f72eb427404fe9e7e22de82531d(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "e57f5c4ff2d98a26ce9b92476bb411f718ba7529";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
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
/* Instance RULE-HTML-PROPERTY DATETIME-LONG #20180713T132011.187 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY DATETIME-LONG #20180713T132011.187 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY DATETIME-LONG #20180713T132011.187 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_10();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
}
/* end RULE-HTML-PROPERTY DATETIME-LONG #20180713T132011.187 GMT */
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
	"Rule-Obj-FieldValue:PYCAPTION!MONTH", 
	"Rule-Obj-FieldValue:PYCAPTION!AM OR PM", 
	"Rule-Obj-FieldValue:PYMESSAGELABEL!LOADING...", 
	"Rule-Obj-FieldValue:PYACTIONPROMPT!CALENDAR", 
	"Rule-Obj-FieldValue:PYCAPTION!MINUTE", 
	"Rule-Obj-FieldValue:PYCAPTION!YEAR", 
	"Rule-Obj-FieldValue:PYCAPTION!DAY", 
	"Rule-Obj-FieldValue:PYCAPTION!HOUR", 
	"Rule-File-Text:WEBWB!DATETIMECALENDAR!JS", 
	"Rule-File-Text:WEBWB!SMARTINFOPOPUP!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_SMARTINFO!JS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:PZSETSTRLOADMSG", 
	"Rule-HTML-Fragment:SMARTINFOPOPUPINCLUDE", 
	"Rule-File-Bundle:PEGA_UI_DATETIMECALENDAR!SCRIPT", 
	"Rule-Obj-Property:PYMESSAGELABEL", 
	"Rule-Obj-Property:PYCAPTION", 
	"Rule-Obj-Property:PYACTIONPROMPT", 
	"Rule-HTML-Property:DATETIME", 
	"Rule-HTML-Property:SELECTDATETIME", 
	"Rule-HTML-Property:SELECTDATE", 
	"Rule-HTML-Property:STARTSMARTFIELD", 
	"Rule-HTML-Property:MESSAGES", 
	"Rule-HTML-Property:ENDSMARTFIELD", 
	"Rule-HTML-Property:DATETIME-LONG", 
	"Rule-HTML-Property:CLIENTVALIDATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYCAPTION!MONTH","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-Gadgets","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!MONTH #20180713T133515.829 GMT","!PYCAPTION!MONTH",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYCAPTION!AM OR PM","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-Gadgets","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!AM OR PM #20180713T133515.739 GMT","!PYCAPTION!AM OR PM",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYMESSAGELABEL!LOADING...","Rule-Obj-FieldValue","@BASECLASS",true,"Code-Pega-Requestor","Pega-WB","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYMESSAGELABEL!LOADING... #20180713T131654.066 GMT","!PYMESSAGELABEL!LOADING...",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PYACTIONPROMPT!CALENDAR","Rule-Obj-FieldValue","@BASECLASS",true,"Code-Pega-Requestor","Pega-WB","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYACTIONPROMPT!CALENDAR #20180713T131646.140 GMT","!PYACTIONPROMPT!CALENDAR",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PYCAPTION!MINUTE","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-Gadgets","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!MINUTE #20180713T133515.819 GMT","!PYCAPTION!MINUTE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYCAPTION!YEAR","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-Gadgets","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!YEAR #20180713T133515.872 GMT","!PYCAPTION!YEAR",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYCAPTION!DAY","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-Reporting","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!DAY #20180713T134231.552 GMT","!PYCAPTION!DAY",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYCAPTION!HOUR","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-Gadgets","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!HOUR #20180713T133515.779 GMT","!PYCAPTION!HOUR",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("WEBWB!DATETIMECALENDAR!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB DATETIMECALENDAR!JS #20210803T090836.697 GMT","WEBWB!DATETIMECALENDAR!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!SMARTINFOPOPUP!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB SMARTINFOPOPUP!JS #20180713T133429.322 GMT","WEBWB!SMARTINFOPOPUP!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_SMARTINFO!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_UI_SMARTINFO!JS #20200214T063824.395 GMT","WEBWB!PZPEGA_UI_SMARTINFO!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZSETSTRLOADMSG","Rule-HTML-Fragment","",false,"","Pega-Gadgets","08-05-01","RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT","PZSETSTRLOADMSG",true,false,"ABSOLUTE_CLASSLESS",896523198), 
		new DependentRuleInfo("SMARTINFOPOPUPINCLUDE","Rule-HTML-Fragment","",false,"","Pega-Gadgets","08-05-01","RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT","SMARTINFOPOPUPINCLUDE",true,false,"ABSOLUTE_CLASSLESS",623244020), 
		new DependentRuleInfo("PEGA_UI_DATETIMECALENDAR!SCRIPT","Rule-File-Bundle","",false,"","Pega-Gadgets","","RULE-FILE-BUNDLE PEGA_UI_DATETIMECALENDAR SCRIPT #20180713T133422.036 GMT","PEGA_UI_DATETIMECALENDAR!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PYMESSAGELABEL","Rule-Obj-Property","@BASECLASS",true,"Code-Pega-Requestor","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYMESSAGELABEL #20180713T131842.875 GMT","!PYMESSAGELABEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYCAPTION","Rule-Obj-Property","@BASECLASS",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT","!PYCAPTION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1), 
		new DependentRuleInfo("PYACTIONPROMPT","Rule-Obj-Property","@BASECLASS",true,"Code-Pega-Requestor","Pega-WB","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYACTIONPROMPT #20180713T131448.855 GMT","!PYACTIONPROMPT",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("DATETIME","Rule-HTML-Property","",false,"","Pega-Gadgets","08-05-01","RULE-HTML-PROPERTY DATETIME #20200616T140954.638 GMT","DATETIME",true,false,"ABSOLUTE_CLASSLESS",1778431339), 
		new DependentRuleInfo("SELECTDATETIME","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY SELECTDATETIME #20180713T133438.043 GMT","SELECTDATETIME",true,false,"ABSOLUTE_CLASSLESS",950045572), 
		new DependentRuleInfo("SELECTDATE","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY SELECTDATE #20180713T133438.035 GMT","SELECTDATE",true,false,"ABSOLUTE_CLASSLESS",1801728475), 
		new DependentRuleInfo("STARTSMARTFIELD","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT","STARTSMARTFIELD",true,false,"ABSOLUTE_CLASSLESS",-1437336844), 
		new DependentRuleInfo("MESSAGES","Rule-HTML-Property","",false,"","Pega-UIDesign","08-01-01","RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT","MESSAGES",true,false,"ABSOLUTE_CLASSLESS",-794757422), 
		new DependentRuleInfo("ENDSMARTFIELD","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT","ENDSMARTFIELD",true,false,"ABSOLUTE_CLASSLESS",1047137300), 
		new DependentRuleInfo("DATETIME-LONG","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY DATETIME-LONG #20180713T132011.187 GMT","DATETIME-LONG",true,false,"ABSOLUTE_CLASSLESS",1077546225), 
		new DependentRuleInfo("CLIENTVALIDATION","Rule-HTML-Property","",false,"","Pega-UIEngine","08-02-01","RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT","CLIENTVALIDATION",true,false,"ABSOLUTE_CLASSLESS",1287463259)
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
//	RULE-HTML-PROPERTY DATETIME-LONG #20180713T132011.187 GMT:20180713T132011.187 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY DATETIME #20200616T140954.638 GMT:20200616T140954.638 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT:20180713T133438.113 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT:20200428T081054.428 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_SMARTINFO!JS #20200214T063824.395 GMT:20200515T154936.126 GMT
//	RULE-FILE-TEXT WEBWB SMARTINFOPOPUP!JS #20180713T133429.322 GMT:20180713T133429.322 GMT
//	RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT:20200428T081054.535 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYMESSAGELABEL #20180713T131842.875 GMT:20180713T131842.875 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYMESSAGELABEL!LOADING... #20180713T131654.066 GMT:20180713T131654.066 GMT
//	RULE-HTML-PROPERTY SELECTDATETIME #20180713T133438.043 GMT:20180713T133438.043 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT:20181008T083757.252 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT:20180713T133634.985 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!YEAR #20180713T133515.872 GMT:20180713T133515.872 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!MONTH #20180713T133515.829 GMT:20180713T133515.829 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!DAY #20180713T134231.552 GMT:20180713T134231.552 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!HOUR #20180713T133515.779 GMT:20180713T133515.779 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!MINUTE #20180713T133515.819 GMT:20180713T133515.819 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!AM OR PM #20180713T133515.739 GMT:20180713T133515.739 GMT
//	RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT:20180713T132011.328 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY SELECTDATE #20180713T133438.035 GMT:20180713T133438.035 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYACTIONPROMPT #20180713T131448.855 GMT:20180713T131448.855 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYACTIONPROMPT!CALENDAR #20180713T131646.140 GMT:20180713T131646.140 GMT
//	RULE-FILE-BUNDLE PEGA_UI_DATETIMECALENDAR SCRIPT #20180713T133422.036 GMT:20180713T133422.036 GMT
//	RULE-FILE-TEXT WEBWB DATETIMECALENDAR!JS #20210803T090836.697 GMT:20210803T090836.697 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYACTIONPROMPT #20180713T131448.855 GMT:20180713T131448.855 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYACTIONPROMPT!CALENDAR #20180713T131646.140 GMT:20180713T131646.140 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "9c7680f4fc4739da3dad0b6f42725069";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a pega:url tag.
 */private boolean _jspx_meth_pega_url__1(PageContext aPageContext, java.lang.String aValue) throws Throwable {
/* pega:url */
com.pega.pegarules.jsptags.UrlTag _jspx_th_pega_url_ = (com.pega.pegarules.jsptags.UrlTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.UrlTag.class);
_jspx_th_pega_url_.setPageContext(pageContext);
_jspx_th_pega_url_.setParent(mParentTag);
_jspx_th_pega_url_.setValue(aValue);
int _jspx_eval_pega_url_ = _jspx_th_pega_url_.doStartTag();
if (_jspx_th_pega_url_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_url_);
return false;
}
private static final String[] showMeParams_10 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Property", "Final", "", "Pega-Gadgets", "08-01-01", "", "SelectDate", "", "RULE-HTML-PROPERTY SELECTDATE #20180713T133438.035 GMT" };
private void performStream_8() throws Throwable {

boolean HP_DT_ShowTime = false;
if(tools.getActive().getType() == PropertyInfo.TYPE_DATE)
	HP_DT_ShowTime = false; //tools.putParamValue( "WithTime", "true" );
else if (tools.getActive().getType() == PropertyInfo.TYPE_DATETIME)
{
	if (tools.getParamValue("WithTime").length() == 0)
		HP_DT_ShowTime = true;
	else
		HP_DT_ShowTime = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"WithTime");
}


String userLocale = tools.findPage("pxRequestor").getString("pxReqLocale");

String localeParts[] = userLocale.split("_");
String language  = localeParts[0];
String country  = localeParts[1];


java.util.Locale myLocaleA = new java.util.Locale(language, country);


String datePattern = ((java.text.SimpleDateFormat) java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT, myLocaleA)).toPattern();


String datePatternParts[] = datePattern.split("/");


String firstDatePattern  = datePatternParts[0].substring(0,1);  

//date pattern to use default to month first

String useDatePattern = "M";

//Does the locale date Pattern start with day?
if (firstDatePattern.length() > 0 && firstDatePattern.equalsIgnoreCase("D")){
//dd/mm/yyyy format
useDatePattern = "D";
}

// not needed as we default to M 
//if (firstDatePattern.length() > 0 && firstDatePattern.equalsIgnoreCase("M")){
//M is first in locale so mm/dd/yyyy format
//useDatePattern = "M";
//}

//Does the locale date Pattern start with year?
if (firstDatePattern.length() > 0 && firstDatePattern.equalsIgnoreCase("Y")){
//yyyy/mm/dd format
useDatePattern = "Y";
}

tools.appendString("\n\n\n");
	boolean foundChoice_12 = false;
tools.appendString("\n\t");
if (!foundChoice_12 && (pega.isPreviewMode() || HP_DT_ShowTime && tools.getActive().getType() == PropertyInfo.TYPE_DATETIME)) {
tools.appendString("\n");


ClipboardProperty curProp = tools.getActive();
if ( (curProp.getType() == PropertyInfo.TYPE_DATETIME || curProp.getType() == PropertyInfo.TYPE_DATE) && curProp.size() > 0 && curProp.hasValidValue() && curProp.toDate()!=null)  {
	String sDatetime="";
	String type = tools.getParamValue("DateTimeFormat");
	String strTimeZone = tools.findPage("pxRequestor").getString(".pyUseTimeZone");	
	sDatetime = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATETIME_SHORT_YYYY, curProp.toDate()); 
	tools.putSaveValue("result",sDatetime); 
}
else {
	tools.putSaveValue("result",tools.getActiveValue()); 
}


tools.appendString("\n");

foundChoice_12 = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice_12) {
tools.appendString("\n");

ClipboardProperty curProp = tools.getActive();
if ( (curProp.getType() == PropertyInfo.TYPE_DATE || curProp.getType() == PropertyInfo.TYPE_DATETIME) && curProp.size() > 0 && curProp.hasValidValue() && curProp.toDate()!=null)  {

	String sDate=PRDateFormat.format(null, "GMT", PRDateFormat.DEFAULT_DATE_SHORT_YYYY , curProp.toDate()); 
	tools.putSaveValue("result",sDate); 
}
else {
	tools.putSaveValue("result",tools.getActive().getStringValue()); 
}

tools.appendString("\n");
}
tools.appendString("\n\n\n");
	boolean foundChoice_13 = false;
tools.appendString("\n");
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString("\n\n");
 String requiredfield=""; 
tools.appendString("\n");
	boolean foundChoice_14 = false;
tools.appendString("\n");
if (!foundChoice_14 && (pega.isPreviewMode() || (areValsEqual(tools.getParamValue("pega_validation"), "required")))) {
boolean whenResult_2 = pega.invokeWhen("UseAccessibleDate", "", "");
	if (whenResult_2) {
 requiredfield= " Required"; 
	}
tools.appendString(" ");

foundChoice_14 = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice_14) {
 requiredfield = ""; 
tools.appendString(" ");
}
tools.appendString("\n\n\n\n<input ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_4();

tools.appendString(" type =\"text\" id=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyPropertyName)")) {
	return;
}
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" \nvalue=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(result)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(result)")) {
	return;
}
tools.appendString("\" style=\"display:none\">\n\n");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_5();

tools.appendString("\n\n<!-- mm dd yyyy is default-->\n\n");
	if (pega.isPreviewMode() || useDatePattern.equalsIgnoreCase("M")) {
tools.appendString("\n\n<select style=\"width:auto\" title=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyLabel)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyLabel)")) {
	return;
}
tools.appendString(" - Month");
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel\" onchange=\"MonLenDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("','");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel', '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel' , '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel')\"><option>?</select> &nbsp;\n<select  style=\"width:auto\" title=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyLabel)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyLabel)")) {
	return;
}
tools.appendString(" - Day");
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel\" onchange=\"FormDateForDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("')\"><option>?</select> &nbsp;\n<select style=\"width:auto\" id=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyPropertyName)")) {
	return;
}
tools.appendString("\" title=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyLabel)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyLabel)")) {
	return;
}
tools.appendString(" - Year");
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel\" onchange=\"MonLenDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("','");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel', '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel' , '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel')\"><option>?</select>\n\n");
	}
tools.appendString("\n\n<!-- dd mm yyyy -->\n");
	if (pega.isPreviewMode() || useDatePattern.equalsIgnoreCase("D")) {
tools.appendString("\n\n<select style=\"width:auto\" title=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyLabel)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyLabel)")) {
	return;
}
tools.appendString(" - Day");
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel\" onchange=\"FormDateForDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("')\"><option>?</select> &nbsp;\n<select style=\"width:auto\" title=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyLabel)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyLabel)")) {
	return;
}
tools.appendString(" - Month");
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel\" onchange=\"MonLenDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("','");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel', '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel' , '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel')\"><option>?</select> &nbsp;\n<select style=\"width:auto\" id=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyPropertyName)")) {
	return;
}
tools.appendString("\" title=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyLabel)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyLabel)")) {
	return;
}
tools.appendString(" - Year");
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel\" onchange=\"MonLenDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("','");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel', '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel' , '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel')\"><option>?</select>\n\n");
	}
tools.appendString("\n\n<!-- yyyy mm dd-->\n");
	if (pega.isPreviewMode() || useDatePattern.equalsIgnoreCase("Y")) {
tools.appendString("\n\n<select style=\"width:auto\" id=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyPropertyName)")) {
	return;
}
tools.appendString("\" title=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyLabel)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyLabel)")) {
	return;
}
tools.appendString(" - Year");
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel\" onchange=\"MonLenDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("','");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel', '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel' , '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel')\"><option>?</select> &nbsp;\n<select style=\"width:auto\" title=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyLabel)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyLabel)")) {
	return;
}
tools.appendString(" - Month");
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel\" onchange=\"MonLenDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("','");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel', '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel' , '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel')\"><option>?</select> &nbsp;\n<select style=\"width:auto\" title=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyLabel)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyLabel)")) {
	return;
}
tools.appendString(" - Day");
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel\" onchange=\"FormDateForDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("')\"><option>?</select>\n\n");
	}
tools.appendString("\n\n<script>\n");

	String localeToUse = tools.findPage("pxRequestor").getString("pxReqLocale");
	tools. appendString("var fullSelectDateFormat = \""+PRDateFormat.getFormatPattern(localeToUse,PRDateFormat.DEFAULT_DATE_SHORT_YYYY)+"\";");

	String []a = PRDateFormat.getMonths(localeToUse);
	String result="";
	if (a.length>0) {
        result ="\""+ a[0]+"\"";    // start with the first element
        for (int i=1; i<a.length; i++) {
          result = result + ",\"" + a[i]+"\"";
        }
    }
	tools.appendString("var Mon3 =["+result+"];");

tools.appendString("\n\nvar D_Opt = new Array() // 29..31\n//Mon3 = [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"May\", \"Jun\",\"Jul\", \"Aug\", \"Sep\", \"Oct\", \"Nov\", \"Dec\"]\n\n\nfunction LengthOfMonth(Y, M){ \n\twith (new Date(Y,M,1,12)) {\n\t\tsetDate(0) \n\t\treturn getDate()\n\t}\n}\n\nfunction init(hiddenfield){\n\tvar defaultDate = document.getElementsByName(hiddenfield)[0].value;\n\tif(defaultDate == \"\"){\n\t\t//var dateObj = new Date();\n\t\treturn;\n\t}\n\telse{\n\t\t// take date,month and year to an array\n                  defaultDate = defaultDate.replace(/-/g,\"/\");\n                   if(defaultDate.indexOf(\" \")!= -1){\n\t      var strDate = defaultDate.split(\" \");\n\t      defaultDate = strDate[0];\n\t\t\t\n\t}\t\n                var dateObj = new Date(defaultDate);\n\t\tif(isNaN(dateObj)){return;}\n        \t\tvar year = dateObj.getFullYear();\n         \t\tvar month = dateObj.getMonth() + 1;\n         \t\tvar date = dateObj.getDate();\n\n\t\t");
if(useDatePattern.equalsIgnoreCase("Y")){ 
tools.appendString("\n\t\t\tvar sep = defaultDate.charAt(4);\n\t\t\tvar strarray = defaultDate.split(sep);\n\t\t\tyear = parseInt(strarray[0],10);\n\t\t\tmonth = parseInt(strarray[1],10);\n\t\t\tdate = parseInt(strarray[2],10);\n\t\t ");
}
tools.appendString("\n\n\t\t");
if(useDatePattern.equalsIgnoreCase("D")){ 
tools.appendString("\n\t\t\tvar sep = defaultDate.charAt(defaultDate.length-5);\n\t\t\tvar strarray = defaultDate.split(sep);\n\t\t\tyear = parseInt(strarray[2],10);\n\t\t\tmonth = parseInt(strarray[1],10);\n\t\t\tdate = parseInt(strarray[0],10);\n\t\t ");
}
tools.appendString("       \t\t\n\n\t\t");
if(useDatePattern.equalsIgnoreCase("M")){ 
tools.appendString("\n\t\t\tvar sep = defaultDate.charAt(defaultDate.length-5);\n\t\t\tvar strarray = defaultDate.split(sep);\n\t\t\tyear = parseInt(strarray[2],10);\n\t\t\tmonth = parseInt(strarray[0],10);\n\t\t\tdate = parseInt(strarray[1],10);\n\t\t ");
}
tools.appendString("       \t\t\n\n                document.getElementsByName(hiddenfield+\"YrSel\")[0].value = year;\n                document.getElementsByName(hiddenfield+\"MoSel\")[0].value = month;\n                document.getElementsByName(hiddenfield+\"DySel\")[0].value = date;\n                var DiM = LengthOfMonth(year,month);\n                var Dol = document.getElementsByName(hiddenfield+\"DySel\")[0].options.length;\n                var Dy=document.getElementsByName(hiddenfield+\"DySel\");\n                 for (K=Dol-1;K >DiM;K--){                            \n                                Dy[0].options[K] = null\n\n                }\n\n\t}\n}\n\nfunction MonLenDate(propId, yearId, monthId, dateId) { \n\t\n\tvar Yr = document.getElementsByName(yearId);\n\tvar Mo = document.getElementsByName(monthId);\n\tvar Dy = document.getElementsByName(dateId);\n\n\tvar Dol, K, DiM, NsI\n\tvar ySE = Yr[0].selectedIndex;\n\tif(ySE == 0){\n\t\tySE++;\n\t}\n\tDiM = LengthOfMonth(+Yr[0].options[ySE].text,Mo[0].selectedIndex)\n\tDol = Dy[0].options.length\n  \n\tif ( (NsI = Dy[0].selectedIndex) > DiM ) \n\t\tNsI = DiM\n\tfor (K=Dol-1;K >DiM;K--){\n\t\tD_Opt[K] = Dy[0].options[K] ; \n\t\tDy[0].options[K] = null \n\t}\n\tfor (J=1;  J<32 ; J++){\n                                D_Opt[J] = new Option(J);\n                                D_Opt[J].value=J;\n\t}\n\tfor (K=Dol ; K<=DiM ; K++){   \n\t\tDy[0].options[K] = D_Opt[K]\n\t\tif(Dy[0].options[K]!=null)\n                                Dy[0].options[K].value=D_Opt[K].value;\n    }\n\tDy[0].selectedIndex = NsI \n\tFormDateForDate(propId, true, Yr, Mo, Dy)\n}\n\n\n// upload the hidden date field\n\nfunction FormDateForDate(propId, bChanged, YrSel, MoSel, DySel, HrSel , MiSel , AP){\n\n\tif(bChanged == true){\n\t\tyear = YrSel[0].value;\n\t\tdate = DySel[0].value;\n\t\tmonth = MoSel[0].value;\n\n\t}\n\telse{\n\t\tyear = document.getElementsByName(propId + \"YrSel\")[0].value;\n\t\tmonth = document.getElementsByName(propId + \"MoSel\")[0].value;\n\t\tdate = document.getElementsByName(propId + \"DySel\")[0].value;\n\t}\n\t//month = + month + 1;\n\t//document.getElementsByName(propId)[0].value =month +\"/\"+date+\"/\"+year;\n\t\n\tvar dateString =month +\"/\"+date+\"/\"+year;\n\tvar dateObj = new Date(dateString);\n\tdocument.getElementsByName(propId)[0].value =getSelectDateFromFormat(dateObj,fullSelectDateFormat,year,month,date);\t\t\n}\n\n\n// Initialiser :\n\nfunction InitYMDselector(hiddenfield,Yr, Mo, Dy, yrspan, Base, tdate,Hr,Mi,AP) {\n\tvar J;\n\tif (!Base) \n\t\tBase = new Date().getFullYear();\n\tYr[0].options[0] = new Option(\"\");\n\tYr[0].options[0].value=\"\";\n\tfor (J=1; J<yrspan+1; J++){\n\t\tYr[0].options[J] = new Option(Base+J-1);\n\t\tYr[0].options[J].value=Base+J-1;\n\t}\n\tMo[0].options[0] = new Option(\"\");\n\tMo[0].options[0].value=\"\";\n\tfor (J=1;  J<13 ; J++){\n\t\tMo[0].options[J] = new Option(Mon3[J-1]);\n\t\tMo[0].options[J].value=J;\n\t}\n\tDy[0].options[0] = new Option(\"\");\n\tDy[0].options[0].value=\"\";\n\tfor (J=1;  J<32 ; J++){\n\t\tDy[0].options[J] = new Option(J);\n\t\tDy[0].options[J].value=J;\n\t}\n\n\tinit(hiddenfield);\n}\n\n\n\n// Initialising ( Argument Now (optional) must be in BaseYear+YearSpan-1 ) :\n\t\n\tvar YearSpanParam = '");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__2(pageContext, "param.YearSpan")) {
	return;
}
tools.appendString("';\n\tif(YearSpanParam == \"\"){\n\t\tYearSpanParam = 100;\n\t}\n\telse{\n\t\tYearSpanParam = parseInt(YearSpanParam);\n\t}\n\tvar Now, YearSpan = YearSpanParam, BaseYear = (Now = new Date()).getFullYear() - (YearSpanParam/2)\n \tInitYMDselector('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("',document.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel\"), document.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel\"), document.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel\"), YearSpan, BaseYear, Now);\n\t\n\tfunction getSelectDateFromFormat(val, format,y,m,d) {\t\n\n\tvar formedDate = format;\n\tvar dateObj =val;\n\n\t// Convert val and format to string\n\tval=val+\"\";\n\tformat=format+\"\";\n\n\t// Index values to locate the value and format\n\tvar i_val=0;\n\tvar i_format=0;\n\n\t// Character and token to compare\n\tvar c=\"\";\n\tvar token=\"\";\n\n\t// Minimum and maximum digits of the year\n\tvar x,y;\n\n\t// Store the day of week\n\tvar day_name = \"\";\n\tvar month_name = \"\";\n\t\n\t// Date instance to initialize date variables, not for validation\n\tvar now=new Date();\n\n\t// Initialize date varibales\n\tvar year=now.getFullYear();\n\tvar month=now.getMonth()+1;\n\tvar date=1;\n\t\t\n\t// Loop through the format string\n\twhile (i_format < format.length) {\n\n\t\t// Get next token from format string\n\t\t// For e.g. : 'y'\n\t\tc=format.charAt(i_format);\n\n\t\t// Reset the token\n\t\ttoken=\"\";\n\n\t\t// Scan the format string until it finds the full token\n\t\twhile ((format.charAt(i_format)==c) && (i_format < format.length)) {\n\t\t\t\n\t\t\ttoken += format.charAt(i_format++);\n\t\t}\n\t\t\t\n\t\t// Compare the token with the corresponding value part\n\t\tif (val.substring(i_val,i_val+token.length)==token) {\n\n\t\t\t// Increase the index to get the next token if the year is valid\n\t\t\ti_val+=token.length;\n\t\t\n\t\t}\n\t\t\n\t\tif (token==\"yyyy\") {\n\t\t\tif(isNaN(dateObj.getFullYear()))\n\t\t\t\tformedDate = formedDate.replace(\"yyyy\", y);\n\t\t\telse\n\t\t\t\tformedDate = formedDate.replace(\"yyyy\", dateObj.getFullYear());\n\t\t}\n\t\telse if (token==\"yy\") {\n\t\t\tif(isNaN(dateObj.getFullYear()))\n\t\t\t\tformedDate = formedDate.replace(\"yy\", y);\n\t\t\telse\n\t\t\t\tformedDate = formedDate.replace(\"yy\", dateObj.getFullYear());\n\t\t}\n\t\t\n\t\telse if (token==\"MMMM\" || token==\"MM\" || token==\"M\"){\n\t\t\tmonth=0;\n\t\t\tfor (var i=0; i<Mon3.length; i++) {\n\t\t\t\tif(token==\"MMMM\"){\n\t\t\t\t\tif(isNaN(dateObj.getMonth()))\n\t\t\t\t\t\tformedDate = formedDate.replace(\"MMMM\", m);\n\t\t\t\t\telse\n\t\t\t\t\t\tformedDate = formedDate.replace(\"MMMM\", Mon3[dateObj.getMonth()]);\n\t\t\t\t}\n\t\t\t\telse if(token==\"MM\"){\n\t\t\t\t\tif(isNaN(dateObj.getMonth()))\n\t\t\t\t\t\tformedDate = formedDate.replace(\"MM\", m);\n\t\t\t\t\telse\n\t\t\t\t\t\tformedDate = formedDate.replace(\"MM\", dateObj.getMonth()+1);\n\t\t\t\t}\n\t\t\t\telse if(token==\"M\"){\n\t\t\t\t\tif(isNaN(dateObj.getMonth()))\n\t\t\t\t\t\tformedDate = formedDate.replace(\"M\", m);\n\t\t\t\t\telse\n\t\t\t\t\t\tformedDate = formedDate.replace(\"M\", dateObj.getMonth()+1);\n\t\t\t\t}\n\n\t\t\t}\n\t\t}\n\n\t\telse if (token==\"dd\"){\n\t\t\tif(isNaN(dateObj.getDate()))\n\t\t\t\tformedDate = formedDate.replace(\"dd\", d);\n\t\t\t\telse\n\t\t\tformedDate = formedDate.replace(\"dd\", dateObj.getDate());\n\t\t}\n\t\telse if (token==\"d\"){\n\t\t\tif(isNaN(dateObj.getDate()))\n\t\t\t\tformedDate = formedDate.replace(\"d\", d);\n\t\t\telse\n\t\t\t\tformedDate = formedDate.replace(\"d\", dateObj.getDate());\n\t\t}\n\t}\n\t\treturn formedDate;\n\t\n}\n\n\n</script>\n\n");

foundChoice_13 = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice_13) {
tools.appendString("\n");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(result)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(result)")) {
	return;
}
tools.appendString("\n");
}
tools.appendString("\n");
}
private static final Map oPropDefinitions_10 = null;
private static final Map oStreamProperties_10 = new HashMap();
static {
	oStreamProperties_10.put("pyRuleAvailable", "Final");
	oStreamProperties_10.put("pyCircumstanceDateProp", "");
	oStreamProperties_10.put("pyCircumstanceVal", "");
	oStreamProperties_10.put("pyMethodStatus", "");
	oStreamProperties_10.put("pyClassName", "");
	oStreamProperties_10.put("pyCircumstanceProp", "");
	oStreamProperties_10.put("pzInsKey", "RULE-HTML-PROPERTY SELECTDATE #20180713T133438.035 GMT");
	oStreamProperties_10.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_10.put("pyCircumstanceDate", "");
	oStreamProperties_10.put("pyRuleEnds", "");
	oStreamProperties_10.put("pyRuleStarts", "");
	oStreamProperties_10.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_10.put("pyXMLType", "");
	oStreamProperties_10.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_10.put("pyCorrType", "");
	oStreamProperties_10.put("pyStreamName", "SelectDate");
	oStreamProperties_10.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Data_Admin_Operator_ID_SelectDate
 */
private void property_Data_Admin_Operator_ID_SelectDate() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY SELECTDATE #20180713T133438.035 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY SELECTDATE #20180713T133438.035 GMT
 * Set up context.
 */
final String prevRuleKey_10 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY SELECTDATE #20180713T133438.035 GMT";final String prevClass_10 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_10 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_10);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_10);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_9)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_8();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_10);
	mStreamResponse.setJspBaseClass(prevClass_10);
	pz_CurrentRuleKey = prevRuleKey_10;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_9,true);
}
/* end RULE-HTML-PROPERTY SELECTDATE #20180713T133438.035 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY SELECTDATE #20180713T133438.035 GMT
 */
private void include_8() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_Operator_ID_SelectDate();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_10);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private static final String[] showMeParams_9 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Property", "Final", "", "Pega-Gadgets", "08-01-01", "", "SelectDateTime", "", "RULE-HTML-PROPERTY SELECTDATETIME #20180713T133438.043 GMT" };
private boolean when_8(String aParam1, String aParam2, String aParam3, String aParam4) throws Throwable {
	return (pega.isPreviewMode() || (((((((!(tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam1), aParam2))))) || (((((tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam3), aParam4)))))))));
}
private void performStream_6() throws Throwable {
	if (when_8("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString(" </span> ");
	}
tools.appendString(" ");
}
private static final Map oPropDefinitions_9 = null;
private static final Map oStreamProperties_9 = new HashMap();
static {
	oStreamProperties_9.put("pyRuleAvailable", "Final");
	oStreamProperties_9.put("pyCircumstanceDateProp", "");
	oStreamProperties_9.put("pyCircumstanceVal", "");
	oStreamProperties_9.put("pyMethodStatus", "Internal");
	oStreamProperties_9.put("pyClassName", "");
	oStreamProperties_9.put("pyCircumstanceProp", "");
	oStreamProperties_9.put("pzInsKey", "RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT");
	oStreamProperties_9.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_9.put("pyCircumstanceDate", "");
	oStreamProperties_9.put("pyRuleEnds", "");
	oStreamProperties_9.put("pyRuleStarts", "");
	oStreamProperties_9.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_9.put("pyXMLType", "");
	oStreamProperties_9.put("pyRuleSet", "Pega-ProCom");
	oStreamProperties_9.put("pyCorrType", "");
	oStreamProperties_9.put("pyStreamName", "EndSmartField");
	oStreamProperties_9.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Data_Admin_Operator_ID_EndSmartField
 */
private void property_Data_Admin_Operator_ID_EndSmartField() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT
 * Set up context.
 */
final String prevRuleKey_9 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT";final String prevClass_9 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_9 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_9);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_9);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_8)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_6();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_9);
	mStreamResponse.setJspBaseClass(prevClass_9);
	pz_CurrentRuleKey = prevRuleKey_9;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_8,true);
}
/* end RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT
 */
private void include_6() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_Operator_ID_EndSmartField();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
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
private void performStream_5() throws Throwable {


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
	boolean foundChoice_10 = false;
tools.appendString(" ");
if (!foundChoice_10 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "");
tools.appendString(" ");

foundChoice_10 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_10 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "inputErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "inputError");
tools.appendString(" ");

foundChoice_10 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_10) {
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
	if (when_7("parentLayoutVal", "SIMPLELAYOUT")) {
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
	if (when_7("parentLayoutVal", "SIMPLELAYOUT")) {
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
	if (when_7("isBad", "true")) {
tools.appendString(" id=\"PegaRULESErrorFlag\" ");
	}
tools.appendString(" > ");
	boolean foundChoice_11 = false;
tools.appendString(" ");
if (!foundChoice_11 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" <b style=\"font-family: wingdings;color:red;cursor:hand\">x</b> ");

foundChoice_11 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_11 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_11 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_11 && (pega.isPreviewMode() || tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_11 = !pega.isPreviewMode();
}
tools.appendString("  </span> </div> ");
	}
}
private static final Map oPropDefinitions_8 = null;
private static final Map oStreamProperties_8 = new HashMap();
static {
	oStreamProperties_8.put("pyRuleAvailable", "Final");
	oStreamProperties_8.put("pyCircumstanceDateProp", "");
	oStreamProperties_8.put("pyCircumstanceVal", "");
	oStreamProperties_8.put("pyMethodStatus", "Internal");
	oStreamProperties_8.put("pyClassName", "");
	oStreamProperties_8.put("pyCircumstanceProp", "");
	oStreamProperties_8.put("pzInsKey", "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT");
	oStreamProperties_8.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_8.put("pyCircumstanceDate", "");
	oStreamProperties_8.put("pyRuleEnds", "");
	oStreamProperties_8.put("pyRuleStarts", "");
	oStreamProperties_8.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_8.put("pyXMLType", "");
	oStreamProperties_8.put("pyRuleSet", "Pega-UIDesign");
	oStreamProperties_8.put("pyCorrType", "");
	oStreamProperties_8.put("pyStreamName", "Messages");
	oStreamProperties_8.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Data_Admin_Operator_ID_messages
 */
private void property_Data_Admin_Operator_ID_messages() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT	Pega-UIDesign:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 * Set up context.
 */
final String prevRuleKey_8 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT";final String prevClass_8 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_8 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_8);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_8);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_7)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_5();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_8);
	mStreamResponse.setJspBaseClass(prevClass_8);
	pz_CurrentRuleKey = prevRuleKey_8;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_7,true);
}
/* end RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 */
private void include_5() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_Operator_ID_messages();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_7(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_3() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_7("bAddedValidationType", "true")) {
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes", ",", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
tools.putSaveValue("validationAttributes", "validationType=\'");
tools.appendString(" ");
tools.putSaveValue("bAddedValidationType", "true");
tools.appendString(" ");
}
}
private void performStream_4() throws Throwable {
tools.appendString(" ");
out.print( tools.getParamValue("pega_attributes") );
tools.appendString(" ");

  String mode1 = tools.getSaveValue("mode1Action");
  String mode2 = tools.getSaveValue("mode2Action");

tools.appendString(" ");
	boolean foundChoice_7 = false;
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString(" ");
out.print(mode1);
tools.appendString(" ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7) {
tools.appendString(" ");
out.print(mode2);
tools.appendString(" ");
}
tools.appendString("  ");

  /* BUG-394080: resetting mode1Action and mode2Action after added to control */
  tools.putSaveValue("mode1Action", "");
  tools.putSaveValue("mode2Action", "");

tools.appendString("  ");

String pvclientval = "";
com.pega.pegarules.pub.context.PRStackFrame previousStack = tools.getStackFrame().getPrevious();
int i = 5;
while(i != 0 && previousStack != null && previousStack.getParameterPage() != null){
pvclientval = previousStack.getParameterPage().getString("PVClientVal");
if(pvclientval != null && pvclientval.length() > 0) {
break;
}
i--;
previousStack = previousStack.getPrevious();

}

tools.appendString(" ");
tools.putSaveValue("validationAttributes", "");
tools.appendString("  ");
boolean isValidation = "true".equals(tools.getSaveValue("bClientValidation")) || "true".equals(pvclientval);
tools.appendString(" ");
	if (pega.isPreviewMode() || tools.getActive()!=null) {
tools.appendString(" ");
	boolean foundChoice_8 = false;
tools.appendString(" ");
if (!foundChoice_8 && (pega.isPreviewMode() || isValidation == true)) {
tools.appendString("  ");
tools.putSaveValue("bAddedValidationType", "false");
tools.appendString(" ");
	boolean foundChoice_9 = false;
tools.appendString(" ");
if (!foundChoice_9 && (pega.isPreviewMode() || (areValsEqual(lookupThisDefinition(tools, "pyOnInput"), "")))) {
tools.appendString("  ");
	if (pega.isPreviewMode() || (!areValsEqual(lookupThisDefinition(tools, "pyEditValidate"), ""))) {
tools.appendString("  ");
tools.putSaveValue("validationAttributes", "validationType=\'");
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes",   tools.getDictionary().fromDefinition(tools.getActive(), "pyEditValidate").toLowerCase() , IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
tools.putSaveValue("bAddedValidationType", "true");
tools.appendString(" ");
	}
tools.appendString(" ");
	if (pega.isPreviewMode() || !tools.getDictionary().fromDefinition(tools.getActive(), "pyStringType").equalsIgnoreCase("text")) {
tools.appendString(" ");
choose_3();
tools.appendString("  ");
pzAuto.putSaveValue("validationAttributes",   tools.getDictionary().fromDefinition(tools.getActive(), "pyStringType").toLowerCase() , IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_6("pega_validation", "")) {
tools.appendString("  ");
choose_3();
tools.appendString("  ");
pzAuto.putSaveRef("validationAttributes", "param.pega_validation", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_7("bAddedValidationType", "true")) {
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes", "\'", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");

foundChoice_9 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_9) {
tools.appendString(" ");
	if (when_6("pega_validation", "")) {
tools.appendString("  ");
pzAuto.putSaveValue("validationAttributes", "validationType=\'", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
pzAuto.putSaveRef("validationAttributes", "param.pega_validation", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes", "\'", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
}
tools.appendString("  ");

foundChoice_8 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_8) {
tools.appendString(" ");
tools.putSaveValue("validationAttributes", "");
tools.appendString(" ");
}
tools.appendString("  ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(validationAttributes)", "literal")) {
	return;
}
tools.appendString(" ");
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
	oStreamProperties_7.put("pzInsKey", "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT");
	oStreamProperties_7.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_7.put("pyCircumstanceDate", "");
	oStreamProperties_7.put("pyRuleEnds", "");
	oStreamProperties_7.put("pyRuleStarts", "");
	oStreamProperties_7.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_7.put("pyXMLType", "");
	oStreamProperties_7.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_7.put("pyCorrType", "");
	oStreamProperties_7.put("pyStreamName", "ClientValidation");
	oStreamProperties_7.put("pyRuleSetVersion", "08-02-01");
}
/**
 * Generates stream property_Data_Admin_Operator_ID_ClientValidation
 */
private void property_Data_Admin_Operator_ID_ClientValidation() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT	Pega-UIEngine:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 * Set up context.
 */
final String prevRuleKey_7 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT";final String prevClass_7 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_7 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_7);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_7);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_6)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_4();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_7);
	mStreamResponse.setJspBaseClass(prevClass_7);
	pz_CurrentRuleKey = prevRuleKey_7;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_6,true);
}
/* end RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 */
private void include_4() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_Operator_ID_ClientValidation();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private static final String[] showMeParams_3 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!YEAR #20180713T133515.872 GMT", "Rule-Obj-FieldValue", "Pega-Gadgets", "pyCaption", "Data-Admin-Operator-ID", "Year" };
private static final String[] showMeParams_4 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!MONTH #20180713T133515.829 GMT", "Rule-Obj-FieldValue", "Pega-Gadgets", "pyCaption", "Data-Admin-Operator-ID", "Month" };
private static final String[] showMeParams_5 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!DAY #20180713T134231.552 GMT", "Rule-Obj-FieldValue", "Pega-Reporting", "pyCaption", "Data-Admin-Operator-ID", "Day" };
private static final String[] showMeParams_6 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!HOUR #20180713T133515.779 GMT", "Rule-Obj-FieldValue", "Pega-Gadgets", "pyCaption", "Data-Admin-Operator-ID", "Hour" };
private static final String[] showMeParams_7 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!MINUTE #20180713T133515.819 GMT", "Rule-Obj-FieldValue", "Pega-Gadgets", "pyCaption", "Data-Admin-Operator-ID", "Minute" };
private static final String[] showMeParams_8 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!AM OR PM #20180713T133515.739 GMT", "Rule-Obj-FieldValue", "Pega-Gadgets", "pyCaption", "Data-Admin-Operator-ID", "AM or PM" };
private void performStream_7() throws Throwable {
	if (when_2("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString("\n\t");
/* Include stream RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT */
include_3();

tools.appendString("\n");
	}
tools.appendString("\n");

boolean HP_DT_ShowTime = false;
if(tools.getActive().getType() == PropertyInfo.TYPE_DATE)
	HP_DT_ShowTime = false; //tools.putParamValue( "WithTime", "true" );
else if (tools.getActive().getType() == PropertyInfo.TYPE_DATETIME)
{
	if (tools.getParamValue("WithTime").length() == 0)
		HP_DT_ShowTime = true;
	else
		HP_DT_ShowTime = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"WithTime");
}

tools.appendString("\n\n\n");
	boolean foundChoice_4 = false;
tools.appendString("\n\t");
if (!foundChoice_4 && (pega.isPreviewMode() || HP_DT_ShowTime && tools.getActive().getType() == PropertyInfo.TYPE_DATETIME)) {
tools.appendString("\n");


ClipboardProperty curProp = tools.getActive();
if ( (curProp.getType() == PropertyInfo.TYPE_DATETIME || curProp.getType() == PropertyInfo.TYPE_DATE) && curProp.size() > 0 && curProp.hasValidValue() && curProp.toDate()!=null)  {
	String sDatetime="";
	String type = tools.getParamValue("DateTimeFormat");
	String strTimeZone = tools.findPage("pxRequestor").getString(".pyUseTimeZone");	
	sDatetime = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATETIME_SHORT_YYYY, curProp.toDate()); 
	tools.putSaveValue("result",sDatetime); 
}
else {
	tools.putSaveValue("result",tools.getActiveValue()); 
}


tools.appendString("\n");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice_4) {
tools.appendString("\n");

ClipboardProperty curProp = tools.getActive();
if ( (curProp.getType() == PropertyInfo.TYPE_DATE || curProp.getType() == PropertyInfo.TYPE_DATETIME) && curProp.size() > 0 && curProp.hasValidValue() && curProp.toDate()!=null)  {

	String sDate=PRDateFormat.format(null, "GMT", PRDateFormat.DEFAULT_DATE_SHORT_YYYY , curProp.toDate()); 
	tools.putSaveValue("result",sDate); 
}
else {
	tools.putSaveValue("result",tools.getActive().getStringValue()); 
}

tools.appendString("\n");
}
tools.appendString("\n\n\n");
	boolean foundChoice_5 = false;
tools.appendString("\n");
if (!foundChoice_5 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString("\n\n");
 String requiredfield=""; 
tools.appendString("\n");
	boolean foundChoice_6 = false;
tools.appendString("\n");
if (!foundChoice_6 && (pega.isPreviewMode() || (areValsEqual(tools.getParamValue("pega_validation"), "required")))) {
boolean whenResult_1 = pega.invokeWhen("UseAccessibleDate", "", "");
	if (whenResult_1) {
 requiredfield= " Required"; 
	}
tools.appendString(" ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice_6) {
 requiredfield = ""; 
tools.appendString(" ");
}
tools.appendString("\n\n\n\n<input ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_4();

tools.appendString(" type =\"text\" id=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyPropertyName)")) {
	return;
}
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" \nvalue=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(result)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(result)")) {
	return;
}
tools.appendString("\" style=\"display:none\">\n");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_5();

tools.appendString("\n\n<select title=\"");
out.print( tools.getLocalizedTextForString( tools.getActive().getName(),tools.getDictionary().fromDefinition(tools.getActive(),"pyLabel")) );
tools.appendString(" - ");

/* Field value Data-Admin-Operator-ID .pyCaption Year */
if(tools.getStepPage() != null && "Data-Admin-Operator-ID".equals(tools.getStepPage().getClassName())){
out.write("Year");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyCaption", "Year")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_3);
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel\" onchange=\"MonLen('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("','");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel', '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel' , '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel')\"><option></option></select> -\n\n<select title=\"");
out.print( tools.getLocalizedTextForString( tools.getActive().getName(),tools.getDictionary().fromDefinition(tools.getActive(),"pyLabel")) );
tools.appendString(" - ");

/* Field value Data-Admin-Operator-ID .pyCaption Month */
if(tools.getStepPage() != null && "Data-Admin-Operator-ID".equals(tools.getStepPage().getClassName())){
out.write("Month");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyCaption", "Month")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_4);
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel\" onchange=\"MonLen('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("','");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel', '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel' , '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel')\"><option>?</select> -\n\n<select title=\"");
out.print( tools.getLocalizedTextForString( tools.getActive().getName(),tools.getDictionary().fromDefinition(tools.getActive(),"pyLabel")) );
tools.appendString(" - ");

/* Field value Data-Admin-Operator-ID .pyCaption Day */
if(tools.getStepPage() != null && "Data-Admin-Operator-ID".equals(tools.getStepPage().getClassName())){
out.write("Day");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyCaption", "Day")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_5);
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel\" onchange=\"FormDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("')\"><option>?</select>&nbsp;&nbsp;\n");
	if (pega.isPreviewMode() || HP_DT_ShowTime) {
tools.appendString("\n\n<select  title=\"");
out.print( tools.getLocalizedTextForString( tools.getActive().getName(),tools.getDictionary().fromDefinition(tools.getActive(),"pyLabel")) );
tools.appendString(" - ");

/* Field value Data-Admin-Operator-ID .pyCaption Hour */
if(tools.getStepPage() != null && "Data-Admin-Operator-ID".equals(tools.getStepPage().getClassName())){
out.write("Hour");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyCaption", "Hour")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_6);
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("HrSel\"  onchange=\"FormDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("')\"><option>?</select>:\n<select title=\"");
out.print( tools.getLocalizedTextForString( tools.getActive().getName(),tools.getDictionary().fromDefinition(tools.getActive(),"pyLabel")) );
tools.appendString(" - ");

/* Field value Data-Admin-Operator-ID .pyCaption Minute */
if(tools.getStepPage() != null && "Data-Admin-Operator-ID".equals(tools.getStepPage().getClassName())){
out.write("Minute");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyCaption", "Minute")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_7);
out.print(requiredfield);
tools.appendString("\"  name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MiSel\" onchange=\"FormDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("')\"><option>?</select>&nbsp;\n<select title=\"");
out.print( tools.getLocalizedTextForString( tools.getActive().getName(),tools.getDictionary().fromDefinition(tools.getActive(),"pyLabel")) );
tools.appendString(" - ");

/* Field value Data-Admin-Operator-ID .pyCaption AM or PM */
if(tools.getStepPage() != null && "Data-Admin-Operator-ID".equals(tools.getStepPage().getClassName())){
out.write("AM or PM");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyCaption", "AM or PM")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_8);
out.print(requiredfield);
tools.appendString("\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("APSel\" onchange=\"FormDate('");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("')\"><option>?</select>\n");
	}
tools.appendString("\n\n<script>\n\nvar D_Opt = new Array() // 29..31\nMon3 = [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"May\", \"Jun\",\n          \"Jul\", \"Aug\", \"Sep\", \"Oct\", \"Nov\", \"Dec\"]\n\n\nfunction LengthOfMonth(Y, M){ \n\tif (M == -1)M=0;\n\twith (new Date(Y,M,1,12)) {\n\t\tsetDate(0) \n\t\treturn getDate()\n\t}\n}\n\nfunction init(){\n\tvar defaultDate = document.getElementById(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyPropertyName)")) {
	return;
}
tools.appendString("\").value;\n\tif(defaultDate == \"\"){\n\t\t//var dateObj = new Date();\n\t\treturn;\n\t}\n\telse{\n\t\t//split the date time and take in to an array\n\t\tvar stringDateTime=defaultDate.split(\" \");\n\t\tvar stringDate=stringDateTime[0].split(\"/\");\n\t\tvar stringTime=stringDateTime[1].split(\" \");\n\t\tvar strDateTime=stringDate.concat(stringTime[0].split(\":\")).concat(stringTime[1]);\n\n\t\tfor (i=0;i<strDateTime.length;i++ )\n\t\t{\n\t\t\t// if any of the value date ,month or year is empty set the year,month and date from the array and break the loop.\n\t\t\tif(strDateTime[i]==\"\"){\n\t\t\t\tvar year = strDateTime[2] ;\n     \t\t\t\tvar month =strDateTime[0] ;\n     \t\t\t\tvar date = strDateTime[1] ;\n\t\t\t\tvar hours = strDateTime[3];\n\t\t\t\tvar mins = strDateTime[4];\n\t\t\t\tvar ap = strDateTime[5];\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\telse{\n\t\t\t\t// if the values are not empty and the element is last element of the array,then create the Date() and get values.\n\t\t\t\tif(i==strDateTime.length-1){\n\t\t\t\t\tvar dateObj = new Date(defaultDate);\n\t\t\t\t\tvar year = dateObj.getFullYear();\n\t\t\t\t\tvar month = dateObj.getMonth() + 1;\n\t\t\t\t\tvar date = dateObj.getDate();\n\t\t\t\t\tvar hours = dateObj.getHours();\n\t\t\t\t\tvar mins = dateObj.getMinutes();\n\t\t\t\t\tvar ap=\"AM\";\n\t\t\t\t\tif(hours>=12)\n\t\t\t\t\t\tvar ap=\"PM\";\n\t\t\t\t}\n\t\t\t}\n\t        }\n\t}\n\tdocument.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel\")[0].value = year;\n\tdocument.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel\")[0].value = month;\n\tdocument.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel\")[0].value = date;\n\t");
	if (pega.isPreviewMode() || HP_DT_ShowTime) {
tools.appendString("\n\tdocument.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("HrSel\")[0].value = hours%12;\n\tdocument.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MiSel\")[0].value = mins;\n\tdocument.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("APSel\")[0].value = ap;\n\t");
	}
tools.appendString("\n}\n\nfunction MonLen(propId, yearId, monthId, dateId) { \n\tvar Yr = document.getElementsByName(yearId);\n\tvar Mo = document.getElementsByName(monthId);\n\tvar Dy = document.getElementsByName(dateId);\n\n\tvar Dol, K, DiM, NsI\n\tvar ySE = Yr[0].selectedIndex;\n\tif(ySE == 0){\n\t\tySE++;\n\t}\n\tDiM = LengthOfMonth(+Yr[0].options[ySE].text,Mo[0].selectedIndex)\n\tDol = Dy[0].options.length\n\n \tNsI = Dy[0].selectedIndex \n\tif ( Dy[0].selectedIndex-1 >= DiM ) \n\t\tNsI = DiM-1\n\n\tfor (K=Dol;K >DiM;K--){\n\t\tD_Opt[K] = Dy[0].options[K] ; \n\t\tDy[0].options[K] = null \n\t}\n\tfor (K=Dol ; K<=DiM ; K++){   \n\t\tDy[0].options[K] = D_Opt[K]\n\t\tDy[0].options[K].value=D_Opt[K].value\n\t}\n\tDy[0].selectedIndex = NsI \n\tFormDate(propId, true, Yr, Mo, Dy)\n}\n\n\n// upload the hidden date field\n\nfunction FormDate(propId, bChanged, YrSel, MoSel, DySel, HrSel , MiSel , AP){\n\tif(bChanged == true){\n\t\tyear = YrSel[0].value;\n\t\tdate = DySel[0].value;\n\t\tmonth = MoSel[0].value;\n\n\t}\n\telse{\n\t\tyear = document.getElementsByName(propId + \"YrSel\")[0].value;\n\t\tmonth = document.getElementsByName(propId + \"MoSel\")[0].value;\n\t\tdate = document.getElementsByName(propId + \"DySel\")[0].value;\n\t}\n\n\tif(document.getElementsByName(propId + \"HrSel\")[0] != null && document.getElementsByName(propId + \"MiSel\")[0] != null && document.getElementsByName(propId + \"APSel\")[0]){\n\t\thours = document.getElementsByName(propId + \"HrSel\")[0].value;\n\t\tmins = document.getElementsByName(propId + \"MiSel\")[0].value;\n\t\tap = document.getElementsByName(propId + \"APSel\")[0].value;\n\t\tif (year==\"\" && month==\"\" && date==\"\" && hours==\"\" && mins==\"\" && ap==\"\" )\n\t\t\tdocument.getElementsByName(propId)[0].value=\"\";\n\t\telse\n\t\t\tdocument.getElementsByName(propId)[0].value =localizeDate(year,month,date,hours,mins,ap);\t}\n\telse{\n\t\tif (year==\"\" && month==\"\" && date==\"\")\n\t\t\tdocument.getElementsByName(propId)[0].value=\"\";\n\t\telse\n\t\t\tdocument.getElementsByName(propId)[0].value =localizeDate(year,month,date);\n\t}\n}\n\n\n// Initialiser :\n\nfunction InitYMDselector(Yr, Mo, Dy, yrspan, Base, tdate,Hr,Mi,AP) { \n\tvar J;\n\tif (!Base) \n\t\tBase = new Date().getFullYear();\n\n\tYr[0].options[0] = new Option(\"\");\n\tYr[0].options[0].value=\"\";\n\tfor (J=1; J<yrspan+1; J++){\n\t\tYr[0].options[J] = new Option(Base+J-1);\n\t\tYr[0].options[J].value=Base+J-1;\n\t}\n\tMo[0].options[0] = new Option(\"\");\n\tMo[0].options[0].value=\"\";\n\tfor (J=1;  J<13 ; J++){\n\t\tMo[0].options[J] = new Option(Mon3[J-1]);\n\t\tMo[0].options[J].value=J;\n\t}\n\tDy[0].options[0] = new Option(\"\");\n\tDy[0].options[0].value=\"\";\n\tfor (J=1;  J<32 ; J++){\n\t\tDy[0].options[J] = new Option(J);\n\t\tDy[0].options[J].value=J;\n\t}\n");
	if (pega.isPreviewMode() || HP_DT_ShowTime) {
tools.appendString("\n\tHr[0].options[0] = new Option(\"\");\n\tHr[0].options[0].value=\"\";\n\tfor (J=1; J<13; J++) {\n\t\tHr[0].options[J] = new Option(J-1);\n\t\tHr[0].options[J].value=J-1;\n\t}\n\tMi[0].options[0] = new Option(\"\");\n\tMi[0].options[0].value=\"\";\n\tfor (J=1;  J<61 ; J++){ \n\t \tif (J<11){\n\t\t\tminute='0'+(J-1);\n\t\t}\n\t\telse{\n\t\t    \tminute=J-1;\n\t\t}\n\t\tMi[0].options[J] = new Option(minute);\n\t\tMi[0].options[J].value=J-1;\n\t}\n\t\n\tAP[0].options[0] = new Option(\"\");\n\tAP[0].options[0].value=\"\";\n\tAP[0].options[1] = new Option(\"AM\");\n\tAP[0].options[1].value=\"AM\";\n\tAP[0].options[2] = new Option(\"PM\");\n\tAP[0].options[2].value=\"PM\";\n");
	}
tools.appendString("\n\tinit();\n}\n\n");

			tools.appendString("var localDateArray = new Array(");
			int end = 59;
			for(int i=0; i<= end; i++)
			{
				if( i == end )
					tools.appendString("'"+com.pega.pegarules.pub.util.PRNumberFormat.format(null, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null, i) + "');");
				else
					tools.appendString("'"+com.pega.pegarules.pub.util.PRNumberFormat.format(null, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null, i) + "',");
			};

			int firstDayOfWeek = (PRDateFormat.getFirstWeekDay(null) - 1);
			tools.appendString( "\nvar firstDayOfTheWeek = " + firstDayOfWeek + ";" );

			tools.appendString( "\nvar shortDateFormat = " +"\"" +com.pega.pegarules.pub.util.PRDateFormat.getShortDateFormat(null)+ "\""+ ";");
			tools.appendString( "\nvar shortDateTimeFormat = " +"\"" +com.pega.pegarules.pub.util.PRDateFormat.getShortDateTimeFormat(null)+ "\""+ ";");
			tools.appendString( "\nvar closeText = " + "\"" + tools.getLocalizedTextForString("pxRequestor.pyButtonLabel","Close") + "\";" );
			tools.appendString( "\nvar todayText = " + "\"" + tools.getLocalizedTextForString("pxRequestor.pyButtonLabel","Today") + "\";" );

			String months[] = PRDateFormat.getMonths(null);
			tools.appendString("\nvar longMonthArray = new Array(");
			for(int i=0; i < months.length; i++)
			{	if ( i != 0 )
					tools.appendString( "," );
			
				String month = months[i];

				if ( month.length() != 0 )
					month = ( month.substring( 0, 1 ).toUpperCase() + month.substring( 1, month.length() ) );

				tools.appendString("'" + month + "'" );
			};
			tools.appendString( ");" );

			tools.appendString("\nvar shortMonthArray = new Array(");
			for(int i=0; i < months.length; i++)
			{	if ( i != 0 )
					tools.appendString( "," );
			
				String month = months[i];

				if ( month.length() != 0 )
				{	month = month.substring( 0, 1 ).toUpperCase();

					int endIndex = (int)Math.min( months[i].length(), 3 );
					if ( endIndex > 1 )
						month += months[i].substring( 1, endIndex );
				}

				tools.appendString("'" + month + "'" );
			};
			tools.appendString( ");" );

			String initialWeekdays[] = PRDateFormat.getWeekdays(null);
			int daysInWeek = initialWeekdays.length;
			String[] weekdays = new String[daysInWeek];
			int count = 0;

			for(int startIndex = firstDayOfWeek; startIndex < daysInWeek; startIndex++)
				weekdays[count++] = initialWeekdays[startIndex];

			for(int startIndex2 = 0; startIndex2 < firstDayOfWeek; startIndex2++)
				weekdays[count++] = initialWeekdays[startIndex2];

			boolean comma = false;

			tools.appendString("\nvar oneCharDayArray = new Array(");
			for(int i=0; i < daysInWeek; i++)
			{	if ( weekdays[i] == null || weekdays[i].length() == 0 )
					continue;

				if ( comma )
					tools.appendString( "," );
			
				String day = ( weekdays[i].substring( 0, 1 ).toUpperCase() );
				tools.appendString("'" + day + "'" );
				comma = true;
			};
			tools.appendString( ");" );

			comma = false;
			tools.appendString("\nvar shortDayArray = new Array(");
			for(int i=0; i < daysInWeek; i++)
			{	if ( weekdays[i] == null || weekdays[i].length() == 0 )
					continue;

				if ( comma )
					tools.appendString( "," );
			
				String day = ( weekdays[i].substring( 0, 1 ).toUpperCase() + weekdays[i].substring( 1, 3 ) );
				tools.appendString("'" + day + "'" );
				comma = true;
			};
			tools.appendString( ");" );

			comma = false;
			tools.appendString("\nvar medDayArray = new Array(");
			for(int i=0; i < daysInWeek; i++)
			{	if ( weekdays[i] == null || weekdays[i].length() == 0 )
					continue;

				if ( comma )
					tools.appendString( "," );
			
				String day = ( weekdays[i].substring( 0, 1 ).toUpperCase() + weekdays[i].substring( 1, 3 ) );
				tools.appendString("'" + day + "'" );
				comma = true;
			};
			tools.appendString( ");" );

			comma = false;
			tools.appendString("\nvar longDayArray = new Array(");
			for(int i=0; i < daysInWeek; i++)
			{	if ( weekdays[i] == null || weekdays[i].length() == 0 )
					continue;

				if ( comma )
					tools.appendString( "," );
			
				String day = ( weekdays[i].substring( 0, 1 ).toUpperCase() + weekdays[i].substring( 1, weekdays[i].length() ) );
				tools.appendString("'" + day + "'" );
				comma = true;
			};
			tools.appendString( ");" );

			String ampm[] = PRDateFormat.getAmPmStrings(null);
			tools.appendString("\nvar ampmArray = new Array(");
			for(int i=0; i < ampm.length; i++)
			{	if ( i != 0 )
					tools.appendString( "," );
			
				tools.appendString("'" + ampm[i] + "'" );
			};
			tools.appendString( ");" );
	
tools.appendString("\n// To Localize the date time\n\nfunction localizeDate(year, month, day,hours,mins,ap)\n{\n     \n\tif ( hours !=null || mins!=null )\n\t{\tvar dateArray = shortDateTimeFormat.split(\"\");\n\t}\n\telse\n\t{\tvar dateArray = shortDateFormat.split(\"\");\n\t}\n\n\tvar ln = dateArray.length;\n\tvar bInLiteral = false;\n\tvar strLowLetters = \"abcdefghijklmnopqrstuvwxyz\";\n\tvar strUpLetters = \"ABCDEFGHIJKLMNOPQRSTUVWXYZ\";\n\t\n\t\n\tvar currentParse = \"blank\";\n\tvar nextParse = \"\";\n\tvar counter = 1;\n\t\n\tvar date = \"\";\n\t\n\tfor (var i = 0; i < ln; i++) {\n\t\tvar tmpChr = dateArray[i];\n\t\t\t\n\t\t//First Check the character and see if it's in our map below.\n\t\tif (tmpChr == \"y\") {\n\t\t\t//we're in a year\n\t\t\tnextParse = \"year\";\n\t\t}\t\n\t\t\t\n\t\telse if (tmpChr == \"M\") {\n\t\t\t//we're in a month\n\t\t\tnextParse = \"month\";\n\t\t}\n\t\t\t\n\t\telse if (tmpChr == \"d\") {\n\t\t\t//we're in a day\n\t\t\tnextParse = \"day\";\t\t\t\n\t\t}\n\t\t\t\t\n\t\telse if (tmpChr == \"h\") {\n\t\t\t//we're in an hour\n\t\t\tnextParse=\"hour\";\n\t\t}\n\n\t\telse if (tmpChr == \"H\") {\n\t\t\tnextParse = \"zuluhour\";\n\t\t\tif(hours<=11 && ap!= null && ap==\"PM\" ){\n\t\t\t\thours=parseInt(hours)+12;\n\t\t\t}\n\t\t}\n\n\t\telse if (tmpChr == \"m\") {\n\t\t\t//we're in a minute\n\t\t\tnextParse = \"minute\";\n\t\t}\n\t\t\n\t\telse if (tmpChr == \"a\") {\n\t\t\t//we're in an AMPM object\n\t\t\tnextParse = \"ampm\";\n\t\t}\n\t\t\n\t\telse if (tmpChr == \"'\") {\n\t\t\t//if it's a literal then we will allow everything\n\t\t\tnextParse = \"literal\";\n\t\t}\n\t\t\n\t\telse if (strLowLetters.indexOf(tmpChr) != -1 || strUpLetters.indexOf(tmpChr) != -1) {\n\t\t\t//if it's reserved and not one of the ones above, we do nothing unless we're in literal\n\t\t\tnextParse = \"reserved\";\n\t\t}\n\t\t\n\t\t\n\t\telse {\n\t\t\t//this is probably a delimiter or something.  Anything that's not a reserved character is \n\t\t\t//considered a quoted literal.\n\t\t\tnextParse = \"misc\";\n\t\t}\n\t\t\n\t\t\n\t\t//We've set the next character, now we need to choose an action\n\t\t//If we've moved into a new character, then we need to append to the date\n\t\t//Otherwise we're on the same character so up the counter\n\t\t//Finally, we just moved from a blank current into something usable so just\n\t\t//set the current to the new.\n\t\tif (nextParse != currentParse && currentParse !=\"blank\") {\n\t\t\tdate = this.appendToDate(currentParse,counter,year,month,day,date,hours,mins,ap);\n\t\t\tcurrentParse=nextParse;\n\t\t\tcounter = 1;\n\t\t}\n\t\telse if (nextParse == currentParse) {\n\t\t// we got the same character here, just up the counter and continue\n\t\t\tif (i == ln -1) {\n\t\t\t\tcounter++;\n\t\t\t\tdate = this.appendToDate(nextParse,counter,year,month,day,date,hours,mins,ap);\n\t\t\t}\n\t\t\tcounter++;\n\t\t}\n\t\telse if ((nextParse != currentParse) && (i == ln-1)) {\n\t\t\t//we've hit the last item.\n\t\t\tdate = this.appendToDate(nextParse,counter,year,month,day,date,hours,mins,ap);\n\t\t}\n\t\telse {\n\t\t// this might be the first character we ran into, that means\n\t\t//currentParse is just \"blank\"\n\t\t\tcurrentParse = nextParse;\n\t\t}\n\t\t\n\t\t//These are grammar structure parsers.  Decisions on what to do with\n\t\t//literals, reserved characters, and everything else.\n\t\tif (nextParse == \"misc\") {\n\t\t\t\t\n\t\t\tdate = date + tmpChr;\n\t\t\tcurrentParse = \"blank\";\n\t\t\tcounter = 1;\n\t\t}\n\t\t\n\t\telse if (nextParse == \"literal\") {\n\t\t\tif (bInLiteral) bInLiteral = false;\n\t\t\telse bInLiteral = true;\n\t\t\t\n\t\t\tcurrentParse = \"blank\";\n\t\t\tcounter = 1;\n\t\t}\n\t\telse if (nextParse == \"reserved\") {\n\t\t\tif (bInLiteral) {\n\t\t\t\tdate = date + tmpChr;\n\t\t\t}\n\t\t\tcurrentParse = \"blank\";\n\t\t\tcounter = 1;\n\t\t}\n\n\t}\n\t\n\treturn date;\n}\n\nfunction appendToDate(type,counter,year,month,day,date,hours,mins,ap)\n{\n\tif (type == \"year\") {\n\t\tvar yearStr = \"\"+year;\n\t\tif (counter > 2) {\n\t\t}\n\t\telse {\n\t\t\tyearStr = yearStr.substring(2,yearStr.length);\n\t\t}\n\n\t\tfor ( var j = 0 ; j < yearStr.length ; j++ )\n\t\t\tdate += localDateArray[parseInt( yearStr.substring( j, j+1 ), 10 )];\n\t}\n\t\n\telse if (type == \"month\") {\n\t\tdate = date + localDateArray[month];\n\t}\n\t\n\telse if (type==\"day\") {\n\t\tdate = date + localDateArray[day];\n\t}\n\n\telse if (type==\"hour\" && (hours !=null || mins!=null)) {\n\t\tvar hour = hours;\n\t\tif (counter == 1)\n\t\t{\tif ( hour < 10 )\n\t\t\t\thour = localDateArray[0] + hour; \n\t\t}\n\t\t\n\t\tdate = date + hour;\n\t}\n\n\telse if (type == \"zuluhour\" && (hours !=null || mins!=null)) {\n\t\tvar hour = hours;\n\t\tdate = date + hour;\n\t}\n\t\n\telse if (type == \"minute\" && (hours !=null || mins!=null)) {\n\t\tvar minute = mins;\n\n\t\tif (counter == 2 && minute.length == 1 )\n\t\t\tdate += localDateArray[0];\n\t\t\n\t\tdate = date + minute;\n\t}\n\t\n\telse if (type == \"ampm\" && (hours !=null || mins!=null)) {\n\t\tvar AMPM = ap;\n\t\tdate = date + AMPM;\n\t}\n\t\n\treturn date;\n\n}\n\n// Initialising ( Argument Now (optional) must be in BaseYear+YearSpan-1 ) :\n\n\tvar YearSpanParam = '");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__2(pageContext, "param.YearSpan")) {
	return;
}
tools.appendString("';\n\tif(YearSpanParam == \"\"){\n\t\tYearSpanParam = 100;\n\t}\n\telse{\n\t\tYearSpanParam = parseInt(YearSpanParam);\n\t}\n\tvar Now, YearSpan = YearSpanParam,\n\tBaseYear = (Now = new Date()).getFullYear() - (YearSpanParam/2)\n \tInitYMDselector(document.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("YrSel\"), document.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MoSel\"), document.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("DySel\"), YearSpan, BaseYear, Now");
	if (pega.isPreviewMode() || HP_DT_ShowTime) {
tools.appendString(",document.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("HrSel\"),document.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("MiSel\"), document.getElementsByName(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("APSel\")");
	}
tools.appendString(");\n\t\n\t\n\n</script>\n\n\n");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice_5) {
tools.appendString("\n");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(result)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(result)")) {
	return;
}
tools.appendString("\n");
}
tools.appendString("\n\n");
	if (when_2("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString("\n\t");
/* Include stream RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT */
include_6();

tools.appendString("\n");
	}
}
private static final Map oPropDefinitions_6 = new HashMap();
static {
	oPropDefinitions_6.put("Data-Admin-Operator-ID.pyCaption", new LiteweightPropertyDefinition("Data-Admin-Operator-ID", "pyCaption", "siN", false, true, "Default", false));
}
private static final Map oStreamProperties_6 = new HashMap();
static {
	oStreamProperties_6.put("pyRuleAvailable", "Final");
	oStreamProperties_6.put("pyCircumstanceDateProp", "");
	oStreamProperties_6.put("pyCircumstanceVal", "");
	oStreamProperties_6.put("pyMethodStatus", "");
	oStreamProperties_6.put("pyClassName", "");
	oStreamProperties_6.put("pyCircumstanceProp", "");
	oStreamProperties_6.put("pzInsKey", "RULE-HTML-PROPERTY SELECTDATETIME #20180713T133438.043 GMT");
	oStreamProperties_6.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_6.put("pyCircumstanceDate", "");
	oStreamProperties_6.put("pyRuleEnds", "");
	oStreamProperties_6.put("pyRuleStarts", "");
	oStreamProperties_6.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_6.put("pyXMLType", "");
	oStreamProperties_6.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_6.put("pyCorrType", "");
	oStreamProperties_6.put("pyStreamName", "SelectDateTime");
	oStreamProperties_6.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Data_Admin_Operator_ID_SelectDateTime
 */
private void property_Data_Admin_Operator_ID_SelectDateTime() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY SELECTDATETIME #20180713T133438.043 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY SELECTDATETIME #20180713T133438.043 GMT
 * Set up context.
 */
final String prevRuleKey_6 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY SELECTDATETIME #20180713T133438.043 GMT";final String prevClass_6 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_6 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_6);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_6);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_5)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_7();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_6);
	mStreamResponse.setJspBaseClass(prevClass_6);
	pz_CurrentRuleKey = prevRuleKey_6;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_5,true);
}
/* end RULE-HTML-PROPERTY SELECTDATETIME #20180713T133438.043 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY SELECTDATETIME #20180713T133438.043 GMT
 */
private void include_7() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_Operator_ID_SelectDateTime();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_9);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_6(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__2(PageContext aPageContext, java.lang.String aName) throws Throwable {
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
private boolean when_5(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_5("SmartInfoHeader", "")) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartLabel", "$this-definition(pyLabel)", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartLabel", "param.SmartInfoHeader", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
}
}
private boolean when_4(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (((tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam1), aParam2))));
}
private boolean when_3(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || ((((!(tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam1), aParam2))))));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
tools.appendString(" ");
if (!foundChoice && when_3("ReadOnlySmartInfo", "")) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartInfoSection", "param.ReadOnlySmartInfo", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
tools.appendString(" ");
if (!foundChoice && when_4("ReadWriteSmartInfo", "")) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartInfoSection", "param.ReadWriteSmartInfo", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
tools.putSaveValue("SmartInfoSection", "");
tools.appendString(" ");
}
}
private static final String[] showMeParams_2 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Final", "", "Pega-Gadgets", "08-05-01", "", "SmartInfoPopupInclude", "", "RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT" };
/**
 * Implements a pega:lookup tag.
 */private boolean _jspx_meth_pega_lookup__1(PageContext aPageContext, java.lang.String aProperty, java.lang.String aValue) throws Throwable {
/* pega:lookup */
com.pega.pegarules.jsptags.LookupTag _jspx_th_pega_lookup_ = (com.pega.pegarules.jsptags.LookupTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.LookupTag.class);
_jspx_th_pega_lookup_.setPageContext(pageContext);
_jspx_th_pega_lookup_.setParent(mParentTag);
_jspx_th_pega_lookup_.setProperty(aProperty);
_jspx_th_pega_lookup_.setValue(aValue);
int _jspx_eval_pega_lookup_ = _jspx_th_pega_lookup_.doStartTag();
if (_jspx_th_pega_lookup_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_lookup_);
return false;
}
private static final String[] showMeParams_1 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYMESSAGELABEL!LOADING... #20180713T131654.066 GMT", "Rule-Obj-FieldValue", "Pega-WB", "pyMessageLabel", "Code-Pega-Requestor", "Loading..." };
private void performStream_1() throws Throwable {
tools.appendString("<script> var strLoadMsg = \"");

/* Field value Code-Pega-Requestor pxRequestor.pyMessageLabel Loading... */
if (mInline_pxRequestor) {
	out.write("Loading...");
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_1);
} else {
if (_jspx_meth_pega_lookup__1(pageContext, "pxRequestor.pyMessageLabel", "Loading...")) {
	return;
}
}
tools.appendString("\"; </script>");
}
private static final Map oPropDefinitions_5 = new HashMap();
static {
	oPropDefinitions_5.put("Code-Pega-Requestor.pyMessageLabel", new LiteweightPropertyDefinition("Code-Pega-Requestor", "pyMessageLabel", "siN", false, true, "Default", false));
}
private static final Map oStreamProperties_5 = new HashMap();
static {
	oStreamProperties_5.put("pyRuleAvailable", "Final");
	oStreamProperties_5.put("pyCircumstanceDateProp", "");
	oStreamProperties_5.put("pyCircumstanceVal", "");
	oStreamProperties_5.put("pyMethodStatus", "Internal");
	oStreamProperties_5.put("pyClassName", "");
	oStreamProperties_5.put("pyCircumstanceProp", "");
	oStreamProperties_5.put("pzInsKey", "RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT");
	oStreamProperties_5.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_5.put("pyCircumstanceDate", "");
	oStreamProperties_5.put("pyRuleEnds", "");
	oStreamProperties_5.put("pyRuleStarts", "");
	oStreamProperties_5.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_5.put("pyXMLType", "");
	oStreamProperties_5.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_5.put("pyCorrType", "");
	oStreamProperties_5.put("pyStreamName", "pzSetStrLoadMsg");
	oStreamProperties_5.put("pyRuleSetVersion", "08-05-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT	Pega-Gadgets:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT
 * Set up context.
 */
final String prevRuleKey_5 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT";final String prevClass_5 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_4)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_5);
	mStreamResponse.setJspBaseClass(prevClass_5);
	pz_CurrentRuleKey = prevRuleKey_5;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_4,true);
}
/* end RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__1(PageContext aPageContext, java.lang.String aType, java.lang.String aApp) throws Throwable {
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
	IStaticContentRuntime pzStatic__2 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__2.addFile("pzpega_ui_smartinfo", "13318087721", "js");
tools.appendString(" ");
	IStaticContentRuntime pzStatic__4 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__4.addFile("smartinfopopup", "1421806147", "js");
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT */
include_1();

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
 * OnlyOnce condition: StreamIncluded_SmartInfo_Script
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("StreamIncluded_SmartInfo_Script")) {
tools.appendString(" ");
if (_jspx_meth_pega_static__1(pageContext, "script", "webwb")) {
	return;
}
tools.appendString(" ");
}
}
private void performStream_2() throws Throwable {
onlyOnce_1();
}
private static final Map oPropDefinitions_4 = null;
private static final Map oStreamProperties_4 = new HashMap();
static {
	oStreamProperties_4.put("pyRuleAvailable", "Final");
	oStreamProperties_4.put("pyCircumstanceDateProp", "");
	oStreamProperties_4.put("pyCircumstanceVal", "");
	oStreamProperties_4.put("pyMethodStatus", "");
	oStreamProperties_4.put("pyClassName", "");
	oStreamProperties_4.put("pyCircumstanceProp", "");
	oStreamProperties_4.put("pzInsKey", "RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT");
	oStreamProperties_4.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_4.put("pyCircumstanceDate", "");
	oStreamProperties_4.put("pyRuleEnds", "");
	oStreamProperties_4.put("pyRuleStarts", "");
	oStreamProperties_4.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_4.put("pyXMLType", "");
	oStreamProperties_4.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_4.put("pyCorrType", "");
	oStreamProperties_4.put("pyStreamName", "SmartInfoPopupInclude");
	oStreamProperties_4.put("pyRuleSetVersion", "08-05-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT	Pega-Gadgets:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT
 * Set up context.
 */
final String prevRuleKey_4 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT";final String prevClass_4 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_3)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_2();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_4);
	mStreamResponse.setJspBaseClass(prevClass_4);
	pz_CurrentRuleKey = prevRuleKey_4;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_3,true);
}
/* end RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_2);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_3() throws Throwable {
	if (when_2("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT */
include_2();

tools.appendString(" ");
	}
tools.appendString(" ");
choose_1();
tools.appendString("  ");
choose_2();
tools.appendString("  ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue("SmartInfoSection"), ""))) {
tools.appendString(" <SPAN id=\"SI\" class=\"smartInfo\" si_usingpage='' si_headertext= '");
out.print(tools.getLocalizedTextForString("pyLabel", tools.getSaveValue("SmartLabel") ) );
tools.appendString(" ' si_sectionname = '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(SmartInfoSection)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(SmartInfoSection)")) {
	return;
}
tools.appendString("' name='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-definition(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-definition(pyPropertyName)")) {
	return;
}
tools.appendString("' > ");
	}
}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "Internal");
	oStreamProperties_3.put("pyClassName", "");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "StartSmartField");
	oStreamProperties_3.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Data_Admin_Operator_ID_StartSmartField
 */
private void property_Data_Admin_Operator_ID_StartSmartField() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_3 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_3);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_3);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_2)) {
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_2,true);
}
/* end RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT
 */
private void include_3() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_Operator_ID_StartSmartField();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_2(String aParam1, String aParam2, String aParam3, String aParam4) throws Throwable {
	return (pega.isPreviewMode() || ((!areValsEqual(tools.getParamValue(aParam1), aParam2)) || (!areValsEqual(tools.getParamValue(aParam3), aParam4))));
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
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || ((areValsEqual(tools.getSaveValue(aParam1), aParam2)) && ((tools.useModeInput()))));
}
private static final String[] showMeParams_11 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYACTIONPROMPT!CALENDAR #20180713T131646.140 GMT", "Rule-Obj-FieldValue", "Pega-WB", "pyActionPrompt", "Code-Pega-Requestor", "Calendar" };
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__2(PageContext aPageContext, java.lang.String aType, java.lang.String aApp) throws Throwable {
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
tools.appendString("\n\t\t\t\t\t\t\t");
	IStaticContentRuntime pzStatic__6 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__6.addBundle("pega_ui_datetimecalendar", "1222888513");
tools.appendString("\n\t\t\t\t\t\t");
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
 * OnlyOnce condition: DateTime
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_2() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("DateTime")) {
tools.appendString("\n\t\t\t\t\t\t");
if (_jspx_meth_pega_static__2(pageContext, "script", "webwb")) {
	return;
}
tools.appendString("\t\t\t\t\t\t\n\t\t\t\t\t");
}
}
private void performStream_9() throws Throwable {
	if (when_1("prepareForDataGrid", "true")) {
tools.appendString("\n<script>\nfunction DateTime_getValue(){\n\tvar ID=\"cal");

/*
 * reference tag
 * Cannot inline because: mode is "text"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "text")) {
	return;
}
tools.appendString("Field\"\n\tvar field = document.getElementById(ID); \n\tif (field){\n\t\treturn field.value;\n\t}\n\telse{\n\t\treturn \"\";\n\t}\n}\nfunction DateTime_setValue(val){\n\tvar ID=\"cal");

/*
 * reference tag
 * Cannot inline because: mode is "text"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "text")) {
	return;
}
tools.appendString("Field\"\n\tvar field = document.getElementById(ID); \n\tif (field){\n\t\tfield.value = val;\n\t}\n}\nfunction DateTime_setFocus(){\n\tvar ID=\"cal");

/*
 * reference tag
 * Cannot inline because: mode is "text"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "text")) {
	return;
}
tools.appendString("Field\"\n\tvar field = document.getElementById(ID); \n\tif ((field.tagName == \"INPUT\") || (field.tagName == \"input\")){\n\t\tfield.focus();\n\t}\n}\n</script>\n");
	}
tools.appendString("\n\n");
	if (when_2("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString("\n\t");
/* Include stream RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT */
include_3();

tools.appendString("\n");
	}
tools.appendString("\n\n");
	boolean foundChoice_1 = false;
tools.appendString("\n    ");
if (!foundChoice_1 && (pega.isPreviewMode() || !tools.getDictionary().fromDefinition(tools.getActive(), "pyExpectedSize").equals(""))) {
tools.appendString("\n        \n\t");
 
	tools.putSaveValue("pzResult", ""); //Bug-11491 : reset the save variable
	float expSize = 0;
	try{
		expSize  = (float)Integer.parseInt(tools.getDictionary().fromDefinition(tools.getActive(), "pyExpectedSize"));
		expSize += java.lang.Math.ceil(expSize*20/100);
	} catch(NumberFormatException e){
		/* Use zero. */
	}
	String strExpectedSize = (int)expSize + "";
	tools.putSaveValue("strExpectedSize",strExpectedSize);
	
tools.appendString("\n    ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString("\n    ");
if (!foundChoice_1 && when_6("Size", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("strExpectedSize", "param.Size", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString("\n    ");
if (!foundChoice_1) {
tools.appendString("\n\t");
tools.putSaveValue("strExpectedSize", "");
tools.appendString("\n    ");
}
tools.appendString("\n\n\n");
pzAuto.putSaveRef("strExpectedWidth", "param.Width", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\n");

       String strExpectedSize = tools.getSaveValue("strExpectedSize");
       if(strExpectedSize != ""){
              String strActualSize = tools.getSaveValue("strExpectedSize");
              tools.putSaveValue("strExpectedSize",strActualSize);
       }

       String strInputWidth = "";
       String strTDWidth = "";
       String strExpectedWidth = tools.getSaveValue("strExpectedWidth");

       if( strExpectedWidth != ""){
              if( strExpectedWidth.endsWith("px") ){ /* Pixel-based */
                     String strTableWidth = "";
                     int index = strExpectedWidth.indexOf("px");
                     String subStr = strExpectedWidth.substring(0,index);
                     tools.putSaveValue("subStr", subStr);           
                     strInputWidth = (Integer.parseInt(tools.getSaveValue("subStr")) - 21) + "px";
                     tools.putSaveValue("strExpectedWidth",strTableWidth);
              }      
              else if( strExpectedWidth.endsWith("%") ){ /* Percentage-based */
                     strInputWidth = "100%";
                     strTDWidth = "100%";
                     tools.putSaveValue("strExpectedWidth",strExpectedWidth);
              }
              else if ( strExpectedWidth.indexOf("auto") >= 0) { /* auto */
                     strInputWidth = "auto";
                     strTDWidth = "auto";
                     tools.putSaveValue("strExpectedWidth","auto");
              }
       }



       tools.putSaveValue("strInputWidth",strInputWidth);
       tools.putSaveValue("strTDWidth",strTDWidth);

tools.appendString("\n\n");

	boolean HP_DT_ShowTime = false;
	// Setting up HP_DT_ShowTime -- This change was made to fix Bug-8691		
	HP_DT_ShowTime = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"WithTime");
	if(tools.getActive().getType() == PropertyInfo.TYPE_DATE)
		HP_DT_ShowTime = false; //tools.putParamValue( "WithTime", "true" );
	else if (tools.getActive().getType() == PropertyInfo.TYPE_DATETIME)
	{
		if (tools.getParamValue("WithTime").length() == 0)
			HP_DT_ShowTime = true;
		else
			HP_DT_ShowTime = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"WithTime");
	} 

tools.appendString("\n\n");
	boolean foundChoice_2 = false;
tools.appendString("\n\t");
if (!foundChoice_2 && (pega.isPreviewMode() || ((invokeWhenRule(tools, "UseAccessibleDate"))))) {
tools.appendString("\n\t\t");
	boolean foundChoice_3 = false;
tools.appendString("\n\t\t\t");
if (!foundChoice_3 && (pega.isPreviewMode() || HP_DT_ShowTime && tools.getActive().getType() == PropertyInfo.TYPE_DATETIME)) {
tools.appendString("\n\t\t\t\t");
/* Include stream RULE-HTML-PROPERTY SELECTDATETIME #20180713T133438.043 GMT */
include_7();

tools.appendString("\n\t\t\t");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString("\n\t\t\t");
if (!foundChoice_3) {
tools.appendString("\n\t\t\t\t");
/* Include stream RULE-HTML-PROPERTY SELECTDATE #20180713T133438.035 GMT */
include_8();

tools.appendString("\n\t\t\t");
}
tools.appendString("\n\t\t\t\t\n\t");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString("\n\t");
if (!foundChoice_2) {
tools.appendString("\n\t\t\n\t\t");

					
		if( tools.getParamValue( "CalendarIcon" ).length() == 0 )
			tools.putParamValue( "CalendarIcon", "true" );

		if( tools.getParamValue( "DisplayMode" ).length() == 0 )
			tools.putParamValue( "DisplayMode", "popup" );

		if( tools.getParamValue( "TextFieldDisabled" ).length() == 0 )
			tools.putParamValue( "TextFieldDisabled", "false" );
		
tools.appendString("\n\n\t\t");
	boolean foundChoice_15 = false;
tools.appendString("\n\t\t\t");
if (!foundChoice_15 && (pega.isPreviewMode() || HP_DT_ShowTime && tools.getActive().getType() == PropertyInfo.TYPE_DATETIME)) {
tools.appendString("\n\t\t");

		ClipboardProperty curProp = tools.getActive();
		if ( (curProp.getType() == PropertyInfo.TYPE_DATETIME || curProp.getType() == PropertyInfo.TYPE_DATE) && curProp.size() > 0 && curProp.hasValidValue() && curProp.toDate()!=null)  {
			String sDatetime="";
			String type = tools.getParamValue("DateTimeFormat");
			String strTimeZone = "GMT";
			if(curProp.getType() == PropertyInfo.TYPE_DATETIME){
				strTimeZone = tools.findPage("pxRequestor").getString(".pyUseTimeZone");
			}

			if(type.equals("1")){//DateTime-Short 
				sDatetime = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATETIME_SHORT, curProp.toDate()); 
			}
			else if(type.equals("2") || type.equals("")){ //DateTime-Short-YYYY 
				sDatetime = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATETIME_SHORT_YYYY, curProp.toDate()); 
			}
			else if(type.equals("3")){ //DateTime-Default or DateTime-Medium 
				sDatetime = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATETIME_DEFAULT, curProp.toDate()); 	
			}
			else if(type.equals("4") ){ //DateTime-Long
				sDatetime = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATETIME_LONG, curProp.toDate()); 
			}
			else if(type.equals("5")){ //DateTime-Full
				sDatetime = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATETIME_FULL, curProp.toDate()); 
			}
          	String shortDateTimeFormat = com.pega.pegarules.pub.util.PRDateFormat.getShortDateTimeFormat(null);
          	String shortResult = PRDateFormat.format(null, strTimeZone, shortDateTimeFormat, curProp.toDate());
          	tools.putSaveValue("shortResult",shortResult);
			tools.putSaveValue("result",sDatetime);
          	
		}
		else {
			String sDatetime="";
			Date tempDate = PRDateFormat.parseInternalDateTime(tools.getActiveValue());
			if(tempDate != null)//Check if its a valid date time
			{

				String type = tools.getParamValue("DateTimeFormat");
				String strTimeZone = tools.findPage("pxRequestor").getString(".pyUseTimeZone");	
	
				if(type.equals("1")){//DateTime-Short 
					sDatetime = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATETIME_SHORT, curProp.toDate()); 
				}
				else if(type.equals("2") || type.equals("")){ //DateTime-Short-YYYY 
					sDatetime = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATETIME_SHORT_YYYY, curProp.toDate()); 
				}
				else if(type.equals("3")){ //DateTime-Default or DateTime-Medium 
					sDatetime = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATETIME_DEFAULT, curProp.toDate()); 	
				}
				else if(type.equals("4") ){ //DateTime-Long
					sDatetime = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATETIME_LONG, curProp.toDate()); 
				}
				else if(type.equals("5")){ //DateTime-Full
					sDatetime = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATETIME_FULL, curProp.toDate()); 
				}		
				String shortDateTimeFormat = com.pega.pegarules.pub.util.PRDateFormat.getShortDateTimeFormat(null);
                String shortResult = PRDateFormat.format(null, strTimeZone, shortDateTimeFormat, curProp.toDate());
                tools.putSaveValue("shortResult",shortResult);
				tools.putSaveValue("result",sDatetime); 
			}
			else{
			tools.putSaveValue("result",tools.getActiveValue()); 
		 	}
		     }
		
tools.appendString("\n\t\t");

foundChoice_15 = !pega.isPreviewMode();
}
tools.appendString("\n\t\t");
if (!foundChoice_15) {
tools.appendString("\n\t\t");

		ClipboardProperty curProp = tools.getActive();
		if ( (curProp.getType() == PropertyInfo.TYPE_DATE || curProp.getType() == PropertyInfo.TYPE_DATETIME) && curProp.size() > 0 && curProp.hasValidValue() && curProp.toDate()!=null)  {
			String sDate="";
			String type = tools.getParamValue("DateFormat");
			
			String strTimeZone = "GMT";
			if(curProp.getType() == PropertyInfo.TYPE_DATETIME){
				strTimeZone = tools.findPage("pxRequestor").getString(".pyUseTimeZone");
			}

			if(type.equals("1")){ //Date-Short
				sDate = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATE_SHORT_YY , curProp.toDate()); 
			}
			else if(type.equals("2") || type.equals("")){ //Date-Short-Default
				sDate = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATE_SHORT_YYYY, curProp.toDate());	
			}		
			else if(type.equals("3") ){ //Date-Medium
				sDate = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATE_MEDIUM , curProp.toDate()); 
			}		
			else if(type.equals("4")){ //Date-Long
				sDate = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATE_LONG , curProp.toDate()); 
			}
			else if(type.equals("5")){ //Date-Full
				sDate = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATE_FULL , curProp.toDate()); 
			}
			String shortDateFormat = com.pega.pegarules.pub.util.PRDateFormat.getShortDateFormat(null);
          	String shortResult = PRDateFormat.format(null, strTimeZone, shortDateFormat, curProp.toDate());
            tools.putSaveValue("shortResult",shortResult);
			tools.putSaveValue("result",sDate); 
		}
		else {
			String sDate="";
			Date tempDate= PRDateFormat.parseInternalDate(tools.getActiveValue());
			
			String strTimeZone = tools.findPage("pxRequestor").getString(".pyUseTimeZone");

			if(tempDate != null){
				String type = tools.getParamValue("DateFormat");
				if(type.equals("1")){ //Date-Short
					sDate = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATE_SHORT_YY , curProp.toDate()); 
				}
				else if(type.equals("2") || type.equals("")){ //Date-Short-Default
					sDate = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATE_SHORT_YYYY, curProp.toDate());	
				}		
				else if(type.equals("3") ){ //Date-Medium
					sDate = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATE_MEDIUM , curProp.toDate()); 
				}		
				else if(type.equals("4")){ //Date-Long
					sDate = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATE_LONG , curProp.toDate()); 
				}
				else if(type.equals("5")){ //Date-Full
					sDate = PRDateFormat.format(null, strTimeZone, PRDateFormat.DEFAULT_DATE_FULL , curProp.toDate()); 
				}
				String shortDateFormat = com.pega.pegarules.pub.util.PRDateFormat.getShortDateFormat(null);
                String shortResult = PRDateFormat.format(null, strTimeZone, shortDateFormat, curProp.toDate());
                tools.putSaveValue("shortResult",shortResult);
                tools.putSaveValue("result",sDate); 
			}else{
				
			tools.putSaveValue("result",tools.getActive().getStringValue()); 
			}
		}
		
tools.appendString("\n\t\t");
}
tools.appendString("\n\t\t\n\n\t\t");
	boolean foundChoice_16 = false;
tools.appendString("\n\t\t\t");
if (!foundChoice_16 && (pega.isPreviewMode() || tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"CalculatedValue"))) {
tools.appendString("\n\n\t\t\t\t\n\t\t\t\t<SPAN nowrap>\n\t\t\t\t");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_5();

tools.appendString("\n\t\t\t\t<SPAN id=\"CV\" name=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\" size=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strExpectedSize)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strExpectedSize)")) {
	return;
}
tools.appendString("\"\n\t\t\t\t\tRHP_NAME=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$stream-definition(pyStreamName)", "NORMAL")) {
	return;
}
tools.appendString("!DateTimeFormat=");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__2(pageContext, "param.DateTimeFormat")) {
	return;
}
tools.appendString("!Size=");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__2(pageContext, "param.Size")) {
	return;
}
tools.appendString("!CalculatedValue=");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__2(pageContext, "param.CalculatedValue")) {
	return;
}
tools.appendString("\" class='dataLabelCalculatedValue' >\n\t\t\t\t\t");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(result)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(result)")) {
	return;
}
tools.appendString("</span>\n\t\t\t\t</SPAN>\n\t\t\t");

foundChoice_16 = !pega.isPreviewMode();
}
tools.appendString("\n\t\t\t");
if (!foundChoice_16) {
tools.appendString("\n\t\t\t\t");
	boolean foundChoice_17 = false;
tools.appendString("\n\t\t\t\t\t");
if (!foundChoice_17 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString("\n\t\t\t\t\t\t");
	boolean foundChoice_18 = false;
tools.appendString("\n\t\t\t\t\t\t\t");
if (!foundChoice_18 && (pega.isPreviewMode() || tools.getParamValue("DisplayMode").equals("window"))) {
tools.appendString("\n\n\t\t\t\t\t\t\t\t<SPAN nowrap style=\"vertical-align : text-bottom;white-space:nowarp;\">\n\t\t\t\t\t\t\t\t ");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_5();

tools.appendString("\n\n\t\t\t\t\t\t\t\t<table id=\"SL_Table\" cellpadding=0 cellspacing=0 border=0 style='width:");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strExpectedWidth)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strExpectedWidth)")) {
	return;
}
tools.appendString("'>\n\t\t\t\t\t\t\t\t<tr><td id=\"SL_Input\" style='width:");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strTDWidth)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strTDWidth)")) {
	return;
}
tools.appendString("' ><input size=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strExpectedSize)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strExpectedSize)")) {
	return;
}
tools.appendString("\"\n\t\t\t\t\t\t\t\t\t ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_4();

tools.appendString(" type=\"text\" \n\t\t\t\t\t\t\t\t\tname=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\"\n\t\t\t\t\t\t\t\t\tID=\"cal");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("Field\" \n\t\t\t\t\t\t\t\t\tvalue=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(result)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(result)")) {
	return;
}
tools.appendString("\"\n                                    ");
	if (pega.isPreviewMode() || !(tools.getSaveValue("result")).equals(tools.getSaveValue("shortResult"))) {
tools.appendString("\n                                      data-shortvalue = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(shortResult)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(shortResult)")) {
	return;
}
tools.appendString("\"\n                                    ");
	}
tools.appendString("\n\t\t\t\t\t\t\t\t\tstyle='width:");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strInputWidth)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strInputWidth)")) {
	return;
}
tools.appendString("' >\n\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t           ");
	if (pega.isPreviewMode() || tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"CalendarIcon")) {
tools.appendString("\n\t\t\t\t\t\t\t\t\t\t\t<td style=\"font-size: 2pt;\">&nbsp;</td><td><a href=\"javascript:void(0);\" id=\"calendarIcon\" class=\"iconCalendar\" style=\"display: -moz-inline-box; display: -webkit-inline-box;display: inline-block;\" onmouseover=\"this.className='iconCalendar_on'\" onmouseout=\"this.className='iconCalendar'\" onclick='if(typeof(icon");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("Clicked)!=\"undefined\")icon");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("Clicked();else body.onbeforeunload=null;'title='");

/* Field value Code-Pega-Requestor pxRequestor.pyActionPrompt Calendar */
if (mInline_pxRequestor) {
	out.write("Calendar");
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_11);
} else {
if (_jspx_meth_pega_lookup__1(pageContext, "pxRequestor.pyActionPrompt", "Calendar")) {
	return;
}
}
tools.appendString("' >&nbsp;\n\n\t\t\t\t\t\t\t\t\t\t\t</a></td>\n\t\t\t\t\t\t\t\t\t   ");
	}
tools.appendString("\n\t\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t</SPAN>\n\n\t\t\t\t\t\t\t\t<script>\n\t\t\t\t\t\t\t\tfunction icon");

/*
 * reference tag
 * Cannot inline because: mode is "text"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "text")) {
	return;
}
tools.appendString("Clicked ( )\n\t\t\t\t\t\t\t\t{\n\t\t\t\t\t\t\t\t\twindow.dateField = document.getElementById( \"cal");

/*
 * reference tag
 * Cannot inline because: mode is "text"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "text")) {
	return;
}
tools.appendString("Field\" );\n\t\t\t\t\t\t\t\t\tif (window.dateField) {\n\t\t\t\t\t\t\t\t\t\twindow.dateFieldName = window.dateField.name;\n\t\t\t\t\t\t\t\t\t}\n\n\t\t\t\t\t\t\t\t");
	boolean foundChoice_19 = false;
tools.appendString("\n\t\t\t\t\t\t\t\t\t");
if (!foundChoice_19 && (pega.isPreviewMode() || HP_DT_ShowTime)) {
tools.appendString("\n\n\t\t\t\t\t\t\t\t//\t\tvar url = \"");
if (_jspx_meth_pega_url__1(pageContext, "pyActivity=Work-.ShowCalendar&CalendarHTML=NewCalendarDateTime")) {
	return;
}
tools.appendString("\";\n\t\t\t\t\t\t\t\t");

								if(tools.getParamValue( "DateTimeFormat" ).length() == 0 )
									tools.putParamValue("DateTimeFormat", 2);
								
tools.appendString("\n\t\t\t\t\t\t\t\tvar url = SafeURL_createFromURL('");
out.print(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread","pyActivity=ShowCalendar"));
tools.appendString("');\n\t\t\t\t\t\t\t\turl.put(\"CalendarHTML\", \"NewCalendarDateTime\");\n\t\t\t\t\t\t\t\turl.put(\"DateFormat\", ");
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("DateTimeFormat")) );
tools.appendString(" );\n\t\t\t\t\t\t\t\topenUrlInWindow( url, 'Calendar','status=yes,toolbar=no,menubar=no,location=no,scrollbars=yes,resizable=yes,WIDTH=250,HEIGHT=350' );\n\n\t\t\t\t\t\t\t\t\t");

foundChoice_19 = !pega.isPreviewMode();
}
tools.appendString("\n\t\t\t\t\t\t\t\t\t");
if (!foundChoice_19) {
tools.appendString("\n\n\t\t\t\t\t\t\t\t//\t\tvar url = \"");
if (_jspx_meth_pega_url__1(pageContext, "pyActivity=Work-.ShowCalendar&CalendarHTML=NewCalendarDate")) {
	return;
}
tools.appendString("\";\n\t\t\t\t\t\t\t\t");

								if(tools.getParamValue( "DateFormat" ).length() == 0 )
									tools.putParamValue("DateFormat", 2);
								
tools.appendString("\n                var url = SafeURL_createFromURL('");
out.print(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread","pyActivity=ShowCalendar"));
tools.appendString("');\n\t\t\t\t\t\t\t\turl.put(\"CalendarHTML\", \"NewCalendarDate\");\n\t\t\t\t\t\t\t\turl.put(\"DateFormat\", ");
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("DateFormat")) );
tools.appendString(" );\n\n\t\t\t\t\t\t\t\topenUrlInWindow( url, 'Calendar','status=yes,toolbar=no,menubar=no,location=no,scrollbars=yes,resizable=yes,WIDTH=250,HEIGHT=350' );\n\n\t\t\t\t\t\t\t\t\t");
}
tools.appendString("\n\t\t\t\t\t\t\t\t\n\n\t\t\t\t\t\t\t\t//\tvar popWindow = window.open( url, 'Calendar','status=yes,toolbar=no,menubar=no,location=no,scrollbars=yes,resizable=yes,WIDTH=250,HEIGHT=350');\n\n\t\t\t\t\t\t\t\t}\n\n\t\t\t\t\t\t\t\t</script>\n\t\t\t\t\t");

foundChoice_18 = !pega.isPreviewMode();
}
tools.appendString("\n\n\t\t\t\t\t");
if (!foundChoice_18) {
tools.appendString("\n\t\t\t\t\t");
onlyOnce_2();
tools.appendString("\t\n\t\t\t\t");
	boolean foundChoice_20 = false;
tools.appendString("\n\t\t\t\t\t");
if (!foundChoice_20 && (pega.isPreviewMode() || tools.getParamValue("DisplayMode").equals("embedded"))) {
tools.appendString("\n\t\t\t\t\t\t<SPAN nowrap style=\"vertical-align : text-bottom\">\n\t\t\t\t\t");

foundChoice_20 = !pega.isPreviewMode();
}
tools.appendString("\n\t\t\t\t\t");
if (!foundChoice_20) {
tools.appendString("\n\t\t\t\t\t\t<SPAN nowrap style=\"vertical-align : text-bottom\" id='cal");

/*
 * reference tag
 * Cannot inline because: mode is "text"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "text")) {
	return;
}
tools.appendString("MainContainer' >\n\t\t\t\t\t");
}
tools.appendString("\n\t\t\t\t\n\t\t\t\t\t\t ");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_5();

tools.appendString("\n\n\t\t\t\t\t\t<table id=\"SL_Table\" cellpadding=0 cellspacing=0 border=0 style='width:");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strExpectedWidth)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strExpectedWidth)")) {
	return;
}
tools.appendString("'>\n\t\t\t\t\t\t<tr><td id=\"SL_Input\" style='width:");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strTDWidth)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strTDWidth)")) {
	return;
}
tools.appendString("'><input size=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strExpectedSize)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strExpectedSize)")) {
	return;
}
tools.appendString("\"\n\t\t\t\t\t\t\t\t ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_4();

tools.appendString(" type=\"text\" \n\t\t\t\t\t\t\tname=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\"\n\t\t\t\t\t\t\tID=\"cal");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("Field\" \n\t\t\t\t\t\t\tvalue=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(result)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(result)")) {
	return;
}
tools.appendString("\"\n                          \t");
	if (pega.isPreviewMode() || !(tools.getSaveValue("result")).equals(tools.getSaveValue("shortResult"))) {
tools.appendString("\n                              data-shortvalue = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(shortResult)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(shortResult)")) {
	return;
}
tools.appendString("\"\n                          \t");
	}
tools.appendString("\n\t\t\t\t\t\t\tstyle='width:");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strInputWidth)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strInputWidth)")) {
	return;
}
tools.appendString("' >\n\t\t\t\t\t\t\t</td>\n\n\t\t\t\t\t\t\t");
	if (pega.isPreviewMode() || tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"CalendarIcon")) {
tools.appendString("\n\n\t\t\t\t\t\t\t\t<td style=\"font-size: 2pt;\">&nbsp;</td><td><a href=\"javascript:void(0);\" id='cal");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("Icon' class=\"iconCalendar\" style=\"display: -moz-inline-box;display: -webkit-inline-box;display: inline-block;\" onmouseover=\"this.className='iconCalendar_on'\" onmouseout=\"this.className='iconCalendar'\"  title='");

/* Field value Code-Pega-Requestor pxRequestor.pyActionPrompt Calendar */
if (mInline_pxRequestor) {
	out.write("Calendar");
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_11);
} else {
if (_jspx_meth_pega_lookup__1(pageContext, "pxRequestor.pyActionPrompt", "Calendar")) {
	return;
}
}
tools.appendString("' >&nbsp;</a></td>\n\n\n\t\t\t\t<!--\n\t\t\t\t\t\t\t\t\t\t\t<td style=\"font-size: 2pt;\">&nbsp;</td><td><span id='cal");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("Icon' class=\"iconCalendar\" style=\"padding:0px 5px 0px 3px\" onmouseover=\"this.className='iconCalendar_on'\" onmouseout=\"this.className='iconCalendar'\"></span></td>\n\t\t\t\t-->\n\n\t\t\t\t\t\t\t");
	}
tools.appendString("\n\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</SPAN>\n\t\t\t\t\t\t");
	if (pega.isPreviewMode() || tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"TextFieldDisabled")) {
tools.appendString("\n\t\t\t\t\t\t<script>\n\t\t\t\t\t\t\tdocument.getElementById( \"cal");

/*
 * reference tag
 * Cannot inline because: mode is "text"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "text")) {
	return;
}
tools.appendString("Field\" ).disabled = true;\n\t\t\t\t\t\t</script>\n\t\t\t\t\t\t");
	}
tools.appendString("\n\n\t\t\t\t\t\t");
	boolean foundChoice_21 = false;
tools.appendString("\n\t\t\t\t\t\t\t");
if (!foundChoice_21 && (pega.isPreviewMode() || tools.getParamValue("DisplayMode").equals("embedded"))) {
tools.appendString("\n\n\t\t\t\t\t\t\t\t<script>\n\t\t\t\t\t\t\t\t\tdocument.getElementById( \"cal");

/*
 * reference tag
 * Cannot inline because: mode is "text"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "text")) {
	return;
}
tools.appendString("Field\" ).style.display = \"none\";\n\n\t\t\t\t\t\t\t\t\t");
	if (pega.isPreviewMode() || tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"CalendarIcon")) {
tools.appendString("\n\t\t\t\t\t\t\t\t\t\tdocument.getElementById( \"cal");

/*
 * reference tag
 * Cannot inline because: mode is "text"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "text")) {
	return;
}
tools.appendString("Icon\" ).style.display = \"none\";\n\t\t\t\t\t\t\t\t\t");
	}
tools.appendString("\n\n\t\t\t\t\t\t\t\t</script>\n\n\t\t\t\t\t\t\t\t<div id='cal");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("Container' style='position:relative; display:block'></div>\n\t\t\t\t\t\t\t");

foundChoice_21 = !pega.isPreviewMode();
}
tools.appendString("\n\t\t\t\t\t\t\t");
if (!foundChoice_21) {
tools.appendString("\n\t\t\t\t\t\t\t<!--  to show popup div on modal dialog Zindex is set to 3 bcos  modal dialog has zindex 2 . Now implemented usign javascript-->\n\t\t\t\n\n\t\t\t\t\t\t\t");
}
tools.appendString("\n\t\t\t\t\t\t\n\n\n\t\t\t\t\t<script type=\"text/javascript\">\n\t\t\t\t\t\n\t\t\t\t\t");
if (!pega.isResearchMode() && !pega.checkOnlyOnce("DateTimeScript")) {
tools.appendString("\n\t\t\t\t\t\t\t\t\t\t");

								tools.appendString("var localDateArray = new Array(");
								int end = 59;
								for(int i=0; i<= end; i++)
								{
									if( i == end )
										tools.appendString("'"+com.pega.pegarules.pub.util.PRNumberFormat.format(null, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null, i) + "');");
									else
										tools.appendString("'"+com.pega.pegarules.pub.util.PRNumberFormat.format(null, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null, i) + "',");
								};

								int firstDayOfWeek = (PRDateFormat.getFirstWeekDay(null) - 1);
								tools.appendString( "\nvar firstDayOfTheWeek = " + firstDayOfWeek + ";" );

								tools.appendString( "\nvar shortDateFormat = " +"\"" +com.pega.pegarules.pub.util.PRDateFormat.getShortDateFormat(null)+ "\""+ ";");
								tools.appendString( "\nvar shortDateTimeFormat = " +"\"" +com.pega.pegarules.pub.util.PRDateFormat.getShortDateTimeFormat(null)+ "\""+ ";");
								tools.appendString( "\nvar closeText = " + "\"" + tools.getLocalizedTextForString("pxRequestor.pyButtonLabel","Close") + "\";" );
								tools.appendString( "\nvar todayText = " + "\"" + tools.getLocalizedTextForString("pxRequestor.pyButtonLabel","Today") + "\";" );
								tools.appendString( "\nvar saveText = " + "\"" + tools.getLocalizedTextForString("pxRequestor.pyButtonLabel","Save") + "\";" );

								String months[] = PRDateFormat.getMonths(null);
								tools.appendString("\nvar longMonthArray = new Array(");
								for(int i=0; i < months.length; i++)
								{	if ( i != 0 )
										tools.appendString( "," );
								
									String month = months[i];

									if ( month.length() != 0 )
										month = ( month.substring( 0, 1 ).toUpperCase() + month.substring( 1, month.length() ) );

									tools.appendString("'" + month + "'" );
								};
								tools.appendString( ");" );

								tools.appendString("\nvar shortMonthArray = new Array(");
								for(int i=0; i < months.length; i++)
								{	if ( i != 0 )
										tools.appendString( "," );
								
									String month = months[i];

									if ( month.length() != 0 )
									{	month = month.substring( 0, 1 ).toUpperCase();

										int endIndex = (int)Math.min( months[i].length(), 3 );
										if ( endIndex > 1 )
											month += months[i].substring( 1, endIndex );
									}

									tools.appendString("'" + month + "'" );
								};
								tools.appendString( ");" );

								String initialWeekdays[] = PRDateFormat.getWeekdays(null);
								int daysInWeek = initialWeekdays.length;
								String[] weekdays = new String[daysInWeek];
								int count = 0;

								for(int startIndex = firstDayOfWeek; startIndex < daysInWeek; startIndex++)
									weekdays[count++] = initialWeekdays[startIndex];

								for(int startIndex2 = 0; startIndex2 < firstDayOfWeek; startIndex2++)
									weekdays[count++] = initialWeekdays[startIndex2];

								boolean comma = false;

								tools.appendString("\nvar oneCharDayArray = new Array(");
								for(int i=0; i < daysInWeek; i++)
								{	if ( weekdays[i] == null || weekdays[i].length() == 0 )
										continue;

									if ( comma )
										tools.appendString( "," );
								
									String day = ( weekdays[i].substring( 0, 1 ).toUpperCase() );
									tools.appendString("'" + day + "'" );
									comma = true;
								};
								tools.appendString( ");" );

								String initialShortWeekdays[] = PRDateFormat.getShortWeekdays(null);
								String shortWeekdays[] = new String[daysInWeek];
								count=0;
								for(int startIndex = firstDayOfWeek; startIndex < daysInWeek; startIndex++)
									shortWeekdays[count++] = initialShortWeekdays[startIndex];

								for(int startIndex2 = 0; startIndex2 < firstDayOfWeek; startIndex2++)
									shortWeekdays[count++] = initialShortWeekdays[startIndex2];
									
								comma = false;
								tools.appendString("\nvar shortDayArray = new Array(");
								for(int i=0; i < daysInWeek; i++)
								{	if ( shortWeekdays[i] == null || shortWeekdays[i].length() == 0 )
										continue;

									if ( comma )
										tools.appendString( "," );
								
									String day = ( shortWeekdays[i].substring( 0, 1 ).toUpperCase() + shortWeekdays[i].substring( 1, shortWeekdays[i].length() ) );
									tools.appendString("'" + day + "'" );
									comma = true;
								};
								tools.appendString( ");" );

								comma = false;
								tools.appendString("\nvar medDayArray = new Array(");
								for(int i=0; i < daysInWeek; i++)
								{	if ( weekdays[i] == null || weekdays[i].length() == 0 )
										continue;

									if ( comma )
										tools.appendString( "," );
								
									String day = ( weekdays[i].substring( 0, 1 ).toUpperCase() + weekdays[i].substring( 1, 3 ) );
									tools.appendString("'" + day + "'" );
									comma = true;
								};
								tools.appendString( ");" );

								comma = false;
								tools.appendString("\nvar longDayArray = new Array(");
								for(int i=0; i < daysInWeek; i++)
								{	if ( weekdays[i] == null || weekdays[i].length() == 0 )
										continue;

									if ( comma )
										tools.appendString( "," );
								
									String day = ( weekdays[i].substring( 0, 1 ).toUpperCase() + weekdays[i].substring( 1, weekdays[i].length() ) );
									tools.appendString("'" + day + "'" );
									comma = true;
								};
								tools.appendString( ");" );

								String ampm[] = PRDateFormat.getAmPmStrings(null);
								tools.appendString("\nvar ampmArray = new Array(");
								for(int i=0; i < ampm.length; i++)
								{	if ( i != 0 )
										tools.appendString( "," );
								
									tools.appendString("'" + ampm[i] + "'" );
								};
								tools.appendString( ");" );
							
tools.appendString("\n\n\t\t\t\t\t\t\t\tvar calendarType = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(CalendarType)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(CalendarType)")) {
	return;
}
tools.appendString("\";\n\t\t\t\t\t\t\t\tvar b12Hour = true;\n\t\t\t\t\t\t\t\tif (calendarType != \"Date\")\n\t\t\t\t\t\t\t\t{\tvar hourIndex  = shortDateTimeFormat.indexOf(\"hh\");\n\t\t\t\t\t\t\t\t\tif(hourIndex == -1)\n\t\t\t\t\t\t\t\t\t{\thourIndex = shortDateTimeFormat.indexOf(\"h\");\n\t\t\t\t\t\t\t\t\t\tif(hourIndex == -1)\n\t\t\t\t\t\t\t\t\t\t\t{\thourIndex = shortDateTimeFormat.indexOf(\"H\");\n\t\t\t\t\t\t\t\t\t\t\tb12Hour = false;\n\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t  \n\t\t\t\t\t\t\t\t\tvar ampmIndex = shortDateTimeFormat.indexOf(\"a\");\n\t\t\t\t\t\t\t\t\tif(ampmIndex == -1)\n\t\t\t\t\t\t\t\t\t\tb12Hour = false;\n\t\t\t\t\t\t\t\t}\n\n\t\t\t\t\t\t\t\t// Locale Specific Configuration\n\t\t\t\t\t\t\t\tpega.ui.Calendar.prototype.customConfig = function()\n\t\t\t\t\t\t\t\t{\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.SHORT_DATE_FORMAT = shortDateFormat;\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.SHORT_DATE_TIME_FORMAT = shortDateTimeFormat;\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.AMPM_TEXT = ampmArray;\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.MONTHS_SHORT = shortMonthArray;\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.MONTHS_LONG = longMonthArray;\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.WEEKDAYS_1CHAR = oneCharDayArray;\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.WEEKDAYS_SHORT = shortDayArray.slice(0);\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.WEEKDAYS_MEDIUM = medDayArray;\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.WEEKDAYS_LONG = longDayArray;\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.CLOSE_TEXT = closeText;\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.TODAY_TEXT = todayText;\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.SAVE_TEXT = saveText;\n\t\t\t\t\t\t\t\t\tthis.Config.Locale.LOCAL_DATE_ARRAY = localDateArray;\n\n\t\t\t\t\t\t\t\t\tthis.Config.Options.TWELVE_HOUR = b12Hour;\n\t\t\t\t\t\t\t\t\tthis.Config.Options.START_WEEKDAY = firstDayOfTheWeek;\n\t\t\t\t\t\t\t\t}\n\n\t\t\t\t\t\t\t\tvar showingPegaCal = null;\n\n\t\t\t\t\t\t\t\tfunction hideCurrentCalendar ( )\n\t\t\t\t\t\t\t\t{\tif ( showingPegaCal != null )\n\t\t\t\t\t\t\t\t\t{\tif ( showingPegaCal.clicked )\n\t\t\t\t\t\t\t\t\t\t\tshowingPegaCal.clicked = false;\n\t\t\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\t\t{\tshowingPegaCal.hide();\n\t\t\t\t\t\t\t\t\t\t\tshowingPegaCal = null;\n\t\t\t\t\t\t\t\t\t\t\tif(pega.u&&pega.u.d)\n\t\t\t\t\t\t\t\t\t\t\t\tpega.u.d.resizeHarness();\n\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t}\n\n\t\t\t\t\t\t\t\tfunction newCalendar_documentBodyClicked()\n\t\t\t\t\t\t\t\t{\thideCurrentCalendar();\n\t\t\t\t\t\t\t\t}\n\n\t\t\t\t\t\t\t\tdocument.body.onclick = function()\n\t\t\t\t\t\t\t\t{\tnewCalendar_documentBodyClicked();\n\t\t\t\t\t\t\t\t}\n\n\t\t\t\t\t\t\t\t/* BUG-95048, BUG-94411: START */\n\t\t\t\t\t\t\t\tvar _harnessContent = document.getElementById('HARNESS_CONTENT');\n\t\t\t\t\t\t\t\tif (_harnessContent) {\n\t\t\t\t\t\t\t\t\tpega.util.Event.addListener(_harnessContent, 'scroll', hideCurrentCalendar);\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tpega.util.Event.addListener(window, 'scroll', hideCurrentCalendar);\n\t\t\t\t\t\t\t\t/* BUG-95048, BUG-94411: END */\n\n\t\t\t\t\t\t\t\tvar pegaCalFirstInit = true;\n\t\t\t\t\t");
}
tools.appendString("\t\t\t\n\t\t\t\t\t\t\t");
 	
								if( tools.getParamValue( "DateTimeFormat" ).length() == 0 )
								tools.putParamValue( "DateTimeFormat", 2 );
								if( tools.getParamValue( "DateFormat" ).length() == 0 )
								tools.putParamValue( "DateFormat", 2 );
								ClipboardProperty curProp = tools.getActive();
								if((curProp.getType() == PropertyInfo.TYPE_DATE || curProp.getType() == PropertyInfo.TYPE_TEXT ) && StringUtils.crossScriptingFilter(tools.getParamValue("DateFormat")) != "" ) 							
									tools.appendString("var dateFormat = " + StringUtils.crossScriptingFilter( tools.getParamValue( "DateFormat" )) + ";");
								if (curProp.getType() == PropertyInfo.TYPE_DATETIME ||(curProp.getType() == PropertyInfo.TYPE_TEXT && StringUtils.crossScriptingFilter(tools.getParamValue("DateTimeFormat")) != ""  ))
									tools.appendString("var dateFormat = " + StringUtils.crossScriptingFilter( tools.getParamValue( "DateTimeFormat" ))+ ";");
							
tools.appendString("\n\n\t\n\t\t\t\t\t\t\tvar thisPropName = \"");

/*
 * reference tag
 * Cannot inline because: mode is "text"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "text")) {
	return;
}
tools.appendString("\";\n\t\t\t\t\t\t\t");
tools.putSaveValue("calName", "cal" + tools.getActive().getEntryHandle()); 
tools.appendString("\n\t\t\t\t\t\t\tvar calName = \"cal\"+thisPropName;\n\t\t\t\t\t\t\tvar dateField = document.getElementById( calName + \"Field\" );\n\n\t\t\t\t\t\t\tvar displayMode = \"");
out.print(tools.getParamValue("DisplayMode"));
tools.appendString("\";\n\n\n\t\t\t\t\t\t\ttry{\n\t\t\t\t\t\t\t\tvar ");
out.print(tools.getSaveValue("calName"));
tools.appendString(" = new pega.ui.Calendar( '");
out.print(tools.getSaveValue("calName"));
tools.appendString("', dateField, ");
out.print(HP_DT_ShowTime);
tools.appendString(",  displayMode, dateFormat);\n\t\t\t\t\t\t\t\t//eval( \"var \" + calName + \" = new pega.ui.Calendar( '\" + calName + \"', dateField, ");
out.print(HP_DT_ShowTime);
tools.appendString(", '\" + displayMode + \"' );\" );\n\t\t\t\t\t\t\n\t\t\t\t\t\t\t\tif ( dateField.value.length != 0 )\n\t\t\t\t\t\t\t\t\t");
out.print(tools.getSaveValue("calName"));
tools.appendString(".setDate( dateField.value );\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tcatch(exception){\n\t\t\t\t\t\t\t}\n\n\t\t\t\t\t\t\t</script>\n\n\t\t\t\t\t");
}
tools.appendString("\n\t\t\t\t\t\n\n\t\t\t\t\t");

foundChoice_17 = !pega.isPreviewMode();
}
tools.appendString("\n\t\t\t\t\t");
if (!foundChoice_17) {
tools.appendString("\n\t\t\t\t\t\n\t\t\t\t\t");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(result)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(result)")) {
	return;
}
tools.appendString("\n\t\t\t\t\t");
	if (when_7("prepareForDataGrid", "true")) {
tools.appendString("\n\t\t\t\t\t\t<span id=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(idPropertySpan)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(idPropertySpan)")) {
	return;
}
tools.appendString("\" style=\"display:none\">");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(result)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(result)")) {
	return;
}
tools.appendString("</span>\n\t\t\t\t\t");
	}
tools.appendString("\n\t\t\t\t\t");
}
tools.appendString("\n\t\t\t\t\n\t\t\t");
}
tools.appendString("\n\t\t\n\t");
}
tools.appendString("\n\n");
	if (when_2("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString("\n\t");
/* Include stream RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT */
include_6();

tools.appendString("\n");
	}
}
private static final Map oPropDefinitions_2 = new HashMap();
static {
	oPropDefinitions_2.put("Code-Pega-Requestor.pyActionPrompt", new LiteweightPropertyDefinition("Code-Pega-Requestor", "pyActionPrompt", "stN", false, true, "Default", false));
}
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "Internal");
	oStreamProperties_2.put("pyClassName", "");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-PROPERTY DATETIME #20200616T140954.638 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "DateTime");
	oStreamProperties_2.put("pyRuleSetVersion", "08-05-01");
}
/**
 * Generates stream property_Data_Admin_Operator_ID_DateTime
 */
private void property_Data_Admin_Operator_ID_DateTime() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY DATETIME #20200616T140954.638 GMT	Pega-Gadgets:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY DATETIME #20200616T140954.638 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY DATETIME #20200616T140954.638 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_1)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_9();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_2);
	mStreamResponse.setJspBaseClass(prevClass_2);
	pz_CurrentRuleKey = prevRuleKey_2;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,true);
}
/* end RULE-HTML-PROPERTY DATETIME #20200616T140954.638 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY DATETIME #20200616T140954.638 GMT
 */
private void include_9() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_Operator_ID_DateTime();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_10() throws Throwable {
tools.putParamValue("DateTimeFormat","4");
tools.appendString("\n");
/* Include stream RULE-HTML-PROPERTY DATETIME #20200616T140954.638 GMT */
include_9();

tools.appendString("\n");
tools.getParameterPage().remove("DateTimeFormat");
tools.appendString("\n");
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY DATETIME-LONG #20180713T132011.187 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProCom");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "DateTime-Long");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
	private boolean mInline_pxRequestor = false;
protected void initRequiredPages() {
	ClipboardPage cpCheck = null;
	cpCheck = tools.findPage("pxRequestor");
	mInline_pxRequestor = ((cpCheck != null) && (cpCheck.getClassName().equals("Code-Pega-Requestor")));
}
public void cleanForReuse(PegaAPI aContext) {
	tools = (StreamBuilderToolKit)aContext;
	pega = (com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext;
	if( pega != null ) {
		pzAuto = pega.getAutoStreamRuntime();
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
	if( pega != null ) pega.setTrackMissingProperties("Rule-HTML-Property");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_8 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT", "EndSmartField", "Pega-ProCom", "08-01-01", "20180713T132011.328 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_7 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT", "Messages", "Pega-UIDesign", "08-01-01", "20180713T133634.985 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_9 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY SELECTDATE #20180713T133438.035 GMT", "SelectDate", "Pega-Gadgets", "08-01-01", "20180713T133438.035 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_4 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT", "pzSetStrLoadMsg", "Pega-Gadgets", "08-05-01", "20200428T081054.535 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_3 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT", "SmartInfoPopupInclude", "Pega-Gadgets", "08-05-01", "20200428T081054.428 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_6 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT", "ClientValidation", "Pega-UIEngine", "08-02-01", "20181008T083757.252 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_5 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY SELECTDATETIME #20180713T133438.043 GMT", "SelectDateTime", "Pega-Gadgets", "08-01-01", "20180713T133438.043 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY DATETIME-LONG #20180713T132011.187 GMT", "DateTime-Long", "Pega-ProCom", "08-01-01", "20180713T132011.187 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT", "StartSmartField", "Pega-Gadgets", "08-01-01", "20180713T133438.113 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY DATETIME #20200616T140954.638 GMT", "DateTime", "Pega-Gadgets", "08-05-01", "20200616T140954.638 GMT");
}
