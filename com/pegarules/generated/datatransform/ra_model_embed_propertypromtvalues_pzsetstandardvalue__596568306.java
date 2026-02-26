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

public class ra_model_embed_propertypromtvalues_pzsetstandardvalue__596568306 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_5 = new String[] { "", "", "pyCaseContext", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyStandardValue", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-PROPERTYPROMTVALUES PZSETSTANDARDVALUE #20220208T180550.301 GMT", "Embed-PropertyPromtValues pzSetStandardValue", "Pega-ProcessArchitect", "08-08-01", "20220208T180550.301 GMT");

    public ra_model_embed_propertypromtvalues_pzsetstandardvalue__596568306(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pyStandardValue").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyCaseContext").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().scalarProperty("pyLocalizedValue").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ((scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")) || (scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("true")));
                }
            }, ".pyStandardValue ==  || .pyCaseContext = true")) {
                try {
                    actionProlog(runtime, "1", "When .pyStandardValue ==  || .pyCaseContext = true", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set .pyStandardValue", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyStandardValue", pRef_3, myStepPage, scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                        actionEpilog(runtime, "1.1", "Set .pyStandardValue", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.3", "Set .pyCaseContext", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyCaseContext", pRef_5, myStepPage, "true", "sTN", false, true);
                        actionEpilog(runtime, "1.3", "Set .pyCaseContext", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "1", "When .pyStandardValue ==  || .pyCaseContext = true", null, null, runtimeTraceContext);
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
