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
import com.pega.pegarules.jsptags.WhenTag;
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
 * Builds JSP stream PZ_PYOWNER_CONTROL.
 */
public class ra_stream_pz_pyowner_control_6c3531c933649ef738f02f71db746c40 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pz_pyOwner_Control.Stream");
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
	public ra_stream_pz_pyowner_control_6c3531c933649ef738f02f71db746c40(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "6bb57e7efacb33351283e45b8ed64147a44fcafb";
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
/* Instance RULE-HTML-PROPERTY PZ_PYOWNER_CONTROL #20180713T131328.302 GMT	Pega-RULES:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZ_PYOWNER_CONTROL #20180713T131328.302 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZ_PYOWNER_CONTROL #20180713T131328.302 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_11();

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
/* end RULE-HTML-PROPERTY PZ_PYOWNER_CONTROL #20180713T131328.302 GMT */
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
	"Rule-Obj-FieldValue:PYMESSAGELABEL!LOADING...", 
	"Rule-File-Text:WEBWB!SMARTINFOPOPUP!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_SMARTINFO!JS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:PZSETSTRLOADMSG", 
	"Rule-HTML-Fragment:SMARTINFOPOPUPINCLUDE", 
	"Rule-Obj-Property:PYMESSAGELABEL", 
	"Rule-HTML-Property:ATTRIBUTES", 
	"Rule-HTML-Property:PZ_PYOWNER_CONTROL", 
	"Rule-HTML-Property:DEFAULT", 
	"Rule-HTML-Property:RM_OWNERFORUSECASE", 
	"Rule-HTML-Property:MESSAGES", 
	"Rule-HTML-Property:STARTSMARTFIELD", 
	"Rule-HTML-Property:ENDSMARTFIELD", 
	"Rule-HTML-Property:CLIENTVALIDATION", 
	"Rule-HTML-Property:RM_OWNER"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYMESSAGELABEL!LOADING...","Rule-Obj-FieldValue","@BASECLASS",true,"Code-Pega-Requestor","Pega-WB","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYMESSAGELABEL!LOADING... #20180713T131654.066 GMT","!PYMESSAGELABEL!LOADING...",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("WEBWB!SMARTINFOPOPUP!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB SMARTINFOPOPUP!JS #20180713T133429.322 GMT","WEBWB!SMARTINFOPOPUP!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_SMARTINFO!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_UI_SMARTINFO!JS #20200214T063824.395 GMT","WEBWB!PZPEGA_UI_SMARTINFO!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZSETSTRLOADMSG","Rule-HTML-Fragment","",false,"","Pega-Gadgets","08-05-01","RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT","PZSETSTRLOADMSG",true,false,"ABSOLUTE_CLASSLESS",896523198), 
		new DependentRuleInfo("SMARTINFOPOPUPINCLUDE","Rule-HTML-Fragment","",false,"","Pega-Gadgets","08-05-01","RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT","SMARTINFOPOPUPINCLUDE",true,false,"ABSOLUTE_CLASSLESS",623244020), 
		new DependentRuleInfo("PYMESSAGELABEL","Rule-Obj-Property","@BASECLASS",true,"Code-Pega-Requestor","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYMESSAGELABEL #20180713T131842.875 GMT","!PYMESSAGELABEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("ATTRIBUTES","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT","ATTRIBUTES",true,false,"ABSOLUTE_CLASSLESS",-1186972501), 
		new DependentRuleInfo("PZ_PYOWNER_CONTROL","Rule-HTML-Property","",false,"","Pega-RULES","08-01-01","RULE-HTML-PROPERTY PZ_PYOWNER_CONTROL #20180713T131328.302 GMT","PZ_PYOWNER_CONTROL",true,false,"ABSOLUTE_CLASSLESS",-803538580), 
		new DependentRuleInfo("DEFAULT","Rule-HTML-Property","",false,"","Pega-Gadgets","08-04-01","RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT","DEFAULT",true,false,"ABSOLUTE_CLASSLESS",-1270549771), 
		new DependentRuleInfo("RM_OWNERFORUSECASE","Rule-HTML-Property","",false,"","Pega-AppDefinition","08-03-01","RULE-HTML-PROPERTY RM_OWNERFORUSECASE #20190214T114219.706 GMT","RM_OWNERFORUSECASE",true,false,"ABSOLUTE_CLASSLESS",-1368579626), 
		new DependentRuleInfo("MESSAGES","Rule-HTML-Property","",false,"","Pega-UIDesign","08-01-01","RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT","MESSAGES",true,false,"ABSOLUTE_CLASSLESS",-794757422), 
		new DependentRuleInfo("STARTSMARTFIELD","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT","STARTSMARTFIELD",true,false,"ABSOLUTE_CLASSLESS",-1437336844), 
		new DependentRuleInfo("ENDSMARTFIELD","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT","ENDSMARTFIELD",true,false,"ABSOLUTE_CLASSLESS",1047137300), 
		new DependentRuleInfo("CLIENTVALIDATION","Rule-HTML-Property","",false,"","Pega-UIEngine","08-02-01","RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT","CLIENTVALIDATION",true,false,"ABSOLUTE_CLASSLESS",1287463259), 
		new DependentRuleInfo("RM_OWNER","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY RM_OWNER #20180713T132013.096 GMT","RM_OWNER",true,false,"ABSOLUTE_CLASSLESS",-1479009557)
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
//	RULE-HTML-PROPERTY PZ_PYOWNER_CONTROL #20180713T131328.302 GMT:20180713T131328.302 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY RM_OWNERFORUSECASE #20190214T114219.706 GMT:20190214T114219.706 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT:20180713T133634.985 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT:20181008T083757.252 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY RM_OWNER #20180713T132013.096 GMT:20180713T132013.096 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT:20190614T125129.697 GMT
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
//	RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT:20180713T133432.763 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT:20180713T132011.328 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "dd35622c5396b569fc3328a378655a7a";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
private static final String[] showMeParams_5 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Property", "Final", "", "Pega-Gadgets", "08-04-01", "", "Default", "", "RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT" };
private boolean when_11(String aParam1, String aParam2, String aParam3, String aParam4) throws Throwable {
	return (pega.isPreviewMode() || (((((((!(tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam1), aParam2))))) || (((((tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam3), aParam4)))))))));
}
private void performStream_9() throws Throwable {
	if (when_11("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString(" </span> ");
	}
tools.appendString(" ");
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
	oStreamProperties_11.put("pzInsKey", "RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT");
	oStreamProperties_11.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_11.put("pyCircumstanceDate", "");
	oStreamProperties_11.put("pyRuleEnds", "");
	oStreamProperties_11.put("pyRuleStarts", "");
	oStreamProperties_11.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_11.put("pyXMLType", "");
	oStreamProperties_11.put("pyRuleSet", "Pega-ProCom");
	oStreamProperties_11.put("pyCorrType", "");
	oStreamProperties_11.put("pyStreamName", "EndSmartField");
	oStreamProperties_11.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Data_Admin_System_Settings_EndSmartField
 */
private void property_Data_Admin_System_Settings_EndSmartField() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT
 * Set up context.
 */
final String prevRuleKey_11 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT";final String prevClass_11 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_11 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_11);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_11);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_10)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_9();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_11);
	mStreamResponse.setJspBaseClass(prevClass_11);
	pz_CurrentRuleKey = prevRuleKey_11;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_10,true);
}
/* end RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT
 */
private void include_9() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_System_Settings_EndSmartField();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_10(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue(aParam1), aParam2)));
}
private boolean when_9(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(lookupThisDefinition(tools, aParam1), aParam2)));
}
private boolean when_8(String aParam1) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getActiveValue(), aParam1)));
}
private void performStream_8() throws Throwable {
tools.appendString(" ");
	boolean foundChoice_15 = false;
tools.appendString(" ");
if (!foundChoice_15 && (pega.isPreviewMode() || !tools.getDictionary().fromDefinition(tools.getActive(), "pyExpectedSize").equals(""))) {
tools.appendString("  ");
 
	/*tools.putSaveValue("pzResult", ""); //Bug-11491 : reset the save variable*/ //moved it to the default HTML property
	float expSize = 0;
	try{
		expSize  = (float)Integer.parseInt(tools.getDictionary().fromDefinition(tools.getActive(), "pyExpectedSize"));
		expSize += java.lang.Math.ceil(expSize*20/100);
	} catch(NumberFormatException e){
		/* Use zero. */
	}
	tools.putSaveValue("strExpectedSize",String.valueOf(expSize));
	
tools.appendString(" ");

foundChoice_15 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_15 && when_3("Size", "")) {
tools.appendString(" ");
pzAuto.putSaveRef("strExpectedSize", "param.Size", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

foundChoice_15 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_15) {
tools.appendString(" ");
tools.putSaveValue("strExpectedSize", "20");
tools.appendString(" ");
}
tools.appendString("  ");
pzAuto.putSaveRef("strWidth", "param.Width", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

String cssWidth = tools.getSaveValue("strWidth");
try {
	if(cssWidth!= null && cssWidth.trim().length() != 0) {
		int cssWidthNumericValue = Integer.parseInt(cssWidth);
		
		if(cssWidthNumericValue !=0){
			cssWidth = cssWidthNumericValue + "px";
		}
	}
} catch( NumberFormatException ex) {
}

tools.putSaveValue("cssWidth", cssWidth);

tools.appendString(" ");
pzAuto.putSaveRef("strExpectedWidth", "param.Width", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
	
	String strEnteredSize = StringUtils.crossScriptingFilter(tools.getSaveValue("strExpectedSize"));
	String strEnteredWidth = StringUtils.crossScriptingFilter(tools.getSaveValue("cssWidth"));
	if(!tools.getParamValue("bNoSize").equals("true"))
		tools.appendString("size='" + strEnteredSize + "' ");
	if( (!tools.getParamValue("bNoWidth").equals("true")) && (strEnteredWidth != "") )
		tools.appendString("style='width:" + strEnteredWidth + "' ");

	tools.putParamValue("bNoSize", "false");
	tools.putParamValue("bNoWidth", "false");

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
	oStreamProperties_10.put("pzInsKey", "RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT");
	oStreamProperties_10.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_10.put("pyCircumstanceDate", "");
	oStreamProperties_10.put("pyRuleEnds", "");
	oStreamProperties_10.put("pyRuleStarts", "");
	oStreamProperties_10.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_10.put("pyXMLType", "");
	oStreamProperties_10.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_10.put("pyCorrType", "");
	oStreamProperties_10.put("pyStreamName", "Attributes");
	oStreamProperties_10.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Data_Admin_System_Settings_Attributes
 */
private void property_Data_Admin_System_Settings_Attributes() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT
 * Set up context.
 */
final String prevRuleKey_10 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT";final String prevClass_10 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT
 */
private void include_8() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_System_Settings_Attributes();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_7(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_4() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_7("SmartInfoHeader", "")) {
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
private boolean when_6(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (((tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam1), aParam2))));
}
private boolean when_5(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || ((((!(tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam1), aParam2))))));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_3() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
tools.appendString(" ");
if (!foundChoice && when_5("ReadOnlySmartInfo", "")) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartInfoSection", "param.ReadOnlySmartInfo", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
tools.appendString(" ");
if (!foundChoice && when_6("ReadWriteSmartInfo", "")) {
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
private static final String[] showMeParams_4 = {
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
private static final String[] showMeParams_3 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYMESSAGELABEL!LOADING... #20180713T131654.066 GMT", "Rule-Obj-FieldValue", "Pega-WB", "pyMessageLabel", "Code-Pega-Requestor", "Loading..." };
private void performStream_5() throws Throwable {
tools.appendString("<script> var strLoadMsg = \"");

/* Field value Code-Pega-Requestor pxRequestor.pyMessageLabel Loading... */
if (mInline_pxRequestor) {
	out.write("Loading...");
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_3);
} else {
if (_jspx_meth_pega_lookup__1(pageContext, "pxRequestor.pyMessageLabel", "Loading...")) {
	return;
}
}
tools.appendString("\"; </script>");
}
private static final Map oPropDefinitions_9 = new HashMap();
static {
	oPropDefinitions_9.put("Code-Pega-Requestor.pyMessageLabel", new LiteweightPropertyDefinition("Code-Pega-Requestor", "pyMessageLabel", "siN", false, true, "Default", false));
}
private static final Map oStreamProperties_9 = new HashMap();
static {
	oStreamProperties_9.put("pyRuleAvailable", "Final");
	oStreamProperties_9.put("pyCircumstanceDateProp", "");
	oStreamProperties_9.put("pyCircumstanceVal", "");
	oStreamProperties_9.put("pyMethodStatus", "Internal");
	oStreamProperties_9.put("pyClassName", "");
	oStreamProperties_9.put("pyCircumstanceProp", "");
	oStreamProperties_9.put("pzInsKey", "RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT");
	oStreamProperties_9.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_9.put("pyCircumstanceDate", "");
	oStreamProperties_9.put("pyRuleEnds", "");
	oStreamProperties_9.put("pyRuleStarts", "");
	oStreamProperties_9.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_9.put("pyXMLType", "");
	oStreamProperties_9.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_9.put("pyCorrType", "");
	oStreamProperties_9.put("pyStreamName", "pzSetStrLoadMsg");
	oStreamProperties_9.put("pyRuleSetVersion", "08-05-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT
 */
private void include_5() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT	Pega-Gadgets:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT
 * Set up context.
 */
final String prevRuleKey_9 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT";final String prevClass_9 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_8)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_5();

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
include_5();

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
private void performStream_6() throws Throwable {
onlyOnce_1();
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
	oStreamProperties_8.put("pzInsKey", "RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT");
	oStreamProperties_8.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_8.put("pyCircumstanceDate", "");
	oStreamProperties_8.put("pyRuleEnds", "");
	oStreamProperties_8.put("pyRuleStarts", "");
	oStreamProperties_8.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_8.put("pyXMLType", "");
	oStreamProperties_8.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_8.put("pyCorrType", "");
	oStreamProperties_8.put("pyStreamName", "SmartInfoPopupInclude");
	oStreamProperties_8.put("pyRuleSetVersion", "08-05-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT
 */
private void include_6() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT	Pega-Gadgets:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT
 * Set up context.
 */
final String prevRuleKey_8 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT";final String prevClass_8 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_7)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_6();

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
/* end RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_4);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_4(String aParam1, String aParam2, String aParam3, String aParam4) throws Throwable {
	return (pega.isPreviewMode() || ((!areValsEqual(tools.getParamValue(aParam1), aParam2)) || (!areValsEqual(tools.getParamValue(aParam3), aParam4))));
}
private void performStream_7() throws Throwable {
	if (when_4("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT */
include_6();

tools.appendString(" ");
	}
tools.appendString(" ");
choose_3();
tools.appendString("  ");
choose_4();
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
private static final Map oPropDefinitions_7 = null;
private static final Map oStreamProperties_7 = new HashMap();
static {
	oStreamProperties_7.put("pyRuleAvailable", "Final");
	oStreamProperties_7.put("pyCircumstanceDateProp", "");
	oStreamProperties_7.put("pyCircumstanceVal", "");
	oStreamProperties_7.put("pyMethodStatus", "Internal");
	oStreamProperties_7.put("pyClassName", "");
	oStreamProperties_7.put("pyCircumstanceProp", "");
	oStreamProperties_7.put("pzInsKey", "RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT");
	oStreamProperties_7.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_7.put("pyCircumstanceDate", "");
	oStreamProperties_7.put("pyRuleEnds", "");
	oStreamProperties_7.put("pyRuleStarts", "");
	oStreamProperties_7.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_7.put("pyXMLType", "");
	oStreamProperties_7.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_7.put("pyCorrType", "");
	oStreamProperties_7.put("pyStreamName", "StartSmartField");
	oStreamProperties_7.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Data_Admin_System_Settings_StartSmartField
 */
private void property_Data_Admin_System_Settings_StartSmartField() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT
 * Set up context.
 */
final String prevRuleKey_7 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT";final String prevClass_7 = mStreamResponse.getJspBaseClass();
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

	performStream_7();

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
/* end RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT
 */
private void include_7() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_System_Settings_StartSmartField();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_10() throws Throwable {
 
       tools.putSaveValue("pzResult", ""); /*Bug-11491 : reset the save variable*/
	   String tooltip = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyToolTip",tools.getParamValue("ToolTip")));

	if (pega.isPreviewMode() || ((areValsEqual(tools.getSaveValue("prepareForDataGrid"), "true")) && ((tools.useModeInput())))) {
tools.appendString("<script> function Default_getValue(){ ");
	boolean foundChoice_8 = false;
tools.appendString(" ");
if (!foundChoice_8 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TRUEFALSE)))) {
tools.appendString(" var ID=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("true\"; var field = document.getElementById(ID); if (field.checked){ return true; } else{ return false; } ");

foundChoice_8 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_8) {
tools.appendString(" var ID=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\"; var field = document.getElementById(ID); if (field){ return field.value; } else{ return \"\"; } ");
}
tools.appendString("  } function Default_setValue(val){ ");
	boolean foundChoice_9 = false;
tools.appendString(" ");
if (!foundChoice_9 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TRUEFALSE)))) {
tools.appendString(" var ID=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\"+ val; var field = document.getElementById(ID); if (field){ field.checked = true; } ");

foundChoice_9 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_9) {
tools.appendString(" var ID=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\"; var field = document.getElementById(ID); if (field){ field.value = val; } ");
}
tools.appendString("  } function Default_setFocus(){ ");
	boolean foundChoice_10 = false;
tools.appendString(" ");
if (!foundChoice_10 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TRUEFALSE)))) {
tools.appendString(" var ID=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("true\"; ");

foundChoice_10 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_10) {
tools.appendString(" var ID=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\"; ");
}
tools.appendString("  var field = document.getElementById(ID); if (field && (field.tagName == \"INPUT\") || (field.tagName == \"input\")){ field.focus(); } } </script>");
	}
	if (pega.isPreviewMode() || !tools.getParamValue("ReadOnlySmartInfo").equals("") || !tools.getParamValue("ReadWriteSmartInfo").equals("")) {
/* Include stream RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT */
include_7();

	}
	boolean foundChoice_11 = false;
if (!foundChoice_11 && (WhenTag.evaluateWhen(pega, "$this:isScalar", null, false))) {
	boolean foundChoice_12 = false;
if (!foundChoice_12 && (pega.isPreviewMode() || (((!(tools.useModeInput())))))) {
	boolean foundChoice_13 = false;
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_PASSWORD)))) {
 
							int  idx = tools.getActiveValue().length();
							while (idx-- > 0) tools.appendString("*");
						

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DATE)))) {
 
							java.util.Date theDate = null;
							if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue()) {
								try {
									theDate = tools.getActive().toDate();
								} catch (com.pega.pegarules.pub.clipboard.InvalidValueException ive ) {
									theDate = null;
									throw ive;
								} finally {
									if (theDate !=null) {
										tools.appendString(PRDateFormat.format(null,"GMT", PRDateFormat.DEFAULT_DATE_DEFAULT, theDate));
									} else {
										tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
									}
								}
							}
						

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TIMEOFDAY)))) {
 
							if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
								java.util.Date theDate = null;
								try {
									theDate = tools.getActive().toDate();
								} catch( com.pega.pegarules.pub.clipboard.InvalidValueException ive ) {
									theDate = null;
									throw ive;
								} finally {
									if (theDate !=null) {
										tools.appendString(PRDateFormat.format(null,"GMT", PRDateFormat.DEFAULT_TIME_DEFAULT, theDate));
									} else {
										tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
									}
								}
							}
						

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DATETIME)))) {
tools.appendString(" ");
 
							if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
								java.util.Date theDate = null;
								try {
									theDate = tools.getActive().toDate();
								} catch( com.pega.pegarules.pub.clipboard.InvalidValueException ive ) {
									theDate = null;
								} finally {
									if (theDate !=null) {
										tools.appendString(PRDateFormat.format(null,null, PRDateFormat.DEFAULT_DATETIME_DEFAULT, theDate));
									} else {
										tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
									}
								}
							}
						

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DECIMAL)))) {
 
							if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
								ClipboardProperty myProp = tools.getActive();
								com.pega.ibm.icu.math.BigDecimal value = myProp.toBigDecimal();
								int decimalPrecision = myProp.getDecimalPrecision();
								tools.appendString(PRNumberFormat.format(null, PRNumberFormat.DEFAULT_DECIMAL, false, null, decimalPrecision,value));
							} else {
								tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
							}
						

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DOUBLE)))) {
 
							if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
								ClipboardProperty myProp = tools.getActive();
								double value = myProp.toDouble();
								int decimalPrecision = myProp.getDecimalPrecision();
								tools.appendString(PRNumberFormat.format(null, PRNumberFormat.DEFAULT_DECIMAL, false, null, decimalPrecision,value));
							} else {
								tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
							}
						

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_NUMBER)))) {
 
							if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
								double value = tools.getActive().toInteger();
								tools.appendString(PRNumberFormat.format(null, PRNumberFormat.DEFAULT_INTEGER, false, null, value));
							} else {
								tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
							}
						

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_AMOUNT)))) {
 
							ClipboardProperty baseProp = tools.getActive();
							String curr = null;
							if(tools.getDictionary().hasQualifier(baseProp,"pyCurrency") ) {
								ClipboardProperty prop = tools.getDictionary().getPropertyViaQualifier(baseProp, "pyCurrency");
								if(prop != null)
									curr = prop.getStringValue();
							}
							if( tools.getActiveValue().length() > 0 && baseProp.hasValidValue() ) {
								ClipboardProperty myProp = tools.getActive();
								com.pega.ibm.icu.math.BigDecimal value = myProp.toBigDecimal();
								int decimalPrecision = myProp.getDecimalPrecision();
								tools.appendString(PRNumberFormat.format(null, PRNumberFormat.DEFAULT_CURRENCY, false, null, decimalPrecision,value)); 
							} else {
								tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
							}
						

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13) {
out.print(StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",tools.getActiveValue(),StreamBuilder.FMT_LITERAL)));
}

foundChoice_12 = !pega.isPreviewMode();
}
if (!foundChoice_12) {
tools.appendString("<SPAN nowrap>");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_1();

	boolean foundChoice_14 = false;
if (!foundChoice_14 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TEXT)))) {
tools.appendString("<input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_8();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"leftJustifyStyle\" type=\"text\"");
	if (when_8("")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
	if (when_9("pyMaxLength", "")) {
tools.appendString("maxlength=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyMaxLength)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString("name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_14 = !pega.isPreviewMode();
}
if (!foundChoice_14 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DECIMAL)))) {
 
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
									ClipboardProperty myProp = tools.getActive();
									com.pega.ibm.icu.math.BigDecimal value = myProp.toBigDecimal();
									int decimalPrecision = myProp.getDecimalPrecision();
									tools.putSaveValue("pzResult", PRNumberFormat.format(null, PRNumberFormat.DEFAULT_DECIMAL, false, null, decimalPrecision,value));
								} else 
									tools.putSaveValue("pzResult", tools.getActiveValue());
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_8();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"rightJustifyStyle\" type=\"text\"");
	if (when_10("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
	if (when_9("pyMaxLength", "")) {
tools.appendString("maxlength=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyMaxLength)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString(" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_14 = !pega.isPreviewMode();
}
if (!foundChoice_14 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DOUBLE)))) {
 
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
									ClipboardProperty myProp = tools.getActive();
									double value = myProp.toDouble();
									int decimalPrecision = myProp.getDecimalPrecision();
									tools.putSaveValue("pzResult", PRNumberFormat.format(null, PRNumberFormat.DEFAULT_DECIMAL, false, null, decimalPrecision,value));
								} else 
									tools.putSaveValue("pzResult", tools.getActiveValue());
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_8();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"rightJustifyStyle\" type=\"text\"");
	if (when_10("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
	if (when_9("pyMaxLength", "")) {
tools.appendString("maxlength=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyMaxLength)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString("name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\"> ");

foundChoice_14 = !pega.isPreviewMode();
}
if (!foundChoice_14 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TRUEFALSE)))) {
tools.appendString("<input ");
out.print( tools.getActive().toBoolean() ? "checked" : "" );
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("true\" type=radio value=\"true\" class=\"Radio\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\"> <label for=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("true\">True</label> <input ");
out.print( tools.getActive().toBoolean() ? "" : "checked" );
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("false\" type=radio value=\"false\" class=\"Radio\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\"> <label for=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("false\">False</label>");

foundChoice_14 = !pega.isPreviewMode();
}
if (!foundChoice_14 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_PASSWORD)))) {
tools.appendString("<input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_8();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" type=password value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\" class=\"leftJustifyStyle\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_14 = !pega.isPreviewMode();
}
if (!foundChoice_14 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DATE)))) {
tools.appendString(" ");
 
								java.util.Date theDate = null;
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue()) {
									try {
										theDate = tools.getActive().toDate();
									} catch( com.pega.pegarules.pub.clipboard.InvalidValueException ive ) {
										theDate = null;
										throw ive;
									} finally {
										if (theDate !=null) 
											tools.putSaveValue("pzResult", PRDateFormat.format(null,"GMT", PRDateFormat.DEFAULT_DATE_DEFAULT, theDate));
										else 
											tools.putSaveValue("pzResult", tools.getActiveValue());
									}
								}
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_8();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"leftJustifyStyle\" type=\"text\"");
	if (when_10("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString(" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_14 = !pega.isPreviewMode();
}
if (!foundChoice_14 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TIMEOFDAY)))) {
 
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue()) {
									java.util.Date theDate = null;
									try {
										theDate = tools.getActive().toDate();
									} catch( com.pega.pegarules.pub.clipboard.InvalidValueException ive ) {
										theDate = null;
										throw ive;
									} finally {
										if (theDate !=null) 
											tools.putSaveValue("pzResult", PRDateFormat.format(null,"GMT", PRDateFormat.DEFAULT_TIME_DEFAULT, theDate));
										else 
											tools.putSaveValue("pzResult", tools.getActiveValue());
									}
								}
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_8();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"leftJustifyStyle\" type=\"text\"");
	if (when_10("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString("name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_14 = !pega.isPreviewMode();
}
if (!foundChoice_14 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DATETIME)))) {
 
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue()) {
									java.util.Date theDate = null;
									try  {
										theDate = tools.getActive().toDate();
									} catch( com.pega.pegarules.pub.clipboard.InvalidValueException ive ) {
										theDate = null;
									} finally {
										if (theDate !=null) 
											tools.putSaveValue("pzResult", PRDateFormat.format(null,null, PRDateFormat.DEFAULT_DATETIME_DEFAULT, theDate));
										else 	
											tools.putSaveValue("pzResult", tools.getActiveValue());
									}
								}
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_8();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"leftJustifyStyle\" type=\"text\"");
	if (when_10("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString("name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_14 = !pega.isPreviewMode();
}
if (!foundChoice_14 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_NUMBER)))) {
 
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
									double value = tools.getActive().toInteger();
									tools.putSaveValue("pzResult", PRNumberFormat.format(null, PRNumberFormat.DEFAULT_INTEGER, false, null, value));
								} else 
									tools.putSaveValue("pzResult", tools.getActiveValue());
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_8();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"rightJustifyStyle\" type=\"text\"");
	if (when_10("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString(" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_14 = !pega.isPreviewMode();
}
if (!foundChoice_14 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_AMOUNT)))) {
tools.appendString(" ");
 
								ClipboardProperty baseProp = tools.getActive();
								String curr = null;
								if(tools.getDictionary().hasQualifier(baseProp,"pyCurrency") ) {
									ClipboardProperty prop = tools.getDictionary().getPropertyViaQualifier(baseProp, "pyCurrency");
									if(prop != null)
										curr = prop.getStringValue();
								}
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
									ClipboardProperty myProp = tools.getActive();
									com.pega.ibm.icu.math.BigDecimal value = myProp.toBigDecimal();
									int decimalPrecision = myProp.getDecimalPrecision();
									tools.putSaveValue("pzResult", PRNumberFormat.format(null, PRNumberFormat.DEFAULT_CURRENCY, false, null, decimalPrecision,value)); 
								} else 
									tools.putSaveValue("pzResult", tools.getActiveValue());
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_8();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"rightJustifyStyle\" type=\"text\"");
	if (when_10("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString(" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\">");

foundChoice_14 = !pega.isPreviewMode();
}
if (!foundChoice_14) {
tools.appendString("<input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_8();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"leftJustifyStyle\" type=\"text\"");
	if (when_8("")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString("name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");
}
tools.appendString("</SPAN>");
}

foundChoice_11 = !pega.isPreviewMode();
}
if (!foundChoice_11) {
}
tools.appendString(" ");
	if (pega.isPreviewMode() || !tools.getParamValue("ReadOnlySmartInfo").equals("") || !tools.getParamValue("ReadWriteSmartInfo").equals("")) {
/* Include stream RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT */
include_9();

	}
}
private static final Map oPropDefinitions_6 = null;
private static final Map oStreamProperties_6 = new HashMap();
static {
	oStreamProperties_6.put("pyRuleAvailable", "Final");
	oStreamProperties_6.put("pyCircumstanceDateProp", "");
	oStreamProperties_6.put("pyCircumstanceVal", "");
	oStreamProperties_6.put("pyMethodStatus", "");
	oStreamProperties_6.put("pyClassName", "");
	oStreamProperties_6.put("pyCircumstanceProp", "");
	oStreamProperties_6.put("pzInsKey", "RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT");
	oStreamProperties_6.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_6.put("pyCircumstanceDate", "");
	oStreamProperties_6.put("pyRuleEnds", "");
	oStreamProperties_6.put("pyRuleStarts", "");
	oStreamProperties_6.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_6.put("pyXMLType", "");
	oStreamProperties_6.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_6.put("pyCorrType", "");
	oStreamProperties_6.put("pyStreamName", "Default");
	oStreamProperties_6.put("pyRuleSetVersion", "08-04-01");
}
/**
 * Generates stream property_Data_Admin_System_Settings_Default
 */
private void property_Data_Admin_System_Settings_Default() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT	Pega-Gadgets:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT
 * Set up context.
 */
final String prevRuleKey_6 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT";final String prevClass_6 = mStreamResponse.getJspBaseClass();
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

	performStream_10();

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
/* end RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT
 */
private void include_10() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_System_Settings_Default();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_5);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private static final String[] showMeParams_2 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Property", "Yes", "", "Pega-ProCom", "08-01-01", "", "RM_Owner", "", "RULE-HTML-PROPERTY RM_OWNER #20180713T132013.096 GMT" };
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1()) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-value"
 */
if (_jspx_meth_pega_r__1(pageContext, "$this-value")) {
	return;
}
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString("  <SPAN nowrap> ");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_1();

tools.appendString(" <INPUT ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString(" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" type=\"text\" value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\" size=\"40\" maxlength=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-definition(.pyMaxLength)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-definition(.pyMaxLength)")) {
	return;
}
tools.appendString("\" ID=\"pyOwnerOrg\" ISNS_FIELDTYPE=\"RULEKEY\" ISNS_POPUPTYPE=\"DIV\" ISNS_DATANODE=\"pyPurpose\" ISNS_TTIPNODE=\"pyLabel\" ISNS_CLASS=\"Rule-Circumstance-Template\" ONFOCUS=\"zUtil_SmartPromptFocusHandler()\" CLASS=\"InputIntellisenseStyle\" ISNS_MYQUERY=\"\" ISNS_TTIPNODE=\"pyLabel\" ISNS_BASECLASS=\"pyClassName\" AUTOCOMPLETE=\"off\"> </SPAN> ");
}
}
private void performStream_4() throws Throwable {
choose_2();
tools.appendString("  ");
}
private static final Map oPropDefinitions_5 = null;
private static final Map oStreamProperties_5 = new HashMap();
static {
	oStreamProperties_5.put("pyRuleAvailable", "Yes");
	oStreamProperties_5.put("pyCircumstanceDateProp", "");
	oStreamProperties_5.put("pyCircumstanceVal", "");
	oStreamProperties_5.put("pyMethodStatus", "");
	oStreamProperties_5.put("pyClassName", "");
	oStreamProperties_5.put("pyCircumstanceProp", "");
	oStreamProperties_5.put("pzInsKey", "RULE-HTML-PROPERTY RM_OWNER #20180713T132013.096 GMT");
	oStreamProperties_5.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_5.put("pyCircumstanceDate", "");
	oStreamProperties_5.put("pyRuleEnds", "");
	oStreamProperties_5.put("pyRuleStarts", "");
	oStreamProperties_5.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_5.put("pyXMLType", "");
	oStreamProperties_5.put("pyRuleSet", "Pega-ProCom");
	oStreamProperties_5.put("pyCorrType", "");
	oStreamProperties_5.put("pyStreamName", "RM_Owner");
	oStreamProperties_5.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Data_Admin_System_Settings_RM_Owner
 */
private void property_Data_Admin_System_Settings_RM_Owner() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY RM_OWNER #20180713T132013.096 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY RM_OWNER #20180713T132013.096 GMT
 * Set up context.
 */
final String prevRuleKey_5 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY RM_OWNER #20180713T132013.096 GMT";final String prevClass_5 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_5 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_5);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_5);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
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
	mStreamResponse.setPropertyDefinitions(prevPropDefs_5);
	mStreamResponse.setJspBaseClass(prevClass_5);
	pz_CurrentRuleKey = prevRuleKey_5;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_4,true);
}
/* end RULE-HTML-PROPERTY RM_OWNER #20180713T132013.096 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY RM_OWNER #20180713T132013.096 GMT
 */
private void include_4() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_System_Settings_RM_Owner();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_2);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private static final String[] showMeParams_1 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Property", "Yes", "", "Pega-AppDefinition", "08-03-01", "", "RM_OwnerForUseCase", "", "RULE-HTML-PROPERTY RM_OWNERFORUSECASE #20190214T114219.706 GMT" };
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
private boolean when_3(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_2("bAddedValidationType", "true")) {
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
private void performStream_2() throws Throwable {
tools.appendString(" ");
out.print( tools.getParamValue("pega_attributes") );
tools.appendString(" ");

  String mode1 = tools.getSaveValue("mode1Action");
  String mode2 = tools.getSaveValue("mode2Action");

tools.appendString(" ");
	boolean foundChoice_5 = false;
tools.appendString(" ");
if (!foundChoice_5 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString(" ");
out.print(mode1);
tools.appendString(" ");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_5) {
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
	boolean foundChoice_6 = false;
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || isValidation == true)) {
tools.appendString("  ");
tools.putSaveValue("bAddedValidationType", "false");
tools.appendString(" ");
	boolean foundChoice_7 = false;
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || (areValsEqual(lookupThisDefinition(tools, "pyOnInput"), "")))) {
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
choose_1();
tools.appendString("  ");
pzAuto.putSaveValue("validationAttributes",   tools.getDictionary().fromDefinition(tools.getActive(), "pyStringType").toLowerCase() , IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_3("pega_validation", "")) {
tools.appendString("  ");
choose_1();
tools.appendString("  ");
pzAuto.putSaveRef("validationAttributes", "param.pega_validation", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_2("bAddedValidationType", "true")) {
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes", "\'", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7) {
tools.appendString(" ");
	if (when_3("pega_validation", "")) {
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

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6) {
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
private static final Map oPropDefinitions_4 = null;
private static final Map oStreamProperties_4 = new HashMap();
static {
	oStreamProperties_4.put("pyRuleAvailable", "Final");
	oStreamProperties_4.put("pyCircumstanceDateProp", "");
	oStreamProperties_4.put("pyCircumstanceVal", "");
	oStreamProperties_4.put("pyMethodStatus", "Internal");
	oStreamProperties_4.put("pyClassName", "");
	oStreamProperties_4.put("pyCircumstanceProp", "");
	oStreamProperties_4.put("pzInsKey", "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT");
	oStreamProperties_4.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_4.put("pyCircumstanceDate", "");
	oStreamProperties_4.put("pyRuleEnds", "");
	oStreamProperties_4.put("pyRuleStarts", "");
	oStreamProperties_4.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_4.put("pyXMLType", "");
	oStreamProperties_4.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_4.put("pyCorrType", "");
	oStreamProperties_4.put("pyStreamName", "ClientValidation");
	oStreamProperties_4.put("pyRuleSetVersion", "08-02-01");
}
/**
 * Generates stream property_Data_Admin_System_Settings_ClientValidation
 */
private void property_Data_Admin_System_Settings_ClientValidation() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT	Pega-UIEngine:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 * Set up context.
 */
final String prevRuleKey_4 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT";final String prevClass_4 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_System_Settings_ClientValidation();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_2(String aParam1, String aParam2) throws Throwable {
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
private void performStream_1() throws Throwable {


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
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "");
tools.appendString(" ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "inputErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "inputError");
tools.appendString(" ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3) {
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
	if (when_2("parentLayoutVal", "SIMPLELAYOUT")) {
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
	if (when_2("parentLayoutVal", "SIMPLELAYOUT")) {
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
	if (when_2("isBad", "true")) {
tools.appendString(" id=\"PegaRULESErrorFlag\" ");
	}
tools.appendString(" > ");
	boolean foundChoice_4 = false;
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" <b style=\"font-family: wingdings;color:red;cursor:hand\">x</b> ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString("  </span> </div> ");
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
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-UIDesign");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "Messages");
	oStreamProperties_3.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Data_Admin_System_Settings_Messages
 */
private void property_Data_Admin_System_Settings_Messages() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT	Pega-UIDesign:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
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

	performStream_1();

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
/* end RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_System_Settings_Messages();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:r tag.
 */private boolean _jspx_meth_pega_r__1(PageContext aPageContext, java.lang.String aN) throws Throwable {
/* pega:r */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_r_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_r_.setPageContext(pageContext);
_jspx_th_pega_r_.setParent(mParentTag);
_jspx_th_pega_r_.setN(aN);
int _jspx_eval_pega_r_ = _jspx_th_pega_r_.doStartTag();
if (_jspx_th_pega_r_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_r_);
return false;
}
private boolean when_1() throws Throwable {
	return (pega.isPreviewMode() || (((!(tools.useModeInput())))));
}
private void performStream_3() throws Throwable {
	boolean foundChoice_2 = false;
tools.appendString("\n");
if (!foundChoice_2 && when_1()) {
tools.appendString("\n  ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-value"
 */
if (_jspx_meth_pega_r__1(pageContext, "$this-value")) {
	return;
}
tools.appendString("\n");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice_2) {
tools.appendString("\n  \n\n  <script>\n    function getProductName(){\n\tvar productName = \"\";\n\tvar productEle = document.getElementById('pyProductName');\n\tif(productEle!=null && productEle!='undefined'){\n\t\tproductName = productEle.value;\n\t}         \n      \n  ");

          String params = "pyActivity=Rule-Application.RetrieveApplicationMetadata";
          String encryptedAction = pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", params);
  
tools.appendString("\n\tvar queryToFire = \"&");
out.print(encryptedAction);
tools.appendString("&pyMetaDataType=pyWorkMetaData&pyApplicationName=\" + productName;\n\n         try {\n            //document.getElementById('pyOwnerId').ISNS_MYQUERY = queryToFire;\n            document.getElementById('pyOwnerId').setAttribute(\"ISNS_MYQUERY\", queryToFire);\n         }\n         catch (err) {\n            //Nothing\n         }\n    }\n  </script>\n\n\n  <SPAN nowrap>\n  ");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_1();

tools.appendString("\n    <INPUT\n      ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_2();

tools.appendString("\n      name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\"\n      type=\"text\"\n      value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\" \n      size=\"40\"\n      maxlength=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-definition(.pyMaxLength)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-definition(.pyMaxLength)")) {
	return;
}
tools.appendString("\" \n      id=\"pyOwnerId\"\n      ISNS_FIELDTYPE=\"RULEKEY\"\n      ISNS_CLASS=\"Embed-Application-WorkMetaData\" \n      ISNS_DATANODE=\"pyWorkTypeName\"\n      ISNS_TTIPNODE=\"pyWorkTypeName\"\n      ISNS_GROUPNODE=\"pyType\"\n    ");

      params = "pyActivity=Rule-Application.RetrieveApplicationMetadata";
      String encryptedActionForHTML = pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", params);
    
tools.appendString("\n      ISNS_MYQUERY=\"&");
out.print(encryptedActionForHTML);
tools.appendString("&pyMetaDataType=pyWorkMetaData\" \n      ISNS_CLASSGROUPONLY=\"false\"\n      ONFOCUS=\"getProductName();zUtil_SmartPromptFocusHandler(event)\" \n      CLASS=\"InputIntellisenseStyle\" \n      AUTOCOMPLETE=\"off\">\n  </SPAN>\n");
}
tools.appendString("\n");
}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Yes");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "");
	oStreamProperties_2.put("pyClassName", "");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-PROPERTY RM_OWNERFORUSECASE #20190214T114219.706 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-AppDefinition");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "RM_OwnerForUseCase");
	oStreamProperties_2.put("pyRuleSetVersion", "08-03-01");
}
/**
 * Generates stream property_Data_Admin_System_Settings_RM_OwnerForUseCase
 */
private void property_Data_Admin_System_Settings_RM_OwnerForUseCase() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY RM_OWNERFORUSECASE #20190214T114219.706 GMT	Pega-AppDefinition:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY RM_OWNERFORUSECASE #20190214T114219.706 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY RM_OWNERFORUSECASE #20190214T114219.706 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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

	performStream_3();

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
/* end RULE-HTML-PROPERTY RM_OWNERFORUSECASE #20190214T114219.706 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY RM_OWNERFORUSECASE #20190214T114219.706 GMT
 */
private void include_3() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_Admin_System_Settings_RM_OwnerForUseCase();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_1);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_11() throws Throwable {
String cName = tools.getPrimaryPage().getClassName();
tools.appendString(" ");
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || cName.equals("Rule-Application-UseCase"))) {
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY RM_OWNERFORUSECASE #20190214T114219.706 GMT */
include_3();

tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || cName.equals("Rule-Circumstance-Definition"))) {
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY RM_OWNER #20180713T132013.096 GMT */
include_4();

tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT */
include_10();

tools.appendString(" ");
}
tools.appendString(" ");
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZ_PYOWNER_CONTROL #20180713T131328.302 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-RULES");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pz_pyOwner_Control");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_8 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT", "pzSetStrLoadMsg", "Pega-Gadgets", "08-05-01", "20200428T081054.535 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_7 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT", "SmartInfoPopupInclude", "Pega-Gadgets", "08-05-01", "20200428T081054.428 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_9 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT", "Attributes", "Pega-Gadgets", "08-01-01", "20180713T133432.763 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_4 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY RM_OWNER #20180713T132013.096 GMT", "RM_Owner", "Pega-ProCom", "08-01-01", "20180713T132013.096 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_3 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT", "ClientValidation", "Pega-UIEngine", "08-02-01", "20181008T083757.252 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_6 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT", "StartSmartField", "Pega-Gadgets", "08-01-01", "20180713T133438.113 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_5 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT", "Default", "Pega-Gadgets", "08-04-01", "20190614T125129.697 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZ_PYOWNER_CONTROL #20180713T131328.302 GMT", "pz_pyOwner_Control", "Pega-RULES", "08-01-01", "20180713T131328.302 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT", "Messages", "Pega-UIDesign", "08-01-01", "20180713T133634.985 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_10 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT", "EndSmartField", "Pega-ProCom", "08-01-01", "20180713T132011.328 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY RM_OWNERFORUSECASE #20190214T114219.706 GMT", "RM_OwnerForUseCase", "Pega-AppDefinition", "08-03-01", "20190214T114219.706 GMT");
}
