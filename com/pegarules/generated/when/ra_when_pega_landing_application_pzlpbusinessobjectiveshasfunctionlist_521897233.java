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

public class ra_when_pega_landing_application_pzlpbusinessobjectiveshasfunctionlist_521897233 extends AbstractWhen {

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN PEGA-LANDING-APPLICATION PZLPBUSINESSOBJECTIVESHASFUNCTIONLIST #20200914T112529.685 GMT", "Pega-Landing-Application pzLPBusinessObjectivesHasFunctionList", "Pega-LP-Application", "08-06-01", "20200914T112529.685 GMT");

    public ra_when_pega_landing_application_pzlpbusinessobjectiveshasfunctionlist_521897233(final Loadtime loadtime) {
        super(ruleTracer);
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return ((pega.<Boolean>resolveMethodCall("PropertyHasValue--(PublicAPI,String)", "PropertyHasValue", "Pega-RULES", "Utilities", new Object[] { tools, "D_pzGetApplicationDetails.pyBusinessFunctionList" })).booleanValue() && ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { pega.findPageWithException("D_pzGetApplicationDetails", "Rule-Application").getProperty(pega, "pyBusinessFunctionList") })).intValue() > 0));
    }
}
