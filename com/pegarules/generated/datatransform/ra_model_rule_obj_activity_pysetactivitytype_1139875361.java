package com.pegarules.generated.datatransform;

import com.pega.platform.coreassemblers.datatransform.AbstractDataTransform;
import com.pega.pegarules.priv.util.OutputType;
import com.pega.pegarules.priv.util.InputBinding;
import java.util.List;
import com.pega.pegarules.priv.util.ExceptionDescriptor;
import java.util.Arrays;
import java.util.Collections;
import com.pega.platform.executionengine.intrinsic.PropertyUtility;
import com.pega.platform.executionengine.intrinsic.PageUtility;
import com.pega.platform.executionengine.runtime.PageIterator;
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
import com.pega.platform.clipboard.query.ScalarValueQuery;
import com.pega.platform.clipboard.query.QueryBuilderFactory;

public class ra_model_rule_obj_activity_pysetactivitytype_1139875361 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_4 = new String[] { "", "", "pyLabel", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyRefToFocusKey", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyRulePrefix", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyActivityType", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE-OBJ-ACTIVITY PYSETACTIVITYTYPE #20180713T135522.432 GMT", "Rule-Obj-Activity pySetActivityType", "Pega-Desktop", "08-01-01", "20180713T135522.432 GMT");

    public ra_model_rule_obj_activity_pysetactivitytype_1139875361(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyActivityTypeSelector").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyActivityType", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyActivityType", pRef_1, myStepPage, scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
            actionEpilog(runtime, "1", "Set .pyActivityType", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyRulePrefix", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyRulePrefix", pRef_3, myStepPage, "px", "stN", false, true);
            actionEpilog(runtime, "2", "Set .pyRulePrefix", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyLabel", pRef_4, myStepPage, "", "sTN64", false, true);
            actionEpilog(runtime, "3", "Set .pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set .pyRefToFocusKey", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyRefToFocusKey", pRef_5, myStepPage, "", "sTI", false, true);
            actionEpilog(runtime, "4", "Set .pyRefToFocusKey", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
