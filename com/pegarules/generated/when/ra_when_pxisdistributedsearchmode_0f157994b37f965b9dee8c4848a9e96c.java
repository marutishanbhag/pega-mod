package com.pegarules.generated.when;
/*
 * Copyright (c) 2024 Pegasystems Inc.
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
public class ra_when_pxisdistributedsearchmode_0f157994b37f965b9dee8c4848a9e96c extends com.pega.pegarules.priv.AbstractFUASupport implements WhenBlock, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_When.pxIsDistributedSearchMode.Pega_Search.When");
	public ra_when_pxisdistributedsearchmode_0f157994b37f965b9dee8c4848a9e96c(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public boolean evaluate() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-WHEN PEGA-SEARCH PXISDISTRIBUTEDSEARCHMODE #20180713T132853.415 GMT	Pega-SearchEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pega.activityStepWhenProlog(oTraceInfo_0);
try {
tools.getStepStatus().clear();
ClipboardPage myStepPage = tools.getStepPage();
// Expression: =(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@Java("Boolean.toString(pega.getSettingsAPI().isDistributedSearchMode())"), "=", true)))
boolean pz_1 = (true == FUAUtil.compareTwoValues((Boolean.toString(pega.getSettingsAPI().isDistributedSearchMode())), FUAUtil.C2VOp.EQ, String.valueOf(true)));
pega.activityStepWhenEpilog(oTraceInfo_0, pz_1, false);
	return pz_1;

} catch (ChainingException anyChainingException) {
  throw anyChainingException;

} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("in RULE-OBJ-WHEN PEGA-SEARCH PXISDISTRIBUTEDSEARCHMODE #20180713T132853.415 GMT: " + anyException.getMessage(), anyException);
}
}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final RulePool<ra_when_pxisdistributedsearchmode_0f157994b37f965b9dee8c4848a9e96c> oWhenPool = new RulePool<ra_when_pxisdistributedsearchmode_0f157994b37f965b9dee8c4848a9e96c>();
public static boolean invoke(PegaAPI aTools) {
ra_when_pxisdistributedsearchmode_0f157994b37f965b9dee8c4848a9e96c when = oWhenPool.borrow();
if (when == null) {
when = new ra_when_pxisdistributedsearchmode_0f157994b37f965b9dee8c4848a9e96c(aTools);
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
	"Rule-Obj-When:PXISDISTRIBUTEDSEARCHMODE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PXISDISTRIBUTEDSEARCHMODE","Rule-Obj-When","PEGA-SEARCH",false,"","Pega-SearchEngine","08-01-01","RULE-OBJ-WHEN PEGA-SEARCH PXISDISTRIBUTEDSEARCHMODE #20180713T132853.415 GMT","!PXISDISTRIBUTEDSEARCHMODE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1702768937)
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
//	RULE-OBJ-WHEN PEGA-SEARCH PXISDISTRIBUTEDSEARCHMODE #20180713T132853.415 GMT:20180713T132853.415 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "568ed60046d677b9978387607771e6ff";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-Search";
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-WHEN PEGA-SEARCH PXISDISTRIBUTEDSEARCHMODE #20180713T132853.415 GMT", "Pega-Search pxIsDistributedSearchMode", "Pega-SearchEngine", "08-01-01", "20180713T132853.415 GMT");
}
