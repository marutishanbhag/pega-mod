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
 * Builds JSP stream FINDWORKGADGET.
 */
public class ra_stream_findworkgadget_536ea341744b6f867120b1ec264136f2 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.FindWorkGadget.Stream");
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
	public ra_stream_findworkgadget_536ea341744b6f867120b1ec264136f2(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "fdff52ea101d4fdb386d48f0950fdad1463fcc81";
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
/* Instance RULE-HTML-PROPERTY FINDWORKGADGET #20200706T115109.788 GMT	Pega-EndUserUI:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY FINDWORKGADGET #20200706T115109.788 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY FINDWORKGADGET #20200706T115109.788 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_4();

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
/* end RULE-HTML-PROPERTY FINDWORKGADGET #20200706T115109.788 GMT */
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
	"Rule-Obj-FieldValue:PYBUTTONLABEL!ENTERED BY ME", 
	"Rule-Obj-FieldValue:PYCAPTION!OPEN IN NEW WINDOW", 
	"Rule-Obj-FieldValue:PYACTIONPROMPT!SEARCH...", 
	"Rule-Obj-FieldValue:PYBUTTONLABEL!BY WORKBASKET", 
	"Rule-Obj-FieldValue:PYBUTTONLABEL!RESOLVED BY ME", 
	"Rule-Obj-FieldValue:PYBUTTONLABEL!ASSOCIATED BY PARTY", 
	"Rule-Obj-FieldValue:PYBUTTONLABEL!ASSIGNED TO ME", 
	"Rule-Obj-FieldValue:PYMESSAGELABEL!PLEASE DEFINE WORK TYPES FOR THIS APPLICATION TO SEARCH THE WORK BY ID", 
	"Rule-File-Text:WEBWB!PEGA_UI_SPLITBUTTON!JS", 
	"Rule-File-Text:WEBWB!PEGA_YUI_MENU!JS", 
	"Rule-File-Text:WEBWB!PEGA_YUI_BUTTON!JS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:SPLITBUTTONINCLUDES", 
	"Rule-Obj-Property:PYCAPTION", 
	"Rule-Obj-Property:PXCURRENTWORKPOOL", 
	"Rule-Obj-Property:PYBUTTONLABEL", 
	"Rule-Obj-Property:PYMESSAGELABEL", 
	"Rule-Obj-Property:PYTEMPLATEBUTTON", 
	"Rule-Obj-Property:PYACTIONPROMPT", 
	"Rule-Obj-Property:PYUSERIDENTIFIER", 
	"Rule-HTML-Property:GETLOCALIZEDVALUE", 
	"Rule-HTML-Property:JSENCODEDVALUE", 
	"Rule-HTML-Property:MESSAGES", 
	"Rule-HTML-Property:URLENCODEDVALUE", 
	"Rule-HTML-Property:PROMPTSELECT", 
	"Rule-HTML-Property:FINDWORKGADGET"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYBUTTONLABEL!ENTERED BY ME","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-ProCom","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYBUTTONLABEL!ENTERED BY ME #20180713T132214.629 GMT","!PYBUTTONLABEL!ENTERED BY ME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYCAPTION!OPEN IN NEW WINDOW","Rule-Obj-FieldValue","@BASECLASS",true,"Code-Pega-Requestor","Pega-ProCom","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!OPEN IN NEW WINDOW #20180713T132219.104 GMT","!PYCAPTION!OPEN IN NEW WINDOW",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PYACTIONPROMPT!SEARCH...","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-RULES","01-01-01","Rule-Obj-FieldValue @BASECLASS  pyActionPrompt","!PYACTIONPROMPT!SEARCH...",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1), 
		new DependentRuleInfo("PYBUTTONLABEL!BY WORKBASKET","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-ProCom","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYBUTTONLABEL!BY WORKBASKET #20180713T132214.586 GMT","!PYBUTTONLABEL!BY WORKBASKET",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYBUTTONLABEL!RESOLVED BY ME","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-RULES","01-01-01","Rule-Obj-FieldValue @BASECLASS  pyButtonLabel","!PYBUTTONLABEL!RESOLVED BY ME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1), 
		new DependentRuleInfo("PYBUTTONLABEL!ASSOCIATED BY PARTY","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-RULES","01-01-01","Rule-Obj-FieldValue @BASECLASS  pyButtonLabel","!PYBUTTONLABEL!ASSOCIATED BY PARTY",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1), 
		new DependentRuleInfo("PYBUTTONLABEL!ASSIGNED TO ME","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-ProCom","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYBUTTONLABEL!ASSIGNED TO ME #20180713T132214.556 GMT","!PYBUTTONLABEL!ASSIGNED TO ME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYMESSAGELABEL!PLEASE DEFINE WORK TYPES FOR THIS APPLICATION TO SEARCH THE WORK BY ID","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-RULES","01-01-01","Rule-Obj-FieldValue @BASECLASS  pyMessageLabel","!PYMESSAGELABEL!PLEASE DEFINE WORK TYPES FOR THIS APPLICATION TO SEARCH THE WORK BY ID",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1), 
		new DependentRuleInfo("WEBWB!PEGA_UI_SPLITBUTTON!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PEGA_UI_SPLITBUTTON!JS #20180713T133423.997 GMT","WEBWB!PEGA_UI_SPLITBUTTON!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PEGA_YUI_MENU!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PEGA_YUI_MENU!JS #20180713T133227.796 GMT","WEBWB!PEGA_YUI_MENU!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PEGA_YUI_BUTTON!JS","Rule-File-Text","",false,"","Pega-WB","","RULE-FILE-TEXT WEBWB PEGA_YUI_BUTTON!JS #20180713T131539.927 GMT","WEBWB!PEGA_YUI_BUTTON!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("SPLITBUTTONINCLUDES","Rule-HTML-Fragment","",false,"","Pega-WB","08-01-01","RULE-HTML-FRAGMENT SPLITBUTTONINCLUDES #20180713T131549.342 GMT","SPLITBUTTONINCLUDES",true,false,"ABSOLUTE_CLASSLESS",1948497487), 
		new DependentRuleInfo("PYCAPTION","Rule-Obj-Property","@BASECLASS",true,"Code-Pega-Requestor","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT","!PYCAPTION",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXCURRENTWORKPOOL","Rule-Obj-Property","CODE-PEGA-THREAD",true,"Code-Pega-Thread","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXCURRENTWORKPOOL #20180713T131843.143 GMT","!PXCURRENTWORKPOOL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PYBUTTONLABEL","Rule-Obj-Property","@BASECLASS",false,"","Pega-WB","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYBUTTONLABEL #20180713T131448.874 GMT","!PYBUTTONLABEL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1), 
		new DependentRuleInfo("PYMESSAGELABEL","Rule-Obj-Property","@BASECLASS",false,"","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYMESSAGELABEL #20180713T131842.875 GMT","!PYMESSAGELABEL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1), 
		new DependentRuleInfo("PYTEMPLATEBUTTON","Rule-Obj-Property","@BASECLASS",false,"","Pega-WB","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEBUTTON #20180713T131449.006 GMT","!PYTEMPLATEBUTTON",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONPROMPT","Rule-Obj-Property","@BASECLASS",false,"","Pega-WB","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYACTIONPROMPT #20180713T131448.855 GMT","!PYACTIONPROMPT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1), 
		new DependentRuleInfo("PYUSERIDENTIFIER","Rule-Obj-Property","@BASECLASS",true,"Code-Pega-Requestor","Pega-RULES","08-06-01","RULE-OBJ-PROPERTY @BASECLASS PYUSERIDENTIFIER #20201105T130217.202 GMT","!PYUSERIDENTIFIER",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("GETLOCALIZEDVALUE","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY GETLOCALIZEDVALUE #20180713T133433.079 GMT","GETLOCALIZEDVALUE",true,false,"ABSOLUTE_CLASSLESS",171406890), 
		new DependentRuleInfo("JSENCODEDVALUE","Rule-HTML-Property","",false,"","Pega-WB","08-01-01","RULE-HTML-PROPERTY JSENCODEDVALUE #20180713T131551.358 GMT","JSENCODEDVALUE",true,false,"ABSOLUTE_CLASSLESS",-972193213), 
		new DependentRuleInfo("MESSAGES","Rule-HTML-Property","",false,"","Pega-UIDesign","08-01-01","RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT","MESSAGES",true,false,"ABSOLUTE_CLASSLESS",-794757422), 
		new DependentRuleInfo("URLENCODEDVALUE","Rule-HTML-Property","",false,"","Pega-WB","08-01-01","RULE-HTML-PROPERTY URLENCODEDVALUE #20180713T131553.626 GMT","URLENCODEDVALUE",true,false,"ABSOLUTE_CLASSLESS",-1143695916), 
		new DependentRuleInfo("PROMPTSELECT","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT","PROMPTSELECT",true,false,"ABSOLUTE_CLASSLESS",-84469141), 
		new DependentRuleInfo("FINDWORKGADGET","Rule-HTML-Property","",false,"","Pega-EndUserUI","08-05-01","RULE-HTML-PROPERTY FINDWORKGADGET #20200706T115109.788 GMT","FINDWORKGADGET",true,false,"ABSOLUTE_CLASSLESS",-1714535331)
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
//	RULE-HTML-PROPERTY FINDWORKGADGET #20200706T115109.788 GMT:20200706T115109.788 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEBUTTON #20180713T131449.006 GMT:20180713T131449.006 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEBUTTON #20180713T131449.006 GMT:20180713T131449.006 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!OPEN IN NEW WINDOW #20180713T132219.104 GMT:20180713T132219.104 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYACTIONPROMPT #20180713T131448.855 GMT:20180713T131448.855 GMT
//	Rule-Obj-FieldValue @BASECLASS  pyActionPrompt:null
//	RULE-OBJ-PROPERTY @BASECLASS PYBUTTONLABEL #20180713T131448.874 GMT:20180713T131448.874 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYBUTTONLABEL!ENTERED BY ME #20180713T132214.629 GMT:20180713T132214.629 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYBUTTONLABEL #20180713T131448.874 GMT:20180713T131448.874 GMT
//	Rule-Obj-FieldValue @BASECLASS  pyButtonLabel:null
//	RULE-OBJ-PROPERTY @BASECLASS PYBUTTONLABEL #20180713T131448.874 GMT:20180713T131448.874 GMT
//	Rule-Obj-FieldValue @BASECLASS  pyButtonLabel:null
//	RULE-OBJ-PROPERTY @BASECLASS PYBUTTONLABEL #20180713T131448.874 GMT:20180713T131448.874 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYBUTTONLABEL!ASSIGNED TO ME #20180713T132214.556 GMT:20180713T132214.556 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYBUTTONLABEL #20180713T131448.874 GMT:20180713T131448.874 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYBUTTONLABEL!BY WORKBASKET #20180713T132214.586 GMT:20180713T132214.586 GMT
//	RULE-HTML-FRAGMENT SPLITBUTTONINCLUDES #20180713T131549.342 GMT:20180713T131549.342 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-TEXT WEBWB PEGA_YUI_MENU!JS #20180713T133227.796 GMT:20180713T133227.796 GMT
//	RULE-FILE-TEXT WEBWB PEGA_YUI_BUTTON!JS #20180713T131539.927 GMT:20180713T131539.927 GMT
//	RULE-FILE-TEXT WEBWB PEGA_UI_SPLITBUTTON!JS #20180713T133423.997 GMT:20180713T133423.997 GMT
//	RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT:20180713T133433.332 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYUSERIDENTIFIER #20201105T130217.202 GMT:20201105T130217.202 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYMESSAGELABEL #20180713T131842.875 GMT:20180713T131842.875 GMT
//	Rule-Obj-FieldValue @BASECLASS  pyMessageLabel:null
//	RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXCURRENTWORKPOOL #20180713T131843.143 GMT:20180713T131843.143 GMT
//	RULE-HTML-PROPERTY GETLOCALIZEDVALUE #20180713T133433.079 GMT:20180713T133433.079 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT:20180713T133634.985 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXCURRENTWORKPOOL #20180713T131843.143 GMT:20180713T131843.143 GMT
//	RULE-HTML-PROPERTY GETLOCALIZEDVALUE #20180713T133433.079 GMT:20180713T133433.079 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYUSERIDENTIFIER #20201105T130217.202 GMT:20201105T130217.202 GMT
//	RULE-HTML-PROPERTY JSENCODEDVALUE #20180713T131551.358 GMT:20180713T131551.358 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYUSERIDENTIFIER #20201105T130217.202 GMT:20201105T130217.202 GMT
//	RULE-HTML-PROPERTY JSENCODEDVALUE #20180713T131551.358 GMT:20180713T131551.358 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYUSERIDENTIFIER #20201105T130217.202 GMT:20201105T130217.202 GMT
//	RULE-HTML-PROPERTY URLENCODEDVALUE #20180713T131553.626 GMT:20180713T131553.626 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "af5f3c24c4ba071e640f58c43510e92d";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
private boolean when_6() throws Throwable {
boolean whenResult_3 = pega.invokeWhen("WorkPoolExists", "", "");
return whenResult_3;
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_6()) {
tools.appendString(" var url = SafeURL_createFromURL(pega.u.d.url); url.put(\"pyActivity\",\"Show-Harness\"); url.put(\"Purpose\", \"SelectWorkPool\"); url.put(\"ViewPurpose\", \"ResolvedByMeEmbed\"); ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" var url = SafeURL_createFromURL(pega.u.d.url); url.put(\"pyActivity\",\"ShowMgrReports\"); url.put(\"ViewPurpose\", \"ResolvedByMe\"); url.put(\"ShowListView\",\"true\"); url.put(\"ViewClass\",'");
	final ClipboardProperty currentProperty_2 = tools.getProperty("pxThread.pxCurrentWorkPool");
	if (currentProperty_2 != null && currentProperty_2.getParentPage().getClassName().equals("Code-Pega-Thread")) {
		final ClipboardProperty propPrevActive_2 = tools.putActive(currentProperty_2);
		final boolean prevInputMode_2 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		try {
				pega.checkIfActivePropertyMissing();
property_Data_Portal_GetLocalizedValue();
		} finally {
			tools.putActive(propPrevActive_2);
		}
	} else {
if (_jspx_meth_pega_reference__2(pageContext, "pxThread.pxCurrentWorkPool")) {
	return;
}
	}tools.appendString("'); ");
}
}
private boolean when_3() throws Throwable {
boolean whenResult_2 = pega.invokeWhen("WorkPoolExists", "", "");
return whenResult_2;
}
private boolean when_5(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue(aParam1), aParam2)));
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
private void performStream_2() throws Throwable {


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
	boolean foundChoice_6 = false;
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "");
tools.appendString(" ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "inputErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "inputError");
tools.appendString(" ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6) {
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
	if (when_5("parentLayoutVal", "SIMPLELAYOUT")) {
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
	if (when_5("parentLayoutVal", "SIMPLELAYOUT")) {
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
	if (when_5("isBad", "true")) {
tools.appendString(" id=\"PegaRULESErrorFlag\" ");
	}
tools.appendString(" > ");
	boolean foundChoice_7 = false;
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" <b style=\"font-family: wingdings;color:red;cursor:hand\">x</b> ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString("  </span> </div> ");
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
	oStreamProperties_4.put("pzInsKey", "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT");
	oStreamProperties_4.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_4.put("pyCircumstanceDate", "");
	oStreamProperties_4.put("pyRuleEnds", "");
	oStreamProperties_4.put("pyRuleStarts", "");
	oStreamProperties_4.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_4.put("pyXMLType", "");
	oStreamProperties_4.put("pyRuleSet", "Pega-UIDesign");
	oStreamProperties_4.put("pyCorrType", "");
	oStreamProperties_4.put("pyStreamName", "Messages");
	oStreamProperties_4.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Data_Portal_Messages
 */
private void property_Data_Portal_Messages() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT	Pega-UIDesign:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 * Set up context.
 */
final String prevRuleKey_4 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT";final String prevClass_4 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_4 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_4);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_4);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
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
/* end RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 */
private void include_3() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Portal_Messages();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
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
private boolean when_4() throws Throwable {
	return (pega.isPreviewMode() || (((!(tools.useModeInput())))));
}
private void performStream_3() throws Throwable {
 
if (tools.getActiveValue().length() > 0)  
         tools.putSaveValue("result", tools.getActive().getLocalizedText()); 
else 
	tools.putSaveValue("result", "");

tools.appendString(" ");
	boolean foundChoice_5 = false;
tools.appendString(" ");
if (!foundChoice_5 && when_4()) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(result)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(result)")) {
	return;
}
tools.appendString(" ");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_5) {
tools.appendString(" <SPAN nowrap> ");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_3();

tools.appendString(" <input type=text name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" value=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(result)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(result)")) {
	return;
}
tools.appendString("\" id=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$THIS-DEFINITION(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$THIS-DEFINITION(pyPropertyName)")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\"> </SPAN> ");
}
tools.appendString(" ");
}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Yes");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "");
	oStreamProperties_3.put("pyClassName", "");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-PROPERTY GETLOCALIZEDVALUE #20180713T133433.079 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "GetLocalizedValue");
	oStreamProperties_3.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Data_Portal_GetLocalizedValue
 */
private void property_Data_Portal_GetLocalizedValue() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY GETLOCALIZEDVALUE #20180713T133433.079 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY GETLOCALIZEDVALUE #20180713T133433.079 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY GETLOCALIZEDVALUE #20180713T133433.079 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY GETLOCALIZEDVALUE #20180713T133433.079 GMT */
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_3()) {
tools.appendString(" var url = SafeURL_createFromURL(pega.u.d.url); url.put(\"pyActivity\",\"Show-Harness\"); url.put(\"Purpose\", \"SelectWorkPool\"); url.put(\"ViewPurpose\", \"EnteredByMeEmbed\"); ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" var url = SafeURL_createFromURL(pega.u.d.url); url.put(\"pyActivity\",\"ShowMgrReports\"); url.put(\"ViewPurpose\", \"EnteredByMe\"); url.put(\"ShowListView\",\"true\"); url.put(\"ViewClass\",'");
	final ClipboardProperty currentProperty_1 = tools.getProperty("pxThread.pxCurrentWorkPool");
	if (currentProperty_1 != null && currentProperty_1.getParentPage().getClassName().equals("Code-Pega-Thread")) {
		final ClipboardProperty propPrevActive_1 = tools.putActive(currentProperty_1);
		final boolean prevInputMode_1 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		try {
				pega.checkIfActivePropertyMissing();
property_Data_Portal_GetLocalizedValue();
		} finally {
			tools.putActive(propPrevActive_1);
		}
	} else {
if (_jspx_meth_pega_reference__2(pageContext, "pxThread.pxCurrentWorkPool")) {
	return;
}
	}tools.appendString("'); ");
}
}
private boolean when_2(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getProperty(aParam1).getStringValue(), aParam2)));
}
/**
 * Implements a pega:key tag.
 */private boolean _jspx_meth_pega_key__1(PageContext aPageContext, java.lang.String aName, java.lang.String aRef) throws Throwable {
/* pega:key */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_key_ = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_key_.setPageContext(pageContext);
_jspx_th_pega_key_.setParent(mParentTag);
_jspx_th_pega_key_.setName(aName);
_jspx_th_pega_key_.setRef(aRef);
int _jspx_eval_pega_key_ = _jspx_th_pega_key_.doStartTag();
if (_jspx_th_pega_key_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_key_);
return false;
}
/**
 * Implements a pega:lookup tag.
 */private boolean _jspx_meth_pega_lookup__2(PageContext aPageContext, java.lang.String aProperty, java.lang.String aClassName) throws Throwable {
/* pega:lookup */
com.pega.pegarules.jsptags.LookupTag _jspx_th_pega_lookup_ = (com.pega.pegarules.jsptags.LookupTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.LookupTag.class);
_jspx_th_pega_lookup_.setPageContext(pageContext);
_jspx_th_pega_lookup_.setParent(mParentTag);
_jspx_th_pega_lookup_.setProperty(aProperty);
_jspx_th_pega_lookup_.setClassName(aClassName);
int _jspx_eval_pega_lookup_ = _jspx_th_pega_lookup_.doStartTag();
if (_jspx_eval_pega_lookup_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_lookup_;
if (_jspx_meth_pega_key__1(pageContext, "pyWorkGroupName", "$this-value")) {
	return true;
}
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_lookup_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_lookup_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_lookup_);
return false;
}
/**
 * Implements a pega:withReference tag.
 */private boolean _jspx_meth_pega_withReference__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:withReference */
com.pega.pegarules.jsptags.WithReferenceTag _jspx_th_pega_withReference_ = (com.pega.pegarules.jsptags.WithReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithReferenceTag.class);
_jspx_th_pega_withReference_.setPageContext(pageContext);
_jspx_th_pega_withReference_.setParent(mParentTag);
_jspx_th_pega_withReference_.setName(aName);
int _jspx_eval_pega_withReference_ = _jspx_th_pega_withReference_.doStartTag();
if (_jspx_eval_pega_withReference_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_withReference_;
if (_jspx_meth_pega_lookup__2(pageContext, "pyDefaultWorkBasket", "DATA-ADMIN-WORKGROUP")) {
	return true;
}
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_withReference_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withReference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withReference_);
return false;
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
/**
 * Build stream RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
StringMap  keys_1 = new HashStringMap();
keys_1.putString("pxObjClass", "Rule-HTML-Property");
keys_1.putString("pyStreamName", "PromptSelect");
tools.appendStream(keys_1);
keys_1 = null;
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
tools.appendString("\n\t\t");
	IStaticContentRuntime pzStatic__2 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__2.addFile("pega_yui_menu", "1570738838", "js");
tools.appendString(" \n\t\t");
	IStaticContentRuntime pzStatic__4 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__4.addFile("pega_yui_button", "13563920726", "js");
tools.appendString(" \n\t\t");
	IStaticContentRuntime pzStatic__6 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__6.addFile("pega_ui_splitbutton", "11859763952", "js");
tools.appendString("\t\t\t\t\n\t");
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
 * OnlyOnce condition: SplitButtonIncludes
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("SplitButtonIncludes")) {
tools.appendString("\n\t");
if (_jspx_meth_pega_static__1(pageContext, "script", "webwb")) {
	return;
}
tools.appendString("\n\t\n");
}
}
private void performStream_1() throws Throwable {
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
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-FRAGMENT SPLITBUTTONINCLUDES #20180713T131549.342 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-WB");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "SplitButtonIncludes");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT SPLITBUTTONINCLUDES #20180713T131549.342 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT SPLITBUTTONINCLUDES #20180713T131549.342 GMT	Pega-WB:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT SPLITBUTTONINCLUDES #20180713T131549.342 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT SPLITBUTTONINCLUDES #20180713T131549.342 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_1)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

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
/* end RULE-HTML-FRAGMENT SPLITBUTTONINCLUDES #20180713T131549.342 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_1(String aParam1) throws Throwable {
	return (pega.isPreviewMode() || (((!(invokeWhenRule(tools, aParam1))))));
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
"RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!OPEN IN NEW WINDOW #20180713T132219.104 GMT", "Rule-Obj-FieldValue", "Pega-ProCom", "pyCaption", "Code-Pega-Requestor", "Open in new window" };
private static final String[] showMeParams_2 = {
"", "Rule-Obj-FieldValue", "", "pyActionPrompt", "Data-Portal", "Search..." };
private static final String[] showMeParams_3 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYBUTTONLABEL!ENTERED BY ME #20180713T132214.629 GMT", "Rule-Obj-FieldValue", "Pega-ProCom", "pyButtonLabel", "Data-Portal", "Entered by me" };
private static final String[] showMeParams_4 = {
"", "Rule-Obj-FieldValue", "", "pyButtonLabel", "Data-Portal", "Associated by party" };
private static final String[] showMeParams_5 = {
"", "Rule-Obj-FieldValue", "", "pyButtonLabel", "Data-Portal", "Resolved by me" };
private static final String[] showMeParams_6 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYBUTTONLABEL!ASSIGNED TO ME #20180713T132214.556 GMT", "Rule-Obj-FieldValue", "Pega-ProCom", "pyButtonLabel", "Data-Portal", "Assigned to me" };
private static final String[] showMeParams_7 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYBUTTONLABEL!BY WORKBASKET #20180713T132214.586 GMT", "Rule-Obj-FieldValue", "Pega-ProCom", "pyButtonLabel", "Data-Portal", "By workbasket" };
private static final String[] showMeParams_8 = {
"", "Rule-Obj-FieldValue", "", "pyMessageLabel", "Data-Portal", "Please define work types for this application to search the work by ID" };
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
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__4(PageContext aPageContext, java.lang.String aName, java.lang.String aFormat) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
_jspx_th_pega_reference_.setFormat(aFormat);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
private void performStream_4() throws Throwable {
String strPropertyName = tools.getActive().getName(); 
String splitButtonId = "PEGA_SPLITBTN" + strPropertyName;
String strCaption=tools.getParamValue("FindCaption");

ClipboardPage requestorPage = tools.findPage("pxRequestor");
String userID = requestorPage.getString("pyUserIdentifier");

/* Start - Registering action for getNextWorkItem*/
ClipboardPage actionPage = pega.getUIEngine().getUIActionPage("getNextWorkItem");
actionPage.getPage("pyActionAPI").putString("strUserId",userID);
pega.getUIEngine().getUIAction(actionPage).register();
actionPage.removeFromClipboard();
/* End - Registering action for getNextWorkItem*/

/* Start - Registering action for openUrlInWindow*/
ClipboardPage openUrlPage = pega.getUIEngine().getUIActionPage("openUrlInWindow");
openUrlPage.getPage("pyActionAPI").putString("pyActivity","Rule-Obj-ListView.ShowView");
openUrlPage.getPage("pyActionAPI").putString("pyUseAlternateUrlBase","false");

pega.getUIEngine().getUIAction(openUrlPage).register();
openUrlPage.removeFromClipboard();
/* End - Registering action for openUrlInWindow*/

pega_rules_utilities.pzRegisterActivity(tools, "@baseclass.FindWorkByIDInApp");
pega_rules_utilities.pzRegisterActivity(tools, "Rule-Obj-ListView.ShowView");
pega_rules_utilities.pzRegisterActivity(tools, "Rule-Obj-ListView.Process");
pega_rules_utilities.pzRegisterActivity(tools, "@baseclass.Show-Harness");
pega_rules_utilities.pzRegisterActivity(tools, "@baseclass.ShowMgrReports");
pega_rules_utilities.pzRegisterActivity(tools, "Rule-Obj-SummaryView.ShowView");
pega_rules_utilities.pzRegisterActivity(tools, "Rule-Obj-SummaryView.RemovePages");
pega_rules_utilities.pzRegisterActivity(tools, "@baseclass.doUIAction");

tools.appendString(" ");
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (areValsEqual(tools.getParamValue("SearchType"), "Basic")))) {
tools.appendString(" ");
if(strCaption.equals(""))
    strCaption = "By ID";
tools.appendString(" ");
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || (areValsEqual(tools.getProperty("pyPortal.pyLocalized").getStringValue(), "true")))) {
tools.appendString(" ");
tools.putSaveValue("BUTTON-caption", tools.getLocalizedTextForString(".pyButtonLabel", strCaption));
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2) {
tools.appendString(" ");
tools.putSaveValue("BUTTON-caption", strCaption);
tools.appendString(" ");
}
tools.appendString("  <table><tr> <td width=\"80px\"><input type=\"text\" id=\"Work_ID\" size=\"23\" style=\"vertical-align:top;\" onkeypress=\"onEnter(event);\"></td> <td>");

/*
 * reference tag
 * Cannot inline because: included stream is too big: 8145 bytes
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__1 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__1.setPageContext(pageContext);
_jspx_th_pega_reference__1.setParent(mParentTag);
_jspx_th_pega_reference__1.setName(".pyTemplateButton");
_jspx_th_pega_reference__1.setMode("input");
_jspx_th_pega_reference__1.setFormat("Button");
int _jspx_eval_pega_reference__1 = _jspx_th_pega_reference__1.doStartTag();
if (_jspx_eval_pega_reference__1 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_1 = mParentTag;
mParentTag = _jspx_th_pega_reference__1;
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__1 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__1.setPageContext(pageContext);
_jspx_th_pega_param__1.setParent(mParentTag);
_jspx_th_pega_param__1.setName("Caption");
_jspx_th_pega_param__1.setValue(tools.getSaveValue("BUTTON-caption"));
int _jspx_eval_pega_param__1 = _jspx_th_pega_param__1.doStartTag();
if (_jspx_th_pega_param__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__1);
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "OnClick", "pega.ui.gadget.FindWork.goURL(false);")) {
	return;
}
tools.appendString(" ");
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
tools.appendString(" </td> </tr></table> <table><tr> <td width=\"14px\"><input type=\"checkbox\" id=\"NWin\" style=\"border:none\" value=\"ON\" /></td> <td>");

/* Field value Code-Pega-Requestor pxRequestor.pyCaption Open in new window */
if (mInline_pxRequestor) {
	out.write("Open in new window");
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_1);
} else {
if (_jspx_meth_pega_lookup__1(pageContext, "pxRequestor.pyCaption", "Open in new window")) {
	return;
}
}
tools.appendString("</td> </tr></table> ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (areValsEqual(tools.getParamValue("SearchType"), "Classic")))) {
tools.appendString(" <select id=\"WorkQuerySelect\" ");
	if (when_1("isAccessible")) {
tools.appendString("onchange=\"pega.ui.gadget.FindWork.SearchforWork(this.value);this.options[0].selected=true;\" ");
	}
tools.appendString("> <option value=\"\" selected> ");

/* Field value Data-Portal .pyActionPrompt Search... */
out.write("Search...");
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_2);
tools.appendString(" </option> <option value=\"1\"> ");

/* Field value Data-Portal .pyButtonLabel Entered by me */
if(tools.getStepPage() != null && "Data-Portal".equals(tools.getStepPage().getClassName())){
out.write("Entered by me");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyButtonLabel", "Entered by me")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_3);
tools.appendString(" </option> <option value='2'> ");

/* Field value Data-Portal .pyButtonLabel Associated by party */
out.write("Associated by party");
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_4);
tools.appendString(" </option> <option value=\"3\"> ");

/* Field value Data-Portal .pyButtonLabel Resolved by me */
out.write("Resolved by me");
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_5);
tools.appendString(" </option> <option value=\"4\"> ");

/* Field value Data-Portal .pyButtonLabel Assigned to me */
if(tools.getStepPage() != null && "Data-Portal".equals(tools.getStepPage().getClassName())){
out.write("Assigned to me");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyButtonLabel", "Assigned to me")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_6);
tools.appendString(" </option> <option value=\"5\"> ");

/* Field value Data-Portal .pyButtonLabel By workbasket */
if(tools.getStepPage() != null && "Data-Portal".equals(tools.getStepPage().getClassName())){
out.write("By work queue");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyButtonLabel", "By workbasket")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_7);
tools.appendString(" </option> </select> ");
boolean whenResult_1 = pega.invokeWhen("isAccessible", "", "");
	if (whenResult_1) {
tools.appendString(" ");
/* pega:include */
com.pega.pegarules.jsptags.IncludeTag _jspx_th_pega_include__1 = (com.pega.pegarules.jsptags.IncludeTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.IncludeTag.class);
_jspx_th_pega_include__1.setPageContext(pageContext);
_jspx_th_pega_include__1.setParent(mParentTag);
_jspx_th_pega_include__1.setName("Button");
_jspx_th_pega_include__1.setType("Rule-HTML-Property");
int _jspx_eval_pega_include__1 = _jspx_th_pega_include__1.doStartTag();
if (_jspx_eval_pega_include__1 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_2 = mParentTag;
mParentTag = _jspx_th_pega_include__1;
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__2 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__2.setPageContext(pageContext);
_jspx_th_pega_param__2.setParent(mParentTag);
_jspx_th_pega_param__2.setName("ToolTip");
_jspx_th_pega_param__2.setValue(tools.getLocalizedTextForString(".pyActionPrompt", "Search..."));
int _jspx_eval_pega_param__2 = _jspx_th_pega_param__2.doStartTag();
if (_jspx_th_pega_param__2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__2);
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "OnClick", "pega.ui.gadget.FindWork.SearchforWork();")) {
	return;
}
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__3 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__3.setPageContext(pageContext);
_jspx_th_pega_param__3.setParent(mParentTag);
_jspx_th_pega_param__3.setName("Caption");
_jspx_th_pega_param__3.setValue(tools.getLocalizedTextForString(".pyCaption", "Go"));
int _jspx_eval_pega_param__3 = _jspx_th_pega_param__3.doStartTag();
if (_jspx_th_pega_param__3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__3);
tools.appendString(" ");
mParentTag = prevParentTag_2;
		int evalDoAfterBody = _jspx_th_pega_include__1.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_include__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_include__1);
tools.appendString(" ");
	}
tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (areValsEqual(tools.getParamValue("SearchType"), "V6Search")))) {
tools.appendString(" ");
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || ((invokeWhenRule(tools, "isAccessible"))))) {
tools.appendString(" ");
if(strCaption.equals(""))
  strCaption = "Search";
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT SPLITBUTTONINCLUDES #20180713T131549.342 GMT */
include_1();

tools.appendString(" <div class=\"SplitButton\" id=\"PEGA_SPLITBUTTON\" splitBtnName=\"");
out.print(strPropertyName);
tools.appendString("\" btnType = \"split\" onSplMenuClick=\"pega.ui.gadget.FindWork.SearchforWork\" role=\"application\"> ");
/* Include stream RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT */
include_2();

tools.appendString(" ");
/* pega:include */
com.pega.pegarules.jsptags.IncludeTag _jspx_th_pega_include__2 = (com.pega.pegarules.jsptags.IncludeTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.IncludeTag.class);
_jspx_th_pega_include__2.setPageContext(pageContext);
_jspx_th_pega_include__2.setParent(mParentTag);
_jspx_th_pega_include__2.setName("SearchButton");
_jspx_th_pega_include__2.setType("Rule-HTML-Property");
int _jspx_eval_pega_include__2 = _jspx_th_pega_include__2.doStartTag();
if (_jspx_eval_pega_include__2 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_3 = mParentTag;
mParentTag = _jspx_th_pega_include__2;
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__4 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__4.setPageContext(pageContext);
_jspx_th_pega_param__4.setParent(mParentTag);
_jspx_th_pega_param__4.setName("Caption");
_jspx_th_pega_param__4.setValue(tools.getLocalizedTextForString(".pyCaption",strCaption));
int _jspx_eval_pega_param__4 = _jspx_th_pega_param__4.doStartTag();
if (_jspx_th_pega_param__4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__4);
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__5 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__5.setPageContext(pageContext);
_jspx_th_pega_param__5.setParent(mParentTag);
_jspx_th_pega_param__5.setName("ToolTip");
_jspx_th_pega_param__5.setValue(tools.getLocalizedTextForString(".pyCaption",strCaption));
int _jspx_eval_pega_param__5 = _jspx_th_pega_param__5.doStartTag();
if (_jspx_th_pega_param__5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__5);
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__6 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__6.setPageContext(pageContext);
_jspx_th_pega_param__6.setParent(mParentTag);
_jspx_th_pega_param__6.setName("Id");
_jspx_th_pega_param__6.setValue(splitButtonId);
int _jspx_eval_pega_param__6 = _jspx_th_pega_param__6.doStartTag();
if (_jspx_th_pega_param__6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__6);
tools.appendString(" ");
mParentTag = prevParentTag_3;
		int evalDoAfterBody = _jspx_th_pega_include__2.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_include__2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_include__2);
tools.appendString(" </div> ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3) {
tools.appendString(" <div> ");
pzAuto.emitIncludeStreamReference("pzSearchFieldWork", null, null, "Rule-HTML-Section", null);
tools.appendString("</div> ");
}
tools.appendString("  ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (areValsEqual(tools.getParamValue("SearchType"), "Responsive")))) {
tools.appendString(" ");
	boolean foundChoice_4 = false;
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || ((invokeWhenRule(tools, "isAccessible"))))) {
tools.appendString(" ");
if(strCaption.equals(""))
  strCaption = "Search";
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT SPLITBUTTONINCLUDES #20180713T131549.342 GMT */
include_1();

tools.appendString(" <div class=\"SplitButton\" id=\"PEGA_SPLITBUTTON\" splitBtnName=\"");
out.print(strPropertyName);
tools.appendString("\" btnType = \"split\" onSplMenuClick=\"pega.ui.gadget.FindWork.SearchforWork\" role=\"application\"> ");
/* Include stream RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT */
include_2();

tools.appendString(" ");
/* pega:include */
com.pega.pegarules.jsptags.IncludeTag _jspx_th_pega_include__3 = (com.pega.pegarules.jsptags.IncludeTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.IncludeTag.class);
_jspx_th_pega_include__3.setPageContext(pageContext);
_jspx_th_pega_include__3.setParent(mParentTag);
_jspx_th_pega_include__3.setName("SearchButton");
_jspx_th_pega_include__3.setType("Rule-HTML-Property");
int _jspx_eval_pega_include__3 = _jspx_th_pega_include__3.doStartTag();
if (_jspx_eval_pega_include__3 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_4 = mParentTag;
mParentTag = _jspx_th_pega_include__3;
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__7 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__7.setPageContext(pageContext);
_jspx_th_pega_param__7.setParent(mParentTag);
_jspx_th_pega_param__7.setName("Caption");
_jspx_th_pega_param__7.setValue(tools.getLocalizedTextForString(".pyCaption",strCaption));
int _jspx_eval_pega_param__7 = _jspx_th_pega_param__7.doStartTag();
if (_jspx_th_pega_param__7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__7);
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__8 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__8.setPageContext(pageContext);
_jspx_th_pega_param__8.setParent(mParentTag);
_jspx_th_pega_param__8.setName("ToolTip");
_jspx_th_pega_param__8.setValue(tools.getLocalizedTextForString(".pyCaption",strCaption));
int _jspx_eval_pega_param__8 = _jspx_th_pega_param__8.doStartTag();
if (_jspx_th_pega_param__8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__8);
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__9 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__9.setPageContext(pageContext);
_jspx_th_pega_param__9.setParent(mParentTag);
_jspx_th_pega_param__9.setName("Id");
_jspx_th_pega_param__9.setValue(splitButtonId);
int _jspx_eval_pega_param__9 = _jspx_th_pega_param__9.doStartTag();
if (_jspx_th_pega_param__9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__9);
tools.appendString(" ");
mParentTag = prevParentTag_4;
		int evalDoAfterBody = _jspx_th_pega_include__3.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_include__3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_include__3);
tools.appendString(" </div> ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4) {
tools.appendString(" <div> ");
pzAuto.emitIncludeStreamReference("pzSearchFieldWorkResponsive", null, null, "Rule-HTML-Section", null);
tools.appendString("</div> ");
}
tools.appendString("  ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" ");
if(strCaption.equals(""))
  strCaption = "Search";
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT SPLITBUTTONINCLUDES #20180713T131549.342 GMT */
include_1();

tools.appendString(" <div class=\"SplitButton\" id=\"PEGA_SPLITBUTTON\" splitBtnName=\"");
out.print(strPropertyName);
tools.appendString("\" btnType = \"split\" onSplMenuClick=\"pega.ui.gadget.FindWork.SearchforWork\" role=\"application\"> ");
/* Include stream RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT */
include_2();

tools.appendString(" ");
/* pega:include */
com.pega.pegarules.jsptags.IncludeTag _jspx_th_pega_include__4 = (com.pega.pegarules.jsptags.IncludeTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.IncludeTag.class);
_jspx_th_pega_include__4.setPageContext(pageContext);
_jspx_th_pega_include__4.setParent(mParentTag);
_jspx_th_pega_include__4.setName("SearchButton");
_jspx_th_pega_include__4.setType("Rule-HTML-Property");
int _jspx_eval_pega_include__4 = _jspx_th_pega_include__4.doStartTag();
if (_jspx_eval_pega_include__4 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_5 = mParentTag;
mParentTag = _jspx_th_pega_include__4;
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__10 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__10.setPageContext(pageContext);
_jspx_th_pega_param__10.setParent(mParentTag);
_jspx_th_pega_param__10.setName("Caption");
_jspx_th_pega_param__10.setValue(strCaption);
int _jspx_eval_pega_param__10 = _jspx_th_pega_param__10.doStartTag();
if (_jspx_th_pega_param__10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__10);
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__11 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__11.setPageContext(pageContext);
_jspx_th_pega_param__11.setParent(mParentTag);
_jspx_th_pega_param__11.setName("Id");
_jspx_th_pega_param__11.setValue(splitButtonId);
int _jspx_eval_pega_param__11 = _jspx_th_pega_param__11.doStartTag();
if (_jspx_th_pega_param__11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__11);
tools.appendString(" ");
mParentTag = prevParentTag_5;
		int evalDoAfterBody = _jspx_th_pega_include__4.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_include__4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_include__4);
tools.appendString(" </div> ");
}
tools.appendString("  <script> pega.namespace(\"pega.ui.gadget.FindWork\"); pega.u.d.fieldValuesList.put(\"SPLITBUTTON_OPTION_VISIBLE_TITLE\",\"");
out.print(tools.getLocalizedTextForString(".pyCaption", "Menu expanded. Press Esc or Enter to hide the menu."));
tools.appendString("\"); pega.u.d.fieldValuesList.put(\"SPLITBUTTON_DEFAULT_TITLE\",\"");
out.print(tools.getLocalizedTextForString(".pyCaption", "Menu collapsed. Press Down Arrow to show the menu."));
tools.appendString("\"); /*@private Function invoked for searching work by id. @param $frmMenu$ set when called for split button. @return $void$ */ pega.ui.gadget.FindWork.goURL = function(frmMenu){ if(frmMenu){ var searchEle = document.getElementById('Work_ID2'); }else { var searchEle = document.getElementById('Work_ID'); } var strItemID=trim(searchEle.value); if (strItemID == \"\" || strItemID == 'Search'){ alert(");
out.print(com.pegarules.generated.pega_rules_default.quote(tools.getLocalizedTextForString(".pyMessageLabel", "FindWorkBlankID")));
tools.appendString("); searchEle.value = \"\"; searchEle.focus(); return false; }else if (frmMenu||(!frmMenu && document.getElementById(\"NWin\").checked == false)) { if(this.checkId(strItemID,searchEle)) { this.getSearchResults(false, strItemID); } }else { this.getSearchResults(true, strItemID); } }; /*@private Ajax call to get type of results for id search. @param $openInPopUp$ to open the results in popup. @return $void$ */ pega.ui.gadget.FindWork.getSearchResults = function(openInPopUp, strItemID){ var oTempURL = new SafeURL(\"@baseclass.FindWorkByIDInApp\"); oTempURL.put(\"pyID\",strItemID); var callback = { success: function(o) { var responseString = o.responseText; if (responseString.toLowerCase() == \"many\") { var oSafeURL = new SafeURL(\"Rule-Obj-ListView.ShowView\"); oSafeURL.put(\"ViewClass\",\"Data-Work-Summary\"); oSafeURL.put(\"ViewPurpose\",\"GetWorkByIDInApp\"); oSafeURL.put(\"ViewOwner\",\"ALL\"); oSafeURL.put(\"pyAction\",\"refresh\"); oSafeURL.put(\"pyID\", strItemID); pega.u.d.convertToRunActivityAction(oSafeURL,true); pega.desktop.openUrlInWindow(oSafeURL,\"pyWorkQuery\", PopupWindowFeatures + \",\" + QueryFormSize); } else if(responseString.indexOf(\":\") > 0) { var idx = responseString.indexOf(\":\"); var text = responseString.substring(0,idx); if(text.toLowerCase() == \"none\") { alert(responseString.substring(idx+1)); } else if(openInPopUp==false){ var insHandle = responseString.substring(idx+1); openWorkByHandle(insHandle,\"1\"); }else { var oSafeURL= new SafeURL(); var insHandle = responseString.substring(idx+1); oSafeURL.put(\"param\", insHandle); oSafeURL.put(\"version\", 1); var sourceString= oSafeURL.toQueryString(); var strURL= pega.desktop.support.constructUrl(sourceString , \"openbyworkHandle\"); pega.desktop.openUrlInWindow(strURL, \"pyWorkPage\", WorkFormSize + PopupWindowFeatures); } } }, failure: function(o) { alert ('fail ' + o.responsetext); } }; pega.u.d.convertToRunActivityAction(oTempURL,true); var transaction = pega.util.Connect.asyncRequest('GET', oTempURL.toURL(), callback, null); }; /*@private Function to check if id entered is valid. @param $value$ id entered in search box. @param $ele$ search input box. @return $boolean$ true if valid else false. */ pega.ui.gadget.FindWork.checkId = function(value,ele) { var regExp = /[A-Za-z0-9_-]/; for (i = 0; i<value.length; i++) { var ch = value.substr(i, 1); if(ch.match(regExp) == null) { alert(getLocalString(\"pyMessageLabel\", \"FindWorkInvalidCharacter\")); ele.value=\"\"; ele.focus(); return false; } else { return true; } } }; /*@private Function invoked for searching work for advanced options. @param $frmMenu$ set when called for split button. @return $void$ */ pega.ui.gadget.FindWork.SearchforWork = function(value) { if(typeof(value) == 'undefined'){ var ele = document.getElementById(\"WorkQuerySelect\"); if(ele) value = ele.value; } var userId = \"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "pxRequestor.pyUserIdentifier", "NORMAL")) {
	return;
}
tools.appendString("\"; var WorkbasketID = \"");
if (_jspx_meth_pega_withReference__1(pageContext, "pxRequestor.pxWorkGroup")) {
	return;
}
tools.appendString("\"; var workPoolPresent = true; ");
	if (when_2("pxThread.pxCurrentWorkPool", "")) {
tools.appendString(" workPoolPresent = false; ");
	}
tools.appendString(" if(!workPoolPresent) { alert('");

/* Field value Data-Portal .pyMessageLabel Please define work types for this application to search the work by ID */
out.write("Please define work types for this application to search the work by ID");
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_8);
tools.appendString("'); return; } switch(value) { case \"0\": pega.ui.gadget.FindWork.goURL(true); break; case \"1\": ");
choose_1();
tools.appendString("  break; case \"2\": var url = new SafeURL(\"Rule-Obj-SummaryView.ShowView\"); url.put(\"ViewClass\", \"Index-WorkPartyUri\"); url.put(\"ViewPurpose\", \"AssociatedWork\"); url.put(\"pyAction\", \"Refresh\"); break; case \"3\": ");
choose_2();
tools.appendString("  ");
String localeToUse = pega_wb_reportcontentbuilder.getUserLocale();
    String localeDatePattern = PRDateFormat.getFormatPattern(localeToUse,PRDateFormat.DEFAULT_DATE_SHORT);
    tools.putSaveValue("localeDatePattern",localeDatePattern);
tools.appendString(" var newDate = new Date(dateFromDaysAgo(3)); url.put(\"SinceDate\", newDate.formatToLocale(\"");
out.print( tools.getSaveValue("localeDatePattern"));
tools.appendString("\")); break; case \"4\": var url = new SafeURL(\"Rule-Obj-ListView.ShowView\"); var userID = \"");
	final ClipboardProperty currentProperty_3 = tools.getProperty("pxRequestor.pyUserIdentifier");
	if (currentProperty_3 != null && currentProperty_3.getParentPage().getClassName().equals("Code-Pega-Requestor")) {
		final ClipboardProperty propPrevActive_3 = tools.putActive(currentProperty_3);
		final boolean prevInputMode_3 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		try {
				pega.checkIfActivePropertyMissing();
StringMap  keys_2 = new HashStringMap();
keys_2.putString("pxObjClass", "Rule-HTML-Property");
keys_2.putString("pyStreamName", "JSEncodedValue");
tools.appendStream(keys_2);
keys_2 = null;
		} finally {
			tools.putActive(propPrevActive_3);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, "pxRequestor.pyUserIdentifier", "display", "JSEncodedValue")) {
	return;
}
	}tools.appendString("\"; url.put(\"ViewClass\", \"Assign-Worklist\"); url.put(\"ViewPurpose\", \"WorkListPopup\"); url.put(\"pyAction\", \"Refresh\"); url.put(\"UserID\", userId); break; case \"5\": var url = new SafeURL(\"Rule-Obj-ListView.ShowView\"); url.put(\"ViewClass\", \"Assign-WorkBasket\"); url.put(\"ViewPurpose\", \"workbasketlistPopup\"); url.put(\"pyAction\", \"Refresh\"); url.put(\"WorkbasketID\", WorkbasketID); break; case \"6\": var userID = \"");
	final ClipboardProperty currentProperty_4 = tools.getProperty("pxRequestor.pyUserIdentifier");
	if (currentProperty_4 != null && currentProperty_4.getParentPage().getClassName().equals("Code-Pega-Requestor")) {
		final ClipboardProperty propPrevActive_4 = tools.putActive(currentProperty_4);
		final boolean prevInputMode_4 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		try {
				pega.checkIfActivePropertyMissing();
StringMap  keys_3 = new HashStringMap();
keys_3.putString("pxObjClass", "Rule-HTML-Property");
keys_3.putString("pyStreamName", "JSEncodedValue");
tools.appendStream(keys_3);
keys_3 = null;
		} finally {
			tools.putActive(propPrevActive_4);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, "pxRequestor.pyUserIdentifier", "display", "JSEncodedValue")) {
	return;
}
	}tools.appendString("\"; pega.desktop.getNextWorkItem(userID); break; } if(url != \"\"){ pega.u.d.convertToRunActivityAction(url,true); pega.desktop.openUrlInWindow(url, \"pyWorkQuery\", PopupWindowFeatures + \",\" + QueryFormSize); } }; Date.prototype.formatToLocale = function(f) { if (!this.valueOf()) return '&nbsp;'; var d = this; return f.replace(/(yyyy|yy|mm|m|dd|d)/gi, function($1) { switch ($1.toLowerCase()) { case 'yyyy': return d.getFullYear(); case 'yy': return d.getFullYear(); case 'mm': return (d.getMonth() + 1).appendZero(2); case 'm': return (d.getMonth() + 1); case 'dd': return d.getDate().appendZero(2); case 'd': return d.getDate(); } } ); }; /** * @description: wrapper for getNextWorkItem function */ function getNextWorkItem_local() { var userID = \"");
	final ClipboardProperty currentProperty_5 = tools.getProperty("pxRequestor.pyUserIdentifier");
	if (currentProperty_5 != null && currentProperty_5.getParentPage().getClassName().equals("Code-Pega-Requestor")) {
		final ClipboardProperty propPrevActive_5 = tools.putActive(currentProperty_5);
		final boolean prevInputMode_5 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		try {
				pega.checkIfActivePropertyMissing();
StringMap  keys_4 = new HashStringMap();
keys_4.putString("pxObjClass", "Rule-HTML-Property");
keys_4.putString("pyStreamName", "urlEncodedValue");
tools.appendStream(keys_4);
keys_4 = null;
		} finally {
			tools.putActive(propPrevActive_5);
		}
	} else {
if (_jspx_meth_pega_reference__4(pageContext, "pxRequestor.pyUserIdentifier", "urlEncodedValue")) {
	return;
}
	}tools.appendString("\"; getNextWorkItem(userID); } /* * @protected * Function To format the date * @param thedate – of type date * @return $String$ Date in string format */ function formatDate(thedate) { if(typeof localeDatePattern != \"undefined\" && localeDatePattern) { return thedate.formatToLocale(localeDatePattern); } else{ m= thedate.getMonth() + 1; return \"\" + m + \"/\" + thedate.getDate() + \"/\" + thedate.getFullYear(); } } /* * @protected * Function to get the number of days from specified day * @param numdays – Of type Integer * @return $Date$ returns date of specified days ago. */ function dateFromDaysAgo(numdays) { if (numdays > 0) numdays --; var now= new Date(); var OneDay= 1000 * 86400; var then= new Date(now - numdays * OneDay); return formatDate(then); } function onEnter(e) { var keynum; if(window.event) { /*IE*/ keynum = e.keyCode; }else if(e.which) { /* Other Browsers */ keynum = e.which; } if(keynum != 13 ){ return; }else { var searchKeyWord = document.getElementById('Work_ID').value; pega.ui.gadget.FindWork.goURL(false); } } </script>");
}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Data-Portal.pyMessageLabel", new LiteweightPropertyDefinition("Data-Portal", "pyMessageLabel", "siN", false, true, "Default", false));
	oPropDefinitions_1.put("Data-Portal.pyTemplateButton", new LiteweightPropertyDefinition("Data-Portal", "pyTemplateButton", "sTN", false, true, "Button", false));
	oPropDefinitions_1.put("Code-Pega-Requestor.pyCaption", new LiteweightPropertyDefinition("Code-Pega-Requestor", "pyCaption", "siN", false, true, "Default", false));
	oPropDefinitions_1.put("Data-Portal.pyActionPrompt", new LiteweightPropertyDefinition("Data-Portal", "pyActionPrompt", "stN", false, true, "Default", false));
	oPropDefinitions_1.put("Data-Portal.pyButtonLabel", new LiteweightPropertyDefinition("Data-Portal", "pyButtonLabel", "siN", false, true, "Default", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY FINDWORKGADGET #20200706T115109.788 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-EndUserUI");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "FindWorkGadget");
	oStreamProperties_1.put("pyRuleSetVersion", "08-05-01");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_4 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY JSENCODEDVALUE #20180713T131551.358 GMT", "JSEncodedValue", "Pega-WB", "08-01-01", "20180713T131551.358 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_3 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT", "Messages", "Pega-UIDesign", "08-01-01", "20180713T133634.985 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_5 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY URLENCODEDVALUE #20180713T131553.626 GMT", "urlEncodedValue", "Pega-WB", "08-01-01", "20180713T131553.626 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY FINDWORKGADGET #20200706T115109.788 GMT", "FindWorkGadget", "Pega-EndUserUI", "08-05-01", "20200706T115109.788 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY GETLOCALIZEDVALUE #20180713T133433.079 GMT", "GetLocalizedValue", "Pega-Gadgets", "08-01-01", "20180713T133433.079 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SPLITBUTTONINCLUDES #20180713T131549.342 GMT", "SplitButtonIncludes", "Pega-WB", "08-01-01", "20180713T131549.342 GMT");
}
