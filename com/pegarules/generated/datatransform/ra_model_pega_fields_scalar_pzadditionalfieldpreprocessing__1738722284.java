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

public class ra_model_pega_fields_scalar_pzadditionalfieldpreprocessing__1738722284 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_4 = new String[] { "", "", "pyInputMethod", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyHasExpression", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-FIELDS-SCALAR PZADDITIONALFIELDPREPROCESSING #20230618T001814.637 GMT", "Pega-Fields-Scalar pzAdditionalFieldPreProcessing", "Pega-ProcessArchitect", "08-23-01", "20230618T001814.637 GMT");

    public ra_model_pega_fields_scalar_pzadditionalfieldpreprocessing__1738722284(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().page("pyCalculatedFieldInfo").scalarProperty("pzInsKey").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyHasExpression").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            ParameterPage newParams_1 = runtime.parameterPageConstructor(null, null);
            {
                actionProlog(runtime, "1", "Apply Data Transform pzInitializeCalculatedValueInfo", null, null, runtimeTraceContext);
                pega.applyModel(myStepPage, "Pega-Fields-Scalar", newParams_1, "pzInitializeCalculatedValueInfo");
                actionEpilog(runtime, "1", "Apply Data Transform pzInitializeCalculatedValueInfo", null, null, runtimeTraceContext);
            }
            actionProlog(runtime, "2", "Set .pyHasExpression", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyHasExpression", pRef_1, myStepPage, (!(scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))), "sSN", false, true);
            actionEpilog(runtime, "2", "Set .pyHasExpression", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return scalarValueQuery_3.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
                }
            }, ".pyHasExpression")) {
                try {
                    actionProlog(runtime, "3", "When .pyHasExpression", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "3.1", "Set .pyInputMethod", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyInputMethod", pRef_4, myStepPage, "CALCULATED", "stN", false, true);
                        actionEpilog(runtime, "3.1", "Set .pyInputMethod", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "3", "When .pyHasExpression", null, null, runtimeTraceContext);
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
