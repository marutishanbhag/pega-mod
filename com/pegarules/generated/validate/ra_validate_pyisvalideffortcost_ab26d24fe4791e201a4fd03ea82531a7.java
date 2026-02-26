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
public class ra_validate_pyisvalideffortcost_ab26d24fe4791e201a4fd03ea82531a7  extends com.pega.pegarules.priv.AbstractFUASupport implements EditValidate, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Edit_Validate.pyIsValidEffortCost.Validate");
	public ra_validate_pyisvalideffortcost_ab26d24fe4791e201a4fd03ea82531a7(PegaAPI aContext) {
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
/* Instance RULE-EDIT-VALIDATE PYISVALIDEFFORTCOST #20180713T132934.788 GMT	Pega-ProcessEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
// Evaluate only if the property holds value.
if(theValue.equals("")){
  return true;
}

//Get the property
ClipboardPage myStepPage = tools.getStepPage();
ClipboardProperty effortCostProp = myStepPage.getProperty(".pyEffortCost");

boolean isValidPropRef = false;
boolean isValidDecimal = false;
boolean isExpression = false;


//Evaluate for Arthmethic Expressions
java.util.regex.Pattern pattrn=java.util.regex.Pattern.compile("[\\+\\-\\*/]");
java.util.regex.Matcher match=pattrn.matcher(new String(theValue));
isExpression= match.find();
 
// If Arthemetic expression return false; else evaluate if it is Clipboard Property reference
if(isExpression){
  return false;
}else{
  isValidPropRef = tools.editValidate(effortCostProp, "pzIsValidPropertyReference");  
  effortCostProp.clearMessages();
}

// If not Clipboard Property reference evaluate if it is valid Decimal
if(!isValidPropRef){
  isValidDecimal = tools.editValidate(effortCostProp, "IsValidDecimal");
  effortCostProp.clearMessages();
}else{
  return true;
}

//If not Decimal return false
if(!isValidDecimal){
  return false;
}

return true;
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
	"Rule-Edit-Validate:PYISVALIDEFFORTCOST"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYISVALIDEFFORTCOST","Rule-Edit-Validate","",false,"","Pega-ProcessEngine","08-01-01","RULE-EDIT-VALIDATE PYISVALIDEFFORTCOST #20180713T132934.788 GMT","PYISVALIDEFFORTCOST",true,false,"ABSOLUTE_CLASSLESS",-356661428)
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
//	RULE-EDIT-VALIDATE PYISVALIDEFFORTCOST #20180713T132934.788 GMT:20180713T132934.788 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "8d9fb20f20e37673c6e2449c2e9f0608";
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-EDIT-VALIDATE PYISVALIDEFFORTCOST #20180713T132934.788 GMT", "pyIsValidEffortCost", "Pega-ProcessEngine", "08-01-01", "20180713T132934.788 GMT");
}
