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
import com.pega.platform.clipboard.query.PageQuery;
import com.pega.platform.clipboard.query.QueryBuilderFactory;

public class ra_model_pega_fields_scalar_pzsetdefaultconfigforchange__868922106 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_4;

    private final PageQuery pageQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_5 = new String[] { "", "", "pySupportsCalculation", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyStreamName", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-FIELDS-SCALAR PZSETDEFAULTCONFIGFORCHANGE #20200224T191054.765 GMT", "Pega-Fields-Scalar pzSetDefaultConfigForChange", "Pega-ProcessArchitect", "08-05-01", "20200303T233240.630 GMT");

    public ra_model_pega_fields_scalar_pzsetdefaultconfigforchange__868922106(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pxObjClass").buildScalarValueQuery();
        pageQuery_2 = queryBuilderFactory.create().pageList("pxResults", 1).buildPageQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().scalarProperty("pyStreamName").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            ClipboardPage sourcePage_1 = pageQuery_2.resolve(tools, pega.findDataPage("D_pzAvailableControlsForField", false, "ContextClass", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)));
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = tools.getPrimaryPage();
            PRStackFrame stackFrame_1 = null;
            try {
                stackFrame_1 = pega.pushStackFrame("Pega-Fields-Scalar", null, myStepPage, false, false);
                actionProlog(runtime, "1", "Update Page Primary", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.1", "Set .pyStreamName", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyStreamName", pRef_3, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                    public String apply(ClipboardPage myStepPage) {
                        return scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                    }
                }), "siN", false, true);
                actionEpilog(runtime, "1.1", "Set .pyStreamName", sourcePage_1, myStepPage, runtimeTraceContext);
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "1", "Update Page Primary", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_1);
                myStepPage = tmp_1;
            }
            actionProlog(runtime, "2", "Set .pySupportsCalculation", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pySupportsCalculation", pRef_5, myStepPage, true, "sSN", false, true);
            actionEpilog(runtime, "2", "Set .pySupportsCalculation", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
