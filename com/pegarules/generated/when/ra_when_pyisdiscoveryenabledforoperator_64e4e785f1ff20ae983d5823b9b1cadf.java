package com.pegarules.generated.when;
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
import com.pega.pegarules.priv.util.RulePool;
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
public class ra_when_pyisdiscoveryenabledforoperator_64e4e785f1ff20ae983d5823b9b1cadf extends com.pega.pegarules.priv.AbstractFUASupport implements WhenBlock, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Access_When.pyIsDiscoveryEnabledForOperator.Data_Admin_Operator_ID.When");
	public ra_when_pyisdiscoveryenabledforoperator_64e4e785f1ff20ae983d5823b9b1cadf(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public boolean evaluate() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ID PYISDISCOVERYENABLEDFOROPERATOR #20180713T131316.408 GMT	Pega-RULES:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pega.activityStepWhenProlog(oTraceInfo_0);
try {
tools.getStepStatus().clear();
ClipboardPage myStepPage = tools.getStepPage();
// Expression: =(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(1, "!=", 1)))
boolean pz_1 = (true == (1 != 1));
pega.activityStepWhenEpilog(oTraceInfo_0, pz_1, false);
	return pz_1;

} catch (ChainingException anyChainingException) {
  throw anyChainingException;

} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("in RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ID PYISDISCOVERYENABLEDFOROPERATOR #20180713T131316.408 GMT: " + anyException.getMessage(), anyException);
}
}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final RulePool<ra_when_pyisdiscoveryenabledforoperator_64e4e785f1ff20ae983d5823b9b1cadf> oWhenPool = new RulePool<ra_when_pyisdiscoveryenabledforoperator_64e4e785f1ff20ae983d5823b9b1cadf>();
public static boolean invoke(PegaAPI aTools) {
ra_when_pyisdiscoveryenabledforoperator_64e4e785f1ff20ae983d5823b9b1cadf when = oWhenPool.borrow();
if (when == null) {
when = new ra_when_pyisdiscoveryenabledforoperator_64e4e785f1ff20ae983d5823b9b1cadf(aTools);
} else {
when.cleanForReuse(aTools);
}
try {
aTools.beforeEvaluateWhen();
return when.evaluate();
} finally {
when.cleanForReuse(null);
oWhenPool.release(when);
}}
private static final String oDependencies [] = {
	"Rule-Access-When:PYISDISCOVERYENABLEDFOROPERATOR"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYISDISCOVERYENABLEDFOROPERATOR","Rule-Access-When","DATA-ADMIN-OPERATOR-ID",false,"","Pega-RULES","08-01-01","RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ID PYISDISCOVERYENABLEDFOROPERATOR #20180713T131316.408 GMT","!PYISDISCOVERYENABLEDFOROPERATOR",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-274527302)
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
//	RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ID PYISDISCOVERYENABLEDFOROPERATOR #20180713T131316.408 GMT:20180713T131316.408 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "7ffbb20667952ff329d8d037c6417d9d";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Admin-Operator-ID";
	}
public String getAspect() {
return "When";
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}

/**
 * This is the cleanForReuse from the WhenAssembler
 */
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ID PYISDISCOVERYENABLEDFOROPERATOR #20180713T131316.408 GMT", "Data-Admin-Operator-ID pyIsDiscoveryEnabledForOperator", "Pega-RULES", "08-01-01", "20180713T131316.408 GMT");
}
