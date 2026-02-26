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

public class ra_model_pega_fields_complex_pzsetpagemode__182413190 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_3 = new String[] { "", "", "pyType", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyPropertyMode", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-FIELDS-COMPLEX PZSETPAGEMODE #20210119T160503.312 GMT", "Pega-Fields-Complex pzSetPageMode", "Pega-ProcessArchitect", "08-06-01", "20210119T160503.312 GMT");

    public ra_model_pega_fields_complex_pzsetpagemode__182413190(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyType").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set param.classToUse", null, null, runtimeTraceContext);
            tools.putParamValue("classToUse", PropertyInfo.TYPE_TEXT, ((tools.getParamValue("Type").equals("")) ? "Pega-Fields-Complex-Page" : tools.getParamValue("Type")));
            actionEpilog(runtime, "1", "Set param.classToUse", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyPropertyMode", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyPropertyMode", pRef_1, myStepPage, ((tools.getParamValue("classToUse").equals("Pega-Fields-Complex-Page")) ? "Page" : "PageList"), "sIN", false, true);
            actionEpilog(runtime, "2", "Set .pyPropertyMode", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, ".pyType == ")) {
                try {
                    actionProlog(runtime, "3", "When .pyType == ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "3.1", "Set .pyType", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyType", pRef_3, myStepPage, tools.getParamValue("classToUse"), "stN", false, true);
                        actionEpilog(runtime, "3.1", "Set .pyType", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "3", "When .pyType == ", null, null, runtimeTraceContext);
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
