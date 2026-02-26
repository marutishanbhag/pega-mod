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
public class ra_when_pzshowsearchdeprecationmsg_ba1c5e1f8c71a90cfcf20e9416b43cbd extends com.pega.pegarules.priv.AbstractFUASupport implements WhenBlock, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_When.pzShowSearchDeprecationMsg.Data_Portal.When");
	public ra_when_pzshowsearchdeprecationmsg_ba1c5e1f8c71a90cfcf20e9416b43cbd(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public boolean evaluate() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-WHEN DATA-PORTAL PZSHOWSEARCHDEPRECATIONMSG #20180713T135550.209 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pega.activityStepWhenProlog(oTraceInfo_0);
try {
tools.getStepStatus().clear();
ClipboardPage myStepPage = tools.getStepPage();
// Expression: =(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@startsWith(@toLowerCase(.pySearchText),"old:"), "=", true)))&&(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@toLowerCase(@Java("pega.getSystemSettings().getDynamic(\"Pega-SearchEngine\",\"indexing/distributed/enableOldSearch\")")), "!=", true)))
boolean pz_2 = ((true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", null, null, new Object[] { pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", null, null, new Object[] { scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), "old:" })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))) && (true == FUAUtil.compareTwoValues(pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", null, null, new Object[] { (pega.getSystemSettings().getDynamic("Pega-SearchEngine","indexing/distributed/enableOldSearch")) }), FUAUtil.C2VOp.NE, String.valueOf(true))));
pega.activityStepWhenEpilog(oTraceInfo_0, pz_2, false);
	return pz_2;

} catch (ChainingException anyChainingException) {
  throw anyChainingException;

} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("in RULE-OBJ-WHEN DATA-PORTAL PZSHOWSEARCHDEPRECATIONMSG #20180713T135550.209 GMT: " + anyException.getMessage(), anyException);
}
}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final RulePool<ra_when_pzshowsearchdeprecationmsg_ba1c5e1f8c71a90cfcf20e9416b43cbd> oWhenPool = new RulePool<ra_when_pzshowsearchdeprecationmsg_ba1c5e1f8c71a90cfcf20e9416b43cbd>();
public static boolean invoke(PegaAPI aTools) {
ra_when_pzshowsearchdeprecationmsg_ba1c5e1f8c71a90cfcf20e9416b43cbd when = oWhenPool.borrow();
if (when == null) {
when = new ra_when_pzshowsearchdeprecationmsg_ba1c5e1f8c71a90cfcf20e9416b43cbd(aTools);
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
	"Rule-Obj-When:PZSHOWSEARCHDEPRECATIONMSG"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSHOWSEARCHDEPRECATIONMSG","Rule-Obj-When","DATA-PORTAL",false,"","Pega-Desktop","08-01-01","RULE-OBJ-WHEN DATA-PORTAL PZSHOWSEARCHDEPRECATIONMSG #20180713T135550.209 GMT","!PZSHOWSEARCHDEPRECATIONMSG",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1941428895)
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
//	RULE-OBJ-WHEN DATA-PORTAL PZSHOWSEARCHDEPRECATIONMSG #20180713T135550.209 GMT:20180713T135550.209 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "e990c551cd8db855da96899d0841ba2d";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Portal";
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

private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pySearchText").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-WHEN DATA-PORTAL PZSHOWSEARCHDEPRECATIONMSG #20180713T135550.209 GMT", "Data-Portal pzShowSearchDeprecationMsg", "Pega-Desktop", "08-01-01", "20180713T135550.209 GMT");
}
