package com.pegarules.generated.alias_function;
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
public class ra_action_pxconcatenate_f225918762c7a7b7966a8ed289461932  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Alias_Function.pxConcatenate.Embed_UserFunction.Action");
	public ra_action_pxconcatenate_f225918762c7a7b7966a8ed289461932(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}
public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXCONCATENATE #20210721T200142.792 GMT	Pega-RulesEngine:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
	ParameterPage paramPage = tools.getParameterPage();
	paramPage.put("D_pxConcatenate", fData0);
	paramPage.put("P_pxConcatenate", fParams0);

}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Alias-Function:PXCONCATENATE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PXCONCATENATE","Rule-Alias-Function","EMBED-USERFUNCTION",false,"","Pega-RulesEngine","08-07-01","RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXCONCATENATE #20210721T200142.792 GMT","!PXCONCATENATE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",12195211)
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
//	RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXCONCATENATE #20210721T200142.792 GMT:20210721T230546.301 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "1f66fbb82bf4b3f880b4483e0165612d";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-UserFunction";
	}
public String getAspect() {
return "Action";
}
private static final StringMap fData0 = new HashStringMap();
private static final ArrayList fParams0 = new ArrayList();

static {
	fData0.putString("pyLabel", "Concatenate");
	fData0.putString("pyReturnType", "Text");
	fData0.putString("pyUsage", "");
	fData0.putString("pyDescription", "Returns a Text value appended  to the end of another Text value. Separates the two values by a separator (if specified).");
	StringMap paramData0 = null;
	paramData0 = new HashStringMap();
	paramData0.putString("pyParametersParamName", "P1");
	paramData0.putString("pyParametersDataType", "Text");
	paramData0.putString("pyParametersParamDesc", "Beginning Text Value");
	paramData0.putString("pyIsOptional", "false");
	fParams0.add(paramData0);

	paramData0 = new HashStringMap();
	paramData0.putString("pyParametersParamName", "P2");
	paramData0.putString("pyParametersDataType", "Text");
	paramData0.putString("pyParametersParamDesc", "End Text Value");
	paramData0.putString("pyIsOptional", "false");
	fParams0.add(paramData0);

	paramData0 = new HashStringMap();
	paramData0.putString("pyParametersParamName", "P3");
	paramData0.putString("pyParametersDataType", "Text");
	paramData0.putString("pyParametersParamDesc", "Separator Value");
	paramData0.putString("pyIsOptional", "true");
	fParams0.add(paramData0);

}

public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXCONCATENATE #20210721T200142.792 GMT", "Embed-UserFunction pxConcatenate", "Pega-RulesEngine", "08-07-01", "20210721T230546.301 GMT");
}
