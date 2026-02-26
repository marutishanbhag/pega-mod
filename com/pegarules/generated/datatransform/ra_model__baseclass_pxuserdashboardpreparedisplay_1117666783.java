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

public class ra_model__baseclass_pxuserdashboardpreparedisplay_1117666783 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_5;

    private static final String [] pRef_4 = new String[] { "", "", "pxUserDashboard", "", "pyDescription", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyLabel", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pxUserDashboard", "", "pyLabel", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pxUserDashboardCategory", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL @BASECLASS PXUSERDASHBOARDPREPAREDISPLAY #20200723T170327.890 GMT", "@baseclass pxUserDashboardPrepareDisplay", "Pega-EndUserUI", "08-06-01", "20200723T170327.890 GMT");

    public ra_model__baseclass_pxuserdashboardpreparedisplay_1117666783(final Loadtime loadtime) {
        super(ruleTracer, false);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_5 = queryBuilderFactory.create().page("pxUserDashboard").scalarProperty("pyLabel").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pxUserDashboardCategory", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxUserDashboardCategory", pRef_1, myStepPage, tools.getParamValue("UserDashboardCategory"), "sTY", false, true);
            actionEpilog(runtime, "1", "Set .pxUserDashboardCategory", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyLabel", pRef_2, myStepPage, "", "sTN64", false, true);
            actionEpilog(runtime, "2", "Set .pyLabel", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (!(tools.getParamValue("UserDashboardLabel").equals("")));
                }
            }, "Param.UserDashboardLabel!=")) {
                try {
                    actionProlog(runtime, "3", "When Param.UserDashboardLabel!=", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "3.1", "Set .pxUserDashboard.pyLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pxUserDashboard.pyLabel", pRef_3, myStepPage, tools.getParamValue("UserDashboardLabel"), "sTN64", false, true);
                        actionEpilog(runtime, "3.1", "Set .pxUserDashboard.pyLabel", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "3", "When Param.UserDashboardLabel!=", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "4", "Set .pxUserDashboard.pyDescription", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxUserDashboard.pyDescription", pRef_4, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyCaption", tools }), "sTN", false, true);
            actionEpilog(runtime, "4", "Set .pxUserDashboard.pyDescription", null, null, runtimeTraceContext);
            ParameterPage newParams_5 = runtime.parameterPageConstructor(Arrays.asList(new InputBinding("Personalize", String.valueOf(false)), new InputBinding("LocalSlot", ""), new InputBinding("LocalWidget", "")), null);
            {
                actionProlog(runtime, "5", "Apply Data Transform pxUserDashboardSetMode", null, null, runtimeTraceContext);
                pega.applyModel(myStepPage, "@baseclass", newParams_5, "pxUserDashboardSetMode");
                actionEpilog(runtime, "5", "Apply Data Transform pxUserDashboardSetMode", null, null, runtimeTraceContext);
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
