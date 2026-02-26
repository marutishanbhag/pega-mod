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
public class ra_validate_refactornewclassname_8f820ca69a7d5283253aded86656c7df  extends com.pega.pegarules.priv.AbstractFUASupport implements EditValidate, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Edit_Validate.RefactorNewClassName.Validate");
	public ra_validate_refactornewclassname_8f820ca69a7d5283253aded86656c7df(PegaAPI aContext) {
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
/* Instance RULE-EDIT-VALIDATE REFACTORNEWCLASSNAME #20180713T132616.719 GMT	Pega-RulesEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
   * Class names are made up of 'words' which are identifiers,  separated by single hyphens.
   * Identifiers-start with an alpha character and have alphanumerics in the rest, underscore is also allowed but seldom used.
   * valid: this-is-a-class
   * valid: this-class-is-number_1
   * invalid: this-1-is-invalid
   */

    boolean isValid = (theValue != null); 

    if (!isValid) return isValid;	


	if (theValue == null || theValue.length() == 0 ) 
    { 
	  theProperty.addMessage("pyNewClassNameCannotBeBlank"); 
	  return false;
	}

	if(theValue.startsWith("-"))
	{
	/* 
	 *  B-14949 Classes starting with - are restricted because it also starts with a special symbol
	 */
		theProperty.addMessage("pyNewClassNameInvalid\t" + theValue);
		return false;
	}

	/*
	 * First character can't be number
	 */
	if (Character.isDigit(theValue.charAt(0)))
	{
		if ( theProperty.getName().equals("pyAppClass") )
		{
			theProperty.addMessage("PropertyInfo-EditValidate\t" + theProperty.getName());
		}
		return false;
	}

	if (theValue.length() < 2)
	{
		/*
		 * R-6252/R6342: classes that are 1 character in length are restricted because they are used for
		 * internally marking $ANY, $NONE, etc.
		 */
		theProperty.addMessage("pyClassName2CharactersOrMore\t" + theValue);
		return false;
	}
	if (theValue.length() > 56)
	{
		/*
		 * B-14644 - History record may be created by the system. It may be > 56 and < 64.
		 * Then on a user process such as zip move or SAVE which goes this rule validation, validation would incorrectly fail.
		 * so only validate for the not more than 56 if the class name does not start with 'history-'.
		 */
		if (!theValue.toLowerCase().startsWith("history-"))
		{
		/*
		 * B-9100: need to leave enough room for History- prefix to form a 64 Character Classname.  
		 * Limit class name length to 56 characters
		 */
		   if (theValue.length()  > 56) { 	
		       theProperty.addMessage("pyClassNameGreaterThan56\t"+ theValue);
		       return false;
		   }
		}
		else
		{
	    /*
		 * Fixes B-14644 - as follows. If a class name starts with history- then the maximum 
		 * size check has to be 64 and not 56.
		 */
		   if (theValue.length() > 64)
		   {
			theProperty.addMessage("pyHistoryClassNameInvalid");
			return false;
		   }
		}
	}

	// check if it is a valid class name
	java.util.StringTokenizer st = new java.util.StringTokenizer(theValue, "-");
	while (st.hasMoreTokens() && isValid)
	{
		String currentString = st.nextToken();
		if (!pega.isValidPropertyIdentifier(currentString)) {
			theProperty.addMessage("pyClassNameInvalidFormatAtLevel\t"+ currentString + "\t" + theValue);
			return false;
		}	
	}

	StringMap  keys = new HashStringMap();
	keys.putString("pxObjClass", "Rule-Obj-Class");
	keys.putString("pyClassName", theValue);
	try 
	{
		ClipboardPage aClass = tools.getDatabase().open(keys, false);
		if (aClass != null) 
		{
			String className = aClass.getString("pyClassName");
			if(className.equals(theValue)){
				theProperty.addMessage("pyClassNameAlreadyExists\t" + theValue); 
			} else {   // it will come in else block if its not equal case wise. 
				theProperty.addMessage("Validate-InvalidClassName\t");
			}
			return false;
		}
		return true;
	}
	catch (DatabaseException aError) {
		return false;
	}
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
	"Rule-Edit-Validate:REFACTORNEWCLASSNAME"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("REFACTORNEWCLASSNAME","Rule-Edit-Validate","",false,"","Pega-RulesEngine","08-01-01","RULE-EDIT-VALIDATE REFACTORNEWCLASSNAME #20180713T132616.719 GMT","REFACTORNEWCLASSNAME",true,false,"ABSOLUTE_CLASSLESS",-162584849)
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
//	RULE-EDIT-VALIDATE REFACTORNEWCLASSNAME #20180713T132616.719 GMT:20180713T132616.719 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "8c56ac75757779401154ffcdc3ad9dff";
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-EDIT-VALIDATE REFACTORNEWCLASSNAME #20180713T132616.719 GMT", "RefactorNewClassName", "Pega-RulesEngine", "08-01-01", "20180713T132616.719 GMT");
}
