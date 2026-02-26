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

public class ra_model_rule__pysplitfocuskey_674869512 extends AbstractDataTransform {

    private final RuleHandle rule0;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE- PYSPLITFOCUSKEY #20180713T135526.152 GMT", "Rule- pySplitFocusKey", "Pega-Desktop", "08-01-01", "20180713T135526.152 GMT");

    public ra_model_rule__pysplitfocuskey_674869512(final Loadtime loadtime) {
        super(ruleTracer, true);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZRASHOWPREFIXBUTTONS", "pzRAShowPrefixButtons");
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ((pega.<Integer>resolveMethodCall("length--(String)", "length", null, null, new Object[] { tools.getParamValue("IdentFocusValue") })).intValue() >= 2);
                }
            }, "@length(Param.IdentFocusValue) >= 2")) {
                try {
                    actionProlog(runtime, "1", "When @length(Param.IdentFocusValue) >= 2", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set Param.lcl_sOrigPrefix", null, null, runtimeTraceContext);
                        tools.putParamValue("lcl_sOrigPrefix", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, null, new Object[] { tools.getParamValue("IdentFocusValue"), 0, 2 }));
                        actionEpilog(runtime, "1.1", "Set Param.lcl_sOrigPrefix", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.2", "Set Param.sPrefix", null, null, runtimeTraceContext);
                        tools.putParamValue("sPrefix", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", null, null, new Object[] { tools.getParamValue("lcl_sOrigPrefix") }));
                        actionEpilog(runtime, "1.2", "Set Param.sPrefix", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "1", "When @length(Param.IdentFocusValue) >= 2", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (((tools.getParamValue("sPrefix").equals("px")) || (tools.getParamValue("sPrefix").equals("py"))) || (tools.getParamValue("sPrefix").equals("pz")));
                }
            }, "Param.sPrefix == px || Param.sPrefix == py || Param.sPrefix == pz")) {
                try {
                    actionProlog(runtime, "2", "When Param.sPrefix == px || Param.sPrefix == py || Param.sPrefix == pz", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "2.1", "Set Param.IdentFocusValue", null, null, runtimeTraceContext);
                        tools.putParamValue("IdentFocusValue", PropertyInfo.TYPE_TEXT, ("p" + pega.<String>resolveMethodCall("substring--(String,int)", "substring", null, null, new Object[] { tools.getParamValue("IdentFocusValue"), 1 })));
                        actionEpilog(runtime, "2.1", "Set Param.IdentFocusValue", null, null, runtimeTraceContext);
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY, "Rule-");
                            }
                        }, "")) {
                            try {
                                actionProlog(runtime, "2.2", "When pzRAShowPrefixButtons", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "2.2.1", "Set Param.IdentFocusValue", null, null, runtimeTraceContext);
                                    tools.putParamValue("IdentFocusValue", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("substring--(String,int)", "substring", null, null, new Object[] { tools.getParamValue("IdentFocusValue"), 2 }));
                                    actionEpilog(runtime, "2.2.1", "Set Param.IdentFocusValue", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_3) {
                                runtimeTraceContext.setError(e_3);
                                throw e_3;
                            } finally {
                                actionEpilog(runtime, "2.2", "When pzRAShowPrefixButtons", null, null, runtimeTraceContext);
                            }
                        }
                        actionProlog(runtime, "2.3", "Set Param.lcl_sPegaPreFix", null, null, runtimeTraceContext);
                        tools.putParamValue("lcl_sPegaPreFix", PropertyInfo.TYPE_TEXT, "true");
                        actionEpilog(runtime, "2.3", "Set Param.lcl_sPegaPreFix", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_4) {
                    runtimeTraceContext.setError(e_4);
                    throw e_4;
                } finally {
                    actionEpilog(runtime, "2", "When Param.sPrefix == px || Param.sPrefix == py || Param.sPrefix == pz", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY, "Rule-");
                }
            }, "")) {
                try {
                    actionProlog(runtime, "3", "When pzRAShowPrefixButtons", null, null, runtimeTraceContext);
                    {
                    }
                } catch (Exception e_7) {
                    runtimeTraceContext.setError(e_7);
                    throw e_7;
                } finally {
                    actionEpilog(runtime, "3", "When pzRAShowPrefixButtons", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (tools.getParamValue("lcl_sPegaPreFix").equals("true"));
                }
            }, "Param.lcl_sPegaPreFix==true")) {
                try {
                    actionProlog(runtime, "4", "Otherwise When Param.lcl_sPegaPreFix==true", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "4.1", "Set Param.IdentFocusValue", null, null, runtimeTraceContext);
                        tools.putParamValue("IdentFocusValue", PropertyInfo.TYPE_TEXT, tools.getParamValue("IdentFocusValue"));
                        actionEpilog(runtime, "4.1", "Set Param.IdentFocusValue", null, null, runtimeTraceContext);
                        actionProlog(runtime, "4.2", "Set Param.sPrefix", null, null, runtimeTraceContext);
                        tools.putParamValue("sPrefix", PropertyInfo.TYPE_TEXT, "");
                        actionEpilog(runtime, "4.2", "Set Param.sPrefix", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_5) {
                    runtimeTraceContext.setError(e_5);
                    throw e_5;
                } finally {
                    actionEpilog(runtime, "4", "Otherwise When Param.lcl_sPegaPreFix==true", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "5", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "5.1", "Set Param.sPrefix", null, null, runtimeTraceContext);
                        tools.putParamValue("sPrefix", PropertyInfo.TYPE_TEXT, "");
                        actionEpilog(runtime, "5.1", "Set Param.sPrefix", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_6) {
                    runtimeTraceContext.setError(e_6);
                    throw e_6;
                } finally {
                    actionEpilog(runtime, "5", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "7", "Set Param.lcl_sOrigPrefix", null, null, runtimeTraceContext);
            tools.putParamValue("lcl_sOrigPrefix", PropertyInfo.TYPE_TEXT, "");
            actionEpilog(runtime, "7", "Set Param.lcl_sOrigPrefix", null, null, runtimeTraceContext);
            actionProlog(runtime, "8", "Set Param.lcl_sPegaPreFix", null, null, runtimeTraceContext);
            tools.putParamValue("lcl_sPegaPreFix", PropertyInfo.TYPE_TEXT, "");
            actionEpilog(runtime, "8", "Set Param.lcl_sPegaPreFix", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
