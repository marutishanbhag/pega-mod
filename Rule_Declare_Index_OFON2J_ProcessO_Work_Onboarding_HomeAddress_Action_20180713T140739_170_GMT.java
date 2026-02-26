package com.pegarules.generated.testgen;

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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
public class Rule_Declare_Index_OFON2J_ProcessO_Work_Onboarding_HomeAddress_Action_20180713T140739_170_GMT  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Declare_Index.HomeAddress.OFON2J_ProcessO_Work_Onboarding.Action");
	public Rule_Declare_Index_OFON2J_ProcessO_Work_Onboarding_HomeAddress_Action_20180713T140739_170_GMT(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}
	public ClipboardPage myStepPage = null;
	String pz_CurrentRuleKey = "";
public void perform() {
String pzAllowMissingPropertiesString = (tools.getParameterPage() != null) ? tools.getParamValue("bAllowMissingProperties") : null;
boolean pzAllowMissingProperties = true;
if ((pzAllowMissingPropertiesString != null) && (pzAllowMissingPropertiesString.length() > 0)) pzAllowMissingProperties = tools.interpretBoolean(pzAllowMissingPropertiesString);
myStepPage = tools.getPrimaryPage();
ClipboardProperty pageRef;
ClipboardPage level0Page = null;
java.util.Iterator myPageList;
ClipboardPage thisStepPage;
ClipboardProperty currentProperty = null;
String thisPageClass = "";
boolean evaluationResult = false;
// Prepare to catch type conversion issues
try {

try {

// Pega-RULES Declarative Processing Rule Instance

boolean varTrue;
boolean varFalse;
String useClass = null;
boolean varWhenName;
} // End of try block
catch (ActivityTerminateException ate) {
	throw ate;
} catch (RuntimeException re) {
	throw re;
} finally {
tools.getProperty("pyDeclarativeContext.pyEvaluationResult").setValue(evaluationResult);
pega.logTraceEvent("Declare Index","When ",String.valueOf(evaluationResult),"ProcessO","OFON2J-ProcessO-Work-Onboarding", null, false, null, null, null);
}
} catch (InvalidValueException ive) {
// Discard this exception
} catch (ChainingException ce) {
// This exception must float
throw ce;
} catch (IndeterminateConditionalException ice) {
Throwable thrCause = ice.getCause();
if ((thrCause == null) || (!(thrCause instanceof InvalidValueException))) {
	throw ice;
} else {
	ClipboardPage cpPrimary = tools.getPrimaryPage();
	if (cpPrimary != null) {
		cpPrimary.addMessage("Declarative-NotExecuted\tRULE-DECLARE-INDEX WORK- PZLOCATIONINFO #20180713T140739.170 GMT\t" + thrCause.getMessage());
		if (oLog.isWarnEnabled()) {			oLog.warn("Declarative-NotExecuted\tRULE-DECLARE-INDEX WORK- PZLOCATIONINFO #20180713T140739.170 GMT\t" + thrCause.getMessage(), ice);		}	} else {
		oLog.error("Declarative-NotExecuted\tRULE-DECLARE-INDEX WORK- PZLOCATIONINFO #20180713T140739.170 GMT\t" + thrCause.getMessage(), ice);	}
}
} catch (RuntimeException re) {
if (currentProperty != null && pega.isInputProcessing() && (!tools.getInfEngUtils().ignoreArithmeticException() || !(re instanceof ArithmeticException))) {
String message = "ChainingException	Rule-Declare-Index	OFON2J-ProcessO-Work-Onboarding.HomeAddress	" + re.toString();
tools.getInfEngUtils().addConstraintMessage(currentProperty, null, message, null);
oLog.error(message, re);
} else { throw re;
}
} catch (PRSecurityException se) {
if (currentProperty != null && pega.isInputProcessing()) {
String message = "ChainingException	Rule-Declare-Index	OFON2J-ProcessO-Work-Onboarding.HomeAddress	" + se.toString();
tools.getInfEngUtils().addConstraintMessage(currentProperty, null, message, null);
oLog.error(message, se);
} else { throw se;
}
} finally {
if (currentProperty != null && oLog.isDebugEnabled()) {
oLog.debug("Result = " + tools.getInfEngUtils().getTargetPropertyValue(currentProperty));
} // end if
} // end try
} // end perform() method
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
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

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "fa7689ffb6d610cf098b8856ac848170";
	}

	public String getDefinitionAppliesToClass() {
		return "OFON2J-ProcessO-Work-Onboarding";
	}
public String getAspect() {
return "Action";
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-DECLARE-INDEX WORK- PZLOCATIONINFO #20180713T140739.170 GMT", "OFON2J-ProcessO-Work-Onboarding HomeAddress", "ProcessO", "01-01-01", "20180713T140739.170 GMT");
}
