package com.pegarules.generated.validate;
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
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
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
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
public class ra_validate_pzisfieldavalidvalue_b8e3152aa644933b6b6d181510906aef  extends com.pega.pegarules.priv.AbstractFUASupport implements EditValidate, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Edit_Validate.pzIsFieldAValidValue.Validate");
	public ra_validate_pzisfieldavalidvalue_b8e3152aa644933b6b6d181510906aef(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}
public boolean evaluate(ClipboardProperty theProperty) {
	boolean isEncryptedProperty = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertyEncrypted(theProperty, tools);
	String  theValue = theProperty.getStringValue();
	if(isEncryptedProperty) {
	theValue = tools.getPRCrypto().decryptPropertyValue(theValue);
	}
	char  itsType = theProperty.getType();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-EDIT-VALIDATE PZISFIELDAVALIDVALUE #20180713T134052.709 GMT	Pega-Reporting:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
String prefix = "";
boolean bFound = false;	
String strDataType = "";
String strPropertyVal = "";
String strParamType = "";
String strDefaultParamVal = "";
ClipboardPage myStepPage = tools.getStepPage();
ClipboardPage topPage = myStepPage.getTopLevelPage();

strPropertyVal = myStepPage.getString(".pyFilterValue");

if(strPropertyVal.equals("")){
	bFound = true;
	return bFound;
}

if(myStepPage.getIfPresent(".pyFilterName") != null){
	String strProp = myStepPage.getString(".pyFilterName");
	String strClassName = "";
	String strPage= "";
	String strFilterValType = "";
	String strFilter = "";
	
	if(!strProp.equals("")){
		/* Check if the name of the property starts with the "." period */
		if (strProp.startsWith(".")){
			if(strProp.startsWith(".")){
				strProp = strProp.substring(1);
			}
			if(topPage.getIfPresent("pyClassName") != null){ 
				strClassName = topPage.getString(".pyClassName");
			}
			else if(topPage.getIfPresent("pzPageToDisplay") != null){
					strClassName = tools.findPage(topPage.getString("pzPageToDisplay")).getString(".pyReportDefinition.pyClassName");
			}
		}else if(strProp.indexOf(".") > 0){
			/* If the property referenced through pagename, check if the class exists in Pages&Classes tab. If it exists then check if the property exists in that class */
			strPage = strProp.substring(0,strProp.indexOf("."));
			strProp = strProp.substring(strProp.lastIndexOf(".")+1);
			ClipboardProperty cp_PagesAndClasses = null;
			if(topPage.getIfPresent("pzPageToDisplay") != null){
				cp_PagesAndClasses = tools.findPage(topPage.getString("pzPageToDisplay")).getProperty(".pyReportDefinition.pyPagesAndClasses");
			}else{
				cp_PagesAndClasses = topPage.getProperty("pyPagesAndClasses");
			}
			 java.util.Iterator enumPagesAndClasses = cp_PagesAndClasses.iterator(); 
			 while (enumPagesAndClasses.hasNext()) {
				ClipboardProperty propPagesAndClasses = (ClipboardProperty) enumPagesAndClasses.next(); 
				ClipboardPage pagePagesAndClasses = propPagesAndClasses.getPageValue();
				String strPageName = pagePagesAndClasses.getString("pyPagesAndClassesPage");
				if(strPageName.equals(strPage)){
					if(!pagePagesAndClasses.getString("pyPagesAndClassesClass").equals("")){
						strClassName = pagePagesAndClasses.getString("pyPagesAndClassesClass");
						break;
					}
				}
			 }
		 }
	}

	ClipboardProperty cp_Parameters = null;
	String strParamVal ="";
	/* If the filter value is referenced through parameter then get the param type */
	if(strPropertyVal.toLowerCase().startsWith("param.")){
			strParamVal = strPropertyVal.substring(strPropertyVal.lastIndexOf(".")+1);
			if(topPage.getIfPresent("pzPageToDisplay") != null){
				cp_Parameters = tools.findPage(topPage.getString("pzPageToDisplay")).getProperty(".pyReportDefinition.pyParameters");
			}else{
				cp_Parameters = topPage.getProperty("pyParameters");
			}

			java.util.Iterator enumParameters = cp_Parameters.iterator(); 
			while (enumParameters.hasNext()) {
			ClipboardProperty propParameters = (ClipboardProperty) enumParameters.next(); 
			ClipboardPage pageParameters = propParameters.getPageValue();
			String strParam = pageParameters.getString("pyParametersParamName");
			if(strParamVal.equals(strParam)){
				if(!pageParameters.getString("pyParametersParamType").equals("")){
					strParamType = pageParameters.getString("pyParametersParamType");
					strDefaultParamVal = pageParameters.getString("pyParametersParamDefaultValue");
					break;
				}
			}
		 }
	}else if(strPropertyVal.startsWith(".")){ /* Check if the filter value starts with the "." period */
		strFilter = strPropertyVal.substring(strPropertyVal.lastIndexOf(".")+1);
		if(!strClassName.equals("")){
			strFilterValType = pega_rules_utilities.getPropertyField(strClassName,strFilter,"pyStringType",tools);
		}
	}
	
	/* Get the datatype of the property */
	if(!strClassName.equals("")){
		strDataType = pega_rules_utilities.getPropertyField(strClassName,strProp,"pyStringType",tools);
	}

	/* Check if the filter value starts with the "." period, compare the datatype */
	if(strPropertyVal.startsWith(".")){
		if(strDataType.equals(strFilterValType)){
			bFound = true;
			return bFound;
		}else{
			return bFound;
		}
	}
	if(strPropertyVal.indexOf(".") >0){/* If the filter value referenced through param, get the prefix */
		prefix=strPropertyVal.substring(0 , strPropertyVal.indexOf("."));
	}
}

if(!strPropertyVal.equals("")){
	if(prefix.equalsIgnoreCase("Param")){
		if(strParamType.equalsIgnoreCase(strDataType)){
			if(!strDefaultParamVal.equals("")){
				strPropertyVal = strDefaultParamVal;
			}else{
				bFound = true;
				return bFound;
			}
		}else{
			bFound = false;
			return bFound;
		}
	}

	/* Check the datatype of the property is integer */
	if(strDataType.equalsIgnoreCase("Integer")){
		try{
			Integer.parseInt(strPropertyVal);
			bFound = true;
		}
		catch(Exception e){
			return bFound;
		}
	}else if(strDataType.equalsIgnoreCase("Double") || strDataType.equalsIgnoreCase("Decimal")){/* Check the datatype of the property is Double or Decimal */
		try{
			Double.parseDouble(strPropertyVal);
			bFound = true;
		}
		catch(Exception e){
			return bFound;
		}
	}else if(strDataType.equalsIgnoreCase("Date") || strDataType.equalsIgnoreCase("Date Time") || strDataType.equalsIgnoreCase("DateTime")){
		/* Check the property value is the symbolic date */
		ClipboardPage pgFieldValueInstances = tools.findPage("pyFieldValueInstances",true);
		if(pgFieldValueInstances == null){
			ParameterPage newParamPage = new ParameterPage();
			HashStringMap keys = new HashStringMap();
			keys.putString("pxObjClass", "Rule-Obj-Activity");
			keys.putString("pyClassName", "Rule-Obj-FieldValue");
			keys.putString("pyActivityName", "getRRFieldValues");
			newParamPage.putString("ViewClass", "Rule-Obj-FieldValue");
			newParamPage.putString("ViewPurpose", "getFieldValues");
			newParamPage.putString("ViewOwner", "ALL");
			newParamPage.putString("ClassName", "Embed-ReportingPeriod");
			newParamPage.putString("FieldName", "pySymbolName");
			newParamPage.putString("pyAction", "Prepare");
			tools.doActivity(keys, null, newParamPage);
			pgFieldValueInstances = tools.findPage("pyFieldValueInstances",true);
	   }

	   if(pgFieldValueInstances!=null && !pgFieldValueInstances.getName().equals("")){
		   java.util.Iterator itr = pgFieldValueInstances.getProperty(".pxResults").iterator();
		   while(itr.hasNext()){ 
			   ClipboardPage pgResults = ((ClipboardProperty)itr.next()).getPageValue();
			   String strFieldValue = pgResults.getString(".pyFieldValue");
			   if(strPropertyVal.equals(strFieldValue)){
				   bFound = true;
				   return bFound;
			   }
		   }
		} 
	   /* Check the datatype of the property is Date */
		if(strDataType.equalsIgnoreCase("Date")){
			String localeToUse = "";
			try{
				PRThread thread = tools.getThread();
				localeToUse = thread.getLocaleName(PRThread.LOCALE_DEFAULT);
			}
			catch(Exception ilEx){
				localeToUse = tools.findPage("pxRequestor").getString("pxReqLocale");
			}
			java.util.Date date = null;
			try{
				date = PRDateFormat.parseAsDate(localeToUse,null,null,strPropertyVal);
			} catch (InvalidValueException tfe) {
				bFound = false;
				tools.getStepStatus().backoutWorst();
				return bFound;
			}
			bFound = true;
		}else if(strDataType.equalsIgnoreCase("Date Time") || strDataType.equalsIgnoreCase("DateTime")){
		 /* Check the datatype of the property is DateTime */
			String localeToUse = "";
			String strTimeZone = "";
			try{
				PRThread thread = tools.getThread();
				localeToUse = thread.getLocaleName(PRThread.LOCALE_DEFAULT);
			}
			catch(Exception ilEx){
				localeToUse = tools.findPage("pxRequestor").getString("pxReqLocale");
			}
			java.util.Date date = null;
			try{
				date = PRDateFormat.parseAsDateTime(localeToUse,strTimeZone,null,strPropertyVal);
			}catch(InvalidValueException ex){
				bFound = false;
				tools.getStepStatus().backoutWorst();
				return bFound;
				
			}
			bFound = true;
		}
	}else if(strDataType.equalsIgnoreCase("TimeOfDay")){/* Check the datatype of the property is TimeOfDay */
		String localeToUse = "";
		try{
			PRThread thread = tools.getThread();
			localeToUse = thread.getLocaleName(PRThread.LOCALE_DEFAULT);
		}
		catch(Exception ilEx){
			localeToUse = tools.findPage("pxRequestor").getString("pxReqLocale");
		}
		java.util.Date date = null;
		try{
			date = PRDateFormat.parseAsTime(localeToUse,null,null,strPropertyVal);
		}catch(Exception ex){
			bFound = false;
			tools.getStepStatus().backoutWorst();
			return bFound;
		}
		bFound = true;
	} else{
		bFound = true;
	}
}

return bFound;
}
	} catch (java.lang.SecurityException se) {
		throw se;
	}
	 catch (Throwable aThrown) {
		throw new IndeterminateConditionalException(aThrown);
	}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Edit-Validate:PZISFIELDAVALIDVALUE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZISFIELDAVALIDVALUE","Rule-Edit-Validate","",false,"","Pega-Reporting","08-01-01","RULE-EDIT-VALIDATE PZISFIELDAVALIDVALUE #20180713T134052.709 GMT","PZISFIELDAVALIDVALUE",true,false,"ABSOLUTE_CLASSLESS",-1792409039)
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
//	RULE-EDIT-VALIDATE PZISFIELDAVALIDVALUE #20180713T134052.709 GMT:20180713T134052.709 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "5b011d815cfa1084085210a3866ee3a2";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Validate";
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-EDIT-VALIDATE PZISFIELDAVALIDVALUE #20180713T134052.709 GMT", "pzIsFieldAValidValue", "Pega-Reporting", "08-01-01", "20180713T134052.709 GMT");
}
