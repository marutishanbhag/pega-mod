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

public class ra_model_pega_fields_scalar_text_pzfieldpostprocessingsetup_584842298 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_3 = new String[] { "", "", "pySourceProperty", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-FIELDS-SCALAR-TEXT PZFIELDPOSTPROCESSINGSETUP #20230618T001815.185 GMT", "Pega-Fields-Scalar-Text pzFieldPostProcessingSetup", "Pega-ProcessArchitect", "08-23-01", "20230618T001815.185 GMT");

    public ra_model_pega_fields_scalar_text_pzfieldpostprocessingsetup_584842298(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pyEnableAIAssistance").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pySourceProperty").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return scalarValueQuery_1.resolveToBoolean(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TRUEFALSE);
                }
            }, "Primary.pyEnableAIAssistance")) {
                try {
                    actionProlog(runtime, "1", "When Primary.pyEnableAIAssistance", null, null, runtimeTraceContext);
                    {
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_2.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                            }
                        }, "Primary.pySourceProperty==")) {
                            try {
                                actionProlog(runtime, "1.1", "When Primary.pySourceProperty==", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "1.1.1", "Set Primary.pySourceProperty", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pySourceProperty", pRef_3, tools.getPrimaryPage(), ".pyDescription", "sTN", false, true);
                                    actionEpilog(runtime, "1.1.1", "Set Primary.pySourceProperty", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_3) {
                                runtimeTraceContext.setError(e_3);
                                throw e_3;
                            } finally {
                                actionEpilog(runtime, "1.1", "When Primary.pySourceProperty==", null, null, runtimeTraceContext);
                            }
                        } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return ((!(scalarValueQuery_2.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals(""))) && ((!(pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", null, "String", new Object[] { scalarValueQuery_2.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "." })).booleanValue())));
                            }
                        }, "Primary.pySourceProperty!=&&!@String.startsWith(Primary.pySourceProperty,.)")) {
                            try {
                                actionProlog(runtime, "1.2", "Otherwise When Primary.pySourceProperty!=&&!@String.startsWith(Primary.pySourceProperty,.)", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "1.2.1", "Set Primary.pySourceProperty", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pySourceProperty", pRef_3, tools.getPrimaryPage(), ("." + scalarValueQuery_2.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
                                    actionEpilog(runtime, "1.2.1", "Set Primary.pySourceProperty", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_2) {
                                runtimeTraceContext.setError(e_2);
                                throw e_2;
                            } finally {
                                actionEpilog(runtime, "1.2", "Otherwise When Primary.pySourceProperty!=&&!@String.startsWith(Primary.pySourceProperty,.)", null, null, runtimeTraceContext);
                            }
                        }
                        actionProlog(runtime, "1.3", "Set param.noop", null, null, runtimeTraceContext);
                        tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pxExecuteAnActivity--(ClipboardPage,String)", "pxExecuteAnActivity", null, "Utilities", new Object[] { myStepPage, "pxGenerateTextPredictionArtefacts" })).booleanValue()));
                        actionEpilog(runtime, "1.3", "Set param.noop", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_4) {
                    runtimeTraceContext.setError(e_4);
                    throw e_4;
                } finally {
                    actionEpilog(runtime, "1", "When Primary.pyEnableAIAssistance", null, null, runtimeTraceContext);
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
