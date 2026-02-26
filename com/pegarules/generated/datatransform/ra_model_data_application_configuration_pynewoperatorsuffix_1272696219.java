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

public class ra_model_data_application_configuration_pynewoperatorsuffix_1272696219 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private final RuleHandle rule0;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL DATA-APPLICATION-CONFIGURATION PYNEWOPERATORSUFFIX #20180713T132710.670 GMT", "Data-Application-Configuration pyNewOperatorSuffix", "Pega-RulesEngine", "08-01-01", "20180713T132710.670 GMT");

    public ra_model_data_application_configuration_pynewoperatorsuffix_1272696219(final Loadtime loadtime) {
        super(ruleTracer, true);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZBUILDFRAMEWORKLAYER", "pzBuildFrameworkLayer");
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().page("pyFrameworkAppInfo").scalarProperty("pyProductName").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().page("pyImplementationAppInfo").scalarProperty("pyProductName").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY, "Data-Application-Configuration");
                }
            }, "")) {
                try {
                    actionProlog(runtime, "1", "When pzBuildFrameworkLayer", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set Param.OperatorSuffix", null, null, runtimeTraceContext);
                        tools.putParamValue("OperatorSuffix", PropertyInfo.TYPE_TEXT, ("." + scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)));
                        actionEpilog(runtime, "1.1", "Set Param.OperatorSuffix", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "1", "When pzBuildFrameworkLayer", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "2", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "2.1", "Set Param.OperatorSuffix", null, null, runtimeTraceContext);
                        tools.putParamValue("OperatorSuffix", PropertyInfo.TYPE_TEXT, ("." + scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)));
                        actionEpilog(runtime, "2.1", "Set Param.OperatorSuffix", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "2", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
