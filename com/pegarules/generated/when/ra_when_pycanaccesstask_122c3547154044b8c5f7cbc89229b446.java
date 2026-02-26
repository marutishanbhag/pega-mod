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
public class ra_when_pycanaccesstask_122c3547154044b8c5f7cbc89229b446 extends com.pega.pegarules.priv.AbstractFUASupport implements WhenBlock, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Access_When.pyCanAccessTask.Work_Cover_Task.When");
	public ra_when_pycanaccesstask_122c3547154044b8c5f7cbc89229b446(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public boolean evaluate() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-ACCESS-WHEN WORK-COVER-TASK PYCANACCESSTASK #20181023T153531.995 GMT	Pega-Social:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pega.activityStepWhenProlog(oTraceInfo_0);
try {
tools.getStepStatus().clear();
ClipboardPage myStepPage = tools.getStepPage();
// Expression: =(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(true, "=", @isBatchRequestor(tools))))||(true=(@(Pega-RULES:Utilities).pzHasTaskAccess(tools,Primary)))
boolean pz_1 = ((true == FUAUtil.compareTwoValues(String.valueOf(true), FUAUtil.C2VOp.EQ, String.valueOf((pega.<Boolean>resolveMethodCall("isBatchRequestor--(PublicAPI)", "isBatchRequestor", null, null, new Object[] { tools })).booleanValue()))) || (true == (pega.<Boolean>resolveMethodCall("pzHasTaskAccess--(PublicAPI,ClipboardPage)", "pzHasTaskAccess", "Pega-RULES", "Utilities", new Object[] { tools, tools.getPrimaryPage() })).booleanValue()));
pega.activityStepWhenEpilog(oTraceInfo_0, pz_1, false);
	return pz_1;

} catch (ChainingException anyChainingException) {
  throw anyChainingException;

} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("in RULE-ACCESS-WHEN WORK-COVER-TASK PYCANACCESSTASK #20181023T153531.995 GMT: " + anyException.getMessage(), anyException);
}
}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final RulePool<ra_when_pycanaccesstask_122c3547154044b8c5f7cbc89229b446> oWhenPool = new RulePool<ra_when_pycanaccesstask_122c3547154044b8c5f7cbc89229b446>();
public static boolean invoke(PegaAPI aTools) {
ra_when_pycanaccesstask_122c3547154044b8c5f7cbc89229b446 when = oWhenPool.borrow();
if (when == null) {
when = new ra_when_pycanaccesstask_122c3547154044b8c5f7cbc89229b446(aTools);
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
	"Rule-Access-When:PYCANACCESSTASK"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYCANACCESSTASK","Rule-Access-When","WORK-COVER-TASK",false,"","Pega-Social","08-02-01","RULE-ACCESS-WHEN WORK-COVER-TASK PYCANACCESSTASK #20181023T153531.995 GMT","!PYCANACCESSTASK",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",786511837)
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
//	RULE-ACCESS-WHEN WORK-COVER-TASK PYCANACCESSTASK #20181023T153531.995 GMT:20181023T153531.995 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ddff7af0f388280863d69b44b74a0289";
	}

	public String getDefinitionAppliesToClass() {
		return "Work-Cover-Task";
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ACCESS-WHEN WORK-COVER-TASK PYCANACCESSTASK #20181023T153531.995 GMT", "Work-Cover-Task pyCanAccessTask", "Pega-Social", "08-02-01", "20181023T153531.995 GMT");
}
