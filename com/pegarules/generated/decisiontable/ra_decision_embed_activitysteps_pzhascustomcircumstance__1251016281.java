package com.pegarules.generated.decisiontable;

import com.pega.platform.coreassemblers.decision.AbstractDecisionTable;
import java.util.List;
import com.pega.pegarules.priv.util.ExceptionDescriptor;
import java.util.Arrays;
import java.util.Collections;
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

public class ra_decision_embed_activitysteps_pzhascustomcircumstance__1251016281 extends AbstractDecisionTable {

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTABLE EMBED-ACTIVITYSTEPS PZHASCUSTOMCIRCUMSTANCE #20180713T135044.634 GMT", "Embed-ActivitySteps pzHasCustomCircumstance", "Pega-Desktop", "08-01-01", "20180713T135044.634 GMT");

    public ra_decision_embed_activitysteps_pzhascustomcircumstance__1251016281(final Loadtime loadtime) {
        super(ruleTracer);
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String var0 = tools.getParamValue("ruleName");
        if (((((((var0.equals("LOAD-DATAPAGE")) || (var0.equals("CALL-ASYNC-ACTIVITY"))) || (var0.equals("PAGE-SET-MESSAGES"))) || (var0.equals("PROPERTY-SET-MESSAGES"))) || (var0.equals("HISTORY-ADD"))) || (var0.equals("CALL-FUNCTION")))) {
            return String.valueOf(true);
        } else {
            return String.valueOf(false);
        }
    }
}
