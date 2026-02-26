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

public class ra_when_pega_landing_pzshowpropertyoptimizationlandingpage__1964239621 extends AbstractWhen {

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN PEGA-LANDING PZSHOWPROPERTYOPTIMIZATIONLANDINGPAGE #20180713T134322.806 GMT", "Pega-Landing pzShowPropertyOptimizationLandingPage", "Pega-Reporting", "08-01-01", "20180713T134322.806 GMT");

    public ra_when_pega_landing_pzshowpropertyoptimizationlandingpage__1964239621(final Loadtime loadtime) {
        super(ruleTracer);
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return ((FUAUtil.compareTwoValues(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-RULES", "database/AutoDBSchemaChanges", "true" }), FUAUtil.C2VOp.EQ, String.valueOf(true)) && FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("HavePrivilege--(Activity,String,String,Page)", "HavePrivilege", null, null, new Object[] { tools, "SchemaPropertyOptimization", "@baseclass", null })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))) && (pega.<Boolean>resolveMethodCall("pzIsToggleEnabled--(String,String)", "pzIsToggleEnabled", "Pega-WB", "pzReleaseToggleUtilities", new Object[] { "PegaRULES", "PropertyOptimizationLandingPageToggle" })).booleanValue());
    }
}
