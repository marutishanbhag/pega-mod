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
import Pega.*;
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractBuildStreamSupport;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.AssemblyParameters;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.runtime.IActionRequest;
import com.pega.pegarules.priv.runtime.IActionRequestRegistrar;
import com.pega.pegarules.priv.runtime.IAutoStreamRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
import com.pega.pegarules.priv.util.JSPResponse;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * Builds directive stream PROMPTSELECT.
 */
public class ra_stream_promptselect_6aad3fe49dab2e69b9f502587903a578 extends AbstractBuildStreamSupport implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.PromptSelect.Stream");
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
	public ra_stream_promptselect_6aad3fe49dab2e69b9f502587903a578(com.pega.pegarules.priv.PegaAPI aContext) {
		super((com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext);
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "b98383bd5a3933a8a52dfbb09b27b6af0bba62c6";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
	pzAuto.beginStream(pega);
	pega.noteLegacyAPIUse();
try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT";if (mParentStreamProperties == null) {
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

	performStream_1();

}
}
} finally { 
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
}
/* end RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT */
}
	} finally {
		pzAuto.finishStream();
	}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:SHOWME-INSERT", 
	"Rule-HTML-Property:SHOWPROPERTY-INSERT", 
	"Rule-HTML-Property:SHOWDECLARATIVEPROPERTY-INSERT", 
	"Rule-HTML-Property:STARTSMARTFIELD", 
	"Rule-HTML-Property:MESSAGES", 
	"Rule-HTML-Property:ENDSMARTFIELD", 
	"Rule-HTML-Property:PROMPTSELECT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("SHOWME-INSERT","Rule-HTML-Fragment","",false,"","Pega-ProCom","08-01-01","RULE-HTML-FRAGMENT SHOWME-INSERT #20180713T131957.318 GMT","SHOWME-INSERT",true,false,"ABSOLUTE_CLASSLESS",-445053904), 
		new DependentRuleInfo("SHOWPROPERTY-INSERT","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY SHOWPROPERTY-INSERT #20180713T132014.582 GMT","SHOWPROPERTY-INSERT",true,false,"ABSOLUTE_CLASSLESS",1353247226), 
		new DependentRuleInfo("SHOWDECLARATIVEPROPERTY-INSERT","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY SHOWDECLARATIVEPROPERTY-INSERT #20180713T132014.569 GMT","SHOWDECLARATIVEPROPERTY-INSERT",true,false,"ABSOLUTE_CLASSLESS",2062711663), 
		new DependentRuleInfo("STARTSMARTFIELD","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT","STARTSMARTFIELD",true,false,"ABSOLUTE_CLASSLESS",-1437336844), 
		new DependentRuleInfo("MESSAGES","Rule-HTML-Property","",false,"","Pega-UIDesign","08-01-01","RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT","MESSAGES",true,false,"ABSOLUTE_CLASSLESS",-794757422), 
		new DependentRuleInfo("ENDSMARTFIELD","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT","ENDSMARTFIELD",true,false,"ABSOLUTE_CLASSLESS",1047137300), 
		new DependentRuleInfo("PROMPTSELECT","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT","PROMPTSELECT",true,false,"ABSOLUTE_CLASSLESS",-84469141)
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
//	RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT:20180713T133433.332 GMT
//	RULE-HTML-FRAGMENT SHOWME-INSERT #20180713T131957.318 GMT:20180713T131957.318 GMT
//	RULE-HTML-PROPERTY SHOWPROPERTY-INSERT #20180713T132014.582 GMT:20180713T132014.582 GMT
//	RULE-HTML-PROPERTY SHOWDECLARATIVEPROPERTY-INSERT #20180713T132014.569 GMT:20180713T132014.569 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT:20180713T133438.113 GMT
//	RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT:20180713T133634.985 GMT
//	RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT:20180713T132011.328 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "3077b2a8466ebf598265f8be92520e69";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
/**
 * Build the result of a condition. */
private void conditionResult_14() {
tools.appendString("<a href=\"javascript:openRuleRecord( 'RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT','Rule-HTML-Property')\" title=\"Open ");
tools.appendFormatted(tools.getSaveValue("key"), StreamBuilder.FMT_NORMAL);
tools.appendString("\">H</a> ");
}
/**
 * Build the result of a condition. */
private void conditionResult_13() {
tools.appendString(" ");
tools.putSaveValue("insHandle", "RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT");
tools.appendString(" ");
if (pega_wb_default.HaveCustomizationRight(saveValueGet("insHandle"), this)) {
conditionResult_14();
}
}
/**
 * Build the result of a condition. */
private void conditionResult_11() {
tools.appendString("<a Class=\"Link\" style=\"color:maroon\" href=\"javascript:showDeclarativeNetwork('");
tools.appendFormatted(tools.getDictionary().fromDefinition(tools.getActive(), "pyClassName"), StreamBuilder.FMT_NORMAL);
tools.appendString("','");
tools.appendFormatted(tools.getDictionary().fromDefinition(tools.getActive(), "pyPropertyName"), StreamBuilder.FMT_NORMAL);
tools.appendString("','");
tools.appendFormatted(tools.getSaveValue("PropertyPage"), StreamBuilder.FMT_NORMAL);
tools.appendString("','");
tools.appendFormatted(tools.getSaveValue("PropertyPageClass"), StreamBuilder.FMT_NORMAL);
tools.appendString("','");
tools.appendFormatted(tools.getSaveValue("Subscript"), StreamBuilder.FMT_NORMAL);
tools.appendString("');\" title=\"Show Dependency Network of ");
tools.appendFormatted(tools.getDictionary().fromDefinition(tools.getActive(), "pyPropertyName"), StreamBuilder.FMT_NORMAL);
tools.appendString("\">D</a> ");
}
/**
 * Build the result of a condition. */
private void conditionResult_9() {
tools.appendString("<a Class=\"Link\" style=\"color:maroon\" href=\"javascript:openRuleRecord('");
tools.appendFormatted(tools.getSaveValue("InsHandle"), StreamBuilder.FMT_NORMAL);
tools.appendString("','Rule-Obj-Property')\" title=\"Open Rule-Obj-Property=");
tools.appendFormatted(tools.getDictionary().fromDefinition(tools.getActive(), "pyClassName"), StreamBuilder.FMT_NORMAL);
tools.appendString(".");
tools.appendFormatted(tools.getDictionary().fromDefinition(tools.getActive(), "pyPropertyName"), StreamBuilder.FMT_NORMAL);
tools.appendString("\">P</a> ");
}
/**
 * Build the result of a condition. */
private void conditionResult_1() {
{
StringMap localListKeys = new HashStringMap();
localListKeys .putString("pzInput", "Display");
localListKeys .putString("pxObjClass", "Rule-HTML-Fragment");
localListKeys .putString("pyStreamName", "FixedSelect");
tools.appendStream(localListKeys);
}
}
/**
 * Build the result of a condition. */
private void conditionResult_2() {
final java.util.Map prevStreamProperties_1 = pega.getStreamProperties();
try {
StringMap  keys_1 = new HashStringMap();
keys_1.putString("pxObjClass", "Rule-HTML-Property");
keys_1.putString("pyStreamName", "StartSmartField");
tools.appendStream(keys_1);
keys_1 = null;
} finally {
	pega.setStreamProperties(prevStreamProperties_1);}
}
/**
 * Build the result of a condition. */
private void conditionResult_3() {
tools.appendString(" ");
tools.putSaveValue("strExpectedWidth", tools.getParamValue("Width"));
}
/**
 * Build the result of a condition. */
private void conditionResult_4() {
tools.appendString(" ");
tools.putSaveValue("strExpectedWidth", "");
}
/**
 * Build the result of a condition. */
private void conditionResult_5() {
tools.appendString("<script> ");
/* Come here when user chooses different item in dropdown list.  If there's
an optional dropdownItemChangedHandler function, we call it. Note:  The function itemChanged is defined here 
so we don't depend on other files, but it's also defined in prscripts to solve b-17922, so if you change the 
definition here, please change it there too.
*/
tools.appendString("\n\nfunction itemChanged (tagName) {\n\tif (\"function\" != typeof (promptSelectItemChangedHandler)) {\n    \treturn false;\n    }\nreturn promptSelectItemChangedHandler (tagName);\n}\nvar handlers = { \"click\":\"clickHandler\", \"focus\" : \"focusHandler\", \"blur\" : \"blurHandler\", \"tap\":\"clickHandler\" };\nfunction fireEventHandler(target, type) {\n\tvar handler = handlers[type] || \"handler\";\n\tpega.util.Event.addListener(target,type,pega.control.eventController[handler]);\n\tpega.util.Event.fireEvent(target,type);\n\tpega.util.Event.removeListener(target,type,pega.control.eventController[handler]);\n}\nfunction onClickSelectButton(eventEle) {\n    if (eventEle) {\n      var selElem = eventEle.previousSibling;\n      var hiddenElem = selElem.previousSibling;\n      if(pega && pega.util && pega.util.Dom) {\n        selElem = pega.util.Dom.getPreviousSibling(eventEle);\n        hiddenElem = pega.util.Dom.getPreviousSibling(selElem);\n      }\n      gErrorElementName = hiddenElem.name;\n\t  validation_validateFromUIEvent(event, hiddenElem); /*BUG-174572 attaching validation function to hidden input*/\n      var value = selElem.options[selElem.selectedIndex].value;\n      if(hiddenElem.value != value) {\n        hiddenElem.value = value;\n        fireEventHandler(hiddenElem, \"change\");\n      }else{\n\t\tfireEventHandler(hiddenElem, \"blur\");\n\t  }\n    }\n}\n</script> <SPAN nowrap> ");
final java.util.Map prevStreamProperties_2 = pega.getStreamProperties();
try {
StringMap  keys_2 = new HashStringMap();
keys_2.putString("pxObjClass", "Rule-HTML-Property");
keys_2.putString("pyStreamName", "Messages");
tools.appendStream(keys_2);
keys_2 = null;
} finally {
	pega.setStreamProperties(prevStreamProperties_2);}
{
	String title= StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyToolTip", tools.getParamValue("Title"))); 
         String strExpWidth=tools.getSaveValue("strExpectedWidth");
	String strPanelWidth = tools.getParamValue("PanelWidth");
	String strHTMLProperties = tools.getSaveValue("HTMLElemProperties");   //ex: class="KeyDataStyleLef" size = "40" 
	int idx = strHTMLProperties.indexOf("size='40'");
	if (idx > -1)
	{
		strHTMLProperties = strHTMLProperties.substring(0, idx ) + strHTMLProperties.substring(idx + 9) ;
	}
	
	String strOriginalProperty = tools.getSaveValue("originalProperty");
	String strOriginalClass = tools.getSaveValue("originalClass");
	String strPropertyName = null;
	String strClassName = null;
	if (strOriginalProperty.length() > 0)
	{
		//we get to this point if the original property is a special property (ex: starts with px)
		//and we needed to display a dropdown of options for this property. 
		strPropertyName = strOriginalProperty;
		strClassName = strOriginalClass;
	}
	else
	{
		strPropertyName = tools.getActive().getName();
		strClassName = tools.getDictionary().fromDefinition(tools.getActive(), "pyClassName");	
	}	

	String strInputName      = StringUtils.crossScriptingFilter(tools.getSaveValue("HTMLElemName"));
	if (strInputName.length() == 0)
	{
		if (strOriginalProperty.length() > 0)
			strInputName = strPropertyName;
		else
			strInputName = thisName();
	}
	String strDefaultValue   = tools.getSaveValue("HTMLDefaultValue");
	if (strDefaultValue.length() == 0)
		strDefaultValue = tools.getActive().getStringValue();
		
	boolean hasChangeEvent = tools.getParamValue("pega_attributes").toUpperCase().contains("ONCHANGE") &&  tools.getParamValue("pega_attributes").contains("handleClientEvent");
	boolean isAccessibilityMode = hasChangeEvent && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"isAccessible",null,false);
		
	String[] tableEditInfo = tools.getDictionary().getTableEditInfo(strClassName, strPropertyName);
	if (tableEditInfo != null)
	{
    		String strTableEditMode = tableEditInfo[Dictionary.TABLEEDITINFO_INDEX_TABLEOPTION];
                  if (strTableEditMode == null) strTableEditMode = "";
		
		// check if a Prompt List is defined
		if(strTableEditMode.equals("PromptList"))
		{
        String[][] promptListInfo = tools.getDictionary().getPromptList(strClassName, strPropertyName);
        if (promptListInfo != null) {

		String announceFirstSetting = strInputName + "_announce";
	        	tools.appendString("<script>");
	        	
				//		tools.appendString("pega.util.Event.addListener(window, 'load', " + announceFirstSetting + ");");
				//to support defer load
                                    tools.appendString("if(window.name && window.name.indexOf(\"yuiIO\")==0) {  window.onerror=function() {return true; }} ;");
				tools.appendString("try { if(typeof(pega)!= \"undefined\" && typeof(pega.u)!=\"undefined\" && typeof(pega.u.d)!= \"undefined\" ){\n");
				tools.appendString(" pega.u.d.attachOnload ("+announceFirstSetting+", true); \n");
				tools.appendString("} else {\n");
				tools.appendString("pega.util.Event.addListener(window, \"load\", "+announceFirstSetting+"); \n");
				tools.appendString("}}catch(e){}\n");
		
		
	        	tools.appendString("function " + announceFirstSetting + "(){");
	        	tools.appendString("itemChanged(\"" + strInputName + "\");");
	        	//tools.appendString("alert(\"" + strInputName + "\");");
	        	tools.appendString("}");
	        	tools.appendString("</script>");
	        	
		tools.putParamValue("bNoSize","true");

	        	//tools.appendString("<Select ");
if(isAccessibilityMode){	
		tools.appendString("<input type='hidden' tabIndex='-1' value='" + StringUtils.crossScriptingFilter(strDefaultValue) + "'");
}else{
		
		
		tools.appendString("<Select title=\"" + title + "\" alt=\"" + title + "\" id='"+ strPropertyName +"' ");
}
					        	
	        	StringMap promptListKeys = new HashStringMap();
				promptListKeys .putString("pzInput", "Display");
				promptListKeys .putString("pxObjClass", "Rule-HTML-Property");
				promptListKeys .putString("pyStreamName", "ClientValidation");
				
				if(tools.getParamValue("pega_events").equals("true")){
					tools.appendStream(promptListKeys);

     			tools.appendString(" onChange=\"itemChanged('" + strInputName + "')\"  name =\"" +
                                 strInputName + "\" " + strHTMLProperties);
				}
				else{


					tools.appendString(" onChange=\"itemChanged('" + strInputName + "')\" name =\"" +
                                 strInputName + "\" " + strHTMLProperties);
					tools.appendStream(promptListKeys);
				}	
if(isAccessibilityMode){		
		tools.appendString("><Select title=\"" + title + "\" alt=\"" + title + "\" id='"+ strPropertyName +"' ");
}		
				if(strExpWidth != null && !strExpWidth.equals("") && !strExpWidth.equals("auto") && strPanelWidth.equals("Stretch")){
					tools.appendString("fixedWidth='true'");
				}		
				StringMap promptAttrListKeys = new HashStringMap();
				promptAttrListKeys .putString("pzInput", "Display");
				promptAttrListKeys .putString("pxObjClass", "Rule-HTML-Property");
				promptAttrListKeys .putString("pyStreamName", "Attributes");
			
				tools.appendStream(promptAttrListKeys);
				
				tools.appendString(" >");	     
			for (int i=0; i<promptListInfo.length; i++) {
			        	String strValue =  promptListInfo[i][Dictionary.PROMPTLIST_INDEX_STANDARDVALUE];
			        	String strDisplay =  promptListInfo[i][Dictionary.PROMPTLIST_INDEX_LOCALIZEDVALUE];
			        	
			        	if(strDisplay.length() == 0)
			        		strDisplay = strValue;
			        	
					String strTheDefault = "";
					if (strValue.equals(strDefaultValue))  
						strTheDefault = " selected ";
					tools.appendString("<option " + strTheDefault + "value=\"" + StringUtils.crossScriptingFilter(strValue) + "\" >" + StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyCaption",strDisplay)) + "</option>");			}
		     	tools.appendString("</Select>");
                      }
			if(isAccessibilityMode){	
				tools.appendString("<input type='button' value='"+StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyCaption","Select"))+"' style='width:auto;' onClick='onClickSelectButton(this)' >");
			}
		}
		// Fall back on Local List
		else if (strTableEditMode.equals("LocalList"))
		{
        String[] localListInfo = tools.getDictionary().getLocalList(strClassName, strPropertyName);
        if (localListInfo != null) {
			tools.putParamValue("bNoSize","true");

			//tools.appendString("<Select ");
		if(isAccessibilityMode){	
			tools.appendString("<input type='hidden' tabIndex='-1' value='" + StringUtils.crossScriptingFilter(strDefaultValue) + "'");
}else{
			tools.appendString("<Select title=\"" + title + "\" alt=\"" + title + "\" id='"+ strPropertyName +"' ");
}
						
			StringMap localListKeys = new HashStringMap();
			localListKeys .putString("pzInput", "Display");
			localListKeys .putString("pxObjClass", "Rule-HTML-Property");
			localListKeys .putString("pyStreamName", "ClientValidation");
			tools.appendStream(localListKeys);
			
			tools.appendString("name =\"" + strInputName + "\"");
			
if(isAccessibilityMode){		
		tools.appendString("><Select title=\"" + title + "\" alt=\"" + title + "\" id='"+ strPropertyName +"' ");
}			
	
			if(strExpWidth != null && !strExpWidth.equals("") && !strExpWidth.equals("auto") && strPanelWidth.equals("Stretch")){
					tools.appendString("fixedWidth='true'");
			}
			StringMap promptAttrListKeys = new HashStringMap();
				promptAttrListKeys .putString("pzInput", "Display");
				promptAttrListKeys .putString("pxObjClass", "Rule-HTML-Property");
				promptAttrListKeys .putString("pyStreamName", "Attributes");
			
				tools.appendStream(promptAttrListKeys);
				

 			tools.appendString(" " + strHTMLProperties + ">");
			for (int i=0; i<localListInfo.length; i++) {
			        	String strValue = localListInfo[i];
				String strTheDefault = "";
				if (strValue.equals(strDefaultValue))  
					strTheDefault = " selected ";
				tools.appendString("<option " + strTheDefault + "value=\"" + tools.getXMLUtils().encodeString(strValue) + "\" >" + StringUtils.crossScriptingFilter(strValue) + "</option>");	
				
			}
			tools.appendString("</Select>");
                      }
			if(isAccessibilityMode){	
				tools.appendString("<input type='button' value='"+StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyCaption","Select"))+"' style='width:auto;' onClick='onClickSelectButton(this)' >");
			}
		}	
		else if (strTableEditMode.equalsIgnoreCase("ClassKeyValue"))
		{
			String tableClass = tableEditInfo[Dictionary.TABLEEDITINFO_INDEX_TABLECLASS];
			if (tableClass == null) tableClass = "";
			String strSubsetValue = tableEditInfo[Dictionary.TABLEEDITINFO_INDEX_TABLESELECTOR];
			if (strSubsetValue == null) strSubsetValue = "";
			strSubsetValue = strSubsetValue.trim();
			String strFirstKey = "";
			String strSecondKey = "";
			String strLastKey = "";	
			
			String strDispvalue="";
			String strParamDispProp = tools.getParamValue("DisplayProperty");
			// If this is not a valid property in the lookup class, clear it.
			if(tools.getDictionary().getClassInfo(tableClass).getPropertyInfo(strParamDispProp) == null){
				strParamDispProp ="";			
			}

			// Get the class definition
			ClassDefinition listClass = tools.getDatabase().getClassDef(tableClass);

			java.util.List keyList = listClass.getKeyPropertyList();
					
			// The class can have at most 3 keys. The last key contains the possible values for this property.
			java.util.Iterator keys = keyList.iterator();
			int nKeysCount = 0;
			while (keys.hasNext())
			{
				String keyName = (String)keys.next();
				if (nKeysCount == 0)
					strFirstKey = keyName;
				if (nKeysCount == 1)
					strSecondKey = keyName;
				strLastKey = keyName;
				nKeysCount++;
			}												
			
			// The activity LookupList puts the cached results into a page

			ParameterPage pp = new ParameterPage();

			pp.putParamValue("pyObjClass", tableClass);
			pp.putParamValue("pyListName", "List");
			pp.putParamValue("showResults", "NO");

			pp.putParamValue("pageName", "pyQFieldValueList");
			
			// If the first key is pyClassName, filter by the class of the property
			if (strFirstKey.equals("pyClassName"))
			{
				pp.putParamValue("p1","pyClassName");
				pp.putParamValue("v1",strClassName);
				pp.putParamValue("Action", "inherited");				
				
				if (strSubsetValue.length() > 0)
				{
					pp.putParamValue("p2",strSecondKey);
					pp.putParamValue("v2",strSubsetValue);
				}
			} else
			{
				if (strSubsetValue.length() > 0)
				{
					pp.putParamValue("p1",strFirstKey);
					pp.putParamValue("v1",strSubsetValue);
				}
			}
				
			HashStringMap params = new HashStringMap();
			params.putString("pxObjClass", "Rule-Obj-Activity");
			params.putString("pyClassName", "@baseclass");
			params.putString("pyActivityName", "LookupList");
			tools.doActivity(params, null, pp);
			
			ClipboardPage pgListPage = tools.findPage("pyQFieldValueList");
			int nResultsCount = pgListPage.getProperty(".pxResultCount").toInteger();
			StringBuffer strOutput = new StringBuffer();
			boolean bHasData = false;
			if (nResultsCount > 0)
			{
				java.util.Iterator itrRows = pgListPage.getProperty(".pxResults").iterator();
				tools.putParamValue("bNoSize","true");
				StringMap classKeyKeys = new HashStringMap();
			    classKeyKeys.putString("pzInput", "Display");
			    classKeyKeys.putString("pxObjClass", "Rule-HTML-Property");
			    classKeyKeys.putString("pyStreamName", "ClientValidation");
				String clientValidation = tools.getStream(classKeyKeys, null);
if(isAccessibilityMode){	
		strOutput.append("<input type='hidden' tabIndex='-1' value='" + StringUtils.crossScriptingFilter(strDefaultValue) + "'");
}else{
				//strOutput.append("<Select ");
				strOutput.append("<Select title=\"" + title + "\" alt=\"" + title + "\" id='"+ strPropertyName +"' ");
				//BUG-310076: added ClientValidation to support actions
			    strOutput.append(clientValidation);
}				

				
				strOutput.append("onChange=\"itemChanged('" + strInputName + "')\" name =\"" + strInputName + "\" " + strHTMLProperties + " ");
if(isAccessibilityMode){		
		strOutput.append("><Select title=\"" + title + "\" alt=\"" + title + "\" id='"+ strPropertyName +"' ");
		//BUG-310076: added ClientValidation to support actions      
	    strOutput.append(clientValidation);
}								
									
				if(strExpWidth != null && !strExpWidth.equals("") && !strExpWidth.equals("auto") && strPanelWidth.equals("Stretch")){
					strOutput.append(" fixedWidth='true'");
				}
				StringMap promptAttrListKeys = new HashStringMap();
				promptAttrListKeys .putString("pzInput", "Display");
				promptAttrListKeys .putString("pxObjClass", "Rule-HTML-Property");
				promptAttrListKeys .putString("pyStreamName", "Attributes");
				strOutput.append(tools.getStream(promptAttrListKeys, null));

				
				strOutput.append(" >");	

				//We need to make sure that we don't display duplicate data.
				//so we keep track of the values displyed in a hashtable.
				java.util.Hashtable ht = new java.util.Hashtable();
				int nLen = 0;
				while (itrRows.hasNext())
				{
					ClipboardProperty objResProp = (ClipboardProperty) itrRows.next();
					ClipboardPage tempPage = objResProp.getPageValue();
					ClipboardProperty val = tempPage.getProperty(strLastKey);

					if (val != null)
					{
						String strValue = val.getStringValue();
						
						//by default show the key
						strDispvalue = strValue;
						if(strParamDispProp != ""){
							ClipboardProperty objDispProp = tempPage.getIfPresent(strParamDispProp);
							if(objDispProp!=null)
								strDispvalue = objDispProp.getStringValue();
						}
						// only process if this is a new value not already in the list
						if (!ht.containsKey(strValue))
						{
							nLen++;
							ht.put(strValue, strValue);
							String strTheDefault = "";
							if (strValue.equals(strDefaultValue))  
							{
								strTheDefault = " selected ";
							}
							
							strOutput.append("<option " + strTheDefault + "value=\"" + StringUtils.crossScriptingFilter(strValue) + "\" >" + StringUtils.crossScriptingFilter(strDispvalue) + "</option>");	
							bHasData = true;
						}
					}	
				}
				strOutput.append("</Select>");
			if(isAccessibilityMode){	
				strOutput.append("<input type='button' value='"+StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyCaption","Select"))+"' style='width:auto;' onClick='onClickSelectButton(this)' >");
			}
			}
			if (!bHasData)
			{
				tools.appendString("\n<input value='" + StringUtils.crossScriptingFilter(strDefaultValue) + "' name =\"" + strInputName + "\" " + strHTMLProperties + ">");			
			}	
			else
			{
				tools.appendString(strOutput.toString());
			}
			pgListPage.removeFromClipboard();	
		}

		else
		{
			tools.appendString("\n<input value='" + StringUtils.crossScriptingFilter(strDefaultValue) + "' name =\"" + strInputName + "\" " + strHTMLProperties + ">");			
		}
	}
	else 
	{
		tools.appendString("\n<input value='" + StringUtils.crossScriptingFilter(strDefaultValue) + "' name =\"" + strInputName + "\" " + strHTMLProperties + ">");			
	}		
}
tools.appendString("</SPAN> ");
}
/**
 * Build the result of a condition. */
private void conditionResult_6() {
{
	boolean valSet = false;
	String strDefaultValue = tools.getSaveValue("HTMLDefaultValue");
	if (strDefaultValue.length() == 0)
		strDefaultValue = tools.getActive().getStringValue();

	String strOriginalProperty = tools.getSaveValue("originalProperty");
	String strOriginalClass = tools.getSaveValue("originalClass");
	String strPropertyName = null;
	String strClassName = null;
	if (strOriginalProperty.length() > 0)
	{
		//we get to this point if the original property is a special property (ex: starts with px)
		//and we needed to display a dropdown of options for this property. 
		strPropertyName = strOriginalProperty;
		strClassName = strOriginalClass;
	}
	else
	{
		strPropertyName = tools.getActive().getName();
		strClassName = tools.getDictionary().fromDefinition(tools.getActive(), "pyClassName");	
	}	
	String[] tableEditInfo = tools.getDictionary().getTableEditInfo(strClassName, strPropertyName);
	if (tableEditInfo != null)
	{
    		String strTableEditMode = tableEditInfo[Dictionary.TABLEEDITINFO_INDEX_TABLEOPTION];
                  if (strTableEditMode == null) strTableEditMode = "";
	
		// check if a Prompt List is defined
		if (strTableEditMode.equals("PromptList"))
		{
        String[][] promptListInfo = tools.getDictionary().getPromptList(strClassName, strPropertyName);
        if (promptListInfo != null) {
			for (int i=0; i<promptListInfo.length; i++) {
			        	String strValue = promptListInfo[i][Dictionary.PROMPTLIST_INDEX_STANDARDVALUE];
			        	String strDisplay = promptListInfo[i][Dictionary.PROMPTLIST_INDEX_LOCALIZEDVALUE];
			        	
			        if (strDisplay.length() == 0)
			        	strDisplay = strValue;
			        	
				if (strValue.equals(strDefaultValue))  {
					valSet = true;
					tools.appendString(tools.getLocalizedTextForString(".pyCaption",StringUtils.crossScriptingFilter(strDisplay)));
					break;
				}
		     	}
                      }
		}else if(strTableEditMode.equalsIgnoreCase("ClassKeyValue")){
			String tableClass = tableEditInfo[Dictionary.TABLEEDITINFO_INDEX_TABLECLASS];
			if (tableClass == null) tableClass = "";
			String strSubsetValue = tableEditInfo[Dictionary.TABLEEDITINFO_INDEX_TABLESELECTOR];
			if (strSubsetValue == null) strSubsetValue = "";
			strSubsetValue = strSubsetValue.trim();
			String strFirstKey = "";
			String strSecondKey = "";
			String strLastKey = "";	
			String strParamDispProp = tools.getParamValue("DisplayProperty");
			String currentPropValue = tools.getActive().getStringValue();
			// Try to show the value of parameter only when it is a valid property in the chosen instance of lookup class.
			if(tools.getDictionary().getClassInfo(tableClass).getPropertyInfo(strParamDispProp) != null){
				// Get the class definition
				ClassDefinition listClass = tools.getDatabase().getClassDef(tableClass);
				java.util.List keyList = listClass.getKeyPropertyList();
						
				// The class can have at most 3 keys. The last key contains the possible values for this property.
				java.util.Iterator keys = keyList.iterator();
				int nKeysCount = 0;
				while (keys.hasNext())
				{
					String keyName = (String)keys.next();
					if (nKeysCount == 0)
						strFirstKey = keyName;
					if (nKeysCount == 1)
						strSecondKey = keyName;
					strLastKey = keyName;
					nKeysCount++;
				}


				ClipboardPage objInstPage = tools.createPage(tableClass,"");
				
				// If the first key is pyClassName, filter by the class of the property
				if (strFirstKey.equals("pyClassName"))
				{
					objInstPage.putString(strFirstKey,  strClassName);	
					
					if (strSubsetValue.length() > 0)
					{
					    objInstPage.putString(strSecondKey,  strSubsetValue);
					}
				} else
				{
					if (strSubsetValue.length() > 0)
					{
						objInstPage.putString(strFirstKey,  strSubsetValue);
					}
				}
				
				objInstPage.putString(strLastKey,  currentPropValue);
				
				try { objInstPage = tools.getDatabase().open(objInstPage, false); }
					catch (DatabaseException de) { objInstPage = null; }
				
				if (objInstPage != null){
					if(objInstPage.getIfPresent(strParamDispProp).getStringValue()!= ""){
						valSet = true;
						tools.appendString(StringUtils.crossScriptingFilter(objInstPage.getIfPresent(strParamDispProp).getStringValue()));
					}
				}
			}
		}
	}
	if (!valSet)
	{
		if (tools.getSaveValue("HTMLDefaultValue").length() > 0)
			tools.appendString(tools.getSaveValue("HTMLDefaultValue"));
		else
			tools.appendString(StringUtils.crossScriptingFilter(tools.getActive().getStringValue()));
	}

}
}
/**
 * Build the result of a condition. */
private void conditionResult_7() {
final java.util.Map prevStreamProperties_3 = pega.getStreamProperties();
try {
StringMap  keys_3 = new HashStringMap();
keys_3.putString("pxObjClass", "Rule-HTML-Property");
keys_3.putString("pyStreamName", "EndSmartField");
tools.appendStream(keys_3);
keys_3 = null;
} finally {
	pega.setStreamProperties(prevStreamProperties_3);}
}
/**
 * Build the result of a condition. */
private void conditionResult_8() {
if (pega_wb_default.HaveCustomizationRight(tools.getSaveValue("InsHandle"), this)) {
conditionResult_9();
}
}
/**
 * Build the result of a condition. */
private void conditionResult_10() {
if (pega_wb_default.HaveCustomizationRight(tools.getSaveValue("InsHandle"), this)) {
conditionResult_11();
}
}
/**
 * Build the result of a condition. */
private void conditionResult_12() {
if ((! saveValueGet("name").startsWith("px") || saveValueGet("name").startsWith("pz"))) {
conditionResult_13();
}
}
private void performStream_1() {
{
String cssWidth = tools.getParamValue("Width");
try {
if(cssWidth!= null && cssWidth.trim().length() != 0) {
int cssWidthNumericValue = Integer.parseInt(cssWidth);

if(cssWidthNumericValue !=0){
cssWidth = cssWidthNumericValue + "px";
}
}
} catch( NumberFormatException ex) {
}

tools.putParamValue("Width", cssWidth);
}
if (!tools.getParamValue("Width").equals("")) {
conditionResult_1();
}
if ( !tools.getParamValue("ReadOnlySmartInfo").equals("") || !tools.getParamValue("ReadWriteSmartInfo").equals("") ) {
conditionResult_2();
}
if (!tools.getParamValue("Width").equals("")) {
conditionResult_3();
} else {
conditionResult_4();
}
if (tools.useModeInput()) {
conditionResult_5();
} else {
conditionResult_6();
}
if ( !tools.getParamValue("ReadOnlySmartInfo").equals("") || !tools.getParamValue("ReadWriteSmartInfo").equals("") ) {
conditionResult_7();
}
if (!"Internal".equals(mParentStreamProperties.get("pyMethodStatus"))) {
	/* Show-me property */
if (pega.isShowMePropertyEnabled()) {
/* handling 0 of 1 show-me definitions (isLast)  (isOnly) */
{
/* Show-Me Rule instance RULE-HTML-PROPERTY SHOWPROPERTY-INSERT #20180713T132014.582 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=true */
tools.putSaveValue("InsHandle", tools.getDictionary().fromDefinition(tools.getActive(), "pzInsKey"));
tools.putSaveValue("streamName", "PromptSelect");
if (((! tools.getSaveValue("streamName").equals("JSEncodedValue")) && (! tools.getSaveValue("streamName").equals("urlEncodedValue")))) {
conditionResult_8();
}
}
}
	/* Show-me declarative */
if (pega.isShowMeDeclarativeEnabled()) {
/* handling 0 of 1 show-me definitions (isLast)  (isOnly) */
{
/* Show-Me Rule instance RULE-HTML-PROPERTY SHOWDECLARATIVEPROPERTY-INSERT #20180713T132014.569 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=true */
tools.putSaveValue("PropertyName", tools.getDictionary().fromDefinition(tools.getActive(), "pyPropertyName"));
{
     // We shouldn't display a Declarative marker next to an editable field
    tools.putSaveValue("IsDeclarative", "false");

	// Initialize Subscript
	tools.putSaveValue("Subscript", "");

    if (!tools.useModeInput()) {

		String strClassName = tools.getActive().getTopLevelPage().getClassName();
		String strPropertyClass = tools.getActive().getParentPage().getClassName();
		String strPropertyName = tools.getSaveValue("PropertyName");

    // Build a list of all page list or group entries and their subscripts.
    // For example, the third entry in  pagelist2 within the second entry in pagelist1 would be pagelist1(2)pagelist1(3). 
    ClipboardProperty activeProp = tools.getActive().getParentProperty();
		String subscript = pega_rules_utilities.getShowMeDeclarativePropertyDescription(activeProp);
		tools.putSaveValue("Subscript", subscript);
		
		if (tools.getInfEngUtils().getTrackingInfoForTargetProperty(strClassName, strPropertyClass, strPropertyName) != null) {
				tools.putSaveValue("IsDeclarative", "true");
		} else {
				tools.putSaveValue("IsDeclarative", "false");
		}
}
tools.putSaveValue("InsHandle", tools.getDictionary().fromDefinition(tools.getActive(), "pzInsKey"));
tools.putSaveValue("PropertyPage", tools.getActive().getTopLevelPage().getName());
tools.putSaveValue("PropertyPageClass", tools.getActive().getTopLevelPage().getString("pxObjClass"));
if ( tools.getSaveValue("IsDeclarative").equals("true") ) {
conditionResult_10();
}
{
}
}
}
}
}
	/* Show-me insert */
if (pega.isShowMeInsertEnabled()) {
/* handling 0 of 1 show-me definitions (isLast)  (isOnly) */
{
/* Show-Me Rule instance RULE-HTML-FRAGMENT SHOWME-INSERT #20180713T131957.318 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=true */
tools.putSaveValue("name", "PromptSelect");
tools.putSaveValue("key", "Rule-HTML-Property=PromptSelect");
tools.putSaveValue("objClass", "Rule-HTML-Property");
if ( !tools.getSaveValue("objClass").equals("Rule-HTML-Property")&&
				 !tools.getSaveValue("objClass").equals("Rule-HTML-Section")&&
				 !tools.getSaveValue("objClass").equals("Rule-HTML-Harness")&&
				 !tools.getSaveValue("objClass").equals("Rule-Obj-FlowAction") ) {
conditionResult_12();
}
tools.putSaveValue("circ", "default circumstance");
}
}
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-01");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "PromptSelect");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public void cleanForReuse(PegaAPI aContext) {
	super.cleanForReuse((com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext);
	tools = (StreamBuilderToolKit)aContext;
	pega = (com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext;
	if( pega != null ) {
		pzAuto = pega.getAutoStreamRuntime();
	}
	else {
		pzAuto = null;
	}
	mParentStreamProperties = null;
	pz_CurrentRuleKey = null;
	if( pega != null ) pega.setTrackMissingProperties("Rule-HTML-Property");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PROMPTSELECT #20180713T133433.332 GMT", "PromptSelect", "Pega-Gadgets", "08-01-01", "20180713T133433.332 GMT");
}
