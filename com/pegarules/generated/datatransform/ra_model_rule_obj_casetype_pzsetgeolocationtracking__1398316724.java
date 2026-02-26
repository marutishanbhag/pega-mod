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

public class ra_model_rule_obj_casetype_pzsetgeolocationtracking__1398316724 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_4 = new String[] { "", "", "pyLPGeolocationEnabled", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyLPGeolocationStatus", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE-OBJ-CASETYPE PZSETGEOLOCATIONTRACKING #20180713T141246.199 GMT", "Rule-Obj-CaseType pzSetGeolocationTracking", "Pega-ProcessArchitect", "08-01-01", "20180713T141246.199 GMT");

    public ra_model_rule_obj_casetype_pzsetgeolocationtracking__1398316724(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pyLPGeolocationEnabled").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyLPGeolocationStatus").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (tools.getParamValue("PreOrPostProcessing").equals("pre"));
                }
            }, "Param.PreOrPostProcessing==pre")) {
                try {
                    actionProlog(runtime, "1", "When Param.PreOrPostProcessing==pre", null, null, runtimeTraceContext);
                    {
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Enabled"));
                            }
                        }, ".pyLPGeolocationEnabled==Enabled")) {
                            try {
                                actionProlog(runtime, "1.1", "When .pyLPGeolocationEnabled==Enabled", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "1.1.1", "Set .pyLPGeolocationStatus", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyLPGeolocationStatus", pRef_2, myStepPage, true, "sSN", false, true);
                                    actionEpilog(runtime, "1.1.1", "Set .pyLPGeolocationStatus", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_2) {
                                runtimeTraceContext.setError(e_2);
                                throw e_2;
                            } finally {
                                actionEpilog(runtime, "1.1", "When .pyLPGeolocationEnabled==Enabled", null, null, runtimeTraceContext);
                            }
                        } else {
                            try {
                                actionProlog(runtime, "1.2", "Otherwise ", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "1.2.1", "Set .pyLPGeolocationStatus", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyLPGeolocationStatus", pRef_2, myStepPage, false, "sSN", false, true);
                                    actionEpilog(runtime, "1.2.1", "Set .pyLPGeolocationStatus", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_3) {
                                runtimeTraceContext.setError(e_3);
                                throw e_3;
                            } finally {
                                actionEpilog(runtime, "1.2", "Otherwise ", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_4) {
                    runtimeTraceContext.setError(e_4);
                    throw e_4;
                } finally {
                    actionEpilog(runtime, "1", "When Param.PreOrPostProcessing==pre", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "2", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_3.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
                            }
                        }, ".pyLPGeolocationStatus==true")) {
                            try {
                                actionProlog(runtime, "2.1", "When .pyLPGeolocationStatus==true", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "2.1.1", "Set .pyLPGeolocationEnabled", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyLPGeolocationEnabled", pRef_4, myStepPage, "Enabled", "stN", false, true);
                                    actionEpilog(runtime, "2.1.1", "Set .pyLPGeolocationEnabled", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_5) {
                                runtimeTraceContext.setError(e_5);
                                throw e_5;
                            } finally {
                                actionEpilog(runtime, "2.1", "When .pyLPGeolocationStatus==true", null, null, runtimeTraceContext);
                            }
                        } else {
                            try {
                                actionProlog(runtime, "2.2", "Otherwise ", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "2.2.1", "Set .pyLPGeolocationEnabled", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyLPGeolocationEnabled", pRef_4, myStepPage, "Disabled", "stN", false, true);
                                    actionEpilog(runtime, "2.2.1", "Set .pyLPGeolocationEnabled", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_6) {
                                runtimeTraceContext.setError(e_6);
                                throw e_6;
                            } finally {
                                actionEpilog(runtime, "2.2", "Otherwise ", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_7) {
                    runtimeTraceContext.setError(e_7);
                    throw e_7;
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
