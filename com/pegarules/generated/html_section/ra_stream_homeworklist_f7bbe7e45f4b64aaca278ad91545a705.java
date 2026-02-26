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
 * Builds JSP stream DATA-PORTAL!HOMEWORKLIST.
 */
public class ra_stream_homeworklist_f7bbe7e45f4b64aaca278ad91545a705 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.HomeWorklist.Data_Portal.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 1048825827;
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
	public ra_stream_homeworklist_f7bbe7e45f4b64aaca278ad91545a705(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "37eed098662d496d3a62a2bdd4461eeed865919f";
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
/* Instance RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "37eed098662d496d3a62a2bdd4461eeed865919f";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("HomeWorklist",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT */
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
	"Rule-HTML-Section:HOMEWORKLIST", 
	"Rule-Obj-Property:PYLABEL", 
	"Rule-Obj-Property:PXURGENCYASSIGN", 
	"Rule-Obj-Property:PYLABEL", 
	"Rule-Obj-Property:PXURGENCYASSIGN", 
	"Rule-Obj-Property:PYASSIGNMENTSTATUS", 
	"Rule-Obj-Property:PXDEADLINETIME", 
	"Rule-Obj-Property:PYINSTRUCTIONS", 
	"Rule-Obj-Property:PXGOALTIME", 
	"Rule-Obj-Property:PYASSIGNMENTSTATUS", 
	"Rule-Obj-Property:PXDEADLINETIME", 
	"Rule-Obj-Property:PXTASKLABEL", 
	"Rule-HTML-Property:PXLINK", 
	"Rule-HTML-Property:PXDISPLAYTEXT", 
	"Rule-HTML-Property:PXBUTTON"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("HOMEWORKLIST","Rule-HTML-Section","DATA-PORTAL",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT","!HOMEWORKLIST",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1048825827), 
		new DependentRuleInfo("PYLABEL","Rule-Obj-Property","@BASECLASS",true,"Assign-WorkBasket","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT","!PYLABEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXURGENCYASSIGN","Rule-Obj-Property","ASSIGN-",true,"Assign-Worklist","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PXURGENCYASSIGN #20180713T131152.178 GMT","!PXURGENCYASSIGN",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYLABEL","Rule-Obj-Property","ASSIGN-WORKLIST",true,"Assign-Worklist","Pega-ProcessEngine","08-04-01","RULE-OBJ-PROPERTY ASSIGN-WORKLIST PYLABEL #20191202T133414.995 GMT","!PYLABEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXURGENCYASSIGN","Rule-Obj-Property","ASSIGN-",true,"Assign-WorkBasket","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PXURGENCYASSIGN #20180713T131152.178 GMT","!PXURGENCYASSIGN",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYASSIGNMENTSTATUS","Rule-Obj-Property","ASSIGN-",true,"Assign-Worklist","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PYASSIGNMENTSTATUS #20180713T131840.942 GMT","!PYASSIGNMENTSTATUS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXDEADLINETIME","Rule-Obj-Property","ASSIGN-",true,"Assign-Worklist","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PXDEADLINETIME #20180713T131151.746 GMT","!PXDEADLINETIME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYINSTRUCTIONS","Rule-Obj-Property","ASSIGN-",true,"Assign-Worklist","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PYINSTRUCTIONS #20180713T131841.010 GMT","!PYINSTRUCTIONS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXGOALTIME","Rule-Obj-Property","ASSIGN-",true,"Assign-Worklist","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PXGOALTIME #20180713T131151.937 GMT","!PXGOALTIME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYASSIGNMENTSTATUS","Rule-Obj-Property","ASSIGN-",true,"Assign-WorkBasket","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PYASSIGNMENTSTATUS #20180713T131840.942 GMT","!PYASSIGNMENTSTATUS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXDEADLINETIME","Rule-Obj-Property","ASSIGN-",true,"Assign-WorkBasket","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PXDEADLINETIME #20180713T131151.746 GMT","!PXDEADLINETIME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXTASKLABEL","Rule-Obj-Property","ASSIGN-",true,"Assign-Worklist","Pega-ProcessEngine","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PXTASKLABEL #20180713T132856.101 GMT","!PXTASKLABEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXLINK","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT","PXLINK",true,false,"ABSOLUTE_CLASSLESS",-1085887471), 
		new DependentRuleInfo("PXDISPLAYTEXT","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT","PXDISPLAYTEXT",true,false,"ABSOLUTE_CLASSLESS",1365141955), 
		new DependentRuleInfo("PXBUTTON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT","PXBUTTON",true,false,"ABSOLUTE_CLASSLESS",1928622883)
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
//	RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT:20210908T115501.643 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY ASSIGN-WORKLIST PYLABEL #20191202T133414.995 GMT:20191202T133836.990 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXURGENCYASSIGN #20180713T131152.178 GMT:20180713T131152.178 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYASSIGNMENTSTATUS #20180713T131840.942 GMT:20180713T131840.942 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXDEADLINETIME #20180713T131151.746 GMT:20180713T131151.746 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYINSTRUCTIONS #20180713T131841.010 GMT:20180713T131841.010 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXGOALTIME #20180713T131151.937 GMT:20180713T131151.937 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXTASKLABEL #20180713T132856.101 GMT:20180713T132856.101 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY ASSIGN-WORKLIST PYLABEL #20191202T133414.995 GMT:20191202T133836.990 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXURGENCYASSIGN #20180713T131152.178 GMT:20180713T131152.178 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYASSIGNMENTSTATUS #20180713T131840.942 GMT:20180713T131840.942 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXDEADLINETIME #20180713T131151.746 GMT:20180713T131151.746 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYINSTRUCTIONS #20180713T131841.010 GMT:20180713T131841.010 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXGOALTIME #20180713T131151.937 GMT:20180713T131151.937 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXTASKLABEL #20180713T132856.101 GMT:20180713T132856.101 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY ASSIGN-WORKLIST PYLABEL #20191202T133414.995 GMT:20191202T133836.990 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXURGENCYASSIGN #20180713T131152.178 GMT:20180713T131152.178 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYASSIGNMENTSTATUS #20180713T131840.942 GMT:20180713T131840.942 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXDEADLINETIME #20180713T131151.746 GMT:20180713T131151.746 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYINSTRUCTIONS #20180713T131841.010 GMT:20180713T131841.010 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXGOALTIME #20180713T131151.937 GMT:20180713T131151.937 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXTASKLABEL #20180713T132856.101 GMT:20180713T132856.101 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT:20180713T131156.327 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXURGENCYASSIGN #20180713T131152.178 GMT:20180713T131152.178 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYASSIGNMENTSTATUS #20180713T131840.942 GMT:20180713T131840.942 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXDEADLINETIME #20180713T131151.746 GMT:20180713T131151.746 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT:20180713T131156.327 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXURGENCYASSIGN #20180713T131152.178 GMT:20180713T131152.178 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYASSIGNMENTSTATUS #20180713T131840.942 GMT:20180713T131840.942 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXDEADLINETIME #20180713T131151.746 GMT:20180713T131151.746 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT:20180713T131156.327 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXURGENCYASSIGN #20180713T131152.178 GMT:20180713T131152.178 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYASSIGNMENTSTATUS #20180713T131840.942 GMT:20180713T131840.942 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXDEADLINETIME #20180713T131151.746 GMT:20180713T131151.746 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY ASSIGN-WORKLIST PYLABEL #20191202T133414.995 GMT:20191202T133836.990 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXURGENCYASSIGN #20180713T131152.178 GMT:20180713T131152.178 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYASSIGNMENTSTATUS #20180713T131840.942 GMT:20180713T131840.942 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXDEADLINETIME #20180713T131151.746 GMT:20180713T131151.746 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYINSTRUCTIONS #20180713T131841.010 GMT:20180713T131841.010 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXGOALTIME #20180713T131151.937 GMT:20180713T131151.937 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXTASKLABEL #20180713T132856.101 GMT:20180713T132856.101 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY ASSIGN-WORKLIST PYLABEL #20191202T133414.995 GMT:20191202T133836.990 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXURGENCYASSIGN #20180713T131152.178 GMT:20180713T131152.178 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYASSIGNMENTSTATUS #20180713T131840.942 GMT:20180713T131840.942 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXDEADLINETIME #20180713T131151.746 GMT:20180713T131151.746 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYINSTRUCTIONS #20180713T131841.010 GMT:20180713T131841.010 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXGOALTIME #20180713T131151.937 GMT:20180713T131151.937 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXTASKLABEL #20180713T132856.101 GMT:20180713T132856.101 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT:20180713T131156.327 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXURGENCYASSIGN #20180713T131152.178 GMT:20180713T131152.178 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYASSIGNMENTSTATUS #20180713T131840.942 GMT:20180713T131840.942 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXDEADLINETIME #20180713T131151.746 GMT:20180713T131151.746 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT:20180713T131156.327 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXURGENCYASSIGN #20180713T131152.178 GMT:20180713T131152.178 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PYASSIGNMENTSTATUS #20180713T131840.942 GMT:20180713T131840.942 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXDEADLINETIME #20180713T131151.746 GMT:20180713T131151.746 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	RepeatingRDLCell_2( {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}
//	RepeatingRDLCell_1( {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}
//	simpleLayout_3(
//	simpleLayout_1(
//	gridTemplateSwitchPersonalization_1(
//	gridTemplatePartial_2(
//	generateGridCellModes_1( {"strGridMetadataPage", "String", ""}
//	gridTemplateSwitchPersonalization_2(
//	pzLayout_7(
//	gridTemplatePartial_1(
//	generateGridCellModes_2( {"strGridMetadataPage", "String", ""}
//	GetRDLRow_1( {"listSource", "String", ""},  {"index", "int", "0"}
//	GetRDLRow_2( {"listSource", "String", ""},  {"index", "int", "0"}
//	simpleLayout_2(
//	getNextPage_2( {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}
//	simpleLayout_4(
//	pzLayout_8(
//	getNextPage_1( {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION GRID GETTOTALRECORDS #20180713T133337.740 GMT:20180718T092706.975 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
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
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEGRIDFIELDINCLUDE--(STR2D70A853CCD6654B51AFD65192EDF57E #20180713T133339.756 GMT:20180713T133339.756 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
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
//	RULE-UTILITY-FUNCTION HARNESS PZGETREFRESHWHENPREACTIVITY #20180713T133340.025 GMT:20180713T133340.025 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISFORMATTEDCONTROL #20180713T133341.276 GMT:20180713T133341.276 GMT
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
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE #20180713T133342.978 GMT:20180713T133342.978 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI5436799337856473D715B7B3B9FDA861 #20190320T065455.546 GMT:20190320T065455.546 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI805ACB584571D11D0909301738737110 #20190320T065455.669 GMT:20190329T124704.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONOPENASSIGNMENT--(IAUTOST78B1881580B41AAF80FB381D2C0C5F67 #20190520T072316.537 GMT:20190520T072316.537 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONOPENWORKBYHANDLE--(IAUTO591205311DA543B2EDDD2E46D0E6BB0F #20190520T072316.567 GMT:20190520T072316.567 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZCHECKAUTOGENCONTROL--(CLIPBOARDPROPERTY) #20180713T133344.796 GMT:20180713T133344.796 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZCONTROLACTIONTOKENIZER--(STRIN8BE29C608C407B0F03A6B69F6478D6BB #20180713T133344.800 GMT:20180713T133344.800 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZCONTROLACTIONTOKENIZER--(STRING,JAVA.UTIL.LIST,BOOLEAN) #20180713T133344.806 GMT:20180713T133344.806 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZENABLEDSKIPLOCALIZATION #20180713T133344.810 GMT:20180713T133344.810 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECALCULATEDVALUE--(CLIP25E448149E37EDE02190B4A70F76AB5B #20210527T114234.915 GMT:20210527T114234.915 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT--(STRING,CLIPBOE3B9AB14D60C9BC144A59D967BEF48D3 #20231111T205726.843 GMT:20231111T205726.843 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETCONTROLSFORMAT--(CLIPBOARDP67982A3A95FEBEAA95783F4B64F7D734 #20231101T074700.438 GMT:20231101T074700.438 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSETMOBILETRANSITION--(CLIPBOARBD730748D4A4889BCBC7588C6050A02F #20181029T101028.041 GMT:20181029T101028.041 GMT
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
		return "bd0670fac9b74c4b237e789202d1e3e3";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Portal";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
pzLayoutBodyWrapper_3();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("HomeWorklist",1,"Rule-HTML-Section","{'type':'Section','ruleName':'HomeWorklist','insKey':'RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT','sectionType':'workareaWidget'}");
pzLayout_9();
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
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pySectionName", "HomeWorklist");
pega.getUIEngine().getUIAction("rdlpagination", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pySectionName", "HomeWorklist");
pega.getUIEngine().getUIAction("rdlpagination", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("StreamName", "HomeWorklist");
pega.getUIEngine().getUIAction("sort", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyNextGenGridModalTemplate");
config.put("ModalSection", "pyNextGenGridModalTemplate");
config.put("NewTaskStatus", "");
pega.getUIEngine().getUIAction("editItemImplicit", config).register();
pega.getUIEngine().getUIAction("addRow", null).register();
pega.getUIEngine().getUIAction("UPDATEGRIDCOLUMNSSTATE", null).register();
config = new HashMap<String, String>();
config.put("pyPageMode", "Numeric");
pega.getUIEngine().getUIAction("paginate", config).register();
pega.getUIEngine().getUIAction("filter", null).register();
pega.getUIEngine().getUIAction("categorization", null).register();
pega.getUIEngine().getUIAction("personalization", null).register();
pega.getUIEngine().getUIAction("columnToggle", null).register();
pega.getUIEngine().getUIAction("rowHeight", null).register();
pega.getUIEngine().getUIAction("search", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("openWorkByHandle", null).register();
pega.getUIEngine().getUIAction("openAssignment", null).register();
config = new HashMap<String, String>();
config.put("StreamName", "HomeWorklist");
pega.getUIEngine().getUIAction("sort", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyNextGenGridModalTemplate");
config.put("ModalSection", "pyNextGenGridModalTemplate");
config.put("NewTaskStatus", "");
pega.getUIEngine().getUIAction("editItemImplicit", config).register();
pega.getUIEngine().getUIAction("addRow", null).register();
pega.getUIEngine().getUIAction("UPDATEGRIDCOLUMNSSTATE", null).register();
config = new HashMap<String, String>();
config.put("pyPageMode", "Numeric");
pega.getUIEngine().getUIAction("paginate", config).register();
pega.getUIEngine().getUIAction("filter", null).register();
pega.getUIEngine().getUIAction("categorization", null).register();
pega.getUIEngine().getUIAction("personalization", null).register();
pega.getUIEngine().getUIAction("columnToggle", null).register();
pega.getUIEngine().getUIAction("rowHeight", null).register();
pega.getUIEngine().getUIAction("search", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("openWorkByHandle", null).register();
pega.getUIEngine().getUIAction("openAssignment", null).register();
}
public void pzLayoutBody_6() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
}
public void pzLayoutBodyWrapper_12() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_5() {
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()){ 
gridTemplateInit_2();
return;}tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_4();gridCentreLayout_2();
  

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
  

				gridEndLayout_1();
}
public void pzLayoutBodyWrapper_11() {
tools.appendString("<div class='layout layout-noheader layout-noheader-default'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_4();gridCentreLayout_2();
  

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
  

				gridEndLayout_1();
}
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}
public String 
getUIActionsMetaData_6() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openAssignment");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openAssignment\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");		tools.appendString("\",\"");

		tools.appendFormatted("11ab62f6-6773-46b9-9241-53a471b1cd5d",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsOfflineEnabled")+"~#");		tools.appendString("\",{\"target\":\"primary\",\"pyReloadAlways\":\"false\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsOfflineEnabled"), -1);
		}}catch(Exception e){}		String returnString = actionsStringBuilder.toString();
		tools.popStreamBody();
		return returnString;
	}


public void pxButton_8() {boolean isDisplayTextWithParam = false;
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
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("202007011657090787668") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","HomeWorklist_$CTX$_86");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","Strong");
	modePage2.put("imgSrc","none");
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Go\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Go", ".pyButtonLabel");
	}
	pyLabel = "Go";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash133 = getUIActionsMetaData_6();
	if(spxUniqueStreamHash133 != null && !"".equals(spxUniqueStreamHash133)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash133,pxUniqueStreamHash+"_133");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_133");
	}
	modePage2.put("actionPath"," data-click='.'");
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_button.js");
	ctrlComponent.beginComponent("pxButton",metadataPage);
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
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_86'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("202007011657090787668") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openAssignment");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openAssignment\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");		tools.appendString("\",\"");

		tools.appendFormatted("09ea6f0a-9334-41ba-8628-d63f29025bd0",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsOfflineEnabled")+"~#");		tools.appendString("\",{\"target\":\"primary\",\"pyReloadAlways\":\"false\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsOfflineEnabled"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='Strong pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Go".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Go",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");	}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_29() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)")); tools.appendString("headers='a6'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");if(pzAuto.handleEvaluateWhen(" axpzCanPerformAssignment","pzCanPerformAssignment", "cell", "visible" )) {pxButton_8(); } 
									tools.appendString("</DIV>"); } else { if(pzAuto.handleEvaluateWhen(" axpzCanPerformAssignment","pzCanPerformAssignment", "cell", "visible" )) {pxButton_8(); } }
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_31(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_129")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&date","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_130")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");
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
	String repeatIndx = "";
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("202007011657090786888",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxDeadlineTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxDeadlineTime", ".pyCaption");
	pyValueR = ".pxDeadlineTime";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxDeadlineTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxDeadlineTime", ".pyCaption");
	pyValueOrig = ".pxDeadlineTime";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","localizevalue");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","date");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyDateFormat","DateTime-Frame");
	modePage2.put("pyDateTimeSecondCutoff","0");
	ClipboardProperty currProp = tools.getActive();
	String propTypeName = currProp.getTypeName();
	modePage2.put("pyPropertyType",propTypeName);
	String[] fieldValuesArray ={};
	fieldValuesArray = new String[]{"yearsmonths ago","yearsmonth ago","yearmonths ago","yearmonth ago","yearsmonths from now","yearsmonth from now","yearmonths from now","yearmonth from now","monthsdays ago","monthsday ago","monthdays ago","monthday ago","monthsdays from now","monthsday from now","monthdays from now","monthday from now","dayshours ago","dayshour ago","dayhours ago","dayhour ago","dayshours from now","dayshour from now","dayhours from now","dayhour from now","hoursminutes ago","hoursminute ago","hourminutes ago","hourminute ago","hoursminutes from now","hoursminute from now","hourminutes from now","hourminute from now","about a minute","about a minute ago","about a minute from now","less than a minute","less than a minute ago","less than a minute from now","years ago","years from now","year ago","year from now","months ago","months from now","month ago","month from now","days ago","days from now","day ago","day from now","hours ago","hours from now","hour ago","hour from now","minutes ago","minutes from now","today","It is"};
	for(int i=0;i<fieldValuesArray.length;i++){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(fieldValuesArray[i], "pyFormatter");
	}
	String spxUniqueStreamHash131 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash131 != null && !"".equals(spxUniqueStreamHash131)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash131,pxUniqueStreamHash+"_131");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_131");
	}
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.addAdditionalScripts("pzDecimalInclude","pzpega_ui_decimal.js");
	ctrlComponent.beginComponent("pxDisplayText",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
} else {
inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);
}

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
}
tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void repeatingDataCell_28() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxDeadlineTime", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)")); tools.appendString("headers='a5'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_31(".pxDeadlineTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_31(".pxDeadlineTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","84"};oCellRuntimeParamsMap.put("84||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("84||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","R","true","0","","","Decimal","true","83"};oCellRuntimeParamsMap.put("83||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("83||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","82"};oCellRuntimeParamsMap.put("82||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("82||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}


public void pxLink_10() {boolean isDisplayTextWithParam = false;
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20190208082033073432148",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","HomeWorklist_$CTX$_81");
		String repeatIndx = "";
	modePage2.put("styles","Simple");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxRefObjectInsName");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxRefObjectInsName", ".pyButtonLabel");
	pyLabel = ".pxRefObjectInsName";
	modePage2.put("pyLabel",pyLabel);
	modePage2.put("captionType","propertyReference");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	modePage2.put("pyFormatTypeActionable","none");
	String pyFormatValue = "";
	modePage2.put("pyFormatValue",pyFormatValue);
	String spxUniqueStreamHash128 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash128 != null && !"".equals(spxUniqueStreamHash128)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash128,pxUniqueStreamHash+"_128");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_128");
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
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_81'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pxRefObjectInsName"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pxRefObjectInsName").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20190208082033073432148") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openWorkByHandle");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");
String className = "";className ="Assign-Worklist";if("".equals(className) || className==null){className ="";}if((("".equals(className) || className==null) || (!pega_rules_string.isLiteral(className))) && (tools != null && tools.getStepPage() != null)){className = tools.getStepPage().getString("pxObjClass");}if("".equals(className) || className==null){className = "@baseclass";}ArrayList skeletonList = (ArrayList)tools.getParameterPage().getObject("skeletonList");if(skeletonList != null && !(skeletonList.contains("pyOpenWorkSkeleton~$~"+className+"~$~false~$~"))){skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);} else if(skeletonList == null){skeletonList = new ArrayList();skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);}
		tools.appendFormatted("pega.SKELETON",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~pyOpenWorkSkeleton",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~"+className, StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~false",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxRefObjectKey")+"~#");		tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"false\",\"false\",{\"target\":\"primary\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxRefObjectKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='Simple");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pxRefObjectInsName").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");	}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Task in");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_27() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='primary'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pxRefObjectInsName", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:38px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_10();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_10();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingHeaderCell_15() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyTemplateInputBox";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("202007011707310166537") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(6)")); tools.appendString(" id='a6' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		
		tools.appendString(" bSortable = 'false'");
		
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthCache6").equals("")) { tools.appendParamCSF("D_WorkBasketPpxResults1colWidthCache6");} else { tools.appendString("auto;"); }tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_WorkBasketPpxResults1colWidthCache6' id='D_WorkBasketPpxResults1colWidthCache6' value='" + tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthCache6") + "' />");
				if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_14() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-WorkBasket";
	dataColumnProp = "pxDeadlineTime";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxDeadlineTime";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Deadline' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("202007011657090784250") + " ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(5)")); tools.appendString(" id='a5' class='");
		tools.appendString(pzSection.getCustomStyle(false,"","standard_dataLabelRead ","standard_dataLabelWrite "));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxDeadlineTime' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthCache5").equals("")) { tools.appendParamCSF("D_WorkBasketPpxResults1colWidthCache5");} else { tools.appendString("51.776649746192895"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc100570959'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_WorkBasketPpxResults1colWidthCache5' id='D_WorkBasketPpxResults1colWidthCache5' value='" + tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthCache5") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Deadline", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc100570959' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc100570959' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc100570959' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxDeadlineTime")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc100570959' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_WorkBasket_pxResultsL11 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxDeadlineTime5").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle100570959\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxDeadlineTime5").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=search></span><span id=\"filterTitle100570959\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxDeadlineTime5").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=search></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxDeadlineTime5").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=search></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxDeadlineTime5").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=search></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_13() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-WorkBasket";
	dataColumnProp = "pyAssignmentStatus";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyAssignmentStatus";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Status' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("202007011657090784250") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Status"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(4)")); tools.appendString(" id='a4' class='");
		tools.appendString(pzSection.getCustomStyle(false,"","standard_dataLabelRead ","standard_dataLabelWrite "));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyAssignmentStatus' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthCache4").equals("")) { tools.appendParamCSF("D_WorkBasketPpxResults1colWidthCache4");} else { tools.appendString("51.776649746192895"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc866283607'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_WorkBasketPpxResults1colWidthCache4' id='D_WorkBasketPpxResults1colWidthCache4' value='" + tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthCache4") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Status", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc866283607' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc866283607' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc866283607' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyAssignmentStatus")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc866283607' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_WorkBasket_pxResultsL11 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pyAssignmentStatus4").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle866283607\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pyAssignmentStatus4").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle866283607\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pyAssignmentStatus4").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pyAssignmentStatus4").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pyAssignmentStatus4").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_12() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-WorkBasket";
	dataColumnProp = "pxUrgencyAssign";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxUrgencyAssign";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Urgency' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("202007011657090784551") + " ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" id='a3' class='");
		tools.appendString(pzSection.getCustomStyle(false,"","standard_dataLabelRead ","standard_dataLabelWrite "));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxUrgencyAssign' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthCache3").equals("")) { tools.appendParamCSF("D_WorkBasketPpxResults1colWidthCache3");} else { tools.appendString("51.776649746192895"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1963972782'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_WorkBasketPpxResults1colWidthCache3' id='D_WorkBasketPpxResults1colWidthCache3' value='" + tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthCache3") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Urgency", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1963972782' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1963972782' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1963972782' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxUrgencyAssign")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1963972782' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_WorkBasket_pxResultsL11 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxUrgencyAssign3").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1963972782\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxUrgencyAssign3").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1963972782\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxUrgencyAssign3").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxUrgencyAssign3").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxUrgencyAssign3").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_11() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-WorkBasket";
	dataColumnProp = "pyLabel";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyLabel";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Description' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20200701165709078334") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Description"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(pzSection.getCustomStyle(false,"","standard_dataLabelRead","standard_dataLabelWrite"));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyLabel' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthCache2").equals("")) { tools.appendParamCSF("D_WorkBasketPpxResults1colWidthCache2");} else { tools.appendString("154.31472081218274"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1133510414'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_WorkBasketPpxResults1colWidthCache2' id='D_WorkBasketPpxResults1colWidthCache2' value='" + tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthCache2") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Description", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1133510414' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1133510414' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1133510414' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyLabel")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1133510414' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_WorkBasket_pxResultsL11 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1133510414\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1133510414\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_10() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-WorkBasket";
	dataColumnProp = "pxRefObjectInsName";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxRefObjectInsName";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='ID' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20160721093355058239712") + " ");
try {
tools.appendString(" data-importance='primary'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxRefObjectInsName' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("height:24px;");tools.appendString("width:"); if(!tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthCache1").equals("")) { tools.appendParamCSF("D_WorkBasketPpxResults1colWidthCache1");} else { tools.appendString("39.59390862944163"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc185362360'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_WorkBasketPpxResults1colWidthCache1' id='D_WorkBasketPpxResults1colWidthCache1' value='" + tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthCache1") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "ID", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc185362360' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc185362360' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc185362360' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxRefObjectInsName")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc185362360' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_WorkBasket_pxResultsL11 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxRefObjectInsName1").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle185362360\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxRefObjectInsName1").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle185362360\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxRefObjectInsName1").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxRefObjectInsName1").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_WorkBasket_pxResultsL11!=null && !gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPageValue("pxRefObjectInsName1").isEmpty() && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_WorkBasket_pxResultsL11.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void gridTemplateSwitchPersonalization_2() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata gridWrapper = pzAuto.getUIComponentRuntime().createMetadata();
gridWrapper.put("pzCTResetSaveMethodName",tools.getParamValue("pzCTResetSaveMethodName"));
tools.findPage(tools.getParamValue("pxGridMetadataPage")).removeFromClipboard(); 
ClipboardPage sectionContext = tools.findPage(tools.getParamValue("sectionContext"),true);
PRStackFrame frame = null; 
if(null != sectionContext){
  frame = pega.pushStackFrame(tools.getParameterPage(), sectionContext, false, false, PRStackFrame.Type.APPEND_STREAM, "discardPersonalize");
}
String pyGridStateUniqueID= "1593637851499";
String pySectionInsName= "DATA-PORTAL!HOMEWORKLIST";
String pyOperatorID= tools.findPage("OperatorID").getString(".pyUserIdentifier");
String harnessClassName = tools.getParamValue("strPHarnessClass");
if(StringUtils.isBlank(harnessClassName)) {
harnessClassName = tools.getParamValue("className");
}
String harnessName = tools.getParamValue("innerHarnessName");
if(StringUtils.isBlank(harnessName)) {
harnessName = tools.getParamValue("strPHarnessPurpose");
if(StringUtils.isBlank(harnessName)) {
harnessName = tools.getParamValue("Purpose");
}
}
String pyHarnessInsName= harnessClassName+"!"+harnessName;
metadataPage.put("pyGridStateUniqueID",pyGridStateUniqueID);
metadataPage.put("pySectionInsName",pySectionInsName);
metadataPage.put("pyOperatorID",pyOperatorID);
metadataPage.put("pyHarnessInsName",pyHarnessInsName);
String propType = "Data Object";
String DSNameViaAjax = tools.getParamValue("DSName");
if(org.apache.commons.lang3.StringUtils.isNotBlank(DSNameViaAjax) && "Property".equals(propType) ){
gridWrapper.putString("DPName",DSNameViaAjax);
}
gridTemplateMain_2(metadataPage,gridWrapper);
if(null != frame){
  pega.popStackFrame(frame, false);
}
}
public void gridTemplatePartial_2() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata gridWrapper = pzAuto.getUIComponentRuntime().createMetadata();
ClipboardProperty dataCells = null;
boolean isPartial = true;
boolean isQueryable = false;
Map configMap = new HashMap(); 
String gridAction = tools.getParamValue("listAction"); 
String DSName = tools.getParamValue("DSName"); 
String uniqueId = tools.getParamValue("instanceId"); 
String resultsClass = tools.getParamValue("pyResultsClass"); 
ClipboardPage gridMetadataPage = tools.findPage(tools.getParamValue("pxGridMetadataPage"), true); 
if(null != gridMetadataPage){ 
isQueryable = gridMetadataPage.getBoolean("isQueryable"); 
configMap.put("pxGridMetadataPage", gridMetadataPage); 
} 
configMap.put("instanceId", uniqueId); 
configMap.put("pyContext", DSName); 
configMap.put("listAction", gridAction); 
int startIndex = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"startIndex"); 
int endIndex = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"endIndex"); 
int pxPageSize = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"pxPageSize"); 
int pxPageIndex = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"pxPageIndex"); 
configMap.put("pxPageSize", pxPageSize); 
configMap.put("pxPageIndex", pxPageIndex); 
if(isQueryable){
gridMetadataPage.putString("pxPageSize", String.valueOf(pxPageSize)); 
gridMetadataPage.putString("pxPageIndex", String.valueOf(pxPageIndex)); 
pega.getUIEngine().getGridUtilities().setImplicitParameter(true, gridMetadataPage);
boolean bIsTableGrouped = gridMetadataPage.getBoolean("pyIsTableCategorized");
if(bIsTableGrouped) {
configMap.put("isQueryable", "false"); 
}else{
configMap.put("isQueryable", Boolean.toString(isQueryable)); 
}
}
List<Integer> indices = pega.getUIEngine().getGridUtilities().getIndicesToBeChangeTracked();
if(indices != null){
configMap.put("indices", indices); 
}
if(startIndex > 0 && endIndex >= startIndex){ 
Map pyPagination = new HashMap(); 
pyPagination.put("pyStartIndex", ""+startIndex); 
pyPagination.put("pyEndIndex", ""+endIndex); 
configMap.put("pyPagination", pyPagination); 
} 
gridWrapper.put("resultsClass",resultsClass); 
metadataPage.put("uniqueId",uniqueId); 
metadataPage.putMetadata("gridWrapper",gridWrapper);
gridTemplateBody_2(dataCells, metadataPage, configMap, isPartial, "pxGrid1" ); 
}
public void generateGridSections_2(IUIComponentMetadata metadataPage, ClipboardPage gridMetadataPage) {
IUIComponentMetadata gridSectionsInfo = pzAuto.getUIComponentRuntime().createMetadata();
Map<String, Object> sectionParams = new HashMap<>();
String pageId = pxUniqueStreamHash+"_121";
String pageListClassName = metadataPage.getNestedProperty("gridWrapper.resultsClass"); 
ClipboardPage gridResultsPage = tools.createPage(pageListClassName, "gridResultsPage"+pageId);
PRStackFrame gridResultsPageFrame = pega.pushStackFrame(gridResultsPage.getName(), null, gridResultsPage, false, false); 
sectionParams.put("doNotAddToMetadataTree", true); 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_122","HomeWorklistNoResults", pageListClassName, gridResultsPage.getName(), true, sectionParams);
gridSectionsInfo.put("pxGridNoDataMsgId",pxUniqueStreamHash+"_122");
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_123","pyNextGenGridFilterNoResultsMessage", pageListClassName, gridResultsPage.getName(), true, sectionParams);
gridSectionsInfo.put("pxGridNoFilterDataMsgId",pxUniqueStreamHash+"_123");
gridSectionsInfo.put("pyNoMsgSectionContext",gridResultsPage.getName());
sectionParams.clear(); 
pega.popStackFrame(gridResultsPageFrame, false);
gridResultsPage.removeFromClipboard(); 
ClipboardPage filterPage = tools.createPage("Pega-UI-Component-Grid-Filter", "filterPage");
sectionParams.put("usingPage", filterPage.getName()); 
sectionParams.put("doNotAddToMetadataTree", true); 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_124","pyFilterIcon", sectionParams);
gridSectionsInfo.put("pxGridFilterIconId",pxUniqueStreamHash+"_124");
sectionParams.clear(); 
filterPage.removeFromClipboard(); 
gridMetadataPage.putString("pyIsRowHeightEnabled", "true");
gridMetadataPage.putString("pyIsColumnTogglerEnabled", "true");
gridMetadataPage.putString("pyIsRefreshListEnabled", "true");
boolean isQueryable = gridMetadataPage.getBoolean("isQueryable");
if(isQueryable){
gridMetadataPage.putString("pyIsSearchEnabled", "true");
}else{
gridMetadataPage.putString("pyIsSearchEnabled", "false");
}
gridMetadataPage.putString("pyIsPersonalized", metadataPage.getString("pyIsPersonalized"));
gridMetadataPage.putString("pyIsPersonalizationEnabled", "true");
gridMetadataPage.putString("pyImplicitSave", "true");
gridMetadataPage.putString("pyPersonalizedName", metadataPage.getString("pyPersonalizedName"));
int count  = 0;
ClipboardProperty pyColumns = gridMetadataPage.getProperty("pyColumns");
Iterator<ClipboardProperty> itr = pyColumns.iterator();
while (itr.hasNext()) {
ClipboardProperty columnDetails = itr.next();
String strCategorized = columnDetails.getProperty("pyIsCategorized").getStringValue();
if ("true".equalsIgnoreCase(strCategorized)) {
	++count;
}
}
gridMetadataPage.putString("pyNoOfColumnsCategorized", Integer.toString(count));
sectionParams.put("usingPage", gridMetadataPage.getName()); 
sectionParams.put("doNotAddToMetadataTree", true); 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_125","pyTableToolbar", sectionParams);
gridSectionsInfo.put("pxGridToolbarId",pxUniqueStreamHash+"_125");
gridSectionsInfo.put("pxGridToolbarPage",gridMetadataPage.getName());
sectionParams.clear(); 
sectionParams.put("doNotAddToMetadataTree", true); 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_126","pyWorkListWidgetHeader", sectionParams);
gridSectionsInfo.put("pxGridOtherActionId",pxUniqueStreamHash+"_126");
sectionParams.clear(); 
metadataPage.put("isToolBar",true);
if(gridSectionsInfo.getObject().entrySet().size() > 0){
metadataPage.putMetadata("gridSectionsInfo",gridSectionsInfo);
}
}
public String 
getUIActionsMetaData_5() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openAssignment");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openAssignment\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");		tools.appendString("\",\"");

		tools.appendFormatted("1395d855-cc97-4dab-9aa4-32a3de897921",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsOfflineEnabled")+"~#");		tools.appendString("\",{\"target\":\"primary\",\"pyReloadAlways\":\"false\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsOfflineEnabled"), -1);
		}}catch(Exception e){}		String returnString = actionsStringBuilder.toString();
		tools.popStreamBody();
		return returnString;
	}


public void pxLink_9() {boolean isDisplayTextWithParam = false;
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20190208082033073432148",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","HomeWorklist_$CTX$_81");
		String repeatIndx = "";
	modePage2.put("styles","Simple");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxRefObjectInsName");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxRefObjectInsName", ".pyButtonLabel");
	pyLabel = ".pxRefObjectInsName";
	modePage2.put("pyLabel",pyLabel);
	modePage2.put("captionType","propertyReference");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	modePage2.put("pyFormatTypeActionable","none");
	String pyFormatValue = "";
	modePage2.put("pyFormatValue",pyFormatValue);
	String spxUniqueStreamHash114 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash114 != null && !"".equals(spxUniqueStreamHash114)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash114,pxUniqueStreamHash+"_114");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_114");
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
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_81'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pxRefObjectInsName"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pxRefObjectInsName").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20190208082033073432148") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openWorkByHandle");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");
String className = "";className ="Assign-Worklist";if("".equals(className) || className==null){className ="";}if((("".equals(className) || className==null) || (!pega_rules_string.isLiteral(className))) && (tools != null && tools.getStepPage() != null)){className = tools.getStepPage().getString("pxObjClass");}if("".equals(className) || className==null){className = "@baseclass";}ArrayList skeletonList = (ArrayList)tools.getParameterPage().getObject("skeletonList");if(skeletonList != null && !(skeletonList.contains("pyOpenWorkSkeleton~$~"+className+"~$~false~$~"))){skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);} else if(skeletonList == null){skeletonList = new ArrayList();skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);}
		tools.appendFormatted("pega.SKELETON",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~pyOpenWorkSkeleton",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~"+className, StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~false",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxRefObjectKey")+"~#");		tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"false\",\"false\",{\"target\":\"primary\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxRefObjectKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='Simple");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pxRefObjectInsName").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");	}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Task in");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}



public void pxDisplayText_27() {	String key="82||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
	String pzFromGrid = tools.getParamValue("pzFromGrid");
	tools.putParamValue("pzFromGrid","false");
	AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
	((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
	tools.putParamValue("pzFromGrid",pzFromGrid);
	}
	static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","false","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","82"};oCellRuntimeParamsMap.put("82||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("82||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}


public void pxDisplayText_28() {	String key="83||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
	String pzFromGrid = tools.getParamValue("pzFromGrid");
	tools.putParamValue("pzFromGrid","false");
	AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
	((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
	tools.putParamValue("pzFromGrid",pzFromGrid);
	}
	static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","false","FREEFORM","REPEATING","",""," cffalse","R","true","0","","","Decimal","true","83"};oCellRuntimeParamsMap.put("83||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("83||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)");}


public void pxDisplayText_29() {	String key="84||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
	String pzFromGrid = tools.getParamValue("pzFromGrid");
	tools.putParamValue("pzFromGrid","false");
	AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
	((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
	tools.putParamValue("pzFromGrid",pzFromGrid);
	}
	static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","false","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","84"};oCellRuntimeParamsMap.put("84||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("84||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}


public void pxDisplayText_30(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {	boolean isDisplayTextWithParam = false;
	String displayTextParamName = "";
	String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
	try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_115")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&date","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_116")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");
	 }	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
		IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
		java.util.List<String> ctPropRefs = new ArrayList<String>();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		tools.putParamValue("skipHTMLEncoding", "true");
		String repeatIndx = "";
		cellPage.put("automationId",pzCell.getTestIdIfEnabled("202007011657090786888",true));
		String pyValueR = "";
		String pyValueOrig = "";
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxDeadlineTime");
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxDeadlineTime", ".pyCaption");
		pyValueR = ".pxDeadlineTime";
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxDeadlineTime");
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxDeadlineTime", ".pyCaption");
		pyValueOrig = ".pxDeadlineTime";
		cellPage.put("pyValue",pyValueOrig);
		cellPage.put("pyValueRO",pyValueR);
		modePage2.put("pyContent","localizevalue");
		modePage2.put("styleOther","");
		modePage2.put("pyFormatType","date");
		modePage2.put("pyReadonlyValidation",false);
		modePage2.put("pyDateFormat","DateTime-Frame");
		modePage2.put("pyDateTimeSecondCutoff","0");
		ClipboardProperty currProp = tools.getActive();
		String propTypeName = currProp.getTypeName();
		modePage2.put("pyPropertyType",propTypeName);
		String[] fieldValuesArray ={};
		fieldValuesArray = new String[]{"yearsmonths ago","yearsmonth ago","yearmonths ago","yearmonth ago","yearsmonths from now","yearsmonth from now","yearmonths from now","yearmonth from now","monthsdays ago","monthsday ago","monthdays ago","monthday ago","monthsdays from now","monthsday from now","monthdays from now","monthday from now","dayshours ago","dayshour ago","dayhours ago","dayhour ago","dayshours from now","dayshour from now","dayhours from now","dayhour from now","hoursminutes ago","hoursminute ago","hourminutes ago","hourminute ago","hoursminutes from now","hoursminute from now","hourminutes from now","hourminute from now","about a minute","about a minute ago","about a minute from now","less than a minute","less than a minute ago","less than a minute from now","years ago","years from now","year ago","year from now","months ago","months from now","month ago","month from now","days ago","days from now","day ago","day from now","hours ago","hours from now","hour ago","hour from now","minutes ago","minutes from now","today","It is"};
		for(int i=0;i<fieldValuesArray.length;i++){
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(fieldValuesArray[i], "pyFormatter");
		}
		String spxUniqueStreamHash117 = getUIActionsMetaData_1();
		if(spxUniqueStreamHash117 != null && !"".equals(spxUniqueStreamHash117)){
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash117,pxUniqueStreamHash+"_117");
		modePage2.put("pyActionStringID",pxUniqueStreamHash+"_117");
		}
		tools.putParamValue("skipHTMLEncoding", "false");
		cellPage.addMetadataInArray("pyModes",modePage1);
		cellPage.addMetadataInArray("pyModes",modePage2);
		metadataPage.putMetadata("pyCell",cellPage);
		ctrlComponent.addDependentScripts("pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
		ctrlComponent.addAdditionalScripts("pzDecimalInclude","pzpega_ui_decimal.js");
		ctrlComponent.beginComponent("pxDisplayText",metadataPage);
		ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	} else {
inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);
	}

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }	if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
	}
	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
	tools.putActive(propActivePrev); 	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}



public void pxButton_7() {	boolean isDisplayTextWithParam = false;
	String displayTextParamName = "";
	String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
	try {


	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span ");tools.appendString(">");
	 }	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
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
		if(expressionId !=null && expressionId.length() > 0){
		modePage2.put("pyExpressionId",expressionId);
		}
		String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
		String navPage="pyNavigation"+uid;
		cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("202007011657090787668") + " ");
		if(false || (pzAuto.isOffline() && false) ){ 
		modePage2.put("nav",navPage);
		}
		modePage2.put("pyName","HomeWorklist_$CTX$_86");
			String repeatIndx = "";
		String pyTooltip = "";
		modePage2.put("tooltip",pyTooltip);
		modePage2.put("helpertype","none");
		modePage2.put("styles","Strong");
		modePage2.put("imgSrc","none");
		modePage2.put("pyActionImagePosition","left");
		String customStyles = null;
		String pyLabel = "";
		if(pega.getPackageRuntime().canPackage()){
			tools.getLocalizedTextForString(".pyButtonLabel","Go\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
		} else {
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Go", ".pyButtonLabel");
		}
		pyLabel = "Go";
		modePage2.put("label",pyLabel);
		String spxUniqueStreamHash119 = getUIActionsMetaData_5();
		if(spxUniqueStreamHash119 != null && !"".equals(spxUniqueStreamHash119)){
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash119,pxUniqueStreamHash+"_119");
		modePage2.put("pyActionStringID",pxUniqueStreamHash+"_119");
		}
		modePage2.put("actionPath"," data-click='.'");
		tools.putParamValue("skipHTMLEncoding", "false");
		cellPage.addMetadataInArray("pyModes",modePage1);
		cellPage.addMetadataInArray("pyModes",modePage2);
		metadataPage.putMetadata("pyCell",cellPage);
		ctrlComponent.addDependentScripts("pzpega_ui_template_button.js");
		ctrlComponent.beginComponent("pxButton",metadataPage);
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
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_86'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("202007011657090787668") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }			{
			com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
			actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
			actionRequest.registerFixedParameter("action", "openAssignment");
			pzAuto.registerActionRequest(actionRequest);
			tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);			tools.appendString("\"]");
			tools.appendString("],[\"openAssignment\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");			tools.appendString("\",\"");

		tools.appendFormatted("f8b923c9-b58a-42e2-9e6b-24df27582146",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsOfflineEnabled")+"~#");			tools.appendString("\",{\"target\":\"primary\",\"pyReloadAlways\":\"false\"}]");
			}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsOfflineEnabled"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='Strong pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Go".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Go",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");		}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }		tools.putParamValue("doAutoFormatting", "false");
		tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}		} catch (Exception e) {

		
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

public void gridTemplateBody_2(ClipboardProperty dataCells, IUIComponentMetadata metadataPage, Map configMap, boolean isPartial, String tempGridName) {
ClipboardPage gridMetadataPage = (ClipboardPage)configMap.get("pxGridMetadataPage"); 
com.pega.pegarules.priv.runtime.IGridUtilities gridUtilities = pega.getUIEngine().getGridUtilities(); 
String pageListClassName = metadataPage.getNestedProperty("gridWrapper.resultsClass"); 
boolean newPageCreated = false; 
ClipboardPage itemPage = null; 
String pageListProperty = (String)configMap.get("pyContext"); 
pageListProperty = pzAuto.getUIComponentRuntime().getResolvedRefernce(pageListProperty); 
ClipboardProperty cpSource = tools.getProperty(pageListProperty); 
if(null != cpSource){ 
Iterator itemPages = cpSource.iterator(); 
if(itemPages.hasNext()) { 
 itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
}
}
if(null == itemPage){
itemPage = tools.createPage(pageListClassName,"");
newPageCreated = true; 
}
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus(); 
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y'); 
if(!isPartial){ 
gridMetadataPage.putString(".pyResultsClass", pageListClassName);
} 
if(org.apache.commons.lang3.StringUtils.isNotBlank((String)configMap.get("pyContext"))){
IUIComponent cc_grid = pzAuto.getUIComponent();
if(!isPartial){ 
cc_grid.addAdditionalBundles("RepeatingGrid", "pzpega_grid_staticbundle");
cc_grid.addAdditionalScripts("RepeatingGrid", "pzpega_ui_template_paginate.js");
cc_grid.addAdditionalBundles("ControlMenu","pzPega_control_menu_scripts");
} 
if(!isPartial && !pzAuto.isForOfflineTemplate()){ 
metadataPage.put("pxFilterConditionId",pxUniqueStreamHash+"_112");
gridMetadataPage.putString("pxFilterConditionId", pxUniqueStreamHash+"_112");
} 
String sectionBodyPath = ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2)";
ClipboardPage gridStatePage = null;
if(!isPartial){ 
metadataPage.put("pyIsPersonalized","false");
gridStatePage = pega.getUIEngine().getGridUtilities().getPersonalizedViewsPage(metadataPage.getString("pyGridStateUniqueID"), null, metadataPage.getString("pySectionInsName"), metadataPage.getString("pyOperatorID"), metadataPage.getString("pyHarnessInsName")); 
if(gridStatePage !=null) {
metadataPage.put("pyIsPersonalized","true");
metadataPage.put(gridUtilities.PY_GRID_MINWIDTH,gridStatePage.getString(gridUtilities.PY_GRID_MINWIDTH));
metadataPage.put(gridUtilities.PY_GRID_ROWHEIGHT,gridStatePage.getString(gridUtilities.PY_GRID_ROWHEIGHT));
metadataPage.put(gridUtilities.PY_PERSONALIZED_NAME,gridStatePage.getString(gridUtilities.PYLABEL));
}
}
cc_grid.beginComponent(tempGridName, metadataPage, configMap);
String oldSectionReadOnly = tools.getParamValue("SectionReadOnly"); 
tools.putParamValue("SectionReadOnly","-1"); 
boolean inputEnabledStatus = tools.hasInputEnabled();
tools.setInput(false);
IUIComponent gridBodyComp = pzAuto.getUIComponent();
gridBodyComp.beginComponent("pxGridBody",pzAuto.getUIComponentRuntime().createMetadata()); 
IUIComponent gridHeaderRowComp = pzAuto.getUIComponent(); 
gridHeaderRowComp.beginComponent("pxGridHeaderRow",pzAuto.getUIComponentRuntime().createMetadata()); 
IUIComponent headerHtmlComp = null; 
IUIComponentMetadata headermetadata_1 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(1);
headermetadata_1 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,1, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_1.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_1.put("data-ui-meta",pzCell.getInspectorDataDynamic("","ID",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_1); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_2 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(2);
headermetadata_2 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,2, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_2.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_2.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Description",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_2); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_3 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(3);
headermetadata_3 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,3, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_3.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_3.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Urgency",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_3); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_4 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(4);
headermetadata_4 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,4, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_4.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_4.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Status",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(4)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_4); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_5 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(5);
headermetadata_5 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,5, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_5.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_5.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Deadline",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(5)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_5); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_6 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(6);
headermetadata_6 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,6, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_6.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_6.put("data-ui-meta",pzCell.getInspectorDataDynamic("","",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(6)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_6); 
headerHtmlComp.endComponent(); 


 
gridHeaderRowComp.endComponent(); 
PRStackFrame itemFrame = pega.pushStackFrame("GridFirstRowItem", null, itemPage, true, false); 
IUIComponent gridRowComp = pzAuto.getUIComponent(IUIComponent.ComponentType.GRID); 
gridRowComp.beginComponent("pxGridDataRow",pzAuto.getUIComponentRuntime().createMetadata(), configMap); 
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty("pzInsKey");
inclAction_1();
IUIComponent cellHtmlComp = null; 
IUIComponentMetadata cellMetaData_1 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(1);
cellMetaData_1 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,1, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_1.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_1.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxLink",".pxRefObjectInsName",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_1); 
if(itemPage != null){
pxLink_9();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_2 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(2);
cellMetaData_2 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,2, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_2.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_2.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pyLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_2); 
if(itemPage != null){
pxDisplayText_27();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_3 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(3);
cellMetaData_3 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,3, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_3.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_3.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pxUrgencyAssign",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_3); 
if(itemPage != null){
pxDisplayText_28();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_4 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(4);
cellMetaData_4 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,4, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_4.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_4.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pyAssignmentStatus",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_4); 
if(itemPage != null){
pxDisplayText_29();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_5 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(5);
cellMetaData_5 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,5, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_5.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_5.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pxDeadlineTime",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_5); 
if(itemPage != null){
pxDisplayText_30(".pxDeadlineTime",0,"","","Date Time");
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_6 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(6);
cellMetaData_6 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,6, gridStatePage," axpzCanPerformAssignment");
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_6.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_6.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_6); 
cellMetaData_6.put("pyVisibilityWhenRule"," axpzCanPerformAssignment");
IUIComponentMetadata pxWhenIdentifiers_cellMetaData_6 = pzAuto.getUIComponentRuntime().createMetadata();
pxWhenIdentifiers_cellMetaData_6.put("pyVisibilityWhenId",pxUniqueStreamHash+"_120");
cellMetaData_6.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers_cellMetaData_6);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" axpzCanPerformAssignment", pxUniqueStreamHash+"_120"); 
if(itemPage != null){
pxButton_7();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
cellHtmlComp.endComponent(); 


 
pega.popStackFrame(itemFrame, false); 
gridRowComp.endComponent(); 
if(!isPartial){ 
generateGridSections_2(metadataPage, gridMetadataPage);
gridMetadataPage.putString(".pyResultsClass", pageListClassName);
} 
gridBodyComp.endComponent(); 
cc_grid.endComponent();
tools.putParamValue("SectionReadOnly",oldSectionReadOnly); 
tools.setInput(inputEnabledStatus);
}else { 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_112","HomeWorklistNoResults","@baseclass","",false,null);
}
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(currentTemplatingStatus); 
if(newPageCreated){
itemPage.removeFromClipboard(); 
}
tools.putParamValue("paramIndexValue",""); 
tools.putParamValue("skipTracking","false"); 
}
public void generateGridCellModes_2(String strGridMetadataPage) {
ClipboardPage gridMetadataPage = tools.findPage(strGridMetadataPage, true);
List<String> modesList = new ArrayList<String>(); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyMediaAutoplay>false</pyMediaAutoplay><pyRunOnClient>false</pyRunOnClient><pyType>I</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyWhenNotMet>hide</pyWhenNotMet><pyUIElement>link</pyUIElement><pyTrueLabel>True</pyTrueLabel><pyMediaMuted>true</pyMediaMuted><pyImageSource>none</pyImageSource><pyCannedIcon>pxIcon</pyCannedIcon><pyStyleName>Simple</pyStyleName><pyFormatTypeActionable>none</pyFormatTypeActionable><pyDirection>vertical</pyDirection><pyImageSize>auto</pyImageSize><pyHelperTextType>none</pyHelperTextType><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyModeType>Read-Only</pyModeType><pyMinSearchChars>2</pyMinSearchChars><pyHighlightMatch>true</pyHighlightMatch><pyDisplayFullScreen>true</pyDisplayFullScreen><pySpecifySize>auto</pySpecifySize><pyObfuscated>false</pyObfuscated><pyFormatType>text</pyFormatType><pyLinkButtonCaptionType>propertyReference</pyLinkButtonCaptionType><pyMediaLoop>false</pyMediaLoop><pyMediaPreload>auto</pyMediaPreload><pyDisabledNew>false</pyDisabledNew><pyDisabled>false</pyDisabled><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyIconShow>false</pyIconShow><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pyCannedIconNew>pxIcon</pyCannedIconNew><pySymbolPosition>left</pySymbolPosition><pyLabel>.pxRefObjectInsName</pyLabel><pyTextAlign>Left</pyTextAlign><pyContent>associated</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Control-Mode-Behaviors</pxObjClass><pyActionLabel>Open Work By Handle</pyActionLabel><pyUIElement>link</pyUIElement><pyExpanded>false</pyExpanded><pyAction>openWorkByHandle</pyAction><pyEvent>click</pyEvent><pyActionAPI><pxObjClass>Embed-DesktopAPI-OpenWorkByHandle</pxObjClass><pyActivityClassOrig>Assign-Worklist</pyActivityClassOrig><pyActivityClass>Assign-Worklist</pyActivityClass><pyACName>primary</pyACName><pyKey>.pxRefObjectKey</pyKey><pyReloadAlways>false</pyReloadAlways><pySkeletonName>pyOpenWorkSkeleton</pySkeletonName><pyTargetName>default</pyTargetName><pyIsSecondaryAC>false</pyIsSecondaryAC><pySelectedMobileTransitionType>pega.SKELETON</pySelectedMobileTransitionType><pyMobileTransitionTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>MobileTransition</pxObjClass><duration>0</duration><delay>0</delay><name>None</name><id>pega.mobile.transitions.NONE</id><transition>launchbox.ui.transition.Type.Empty</transition></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>MobileTransition</pxObjClass><duration>500</duration><delay>0</delay><name>Move forward</name><id>pega.mobile.transitions.MOVE_FORWARD</id><transition>launchbox.ui.transition.Type.Cover</transition><direction>launchbox.ui.transition.Direction.Left</direction></rowdata><rowdata REPEATINGINDEX=\"3\"><pxObjClass>MobileTransition</pxObjClass><duration>500</duration><delay>0</delay><name>Move backward</name><id>pega.mobile.transitions.MOVE_BACKWARD</id><transition>launchbox.ui.transition.Type.Reveal</transition><direction>launchbox.ui.transition.Direction.Right</direction></rowdata><rowdata REPEATINGINDEX=\"4\"><pxObjClass>MobileTransition</pxObjClass><duration>500</duration><delay>0</delay><name>Go home</name><id>pega.mobile.transitions.GO_HOME</id><transition>launchbox.ui.transition.Type.Flip</transition><direction>launchbox.ui.transition.Direction.Right</direction></rowdata><rowdata REPEATINGINDEX=\"5\"><pxObjClass>MobileTransition</pxObjClass><duration>0</duration><delay>0</delay><name>Use skeleton</name><id>pega.SKELETON</id><transition>None</transition></rowdata><rowdata REPEATINGINDEX=\"6\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"7\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"8\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"9\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"10\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"11\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"12\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"13\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"14\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"15\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"16\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"17\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"18\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"19\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"20\"><pxObjClass>MobileTransition</pxObjClass></rowdata></pyMobileTransitionTypes><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pyActionAPI><pyActionConditions REPEATINGTYPE=\"PageList\"/><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata></pyBehaviors><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource><pyChart><pxObjClass>Embed-Control-Mode-Chart</pxObjClass></pyChart></pagedata>"); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyModeType>Read-Only</pyModeType><pyObfuscatedNew>false</pyObfuscatedNew><pyMediaAutoplay>false</pyMediaAutoplay><pyMinSearchChars>2</pyMinSearchChars><pyHighlightMatch>true</pyHighlightMatch><pyRunOnClient>false</pyRunOnClient><pySpecifySize>auto</pySpecifySize><pyDisplayFullScreen>true</pyDisplayFullScreen><pyType>T</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyUIElement>label</pyUIElement><pyObfuscated>false</pyObfuscated><pyTrueLabel>True</pyTrueLabel><pyMediaMuted>true</pyMediaMuted><pyFormatType>text</pyFormatType><pyMediaLoop>false</pyMediaLoop><pyCannedIcon>pxIcon</pyCannedIcon><pyMediaPreload>auto</pyMediaPreload><pyDisabled>false</pyDisabled><pyDirection>vertical</pyDirection><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyIconShow>false</pyIconShow><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyHelperTextType>none</pyHelperTextType><pyImageSize>auto</pyImageSize><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pyCannedIconNew>pxIcon</pyCannedIconNew><pySymbolPosition>left</pySymbolPosition><pyTextAlign>Left</pyTextAlign><pyContent>localizevalue</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"/><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyModeType>Read-Only</pyModeType><pyObfuscatedNew>false</pyObfuscatedNew><pyMediaAutoplay>false</pyMediaAutoplay><pyHighlightMatch>true</pyHighlightMatch><pyMinSearchChars>2</pyMinSearchChars><pyRunOnClient>false</pyRunOnClient><pyDisplayFullScreen>true</pyDisplayFullScreen><pySpecifySize>auto</pySpecifySize><pyType>R</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyUIElement>label</pyUIElement><pyObfuscated>false</pyObfuscated><pyTrueLabel>True</pyTrueLabel><pyFormatType>text</pyFormatType><pyMediaMuted>true</pyMediaMuted><pyMediaLoop>false</pyMediaLoop><pyCannedIcon>pxIcon</pyCannedIcon><pyMediaPreload>auto</pyMediaPreload><pyDisabled>false</pyDisabled><pyDirection>vertical</pyDirection><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyIconShow>false</pyIconShow><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyImageSize>auto</pyImageSize><pyHelperTextType>none</pyHelperTextType><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pyCannedIconNew>pxIcon</pyCannedIconNew><pySymbolPosition>left</pySymbolPosition><pyTextAlign>Left</pyTextAlign><pyContent>localizevalue</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"/><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyModeType>Read-Only</pyModeType><pyObfuscatedNew>false</pyObfuscatedNew><pyMediaAutoplay>false</pyMediaAutoplay><pyHighlightMatch>true</pyHighlightMatch><pyMinSearchChars>2</pyMinSearchChars><pyRunOnClient>false</pyRunOnClient><pyDisplayFullScreen>true</pyDisplayFullScreen><pySpecifySize>auto</pySpecifySize><pyType>T</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyUIElement>label</pyUIElement><pyObfuscated>false</pyObfuscated><pyTrueLabel>True</pyTrueLabel><pyFormatType>text</pyFormatType><pyMediaMuted>true</pyMediaMuted><pyMediaLoop>false</pyMediaLoop><pyCannedIcon>pxIcon</pyCannedIcon><pyMediaPreload>auto</pyMediaPreload><pyDisabled>false</pyDisabled><pyDirection>vertical</pyDirection><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyIconShow>false</pyIconShow><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyHelperTextType>none</pyHelperTextType><pyImageSize>auto</pyImageSize><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pyCannedIconNew>pxIcon</pyCannedIconNew><pySymbolPosition>left</pySymbolPosition><pyTextAlign>Left</pyTextAlign><pyContent>localizevalue</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"/><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
modesList.add(""); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyMediaAutoplay>false</pyMediaAutoplay><pyRunOnClient>false</pyRunOnClient><pyType>T</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyWhenNotMet>hide</pyWhenNotMet><pyUIElement>button</pyUIElement><pyTrueLabel>True</pyTrueLabel><pyMediaMuted>true</pyMediaMuted><pyImageSource>none</pyImageSource><pyCannedIcon>pxIcon</pyCannedIcon><pyStyleName>Strong</pyStyleName><pyDirection>vertical</pyDirection><pyHelperTextType>none</pyHelperTextType><pyImageSize>auto</pyImageSize><pyActionImagePosition>left</pyActionImagePosition><pyIsNewMarkup>true</pyIsNewMarkup><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyModeType>Read-Only</pyModeType><pyHighlightMatch>true</pyHighlightMatch><pyMinSearchChars>2</pyMinSearchChars><pyDisplayFullScreen>true</pyDisplayFullScreen><pySpecifySize>auto</pySpecifySize><pyObfuscated>false</pyObfuscated><pyFormatType>text</pyFormatType><pyLinkButtonCaptionType>text</pyLinkButtonCaptionType><pyMediaLoop>false</pyMediaLoop><pyMediaPreload>auto</pyMediaPreload><pyDisabled>false</pyDisabled><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyIconShow>false</pyIconShow><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pySymbolPosition>left</pySymbolPosition><pyCannedIconNew>pxIcon</pyCannedIconNew><pyLabel>Go</pyLabel><pyTextAlign>Left</pyTextAlign><pyContent>associated</pyContent><pxSubscript>2</pxSubscript><pyBehaviors REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Control-Mode-Behaviors</pxObjClass><pyActionLabel>Open Assignment</pyActionLabel><pyUIElement>button</pyUIElement><pyExpanded>false</pyExpanded><pyAction>openAssignment</pyAction><pyEvent>click</pyEvent><pyActionAPI><pyActivityClassOrig>Assign-Worklist</pyActivityClassOrig><pyActivityClass>Assign-Worklist</pyActivityClass><pyACName>primary</pyACName><pyReloadAlways>false</pyReloadAlways><pyTargetName>default</pyTargetName><pxObjClass>Embed-DesktopAPI-OpenAssignment</pxObjClass><pyInsKey>.pzInsKey</pyInsKey><pyIsSecondaryAC>false</pyIsSecondaryAC><pySelectedMobileTransitionType>pega.mobile.transitions.NONE</pySelectedMobileTransitionType><pyMobileTransitionTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>MobileTransition</pxObjClass><duration>0</duration><delay>0</delay><name>None</name><id>pega.mobile.transitions.NONE</id><transition>launchbox.ui.transition.Type.Empty</transition></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>MobileTransition</pxObjClass><duration>500</duration><delay>0</delay><name>Move forward</name><id>pega.mobile.transitions.MOVE_FORWARD</id><transition>launchbox.ui.transition.Type.Cover</transition><direction>launchbox.ui.transition.Direction.Left</direction></rowdata><rowdata REPEATINGINDEX=\"3\"><pxObjClass>MobileTransition</pxObjClass><duration>500</duration><delay>0</delay><name>Move backward</name><id>pega.mobile.transitions.MOVE_BACKWARD</id><transition>launchbox.ui.transition.Type.Reveal</transition><direction>launchbox.ui.transition.Direction.Right</direction></rowdata><rowdata REPEATINGINDEX=\"4\"><pxObjClass>MobileTransition</pxObjClass><duration>500</duration><delay>0</delay><name>Go home</name><id>pega.mobile.transitions.GO_HOME</id><transition>launchbox.ui.transition.Type.Flip</transition><direction>launchbox.ui.transition.Direction.Right</direction></rowdata><rowdata REPEATINGINDEX=\"5\"><pxObjClass>MobileTransition</pxObjClass><duration>0</duration><delay>0</delay><name>Use skeleton</name><id>pega.SKELETON</id><transition>None</transition></rowdata><rowdata REPEATINGINDEX=\"6\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"7\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"8\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"9\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"10\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"11\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"12\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"13\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"14\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"15\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"16\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"17\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"18\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"19\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"20\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"21\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"22\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"23\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"24\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"25\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"26\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"27\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"28\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"29\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"30\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"31\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"32\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"33\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"34\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"35\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"36\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"37\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"38\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"39\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"40\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"41\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"42\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"43\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"44\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"45\"><pxObjClass>MobileTransition</pxObjClass></rowdata></pyMobileTransitionTypes><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pyActionAPI><pyActionConditions REPEATINGTYPE=\"PageList\"/><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata></pyBehaviors><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
ClipboardProperty gridMetaColumns = gridMetadataPage.getProperty("pyColumns"); 
java.util.Iterator it = gridMetaColumns.iterator(); 
ClipboardPage pyModesPage = tools.createPage("@baseclass", "pyModesPage"); 
while(it.hasNext()) { 

ClipboardPage columnProp = ((ClipboardProperty)it.next()).getPageValue(); 
boolean noModes = columnProp.getPage("pyModes").isEmpty(); 
if(noModes) { 
int index = columnProp.getInteger(".pyInitialOrder") - 1; 
String strModesXML = modesList.get(index); 
if(!org.apache.commons.lang.StringUtils.isBlank(strModesXML)){ 
	try { 
		pyModesPage.adoptXMLForm(strModesXML); 
        columnProp.putPage(".pyModes", pyModesPage); 
	} catch (InvalidStreamError e) { 
		oLog.error(e); 
	} 
} 
} 
} 
pyModesPage.removeFromClipboard(); 
}
public void getGridMetaData_2(IUIComponentMetadata metadataPage, IUIComponentMetadata gridWrapper) {
metadataPage.put("pyWidthOfContent","%");
gridWrapper.put("responsive","true");
gridWrapper.put("contentClass","grid-responsive-default  gPercent ");
gridWrapper.put("pzClass","default");
gridWrapper.put("DPName","D_WorkBasket.pxResults");
gridWrapper.put("propType","Data Object");
gridWrapper.put("resultsClass","Assign-WorkBasket");
String dataTestId = pzAuto.getTestIdIfEnabled("202007011657090783567", true); 
if(!"".equalsIgnoreCase(dataTestId)){
gridWrapper.put("automationId","202007011657090783567");
}
gridWrapper.put("isFilteringEnabled","true");
gridWrapper.put("isColumnResizeEnabled","true");
gridWrapper.put("isColumnReorderEnabled","true");
gridWrapper.put("isRefreshListEnabled","true");
gridWrapper.put("pyPassCurrentParamPage","false");
gridWrapper.put("isSortingEnabled","true");
gridWrapper.put("isRowHeightEnabled","true");
gridWrapper.put("isColumnTogglerEnabled","true");
gridWrapper.put("isPersonalizationEnabled","true");
gridWrapper.put("isCategorizationEnabled","true");
gridWrapper.put("isImplicitSaveEnabled","true");
gridWrapper.put("pyDesignViewName","Default");
metadataPage.put("pyPersonalizedName","Default");
gridWrapper.put("isRowVisibilityEnabled","false");
IUIComponentMetadata gridTable = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata rowOperations = pzAuto.getUIComponentRuntime().createMetadata();
gridTable.put("isDPParameterized","true");
gridTable.put("inlinestyle","width:100%;");
gridTable.put("gridSummary",tools.getLocalizedTextForString("pyCaption",""));
gridTable.put("gridCaption",tools.getLocalizedTextForString("pyCaption",""));
gridWrapper.put("hasRowOperations","false");
pega.getUIEngine().getGridUtilities().populateLocalizedText(gridWrapper, gridTable);
if(!pzAuto.isForOfflineTemplate()){
metadataPage.put("pyShowFiltersInModal","false");
}
gridWrapper.put("sectionName","HomeWorklist");
gridWrapper.put("sectionClass","Data-Portal");
metadataPage.putMetadata("gridTable",gridTable);
metadataPage.putMetadata("rowOperations",rowOperations);
}
public void gridTemplateMain_2(IUIComponentMetadata metadataPage, IUIComponentMetadata gridWrapper) {
Map dpParamsMap = new HashMap();
if(!pzAuto.isForOfflineTemplate()){
String propWithToken =  null; 
String propResolved =  null; 
dpParamsMap.put("WorkGroup","D_PortalContextGlobal.pyActiveWorkGroup");
propWithToken = pzAuto.getUIComponentRuntime().generateTokensForString("D_PortalContextGlobal.pyActiveWorkGroup"); 
propResolved = pzAuto.getUIComponentRuntime().resolveTokensInString(propWithToken); 
tools.putParamValue("WorkGroup", tools.getProperty(propResolved).getStringValue());
dpParamsMap.put("WorkBasket","D_PortalContext.pyLabel");
propWithToken = pzAuto.getUIComponentRuntime().generateTokensForString("D_PortalContext.pyLabel"); 
propResolved = pzAuto.getUIComponentRuntime().resolveTokensInString(propWithToken); 
tools.putParamValue("WorkBasket", tools.getProperty(propResolved).getStringValue());
}
IUIComponentMetadata tempDPParamPage = pzAuto.getUIComponentRuntime().createMetadata();
tempDPParamPage.put("pyName","WorkGroup");
tempDPParamPage.put("pyValue","#~"+pzAuto.getUIComponentRuntime().generateActionToken("D_PortalContextGlobal.pyActiveWorkGroup")+"~#");
tempDPParamPage.put("pyName","WorkBasket");
tempDPParamPage.put("pyValue","#~"+pzAuto.getUIComponentRuntime().generateActionToken("D_PortalContext.pyLabel")+"~#");
metadataPage.addMetadataInArray("dpParams",tempDPParamPage);
String gridXML = "<?xml version=\"1.0\"?><pagedata><pxObjClass>Pega-UI-Component-Grid</pxObjClass><pyWidthOfContent>%</pyWidthOfContent><pzStatus>false</pzStatus><pzGridTable><pxObjClass>Pega-UI-Component-Grid-GridTable</pxObjClass><pzStyle>width:100%;</pzStyle></pzGridTable><pyDataCells REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>AV</pyColumnVisibility><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>76px</pyCellWidth><pyContentType>FIELD</pyContentType><pyEditOptions>Auto</pyEditOptions><pyHeaderLabel>ID</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pxRefObjectInsName</pyPropertyName><pyColumnImportance>primary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IV</pyColumnVisibility><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>302px</pyCellWidth><pyReadOnlyStyle>standard_dataLabelRead</pyReadOnlyStyle><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Description</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pyLabel</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR><PZ__ERROR DATAFLD=\"pyReadOnlyStyle\">pyReadOnlyStyle needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"3\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IV</pyColumnVisibility><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>100px</pyCellWidth><pyReadOnlyStyle>standard_dataLabelRead </pyReadOnlyStyle><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Urgency</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pxUrgencyAssign</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR><PZ__ERROR DATAFLD=\"pyReadOnlyStyle\">pyReadOnlyStyle needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"4\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IV</pyColumnVisibility><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>100px</pyCellWidth><pyReadOnlyStyle>standard_dataLabelRead </pyReadOnlyStyle><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Status</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pyAssignmentStatus</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR><PZ__ERROR DATAFLD=\"pyReadOnlyStyle\">pyReadOnlyStyle needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"5\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IH</pyColumnVisibility><pyColumnFiltering>search</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>100px</pyCellWidth><pyReadOnlyStyle>standard_dataLabelRead </pyReadOnlyStyle><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Deadline</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pxDeadlineTime</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR><PZ__ERROR DATAFLD=\"pyReadOnlyStyle\">pyReadOnlyStyle needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"6\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IV</pyColumnVisibility><pyColumnFiltering>false</pyColumnFiltering><pyColumnSorting>false</pyColumnSorting><pyCellWidth>93px</pyCellWidth><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyPropertyName>.pyTemplateInputBox</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata></pyDataCells><pzGridWrapper><pxObjClass>Pega-UI-Component-Grid-GridWrapper</pxObjClass><pzContentClass>grid-responsive-default  gPercent </pzContentClass><pzPropertyType>Data Object</pzPropertyType><pyResultsClass>Assign-WorkBasket</pyResultsClass><pzClass>default</pzClass><pyDataPageName>D_WorkBasket.pxResults</pyDataPageName><pyResponsive>true</pyResponsive><pyAutomationID>202007011657090783567</pyAutomationID></pzGridWrapper></pagedata>";
ClipboardPage temp_gridConfigPage = tools.createPage(null,"temp_gridConfigPage");
try {
  temp_gridConfigPage.adoptXMLForm(gridXML);
} catch(InvalidStreamError e){oLog.error(e);}
getGridMetaData_2(metadataPage,gridWrapper);
Map configMap = new HashMap(); 
ClipboardPage gridMetadataPage = tools.createPage("Pega-UI-Component-Grid-Filter","GridMetadata_Main"+pzAuto.getUIComponentRuntime().generateUniqueId());
gridMetadataPage.putString(".pySectionClass","Data-Portal");
gridMetadataPage.putString(".pySectionName","HomeWorklist");
configMap.put("pxGridMetadataPage", gridMetadataPage); 
gridMetadataPage.putString("pyFilteringEnabled", "true");
gridMetadataPage.putString("pySortingEnabled", "true");
gridMetadataPage.putString(".pyIsCategorizationEnabled", "true");
metadataPage.put("gridActions",getGridActions_1().trim());
String strDSName = gridWrapper.getString("DPName"); 
String strDSNameWithToken = pzAuto.getUIComponentRuntime().generateTokensForString(strDSName);
gridWrapper.put("pageListProp",strDSNameWithToken);
String strDSNameWithResolved = pzAuto.getUIComponentRuntime().getResolvedRefernce(strDSName);
gridMetadataPage.putString("pyPageList",strDSNameWithResolved);
pega.getUIEngine().getGridUtilities().updateQueryableDPInfo(strDSName,gridMetadataPage);
boolean isQueryable = gridMetadataPage.getBoolean("isQueryable");
ClipboardProperty dataCells = temp_gridConfigPage.getProperty(".pyDataCells"); 
temp_gridConfigPage.remove(".pyDataCells"); 
ClipboardPage gridStatePage = null;
com.pega.pegarules.priv.runtime.IGridUtilities gridUtilities = pega.getUIEngine().getGridUtilities(); 
pega.getUIEngine().getGridUtilities().registerGridActiviy();
metadataPage.put("pyIsPersonalized","false");
gridStatePage = gridUtilities.getPersonalizedViewsPage(metadataPage.getString("pyGridStateUniqueID"), null, metadataPage.getString("pySectionInsName"), metadataPage.getString("pyOperatorID"), metadataPage.getString("pyHarnessInsName")); 
if(null != gridStatePage){ 
dataCells = gridUtilities.mergeViewAndDesign(dataCells, gridStatePage); 
} 
configMap.put("params", dpParamsMap); 
configMap.put("pyContext", strDSName); 
configMap.put("listAction", "INIT"); 
configMap.put("pyCollectProps", "true"); 
configMap.put("pxDataSourceId", pxUniqueStreamHash+"_111");
gridWrapper.put("datasrcid",pxUniqueStreamHash+"_111");
if(isQueryable){
gridWrapper.put("isPagingEnabled","true");
gridWrapper.put("isSearchEnabled","true");
}else {
gridWrapper.put("isSearchEnabled","false");
gridWrapper.put("isPagingEnabled","true");
}
IUIComponentMetadata pagingSettings = pzAuto.getUIComponentRuntime().createMetadata();
com.pega.pegarules.priv.util.PaginatorMetaData.getPaginationMetaData(20, 1, strDSNameWithToken,"Numeric",pzAuto, "", metadataPage, pagingSettings); 
   int startIndex = 1; 
   int endIndex = 0; 
   int pxResultCount = 20;
   endIndex = pxResultCount; 
Map pyPagination = new HashMap(); 
pyPagination.put("pyStartIndex", ""+startIndex); 
pyPagination.put("pyEndIndex", ""+endIndex); 
configMap.put("pyPagination", pyPagination); 
configMap.put("pxPageSize", pxResultCount); 
gridMetadataPage.putString("pxPageSize", "20"); 
gridMetadataPage.putString("pxPageIndex", "1"); 
configMap.put("pxPageIndex", 1); 
gridWrapper.put("cellMethodName","generateGridCellModes_2");
if(isQueryable){
boolean isTablecategorized = false; 
if(gridStatePage != null) {
ClipboardPage tempPage = tools.createPage("System-User-Grids", "tempPage"); 
 tempPage.putAll(gridStatePage, ClipboardPage.PUTALL_KEEPNEW); 
tempPage.putString("isFilteringEnabled",gridMetadataPage.getString("pyFilteringEnabled"));
tempPage.putString("isSortingEnabled",gridMetadataPage.getString("pySortingEnabled"));
tempPage.putString("pxPageSize",gridMetadataPage.getString("pxPageSize"));
tempPage.putString("pxPageIndex",gridMetadataPage.getString("pxPageIndex"));
isTablecategorized = pega.getUIEngine().getGridUtilities().setCategorizationStatus(tempPage.getProperty("pyColumns"),tempPage);
pega.getUIEngine().getGridUtilities().setImplicitParameter(true ,tempPage);
tempPage.removeFromClipboard();
}else {
isTablecategorized = pega.getUIEngine().getGridUtilities().setCategorizationStatus(dataCells,gridMetadataPage);
pega.getUIEngine().getGridUtilities().setImplicitParameter(false ,gridMetadataPage);
}
isQueryable = gridMetadataPage.getBoolean("isQueryable");
if(isQueryable){
pega.getUIEngine().getGridUtilities().mergeColumnInfo(dataCells,gridMetadataPage);
gridWrapper.put("isQueryable","true");
if(isTablecategorized) {
configMap.put("isQueryable", "false"); 
}else{
configMap.put("isQueryable", "true"); 
}
}else{
}
}
gridWrapper.put("ctMethodName","gridTemplatePartial_2");
metadataPage.putMetadata("gridWrapper",gridWrapper);
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage(); 
gridTemplateBody_2(dataCells, metadataPage, configMap, false, "pxGrid");
temp_gridConfigPage.removeFromClipboard(); 
tools.putParamValue("isDPParameterized",""); 
gridMetadataPage.removeFromClipboard();
dataCells.removeFromClipboard();
gridUtilities.clearVisitedFlagInGridState(gridStatePage);
}
public void pzSetExpandParam_9() {
pzSection.getLayout().setExpandParam("SubSectionHomeWorklistBBBBBB","",false);
}
public void LayoutWrapperTableStart_2() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionHomeWorklistBBBBBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\">");
}
public void gridTemplateInit_2() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata gridWrapper = pzAuto.getUIComponentRuntime().createMetadata();
String pyGridStateUniqueID= "1593637851499";
String pySectionInsName= "DATA-PORTAL!HOMEWORKLIST";
String pyOperatorID= tools.findPage("OperatorID").getString(".pyUserIdentifier");
String harnessClassName = tools.getParamValue("strPHarnessClass");
if(StringUtils.isBlank(harnessClassName)) {
harnessClassName = tools.getParamValue("className");
}
String harnessName = tools.getParamValue("innerHarnessName");
if(StringUtils.isBlank(harnessName)) {
harnessName = tools.getParamValue("strPHarnessPurpose");
if(StringUtils.isBlank(harnessName)) {
harnessName = tools.getParamValue("Purpose");
}
}
String pyHarnessInsName= harnessClassName+"!"+harnessName;
metadataPage.put("pyGridStateUniqueID",pyGridStateUniqueID);
metadataPage.put("pySectionInsName",pySectionInsName);
metadataPage.put("pyOperatorID",pyOperatorID);
metadataPage.put("pyHarnessInsName",pyHarnessInsName);
gridWrapper.put("pzCTResetSaveMethodName","gridTemplateSwitchPersonalization_2");
gridTemplateMain_2(metadataPage, gridWrapper);
}
public void 
gridBeginLayout_4() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "Numeric"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 
if(tools.getIfPresent("D_PortalContextGlobal.pyActiveWorkGroup") != null)
tools.putParamValue("WorkGroup",tools.getProperty("D_PortalContextGlobal.pyActiveWorkGroup").getStringValue());
if(tools.getIfPresent("D_PortalContext.pyLabel") != null)
tools.putParamValue("WorkBasket",tools.getProperty("D_PortalContext.pyLabel").getStringValue());
ClipboardPage tmpDeclarePageParams = null;
String dpParams = tools.getParamValue("declarePageParams");
java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("(\\{)(.+?)(:)|(,)(.+?)(:)");
java.util.regex.Matcher matcher = pattern.matcher(dpParams);
while (matcher.find()) {
String name = matcher.group(2);
String name1 = matcher.group(5);
if (name != null)
dpParams = dpParams.replace(name, name.replaceAll("\\.", "_"));
if (name1 != null)
dpParams = dpParams.replace(name1, name1.replaceAll("\\.", "_"));
}
try {
if (!"".equals(dpParams)) {
Object dpParamsList = tools.createPage("@baseclass","Temp_Grid_DeclarePageParams");
tmpDeclarePageParams = (ClipboardPage)dpParamsList;
tmpDeclarePageParams.adoptJSONObject(dpParams);
}
if (tmpDeclarePageParams != null && tmpDeclarePageParams.getProperty("D_WorkBasket_pxResults_HomeWorklist_1") != null) {
ClipboardPage paramList = tmpDeclarePageParams.getProperty("D_WorkBasket_pxResults_HomeWorklist_1").getPageValue();
java.util.Collection col= paramList.values();
Iterator it = col.iterator();
while(it.hasNext()){
ClipboardProperty cp= (ClipboardProperty)it.next();
tools.putParamValue(cp.getName(),cp.toString());
}
}
} catch(InvalidStreamError e){
oLog.error("ReloadSections:Invalid JSON Stream for data page params : "+e.getMessage());
} catch(Exception e){
oLog.error("ReloadSections:Expection : "+e.getMessage());
}

 ClipboardPage gFCritPageD_WorkBasket_pxResultsL11=null;

 Map selUniqMapD_WorkBasket_pxResultsL11 = null;

 Set filteredIndicesSetD_WorkBasket_pxResultsL11 = null;

	 String strFCPage = "pyFilterCriteria_D_WorkBasket.pxResults_HomeWorklist_1";

	 strFCPage = strFCPage.replaceAll("[^\\w]","_");

	 ClipboardPage pg_fcPage = tools.findPage(strFCPage, true);

if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")){

	 if(pg_fcPage!=null){pg_fcPage.removeFromClipboard();}

}

gFCritPageD_WorkBasket_pxResultsL11=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

  selUniqMapD_WorkBasket_pxResultsL11 = null; // reset the variable

 if(gFCritPageD_WorkBasket_pxResultsL11 != null){ 

 		 filteredIndicesSetD_WorkBasket_pxResultsL11 = pega_uiengine_uiengine.pzPopulateFilteredindicesMap(gFCritPageD_WorkBasket_pxResultsL11, "D_WorkBasket.pxResults");

 		 tools.getParameterPage().put("filteredIndicesSet", filteredIndicesSetD_WorkBasket_pxResultsL11);

 tools.putParamValue("populateSelectedUIValues", "true");

 		 selUniqMapD_WorkBasket_pxResultsL11 = pega_uiengine_uiengine.pzPopulateSelectedValues(gFCritPageD_WorkBasket_pxResultsL11); 

 		 tools.getParameterPage().put("selUniqMapD_WorkBasket_pxResultsL11", selUniqMapD_WorkBasket_pxResultsL11);

 tools.putParamValue("populateSelectedUIValues", "");

 }
tools.appendString("<div id='CT' RLW='true'IRW=\"D_PortalContextGlobal.pyActiveWorkGroup Changes || D_PortalContext.pyLabel Changes\" data-declare-params=\"");
tools.appendString("{'WorkGroup':'"+ "#~"+pzAuto.getUIComponentRuntime().generateActionToken("D_PortalContextGlobal.pyActiveWorkGroup")+"~#" +"','WorkBasket':'"+ "#~"+pzAuto.getUIComponentRuntime().generateActionToken("D_PortalContext.pyLabel")+"~#" +"'}");tools.appendString("\" >");
						try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker refreshListWhenTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

							refreshListWhenTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking("D_PortalContextGlobal.pyActiveWorkGroup"), -1);

							refreshListWhenTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking("D_PortalContext.pyLabel"), -1);
}}catch(Exception e){}
tools.appendString("<div  section_index='1' ");
tools.appendString(" dataSource='");if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_WorkBasket.pxResults").getReference());tools.appendString("_HomeWorklist_1'");
tools.appendString(" hashed-dp-page='");
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_WorkBasket.pxResults").getReference());tools.appendString("' bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("202007011657090783567") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='nextGenReadOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='true' bReportDefinition='false' bLoadActivity='false' bDataObject='true' bCBOptimize='true'");
if(tools.getParamValue("pyGridFilterCriteriaPage")!="" ) {
tools.appendString(" bFilteredGrid = 'true'");
}
tools.appendString(" bRangeFilterByFormat='false' DPSectionID=\"SubSectionHomeWorklistBBBBBB\"  OAFunc='openAssignment' ");
D_pzUserWorkListByUserId_pxResults_1();
tools.appendString(">");


 ClipboardProperty pageListProp = null;

 int startIndex = "".equals(tools.getParamValue("startIndex"))?0:Integer.parseInt(tools.getParamValue("startIndex")); 


 int currentPageIndex = 0; 

 if(startIndex == 0){ startIndex = 1; } 

 tools.putParamValue("isHidePagingWhenOnePage", "true"); 

 tools.putParamValue("pyPageMode", strPageMode); 


 tools.putParamValue("pyPageSize", "20"); 

 tools.putSaveValue("pyPageSize", "20"); 

 int pyPageSize = Integer.parseInt(tools.getParamValue("pyPageSize")); 

 currentPageIndex = (startIndex % pyPageSize ==0)? (startIndex / pyPageSize) : (startIndex / pyPageSize) +1 ; 
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {


 pageListProp = tools.getProperty("D_WorkBasket.pxResults"); 
 int iDPTotPages = (pageListProp.size()%pyPageSize==0) ? (pageListProp.size()/pyPageSize) : (pageListProp.size()/pyPageSize)+1;
 if(((startIndex/pyPageSize)+1)>iDPTotPages) {
	 currentPageIndex = iDPTotPages;
	 startIndex = ((iDPTotPages-1)*pyPageSize)+1;
 }
if(currentPageIndex<=0) { currentPageIndex = 1; }
if(startIndex<=0) { startIndex = 1; }
}

 tools.putParamValue("startIndex",startIndex); 

 tools.putParamValue("currentPageIndex",currentPageIndex); 

 tools.putSaveValue("currentPageIndex",""+currentPageIndex); 

 int endPageIndex = (currentPageIndex%10==0)?currentPageIndex:(currentPageIndex/10+1)*10; 

 tools.putParamValue("endPageIndex",endPageIndex); 

 if(pageListProp!=null) { 

 tools.putParamValue("PageListProperty",pageListProp.getReference()); 

 } else {

 tools.putParamValue("PageListProperty","D_WorkBasket.pxResults");}
/* to calculate the total number of records in case of filtering with pagination..false*/
/* to calculate the total number of records in case of filtering with pagination..*/
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

 {int counter = 0; int rowsDisplayed = 0; 
ClipboardProperty propActivePrev = tools.getActive(); 

	Iterator itr = tools.getProperty("D_WorkBasket.pxResults").iterator();
		Set filteredResultsSet = new HashSet();
			while(itr.hasNext()){
				ClipboardProperty cp_eachProp = (ClipboardProperty)itr.next();
				ClipboardPage pg_eachProp = cp_eachProp.getPageValue();
				PRStackFrame frame = pega.pushStackFrame("FilteredGrid", null, pg_eachProp, false, false);
				tools.putActive(cp_eachProp);
				boolean bFilterResult = false;
				if(gFCritPageD_WorkBasket_pxResultsL11!= null){
				bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_WorkBasket_pxResultsL11, selUniqMapD_WorkBasket_pxResultsL11);
				}
				if(bFilterResult){
					int itemIndex = cp_eachProp.indexOf() ;
						filteredResultsSet.add((Integer)itemIndex);
						}
						
 			 if (gFCritPageD_WorkBasket_pxResultsL11== null || bFilterResult) {
						
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
						pageListProp = tools.getProperty("D_WorkBasket.pxResults"); }
						
 	   int totalRecords = 0; 
						   if(!"".equals(tools.getParamValue("totalRecords"))){
						try{
						 totalRecords = Integer.parseInt(tools.getParamValue("totalRecords"));
						}catch(Exception e){/*A number format exception has occured.*/} }
						   tools.putSaveValue("totalRecords", ""+totalRecords); 

						 if(!tools.getParamValue("totalRecords").equals("")){ 

						   int endIndex = 0;

						   endIndex = startIndex + pyPageSize - 1;

						   endIndex = endIndex>totalRecords ? totalRecords : endIndex; 

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
					

public void gridCentreLayout_2() {/*gridCentreLayout*/
					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;
					java.util.Map functionsMap = null;
					java.util.Map classesMap = null;
					ClipboardPage gFCritPageD_WorkBasket_pxResultsL11=null;
					Map selUniqMapD_WorkBasket_pxResultsL11 = null;
					selUniqMapD_WorkBasket_pxResultsL11 = null; // reset the variable
					gFCritPageD_WorkBasket_pxResultsL11=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));
							 selUniqMapD_WorkBasket_pxResultsL11 = (Map)tools.getParameterPage().getObject("selUniqMapD_WorkBasket_pxResultsL11");
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
					tools.putSaveValue("bAllowRowUpdate","true");
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					
					
					
					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					
					
					
					
					tools.putSaveValue("bUseMenuInline","false");

					
					
					
					
					
					pzGridIncludes_1();

					
					
					
					
					
					if(tools.getParamValue("partialRefresh").equals("")&& !Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()){

					
					
					
					
					
					ClipboardProperty prop = tools.getProperty("D_WorkBasket.pxResults");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pxRefObjectInsName .pyLabel .pxUrgencyAssign .pyAssignmentStatus .pxDeadlineTime .pyTemplateInputBox  ' class='yui-skin-sam gPercent grid-responsive-default ");

					
					
					
					
					
					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					
					
					
					
					
					}tools.appendString("' style='");

					
					
					
					
					
					tools.appendString("' gPropIndex='D_WorkBasketPpxResults1' editRowIndex='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					
					
					
					
					
					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					
					
					
					
					
					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					
					
					
					
					
					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					
					
					
					
					
					tools.appendString("gridActiveRow='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					
					
					
					
					
					tools.getParameterPage().remove("gridActiveRow"); 

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"true\" bFiltering=\"true\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\"");

					
					
					
					
					
					if(tools.getParamValue("showFADetails").equals("true")) { tools.appendString("callFADetails='true'"); }if(tools.getParamValue("showNextFADetails").equals("true")) { tools.appendString("callNextFADetails='true'");}if(tools.getParamValue("refreshLayoutFromConfig").equals("true")) { tools.appendString("refreshLayoutFromConfig='true'");}tools.appendString(" dpParams=\"WorkGroup,WorkBasket\" pyPageSize = '");

					
					
					
					
					
					tools.appendParamCSF("pyPageSize"); tools.appendString("' pyReturnResultCount = '");

					
					
					
					
					
					tools.appendParamCSF("pyReturnResultCount"); tools.appendString("' pyPageMode= '");

					
					
					
					
					
					tools.appendParamCSF("pyPageMode"); tools.appendString("' totalRecords= '");

					
					
					
					
					
					tools.appendParamCSF("totalRecords"); tools.appendString("' currentPageIndex='");

					
					
					
					
					
					tools.appendParamCSF("currentPageIndex"); tools.appendString("' pySortHandled=\"false\" pyFilterHandled=\"false\">");

					
					
					
					
					
					

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					
					
					
					
					
					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("202007011657090783567-layout") + " ");

					
					
					
					
					
					tools.appendString(" class='gridTable ");

					
					
					
					
					
					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					
					
					
					
					
					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					
					
					
					
					
					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					
					
					
					
					
					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"D_WorkBasketPpxResults1colWidthGBL\" id=\"D_WorkBasketPpxResults1colWidthGBL\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthGBL"));tools.appendString("\" />");

					
					
					
					
					
					
						 tools.putParamValue("expandRL","false"); 

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"D_WorkBasketPpxResults1colWidthGBR\" id=\"D_WorkBasketPpxResults1colWidthGBR\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_WorkBasketPpxResults1colWidthGBR"));

					
					
					
					
					
					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					
					
					
					
					
					 if(!("".equals(tools.getParamValue("D_WorkBasketPpxResults1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					
					
					
					
					
					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='' bColumnResize=\"true\" PL_PROP='D_WorkBasket.pxResults' PL_PROP_CLASS='Assign-WorkBasket' PRIM_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getPrimaryPage().getName());

					
					
					
					
					
					tools.appendString("' GRID_REF_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getStepPage().getReference());

					
					
					
					
					
					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' >");

					
					
					
					
					
					 repeatingHeaderCell_10(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_11(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_12(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_13(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_14(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_15(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
					
					
					
					
					
 {int counter = 0; int rowsDisplayed = 0; 

					
					
					
					
					
					
								 {Iterator itr_3 = null;

					
					
					
					
					
					if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

					
					
					
					
					
					
								 itr_3 = tools.getProperty("D_WorkBasket.pxResults").iterator(); 

					
					
					
					
					
					} else {

					
					
					
					
					
					tools.putSaveValue("rowsDisplayed", rowsDisplayed + "");

					
					
					
					
					
					}

					
					
					
					
					
					
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
										 } else if(gFCritPageD_WorkBasket_pxResultsL11!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_WorkBasket_pxResultsL11, selUniqMapD_WorkBasket_pxResultsL11);
										 }
										 if (gFCritPageD_WorkBasket_pxResultsL11== null || 

					
					
					
					
					
					 tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf())) || 

					
					
					
					
					
					 bFilterResult) {

					
					
					
					
					
					
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

					
					
					
					
					
					tools.appendString(" ng-repeat=\"Item in rootData.D_WorkBasket.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					
					
					 
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

					
					
					
					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_WorkBasket.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_WorkBasket.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					
					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					
					
					
					String strEntryHandlePLProp = "";

					
					
					
					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_WorkBasket.pxResults"); } catch (Exception ex) { }

					
					
					
					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					
					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					
					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					
					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					
					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					
					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					
					
					
					}

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("202007011657090783567-" + rowTestID) + " ");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString(" PL_INDEX = '");

					
					
					
					
					
					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					
					
					
					
					
					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_27(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_15(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_16(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_17(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_28(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_29(); 

					
					
					
					
					
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

					
					
					
					
					
					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"6\" class=\"dataLabelRead gridCell\" >");

					
					
					
					
					
					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",""); 

					
					
					
					
					
					
									 ClipboardPage tempNoRespg = tools.createPage("Assign-WorkBasket", "tempNoRespg");

					
					
					
					
					
					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
					
					
					
					
					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					
					
					
					
					
					if(tools.getParamValue("showOnLoadMsg").equals("showOnLoadMsg")) {

					
					
					
					
					
					gridNoRowsMesgIncl_1(); 

					
					
					
					
					
					}else{

					
					
					
					
					
					gridNoRowsMesgIncl_2(); 

					
					
					
					
					
					}

					
					
					
					
					
					
									  pega.popStackFrame(frame, false);  

					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
					
					
					
					
					
								 tools.putParamValue("showOnLoadMsg", ""); 

					
					
					
					
					
					
 tempNoRespg.removeFromClipboard();

					
					
					
					
					
					tools.appendString("\n </td></tr>");

					
					
					
					
					
					 } } }   

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					
					
					
					
					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					
					
					
					 tools.putSaveValue("bUseMenuInline", "false");

					
					
					
					
					
					 if( tools.getParamValue("partialTrigger").equals("getChildNodesD_WorkBasket.pxResults1") && tools.getParamValue("partialRefresh").equals("false")) {

					
					
					
					
					
						 tools.putParamValue("partialTrigger",""); 
}

					
					
					
					
					
					
					 /* GenerateGrid: End */

					
					
					
					
					
					}

					
					
					
					
					
					public void LayoutWrapperTableEnd_2() {

					
					
					
					
					
					tools.appendString("</div>");

					
					
					
					
					
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

					
					
					
					
					
					String paramName = "EXPANDEDSubSectionHomeWorklistBBBBBB";

					
					
					
					
					
					metadataPage.put("paramName", paramName);

					
					
					
					
					
					String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}");

					
					
					
					
					
					if(!inspectorLayoutData.isEmpty()) {

					
					
					
					
					
					metadataPage.put("liveUI", inspectorLayoutData);

					
					
					
					
					
					}

					
					
					
					
					
					String pyPrefix = null;

					
					
					
					
					
					metadataPage.put("prefix","-default");

					
					
					
					
					
					metadataPage.put("sectionIndex","57");

					
					
					
					
					
					IUIComponent containerComponent = pzAuto.getUIComponent();

					
					
					
					
					
					com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();

					
					
					
					
					
					boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o2&& o2== pxparam.bRenderAsTable cqtrue o2== rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq", pxUniqueStreamHash+"_134");metadataPage.put("dlChild","true");

					
					
					
					
					
					metadataPage.put("lMode","Inline-block");

					
					
					
					
					
					IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();

					
					
					
					
					
					pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_134");

					
					
					
					
					
					metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);

					
					
					
					
					
					containerComponent.beginComponent("pxLayoutContainer",metadataPage);

					
					
					
					
					
					if(pyVisibility) {

					
					
					
					
					
					pzLayoutBody_5();

					
					
					
					
					
					}

					
					
					
					
					
					containerComponent.endComponent();

					
					
					
					
					
					runtimeContextTree.endVisibleWhen();

					
					
					
					
					
					}
public void pzLayout_8() {
String gridLayoutMethodName="pzLayout_8";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o2&& o2== pxparam.bRenderAsTable cqtrue o2== rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq","param.bRenderAsTable = \'true\' && D_PortalContext.pyIsBasket==\'true\' && D_PortalContext.pyLabel!=\'\'", "layout", "visible" )) {pzSetExpandParam_9();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_2(); 
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()){ 
gridTemplateInit_2();
return;}pzLayoutBodyWrapper_11();
 LayoutWrapperTableEnd_2(); }
}
}
tools.putParamValue("gridLayoutMethodName","");
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_5();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_4() {
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()){ 
gridTemplateInit_1();
return;}tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_3();gridCentreLayout_1();
  

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
  

				gridEndLayout_1();
}
public void pzLayoutBodyWrapper_10() {
tools.appendString("<div class='layout layout-noheader layout-noheader-default'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_3();gridCentreLayout_1();
  

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
  

				gridEndLayout_1();
}
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void gridNoRowsMesgIncl_2() {
pzAuto.emitIncludeStreamReference("pyNextGenGridFilterNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("HomeWorklistNoResults", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}
public String 
getUIActionsMetaData_4() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openAssignment");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openAssignment\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");		tools.appendString("\",\"");

		tools.appendFormatted("f69e0992-331f-482e-a30d-05d75bc7ee80",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsOfflineEnabled")+"~#");		tools.appendString("\",{\"target\":\"primary\",\"pyReloadAlways\":\"false\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsOfflineEnabled"), -1);
		}}catch(Exception e){}		String returnString = actionsStringBuilder.toString();
		tools.popStreamBody();
		return returnString;
	}


public void pxButton_6() {boolean isDisplayTextWithParam = false;
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
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("202007011657090787668") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","HomeWorklist_$CTX$_48");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","Strong");
	modePage2.put("imgSrc","none");
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Go\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Go", ".pyButtonLabel");
	}
	pyLabel = "Go";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash107 = getUIActionsMetaData_4();
	if(spxUniqueStreamHash107 != null && !"".equals(spxUniqueStreamHash107)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash107,pxUniqueStreamHash+"_107");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_107");
	}
	modePage2.put("actionPath"," data-click='.'");
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_button.js");
	ctrlComponent.beginComponent("pxButton",metadataPage);
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
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_48'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("202007011657090787668") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openAssignment");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openAssignment\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");		tools.appendString("\",\"");

		tools.appendFormatted("22e1ab8b-e2d8-45ac-95a9-7d2ae229ef0c",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsOfflineEnabled")+"~#");		tools.appendString("\",{\"target\":\"primary\",\"pyReloadAlways\":\"false\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsOfflineEnabled"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='Strong pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Go".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Go",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");	}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_26() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(9)")); tools.appendString("headers='a9'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");if(pzAuto.handleEvaluateWhen(" axpzCanPerformAssignment","pzCanPerformAssignment", "cell", "visible" )) {pxButton_6(); } 
									tools.appendString("</DIV>"); } else { if(pzAuto.handleEvaluateWhen(" axpzCanPerformAssignment","pzCanPerformAssignment", "cell", "visible" )) {pxButton_6(); } }
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","true","128","","","Text","true","47"};oCellRuntimeParamsMap.put("47||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("47||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(8)");}


public void pxDisplayText_26(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_103")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_104")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");
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
	String repeatIndx = "";
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("202007011657090786888",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxGoalTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxGoalTime", ".pyCaption");
	pyValueR = ".pxGoalTime";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxGoalTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxGoalTime", ".pyCaption");
	pyValueOrig = ".pxGoalTime";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","localizevalue");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","datetime");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyDateTimeFormat","DateTime-Frame");
	modePage2.put("pyDateTimeSecondCutoff","0");
	ClipboardProperty currProp = tools.getActive();
	String propTypeName = currProp.getTypeName();
	modePage2.put("pyPropertyType",propTypeName);
	String[] fieldValuesArray ={};
	fieldValuesArray = new String[]{"yearsmonths ago","yearsmonth ago","yearmonths ago","yearmonth ago","yearsmonths from now","yearsmonth from now","yearmonths from now","yearmonth from now","monthsdays ago","monthsday ago","monthdays ago","monthday ago","monthsdays from now","monthsday from now","monthdays from now","monthday from now","dayshours ago","dayshour ago","dayhours ago","dayhour ago","dayshours from now","dayshour from now","dayhours from now","dayhour from now","hoursminutes ago","hoursminute ago","hourminutes ago","hourminute ago","hoursminutes from now","hoursminute from now","hourminutes from now","hourminute from now","about a minute","about a minute ago","about a minute from now","less than a minute","less than a minute ago","less than a minute from now","years ago","years from now","year ago","year from now","months ago","months from now","month ago","month from now","days ago","days from now","day ago","day from now","hours ago","hours from now","hour ago","hour from now","minutes ago","minutes from now","today","It is"};
	for(int i=0;i<fieldValuesArray.length;i++){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(fieldValuesArray[i], "pyFormatter");
	}
	String spxUniqueStreamHash105 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash105 != null && !"".equals(spxUniqueStreamHash105)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash105,pxUniqueStreamHash+"_105");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_105");
	}
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.addAdditionalScripts("pzDecimalInclude","pzpega_ui_decimal.js");
	ctrlComponent.beginComponent("pxDisplayText",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
} else {
inclFormattedVal_4(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);
}

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
}
tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void repeatingDataCell_25() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxGoalTime", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(7)")); tools.appendString("headers='a7'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_26(".pxGoalTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_26(".pxGoalTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","255","","","Text","true","45"};oCellRuntimeParamsMap.put("45||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("45||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)");}


public void pxDisplayText_25(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_100")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&date","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_101")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");
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
	String repeatIndx = "";
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("202007011657090786888",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxDeadlineTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxDeadlineTime", ".pyCaption");
	pyValueR = ".pxDeadlineTime";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxDeadlineTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxDeadlineTime", ".pyCaption");
	pyValueOrig = ".pxDeadlineTime";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","localizevalue");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","date");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyDateFormat","DateTime-Frame");
	modePage2.put("pyDateTimeSecondCutoff","0");
	ClipboardProperty currProp = tools.getActive();
	String propTypeName = currProp.getTypeName();
	modePage2.put("pyPropertyType",propTypeName);
	String[] fieldValuesArray ={};
	fieldValuesArray = new String[]{"yearsmonths ago","yearsmonth ago","yearmonths ago","yearmonth ago","yearsmonths from now","yearsmonth from now","yearmonths from now","yearmonth from now","monthsdays ago","monthsday ago","monthdays ago","monthday ago","monthsdays from now","monthsday from now","monthdays from now","monthday from now","dayshours ago","dayshour ago","dayhours ago","dayhour ago","dayshours from now","dayshour from now","dayhours from now","dayhour from now","hoursminutes ago","hoursminute ago","hourminutes ago","hourminute ago","hoursminutes from now","hoursminute from now","hourminutes from now","hourminute from now","about a minute","about a minute ago","about a minute from now","less than a minute","less than a minute ago","less than a minute from now","years ago","years from now","year ago","year from now","months ago","months from now","month ago","month from now","days ago","days from now","day ago","day from now","hours ago","hours from now","hour ago","hour from now","minutes ago","minutes from now","today","It is"};
	for(int i=0;i<fieldValuesArray.length;i++){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(fieldValuesArray[i], "pyFormatter");
	}
	String spxUniqueStreamHash102 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash102 != null && !"".equals(spxUniqueStreamHash102)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash102,pxUniqueStreamHash+"_102");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_102");
	}
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.addAdditionalScripts("pzDecimalInclude","pzpega_ui_decimal.js");
	ctrlComponent.beginComponent("pxDisplayText",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
} else {
inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);
}

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
}
tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void repeatingDataCell_24() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxDeadlineTime", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)")); tools.appendString("headers='a5'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_25(".pxDeadlineTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_25(".pxDeadlineTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","43"};oCellRuntimeParamsMap.put("43||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("43||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","R","true","0","","","Decimal","true","42"};oCellRuntimeParamsMap.put("42||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("42||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","41"};oCellRuntimeParamsMap.put("41||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("41||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}


public void pxLink_8() {boolean isDisplayTextWithParam = false;
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20190208082033073432148",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","HomeWorklist_$CTX$_40");
		String repeatIndx = "";
	modePage2.put("styles","Simple");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxRefObjectInsName");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxRefObjectInsName", ".pyButtonLabel");
	pyLabel = ".pxRefObjectInsName";
	modePage2.put("pyLabel",pyLabel);
	modePage2.put("captionType","propertyReference");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	modePage2.put("pyFormatTypeActionable","none");
	String pyFormatValue = "";
	modePage2.put("pyFormatValue",pyFormatValue);
	String spxUniqueStreamHash99 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash99 != null && !"".equals(spxUniqueStreamHash99)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash99,pxUniqueStreamHash+"_99");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_99");
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
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_40'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pxRefObjectInsName"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pxRefObjectInsName").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20190208082033073432148") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openWorkByHandle");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");
String className = "";className ="Assign-Worklist";if("".equals(className) || className==null){className ="";}if((("".equals(className) || className==null) || (!pega_rules_string.isLiteral(className))) && (tools != null && tools.getStepPage() != null)){className = tools.getStepPage().getString("pxObjClass");}if("".equals(className) || className==null){className = "@baseclass";}ArrayList skeletonList = (ArrayList)tools.getParameterPage().getObject("skeletonList");if(skeletonList != null && !(skeletonList.contains("pyOpenWorkSkeleton~$~"+className+"~$~false~$~"))){skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);} else if(skeletonList == null){skeletonList = new ArrayList();skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);}
		tools.appendFormatted("pega.SKELETON",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~pyOpenWorkSkeleton",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~"+className, StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~false",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxRefObjectKey")+"~#");		tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"false\",\"false\",{\"target\":\"primary\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxRefObjectKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='Simple");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pxRefObjectInsName").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");	}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Task in");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_23() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='primary'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pxRefObjectInsName", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:38px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_8();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_8();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingHeaderCell_9() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyTemplateInputBox";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("202007011707310166537") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(9)")); tools.appendString(" id='a9' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		
		tools.appendString(" bSortable = 'false'");
		
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache9").equals("")) { tools.appendParamCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache9");} else { tools.appendString("auto;"); }tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzUserWorkListByUserIdPpxResults1colWidthCache9' id='D_pzUserWorkListByUserIdPpxResults1colWidthCache9' value='" + tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache9") + "' />");
				if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_8() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-Worklist";
	dataColumnProp = "pxTaskLabel";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxTaskLabel";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Task' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("202007011657090784250") + " ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(8)")); tools.appendString(" id='a8' class='");
		tools.appendString(pzSection.getCustomStyle(false,"","standard_dataLabelRead ","standard_dataLabelWrite "));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxTaskLabel' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache8").equals("")) { tools.appendParamCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache8");} else { tools.appendString("19.54022988505747"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc539358197'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzUserWorkListByUserIdPpxResults1colWidthCache8' id='D_pzUserWorkListByUserIdPpxResults1colWidthCache8' value='" + tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache8") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Task", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc539358197' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc539358197' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc539358197' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxTaskLabel")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc539358197' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzUserWorkListByUserId_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxTaskLabel8").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxTaskLabel8").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxTaskLabel8").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle539358197\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxTaskLabel8").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxTaskLabel8").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxTaskLabel8").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle539358197\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxTaskLabel8").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxTaskLabel8").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxTaskLabel8").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxTaskLabel8").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxTaskLabel8").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxTaskLabel8").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxTaskLabel8").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxTaskLabel8").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxTaskLabel8").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_7() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-Worklist";
	dataColumnProp = "pxGoalTime";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxGoalTime";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Goal time' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("202007011657090784250") + " ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(7)")); tools.appendString(" id='a7' class='");
		tools.appendString(pzSection.getCustomStyle(false,"","standard_dataLabelRead ","standard_dataLabelWrite "));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxGoalTime' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache7").equals("")) { tools.appendParamCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache7");} else { tools.appendString("19.310344827586206"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1068777324'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzUserWorkListByUserIdPpxResults1colWidthCache7' id='D_pzUserWorkListByUserIdPpxResults1colWidthCache7' value='" + tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache7") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Goal time", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1068777324' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1068777324' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1068777324' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxGoalTime")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1068777324' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzUserWorkListByUserId_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxGoalTime7").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxGoalTime7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxGoalTime7").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1068777324\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxGoalTime7").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxGoalTime7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxGoalTime7").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=search></span><span id=\"filterTitle1068777324\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxGoalTime7").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxGoalTime7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxGoalTime7").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=search></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxGoalTime7").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxGoalTime7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxGoalTime7").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=search></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxGoalTime7").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxGoalTime7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxGoalTime7").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=search></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_6() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-Worklist";
	dataColumnProp = "pyInstructions";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyInstructions";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Instructions' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("202007011657090784250") + " ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(6)")); tools.appendString(" id='a6' class='");
		tools.appendString(pzSection.getCustomStyle(false,"","standard_dataLabelRead ","standard_dataLabelWrite "));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyInstructions' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache6").equals("")) { tools.appendParamCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache6");} else { tools.appendString("21.839080459770116"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc437897889'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzUserWorkListByUserIdPpxResults1colWidthCache6' id='D_pzUserWorkListByUserIdPpxResults1colWidthCache6' value='" + tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache6") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Instructions", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc437897889' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc437897889' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc437897889' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyInstructions")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc437897889' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzUserWorkListByUserId_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyInstructions6").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyInstructions6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyInstructions6").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle437897889\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyInstructions6").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyInstructions6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyInstructions6").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle437897889\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyInstructions6").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyInstructions6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyInstructions6").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyInstructions6").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyInstructions6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyInstructions6").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyInstructions6").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyInstructions6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyInstructions6").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_5() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-Worklist";
	dataColumnProp = "pxDeadlineTime";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxDeadlineTime";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Deadline' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("202007011657090784250") + " ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(5)")); tools.appendString(" id='a5' class='");
		tools.appendString(pzSection.getCustomStyle(false,"","standard_dataLabelRead ","standard_dataLabelWrite "));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxDeadlineTime' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache5").equals("")) { tools.appendParamCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache5");} else { tools.appendString("20.0"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1389728293'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzUserWorkListByUserIdPpxResults1colWidthCache5' id='D_pzUserWorkListByUserIdPpxResults1colWidthCache5' value='" + tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache5") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Deadline", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1389728293' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1389728293' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1389728293' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxDeadlineTime")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1389728293' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzUserWorkListByUserId_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxDeadlineTime5").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1389728293\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxDeadlineTime5").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=search></span><span id=\"filterTitle1389728293\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxDeadlineTime5").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=search></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxDeadlineTime5").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=search></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxDeadlineTime5").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxDeadlineTime5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=search></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_4() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-Worklist";
	dataColumnProp = "pyAssignmentStatus";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyAssignmentStatus";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Status' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("202007011657090784250") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Status"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(4)")); tools.appendString(" id='a4' class='");
		tools.appendString(pzSection.getCustomStyle(false,"","standard_dataLabelRead ","standard_dataLabelWrite "));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyAssignmentStatus' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache4").equals("")) { tools.appendParamCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache4");} else { tools.appendString("20.229885057471265"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc2052992370'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzUserWorkListByUserIdPpxResults1colWidthCache4' id='D_pzUserWorkListByUserIdPpxResults1colWidthCache4' value='" + tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache4") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Status", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc2052992370' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc2052992370' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc2052992370' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyAssignmentStatus")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc2052992370' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzUserWorkListByUserId_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyAssignmentStatus4").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle2052992370\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyAssignmentStatus4").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle2052992370\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyAssignmentStatus4").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyAssignmentStatus4").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyAssignmentStatus4").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyAssignmentStatus4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_3() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-Worklist";
	dataColumnProp = "pxUrgencyAssign";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxUrgencyAssign";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Urgency' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("202007011657090784551") + " ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" id='a3' class='");
		tools.appendString(pzSection.getCustomStyle(false,"","standard_dataLabelRead ","standard_dataLabelWrite "));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxUrgencyAssign' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache3").equals("")) { tools.appendParamCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache3");} else { tools.appendString("20.229885057471265"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1763689367'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzUserWorkListByUserIdPpxResults1colWidthCache3' id='D_pzUserWorkListByUserIdPpxResults1colWidthCache3' value='" + tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache3") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Urgency", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1763689367' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1763689367' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1763689367' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxUrgencyAssign")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1763689367' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzUserWorkListByUserId_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxUrgencyAssign3").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1763689367\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxUrgencyAssign3").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1763689367\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxUrgencyAssign3").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxUrgencyAssign3").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxUrgencyAssign3").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUrgencyAssign3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_2() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-Worklist";
	dataColumnProp = "pyLabel";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyLabel";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Description' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20200701165709078334") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Description"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(pzSection.getCustomStyle(false,"","standard_dataLabelRead","standard_dataLabelWrite"));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyLabel' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache2").equals("")) { tools.appendParamCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache2");} else { tools.appendString("46.666666666666664"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc360530372'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzUserWorkListByUserIdPpxResults1colWidthCache2' id='D_pzUserWorkListByUserIdPpxResults1colWidthCache2' value='" + tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache2") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Description", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc360530372' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc360530372' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc360530372' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyLabel")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc360530372' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzUserWorkListByUserId_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle360530372\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle360530372\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_1() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Assign-Worklist";
	dataColumnProp = "pxRefObjectInsName";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxRefObjectInsName";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='ID' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20160721093355058239712") + " ");
try {
tools.appendString(" data-importance='primary'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxRefObjectInsName' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("height:24px;");tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache1").equals("")) { tools.appendParamCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache1");} else { tools.appendString("17.24137931034483"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1350986627'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzUserWorkListByUserIdPpxResults1colWidthCache1' id='D_pzUserWorkListByUserIdPpxResults1colWidthCache1' value='" + tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthCache1") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "ID", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1350986627' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1350986627' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1350986627' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxRefObjectInsName")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1350986627' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzUserWorkListByUserId_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxRefObjectInsName1").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1350986627\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxRefObjectInsName1").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1350986627\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxRefObjectInsName1").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxRefObjectInsName1").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!=null && !gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxRefObjectInsName1").isEmpty() && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzUserWorkListByUserId_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxRefObjectInsName1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}


public void pzGridIncludes_1() {
pzAuto.emitIncludeStreamReference("pzGrid_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
public void gridTemplateSwitchPersonalization_1() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata gridWrapper = pzAuto.getUIComponentRuntime().createMetadata();
gridWrapper.put("pzCTResetSaveMethodName",tools.getParamValue("pzCTResetSaveMethodName"));
tools.findPage(tools.getParamValue("pxGridMetadataPage")).removeFromClipboard(); 
ClipboardPage sectionContext = tools.findPage(tools.getParamValue("sectionContext"),true);
PRStackFrame frame = null; 
if(null != sectionContext){
  frame = pega.pushStackFrame(tools.getParameterPage(), sectionContext, false, false, PRStackFrame.Type.APPEND_STREAM, "discardPersonalize");
}
String pyGridStateUniqueID= "1593637501250";
String pySectionInsName= "DATA-PORTAL!HOMEWORKLIST";
String pyOperatorID= tools.findPage("OperatorID").getString(".pyUserIdentifier");
String harnessClassName = tools.getParamValue("strPHarnessClass");
if(StringUtils.isBlank(harnessClassName)) {
harnessClassName = tools.getParamValue("className");
}
String harnessName = tools.getParamValue("innerHarnessName");
if(StringUtils.isBlank(harnessName)) {
harnessName = tools.getParamValue("strPHarnessPurpose");
if(StringUtils.isBlank(harnessName)) {
harnessName = tools.getParamValue("Purpose");
}
}
String pyHarnessInsName= harnessClassName+"!"+harnessName;
metadataPage.put("pyGridStateUniqueID",pyGridStateUniqueID);
metadataPage.put("pySectionInsName",pySectionInsName);
metadataPage.put("pyOperatorID",pyOperatorID);
metadataPage.put("pyHarnessInsName",pyHarnessInsName);
String propType = "Data Object";
String DSNameViaAjax = tools.getParamValue("DSName");
if(org.apache.commons.lang3.StringUtils.isNotBlank(DSNameViaAjax) && "Property".equals(propType) ){
gridWrapper.putString("DPName",DSNameViaAjax);
}
gridTemplateMain_1(metadataPage,gridWrapper);
if(null != frame){
  pega.popStackFrame(frame, false);
}
}
public void gridTemplatePartial_1() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata gridWrapper = pzAuto.getUIComponentRuntime().createMetadata();
ClipboardProperty dataCells = null;
boolean isPartial = true;
boolean isQueryable = false;
Map configMap = new HashMap(); 
String gridAction = tools.getParamValue("listAction"); 
String DSName = tools.getParamValue("DSName"); 
String uniqueId = tools.getParamValue("instanceId"); 
String resultsClass = tools.getParamValue("pyResultsClass"); 
ClipboardPage gridMetadataPage = tools.findPage(tools.getParamValue("pxGridMetadataPage"), true); 
if(null != gridMetadataPage){ 
isQueryable = gridMetadataPage.getBoolean("isQueryable"); 
configMap.put("pxGridMetadataPage", gridMetadataPage); 
} 
configMap.put("instanceId", uniqueId); 
configMap.put("pyContext", DSName); 
configMap.put("listAction", gridAction); 
int startIndex = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"startIndex"); 
int endIndex = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"endIndex"); 
int pxPageSize = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"pxPageSize"); 
int pxPageIndex = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"pxPageIndex"); 
configMap.put("pxPageSize", pxPageSize); 
configMap.put("pxPageIndex", pxPageIndex); 
if(isQueryable){
gridMetadataPage.putString("pxPageSize", String.valueOf(pxPageSize)); 
gridMetadataPage.putString("pxPageIndex", String.valueOf(pxPageIndex)); 
pega.getUIEngine().getGridUtilities().setImplicitParameter(true, gridMetadataPage);
boolean bIsTableGrouped = gridMetadataPage.getBoolean("pyIsTableCategorized");
if(bIsTableGrouped) {
configMap.put("isQueryable", "false"); 
}else{
configMap.put("isQueryable", Boolean.toString(isQueryable)); 
}
}
List<Integer> indices = pega.getUIEngine().getGridUtilities().getIndicesToBeChangeTracked();
if(indices != null){
configMap.put("indices", indices); 
}
if(startIndex > 0 && endIndex >= startIndex){ 
Map pyPagination = new HashMap(); 
pyPagination.put("pyStartIndex", ""+startIndex); 
pyPagination.put("pyEndIndex", ""+endIndex); 
configMap.put("pyPagination", pyPagination); 
} 
gridWrapper.put("resultsClass",resultsClass); 
metadataPage.put("uniqueId",uniqueId); 
metadataPage.putMetadata("gridWrapper",gridWrapper);
gridTemplateBody_1(dataCells, metadataPage, configMap, isPartial, "pxGrid1" ); 
}
public void generateGridSections_1(IUIComponentMetadata metadataPage, ClipboardPage gridMetadataPage) {
IUIComponentMetadata gridSectionsInfo = pzAuto.getUIComponentRuntime().createMetadata();
Map<String, Object> sectionParams = new HashMap<>();
String pageId = pxUniqueStreamHash+"_92";
String pageListClassName = metadataPage.getNestedProperty("gridWrapper.resultsClass"); 
ClipboardPage gridResultsPage = tools.createPage(pageListClassName, "gridResultsPage"+pageId);
PRStackFrame gridResultsPageFrame = pega.pushStackFrame(gridResultsPage.getName(), null, gridResultsPage, false, false); 
sectionParams.put("doNotAddToMetadataTree", true); 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_93","HomeWorklistNoResults", pageListClassName, gridResultsPage.getName(), true, sectionParams);
gridSectionsInfo.put("pxGridNoDataMsgId",pxUniqueStreamHash+"_93");
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_94","pyNextGenGridFilterNoResultsMessage", pageListClassName, gridResultsPage.getName(), true, sectionParams);
gridSectionsInfo.put("pxGridNoFilterDataMsgId",pxUniqueStreamHash+"_94");
gridSectionsInfo.put("pyNoMsgSectionContext",gridResultsPage.getName());
sectionParams.clear(); 
pega.popStackFrame(gridResultsPageFrame, false);
gridResultsPage.removeFromClipboard(); 
ClipboardPage filterPage = tools.createPage("Pega-UI-Component-Grid-Filter", "filterPage");
sectionParams.put("usingPage", filterPage.getName()); 
sectionParams.put("doNotAddToMetadataTree", true); 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_95","pyFilterIcon", sectionParams);
gridSectionsInfo.put("pxGridFilterIconId",pxUniqueStreamHash+"_95");
sectionParams.clear(); 
filterPage.removeFromClipboard(); 
gridMetadataPage.putString("pyIsRowHeightEnabled", "true");
gridMetadataPage.putString("pyIsColumnTogglerEnabled", "true");
gridMetadataPage.putString("pyIsRefreshListEnabled", "true");
boolean isQueryable = gridMetadataPage.getBoolean("isQueryable");
if(isQueryable){
gridMetadataPage.putString("pyIsSearchEnabled", "true");
}else{
gridMetadataPage.putString("pyIsSearchEnabled", "false");
}
gridMetadataPage.putString("pyIsPersonalized", metadataPage.getString("pyIsPersonalized"));
gridMetadataPage.putString("pyIsPersonalizationEnabled", "true");
gridMetadataPage.putString("pyImplicitSave", "true");
gridMetadataPage.putString("pyPersonalizedName", metadataPage.getString("pyPersonalizedName"));
int count  = 0;
ClipboardProperty pyColumns = gridMetadataPage.getProperty("pyColumns");
Iterator<ClipboardProperty> itr = pyColumns.iterator();
while (itr.hasNext()) {
ClipboardProperty columnDetails = itr.next();
String strCategorized = columnDetails.getProperty("pyIsCategorized").getStringValue();
if ("true".equalsIgnoreCase(strCategorized)) {
	++count;
}
}
gridMetadataPage.putString("pyNoOfColumnsCategorized", Integer.toString(count));
sectionParams.put("usingPage", gridMetadataPage.getName()); 
sectionParams.put("doNotAddToMetadataTree", true); 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_96","pyTableToolbar", sectionParams);
gridSectionsInfo.put("pxGridToolbarId",pxUniqueStreamHash+"_96");
gridSectionsInfo.put("pxGridToolbarPage",gridMetadataPage.getName());
sectionParams.clear(); 
sectionParams.put("doNotAddToMetadataTree", true); 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_97","pyWorkListWidgetHeader", sectionParams);
gridSectionsInfo.put("pxGridOtherActionId",pxUniqueStreamHash+"_97");
sectionParams.clear(); 
metadataPage.put("isToolBar",true);
if(gridSectionsInfo.getObject().entrySet().size() > 0){
metadataPage.putMetadata("gridSectionsInfo",gridSectionsInfo);
}
}
public String 
getUIActionsMetaData_3() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openAssignment");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openAssignment\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");		tools.appendString("\",\"");

		tools.appendFormatted("4ceedd61-e65d-43c1-b26c-4a1047d9c0ed",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsOfflineEnabled")+"~#");		tools.appendString("\",{\"target\":\"primary\",\"pyReloadAlways\":\"false\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsOfflineEnabled"), -1);
		}}catch(Exception e){}		String returnString = actionsStringBuilder.toString();
		tools.popStreamBody();
		return returnString;
	}
public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openWorkByHandle");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");
String className = "";className ="Assign-Worklist";if("".equals(className) || className==null){className ="";}if((("".equals(className) || className==null) || (!pega_rules_string.isLiteral(className))) && (tools != null && tools.getStepPage() != null)){className = tools.getStepPage().getString("pxObjClass");}if("".equals(className) || className==null){className = "@baseclass";}ArrayList skeletonList = (ArrayList)tools.getParameterPage().getObject("skeletonList");if(skeletonList != null && !(skeletonList.contains("pyOpenWorkSkeleton~$~"+className+"~$~false~$~"))){skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);} else if(skeletonList == null){skeletonList = new ArrayList();skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);}
		tools.appendFormatted("pega.SKELETON",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~pyOpenWorkSkeleton",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~"+className, StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~false",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxRefObjectKey")+"~#");		tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"false\",\"false\",{\"target\":\"primary\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxRefObjectKey"), -1);
		}}catch(Exception e){}		String returnString = actionsStringBuilder.toString();
		tools.popStreamBody();
		return returnString;
	}


public void pxLink_7() {boolean isDisplayTextWithParam = false;
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20190208082033073432148",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","HomeWorklist_$CTX$_40");
		String repeatIndx = "";
	modePage2.put("styles","Simple");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxRefObjectInsName");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxRefObjectInsName", ".pyButtonLabel");
	pyLabel = ".pxRefObjectInsName";
	modePage2.put("pyLabel",pyLabel);
	modePage2.put("captionType","propertyReference");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	modePage2.put("pyFormatTypeActionable","none");
	String pyFormatValue = "";
	modePage2.put("pyFormatValue",pyFormatValue);
	String spxUniqueStreamHash82 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash82 != null && !"".equals(spxUniqueStreamHash82)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash82,pxUniqueStreamHash+"_82");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_82");
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
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_40'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pxRefObjectInsName"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pxRefObjectInsName").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20190208082033073432148") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openWorkByHandle");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");
String className = "";className ="Assign-Worklist";if("".equals(className) || className==null){className ="";}if((("".equals(className) || className==null) || (!pega_rules_string.isLiteral(className))) && (tools != null && tools.getStepPage() != null)){className = tools.getStepPage().getString("pxObjClass");}if("".equals(className) || className==null){className = "@baseclass";}ArrayList skeletonList = (ArrayList)tools.getParameterPage().getObject("skeletonList");if(skeletonList != null && !(skeletonList.contains("pyOpenWorkSkeleton~$~"+className+"~$~false~$~"))){skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);} else if(skeletonList == null){skeletonList = new ArrayList();skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);}
		tools.appendFormatted("pega.SKELETON",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~pyOpenWorkSkeleton",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~"+className, StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~false",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxRefObjectKey")+"~#");		tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"false\",\"false\",{\"target\":\"primary\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxRefObjectKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='Simple");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pxRefObjectInsName").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");	}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Task in");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}



public void pxDisplayText_18() {	String key="41||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
	String pzFromGrid = tools.getParamValue("pzFromGrid");
	tools.putParamValue("pzFromGrid","false");
	AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
	((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
	tools.putParamValue("pzFromGrid",pzFromGrid);
	}
	static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","false","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","41"};oCellRuntimeParamsMap.put("41||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("41||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}


public void pxDisplayText_19() {	String key="42||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
	String pzFromGrid = tools.getParamValue("pzFromGrid");
	tools.putParamValue("pzFromGrid","false");
	AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
	((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
	tools.putParamValue("pzFromGrid",pzFromGrid);
	}
	static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","false","FREEFORM","REPEATING","",""," cffalse","R","true","0","","","Decimal","true","42"};oCellRuntimeParamsMap.put("42||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("42||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)");}


public void pxDisplayText_20() {	String key="43||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
	String pzFromGrid = tools.getParamValue("pzFromGrid");
	tools.putParamValue("pzFromGrid","false");
	AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
	((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
	tools.putParamValue("pzFromGrid",pzFromGrid);
	}
	static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","false","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","43"};oCellRuntimeParamsMap.put("43||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("43||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}


public void pxDisplayText_21(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {	boolean isDisplayTextWithParam = false;
	String displayTextParamName = "";
	String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
	try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_83")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&date","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_84")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");
	 }	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
		IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
		java.util.List<String> ctPropRefs = new ArrayList<String>();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		tools.putParamValue("skipHTMLEncoding", "true");
		String repeatIndx = "";
		cellPage.put("automationId",pzCell.getTestIdIfEnabled("202007011657090786888",true));
		String pyValueR = "";
		String pyValueOrig = "";
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxDeadlineTime");
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxDeadlineTime", ".pyCaption");
		pyValueR = ".pxDeadlineTime";
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxDeadlineTime");
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxDeadlineTime", ".pyCaption");
		pyValueOrig = ".pxDeadlineTime";
		cellPage.put("pyValue",pyValueOrig);
		cellPage.put("pyValueRO",pyValueR);
		modePage2.put("pyContent","localizevalue");
		modePage2.put("styleOther","");
		modePage2.put("pyFormatType","date");
		modePage2.put("pyReadonlyValidation",false);
		modePage2.put("pyDateFormat","DateTime-Frame");
		modePage2.put("pyDateTimeSecondCutoff","0");
		ClipboardProperty currProp = tools.getActive();
		String propTypeName = currProp.getTypeName();
		modePage2.put("pyPropertyType",propTypeName);
		String[] fieldValuesArray ={};
		fieldValuesArray = new String[]{"yearsmonths ago","yearsmonth ago","yearmonths ago","yearmonth ago","yearsmonths from now","yearsmonth from now","yearmonths from now","yearmonth from now","monthsdays ago","monthsday ago","monthdays ago","monthday ago","monthsdays from now","monthsday from now","monthdays from now","monthday from now","dayshours ago","dayshour ago","dayhours ago","dayhour ago","dayshours from now","dayshour from now","dayhours from now","dayhour from now","hoursminutes ago","hoursminute ago","hourminutes ago","hourminute ago","hoursminutes from now","hoursminute from now","hourminutes from now","hourminute from now","about a minute","about a minute ago","about a minute from now","less than a minute","less than a minute ago","less than a minute from now","years ago","years from now","year ago","year from now","months ago","months from now","month ago","month from now","days ago","days from now","day ago","day from now","hours ago","hours from now","hour ago","hour from now","minutes ago","minutes from now","today","It is"};
		for(int i=0;i<fieldValuesArray.length;i++){
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(fieldValuesArray[i], "pyFormatter");
		}
		String spxUniqueStreamHash85 = getUIActionsMetaData_1();
		if(spxUniqueStreamHash85 != null && !"".equals(spxUniqueStreamHash85)){
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash85,pxUniqueStreamHash+"_85");
		modePage2.put("pyActionStringID",pxUniqueStreamHash+"_85");
		}
		tools.putParamValue("skipHTMLEncoding", "false");
		cellPage.addMetadataInArray("pyModes",modePage1);
		cellPage.addMetadataInArray("pyModes",modePage2);
		metadataPage.putMetadata("pyCell",cellPage);
		ctrlComponent.addDependentScripts("pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
		ctrlComponent.addAdditionalScripts("pzDecimalInclude","pzpega_ui_decimal.js");
		ctrlComponent.beginComponent("pxDisplayText",metadataPage);
		ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	} else {
inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);
	}

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }	if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
	}
	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
	tools.putActive(propActivePrev); 	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}



public void pxDisplayText_22() {	String key="45||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
	String pzFromGrid = tools.getParamValue("pzFromGrid");
	tools.putParamValue("pzFromGrid","false");
	AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
	((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
	tools.putParamValue("pzFromGrid",pzFromGrid);
	}
	static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","false","FREEFORM","REPEATING","",""," cffalse","T","false","255","","","Text","true","45"};oCellRuntimeParamsMap.put("45||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("45||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)");}


public void pxDisplayText_23(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {	boolean isDisplayTextWithParam = false;
	String displayTextParamName = "";
	String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
	try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_86")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_87")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");
	 }	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
		IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
		java.util.List<String> ctPropRefs = new ArrayList<String>();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		tools.putParamValue("skipHTMLEncoding", "true");
		String repeatIndx = "";
		cellPage.put("automationId",pzCell.getTestIdIfEnabled("202007011657090786888",true));
		String pyValueR = "";
		String pyValueOrig = "";
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxGoalTime");
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxGoalTime", ".pyCaption");
		pyValueR = ".pxGoalTime";
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxGoalTime");
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxGoalTime", ".pyCaption");
		pyValueOrig = ".pxGoalTime";
		cellPage.put("pyValue",pyValueOrig);
		cellPage.put("pyValueRO",pyValueR);
		modePage2.put("pyContent","localizevalue");
		modePage2.put("styleOther","");
		modePage2.put("pyFormatType","datetime");
		modePage2.put("pyReadonlyValidation",false);
		modePage2.put("pyDateTimeFormat","DateTime-Frame");
		modePage2.put("pyDateTimeSecondCutoff","0");
		ClipboardProperty currProp = tools.getActive();
		String propTypeName = currProp.getTypeName();
		modePage2.put("pyPropertyType",propTypeName);
		String[] fieldValuesArray ={};
		fieldValuesArray = new String[]{"yearsmonths ago","yearsmonth ago","yearmonths ago","yearmonth ago","yearsmonths from now","yearsmonth from now","yearmonths from now","yearmonth from now","monthsdays ago","monthsday ago","monthdays ago","monthday ago","monthsdays from now","monthsday from now","monthdays from now","monthday from now","dayshours ago","dayshour ago","dayhours ago","dayhour ago","dayshours from now","dayshour from now","dayhours from now","dayhour from now","hoursminutes ago","hoursminute ago","hourminutes ago","hourminute ago","hoursminutes from now","hoursminute from now","hourminutes from now","hourminute from now","about a minute","about a minute ago","about a minute from now","less than a minute","less than a minute ago","less than a minute from now","years ago","years from now","year ago","year from now","months ago","months from now","month ago","month from now","days ago","days from now","day ago","day from now","hours ago","hours from now","hour ago","hour from now","minutes ago","minutes from now","today","It is"};
		for(int i=0;i<fieldValuesArray.length;i++){
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(fieldValuesArray[i], "pyFormatter");
		}
		String spxUniqueStreamHash88 = getUIActionsMetaData_1();
		if(spxUniqueStreamHash88 != null && !"".equals(spxUniqueStreamHash88)){
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash88,pxUniqueStreamHash+"_88");
		modePage2.put("pyActionStringID",pxUniqueStreamHash+"_88");
		}
		tools.putParamValue("skipHTMLEncoding", "false");
		cellPage.addMetadataInArray("pyModes",modePage1);
		cellPage.addMetadataInArray("pyModes",modePage2);
		metadataPage.putMetadata("pyCell",cellPage);
		ctrlComponent.addDependentScripts("pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
		ctrlComponent.addAdditionalScripts("pzDecimalInclude","pzpega_ui_decimal.js");
		ctrlComponent.beginComponent("pxDisplayText",metadataPage);
		ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	} else {
inclFormattedVal_4(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);
	}

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }	if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
	}
	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
	tools.putActive(propActivePrev); 	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}



public void pxDisplayText_24() {	String key="47||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
	String pzFromGrid = tools.getParamValue("pzFromGrid");
	tools.putParamValue("pzFromGrid","false");
	AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
	((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
	tools.putParamValue("pzFromGrid",pzFromGrid);
	}
	static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","false","FREEFORM","REPEATING","",""," cffalse","T","true","128","","","Text","true","47"};oCellRuntimeParamsMap.put("47||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("47||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(8)");}


public void pxButton_5() {	boolean isDisplayTextWithParam = false;
	String displayTextParamName = "";
	String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
	try {


	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span ");tools.appendString(">");
	 }	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
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
		if(expressionId !=null && expressionId.length() > 0){
		modePage2.put("pyExpressionId",expressionId);
		}
		String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
		String navPage="pyNavigation"+uid;
		cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("202007011657090787668") + " ");
		if(false || (pzAuto.isOffline() && false) ){ 
		modePage2.put("nav",navPage);
		}
		modePage2.put("pyName","HomeWorklist_$CTX$_48");
			String repeatIndx = "";
		String pyTooltip = "";
		modePage2.put("tooltip",pyTooltip);
		modePage2.put("helpertype","none");
		modePage2.put("styles","Strong");
		modePage2.put("imgSrc","none");
		modePage2.put("pyActionImagePosition","left");
		String customStyles = null;
		String pyLabel = "";
		if(pega.getPackageRuntime().canPackage()){
			tools.getLocalizedTextForString(".pyButtonLabel","Go\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
		} else {
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Go", ".pyButtonLabel");
		}
		pyLabel = "Go";
		modePage2.put("label",pyLabel);
		String spxUniqueStreamHash90 = getUIActionsMetaData_3();
		if(spxUniqueStreamHash90 != null && !"".equals(spxUniqueStreamHash90)){
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash90,pxUniqueStreamHash+"_90");
		modePage2.put("pyActionStringID",pxUniqueStreamHash+"_90");
		}
		modePage2.put("actionPath"," data-click='.'");
		tools.putParamValue("skipHTMLEncoding", "false");
		cellPage.addMetadataInArray("pyModes",modePage1);
		cellPage.addMetadataInArray("pyModes",modePage2);
		metadataPage.putMetadata("pyCell",cellPage);
		ctrlComponent.addDependentScripts("pzpega_ui_template_button.js");
		ctrlComponent.beginComponent("pxButton",metadataPage);
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
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_48'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("202007011657090787668") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }			{
			com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
			actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
			actionRequest.registerFixedParameter("action", "openAssignment");
			pzAuto.registerActionRequest(actionRequest);
			tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);			tools.appendString("\"]");
			tools.appendString("],[\"openAssignment\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");			tools.appendString("\",\"");

		tools.appendFormatted("e1d428b7-649d-4c94-a640-77d53e8abe74",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsOfflineEnabled")+"~#");			tools.appendString("\",{\"target\":\"primary\",\"pyReloadAlways\":\"false\"}]");
			}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsOfflineEnabled"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='Strong pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Go".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Go",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");		}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }		tools.putParamValue("doAutoFormatting", "false");
		tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}		} catch (Exception e) {

		
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

public void gridTemplateBody_1(ClipboardProperty dataCells, IUIComponentMetadata metadataPage, Map configMap, boolean isPartial, String tempGridName) {
ClipboardPage gridMetadataPage = (ClipboardPage)configMap.get("pxGridMetadataPage"); 
com.pega.pegarules.priv.runtime.IGridUtilities gridUtilities = pega.getUIEngine().getGridUtilities(); 
String pageListClassName = metadataPage.getNestedProperty("gridWrapper.resultsClass"); 
boolean newPageCreated = false; 
ClipboardPage itemPage = null; 
String pageListProperty = (String)configMap.get("pyContext"); 
pageListProperty = pzAuto.getUIComponentRuntime().getResolvedRefernce(pageListProperty); 
ClipboardProperty cpSource = tools.getProperty(pageListProperty); 
if(null != cpSource){ 
Iterator itemPages = cpSource.iterator(); 
if(itemPages.hasNext()) { 
 itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
}
}
if(null == itemPage){
itemPage = tools.createPage(pageListClassName,"");
newPageCreated = true; 
}
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus(); 
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y'); 
if(!isPartial){ 
gridMetadataPage.putString(".pyResultsClass", pageListClassName);
} 
if(org.apache.commons.lang3.StringUtils.isNotBlank((String)configMap.get("pyContext"))){
IUIComponent cc_grid = pzAuto.getUIComponent();
if(!isPartial){ 
cc_grid.addAdditionalBundles("RepeatingGrid", "pzpega_grid_staticbundle");
cc_grid.addAdditionalScripts("RepeatingGrid", "pzpega_ui_template_paginate.js");
cc_grid.addAdditionalBundles("ControlMenu","pzPega_control_menu_scripts");
} 
if(!isPartial && !pzAuto.isForOfflineTemplate()){ 
metadataPage.put("pxFilterConditionId",pxUniqueStreamHash+"_80");
gridMetadataPage.putString("pxFilterConditionId", pxUniqueStreamHash+"_80");
} 
String sectionBodyPath = ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2)";
ClipboardPage gridStatePage = null;
if(!isPartial){ 
metadataPage.put("pyIsPersonalized","false");
gridStatePage = pega.getUIEngine().getGridUtilities().getPersonalizedViewsPage(metadataPage.getString("pyGridStateUniqueID"), null, metadataPage.getString("pySectionInsName"), metadataPage.getString("pyOperatorID"), metadataPage.getString("pyHarnessInsName")); 
if(gridStatePage !=null) {
metadataPage.put("pyIsPersonalized","true");
metadataPage.put(gridUtilities.PY_GRID_MINWIDTH,gridStatePage.getString(gridUtilities.PY_GRID_MINWIDTH));
metadataPage.put(gridUtilities.PY_GRID_ROWHEIGHT,gridStatePage.getString(gridUtilities.PY_GRID_ROWHEIGHT));
metadataPage.put(gridUtilities.PY_PERSONALIZED_NAME,gridStatePage.getString(gridUtilities.PYLABEL));
}
}
cc_grid.beginComponent(tempGridName, metadataPage, configMap);
String oldSectionReadOnly = tools.getParamValue("SectionReadOnly"); 
tools.putParamValue("SectionReadOnly","-1"); 
boolean inputEnabledStatus = tools.hasInputEnabled();
tools.setInput(false);
IUIComponent gridBodyComp = pzAuto.getUIComponent();
gridBodyComp.beginComponent("pxGridBody",pzAuto.getUIComponentRuntime().createMetadata()); 
IUIComponent gridHeaderRowComp = pzAuto.getUIComponent(); 
gridHeaderRowComp.beginComponent("pxGridHeaderRow",pzAuto.getUIComponentRuntime().createMetadata()); 
IUIComponent headerHtmlComp = null; 
IUIComponentMetadata headermetadata_1 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(1);
headermetadata_1 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,1, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_1.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_1.put("data-ui-meta",pzCell.getInspectorDataDynamic("","ID",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_1); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_2 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(2);
headermetadata_2 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,2, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_2.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_2.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Description",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_2); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_3 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(3);
headermetadata_3 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,3, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_3.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_3.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Urgency",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_3); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_4 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(4);
headermetadata_4 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,4, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_4.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_4.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Status",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(4)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_4); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_5 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(5);
headermetadata_5 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,5, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_5.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_5.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Deadline",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(5)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_5); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_6 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(6);
headermetadata_6 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,6, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_6.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_6.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Instructions",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(6)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_6); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_7 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(7);
headermetadata_7 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,7, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_7.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_7.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Goal time",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(7)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_7); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_8 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(8);
headermetadata_8 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,8, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_8.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_8.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Task",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(8)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_8); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_9 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(9);
headermetadata_9 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,9, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_9.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_9.put("data-ui-meta",pzCell.getInspectorDataDynamic("","",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(9)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_9); 
headerHtmlComp.endComponent(); 


 
gridHeaderRowComp.endComponent(); 
PRStackFrame itemFrame = pega.pushStackFrame("GridFirstRowItem", null, itemPage, true, false); 
IUIComponent gridRowComp = pzAuto.getUIComponent(IUIComponent.ComponentType.GRID); 
gridRowComp.beginComponent("pxGridDataRow",pzAuto.getUIComponentRuntime().createMetadata(), configMap); 
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty("pzInsKey");
inclAction_1();
IUIComponent cellHtmlComp = null; 
IUIComponentMetadata cellMetaData_1 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(1);
cellMetaData_1 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,1, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_1.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_1.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxLink",".pxRefObjectInsName",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_1); 
if(itemPage != null){
pxLink_7();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_2 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(2);
cellMetaData_2 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,2, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_2.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_2.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pyLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_2); 
if(itemPage != null){
pxDisplayText_18();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_3 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(3);
cellMetaData_3 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,3, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_3.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_3.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pxUrgencyAssign",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_3); 
if(itemPage != null){
pxDisplayText_19();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_4 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(4);
cellMetaData_4 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,4, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_4.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_4.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pyAssignmentStatus",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_4); 
if(itemPage != null){
pxDisplayText_20();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_5 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(5);
cellMetaData_5 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,5, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_5.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_5.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pxDeadlineTime",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_5); 
if(itemPage != null){
pxDisplayText_21(".pxDeadlineTime",0,"","","Date Time");
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_6 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(6);
cellMetaData_6 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,6, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_6.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_6.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pyInstructions",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_6); 
if(itemPage != null){
pxDisplayText_22();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_7 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(7);
cellMetaData_7 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,7, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_7.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_7.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pxGoalTime",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(7)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_7); 
if(itemPage != null){
pxDisplayText_23(".pxGoalTime",0,"","","Date Time");
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_8 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(8);
cellMetaData_8 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,8, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_8.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_8.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pxTaskLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(8)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_8); 
if(itemPage != null){
pxDisplayText_24();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_9 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(9);
cellMetaData_9 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,9, gridStatePage," axpzCanPerformAssignment");
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_9.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_9.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(9)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_9); 
cellMetaData_9.put("pyVisibilityWhenRule"," axpzCanPerformAssignment");
IUIComponentMetadata pxWhenIdentifiers_cellMetaData_9 = pzAuto.getUIComponentRuntime().createMetadata();
pxWhenIdentifiers_cellMetaData_9.put("pyVisibilityWhenId",pxUniqueStreamHash+"_91");
cellMetaData_9.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers_cellMetaData_9);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" axpzCanPerformAssignment", pxUniqueStreamHash+"_91"); 
if(itemPage != null){
pxButton_5();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
cellHtmlComp.endComponent(); 


 
pega.popStackFrame(itemFrame, false); 
gridRowComp.endComponent(); 
if(!isPartial){ 
generateGridSections_1(metadataPage, gridMetadataPage);
gridMetadataPage.putString(".pyResultsClass", pageListClassName);
} 
gridBodyComp.endComponent(); 
cc_grid.endComponent();
tools.putParamValue("SectionReadOnly",oldSectionReadOnly); 
tools.setInput(inputEnabledStatus);
}else { 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_80","HomeWorklistNoResults","@baseclass","",false,null);
}
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(currentTemplatingStatus); 
if(newPageCreated){
itemPage.removeFromClipboard(); 
}
tools.putParamValue("paramIndexValue",""); 
tools.putParamValue("skipTracking","false"); 
}
public void generateGridCellModes_1(String strGridMetadataPage) {
ClipboardPage gridMetadataPage = tools.findPage(strGridMetadataPage, true);
List<String> modesList = new ArrayList<String>(); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyMediaAutoplay>false</pyMediaAutoplay><pyRunOnClient>false</pyRunOnClient><pyType>I</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyWhenNotMet>hide</pyWhenNotMet><pyFalseLabel>False</pyFalseLabel><pyUIElement>link</pyUIElement><pyTrueLabel>True</pyTrueLabel><pyMediaMuted>true</pyMediaMuted><pyImageSource>none</pyImageSource><pyCannedIcon>pxIcon</pyCannedIcon><pyStyleName>Simple</pyStyleName><pyFormatTypeActionable>none</pyFormatTypeActionable><pyDirection>vertical</pyDirection><pyImageSize>auto</pyImageSize><pyHelperTextType>none</pyHelperTextType><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyModeType>Read-Only</pyModeType><pyHighlightMatch>true</pyHighlightMatch><pyMinSearchChars>2</pyMinSearchChars><pyDisplayFullScreen>true</pyDisplayFullScreen><pySpecifySize>auto</pySpecifySize><pyObfuscated>false</pyObfuscated><pyFormatType>text</pyFormatType><pyLinkButtonCaptionType>propertyReference</pyLinkButtonCaptionType><pyMediaLoop>false</pyMediaLoop><pyMediaPreload>auto</pyMediaPreload><pyDisabledNew>false</pyDisabledNew><pyDisabled>false</pyDisabled><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyIconShow>false</pyIconShow><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pySymbolPosition>left</pySymbolPosition><pyCannedIconNew>pxIcon</pyCannedIconNew><pyTextAlign>Left</pyTextAlign><pyLabel>.pxRefObjectInsName</pyLabel><pyContent>associated</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Control-Mode-Behaviors</pxObjClass><pyUIElement>link</pyUIElement><pyActionLabel>Open Work By Handle</pyActionLabel><pyExpanded>false</pyExpanded><pyAction>openWorkByHandle</pyAction><pyEvent>click</pyEvent><pyActionAPI><pxObjClass>Embed-DesktopAPI-OpenWorkByHandle</pxObjClass><pyActivityClassOrig>Assign-Worklist</pyActivityClassOrig><pyActivityClass>Assign-Worklist</pyActivityClass><pyACName>primary</pyACName><pyReloadAlways>false</pyReloadAlways><pyKey>.pxRefObjectKey</pyKey><pyTargetName>default</pyTargetName><pySkeletonName>pyOpenWorkSkeleton</pySkeletonName><pyIsSecondaryAC>false</pyIsSecondaryAC><pySelectedMobileTransitionType>pega.SKELETON</pySelectedMobileTransitionType><pyMobileTransitionTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>MobileTransition</pxObjClass><duration>0</duration><delay>0</delay><name>None</name><id>pega.mobile.transitions.NONE</id><transition>launchbox.ui.transition.Type.Empty</transition></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>MobileTransition</pxObjClass><duration>500</duration><delay>0</delay><name>Move forward</name><id>pega.mobile.transitions.MOVE_FORWARD</id><transition>launchbox.ui.transition.Type.Cover</transition><direction>launchbox.ui.transition.Direction.Left</direction></rowdata><rowdata REPEATINGINDEX=\"3\"><pxObjClass>MobileTransition</pxObjClass><duration>500</duration><delay>0</delay><name>Move backward</name><id>pega.mobile.transitions.MOVE_BACKWARD</id><transition>launchbox.ui.transition.Type.Reveal</transition><direction>launchbox.ui.transition.Direction.Right</direction></rowdata><rowdata REPEATINGINDEX=\"4\"><pxObjClass>MobileTransition</pxObjClass><duration>500</duration><delay>0</delay><name>Go home</name><id>pega.mobile.transitions.GO_HOME</id><transition>launchbox.ui.transition.Type.Flip</transition><direction>launchbox.ui.transition.Direction.Right</direction></rowdata><rowdata REPEATINGINDEX=\"5\"><pxObjClass>MobileTransition</pxObjClass><duration>0</duration><delay>0</delay><name>Use skeleton</name><id>pega.SKELETON</id><transition>None</transition></rowdata><rowdata REPEATINGINDEX=\"6\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"7\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"8\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"9\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"10\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"11\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"12\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"13\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"14\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"15\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"16\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"17\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"18\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"19\"><pxObjClass>MobileTransition</pxObjClass></rowdata><rowdata REPEATINGINDEX=\"20\"><pxObjClass>MobileTransition</pxObjClass></rowdata></pyMobileTransitionTypes><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pyActionAPI><pyActionConditions REPEATINGTYPE=\"PageList\"/><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata></pyBehaviors><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource><pyChart><pxObjClass>Embed-Control-Mode-Chart</pxObjClass></pyChart></pagedata>"); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyModeType>Read-Only</pyModeType><pyObfuscatedNew>false</pyObfuscatedNew><pyMediaAutoplay>false</pyMediaAutoplay><pyMinSearchChars>2</pyMinSearchChars><pyHighlightMatch>true</pyHighlightMatch><pyRunOnClient>false</pyRunOnClient><pyDisplayFullScreen>true</pyDisplayFullScreen><pySpecifySize>auto</pySpecifySize><pyType>T</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyUIElement>label</pyUIElement><pyObfuscated>false</pyObfuscated><pyTrueLabel>True</pyTrueLabel><pyMediaMuted>true</pyMediaMuted><pyFormatType>text</pyFormatType><pyMediaLoop>false</pyMediaLoop><pyCannedIcon>pxIcon</pyCannedIcon><pyMediaPreload>auto</pyMediaPreload><pyDisabled>false</pyDisabled><pyDirection>vertical</pyDirection><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyIconShow>false</pyIconShow><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyImageSize>auto</pyImageSize><pyHelperTextType>none</pyHelperTextType><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pySymbolPosition>left</pySymbolPosition><pyCannedIconNew>pxIcon</pyCannedIconNew><pyTextAlign>Left</pyTextAlign><pyContent>localizevalue</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"/><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyObfuscatedNew>false</pyObfuscatedNew><pyModeType>Read-Only</pyModeType><pyMediaAutoplay>false</pyMediaAutoplay><pyHighlightMatch>true</pyHighlightMatch><pyMinSearchChars>2</pyMinSearchChars><pyRunOnClient>false</pyRunOnClient><pyDisplayFullScreen>true</pyDisplayFullScreen><pySpecifySize>auto</pySpecifySize><pyType>R</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyUIElement>label</pyUIElement><pyObfuscated>false</pyObfuscated><pyTrueLabel>True</pyTrueLabel><pyMediaMuted>true</pyMediaMuted><pyFormatType>text</pyFormatType><pyMediaLoop>false</pyMediaLoop><pyCannedIcon>pxIcon</pyCannedIcon><pyMediaPreload>auto</pyMediaPreload><pyDisabled>false</pyDisabled><pyDirection>vertical</pyDirection><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyIconShow>false</pyIconShow><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyHelperTextType>none</pyHelperTextType><pyImageSize>auto</pyImageSize><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pySymbolPosition>left</pySymbolPosition><pyCannedIconNew>pxIcon</pyCannedIconNew><pyTextAlign>Left</pyTextAlign><pyContent>localizevalue</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"/><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyObfuscatedNew>false</pyObfuscatedNew><pyModeType>Read-Only</pyModeType><pyMediaAutoplay>false</pyMediaAutoplay><pyMinSearchChars>2</pyMinSearchChars><pyHighlightMatch>true</pyHighlightMatch><pyRunOnClient>false</pyRunOnClient><pySpecifySize>auto</pySpecifySize><pyDisplayFullScreen>true</pyDisplayFullScreen><pyType>T</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyUIElement>label</pyUIElement><pyObfuscated>false</pyObfuscated><pyTrueLabel>True</pyTrueLabel><pyFormatType>text</pyFormatType><pyMediaMuted>true</pyMediaMuted><pyMediaLoop>false</pyMediaLoop><pyCannedIcon>pxIcon</pyCannedIcon><pyMediaPreload>auto</pyMediaPreload><pyDisabled>false</pyDisabled><pyDirection>vertical</pyDirection><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyIconShow>false</pyIconShow><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyImageSize>auto</pyImageSize><pyHelperTextType>none</pyHelperTextType><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pySymbolPosition>left</pySymbolPosition><pyCannedIconNew>pxIcon</pyCannedIconNew><pyTextAlign>Left</pyTextAlign><pyContent>localizevalue</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"/><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
modesList.add(""); 
modesList.add(""); 
modesList.add(""); 
modesList.add(""); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyMediaAutoplay>false</pyMediaAutoplay><pyRunOnClient>false</pyRunOnClient><pyType>T</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyWhenNotMet>hide</pyWhenNotMet><pyUIElement>button</pyUIElement><pyTrueLabel>True</pyTrueLabel><pyMediaMuted>true</pyMediaMuted><pyImageSource>none</pyImageSource><pyCannedIcon>pxIcon</pyCannedIcon><pyStyleName>Strong</pyStyleName><pyDirection>vertical</pyDirection><pyHelperTextType>none</pyHelperTextType><pyImageSize>auto</pyImageSize><pyActionImagePosition>left</pyActionImagePosition><pyIsNewMarkup>true</pyIsNewMarkup><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyModeType>Read-Only</pyModeType><pyMinSearchChars>2</pyMinSearchChars><pyHighlightMatch>true</pyHighlightMatch><pyDisplayFullScreen>true</pyDisplayFullScreen><pySpecifySize>auto</pySpecifySize><pyObfuscated>false</pyObfuscated><pyFormatType>text</pyFormatType><pyLinkButtonCaptionType>text</pyLinkButtonCaptionType><pyMediaLoop>false</pyMediaLoop><pyMediaPreload>auto</pyMediaPreload><pyDisabled>false</pyDisabled><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyIconShow>false</pyIconShow><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pyCannedIconNew>pxIcon</pyCannedIconNew><pySymbolPosition>left</pySymbolPosition><pyTextAlign>Left</pyTextAlign><pyLabel>Go</pyLabel><pxSubscript>2</pxSubscript><pyContent>associated</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Control-Mode-Behaviors</pxObjClass><pyUIElement>button</pyUIElement><pyActionLabel>Open Assignment</pyActionLabel><pyExpanded>false</pyExpanded><pyAction>openAssignment</pyAction><pyEvent>click</pyEvent><pyActionAPI><pxObjClass>Embed-DesktopAPI-OpenAssignment</pxObjClass><pyActivityClassOrig>Assign-Worklist</pyActivityClassOrig><pyInsKey>.pzInsKey</pyInsKey><pyActivityClass>Assign-Worklist</pyActivityClass><pyACName>primary</pyACName><pyReloadAlways>false</pyReloadAlways><pyTargetName>default</pyTargetName><pyIsSecondaryAC>false</pyIsSecondaryAC><pySelectedMobileTransitionType>pega.mobile.transitions.NONE</pySelectedMobileTransitionType><pyMobileTransitionTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>MobileTransition</pxObjClass><duration>0</duration><delay>0</delay><name>None</name><id>pega.mobile.transitions.NONE</id><transition>launchbox.ui.transition.Type.Empty</transition></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>MobileTransition</pxObjClass><duration>500</duration><delay>0</delay><name>Move forward</name><id>pega.mobile.transitions.MOVE_FORWARD</id><transition>launchbox.ui.transition.Type.Cover</transition><direction>launchbox.ui.transition.Direction.Left</direction></rowdata><rowdata REPEATINGINDEX=\"3\"><pxObjClass>MobileTransition</pxObjClass><duration>500</duration><delay>0</delay><name>Move backward</name><id>pega.mobile.transitions.MOVE_BACKWARD</id><transition>launchbox.ui.transition.Type.Reveal</transition><direction>launchbox.ui.transition.Direction.Right</direction></rowdata><rowdata REPEATINGINDEX=\"4\"><pxObjClass>MobileTransition</pxObjClass><duration>500</duration><delay>0</delay><name>Go home</name><id>pega.mobile.transitions.GO_HOME</id><transition>launchbox.ui.transition.Type.Flip</transition><direction>launchbox.ui.transition.Direction.Right</direction></rowdata><rowdata REPEATINGINDEX=\"5\"><pxObjClass>MobileTransition</pxObjClass><duration>0</duration><delay>0</delay><name>Use skeleton</name><id>pega.SKELETON</id><transition>None</transition></rowdata></pyMobileTransitionTypes></pyActionAPI><pyActionConditions REPEATINGTYPE=\"PageList\"/><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata></pyBehaviors><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
ClipboardProperty gridMetaColumns = gridMetadataPage.getProperty("pyColumns"); 
java.util.Iterator it = gridMetaColumns.iterator(); 
ClipboardPage pyModesPage = tools.createPage("@baseclass", "pyModesPage"); 
while(it.hasNext()) { 

ClipboardPage columnProp = ((ClipboardProperty)it.next()).getPageValue(); 
boolean noModes = columnProp.getPage("pyModes").isEmpty(); 
if(noModes) { 
int index = columnProp.getInteger(".pyInitialOrder") - 1; 
String strModesXML = modesList.get(index); 
if(!org.apache.commons.lang.StringUtils.isBlank(strModesXML)){ 
	try { 
		pyModesPage.adoptXMLForm(strModesXML); 
        columnProp.putPage(".pyModes", pyModesPage); 
	} catch (InvalidStreamError e) { 
		oLog.error(e); 
	} 
} 
} 
} 
pyModesPage.removeFromClipboard(); 
}


public void D_pzUserWorkListByUserId_pxResults_2() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doListAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":-1}]");

		tools.appendString(",");
		tools.appendString(",\"up\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doListAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":1}]");

		tools.appendString(",");
		tools.appendString(",\"down\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doListAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
}

public String 
getGridActions_1() {
	boolean directStream = ((PegaStreamAPI)tools).isDirectStreaming();
	if(directStream) {
		((PegaStreamAPI)tools).disableDirectStreaming();
	}
	String currentStream = tools.getCurrentStream();
	D_pzUserWorkListByUserId_pxResults_2();
	String returnString = tools.getCurrentStream();
	tools.appendString(currentStream);
	if(directStream) {
		((PegaStreamAPI)tools).forceDirectStreaming();
	}
	return returnString;
}
public void getGridMetaData_1(IUIComponentMetadata metadataPage, IUIComponentMetadata gridWrapper) {
metadataPage.put("pyWidthOfContent","%");
gridWrapper.put("responsive","true");
gridWrapper.put("contentClass","grid-responsive-default  gPercent ");
gridWrapper.put("pzClass","default");
gridWrapper.put("DPName","D_pzUserWorkListByUserId.pxResults");
gridWrapper.put("propType","Data Object");
gridWrapper.put("resultsClass","Assign-Worklist");
String dataTestId = pzAuto.getTestIdIfEnabled("202007011657090783567", true); 
if(!"".equalsIgnoreCase(dataTestId)){
gridWrapper.put("automationId","202007011657090783567");
}
gridWrapper.put("isFilteringEnabled","true");
gridWrapper.put("isColumnResizeEnabled","true");
gridWrapper.put("isColumnReorderEnabled","true");
gridWrapper.put("isRefreshListEnabled","true");
gridWrapper.put("pyPassCurrentParamPage","false");
gridWrapper.put("isSortingEnabled","true");
gridWrapper.put("isRowHeightEnabled","true");
gridWrapper.put("isColumnTogglerEnabled","true");
gridWrapper.put("isPersonalizationEnabled","true");
gridWrapper.put("isCategorizationEnabled","true");
gridWrapper.put("isImplicitSaveEnabled","true");
gridWrapper.put("pyDesignViewName","Default");
metadataPage.put("pyPersonalizedName","Default");
gridWrapper.put("isRowVisibilityEnabled","false");
IUIComponentMetadata gridTable = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata rowOperations = pzAuto.getUIComponentRuntime().createMetadata();
gridTable.put("isDPParameterized","true");
gridTable.put("inlinestyle","width:100%;");
gridTable.put("gridSummary",tools.getLocalizedTextForString("pyCaption",""));
gridTable.put("gridCaption",tools.getLocalizedTextForString("pyCaption",""));
gridWrapper.put("hasRowOperations","false");
pega.getUIEngine().getGridUtilities().populateLocalizedText(gridWrapper, gridTable);
if(!pzAuto.isForOfflineTemplate()){
metadataPage.put("pyShowFiltersInModal","false");
}
gridWrapper.put("sectionName","HomeWorklist");
gridWrapper.put("sectionClass","Data-Portal");
metadataPage.putMetadata("gridTable",gridTable);
metadataPage.putMetadata("rowOperations",rowOperations);
}
public void gridTemplateMain_1(IUIComponentMetadata metadataPage, IUIComponentMetadata gridWrapper) {
Map dpParamsMap = new HashMap();
if(!pzAuto.isForOfflineTemplate()){
String propWithToken =  null; 
String propResolved =  null; 
dpParamsMap.put("WorkGroup","D_PortalContextGlobal.pyActiveWorkGroup");
propWithToken = pzAuto.getUIComponentRuntime().generateTokensForString("D_PortalContextGlobal.pyActiveWorkGroup"); 
propResolved = pzAuto.getUIComponentRuntime().resolveTokensInString(propWithToken); 
tools.putParamValue("WorkGroup", tools.getProperty(propResolved).getStringValue());
dpParamsMap.put("UserId","D_PortalContext.pyLabel");
propWithToken = pzAuto.getUIComponentRuntime().generateTokensForString("D_PortalContext.pyLabel"); 
propResolved = pzAuto.getUIComponentRuntime().resolveTokensInString(propWithToken); 
tools.putParamValue("UserId", tools.getProperty(propResolved).getStringValue());
}
IUIComponentMetadata tempDPParamPage = pzAuto.getUIComponentRuntime().createMetadata();
tempDPParamPage.put("pyName","WorkGroup");
tempDPParamPage.put("pyValue","#~"+pzAuto.getUIComponentRuntime().generateActionToken("D_PortalContextGlobal.pyActiveWorkGroup")+"~#");
tempDPParamPage.put("pyName","UserId");
tempDPParamPage.put("pyValue","#~"+pzAuto.getUIComponentRuntime().generateActionToken("D_PortalContext.pyLabel")+"~#");
metadataPage.addMetadataInArray("dpParams",tempDPParamPage);
String gridXML = "<?xml version=\"1.0\"?><pagedata><pxObjClass>Pega-UI-Component-Grid</pxObjClass><pyWidthOfContent>%</pyWidthOfContent><pzStatus>false</pzStatus><pzGridTable><pxObjClass>Pega-UI-Component-Grid-GridTable</pxObjClass><pzStyle>width:100%;</pzStyle></pzGridTable><pyDataCells REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>AV</pyColumnVisibility><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>73px</pyCellWidth><pyContentType>FIELD</pyContentType><pyEditOptions>Auto</pyEditOptions><pyHeaderLabel>ID</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pxRefObjectInsName</pyPropertyName><pyColumnImportance>primary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IV</pyColumnVisibility><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>201px</pyCellWidth><pyReadOnlyStyle>standard_dataLabelRead</pyReadOnlyStyle><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Description</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pyLabel</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR><PZ__ERROR DATAFLD=\"pyReadOnlyStyle\">pyReadOnlyStyle needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"3\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IV</pyColumnVisibility><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>86px</pyCellWidth><pyReadOnlyStyle>standard_dataLabelRead </pyReadOnlyStyle><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Urgency</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pxUrgencyAssign</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR><PZ__ERROR DATAFLD=\"pyReadOnlyStyle\">pyReadOnlyStyle needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"4\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IV</pyColumnVisibility><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>86px</pyCellWidth><pyReadOnlyStyle>standard_dataLabelRead </pyReadOnlyStyle><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Status</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pyAssignmentStatus</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR><PZ__ERROR DATAFLD=\"pyReadOnlyStyle\">pyReadOnlyStyle needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"5\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IH</pyColumnVisibility><pyColumnFiltering>search</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>85px</pyCellWidth><pyReadOnlyStyle>standard_dataLabelRead </pyReadOnlyStyle><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Deadline</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pxDeadlineTime</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR><PZ__ERROR DATAFLD=\"pyReadOnlyStyle\">pyReadOnlyStyle needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"6\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IH</pyColumnVisibility><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>93px</pyCellWidth><pyReadOnlyStyle>standard_dataLabelRead </pyReadOnlyStyle><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Instructions</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pyInstructions</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR><PZ__ERROR DATAFLD=\"pyReadOnlyStyle\">pyReadOnlyStyle needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"7\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IH</pyColumnVisibility><pyColumnFiltering>search</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>82px</pyCellWidth><pyReadOnlyStyle>standard_dataLabelRead </pyReadOnlyStyle><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Goal time</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pxGoalTime</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR><PZ__ERROR DATAFLD=\"pyReadOnlyStyle\">pyReadOnlyStyle needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"8\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IH</pyColumnVisibility><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>83px</pyCellWidth><pyReadOnlyStyle>standard_dataLabelRead </pyReadOnlyStyle><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Task</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pxTaskLabel</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR><PZ__ERROR DATAFLD=\"pyReadOnlyStyle\">pyReadOnlyStyle needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"9\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IV</pyColumnVisibility><pyColumnFiltering>false</pyColumnFiltering><pyColumnSorting>false</pyColumnSorting><pyCellWidth>82px</pyCellWidth><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyPropertyName>.pyTemplateInputBox</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata></pyDataCells><pzGridWrapper><pxObjClass>Pega-UI-Component-Grid-GridWrapper</pxObjClass><pzContentClass>grid-responsive-default  gPercent </pzContentClass><pzPropertyType>Data Object</pzPropertyType><pyResultsClass>Assign-Worklist</pyResultsClass><pzClass>default</pzClass><pyDataPageName>D_pzUserWorkListByUserId.pxResults</pyDataPageName><pyResponsive>true</pyResponsive><pyAutomationID>202007011657090783567</pyAutomationID></pzGridWrapper></pagedata>";
ClipboardPage temp_gridConfigPage = tools.createPage(null,"temp_gridConfigPage");
try {
  temp_gridConfigPage.adoptXMLForm(gridXML);
} catch(InvalidStreamError e){oLog.error(e);}
getGridMetaData_1(metadataPage,gridWrapper);
Map configMap = new HashMap(); 
ClipboardPage gridMetadataPage = tools.createPage("Pega-UI-Component-Grid-Filter","GridMetadata_Main"+pzAuto.getUIComponentRuntime().generateUniqueId());
gridMetadataPage.putString(".pySectionClass","Data-Portal");
gridMetadataPage.putString(".pySectionName","HomeWorklist");
configMap.put("pxGridMetadataPage", gridMetadataPage); 
gridMetadataPage.putString("pyFilteringEnabled", "true");
gridMetadataPage.putString("pySortingEnabled", "true");
gridMetadataPage.putString(".pyIsCategorizationEnabled", "true");
metadataPage.put("gridActions",getGridActions_1().trim());
String strDSName = gridWrapper.getString("DPName"); 
String strDSNameWithToken = pzAuto.getUIComponentRuntime().generateTokensForString(strDSName);
gridWrapper.put("pageListProp",strDSNameWithToken);
String strDSNameWithResolved = pzAuto.getUIComponentRuntime().getResolvedRefernce(strDSName);
gridMetadataPage.putString("pyPageList",strDSNameWithResolved);
pega.getUIEngine().getGridUtilities().updateQueryableDPInfo(strDSName,gridMetadataPage);
boolean isQueryable = gridMetadataPage.getBoolean("isQueryable");
ClipboardProperty dataCells = temp_gridConfigPage.getProperty(".pyDataCells"); 
temp_gridConfigPage.remove(".pyDataCells"); 
ClipboardPage gridStatePage = null;
com.pega.pegarules.priv.runtime.IGridUtilities gridUtilities = pega.getUIEngine().getGridUtilities(); 
pega.getUIEngine().getGridUtilities().registerGridActiviy();
metadataPage.put("pyIsPersonalized","false");
gridStatePage = gridUtilities.getPersonalizedViewsPage(metadataPage.getString("pyGridStateUniqueID"), null, metadataPage.getString("pySectionInsName"), metadataPage.getString("pyOperatorID"), metadataPage.getString("pyHarnessInsName")); 
if(null != gridStatePage){ 
dataCells = gridUtilities.mergeViewAndDesign(dataCells, gridStatePage); 
} 
configMap.put("params", dpParamsMap); 
configMap.put("pyContext", strDSName); 
configMap.put("listAction", "INIT"); 
configMap.put("pyCollectProps", "true"); 
configMap.put("pxDataSourceId", pxUniqueStreamHash+"_79");
gridWrapper.put("datasrcid",pxUniqueStreamHash+"_79");
if(isQueryable){
gridWrapper.put("isPagingEnabled","true");
gridWrapper.put("isSearchEnabled","true");
}else {
gridWrapper.put("isSearchEnabled","false");
gridWrapper.put("isPagingEnabled","true");
}
IUIComponentMetadata pagingSettings = pzAuto.getUIComponentRuntime().createMetadata();
com.pega.pegarules.priv.util.PaginatorMetaData.getPaginationMetaData(20, 1, strDSNameWithToken,"Numeric",pzAuto, "", metadataPage, pagingSettings); 
   int startIndex = 1; 
   int endIndex = 0; 
   int pxResultCount = 20;
   endIndex = pxResultCount; 
Map pyPagination = new HashMap(); 
pyPagination.put("pyStartIndex", ""+startIndex); 
pyPagination.put("pyEndIndex", ""+endIndex); 
configMap.put("pyPagination", pyPagination); 
configMap.put("pxPageSize", pxResultCount); 
gridMetadataPage.putString("pxPageSize", "20"); 
gridMetadataPage.putString("pxPageIndex", "1"); 
configMap.put("pxPageIndex", 1); 
gridWrapper.put("cellMethodName","generateGridCellModes_1");
if(isQueryable){
boolean isTablecategorized = false; 
if(gridStatePage != null) {
ClipboardPage tempPage = tools.createPage("System-User-Grids", "tempPage"); 
 tempPage.putAll(gridStatePage, ClipboardPage.PUTALL_KEEPNEW); 
tempPage.putString("isFilteringEnabled",gridMetadataPage.getString("pyFilteringEnabled"));
tempPage.putString("isSortingEnabled",gridMetadataPage.getString("pySortingEnabled"));
tempPage.putString("pxPageSize",gridMetadataPage.getString("pxPageSize"));
tempPage.putString("pxPageIndex",gridMetadataPage.getString("pxPageIndex"));
isTablecategorized = pega.getUIEngine().getGridUtilities().setCategorizationStatus(tempPage.getProperty("pyColumns"),tempPage);
pega.getUIEngine().getGridUtilities().setImplicitParameter(true ,tempPage);
tempPage.removeFromClipboard();
}else {
isTablecategorized = pega.getUIEngine().getGridUtilities().setCategorizationStatus(dataCells,gridMetadataPage);
pega.getUIEngine().getGridUtilities().setImplicitParameter(false ,gridMetadataPage);
}
isQueryable = gridMetadataPage.getBoolean("isQueryable");
if(isQueryable){
pega.getUIEngine().getGridUtilities().mergeColumnInfo(dataCells,gridMetadataPage);
gridWrapper.put("isQueryable","true");
if(isTablecategorized) {
configMap.put("isQueryable", "false"); 
}else{
configMap.put("isQueryable", "true"); 
}
}else{
}
}
gridWrapper.put("ctMethodName","gridTemplatePartial_1");
metadataPage.putMetadata("gridWrapper",gridWrapper);
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage(); 
gridTemplateBody_1(dataCells, metadataPage, configMap, false, "pxGrid");
temp_gridConfigPage.removeFromClipboard(); 
tools.putParamValue("isDPParameterized",""); 
gridMetadataPage.removeFromClipboard();
dataCells.removeFromClipboard();
gridUtilities.clearVisitedFlagInGridState(gridStatePage);
}
public void pzSetExpandParam_8() {
pzSection.getLayout().setExpandParam("SubSectionHomeWorklistBBBBB","",false);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionHomeWorklistBBBBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\">");
}
public void gridTemplateInit_1() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata gridWrapper = pzAuto.getUIComponentRuntime().createMetadata();
String pyGridStateUniqueID= "1593637501250";
String pySectionInsName= "DATA-PORTAL!HOMEWORKLIST";
String pyOperatorID= tools.findPage("OperatorID").getString(".pyUserIdentifier");
String harnessClassName = tools.getParamValue("strPHarnessClass");
if(StringUtils.isBlank(harnessClassName)) {
harnessClassName = tools.getParamValue("className");
}
String harnessName = tools.getParamValue("innerHarnessName");
if(StringUtils.isBlank(harnessName)) {
harnessName = tools.getParamValue("strPHarnessPurpose");
if(StringUtils.isBlank(harnessName)) {
harnessName = tools.getParamValue("Purpose");
}
}
String pyHarnessInsName= harnessClassName+"!"+harnessName;
metadataPage.put("pyGridStateUniqueID",pyGridStateUniqueID);
metadataPage.put("pySectionInsName",pySectionInsName);
metadataPage.put("pyOperatorID",pyOperatorID);
metadataPage.put("pyHarnessInsName",pyHarnessInsName);
gridWrapper.put("pzCTResetSaveMethodName","gridTemplateSwitchPersonalization_1");
gridTemplateMain_1(metadataPage, gridWrapper);
}
public void 
gridBeginLayout_3() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "Numeric"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 
if(tools.getIfPresent("D_PortalContextGlobal.pyActiveWorkGroup") != null)
tools.putParamValue("WorkGroup",tools.getProperty("D_PortalContextGlobal.pyActiveWorkGroup").getStringValue());
if(tools.getIfPresent("D_PortalContext.pyLabel") != null)
tools.putParamValue("UserId",tools.getProperty("D_PortalContext.pyLabel").getStringValue());
ClipboardPage tmpDeclarePageParams = null;
String dpParams = tools.getParamValue("declarePageParams");
java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("(\\{)(.+?)(:)|(,)(.+?)(:)");
java.util.regex.Matcher matcher = pattern.matcher(dpParams);
while (matcher.find()) {
String name = matcher.group(2);
String name1 = matcher.group(5);
if (name != null)
dpParams = dpParams.replace(name, name.replaceAll("\\.", "_"));
if (name1 != null)
dpParams = dpParams.replace(name1, name1.replaceAll("\\.", "_"));
}
try {
if (!"".equals(dpParams)) {
Object dpParamsList = tools.createPage("@baseclass","Temp_Grid_DeclarePageParams");
tmpDeclarePageParams = (ClipboardPage)dpParamsList;
tmpDeclarePageParams.adoptJSONObject(dpParams);
}
if (tmpDeclarePageParams != null && tmpDeclarePageParams.getProperty("D_pzUserWorkListByUserId_pxResults_HomeWorklist_1") != null) {
ClipboardPage paramList = tmpDeclarePageParams.getProperty("D_pzUserWorkListByUserId_pxResults_HomeWorklist_1").getPageValue();
java.util.Collection col= paramList.values();
Iterator it = col.iterator();
while(it.hasNext()){
ClipboardProperty cp= (ClipboardProperty)it.next();
tools.putParamValue(cp.getName(),cp.toString());
}
}
} catch(InvalidStreamError e){
oLog.error("ReloadSections:Invalid JSON Stream for data page params : "+e.getMessage());
} catch(Exception e){
oLog.error("ReloadSections:Expection : "+e.getMessage());
}

 ClipboardPage gFCritPageD_pzUserWorkListByUserId_pxResultsL7=null;

 Map selUniqMapD_pzUserWorkListByUserId_pxResultsL7 = null;

 Set filteredIndicesSetD_pzUserWorkListByUserId_pxResultsL7 = null;

	 String strFCPage = "pyFilterCriteria_D_pzUserWorkListByUserId.pxResults_HomeWorklist_1";

	 strFCPage = strFCPage.replaceAll("[^\\w]","_");

	 ClipboardPage pg_fcPage = tools.findPage(strFCPage, true);

if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")){

	 if(pg_fcPage!=null){pg_fcPage.removeFromClipboard();}

}

gFCritPageD_pzUserWorkListByUserId_pxResultsL7=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

  selUniqMapD_pzUserWorkListByUserId_pxResultsL7 = null; // reset the variable

 if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7 != null){ 

 		 filteredIndicesSetD_pzUserWorkListByUserId_pxResultsL7 = pega_uiengine_uiengine.pzPopulateFilteredindicesMap(gFCritPageD_pzUserWorkListByUserId_pxResultsL7, "D_pzUserWorkListByUserId.pxResults");

 		 tools.getParameterPage().put("filteredIndicesSet", filteredIndicesSetD_pzUserWorkListByUserId_pxResultsL7);

 tools.putParamValue("populateSelectedUIValues", "true");

 		 selUniqMapD_pzUserWorkListByUserId_pxResultsL7 = pega_uiengine_uiengine.pzPopulateSelectedValues(gFCritPageD_pzUserWorkListByUserId_pxResultsL7); 

 		 tools.getParameterPage().put("selUniqMapD_pzUserWorkListByUserId_pxResultsL7", selUniqMapD_pzUserWorkListByUserId_pxResultsL7);

 tools.putParamValue("populateSelectedUIValues", "");

 }
tools.appendString("<div id='CT' RLW='true'IRW=\"D_PortalContextGlobal.pyActiveWorkGroup Changes || D_PortalContext.pyLabel Changes\" data-declare-params=\"");
tools.appendString("{'WorkGroup':'"+ "#~"+pzAuto.getUIComponentRuntime().generateActionToken("D_PortalContextGlobal.pyActiveWorkGroup")+"~#" +"','UserId':'"+ "#~"+pzAuto.getUIComponentRuntime().generateActionToken("D_PortalContext.pyLabel")+"~#" +"'}");tools.appendString("\" >");
						try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker refreshListWhenTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

							refreshListWhenTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking("D_PortalContextGlobal.pyActiveWorkGroup"), -1);

							refreshListWhenTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking("D_PortalContext.pyLabel"), -1);
}}catch(Exception e){}
tools.appendString("<div  section_index='1' ");
tools.appendString(" dataSource='");if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_pzUserWorkListByUserId.pxResults").getReference());tools.appendString("_HomeWorklist_1'");
tools.appendString(" hashed-dp-page='");
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_pzUserWorkListByUserId.pxResults").getReference());tools.appendString("' bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("202007011657090783567") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='nextGenReadOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='true' bReportDefinition='false' bLoadActivity='false' bDataObject='true' bCBOptimize='true'");
if(tools.getParamValue("pyGridFilterCriteriaPage")!="" ) {
tools.appendString(" bFilteredGrid = 'true'");
}
tools.appendString(" bRangeFilterByFormat='false' DPSectionID=\"SubSectionHomeWorklistBBBBB\"  OAFunc='openAssignment' ");
D_pzUserWorkListByUserId_pxResults_1();
tools.appendString(">");


 ClipboardProperty pageListProp = null;

 int startIndex = "".equals(tools.getParamValue("startIndex"))?0:Integer.parseInt(tools.getParamValue("startIndex")); 


 int currentPageIndex = 0; 

 if(startIndex == 0){ startIndex = 1; } 

 tools.putParamValue("isHidePagingWhenOnePage", "true"); 

 tools.putParamValue("pyPageMode", strPageMode); 


 tools.putParamValue("pyPageSize", "20"); 

 tools.putSaveValue("pyPageSize", "20"); 

 int pyPageSize = Integer.parseInt(tools.getParamValue("pyPageSize")); 

 currentPageIndex = (startIndex % pyPageSize ==0)? (startIndex / pyPageSize) : (startIndex / pyPageSize) +1 ; 
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {


 pageListProp = tools.getProperty("D_pzUserWorkListByUserId.pxResults"); 
 int iDPTotPages = (pageListProp.size()%pyPageSize==0) ? (pageListProp.size()/pyPageSize) : (pageListProp.size()/pyPageSize)+1;
 if(((startIndex/pyPageSize)+1)>iDPTotPages) {
	 currentPageIndex = iDPTotPages;
	 startIndex = ((iDPTotPages-1)*pyPageSize)+1;
 }
if(currentPageIndex<=0) { currentPageIndex = 1; }
if(startIndex<=0) { startIndex = 1; }
}

 tools.putParamValue("startIndex",startIndex); 

 tools.putParamValue("currentPageIndex",currentPageIndex); 

 tools.putSaveValue("currentPageIndex",""+currentPageIndex); 

 int endPageIndex = (currentPageIndex%10==0)?currentPageIndex:(currentPageIndex/10+1)*10; 

 tools.putParamValue("endPageIndex",endPageIndex); 

 if(pageListProp!=null) { 

 tools.putParamValue("PageListProperty",pageListProp.getReference()); 

 } else {

 tools.putParamValue("PageListProperty","D_pzUserWorkListByUserId.pxResults");}
/* to calculate the total number of records in case of filtering with pagination..false*/
/* to calculate the total number of records in case of filtering with pagination..*/
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

 {int counter = 0; int rowsDisplayed = 0; 
ClipboardProperty propActivePrev = tools.getActive(); 

	Iterator itr = tools.getProperty("D_pzUserWorkListByUserId.pxResults").iterator();
		Set filteredResultsSet = new HashSet();
			while(itr.hasNext()){
				ClipboardProperty cp_eachProp = (ClipboardProperty)itr.next();
				ClipboardPage pg_eachProp = cp_eachProp.getPageValue();
				PRStackFrame frame = pega.pushStackFrame("FilteredGrid", null, pg_eachProp, false, false);
				tools.putActive(cp_eachProp);
				boolean bFilterResult = false;
				if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!= null){
				bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_pzUserWorkListByUserId_pxResultsL7, selUniqMapD_pzUserWorkListByUserId_pxResultsL7);
				}
				if(bFilterResult){
					int itemIndex = cp_eachProp.indexOf() ;
						filteredResultsSet.add((Integer)itemIndex);
						}
						
 			 if (gFCritPageD_pzUserWorkListByUserId_pxResultsL7== null || bFilterResult) {
						
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
						pageListProp = tools.getProperty("D_pzUserWorkListByUserId.pxResults"); }
						
 	   int totalRecords = 0; 
						   if(!"".equals(tools.getParamValue("totalRecords"))){
						try{
						 totalRecords = Integer.parseInt(tools.getParamValue("totalRecords"));
						}catch(Exception e){/*A number format exception has occured.*/} }
						   tools.putSaveValue("totalRecords", ""+totalRecords); 

						 if(!tools.getParamValue("totalRecords").equals("")){ 

						   int endIndex = 0;

						   endIndex = startIndex + pyPageSize - 1;

						   endIndex = endIndex>totalRecords ? totalRecords : endIndex; 

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
					

public void gridCentreLayout_1() {/*gridCentreLayout*/
					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;
					java.util.Map functionsMap = null;
					java.util.Map classesMap = null;
					ClipboardPage gFCritPageD_pzUserWorkListByUserId_pxResultsL7=null;
					Map selUniqMapD_pzUserWorkListByUserId_pxResultsL7 = null;
					selUniqMapD_pzUserWorkListByUserId_pxResultsL7 = null; // reset the variable
					gFCritPageD_pzUserWorkListByUserId_pxResultsL7=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));
							 selUniqMapD_pzUserWorkListByUserId_pxResultsL7 = (Map)tools.getParameterPage().getObject("selUniqMapD_pzUserWorkListByUserId_pxResultsL7");
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
					tools.putSaveValue("bAllowRowUpdate","true");
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					
					
					
					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					
					
					
					
					tools.putSaveValue("bUseMenuInline","false");

					
					
					
					
					
					pzGridIncludes_1();

					
					
					
					
					
					if(tools.getParamValue("partialRefresh").equals("")&& !Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()){

					
					
					
					
					
					ClipboardProperty prop = tools.getProperty("D_pzUserWorkListByUserId.pxResults");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pxRefObjectInsName .pyLabel .pxUrgencyAssign .pyAssignmentStatus .pxDeadlineTime .pyInstructions .pxGoalTime .pxTaskLabel .pyTemplateInputBox  ' class='yui-skin-sam gPercent grid-responsive-default ");

					
					
					
					
					
					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					
					
					
					
					
					}tools.appendString("' style='");

					
					
					
					
					
					tools.appendString("' gPropIndex='D_pzUserWorkListByUserIdPpxResults1' editRowIndex='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					
					
					
					
					
					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					
					
					
					
					
					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					
					
					
					
					
					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					
					
					
					
					
					tools.appendString("gridActiveRow='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					
					
					
					
					
					tools.getParameterPage().remove("gridActiveRow"); 

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"true\" bFiltering=\"true\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\"");

					
					
					
					
					
					if(tools.getParamValue("showFADetails").equals("true")) { tools.appendString("callFADetails='true'"); }if(tools.getParamValue("showNextFADetails").equals("true")) { tools.appendString("callNextFADetails='true'");}if(tools.getParamValue("refreshLayoutFromConfig").equals("true")) { tools.appendString("refreshLayoutFromConfig='true'");}tools.appendString(" dpParams=\"WorkGroup,UserId\" pyPageSize = '");

					
					
					
					
					
					tools.appendParamCSF("pyPageSize"); tools.appendString("' pyReturnResultCount = '");

					
					
					
					
					
					tools.appendParamCSF("pyReturnResultCount"); tools.appendString("' pyPageMode= '");

					
					
					
					
					
					tools.appendParamCSF("pyPageMode"); tools.appendString("' totalRecords= '");

					
					
					
					
					
					tools.appendParamCSF("totalRecords"); tools.appendString("' currentPageIndex='");

					
					
					
					
					
					tools.appendParamCSF("currentPageIndex"); tools.appendString("' pySortHandled=\"false\" pyFilterHandled=\"false\">");

					
					
					
					
					
					

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					
					
					
					
					
					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("202007011657090783567-layout") + " ");

					
					
					
					
					
					tools.appendString(" class='gridTable ");

					
					
					
					
					
					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					
					
					
					
					
					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					
					
					
					
					
					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					
					
					
					
					
					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"D_pzUserWorkListByUserIdPpxResults1colWidthGBL\" id=\"D_pzUserWorkListByUserIdPpxResults1colWidthGBL\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthGBL"));tools.appendString("\" />");

					
					
					
					
					
					
						 tools.putParamValue("expandRL","false"); 

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"D_pzUserWorkListByUserIdPpxResults1colWidthGBR\" id=\"D_pzUserWorkListByUserIdPpxResults1colWidthGBR\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_pzUserWorkListByUserIdPpxResults1colWidthGBR"));

					
					
					
					
					
					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					
					
					
					
					
					 if(!("".equals(tools.getParamValue("D_pzUserWorkListByUserIdPpxResults1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					
					
					
					
					
					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='' bColumnResize=\"true\" PL_PROP='D_pzUserWorkListByUserId.pxResults' PL_PROP_CLASS='Assign-Worklist' PRIM_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getPrimaryPage().getName());

					
					
					
					
					
					tools.appendString("' GRID_REF_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getStepPage().getReference());

					
					
					
					
					
					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' >");

					
					
					
					
					
					 repeatingHeaderCell_1(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_2(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_3(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_4(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_5(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_6(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_7(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_8(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_9(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
					
					
					
					
					
 {int counter = 0; int rowsDisplayed = 0; 

					
					
					
					
					
					
								 {Iterator itr_3 = null;

					
					
					
					
					
					if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

					
					
					
					
					
					
								 itr_3 = tools.getProperty("D_pzUserWorkListByUserId.pxResults").iterator(); 

					
					
					
					
					
					} else {

					
					
					
					
					
					tools.putSaveValue("rowsDisplayed", rowsDisplayed + "");

					
					
					
					
					
					}

					
					
					
					
					
					
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
										 } else if(gFCritPageD_pzUserWorkListByUserId_pxResultsL7!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_pzUserWorkListByUserId_pxResultsL7, selUniqMapD_pzUserWorkListByUserId_pxResultsL7);
										 }
										 if (gFCritPageD_pzUserWorkListByUserId_pxResultsL7== null || 

					
					
					
					
					
					 tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf())) || 

					
					
					
					
					
					 bFilterResult) {

					
					
					
					
					
					
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

					
					
					
					
					
					tools.appendString(" ng-repeat=\"Item in rootData.D_pzUserWorkListByUserId.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					
					
					 
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

					
					
					
					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_pzUserWorkListByUserId.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_pzUserWorkListByUserId.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					
					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					
					
					
					String strEntryHandlePLProp = "";

					
					
					
					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_pzUserWorkListByUserId.pxResults"); } catch (Exception ex) { }

					
					
					
					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					
					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					
					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					
					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					
					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					
					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					
					
					
					}

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("202007011657090783567-" + rowTestID) + " ");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString(" PL_INDEX = '");

					
					
					
					
					
					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					
					
					
					
					
					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_23(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_2(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_3(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_4(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_24(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_6(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_25(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_8(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_26(); 

					
					
					
					
					
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

					
					
					
					
					
					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"9\" class=\"dataLabelRead gridCell\" >");

					
					
					
					
					
					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",""); 

					
					
					
					
					
					
									 ClipboardPage tempNoRespg = tools.createPage("Assign-Worklist", "tempNoRespg");

					
					
					
					
					
					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
					
					
					
					
					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					
					
					
					
					
					if(tools.getParamValue("showOnLoadMsg").equals("showOnLoadMsg")) {

					
					
					
					
					
					gridNoRowsMesgIncl_1(); 

					
					
					
					
					
					}else{

					
					
					
					
					
					gridNoRowsMesgIncl_2(); 

					
					
					
					
					
					}

					
					
					
					
					
					
									  pega.popStackFrame(frame, false);  

					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
					
					
					
					
					
								 tools.putParamValue("showOnLoadMsg", ""); 

					
					
					
					
					
					
 tempNoRespg.removeFromClipboard();

					
					
					
					
					
					tools.appendString("\n </td></tr>");

					
					
					
					
					
					 } } }   

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					
					
					
					
					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					
					
					
					 tools.putSaveValue("bUseMenuInline", "false");

					
					
					
					
					
					 if( tools.getParamValue("partialTrigger").equals("getChildNodesD_pzUserWorkListByUserId.pxResults1") && tools.getParamValue("partialRefresh").equals("false")) {

					
					
					
					
					
						 tools.putParamValue("partialTrigger",""); 
}

					
					
					
					
					
					
					 /* GenerateGrid: End */

					
					
					
					
					
					}

					
					
					
					
					
					public void 
gridEndLayout_1
					
					
					
					
					
					() {

					
					
					
					
					
					
 tools.getParameterPage().remove("pyReportPageName"); 

					
					
					
					
					
					
 tools.getParameterPage().remove("pyGridFilterCriteriaPage"); 

					
					
					
					
					tools.appendString("</div></div></div>");

					
					
					
					
					}

					
					
					
					
					public void LayoutWrapperTableEnd_1() {

					
					
					
					
					tools.appendString("</div>");

					
					
					
					
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

					
					
					
					
					String paramName = "EXPANDEDSubSectionHomeWorklistBBBBB";

					
					
					
					
					metadataPage.put("paramName", paramName);

					
					
					
					
					String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");

					
					
					
					
					if(!inspectorLayoutData.isEmpty()) {

					
					
					
					
					metadataPage.put("liveUI", inspectorLayoutData);

					
					
					
					
					}

					
					
					
					
					String pyPrefix = null;

					
					
					
					
					metadataPage.put("prefix","-default");

					
					
					
					
					metadataPage.put("sectionIndex","10");

					
					
					
					
					IUIComponent containerComponent = pzAuto.getUIComponent();

					
					
					
					
					com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();

					
					
					
					
					boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o2&& o2== pxparam.bRenderAsTable cqtrue o2!= rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq", pxUniqueStreamHash+"_108");metadataPage.put("dlChild","true");

					
					
					
					
					metadataPage.put("lMode","Inline-block");

					
					
					
					
					IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();

					
					
					
					
					pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_108");

					
					
					
					
					metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);

					
					
					
					
					containerComponent.beginComponent("pxLayoutContainer",metadataPage);

					
					
					
					
					if(pyVisibility) {

					
					
					
					
					pzLayoutBody_4();

					
					
					
					
					}

					
					
					
					
					containerComponent.endComponent();

					
					
					
					
					runtimeContextTree.endVisibleWhen();

					
					
					
					
					}
public void pzLayout_7() {
String gridLayoutMethodName="pzLayout_7";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o2&& o2== pxparam.bRenderAsTable cqtrue o2!= rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq","param.bRenderAsTable = \'true\' && D_PortalContext.pyIsBasket!=\'true\' && D_PortalContext.pyLabel!=\'\'", "layout", "visible" )) {pzSetExpandParam_8();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()){ 
gridTemplateInit_1();
return;}pzLayoutBodyWrapper_10();
 LayoutWrapperTableEnd_1(); }
}
}
tools.putParamValue("gridLayoutMethodName","");
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_4();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_3() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
}
public void pzLayoutBodyWrapper_9() {
tools.appendString("<div class='layout layout-noheader layout-noheader-default'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_8() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void getNextPage_2(String listSource, int listStartIndex, int listEndIndex) {
	IUIComponent nextPageComponent = pzAuto.getUIComponent(IUIComponent.ComponentType.NEWPAGE);
	ClipboardProperty rdlPageListProp = tools.getProperty(listSource);
	int totalRecords = rdlPageListProp.size();
	listEndIndex = (listEndIndex < 0 || listEndIndex > totalRecords) ? totalRecords : listEndIndex;
	Map map = new HashMap();
	Map<String, String> indexMap = new HashMap<String, String>();
	indexMap.put("pyStartIndex",Integer.toString(listStartIndex));
	indexMap.put("pyEndIndex",Integer.toString(listEndIndex));
	map.put("pxDataSourceId", pxUniqueStreamHash+"_68");
	map.put("pyContext", listSource);
	map.put("pyPagination", indexMap);
	IUIComponentMetadata nextPageMetadata = pzAuto.getUIComponentRuntime().createMetadata();
	nextPageMetadata.put("datasrcid",pxUniqueStreamHash+"_68");
	nextPageMetadata.put("automationId", "" + pzSection.getLayout().getTestIdIfEnabled("20190206080236048636" ) + "");
	nextPageMetadata.put("pageListProp",listSource);
	nextPageMetadata.put("strtindx",Integer.toString(listStartIndex));
	nextPageMetadata.put("endindx",Integer.toString(listEndIndex));
	nextPageMetadata.put("processChildren","false");
	nextPageMetadata.put("rdlshowdtls","false");
	nextPageComponent.addDependentScripts("pzpega_ui_nextpagetemplate.js");
	nextPageComponent.beginComponent("nextPage",nextPageMetadata,map);
	ClipboardProperty cpSource = tools.getProperty(listSource);
	ClipboardPage itemPage = null;
	Iterator itemPages = cpSource.iterator();
	if(itemPages.hasNext()) {
		itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
		PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
		simpleLayoutCell_4(1);
	pega.popStackFrame(itemFrame, false);
	}
	nextPageComponent.endComponent();
	}
	

public void GetRDLRow_2(String listSource, int index) {
		ClipboardProperty rdlPageListProp = tools.getProperty(listSource);
		ClipboardPage itemPage = rdlPageListProp.getPageValue(index);
		if(itemPage != null){
		tools.appendString("||RDLROWMARKUP_BEGIN||");
		PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
		IUIComponent repeatingRow = null;
		if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
		repeatingRow = pzAuto.getUIComponent();
		IUIComponentMetadata pg_repeatingRowMeta = pzAuto.getUIComponentRuntime().createMetadata();
		pg_repeatingRowMeta.put("index", index + "");
		repeatingRow.beginComponent("RepeatingRow", pg_repeatingRowMeta);
		}
		int cellIndex=simpleLayoutCell_4(index);
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
		repeatingRow.endComponent();
		}
		pega.popStackFrame(itemFrame, false);
		tools.appendString("||RDLROWMARKUP_END||");
		}
		}
public void pzLayoutBodyWrapper_7() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_6();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_6() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_65","HomeWorklistorQueueItem", secInfo);
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
	String sectionName = "HomeWorklistorQueueItem"; 
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
public void pzSetExpandParam_7() {
pzSection.getLayout().setExpandParam("SubSectionCellHomeWorklist655","",false);
}
public void pzLayout_4() {
pzSetExpandParam_7();
pzLayoutBodyWrapper_7();
}
public void buildSection_5() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_62","HomeWorklistorQueueItem", secInfo);
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
	String sectionName = "HomeWorklistorQueueItem"; 
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


public int simpleLayoutCell_4(  int index) {
	String labelName="";
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","HomeWorklistorQueueItem",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-bottom-spacing    " + pzSection.getCustomStyle(false, "","border-b-standard padding-b-1x","border-b-standard padding-b-1x")  + " flex flex-row ' ");
	boolean prevState = (tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails")))  ? true : false ;
	tools.putParamValue("bRDLShowDetails","false");
	tools.appendString("NAME='BASE_REF' BASE_REF='");
	if( pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'N'){
	String strSub="";
	if(tools.getStepPage().getIfPresent("pxSubscript") != null && !"".equals(tools.getStepPage().getString("pxSubscript"))) { 
	 strSub = tools.getStepPage().getString("pxListSubscript"); 
	 }else if(tools.getStepPage() != null && tools.getStepPage().getParentProperty() != null){  
	 strSub = ""+tools.getStepPage().getParentProperty().indexOf(); 
	 }
	tools.putParamValue("index",strSub);
	tools.appendString(tools.getStepPage().getReference() + "' ");
	String rowTestID = tools.getParamValue("index");
	tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("20190206080236048636-" + rowTestID) + " ");
	}else {
	tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getStepPage().getReference(),"") + "' ");
	}
	tools.appendString(" STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_5();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.putParamValue("bRDLShowDetails",prevState);
	tools.appendString("</div>");
	index++;
	return index;
	}else{
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean prevState = (tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails")))  ? true : false ;
	tools.putParamValue("bRDLShowDetails","false");
	 baseRef = "NAME='BASE_REF' BASE_REF='";
	String strSub="";
	if( pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'N'){
	if(tools.getStepPage().getIfPresent("pxSubscript") != null && !"".equals(tools.getStepPage().getString("pxSubscript"))) { 
	 strSub = tools.getStepPage().getString("pxListSubscript"); 
	 }else if(tools.getStepPage() != null && tools.getStepPage().getParentProperty() != null){  
	 strSub = ""+tools.getStepPage().getParentProperty().indexOf(); 
	 }
	baseRef += tools.getStepPage().getReference();
	}else {
	baseRef += tools.getStepPage().getReference();
	}
	baseRef += "'";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","border-b-standard padding-b-1x");
	pgCells.put("customRWStyles","border-b-standard padding-b-1x");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","HomeWorklistorQueueItem",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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
	tools.putParamValue("bRDLShowDetails",prevState);
	return index;
	}
}
public void pzTemplateRDL_2() {
IUIComponentMetadata pgRDMetadata = null;
IUIComponentMetadata pgSection = null;  
IUIComponentMetadata pgSectionBody = null;  
IUIComponentMetadata pgCells  = null; 
IUIComponentMetadata pyRDDataPageParams = null;
IUIComponent cc = pzAuto.getUIComponent(IUIComponent.ComponentType.RDL);
String pyInstanceId ="";
char mode = tools.getProperty("D_WorkBasket.pxResults").getMode();
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
pgRDMetadata = pzAuto.getUIComponentRuntime().createMetadata();
pgRDMetadata.put("pyProcessChildren","false");
String strLayoutMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
ClipboardPage dummyPage = tools.createPage("Assign-WorkBasket","NoDataPage");
PRStackFrame itemFrame1 = pega.pushStackFrame("NoResultsPage", null, dummyPage, true, false);
pgRDMetadata.put("noresulttype", "section");
Map<String, Object> RDLNoRowMessageSectionParams = new HashMap<>();
RDLNoRowMessageSectionParams.put("doNotAddToMetadataTree", true);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_66","HomeWorklistNoResults", RDLNoRowMessageSectionParams);
String pyNoDataReference = pzAuto.getUIComponentRuntime().getRuntimeContextTree().getLastAccesedSectionHash();
pgRDMetadata.put("nodatasec", pyNoDataReference);
pega.popStackFrame(itemFrame1, false);
dummyPage.removeFromClipboard();
pgRDMetadata.put("methodnm",strLayoutMethodName);
pgSection = pzAuto.getUIComponentRuntime().createMetadata();
pgSectionBody = pzAuto.getUIComponentRuntime().createMetadata();
pgCells = pzAuto.getUIComponentRuntime().createMetadata();
pgSection.put("class","content    flex  layout-content-default content-default "); 
pgSection.put("liveUI","" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + ""); 
pgRDMetadata.put("isformnavigation","false");
pgRDMetadata.put("rdlnavigationtype","tabkey");
String expressionId = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression;
if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
expressionId = pxUniqueStreamHash+"_67";
expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  "D_WorkBasket.pxResults AddDelete", expressionId, true);
expressionId = expression.getId();
}
ClipboardProperty rdlPageListProp = tools.getProperty("D_WorkBasket.pxResults");
String rdlPageListPropRef = "D_WorkBasket.pxResults";
if(rdlPageListProp != null) {
rdlPageListPropRef = rdlPageListProp.getReference();
}
String rdlRefreshWhenStr = "D_WorkBasket.pxResults AddDelete";
rdlRefreshWhenStr = rdlRefreshWhenStr.replace("D_WorkBasket.pxResults",rdlPageListPropRef);
if(!StringUtils.isBlank(expressionId)) {
	pgRDMetadata.put("pyExpressionId", expressionId);
}
pgRDMetadata.put("nextpg","getNextPage_2");
pzAuto.getUIComponentRuntime().resetServerWhenEnabled(true);
if (pzAuto.getUIComponentRuntime().isTemplateRendering()) {
pgRDMetadata.put("nomoremsgtype", "section");
Map<String, Object> RDLNoMoreDataMessageSectionParams = new HashMap<>();
RDLNoMoreDataMessageSectionParams.put("doNotAddToMetadataTree", true);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_69","pyProgressiveRDLPaginatorShowLess", RDLNoMoreDataMessageSectionParams);
String pyNoMoreDataReference = pzAuto.getUIComponentRuntime().getRuntimeContextTree().getLastAccesedSectionHash();
pgRDMetadata.put("nomoredataref", pyNoMoreDataReference);
} else {
RDLNoDetails_1
();
}
pzAuto.getUIComponentRuntime().resetServerWhenEnabled(false);
pzAuto.getUIComponentRuntime().resetServerWhenEnabled(true);
if (pzAuto.getUIComponentRuntime().isTemplateRendering()) {
Map<String, Object> RDLPaginatorSectionParams = new HashMap<>();
RDLPaginatorSectionParams.put("doNotAddToMetadataTree", true);
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
RDLPaginatorSectionParams.put("packageSection", true);
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_70","pyProgressiveRDLPaginator", RDLPaginatorSectionParams);
String pyRDLPaginatorReference = pzAuto.getUIComponentRuntime().getRuntimeContextTree().getLastAccesedSectionHash();
pgRDMetadata.put("pgsection", pyRDLPaginatorReference);
}
pzAuto.getUIComponentRuntime().resetServerWhenEnabled(false);
pgRDMetadata.put("pyenableswipe","false");
pgRDMetadata.put("rdlpgmode","1");
pgRDMetadata.put("rdlpgsize","3");
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pgSectionBody.put("pageListProp",pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_WorkBasket.pxResults").getReference(),"", false).replaceFirst("_pa[0-9]+pz","")); 
} else {
pgSectionBody.put("pageListProp",pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_WorkBasket.pxResults").getReference(),"",false)); 
}
pgSectionBody.put("sourcetype","Data Object");
Map map = new HashMap();
Map paramsMap = new HashMap();
map.put("params", paramsMap);
Map<String, String> pyPagination = new HashMap<String, String>();
pyPagination.put("pyStartIndex", "1");
pyPagination.put("pyEndIndex", Integer.toString(3));
map.put("pyPagination", pyPagination);
map.put("pxDataSourceId", pxUniqueStreamHash+"_71");
pgSectionBody.put("datasrcid",pxUniqueStreamHash+"_71");
pyRDDataPageParams = pzAuto.getUIComponentRuntime().createMetadata();
paramsMap.put("WorkGroup", "D_PortalContextGlobal.pyActiveWorkGroup");
pyRDDataPageParams.put("pyName","WorkGroup");
 { String propertyRef="D_PortalContextGlobal.pyActiveWorkGroup";if(propertyRef.startsWith(".")){		propertyRef = tools.getStepPage().getReference() + propertyRef;}
pyRDDataPageParams.put("pyValue","{\"value\":\""+propertyRef+"\",\"isLiteral\":false}"); } 
pgSectionBody.addMetadataInArray("rdparamslst",pyRDDataPageParams);
pyRDDataPageParams = pzAuto.getUIComponentRuntime().createMetadata();
paramsMap.put("WorkBasket", "D_PortalContext.pyLabel");
pyRDDataPageParams.put("pyName","WorkBasket");
 { String propertyRef="D_PortalContext.pyLabel";if(propertyRef.startsWith(".")){		propertyRef = tools.getStepPage().getReference() + propertyRef;}
pyRDDataPageParams.put("pyValue","{\"value\":\""+propertyRef+"\",\"isLiteral\":false}"); } 
pgSectionBody.addMetadataInArray("rdparamslst",pyRDDataPageParams);
pgSectionBody.put("dpname","D_WorkBasket");
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pgRDMetadata.put("generatePath","true");
}
pgSectionBody.addMetadataInArray("cells",pgCells);
pgSection.addMetadataInArray("sectionbody",pgSectionBody);
pgRDMetadata.putMetadata("section",pgSection);
pyInstanceId =String.valueOf(System.currentTimeMillis());
pgRDMetadata.put("uniqueid", "RDL" + pyInstanceId);
pgRDMetadata.put("automationId", "" + pzSection.getLayout().getTestIdIfEnabled("20190206080236048636" ) + "");
cc.addDependentScripts("pzpega_ui_RDLTemplate.js");
cc.addDependentScripts("pzpega_ui_RDLRowTemplate.js");
cc.addAdditionalScripts("rdlincludes","pzpega_ui_rdl.js");
pgRDMetadata.put("rowmethod","GetRDLRow_2");
map.put("pyContext", "D_WorkBasket.pxResults");
cc.beginComponent("RepeatingDynamicLayout",pgRDMetadata,map);
Map<String,String> repeatMap  = null; if(tools.getParameterPage().getParameterValue("pzRepeatProperties")!=null){
repeatMap = (Map<String,String>)tools.getParameterPage().getParameterValue("pzRepeatProperties");
}else {
repeatMap = new HashMap<String,String>();
}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_WorkBasket.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""), "RDL" + pyInstanceId);
} else {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_WorkBasket.pxResults").getReference(),"", false),pyInstanceId);
}
tools.getParameterPage().putObject("pzRepeatProperties",repeatMap);
ClipboardProperty cpSource = tools.getProperty("D_WorkBasket.pxResults");
boolean bIsSourceEmpty = false;
ClipboardPage itemPage = null;
if(cpSource.size()==0){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
bIsSourceEmpty=true;
ClipboardPage cpParentPage = cpSource.getTopLevelPage();
String dummyPageName = "";
if(tools.isValidDataPage(cpParentPage.getName())){
dummyPageName = "Dummy"+cpParentPage.getName();
}else{
dummyPageName = "DummyD_WorkBasket_pxResults";
}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_WorkBasket.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""),"RDL" + pyInstanceId + ":" + dummyPageName);
itemPage = tools.createPage("Assign-WorkBasket",dummyPageName);
PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
simpleLayoutCell_4(1);
	pega.popStackFrame(itemFrame, false);
} else {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_WorkBasket.pxResults").getReference(),"",false),pyInstanceId + ":" + dummyPageName);
}
}else{
if(mode =='L' || mode =='G'){
Iterator itemPages = cpSource.iterator();
int pageCounter = 0;
while(itemPages.hasNext()) {
	pageCounter++;
	itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
	PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
	if(pageCounter == 1) {
	simpleLayoutCell_4(1);
	}
	pega.popStackFrame(itemFrame, false);
}
}}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.remove(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_WorkBasket.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""));
} else {
repeatMap.remove(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_WorkBasket.pxResults").getReference(),"", false));
}
cc.endComponent();
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
		pzPackageRuntime.packageSection("HomeWorklist",
		tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
		}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
		}
		}
		

public void RepeatingRDLCell_2(String listSource, int listStartIndex, int listEndIndex) {
			String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
			String rptDynamicIdx_prefix = "";
			if(!"".equals(rptDynamicIdx)) rptDynamicIdx_prefix = rptDynamicIdx + "_";
			ClipboardProperty rdlPageListProp = tools.getProperty(listSource);
			int totalRecords = rdlPageListProp.size();
			listEndIndex = (listEndIndex < 0 || listEndIndex > totalRecords) ? totalRecords : listEndIndex;
			if(totalRecords > 0 && listStartIndex > 0 && listStartIndex <= totalRecords){
			for(int i = listStartIndex; i <= listEndIndex; i++){
			ClipboardPage itemPage = rdlPageListProp.getPageValue(i);
			if(itemPage != null){
			PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
			tools.putParamValue("RepeatDynamicIndex", rptDynamicIdx_prefix + i);
			tools.putParamValue("pega_RLindex",rptDynamicIdx_prefix +i);
			tools.putParamValue("expandRL","true");
			int index=simpleLayoutCell_4(i);
	tools.putParamValue("expandRL","false");
			pega.popStackFrame(itemFrame, false);
			}
			}
			}
			}
public void pzSetExpandParam_6() {
pzSection.getLayout().setExpandParam("SubSectionHomeWorklistBBBB","",false);
}


public void putRDLDPParams_2() {
	if(tools.getIfPresent("D_PortalContextGlobal.pyActiveWorkGroup") != null)
	tools.putParamValue("WorkGroup",tools.getProperty("D_PortalContextGlobal.pyActiveWorkGroup").getStringValue());
	if(tools.getIfPresent("D_PortalContext.pyLabel") != null)
	tools.putParamValue("WorkBasket",tools.getProperty("D_PortalContext.pyLabel").getStringValue());
	}
	

public void simpleLayout_2() {
		putRDLDPParams_2();
		String strRWPreActivity = "";
		strRWPreActivity = "";
		
		String strDTransform = "";
		strDTransform = "";
		pega_rules_utilities.pzRegisterActivity(tools, "ShowStream");
		tools.putParamValue("listPageSize","3");
		boolean bGenerateNonTemplateRDL = false;
		if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled() && !bGenerateNonTemplateRDL) {
		pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
		HashStringMap whenKeys= new HashStringMap();
		whenKeys.put("pxObjClass","Rule-Obj-When");
		whenKeys.put("pyClassName",tools.getPrimaryPage().getString("pxObjClass"));
		whenKeys.put("pyBlockName","pzIsRDLTemplatized");
		boolean isRDLTemplatized = tools.evaluateWhen(whenKeys);
		if(pzAuto.getUIComponentRuntime().isTemplateRendering() || isRDLTemplatized) {
		pzTemplateRDL_2();
		return;
		}
		} else {
		bGenerateNonTemplateRDL = true;
		tools.putParamValue("bGenerateNonTemplateRDL","true");
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_72");
		}
		int totalRecords=0;
		int pageSize=3, endIndex=0;
		tools.appendString("<div class='rdlWrapperDiv'>");
		boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
		String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
		String bIsGridLayout=tools.getParamValue("bIsGridLayout");
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
		tools.putParamValue("bIsWrapperAdded", "true");
		}
		tools.appendString("<div bSimpleLayout='true' " + "data-repeat-source= '");
		tools.appendString(tools.getProperty("D_WorkBasket.pxResults").getReference()+ "' ");
		tools.appendString(" " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + "  class=' flex content   layout-content-default content-default   progressive-useraction' ");
		String strMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
		ClipboardProperty rdlPageListProperty = tools.getProperty("D_WorkBasket.pxResults");
		String rdlPageListPropRef = "D_WorkBasket.pxResults";
		if(rdlPageListProperty != null) {
		rdlPageListPropRef = rdlPageListProperty.getReference();
		}
		String rdlRefreshWhenStr = "D_WorkBasket.pxResults AddDelete";
		rdlRefreshWhenStr = rdlRefreshWhenStr.replace("D_WorkBasket.pxResults",rdlPageListPropRef);
		tools.appendString(" data-refresh=\"true\" data-methodName='" + strMethodName + "' data-rowmethodname='GetRDLRow_2' ");
try {
tools.appendString("RWP=\".pxResults\" RW=\"");
tools.appendString(rdlRefreshWhenStr);
tools.appendString("\"");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("20190206080236048636" ) + " ");
		tools.appendString(">");
		int index = 1;
		tools.putParamValue("bIsRDL","true");
		String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
		String rptDynamicIdx_prefix = "";
		if(!"".equals(rptDynamicIdx)) rptDynamicIdx_prefix = rptDynamicIdx + "_";
		ClipboardProperty rdlPageListProp =null;
		if (tools.getParamValue("pyPegaDesignMode").equals("true")) { return;}
		rdlPageListProp = tools.getProperty("D_WorkBasket.pxResults");
		totalRecords = rdlPageListProp.size();
		Iterator itemPages = rdlPageListProp.iterator();
		if(totalRecords > 0){
		int startIndex = 1; 
		endIndex = (totalRecords < pageSize) ? totalRecords : pageSize;
		RepeatingRDLCell_2(rdlPageListProp.getReference(),startIndex, endIndex);
		}
		tools.putParamValue("RepeatDynamicIndex", rptDynamicIdx);
		tools.putParamValue("bIsRDL","");
		tools.putParamValue("pega_RLindex","");
		tools.appendString("</div>");
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("</div></div>");
		tools.putParamValue("bIsWrapperAdded", "false");
		}
		if(totalRecords >= pageSize){
		tools.appendString("<div class='RDLPaginator' data-methodname='RepeatingRDLCell_2'");
		tools.appendString("data-pagination-config='{\"listPaginationMode\":\"Progressive\",\"listPageSize\":\""+pageSize+"\",\"listStartIndex\":\""+(endIndex+1)+"\"}'");
		tools.appendString(">");
		RDLPaginator_1
		();
		tools.appendString("</div>");
		}
		tools.appendString("</div>");
		if(bGenerateNonTemplateRDL) {
		tools.getParameterPage().remove("bGenerateNonTemplateRDL");
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		}
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
	String paramName = "EXPANDEDSubSectionHomeWorklistBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o2== rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq", pxUniqueStreamHash+"_73");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_73");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_2();
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
if(pzAuto.handleEvaluateWhen(" o2&& o2== rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq","D_PortalContext.pyIsBasket==\'true\' && D_PortalContext.pyLabel!=\'\'", "layout", "visible" )) {pzSetExpandParam_6();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_8();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
putRDLDPParams_2();
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_6() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void RDLPaginator_1() {
pzAuto.emitIncludeStreamReference("pyRDLPaginator", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Section", null);
}


public void RDLNoDetails_1() {
pzAuto.emitIncludeStreamReference("pyRDLNoMoreData", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Section", null);
}


public void getNextPage_1(String listSource, int listStartIndex, int listEndIndex) {
	IUIComponent nextPageComponent = pzAuto.getUIComponent(IUIComponent.ComponentType.NEWPAGE);
	ClipboardProperty rdlPageListProp = tools.getProperty(listSource);
	int totalRecords = rdlPageListProp.size();
	listEndIndex = (listEndIndex < 0 || listEndIndex > totalRecords) ? totalRecords : listEndIndex;
	Map map = new HashMap();
	Map<String, String> indexMap = new HashMap<String, String>();
	indexMap.put("pyStartIndex",Integer.toString(listStartIndex));
	indexMap.put("pyEndIndex",Integer.toString(listEndIndex));
	map.put("pxDataSourceId", pxUniqueStreamHash+"_54");
	map.put("pyContext", listSource);
	map.put("pyPagination", indexMap);
	IUIComponentMetadata nextPageMetadata = pzAuto.getUIComponentRuntime().createMetadata();
	nextPageMetadata.put("datasrcid",pxUniqueStreamHash+"_54");
	nextPageMetadata.put("automationId", "" + pzSection.getLayout().getTestIdIfEnabled("20190206080236048636" ) + "");
	nextPageMetadata.put("pageListProp",listSource);
	nextPageMetadata.put("strtindx",Integer.toString(listStartIndex));
	nextPageMetadata.put("endindx",Integer.toString(listEndIndex));
	nextPageMetadata.put("processChildren","false");
	nextPageMetadata.put("rdlshowdtls","false");
	nextPageComponent.addDependentScripts("pzpega_ui_nextpagetemplate.js");
	nextPageComponent.beginComponent("nextPage",nextPageMetadata,map);
	ClipboardProperty cpSource = tools.getProperty(listSource);
	ClipboardPage itemPage = null;
	Iterator itemPages = cpSource.iterator();
	if(itemPages.hasNext()) {
		itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
		PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
		simpleLayoutCell_2(1);
	pega.popStackFrame(itemFrame, false);
	}
	nextPageComponent.endComponent();
	}
	

public void GetRDLRow_1(String listSource, int index) {
		ClipboardProperty rdlPageListProp = tools.getProperty(listSource);
		ClipboardPage itemPage = rdlPageListProp.getPageValue(index);
		if(itemPage != null){
		tools.appendString("||RDLROWMARKUP_BEGIN||");
		PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
		IUIComponent repeatingRow = null;
		if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
		repeatingRow = pzAuto.getUIComponent();
		IUIComponentMetadata pg_repeatingRowMeta = pzAuto.getUIComponentRuntime().createMetadata();
		pg_repeatingRowMeta.put("index", index + "");
		repeatingRow.beginComponent("RepeatingRow", pg_repeatingRowMeta);
		}
		int cellIndex=simpleLayoutCell_2(index);
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
		repeatingRow.endComponent();
		}
		pega.popStackFrame(itemFrame, false);
		tools.appendString("||RDLROWMARKUP_END||");
		}
		}
public void pzLayoutBodyWrapper_5() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_4();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_4() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_51","HomeWorklistorQueueItem", secInfo);
}


public void sectionBodyIncludeInCell_4() { 
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
	String sectionName = "HomeWorklistorQueueItem"; 
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
pzSection.getLayout().setExpandParam("SubSectionCellHomeWorklist2","",false);
}
public void pzLayout_2() {
pzSetExpandParam_5();
pzLayoutBodyWrapper_5();
}
public void buildSection_3() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_48","HomeWorklistorQueueItem", secInfo);
}


public void sectionBodyIncludeInCell_3() { 
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
	String sectionName = "HomeWorklistorQueueItem"; 
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


public int simpleLayoutCell_2(  int index) {
	String labelName="";
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","HomeWorklistorQueueItem",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-bottom-spacing    " + pzSection.getCustomStyle(false, "","border-b-standard padding-b-1x","border-b-standard padding-b-1x")  + " flex flex-row ' ");
	boolean prevState = (tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails")))  ? true : false ;
	tools.putParamValue("bRDLShowDetails","false");
	tools.appendString("NAME='BASE_REF' BASE_REF='");
	if( pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'N'){
	String strSub="";
	if(tools.getStepPage().getIfPresent("pxSubscript") != null && !"".equals(tools.getStepPage().getString("pxSubscript"))) { 
	 strSub = tools.getStepPage().getString("pxListSubscript"); 
	 }else if(tools.getStepPage() != null && tools.getStepPage().getParentProperty() != null){  
	 strSub = ""+tools.getStepPage().getParentProperty().indexOf(); 
	 }
	tools.putParamValue("index",strSub);
	tools.appendString(tools.getStepPage().getReference() + "' ");
	String rowTestID = tools.getParamValue("index");
	tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("20190206080236048636-" + rowTestID) + " ");
	}else {
	tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getStepPage().getReference(),"") + "' ");
	}
	tools.appendString(" STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_3();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.putParamValue("bRDLShowDetails",prevState);
	tools.appendString("</div>");
	index++;
	return index;
	}else{
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean prevState = (tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails")))  ? true : false ;
	tools.putParamValue("bRDLShowDetails","false");
	 baseRef = "NAME='BASE_REF' BASE_REF='";
	String strSub="";
	if( pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'N'){
	if(tools.getStepPage().getIfPresent("pxSubscript") != null && !"".equals(tools.getStepPage().getString("pxSubscript"))) { 
	 strSub = tools.getStepPage().getString("pxListSubscript"); 
	 }else if(tools.getStepPage() != null && tools.getStepPage().getParentProperty() != null){  
	 strSub = ""+tools.getStepPage().getParentProperty().indexOf(); 
	 }
	baseRef += tools.getStepPage().getReference();
	}else {
	baseRef += tools.getStepPage().getReference();
	}
	baseRef += "'";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","border-b-standard padding-b-1x");
	pgCells.put("customRWStyles","border-b-standard padding-b-1x");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","HomeWorklistorQueueItem",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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
	tools.putParamValue("bRDLShowDetails",prevState);
	return index;
	}
}
public void pzTemplateRDL_1() {
IUIComponentMetadata pgRDMetadata = null;
IUIComponentMetadata pgSection = null;  
IUIComponentMetadata pgSectionBody = null;  
IUIComponentMetadata pgCells  = null; 
IUIComponentMetadata pyRDDataPageParams = null;
IUIComponent cc = pzAuto.getUIComponent(IUIComponent.ComponentType.RDL);
String pyInstanceId ="";
char mode = tools.getProperty("D_pzUserWorkListByUserId.pxResults").getMode();
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
pgRDMetadata = pzAuto.getUIComponentRuntime().createMetadata();
pgRDMetadata.put("pyProcessChildren","false");
String strLayoutMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
ClipboardPage dummyPage = tools.createPage("Assign-Worklist","NoDataPage");
PRStackFrame itemFrame1 = pega.pushStackFrame("NoResultsPage", null, dummyPage, true, false);
pgRDMetadata.put("noresulttype", "section");
Map<String, Object> RDLNoRowMessageSectionParams = new HashMap<>();
RDLNoRowMessageSectionParams.put("doNotAddToMetadataTree", true);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_52","HomeWorklistNoResults", RDLNoRowMessageSectionParams);
String pyNoDataReference = pzAuto.getUIComponentRuntime().getRuntimeContextTree().getLastAccesedSectionHash();
pgRDMetadata.put("nodatasec", pyNoDataReference);
pega.popStackFrame(itemFrame1, false);
dummyPage.removeFromClipboard();
pgRDMetadata.put("methodnm",strLayoutMethodName);
pgSection = pzAuto.getUIComponentRuntime().createMetadata();
pgSectionBody = pzAuto.getUIComponentRuntime().createMetadata();
pgCells = pzAuto.getUIComponentRuntime().createMetadata();
pgSection.put("class","content    flex  layout-content-default content-default "); 
pgSection.put("liveUI","" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + ""); 
pgRDMetadata.put("isformnavigation","false");
pgRDMetadata.put("rdlnavigationtype","tabkey");
String expressionId = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression;
if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
expressionId = pxUniqueStreamHash+"_53";
expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  "D_pzUserWorkListByUserId.pxResults AddDelete", expressionId, true);
expressionId = expression.getId();
}
ClipboardProperty rdlPageListProp = tools.getProperty("D_pzUserWorkListByUserId.pxResults");
String rdlPageListPropRef = "D_pzUserWorkListByUserId.pxResults";
if(rdlPageListProp != null) {
rdlPageListPropRef = rdlPageListProp.getReference();
}
String rdlRefreshWhenStr = "D_pzUserWorkListByUserId.pxResults AddDelete";
rdlRefreshWhenStr = rdlRefreshWhenStr.replace("D_pzUserWorkListByUserId.pxResults",rdlPageListPropRef);
if(!StringUtils.isBlank(expressionId)) {
	pgRDMetadata.put("pyExpressionId", expressionId);
}
pgRDMetadata.put("nextpg","getNextPage_1");
pzAuto.getUIComponentRuntime().resetServerWhenEnabled(true);
if (pzAuto.getUIComponentRuntime().isTemplateRendering()) {
pgRDMetadata.put("nomoremsgtype", "section");
Map<String, Object> RDLNoMoreDataMessageSectionParams = new HashMap<>();
RDLNoMoreDataMessageSectionParams.put("doNotAddToMetadataTree", true);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_55","pyProgressiveRDLPaginatorShowLess", RDLNoMoreDataMessageSectionParams);
String pyNoMoreDataReference = pzAuto.getUIComponentRuntime().getRuntimeContextTree().getLastAccesedSectionHash();
pgRDMetadata.put("nomoredataref", pyNoMoreDataReference);
} else {
RDLNoDetails_1
();
}
pzAuto.getUIComponentRuntime().resetServerWhenEnabled(false);
pzAuto.getUIComponentRuntime().resetServerWhenEnabled(true);
if (pzAuto.getUIComponentRuntime().isTemplateRendering()) {
Map<String, Object> RDLPaginatorSectionParams = new HashMap<>();
RDLPaginatorSectionParams.put("doNotAddToMetadataTree", true);
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
RDLPaginatorSectionParams.put("packageSection", true);
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_56","pyProgressiveRDLPaginator", RDLPaginatorSectionParams);
String pyRDLPaginatorReference = pzAuto.getUIComponentRuntime().getRuntimeContextTree().getLastAccesedSectionHash();
pgRDMetadata.put("pgsection", pyRDLPaginatorReference);
}
pzAuto.getUIComponentRuntime().resetServerWhenEnabled(false);
pgRDMetadata.put("pyenableswipe","false");
pgRDMetadata.put("rdlpgmode","1");
pgRDMetadata.put("rdlpgsize","3");
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pgSectionBody.put("pageListProp",pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pzUserWorkListByUserId.pxResults").getReference(),"", false).replaceFirst("_pa[0-9]+pz","")); 
} else {
pgSectionBody.put("pageListProp",pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pzUserWorkListByUserId.pxResults").getReference(),"",false)); 
}
pgSectionBody.put("sourcetype","Data Object");
Map map = new HashMap();
Map paramsMap = new HashMap();
map.put("params", paramsMap);
Map<String, String> pyPagination = new HashMap<String, String>();
pyPagination.put("pyStartIndex", "1");
pyPagination.put("pyEndIndex", Integer.toString(3));
map.put("pyPagination", pyPagination);
map.put("pxDataSourceId", pxUniqueStreamHash+"_57");
pgSectionBody.put("datasrcid",pxUniqueStreamHash+"_57");
pyRDDataPageParams = pzAuto.getUIComponentRuntime().createMetadata();
paramsMap.put("WorkGroup", "D_PortalContextGlobal.pyActiveWorkGroup");
pyRDDataPageParams.put("pyName","WorkGroup");
 { String propertyRef="D_PortalContextGlobal.pyActiveWorkGroup";if(propertyRef.startsWith(".")){		propertyRef = tools.getStepPage().getReference() + propertyRef;}
pyRDDataPageParams.put("pyValue","{\"value\":\""+propertyRef+"\",\"isLiteral\":false}"); } 
pgSectionBody.addMetadataInArray("rdparamslst",pyRDDataPageParams);
pyRDDataPageParams = pzAuto.getUIComponentRuntime().createMetadata();
paramsMap.put("UserId", "D_PortalContext.pyLabel");
pyRDDataPageParams.put("pyName","UserId");
 { String propertyRef="D_PortalContext.pyLabel";if(propertyRef.startsWith(".")){		propertyRef = tools.getStepPage().getReference() + propertyRef;}
pyRDDataPageParams.put("pyValue","{\"value\":\""+propertyRef+"\",\"isLiteral\":false}"); } 
pgSectionBody.addMetadataInArray("rdparamslst",pyRDDataPageParams);
pgSectionBody.put("dpname","D_pzUserWorkListByUserId");
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pgRDMetadata.put("generatePath","true");
}
pgSectionBody.addMetadataInArray("cells",pgCells);
pgSection.addMetadataInArray("sectionbody",pgSectionBody);
pgRDMetadata.putMetadata("section",pgSection);
pyInstanceId =String.valueOf(System.currentTimeMillis());
pgRDMetadata.put("uniqueid", "RDL" + pyInstanceId);
pgRDMetadata.put("automationId", "" + pzSection.getLayout().getTestIdIfEnabled("20190206080236048636" ) + "");
cc.addDependentScripts("pzpega_ui_RDLTemplate.js");
cc.addDependentScripts("pzpega_ui_RDLRowTemplate.js");
cc.addAdditionalScripts("rdlincludes","pzpega_ui_rdl.js");
pgRDMetadata.put("rowmethod","GetRDLRow_1");
map.put("pyContext", "D_pzUserWorkListByUserId.pxResults");
cc.beginComponent("RepeatingDynamicLayout",pgRDMetadata,map);
Map<String,String> repeatMap  = null; if(tools.getParameterPage().getParameterValue("pzRepeatProperties")!=null){
repeatMap = (Map<String,String>)tools.getParameterPage().getParameterValue("pzRepeatProperties");
}else {
repeatMap = new HashMap<String,String>();
}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pzUserWorkListByUserId.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""), "RDL" + pyInstanceId);
} else {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pzUserWorkListByUserId.pxResults").getReference(),"", false),pyInstanceId);
}
tools.getParameterPage().putObject("pzRepeatProperties",repeatMap);
ClipboardProperty cpSource = tools.getProperty("D_pzUserWorkListByUserId.pxResults");
boolean bIsSourceEmpty = false;
ClipboardPage itemPage = null;
if(cpSource.size()==0){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
bIsSourceEmpty=true;
ClipboardPage cpParentPage = cpSource.getTopLevelPage();
String dummyPageName = "";
if(tools.isValidDataPage(cpParentPage.getName())){
dummyPageName = "Dummy"+cpParentPage.getName();
}else{
dummyPageName = "DummyD_pzUserWorkListByUserId_pxResults";
}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pzUserWorkListByUserId.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""),"RDL" + pyInstanceId + ":" + dummyPageName);
itemPage = tools.createPage("Assign-Worklist",dummyPageName);
PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
simpleLayoutCell_2(1);
	pega.popStackFrame(itemFrame, false);
} else {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pzUserWorkListByUserId.pxResults").getReference(),"",false),pyInstanceId + ":" + dummyPageName);
}
}else{
if(mode =='L' || mode =='G'){
Iterator itemPages = cpSource.iterator();
int pageCounter = 0;
while(itemPages.hasNext()) {
	pageCounter++;
	itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
	PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
	if(pageCounter == 1) {
	simpleLayoutCell_2(1);
	}
	pega.popStackFrame(itemFrame, false);
}
}}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.remove(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pzUserWorkListByUserId.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""));
} else {
repeatMap.remove(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pzUserWorkListByUserId.pxResults").getReference(),"", false));
}
cc.endComponent();
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
		pzPackageRuntime.packageSection("HomeWorklist",
		tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
		}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
		}
		}
		

public void RepeatingRDLCell_1(String listSource, int listStartIndex, int listEndIndex) {
			String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
			String rptDynamicIdx_prefix = "";
			if(!"".equals(rptDynamicIdx)) rptDynamicIdx_prefix = rptDynamicIdx + "_";
			ClipboardProperty rdlPageListProp = tools.getProperty(listSource);
			int totalRecords = rdlPageListProp.size();
			listEndIndex = (listEndIndex < 0 || listEndIndex > totalRecords) ? totalRecords : listEndIndex;
			if(totalRecords > 0 && listStartIndex > 0 && listStartIndex <= totalRecords){
			for(int i = listStartIndex; i <= listEndIndex; i++){
			ClipboardPage itemPage = rdlPageListProp.getPageValue(i);
			if(itemPage != null){
			PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
			tools.putParamValue("RepeatDynamicIndex", rptDynamicIdx_prefix + i);
			tools.putParamValue("pega_RLindex",rptDynamicIdx_prefix +i);
			tools.putParamValue("expandRL","true");
			int index=simpleLayoutCell_2(i);
	tools.putParamValue("expandRL","false");
			pega.popStackFrame(itemFrame, false);
			}
			}
			}
			}
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionHomeWorklistBBB","",false);
}


public void putRDLDPParams_1() {
	if(tools.getIfPresent("D_PortalContextGlobal.pyActiveWorkGroup") != null)
	tools.putParamValue("WorkGroup",tools.getProperty("D_PortalContextGlobal.pyActiveWorkGroup").getStringValue());
	if(tools.getIfPresent("D_PortalContext.pyLabel") != null)
	tools.putParamValue("UserId",tools.getProperty("D_PortalContext.pyLabel").getStringValue());
	}
	

public void simpleLayout_1() {
		putRDLDPParams_1();
		String strRWPreActivity = "";
		strRWPreActivity = "";
		
		String strDTransform = "";
		strDTransform = "";
		pega_rules_utilities.pzRegisterActivity(tools, "ShowStream");
		tools.putParamValue("listPageSize","3");
		boolean bGenerateNonTemplateRDL = false;
		if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled() && !bGenerateNonTemplateRDL) {
		pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
		HashStringMap whenKeys= new HashStringMap();
		whenKeys.put("pxObjClass","Rule-Obj-When");
		whenKeys.put("pyClassName",tools.getPrimaryPage().getString("pxObjClass"));
		whenKeys.put("pyBlockName","pzIsRDLTemplatized");
		boolean isRDLTemplatized = tools.evaluateWhen(whenKeys);
		if(pzAuto.getUIComponentRuntime().isTemplateRendering() || isRDLTemplatized) {
		pzTemplateRDL_1();
		return;
		}
		} else {
		bGenerateNonTemplateRDL = true;
		tools.putParamValue("bGenerateNonTemplateRDL","true");
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_58");
		}
		int totalRecords=0;
		int pageSize=3, endIndex=0;
		tools.appendString("<div class='rdlWrapperDiv'>");
		boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
		String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
		String bIsGridLayout=tools.getParamValue("bIsGridLayout");
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
		tools.putParamValue("bIsWrapperAdded", "true");
		}
		tools.appendString("<div bSimpleLayout='true' " + "data-repeat-source= '");
		tools.appendString(tools.getProperty("D_pzUserWorkListByUserId.pxResults").getReference()+ "' ");
		tools.appendString(" " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "  class=' flex content   layout-content-default content-default   progressive-useraction' ");
		String strMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
		ClipboardProperty rdlPageListProperty = tools.getProperty("D_pzUserWorkListByUserId.pxResults");
		String rdlPageListPropRef = "D_pzUserWorkListByUserId.pxResults";
		if(rdlPageListProperty != null) {
		rdlPageListPropRef = rdlPageListProperty.getReference();
		}
		String rdlRefreshWhenStr = "D_pzUserWorkListByUserId.pxResults AddDelete";
		rdlRefreshWhenStr = rdlRefreshWhenStr.replace("D_pzUserWorkListByUserId.pxResults",rdlPageListPropRef);
		tools.appendString(" data-refresh=\"true\" data-methodName='" + strMethodName + "' data-rowmethodname='GetRDLRow_1' ");
try {
tools.appendString("RWP=\".pxResults\" RW=\"");
tools.appendString(rdlRefreshWhenStr);
tools.appendString("\"");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("20190206080236048636" ) + " ");
		tools.appendString(">");
		int index = 1;
		tools.putParamValue("bIsRDL","true");
		String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
		String rptDynamicIdx_prefix = "";
		if(!"".equals(rptDynamicIdx)) rptDynamicIdx_prefix = rptDynamicIdx + "_";
		ClipboardProperty rdlPageListProp =null;
		if (tools.getParamValue("pyPegaDesignMode").equals("true")) { return;}
		rdlPageListProp = tools.getProperty("D_pzUserWorkListByUserId.pxResults");
		totalRecords = rdlPageListProp.size();
		Iterator itemPages = rdlPageListProp.iterator();
		if(totalRecords > 0){
		int startIndex = 1; 
		endIndex = (totalRecords < pageSize) ? totalRecords : pageSize;
		RepeatingRDLCell_1(rdlPageListProp.getReference(),startIndex, endIndex);
		}
		tools.putParamValue("RepeatDynamicIndex", rptDynamicIdx);
		tools.putParamValue("bIsRDL","");
		tools.putParamValue("pega_RLindex","");
		tools.appendString("</div>");
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("</div></div>");
		tools.putParamValue("bIsWrapperAdded", "false");
		}
		if(totalRecords >= pageSize){
		tools.appendString("<div class='RDLPaginator' data-methodname='RepeatingRDLCell_1'");
		tools.appendString("data-pagination-config='{\"listPaginationMode\":\"Progressive\",\"listPageSize\":\""+pageSize+"\",\"listStartIndex\":\""+(endIndex+1)+"\"}'");
		tools.appendString(">");
		RDLPaginator_1
		();
		tools.appendString("</div>");
		}
		tools.appendString("</div>");
		if(bGenerateNonTemplateRDL) {
		tools.getParameterPage().remove("bGenerateNonTemplateRDL");
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		}
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
	String paramName = "EXPANDEDSubSectionHomeWorklistBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o2!= rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq", pxUniqueStreamHash+"_59");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_59");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_1();
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
if(pzAuto.handleEvaluateWhen(" o2&& o2!= rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq","D_PortalContext.pyIsBasket!=\'true\' && D_PortalContext.pyLabel!=\'\'", "layout", "visible" )) {pzSetExpandParam_4();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_6();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
putRDLDPParams_1();
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_4() {
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
	secInfo.put("preserveParamState",true);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_47","pyWorkListWidgetHeader", secInfo);
}


public void sectionBodyIncludeInCell_2() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	
	
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
	String sectionName = "pyWorkListWidgetHeader"; 
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
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionCellHomeWorklist676","",false);
}
public void pzLayout_1() {
pzSetExpandParam_3();
pzLayoutBodyWrapper_4();
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",true);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_44","pyWorkListWidgetHeader", secInfo);
}


public void sectionBodyIncludeInCell_1() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	
	
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
	String sectionName = "pyWorkListWidgetHeader"; 
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


public int simpleLayoutCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pyWorkListWidgetHeader",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-bottom-spacing    " + pzSection.getCustomStyle(false, "","margin-b-2x","margin-b-2x")  + " flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_1();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
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
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","remove-bottom-spacing flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","margin-b-2x");
	pgCells.put("customRWStyles","margin-b-2x");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pyWorkListWidgetHeader",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_1();
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


public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2!= rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq","D_PortalContext.pyIsBasket!=\'true\' && D_PortalContext.pyLabel!=\'\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-bottom-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_3();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-bottom-spacing flex flex-row");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2!= rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq",pxUniqueStreamHash+"_61");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_61");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","D_PortalContext.pyIsBasket!='true' && D_PortalContext.pyLabel!=''");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Data-Portal");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_61");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2!= rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq", pxUniqueStreamHash+"_61"); 
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


public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq","D_PortalContext.pyIsBasket==\'true\' && D_PortalContext.pyLabel!=\'\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-bottom-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_5();
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
	pgCells.put("partialClass","remove-bottom-spacing flex flex-row");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq",pxUniqueStreamHash+"_75");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_75");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","D_PortalContext.pyIsBasket=='true' && D_PortalContext.pyLabel!=''");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Data-Portal");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_75");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq", pxUniqueStreamHash+"_75"); 
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
pzSection.getLayout().setExpandParam("SubSectionHomeWorklistBB","",false);
}


public void simpleLayout_3() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash43 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash43 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash43 != null && !"".equals(spxUniqueStreamHash43)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash43,pxUniqueStreamHash+"_43");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201911190610030876428") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + "flex  content  layout-content-simple_list content-simple_list " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash43 != null && !"".equals(spxUniqueStreamHash43)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_43");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","simple_list");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isDLChild","true");
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
		index=simpleLayoutCell_3(index);
	}else{
		index=simpleLayoutTemplateCell_2(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_5(index);
	}else{
		index=simpleLayoutTemplateCell_3(index);
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
	if(!StringUtils.isBlank(expressionId)) {
		metadataPage.put("pyExpressionId",expressionId);
	}
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionHomeWorklistBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-default");
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2!= pxparam.bRenderAsTable cqtrue", pxUniqueStreamHash+"_76");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Flexbox");
	metadataPage.put("contCustom","padding-tb-0");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_76");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_3();
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
if(pzAuto.handleEvaluateWhen(" o2!= pxparam.bRenderAsTable cqtrue","param.bRenderAsTable != \'true\'", "layout", "visible" )) {pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_9();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3();
tools.putParamValue("pyInlineStyleSec","");
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


public int simpleLayoutCell_6( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2!= pxparam.bRenderAsTable cqtrue","param.bRenderAsTable != \'true\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_6();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2!= pxparam.bRenderAsTable cqtrue",pxUniqueStreamHash+"_78");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_78");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.bRenderAsTable != 'true'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Data-Portal");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_78");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2!= pxparam.bRenderAsTable cqtrue", pxUniqueStreamHash+"_78"); 
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


public int simpleLayoutCell_7( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2&& o2== pxparam.bRenderAsTable cqtrue o2!= rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq","param.bRenderAsTable = \'true\' && D_PortalContext.pyIsBasket!=\'true\' && D_PortalContext.pyLabel!=\'\'","cell", "visible" )) {
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_7();
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
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2&& o2== pxparam.bRenderAsTable cqtrue o2!= rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq",pxUniqueStreamHash+"_110");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_110");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.bRenderAsTable = 'true' && D_PortalContext.pyIsBasket!='true' && D_PortalContext.pyLabel!=''");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Data-Portal");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_110");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2&& o2== pxparam.bRenderAsTable cqtrue o2!= rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq", pxUniqueStreamHash+"_110"); 
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


public int simpleLayoutCell_8( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2&& o2== pxparam.bRenderAsTable cqtrue o2== rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq","param.bRenderAsTable = \'true\' && D_PortalContext.pyIsBasket==\'true\' && D_PortalContext.pyLabel!=\'\'","cell", "visible" )) {
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_8();
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
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2&& o2== pxparam.bRenderAsTable cqtrue o2== rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq",pxUniqueStreamHash+"_136");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_136");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.bRenderAsTable = 'true' && D_PortalContext.pyIsBasket=='true' && D_PortalContext.pyLabel!=''");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Data-Portal");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_136");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2&& o2== pxparam.bRenderAsTable cqtrue o2== rxD_PortalContext.pyIsBasket cqtrue o2!= rxD_PortalContext.pyLabel cq", pxUniqueStreamHash+"_136"); 
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
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionHomeWorklistB","",false);
}


public void simpleLayout_4() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash41 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash41 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash41 != null && !"".equals(spxUniqueStreamHash41)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash41,pxUniqueStreamHash+"_41");
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
	refreshAttributes += " RWP=\".pxUpdateDateTime\" RW=\"D_PortalContext.pxUpdateDateTime Changes\" ";
	
	String strDTransform = "";
	strDTransform = "";
	try{
		if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
			com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking("D_PortalContext.pxUpdateDateTime"), -1);
		}
	}catch(Exception e){}
	IUIComponent cc_dl = null;
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("202006091432210525478") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  layout-content-stacked content-stacked " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		expressionId = pxUniqueStreamHash+"_42";
		try{
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  "D_PortalContext.pxUpdateDateTime Changes", expressionId);
		expressionId = expression.getId();
		}
		catch(ClassCastException e){
		expressionId = "";
		}
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash41 != null && !"".equals(spxUniqueStreamHash41)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_41");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","stacked");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("clear","false");
		pg_dlmeta.put("lMode","SimpleDiv");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_6(index);
	}else{
		index=simpleLayoutTemplateCell_4(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_7(index);
	}else{
		index=simpleLayoutTemplateCell_5(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_8(index);
	}else{
		index=simpleLayoutTemplateCell_6(index);
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
	public void pzLayoutContainer_6() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionHomeWorklistB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","SimpleDiv");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_6();
	containerComponent.endComponent();
	}
public void pzLayout_9() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_12();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_6();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_3() {

if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_25")){pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_40")){pzLayoutBodyWrapper_2();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_2() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();gridDoPartialRefresh_2();gridLastRow_2();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxButton_4() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_39")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_86'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("202007011657090787668") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
	actionRequest.registerFixedParameter("action", "openAssignment");
	pzAuto.registerActionRequest(actionRequest);
	tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);	tools.appendString("\"]");
	tools.appendString("],[\"openAssignment\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");	tools.appendString("\",\"");

		tools.appendFormatted("e5400b44-d889-45d7-aa99-746524c0616e",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsOfflineEnabled")+"~#");	tools.appendString("\",{\"target\":\"primary\",\"pyReloadAlways\":\"false\"}]");
	}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsOfflineEnabled"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='Strong pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Go".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Go",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_22() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)")); tools.appendString("headers='a6'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");if(pzAuto.handleEvaluateWhen(" axpzCanPerformAssignment","pzCanPerformAssignment", "cell", "visible" )) {pxButton_4(); } 
									tools.appendString("</DIV>"); } else { if(pzAuto.handleEvaluateWhen(" axpzCanPerformAssignment","pzCanPerformAssignment", "cell", "visible" )) {pxButton_4(); } }
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_17(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_36")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&date","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_37")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_38")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void repeatingDataCell_21() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxDeadlineTime", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)")); tools.appendString("headers='a5'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_17(".pxDeadlineTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_17(".pxDeadlineTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","84"};oCellRuntimeParamsMap.put("84||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("84||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","R","true","0","","","Decimal","true","83"};oCellRuntimeParamsMap.put("83||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("83||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","82"};oCellRuntimeParamsMap.put("82||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("82||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}


public void pxLink_6() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_35")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_81'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pxRefObjectInsName"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pxRefObjectInsName").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20190208082033073432148") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
	actionRequest.registerFixedParameter("action", "openWorkByHandle");
	pzAuto.registerActionRequest(actionRequest);
	tools.appendString("[\"setMobileTransition\",[\"");
String className = "";className ="Assign-Worklist";if("".equals(className) || className==null){className ="";}if((("".equals(className) || className==null) || (!pega_rules_string.isLiteral(className))) && (tools != null && tools.getStepPage() != null)){className = tools.getStepPage().getString("pxObjClass");}if("".equals(className) || className==null){className = "@baseclass";}ArrayList skeletonList = (ArrayList)tools.getParameterPage().getObject("skeletonList");if(skeletonList != null && !(skeletonList.contains("pyOpenWorkSkeleton~$~"+className+"~$~false~$~"))){skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);} else if(skeletonList == null){skeletonList = new ArrayList();skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);}
		tools.appendFormatted("pega.SKELETON",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~pyOpenWorkSkeleton",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~"+className, StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~false",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~",StreamBuilder.FMT_NORMAL);	tools.appendString("\"]");
	tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxRefObjectKey")+"~#");	tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"false\",\"false\",{\"target\":\"primary\"}]");
	}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxRefObjectKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='Simple");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pxRefObjectInsName").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Task in");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_20() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='primary'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pxRefObjectInsName", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:38px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_6();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_6();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxButton_3() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_30")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_86'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("202007011657090787668") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
	actionRequest.registerFixedParameter("action", "openAssignment");
	pzAuto.registerActionRequest(actionRequest);
	tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);	tools.appendString("\"]");
	tools.appendString("],[\"openAssignment\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");	tools.appendString("\",\"");

		tools.appendFormatted("c0df69d3-1224-401a-904c-303aff1c5a8f",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsOfflineEnabled")+"~#");	tools.appendString("\",{\"target\":\"primary\",\"pyReloadAlways\":\"false\"}]");
	}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsOfflineEnabled"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='Strong pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Go".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Go",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_19() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)")); tools.appendString("headers='a6'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");if(pzAuto.handleEvaluateWhen(" axpzCanPerformAssignment","pzCanPerformAssignment", "cell", "visible" )) {pxButton_3(); } 
									tools.appendString("</DIV>"); } else { if(pzAuto.handleEvaluateWhen(" axpzCanPerformAssignment","pzCanPerformAssignment", "cell", "visible" )) {pxButton_3(); } }
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_15(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_27")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&date","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_28")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_29")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void repeatingDataCell_18() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxDeadlineTime", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)")); tools.appendString("headers='a5'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_15(".pxDeadlineTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_15(".pxDeadlineTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_14() {String key="84||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","84"};oCellRuntimeParamsMap.put("84||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("84||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}
public void repeatingDataCell_17() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Status"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pyAssignmentStatus", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)")); tools.appendString("headers='a4'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_14();
									tools.appendString("</DIV>"); } else { pxDisplayText_14();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_13() {String key="83||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","R","true","0","","","Decimal","true","83"};oCellRuntimeParamsMap.put("83||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("83||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)");}
public void repeatingDataCell_16() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxUrgencyAssign", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_13();
									tools.appendString("</DIV>"); } else { pxDisplayText_13();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_12() {String key="82||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","82"};oCellRuntimeParamsMap.put("82||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("82||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
public void repeatingDataCell_15() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Description"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pyLabel", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_12();
									tools.appendString("</DIV>"); } else { pxDisplayText_12();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxLink_4() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_26")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_81'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pxRefObjectInsName"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pxRefObjectInsName").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20190208082033073432148") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
	actionRequest.registerFixedParameter("action", "openWorkByHandle");
	pzAuto.registerActionRequest(actionRequest);
	tools.appendString("[\"setMobileTransition\",[\"");
String className = "";className ="Assign-Worklist";if("".equals(className) || className==null){className ="";}if((("".equals(className) || className==null) || (!pega_rules_string.isLiteral(className))) && (tools != null && tools.getStepPage() != null)){className = tools.getStepPage().getString("pxObjClass");}if("".equals(className) || className==null){className = "@baseclass";}ArrayList skeletonList = (ArrayList)tools.getParameterPage().getObject("skeletonList");if(skeletonList != null && !(skeletonList.contains("pyOpenWorkSkeleton~$~"+className+"~$~false~$~"))){skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);} else if(skeletonList == null){skeletonList = new ArrayList();skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);}
		tools.appendFormatted("pega.SKELETON",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~pyOpenWorkSkeleton",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~"+className, StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~false",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~",StreamBuilder.FMT_NORMAL);	tools.appendString("\"]");
	tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxRefObjectKey")+"~#");	tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"false\",\"false\",{\"target\":\"primary\"}]");
	}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxRefObjectKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='Simple");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pxRefObjectInsName").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Task in");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_14() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='primary'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pxRefObjectInsName", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:38px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_4();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_4();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxLink_5() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_31")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_81'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pxRefObjectInsName"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pxRefObjectInsName").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20190208082033073432148") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
			String repeatIndx = "";tools.appendString(" class='Simple");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pxRefObjectInsName").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
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
		metadata.put("cellInfo", "Task in");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","82"};oCellRuntimeParamsMap.put("82||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("82||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","R","true","0","","","Decimal","true","83"};oCellRuntimeParamsMap.put("83||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("83||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_WorkBasket.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","84"};oCellRuntimeParamsMap.put("84||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("84||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}


public void pxDisplayText_16(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_32")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&date","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_33")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_34")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_1();gridDoPartialRefresh_1();gridLastRow_1();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxButton_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_24")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_48'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("202007011657090787668") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
	actionRequest.registerFixedParameter("action", "openAssignment");
	pzAuto.registerActionRequest(actionRequest);
	tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);	tools.appendString("\"]");
	tools.appendString("],[\"openAssignment\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");	tools.appendString("\",\"");

		tools.appendFormatted("bc9df9b2-4cb1-4c38-b40c-002885dab537",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsOfflineEnabled")+"~#");	tools.appendString("\",{\"target\":\"primary\",\"pyReloadAlways\":\"false\"}]");
	}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsOfflineEnabled"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='Strong pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Go".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Go",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_13() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(9)")); tools.appendString("headers='a9'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");if(pzAuto.handleEvaluateWhen(" axpzCanPerformAssignment","pzCanPerformAssignment", "cell", "visible" )) {pxButton_2(); } 
									tools.appendString("</DIV>"); } else { if(pzAuto.handleEvaluateWhen(" axpzCanPerformAssignment","pzCanPerformAssignment", "cell", "visible" )) {pxButton_2(); } }
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","true","128","","","Text","true","47"};oCellRuntimeParamsMap.put("47||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("47||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(8)");}


public void pxDisplayText_11(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_21")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_22")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_23")){inclFormattedVal_4(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void repeatingDataCell_12() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxGoalTime", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(7)")); tools.appendString("headers='a7'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_11(".pxGoalTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_11(".pxGoalTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","255","","","Text","true","45"};oCellRuntimeParamsMap.put("45||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("45||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)");}


public void pxDisplayText_10(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_18")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&date","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_19")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_20")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void repeatingDataCell_11() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxDeadlineTime", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)")); tools.appendString("headers='a5'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_10(".pxDeadlineTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_10(".pxDeadlineTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","43"};oCellRuntimeParamsMap.put("43||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("43||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","R","true","0","","","Decimal","true","42"};oCellRuntimeParamsMap.put("42||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("42||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","41"};oCellRuntimeParamsMap.put("41||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("41||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}


public void pxLink_3() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_17")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_40'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pxRefObjectInsName"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pxRefObjectInsName").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20190208082033073432148") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
	actionRequest.registerFixedParameter("action", "openWorkByHandle");
	pzAuto.registerActionRequest(actionRequest);
	tools.appendString("[\"setMobileTransition\",[\"");
String className = "";className ="Assign-Worklist";if("".equals(className) || className==null){className ="";}if((("".equals(className) || className==null) || (!pega_rules_string.isLiteral(className))) && (tools != null && tools.getStepPage() != null)){className = tools.getStepPage().getString("pxObjClass");}if("".equals(className) || className==null){className = "@baseclass";}ArrayList skeletonList = (ArrayList)tools.getParameterPage().getObject("skeletonList");if(skeletonList != null && !(skeletonList.contains("pyOpenWorkSkeleton~$~"+className+"~$~false~$~"))){skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);} else if(skeletonList == null){skeletonList = new ArrayList();skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);}
		tools.appendFormatted("pega.SKELETON",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~pyOpenWorkSkeleton",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~"+className, StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~false",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~",StreamBuilder.FMT_NORMAL);	tools.appendString("\"]");
	tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxRefObjectKey")+"~#");	tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"false\",\"false\",{\"target\":\"primary\"}]");
	}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxRefObjectKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='Simple");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pxRefObjectInsName").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Task in");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_10() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='primary'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pxRefObjectInsName", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:38px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_3();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_3();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxButton_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_9")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_48'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("202007011657090787668") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
	actionRequest.registerFixedParameter("action", "openAssignment");
	pzAuto.registerActionRequest(actionRequest);
	tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);	tools.appendString("\"]");
	tools.appendString("],[\"openAssignment\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");	tools.appendString("\",\"");

		tools.appendFormatted("9057dd47-4ef4-4117-953b-ce4b16c1f294",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsOfflineEnabled")+"~#");	tools.appendString("\",{\"target\":\"primary\",\"pyReloadAlways\":\"false\"}]");
	}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsOfflineEnabled"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='Strong pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Go".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Go",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_9() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(9)")); tools.appendString("headers='a9'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");if(pzAuto.handleEvaluateWhen(" axpzCanPerformAssignment","pzCanPerformAssignment", "cell", "visible" )) {pxButton_1(); } 
									tools.appendString("</DIV>"); } else { if(pzAuto.handleEvaluateWhen(" axpzCanPerformAssignment","pzCanPerformAssignment", "cell", "visible" )) {pxButton_1(); } }
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_7() {String key="47||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","true","128","","","Text","true","47"};oCellRuntimeParamsMap.put("47||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("47||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(8)");}
public void repeatingDataCell_8() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxTaskLabel", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(8)")); tools.appendString("headers='a8'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_7();
									tools.appendString("</DIV>"); } else { pxDisplayText_7();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void inclFormattedVal_4(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		 tools.putParamValue("pyDateTimeHourFormat","false");
		 tools.putParamValue("pyDateTimeSecondCutoff", "0");
		 tools.putParamValue("pyFormatType", "datetime");
		String formattedValue = pega_uiengine_formatter.pxFormatDateTime((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"DateTime-Frame","localizevalue",true);
		if(pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" )){
			StringBuffer showValue = new StringBuffer(formattedValue);
			int length = formattedValue.length();
			for(int i = 0; i < length; i++) {
				showValue.setCharAt(i,'●');
			}
		formattedValue = showValue.toString();
		}
		tools.appendString(formattedValue);
		 tools.putParamValue("pyDateTimeHourFormat","");
		 tools.putParamValue("pyFormatType", "");
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}
public void inclFormattedVal_3(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		 tools.putParamValue("pyDateTimeHourFormat","false");
		 tools.putParamValue("pyDateTimeSecondCutoff", "0");
		 tools.putParamValue("pyFormatType", "datetime");
		String formattedValue = pega_uiengine_formatter.pxFormatDateTime((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"DateTime-Frame","localizevalue",true);
		if(pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" )){
			StringBuffer showValue = new StringBuffer(formattedValue);
			int length = formattedValue.length();
			for(int i = 0; i < length; i++) {
				showValue.setCharAt(i,'●');
			}
		formattedValue = showValue.toString();
		}
		tools.appendString(formattedValue);
		 tools.putParamValue("pyDateTimeHourFormat","");
		 tools.putParamValue("pyFormatType", "");
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}


public void pxDisplayText_6(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_8")){inclFormattedVal_4(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void repeatingDataCell_7() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxGoalTime", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(7)")); tools.appendString("headers='a7'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_6(".pxGoalTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_6(".pxGoalTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_5() {String key="45||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","255","","","Text","true","45"};oCellRuntimeParamsMap.put("45||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("45||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)");}
public void repeatingDataCell_6() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pyInstructions", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)")); tools.appendString("headers='a6'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_5();
									tools.appendString("</DIV>"); } else { pxDisplayText_5();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void inclFormattedVal_2(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		 tools.putParamValue("pyDateTimeHourFormat","");
		 tools.putParamValue("pyDateTimeSecondCutoff", "0");
		 tools.putParamValue("pyFormatType", "date");
		String formattedValue = pega_uiengine_formatter.pxFormatDateTime((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"DateTime-Frame","localizevalue",true);
		if(pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" )){
			StringBuffer showValue = new StringBuffer(formattedValue);
			int length = formattedValue.length();
			for(int i = 0; i < length; i++) {
				showValue.setCharAt(i,'●');
			}
		formattedValue = showValue.toString();
		}
		tools.appendString(formattedValue);
		 tools.putParamValue("pyDateTimeHourFormat","");
		 tools.putParamValue("pyFormatType", "");
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}
public void inclFormattedVal_1(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		 tools.putParamValue("pyDateTimeHourFormat","");
		 tools.putParamValue("pyDateTimeSecondCutoff", "0");
		 tools.putParamValue("pyFormatType", "date");
		String formattedValue = pega_uiengine_formatter.pxFormatDateTime((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"DateTime-Frame","localizevalue",true);
		if(pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" )){
			StringBuffer showValue = new StringBuffer(formattedValue);
			int length = formattedValue.length();
			for(int i = 0; i < length; i++) {
				showValue.setCharAt(i,'●');
			}
		formattedValue = showValue.toString();
		}
		tools.appendString(formattedValue);
		 tools.putParamValue("pyDateTimeHourFormat","");
		 tools.putParamValue("pyFormatType", "");
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
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


public void pxDisplayText_4(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&date","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void repeatingDataCell_5() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxDeadlineTime", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)")); tools.appendString("headers='a5'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_4(".pxDeadlineTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_4(".pxDeadlineTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_3() {String key="43||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","43"};oCellRuntimeParamsMap.put("43||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("43||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}
public void repeatingDataCell_4() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Status"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pyAssignmentStatus", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)")); tools.appendString("headers='a4'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_3();
									tools.appendString("</DIV>"); } else { pxDisplayText_3();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_2() {String key="42||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","R","true","0","","","Decimal","true","42"};oCellRuntimeParamsMap.put("42||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("42||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)");}
public void repeatingDataCell_3() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='other'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxUrgencyAssign", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_2();
									tools.appendString("</DIV>"); } else { pxDisplayText_2();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_1() {String key="41||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","41"};oCellRuntimeParamsMap.put("41||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("41||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
public void repeatingDataCell_2() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Description"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pyLabel", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:36px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_1();
									tools.appendString("</DIV>"); } else { pxDisplayText_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
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


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_40'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pxRefObjectInsName"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pxRefObjectInsName").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20190208082033073432148") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
	actionRequest.registerFixedParameter("action", "openWorkByHandle");
	pzAuto.registerActionRequest(actionRequest);
	tools.appendString("[\"setMobileTransition\",[\"");
String className = "";className ="Assign-Worklist";if("".equals(className) || className==null){className ="";}if((("".equals(className) || className==null) || (!pega_rules_string.isLiteral(className))) && (tools != null && tools.getStepPage() != null)){className = tools.getStepPage().getString("pxObjClass");}if("".equals(className) || className==null){className = "@baseclass";}ArrayList skeletonList = (ArrayList)tools.getParameterPage().getObject("skeletonList");if(skeletonList != null && !(skeletonList.contains("pyOpenWorkSkeleton~$~"+className+"~$~false~$~"))){skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);} else if(skeletonList == null){skeletonList = new ArrayList();skeletonList.add("pyOpenWorkSkeleton~$~"+className+"~$~false~$~");tools.getParameterPage().putObject("skeletonList", skeletonList);}
		tools.appendFormatted("pega.SKELETON",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~pyOpenWorkSkeleton",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~"+className, StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~false",StreamBuilder.FMT_NORMAL);
		tools.appendFormatted("~$~",StreamBuilder.FMT_NORMAL);	tools.appendString("\"]");
	tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxRefObjectKey")+"~#");	tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"false\",\"false\",{\"target\":\"primary\"}]");
	}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxRefObjectKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='Simple");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pxRefObjectInsName").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Task in");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_1() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='primary'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pxRefObjectInsName", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:38px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_1();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_1();}
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
}


public void pxLink_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_10")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='HomeWorklist_"+ referenceString+ "_40'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pxRefObjectInsName"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pxRefObjectInsName").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20190208082033073432148") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
			String repeatIndx = "";tools.appendString(" class='Simple");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pxRefObjectInsName").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
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
		metadata.put("cellInfo", "Task in");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","41"};oCellRuntimeParamsMap.put("41||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("41||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","R","true","0","","","Decimal","true","42"};oCellRuntimeParamsMap.put("42||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("42||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","43"};oCellRuntimeParamsMap.put("43||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("43||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}


public void pxDisplayText_8(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_11")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&date","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_12")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_13")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","255","","","Text","true","45"};oCellRuntimeParamsMap.put("45||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("45||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)");}


public void pxDisplayText_9(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_14")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_15")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("202007011657090786888") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_16")){inclFormattedVal_4(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzUserWorkListByUserId.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","true","128","","","Text","true","47"};oCellRuntimeParamsMap.put("47||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",paramValues);oControlPathsMap.put("47||RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(8)");}


public void D_pzUserWorkListByUserId_pxResults_1() {
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

					if(tools.getParamValue("partialTrigger").equals("appendToD_pzUserWorkListByUserId.pxResults1")|| tools.getParamValue("partialTrigger").equals("editRowD_pzUserWorkListByUserId.pxResults1") ){

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

					ClipboardProperty pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

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

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_pzUserWorkListByUserId.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 }}catch(Exception e){}

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_pzUserWorkListByUserId.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_pzUserWorkListByUserId.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_pzUserWorkListByUserId.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("202007011657090783567-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					 repeatingDataCell_1(); 

					activeName = tools.getActiveName();  repeatingDataCell_2(); 

					activeName = tools.getActiveName();  repeatingDataCell_3(); 

					activeName = tools.getActiveName();  repeatingDataCell_4(); 

					activeName = tools.getActiveName();  repeatingDataCell_5(); 

					activeName = tools.getActiveName();  repeatingDataCell_6(); 

					activeName = tools.getActiveName();  repeatingDataCell_7(); 

					activeName = tools.getActiveName();  repeatingDataCell_8(); 

					activeName = tools.getActiveName();  repeatingDataCell_9(); 

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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdropD_pzUserWorkListByUserId.pxResults1")) {

					
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

					pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					
		 String strSizeBD= tools.getParamValue("PLSizeBeforeDelete");

					
		 if(!strSizeBD.equals("")){

					
		 int iSizeBeforeDelete = Integer.parseInt(strSizeBD);

					
		 if(iSizeBeforeDelete == pageListProp.size()+1) {

					tools.appendString("\n\t\t\t PEGA_GRID_DELETE||DELETE_SUCCESS||");

					
		 } }

					
			tools.putParamValue("partialRefresh", "false");

					
	 }

					
  } 

					
 if(tools.getParamValue("partialTrigger").equals("filterpopupD_pzUserWorkListByUserId.pxResults1")) { 

					
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

					
			 if(subScriptForColumn.equals("pxRefObjectInsName1") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxLink_2();

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pyLabel2") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_1();

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pxUrgencyAssign3") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_2();

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pyAssignmentStatus4") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_3();

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pxDeadlineTime5") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_8(".pxDeadlineTime",0,"","","Date Time");

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pyInstructions6") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_5();

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pxGoalTime7") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_9(".pxGoalTime",0,"","","Date Time");

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pxTaskLabel8") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_7();

					
									 pega.popStackFrame(frame, false); } 

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendToD_pzUserWorkListByUserId.pxResults1") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					
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

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_pzUserWorkListByUserId.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_pzUserWorkListByUserId.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_pzUserWorkListByUserId.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_pzUserWorkListByUserId.pxResults"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("202007011657090783567-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					 repeatingDataCell_10(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_2(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_3(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_4(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_11(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_6(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_12(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_8(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_13(); 

					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
						 tools.putParamValue("expandRL","false");

					
					
									  pega.popStackFrame(frame_3, false); 

					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendToD_WorkBasket.pxResults1")|| tools.getParamValue("partialTrigger").equals("editRowD_WorkBasket.pxResults1") ){

					
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

					
					ClipboardProperty pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					
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

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_WorkBasket.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
 }}catch(Exception e){}

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_WorkBasket.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_WorkBasket.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_WorkBasket.pxResults"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("202007011657090783567-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					 repeatingDataCell_14(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_15(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_16(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_17(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_18(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_19(); 

					
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

					
					
	 if(tools.getParamValue("partialTrigger").equals("dragdropD_WorkBasket.pxResults1")) {

					
					
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

					
					pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					
					
		 String strSizeBD= tools.getParamValue("PLSizeBeforeDelete");

					
					
		 if(!strSizeBD.equals("")){

					
					
		 int iSizeBeforeDelete = Integer.parseInt(strSizeBD);

					
					
		 if(iSizeBeforeDelete == pageListProp.size()+1) {

					
					tools.appendString("\n\t\t\t PEGA_GRID_DELETE||DELETE_SUCCESS||");

					
					
		 } }

					
					
			tools.putParamValue("partialRefresh", "false");

					
					
	 }

					
					
  } 

					
					
 if(tools.getParamValue("partialTrigger").equals("filterpopupD_WorkBasket.pxResults1")) { 

					
					
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

					
					
			 if(subScriptForColumn.equals("pxRefObjectInsName1") && strCellType.equals("static")) { 

					
					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					
					pxLink_5();

					
					
									 pega.popStackFrame(frame, false); } 

					
					
			 } 

					
					
			 if(subScriptForColumn.equals("pyLabel2") && strCellType.equals("static")) { 

					
					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					
					pxDisplayText_12();

					
					
									 pega.popStackFrame(frame, false); } 

					
					
			 } 

					
					
			 if(subScriptForColumn.equals("pxUrgencyAssign3") && strCellType.equals("static")) { 

					
					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					
					pxDisplayText_13();

					
					
									 pega.popStackFrame(frame, false); } 

					
					
			 } 

					
					
			 if(subScriptForColumn.equals("pyAssignmentStatus4") && strCellType.equals("static")) { 

					
					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					
					pxDisplayText_14();

					
					
									 pega.popStackFrame(frame, false); } 

					
					
			 } 

					
					
			 if(subScriptForColumn.equals("pxDeadlineTime5") && strCellType.equals("static")) { 

					
					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					
					pxDisplayText_16(".pxDeadlineTime",0,"","","Date Time");

					
					
									 pega.popStackFrame(frame, false); } 

					
					
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

					
					
					if(tools.getParamValue("partialTrigger").equals("appendToD_WorkBasket.pxResults1") ){

					
					
					tools.putParamValue("partialRefresh", "false");

					
					
					if(tools instanceof StreamBuilderToolKit) {

					
					
					ClipboardProperty pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					
					
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

					
					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_WorkBasket.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					gridOpenActionIncl_1();

					
					
					tools.appendString(" id='");

					
					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					
					{

					
					
					String tempTestID = "";

					
					
					String rowTestID = "R";

					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_WorkBasket.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_WorkBasket.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					String strEntryHandlePLProp = "";

					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_WorkBasket.pxResults"); } catch (Exception ex) { }

					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					}

					
					
					}

					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("202007011657090783567-" + rowTestID) + " ");

					
					
					}

					
					
					tools.appendString(" PL_INDEX = '");

					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					
					 repeatingDataCell_20(); 

					
					
					activeName = tools.getActiveName();  repeatingDataCell_15(); 

					
					
					activeName = tools.getActiveName();  repeatingDataCell_16(); 

					
					
					activeName = tools.getActiveName();  repeatingDataCell_17(); 

					
					
					activeName = tools.getActiveName();  repeatingDataCell_21(); 

					
					
					activeName = tools.getActiveName();  repeatingDataCell_22(); 

					
					
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
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Data-Portal");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "HomeWorklist");
	oStreamProperties_1.put("pyRuleSetVersion", "04-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("RepeatingRDLCell_2", new String[][] { {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}});
pzExternalMethodMapping.put("RepeatingRDLCell_1", new String[][] { {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}});
pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("gridTemplateSwitchPersonalization_1", new String[][] {});
pzExternalMethodMapping.put("gridTemplatePartial_2", new String[][] {});
pzExternalMethodMapping.put("generateGridCellModes_1", new String[][] { {"strGridMetadataPage", "String", ""}});
pzExternalMethodMapping.put("gridTemplateSwitchPersonalization_2", new String[][] {});
pzExternalMethodMapping.put("pzLayout_7", new String[][] {});
pzExternalMethodMapping.put("gridTemplatePartial_1", new String[][] {});
pzExternalMethodMapping.put("generateGridCellModes_2", new String[][] { {"strGridMetadataPage", "String", ""}});
pzExternalMethodMapping.put("GetRDLRow_1", new String[][] { {"listSource", "String", ""},  {"index", "int", "0"}});
pzExternalMethodMapping.put("GetRDLRow_2", new String[][] { {"listSource", "String", ""},  {"index", "int", "0"}});
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("getNextPage_2", new String[][] { {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}});
pzExternalMethodMapping.put("simpleLayout_4", new String[][] {});
pzExternalMethodMapping.put("pzLayout_8", new String[][] {});
pzExternalMethodMapping.put("getNextPage_1", new String[][] { {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION DATA-PORTAL HOMEWORKLIST #20210506T204027.491 GMT", "Data-Portal HomeWorklist", "Theme-Cosmos", "04-01-01", "20210908T115501.643 GMT");
}
