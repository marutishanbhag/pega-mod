package com.pegarules.generated.html_paragraph;
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
 * Builds JSP stream PEGA-LANDING-SYSTEM-REFACTORRULESETS!PXREFACTORRULESETSUTILITIES.
 */
public class ra_stream_pxrefactorrulesetsutilities_368f3a9353c8584a32e519ddbe30aa44 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Paragraph.pxRefactorRulesetsUtilities.Pega_Landing_System_RefactorRulesets.Stream");
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
	public ra_stream_pxrefactorrulesetsutilities_368f3a9353c8584a32e519ddbe30aa44(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "8a641a500181e6fd0a12da5de8f7b3e0cd69282e";
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
/* Instance RULE-HTML-PARAGRAPH PEGA-LANDING-SYSTEM-REFACTORRULESETS PXREFACTORRULESETSUTILITIES #20180713T142920.016 GMT	Pega-LP-SystemSettings:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PARAGRAPH PEGA-LANDING-SYSTEM-REFACTORRULESETS PXREFACTORRULESETSUTILITIES #20180713T142920.016 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PARAGRAPH PEGA-LANDING-SYSTEM-REFACTORRULESETS PXREFACTORRULESETSUTILITIES #20180713T142920.016 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Paragraph");
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
/* end RULE-HTML-PARAGRAPH PEGA-LANDING-SYSTEM-REFACTORRULESETS PXREFACTORRULESETSUTILITIES #20180713T142920.016 GMT */
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
	"Rule-HTML-Paragraph:PXREFACTORRULESETSUTILITIES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-HTML-Paragraph","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXREFACTORRULESETSUTILITIES","Rule-HTML-Paragraph","PEGA-LANDING-SYSTEM-REFACTORRULESETS",false,"","Pega-LP-SystemSettings","08-01-01","RULE-HTML-PARAGRAPH PEGA-LANDING-SYSTEM-REFACTORRULESETS PXREFACTORRULESETSUTILITIES #20180713T142920.016 GMT","!PXREFACTORRULESETSUTILITIES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",301479212)
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
//	RULE-HTML-PARAGRAPH PEGA-LANDING-SYSTEM-REFACTORRULESETS PXREFACTORRULESETSUTILITIES #20180713T142920.016 GMT:20180713T142920.016 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "bd54f238b44bbcb6d770004c95ac95e0";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-Landing-System-RefactorRulesets";
	}
public String getAspect() {
return "Stream";
}
private void performStream_1() throws Throwable {
tools.appendString("<table cellpadding=\"0\" cellspacing=\"0\" data-ui-meta=\"{'type':'Layout','subType':'FREEFORM','pgRef':'.pySections(1)'}\" id=\"\" section_index=\"1\" style=\"box-sizing: border-box; font-size: 11px; padding: 0px; margin: 0px; font-family: OpenSans, sans-serif; color: rgb(0, 0, 0);\">\n\t<tbody style=\"box-sizing: border-box;\">\n\t\t<tr style=\"box-sizing: border-box;\">\n\t\t\t<td class=\"heading_3_dataLabelWrite\" data-ui-meta=\"{'type':'Cell','subType':'Paragraph','clipboardPath':'pxRefactorRulesUtilities','className':'Pega-Landing-System-RefactorRules','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)'}\" style=\"box-sizing: border-box; font-size: 16px; padding: 0px 2px 0px 0px; line-height: 1.5; color: inherit; height: 24px; width: 207px; background-color: transparent;\"><nobr><b style=\"font-family: Calibri, sans-serif; font-size: 15px;\">Refactor Rulesets Utilities</b></nobr></td>\n\t\t</tr>\n\t</tbody>\n</table>");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Pega-Landing-System-RefactorRulesets");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PARAGRAPH PEGA-LANDING-SYSTEM-REFACTORRULESETS PXREFACTORRULESETSUTILITIES #20180713T142920.016 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Paragraph");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-LP-SystemSettings");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pxRefactorRulesetsUtilities");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
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
	if( pega != null ) pega.setTrackMissingProperties("Rule-HTML-Paragraph");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PARAGRAPH PEGA-LANDING-SYSTEM-REFACTORRULESETS PXREFACTORRULESETSUTILITIES #20180713T142920.016 GMT", "Pega-Landing-System-RefactorRulesets pxRefactorRulesetsUtilities", "Pega-LP-SystemSettings", "08-01-01", "20180713T142920.016 GMT");
}
