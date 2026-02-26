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
public class ra_validate_refactoroldclassname_d4967f0340bee42f25d8eb2d3a48f0c9  extends com.pega.pegarules.priv.AbstractFUASupport implements EditValidate, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Edit_Validate.RefactorOldClassName.Validate");
	public ra_validate_refactoroldclassname_d4967f0340bee42f25d8eb2d3a48f0c9(PegaAPI aContext) {
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
/* Instance RULE-EDIT-VALIDATE REFACTOROLDCLASSNAME #20180713T135636.272 GMT	Pega-SystemArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
if (theValue == null) return false;

if (theValue.length() == 0 ) { 
    theProperty.addMessage("pyOriginalClassNameCannotBeBlank"); 
    return false;
}

StringMap  keys = new HashStringMap();
keys.putString("pxObjClass", "Rule-Obj-Class");
keys.putString("pyClassName", theValue);
try 
{
    ClipboardPage aClass = tools.getDatabase().open(keys, false);
    if (aClass == null) 
    {
        theProperty.addMessage("pyOriginalClassNameDoesNotExist"); 
        return false;
    }
    String pyClassName = aClass.getString("pyClassName");
    if (!pyClassName.equals(theValue)) {
        theProperty.addMessage("Check case sensitivity of original class name.");
        return false;
    }
    boolean coreDeveloper = tools.getAuthorizationHandle().havePrivilege(tools, 
                                  "PegaRULES:CoreDeveloper", "@baseclass", null);
    String pyRuleSet = aClass.getString("pyRuleSet");
    if (pyRuleSet.startsWith("Pega-") && !coreDeveloper) {
        theProperty.addMessage("pyYouAreNotAllowedToRenameClassesInPegaRuleSets");
        return false;
    }
    return true;

} catch (DatabaseException aError) {
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
	"Rule-Edit-Validate:REFACTOROLDCLASSNAME"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("REFACTOROLDCLASSNAME","Rule-Edit-Validate","",false,"","Pega-SystemArchitect","08-01-01","RULE-EDIT-VALIDATE REFACTOROLDCLASSNAME #20180713T135636.272 GMT","REFACTOROLDCLASSNAME",true,false,"ABSOLUTE_CLASSLESS",635488160)
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
//	RULE-EDIT-VALIDATE REFACTOROLDCLASSNAME #20180713T135636.272 GMT:20180713T135636.272 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "744bb175e644796aa462ff919c6d0417";
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-EDIT-VALIDATE REFACTOROLDCLASSNAME #20180713T135636.272 GMT", "RefactorOldClassName", "Pega-SystemArchitect", "08-01-01", "20180713T135636.272 GMT");
}
