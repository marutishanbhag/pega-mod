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

public class ra_when_data_application_configuration_pzcancreatenewapplication_1725148884 extends AbstractWhen {

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN DATA-APPLICATION-CONFIGURATION PZCANCREATENEWAPPLICATION #20210910T145256.776 GMT", "Data-Application-Configuration pzCanCreateNewApplication", "Pega-ProcessArchitect", "08-07-01", "20210910T145256.776 GMT");

    public ra_when_data_application_configuration_pzcancreatenewapplication_1725148884(final Loadtime loadtime) {
        super(ruleTracer);
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (((((pega.<Boolean>resolveMethodCall("pzHaveAccess--(Activity,String,int)", "pzHaveAccess", null, "Default", new Object[] { tools, "Rule-Application", 1 })).booleanValue() && (pega.<Boolean>resolveMethodCall("pzHaveAccess--(Activity,String,int)", "pzHaveAccess", null, "Default", new Object[] { tools, "Rule-RuleSet-Name", 1 })).booleanValue()) && (pega.<Boolean>resolveMethodCall("pzHaveAccess--(Activity,String,int)", "pzHaveAccess", null, "Default", new Object[] { tools, "Data-Admin-Operator-ID", 1 })).booleanValue()) && (pega.<Boolean>resolveMethodCall("pzHaveAccess--(Activity,String,int)", "pzHaveAccess", null, "Default", new Object[] { tools, "Data-Admin-Operator-AccessGroup", 1 })).booleanValue()) && ((pega.<Integer>resolveMethodCall("pzGetProductionLevelForSystem--()", "pzGetProductionLevelForSystem", null, "Utilities", new Object[] {})).intValue() != 5));
    }
}
