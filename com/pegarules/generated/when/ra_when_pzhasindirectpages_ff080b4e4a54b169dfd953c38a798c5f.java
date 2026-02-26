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
public class ra_when_pzhasindirectpages_ff080b4e4a54b169dfd953c38a798c5f extends com.pega.pegarules.priv.AbstractFUASupport implements WhenBlock, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_When.pzHasIndirectPages.Embed_ActivitySteps.When");
	public ra_when_pzhasindirectpages_ff080b4e4a54b169dfd953c38a798c5f(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public boolean evaluate() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-WHEN EMBED-ACTIVITYSTEPS PZHASINDIRECTPAGES #20180713T135550.396 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pega.activityStepWhenProlog(oTraceInfo_0);
try {
tools.getStepStatus().clear();
ClipboardPage myStepPage = tools.getStepPage();
// Expression: =(true=(@java("(tools.getStepPage().getPage(\"pyStepsPageAliases\").size() > 1)+\"\"")))||((true=(@java("(tools.getStepPage().getPage(\"pyStepsPageAliases\").size() > 2)+\"\"")))&&(true=(@(Pega-RULES:Utilities).PropertyHasValue(tools, .pyStepsPageAliases.pyTempPlaceHolder))))
boolean pz_3 = ((true == tools.interpretBoolean(((tools.getStepPage().getPage("pyStepsPageAliases").size() > 1)+""))) || ((true == tools.interpretBoolean(((tools.getStepPage().getPage("pyStepsPageAliases").size() > 2)+""))) && (true == (pega.<Boolean>resolveMethodCall("PropertyHasValue--(PublicAPI,String)", "PropertyHasValue", "Pega-RULES", "Utilities", new Object[] { tools, scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue())));
pega.activityStepWhenEpilog(oTraceInfo_0, pz_3, false);
	return pz_3;

} catch (ChainingException anyChainingException) {
  throw anyChainingException;

} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("in RULE-OBJ-WHEN EMBED-ACTIVITYSTEPS PZHASINDIRECTPAGES #20180713T135550.396 GMT: " + anyException.getMessage(), anyException);
}
}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final RulePool<ra_when_pzhasindirectpages_ff080b4e4a54b169dfd953c38a798c5f> oWhenPool = new RulePool<ra_when_pzhasindirectpages_ff080b4e4a54b169dfd953c38a798c5f>();
public static boolean invoke(PegaAPI aTools) {
ra_when_pzhasindirectpages_ff080b4e4a54b169dfd953c38a798c5f when = oWhenPool.borrow();
if (when == null) {
when = new ra_when_pzhasindirectpages_ff080b4e4a54b169dfd953c38a798c5f(aTools);
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
	"Rule-Obj-When:PZHASINDIRECTPAGES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZHASINDIRECTPAGES","Rule-Obj-When","EMBED-ACTIVITYSTEPS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-WHEN EMBED-ACTIVITYSTEPS PZHASINDIRECTPAGES #20180713T135550.396 GMT","!PZHASINDIRECTPAGES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1019320400)
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
//	RULE-OBJ-WHEN EMBED-ACTIVITYSTEPS PZHASINDIRECTPAGES #20180713T135550.396 GMT:20180713T135550.396 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "524180c3dd70519cfef00c13dd734d5a";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-ActivitySteps";
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

public static final String[] pRef_2 = new String[] { "", "", "pyStepsPageAliases", "", "pyTempPlaceHolder", "" };
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().allowMissingPropertyException().page("pyStepsPageAliases").scalarProperty("pyTempPlaceHolder").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-WHEN EMBED-ACTIVITYSTEPS PZHASINDIRECTPAGES #20180713T135550.396 GMT", "Embed-ActivitySteps pzHasIndirectPages", "Pega-Desktop", "08-01-01", "20180713T135550.396 GMT");
}
