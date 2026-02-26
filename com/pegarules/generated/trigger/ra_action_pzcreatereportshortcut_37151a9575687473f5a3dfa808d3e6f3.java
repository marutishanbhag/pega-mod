package com.pegarules.generated.trigger;
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
public class ra_action_pzcreatereportshortcut_37151a9575687473f5a3dfa808d3e6f3  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Declare_Trigger.pzCreateReportShortcut.Rule_Obj_Report_Definition.Action");
	public ra_action_pzcreatereportshortcut_37151a9575687473f5a3dfa808d3e6f3(PegaAPI aContext) {
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

/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-DECLARE-TRIGGER RULE-OBJ-REPORT-DEFINITION PZCREATEREPORTSHORTCUT #20180713T134052.267 GMT	Pega-Reporting:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {

// Pega-RULES Declarative Processing Rule Instance

boolean varTrue;
boolean varFalse;
String useClass = null;
boolean varWhenName;
if (pega.isTraceEnabled("Declare Trigger", oTraceInfo_0)) {
pega.logTraceEvent("Declare Trigger", "Trigger", null, oTraceInfo_0, "RULE-DECLARE-TRIGGER RULE-OBJ-REPORT-DEFINITION PZCREATEREPORTSHORTCUT #20180713T134052.267 GMT", "When pzCheckForImport", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When pzCheckForImport");
// Expression: =Lib(Pega-RULES:ExpressionEvaluators).evaluateWhen("pzCheckForImport")

evaluationResult = (pega.<Boolean>resolveMethodCall("evaluateWhen--(String)", "evaluateWhen", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pzCheckForImport" })).booleanValue();
if (pega.isTraceEnabled("Declare Trigger", oTraceInfo_0)) {
pega.logTraceEvent("Declare Trigger", "Trigger", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-TRIGGER RULE-OBJ-REPORT-DEFINITION PZCREATEREPORTSHORTCUT #20180713T134052.267 GMT", "When pzCheckForImport", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When pzCheckForImport" + ".  Result: " + String.valueOf(evaluationResult));
} // End of try block
catch (ActivityTerminateException ate) {
	throw ate;
} catch (RuntimeException re) {
	throw re;
} finally {
tools.getProperty("pyDeclarativeContext.pyEvaluationResult").setValue(evaluationResult);
pega.logTraceEvent("Declare Trigger","When ",String.valueOf(evaluationResult),"Pega-Reporting","Rule-Obj-Report-Definition", null, false, null, null, null);
}
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
		cpPrimary.addMessage("Declarative-NotExecuted\tRULE-DECLARE-TRIGGER RULE-OBJ-REPORT-DEFINITION PZCREATEREPORTSHORTCUT #20180713T134052.267 GMT\t" + thrCause.getMessage());
		if (oLog.isWarnEnabled()) {			oLog.warn("Declarative-NotExecuted\tRULE-DECLARE-TRIGGER RULE-OBJ-REPORT-DEFINITION PZCREATEREPORTSHORTCUT #20180713T134052.267 GMT\t" + thrCause.getMessage(), ice);		}	} else {
		oLog.error("Declarative-NotExecuted\tRULE-DECLARE-TRIGGER RULE-OBJ-REPORT-DEFINITION PZCREATEREPORTSHORTCUT #20180713T134052.267 GMT\t" + thrCause.getMessage(), ice);	}
}
} catch (RuntimeException re) {
if (currentProperty != null && pega.isInputProcessing() && (!tools.getInfEngUtils().ignoreArithmeticException() || !(re instanceof ArithmeticException))) {
String message = "ChainingException	Rule-Declare-Trigger	Rule-Obj-Report-Definition.pzCreateReportShortcut	" + re.toString();
tools.getInfEngUtils().addConstraintMessage(currentProperty, null, message, null);
oLog.error(message, re);
} else { throw re;
}
} catch (PRSecurityException se) {
if (currentProperty != null && pega.isInputProcessing()) {
String message = "ChainingException	Rule-Declare-Trigger	Rule-Obj-Report-Definition.pzCreateReportShortcut	" + se.toString();
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
	"Rule-Declare-Trigger:PZCREATEREPORTSHORTCUT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZCREATEREPORTSHORTCUT","Rule-Declare-Trigger","RULE-OBJ-REPORT-DEFINITION",false,"","Pega-Reporting","08-01-01","RULE-DECLARE-TRIGGER RULE-OBJ-REPORT-DEFINITION PZCREATEREPORTSHORTCUT #20180713T134052.267 GMT","!PZCREATEREPORTSHORTCUT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-261738287)
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
//	RULE-DECLARE-TRIGGER RULE-OBJ-REPORT-DEFINITION PZCREATEREPORTSHORTCUT #20180713T134052.267 GMT:20180713T134052.267 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "530ad391781dfe624ada872a40d838ca";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Report-Definition";
	}
public String getAspect() {
return "Action";
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-DECLARE-TRIGGER RULE-OBJ-REPORT-DEFINITION PZCREATEREPORTSHORTCUT #20180713T134052.267 GMT", "Rule-Obj-Report-Definition pzCreateReportShortcut", "Pega-Reporting", "08-01-01", "20180713T134052.267 GMT");
}
