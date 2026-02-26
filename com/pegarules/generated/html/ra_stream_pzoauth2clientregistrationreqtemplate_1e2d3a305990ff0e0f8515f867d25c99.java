package com.pegarules.generated.html;
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
/**
 * Builds JSP stream RULE-APPLICATION!PZOAUTH2CLIENTREGISTRATIONREQTEMPLATE.
 */
public class ra_stream_pzoauth2clientregistrationreqtemplate_1e2d3a305990ff0e0f8515f867d25c99 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_HTML.pzOAuth2ClientRegistrationReqTemplate.Rule_Application.Stream");
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
	public ra_stream_pzoauth2clientregistrationreqtemplate_1e2d3a305990ff0e0f8515f867d25c99(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "ca9a9f34f86fd81a8fbe48b9182ba0f395c420a2";
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
/* Instance RULE-OBJ-HTML RULE-APPLICATION PZOAUTH2CLIENTREGISTRATIONREQTEMPLATE #20200228T105525.441 GMT	Pega-Desktop:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-HTML RULE-APPLICATION PZOAUTH2CLIENTREGISTRATIONREQTEMPLATE #20200228T105525.441 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML RULE-APPLICATION PZOAUTH2CLIENTREGISTRATIONREQTEMPLATE #20200228T105525.441 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-HTML");
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
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
}
/* end RULE-OBJ-HTML RULE-APPLICATION PZOAUTH2CLIENTREGISTRATIONREQTEMPLATE #20200228T105525.441 GMT */
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
	"Rule-Obj-HTML:PZOAUTH2CLIENTREGISTRATIONREQTEMPLATE", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZOAUTH2CLIENTREGISTRATIONREQTEMPLATE","Rule-Obj-HTML","RULE-APPLICATION",false,"","Pega-Desktop","08-05-01","RULE-OBJ-HTML RULE-APPLICATION PZOAUTH2CLIENTREGISTRATIONREQTEMPLATE #20200228T105525.441 GMT","!PZOAUTH2CLIENTREGISTRATIONREQTEMPLATE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1961967760), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-Obj-HTML","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1)
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
//	RULE-OBJ-HTML RULE-APPLICATION PZOAUTH2CLIENTREGISTRATIONREQTEMPLATE #20200228T105525.441 GMT:20200511T103551.310 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "0bed76ac382e915487303324c8f14231";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Application";
	}
public String getAspect() {
return "Stream";
}
private void performStream_1() throws Throwable {


  String clientNamePrefix = "PegaApp_";  
  String redirectURIPrefix = "PegaApp://";
  String redirectURISufffix = "/callback";
  String appName = tools.getPrimaryPage().getString(".pyProductName");
  String appRuleSet = tools.getPrimaryPage().getString(".pyRuleSet");
  String clientName = clientNamePrefix + appName;
  String redirectURI = redirectURIPrefix + appName + redirectURISufffix;
  int authCodeLifeTimeDefault = 300;
  int AccessTokenLifeTimeDefault = 900;
  int RefreshTokenLifeTimeDefault = 86400;
 

tools.appendString("\n\n\n{\n\n  \"client_name\": \"");
out.print(clientName);
tools.appendString("\",\n\n  \"client_description\": \"");
out.print(clientName);
tools.appendString(" AuthCode\",\n\n  \"token_endpoint_auth_method\": \"client_secret_basic\",\n \n  \n  \"grant_types\": [\n\n    \"authorization_code\"\n\n  ],\n\n  \"authorization_code\": {\n\n    \"redirect_uris\": [\n\n      \"");
out.print(redirectURI);
tools.appendString("\"\n\n    ],\n\n    \"issue_refresh_token\": \"true\",\n  \n     \"use_idp_session_expiry\":\"true\",\n\n    \"enable_pkce\": \"false\"\n\n  },\n\n  \"auth_code_lifetime\": ");
out.print(authCodeLifeTimeDefault);
tools.appendString(",\n  \"access_token_lifetime\": ");
out.print(AccessTokenLifeTimeDefault);
tools.appendString(",\n  \"refresh_token_lifetime\": ");
out.print(RefreshTokenLifeTimeDefault);
tools.appendString(",\n  \"pega_associated_ruleset\": \"");
out.print(appRuleSet);
tools.appendString("\"\n \n  \n}");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Rule-Application");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-OBJ-HTML RULE-APPLICATION PZOAUTH2CLIENTREGISTRATIONREQTEMPLATE #20200228T105525.441 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzOAuth2ClientRegistrationReqTemplate");
	oStreamProperties_1.put("pyRuleSetVersion", "08-05-01");
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
	if( pega != null ) pega.setTrackMissingProperties("Rule-Obj-HTML");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML RULE-APPLICATION PZOAUTH2CLIENTREGISTRATIONREQTEMPLATE #20200228T105525.441 GMT", "Rule-Application pzOAuth2ClientRegistrationReqTemplate", "Pega-Desktop", "08-05-01", "20200511T103551.310 GMT");
}
