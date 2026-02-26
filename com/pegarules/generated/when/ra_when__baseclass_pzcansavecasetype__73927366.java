package com.pegarules.generated.when;

import com.pega.platform.coreassemblers.when.AbstractWhen;
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.EvaluateFunction;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.FUAUtil.C2VOp;
import com.pega.pegarules.priv.tracer.RuleTraceInfo;
import com.pega.pegarules.pub.clipboard.ClipboardPage;
import com.pega.pegarules.pub.clipboard.ClipboardProperty;
import com.pega.pegarules.pub.context.PRStackFrame;
import com.pega.pegarules.pub.dictionary.ImmutablePropertyInfo;
import com.pega.pegarules.pub.dictionary.PropertyInfo;
import com.pega.pegarules.pub.runtime.ParameterPage;
import com.pega.pegarules.pub.runtime.PublicAPI;
import com.pega.platform.coreassemblers.when.AbstractWhen;
import com.pega.platform.executionengine.intrinsic.PageListUtility;
import com.pega.platform.executionengine.runtime.Aspect;
import com.pega.platform.executionengine.runtime.Loadtime;
import com.pega.platform.executionengine.runtime.RuleDispatcher;
import com.pega.platform.executionengine.runtime.RuleDispatcher.StackBehavior;
import com.pega.platform.executionengine.runtime.RuleHandle;
import com.pega.platform.executionengine.runtime.RuleHandleFactory;
import com.pega.platform.executionengine.runtime.Runtime;
import com.pega.pegarules.pub.clipboard.PRStringFormat;
import java.util.Date;
import com.pega.pegarules.pub.util.*;

public class ra_when__baseclass_pzcansavecasetype__73927366 extends AbstractWhen {

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN @BASECLASS PZCANSAVECASETYPE #20180713T141300.310 GMT", "@baseclass pzCanSaveCaseType", "Pega-ProcessArchitect", "08-01-01", "20180713T141300.310 GMT");

    public ra_when__baseclass_pzcansavecasetype__73927366(final Loadtime loadtime) {
        super(ruleTracer);
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return ((((((((!(pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", "Pega-RULES", "Default", new Object[] { tools.findPage("CaseTypeStages") })).booleanValue())) && ((!((pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseSLAPage", tools })).booleanValue() && (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", "Pega-RULES", "Default", new Object[] { tools.findPage("CaseSLAPage") })).booleanValue())))) && ((!((pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "TempCaseTypePage", tools })).booleanValue() && (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", "Pega-RULES", "Default", new Object[] { tools.findPage("TempCaseTypePage") })).booleanValue())))) && ((!((pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseTypes", tools })).booleanValue() && (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", "Pega-RULES", "Default", new Object[] { tools.findPage("CaseTypes") })).booleanValue())))) && ((!((pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseTypePage", tools })).booleanValue() && (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", "Pega-RULES", "Default", new Object[] { tools.findPage("CaseTypePage") })).booleanValue())))) && ((!((pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "CurrentCaseEmailConfigurations", tools })).booleanValue() && (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", "Pega-RULES", "Default", new Object[] { tools.findPage("CurrentCaseEmailConfigurations") })).booleanValue())))) && ((!((pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseMatchRulePg", tools })).booleanValue() && (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", "Pega-RULES", "Default", new Object[] { tools.findPage("CaseMatchRulePg") })).booleanValue()))));
    }
}
