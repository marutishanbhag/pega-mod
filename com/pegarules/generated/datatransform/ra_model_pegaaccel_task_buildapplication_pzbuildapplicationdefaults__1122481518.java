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

public class ra_model_pegaaccel_task_buildapplication_pzbuildapplicationdefaults__1122481518 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_3;

    private final RuleHandle rule1;

    private final RuleHandle rule0;

    private static final String [] pRef_6 = new String[] { "", "", "pyConfiguringCurrentApplication", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pySelectedApplicationBadgeImage", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyShowTemplatesAsList", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyCurrentStepName", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyCurrentStepIndex", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGAACCEL-TASK-BUILDAPPLICATION PZBUILDAPPLICATIONDEFAULTS #20230618T001814.922 GMT", "PegaAccel-Task-BuildApplication pzBuildApplicationDefaults", "Pega-ProcessArchitect", "08-23-01", "20230618T001814.922 GMT");

    public ra_model_pegaaccel_task_buildapplication_pzbuildapplicationdefaults__1122481518(final Loadtime loadtime) {
        super(ruleTracer, false);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZISINNEWAPPWIZARDPORTAL", "pzIsInNewAppWizardPortal");
        rule1 = ruleHandleFactory.create("Rule-Obj-When", "!PZISAPPLICATIONSETUPUSER", "pzIsApplicationSetupUser");
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyShowTemplatesAsList").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().scalarProperty("pyConfiguringCurrentApplication").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyCurrentStepIndex", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyCurrentStepIndex", pRef_1, myStepPage, 0, "sNN", false, true);
            actionEpilog(runtime, "1", "Set .pyCurrentStepIndex", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyCurrentStepName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyCurrentStepName", pRef_2, myStepPage, "pzAppConfigSelectTemplate", "sTN", false, true);
            actionEpilog(runtime, "2", "Set .pyCurrentStepName", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                }
            }, ".pyShowTemplatesAsList==")) {
                try {
                    actionProlog(runtime, "3", "When .pyShowTemplatesAsList==", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "3.1", "Set .pyShowTemplatesAsList", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyShowTemplatesAsList", pRef_4, myStepPage, false, "sSN", false, true);
                        actionEpilog(runtime, "3.1", "Set .pyShowTemplatesAsList", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "3", "When .pyShowTemplatesAsList==", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                }
            }, ".pyConfiguringCurrentApplication==")) {
                try {
                    actionProlog(runtime, "4", "When .pyConfiguringCurrentApplication==", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "4.1", "Set .pyConfiguringCurrentApplication", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyConfiguringCurrentApplication", pRef_6, myStepPage, true, "sSN", false, true);
                        actionEpilog(runtime, "4.1", "Set .pyConfiguringCurrentApplication", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "4", "When .pyConfiguringCurrentApplication==", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "5", "Set .pySelectedApplicationBadgeImage", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pySelectedApplicationBadgeImage", pRef_7, myStepPage, "AppTemplateBadge.png", "sTN", false, true);
            actionEpilog(runtime, "5", "Set .pySelectedApplicationBadgeImage", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ruleDispatcher.invokeBoolean(runtime, rule1, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY, "PegaAccel-Task-BuildApplication");
                }
            }, "")) {
                try {
                    actionProlog(runtime, "6", "When pzIsApplicationSetupUser", null, null, runtimeTraceContext);
                    {
                        ParameterPage newParams_6_1 = runtime.parameterPageConstructor(null, null);
                        {
                            actionProlog(runtime, "6.1", "Apply Data Transform pzApplySetupUserDefaults", null, null, runtimeTraceContext);
                            pega.applyModel(myStepPage, "PegaAccel-Task-BuildApplication", newParams_6_1, "pzApplySetupUserDefaults");
                            actionEpilog(runtime, "6.1", "Apply Data Transform pzApplySetupUserDefaults", null, null, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_5) {
                    runtimeTraceContext.setError(e_5);
                    throw e_5;
                } finally {
                    actionEpilog(runtime, "6", "When pzIsApplicationSetupUser", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY, "PegaAccel-Task-BuildApplication");
                }
            }, "")) {
                try {
                    actionProlog(runtime, "7", "Otherwise When pzIsInNewAppWizardPortal", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "7.1", "Set .pyConfiguringCurrentApplication", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyConfiguringCurrentApplication", pRef_6, myStepPage, false, "sSN", false, true);
                        actionEpilog(runtime, "7.1", "Set .pyConfiguringCurrentApplication", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_4) {
                    runtimeTraceContext.setError(e_4);
                    throw e_4;
                } finally {
                    actionEpilog(runtime, "7", "Otherwise When pzIsInNewAppWizardPortal", null, null, runtimeTraceContext);
                }
            }
            ParameterPage newParams_8 = runtime.parameterPageConstructor(null, null);
            {
                actionProlog(runtime, "8", "Apply Data Transform pyDefault", null, null, runtimeTraceContext);
                pega.applyModel(myStepPage, "PegaAccel-Task-BuildApplication", newParams_8, "pyDefault");
                actionEpilog(runtime, "8", "Apply Data Transform pyDefault", null, null, runtimeTraceContext);
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
