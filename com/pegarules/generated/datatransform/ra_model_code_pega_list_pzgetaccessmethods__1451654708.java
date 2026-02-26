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

public class ra_model_code_pega_list_pzgetaccessmethods__1451654708 extends AbstractDataTransform {

    private static final String [] pRef_4 = new String[] { "", "", "pxResults", "2", "pyDescription", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pxResults", "1", "pyDescription", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pxResults", "2", "pyLabel", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pxResults", "1", "pyLabel", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZGETACCESSMETHODS #20181121T090150.594 GMT", "Code-Pega-List pzGetAccessMethods", "Pega-AppDefinition", "08-02-01", "20181121T090150.594 GMT");

    public ra_model_code_pega_list_pzgetaccessmethods__1451654708(final Loadtime loadtime) {
        super(ruleTracer, false);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ((!(pega.<Boolean>resolveMethodCall("endsWith--(String,String)", "endsWith", null, null, new Object[] { tools.getParamValue("UserType"), "System" })).booleanValue()));
                }
            }, "!@endsWith(Param.UserType, System)")) {
                try {
                    actionProlog(runtime, "1", "When !@endsWith(Param.UserType, System)", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set .pxResults(1).pyLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pxResults(1).pyLabel", pRef_1, myStepPage, "Browser", "sTN64", false, true);
                        actionEpilog(runtime, "1.1", "Set .pxResults(1).pyLabel", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.2", "Set .pxResults(1).pyDescription", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pxResults(1).pyDescription", pRef_2, myStepPage, "Browser", "sTN", false, true);
                        actionEpilog(runtime, "1.2", "Set .pxResults(1).pyDescription", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.3", "Set .pxResults(2).pyLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pxResults(2).pyLabel", pRef_3, myStepPage, "Phone", "sTN64", false, true);
                        actionEpilog(runtime, "1.3", "Set .pxResults(2).pyLabel", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.4", "Set .pxResults(2).pyDescription", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pxResults(2).pyDescription", pRef_4, myStepPage, "Phone", "sTN", false, true);
                        actionEpilog(runtime, "1.4", "Set .pxResults(2).pyDescription", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "1", "When !@endsWith(Param.UserType, System)", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "2", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", "Pega-RULES", "String", new Object[] { tools.getParamValue("UserType"), "This" })).booleanValue();
                            }
                        }, "@(Pega-RULES:String).startsWith(Param.UserType, This)")) {
                            try {
                                actionProlog(runtime, "2.1", "When @(Pega-RULES:String).startsWith(Param.UserType, This)", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "2.1.1", "Set .pxResults(1).pyLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pxResults(1).pyLabel", pRef_1, myStepPage, "System Agent", "sTN64", false, true);
                                    actionEpilog(runtime, "2.1.1", "Set .pxResults(1).pyLabel", null, null, runtimeTraceContext);
                                    actionProlog(runtime, "2.1.2", "Set .pxResults(1).pyDescription", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pxResults(1).pyDescription", pRef_2, myStepPage, "System Agent", "sTN", false, true);
                                    actionEpilog(runtime, "2.1.2", "Set .pxResults(1).pyDescription", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_4) {
                                runtimeTraceContext.setError(e_4);
                                throw e_4;
                            } finally {
                                actionEpilog(runtime, "2.1", "When @(Pega-RULES:String).startsWith(Param.UserType, This)", null, null, runtimeTraceContext);
                            }
                        } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", "Pega-RULES", "String", new Object[] { tools.getParamValue("UserType"), "Ext" })).booleanValue();
                            }
                        }, "@(Pega-RULES:String).startsWith(Param.UserType, Ext)")) {
                            try {
                                actionProlog(runtime, "2.2", "Otherwise When @(Pega-RULES:String).startsWith(Param.UserType, Ext)", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "2.2.1", "Set .pxResults(1).pyLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pxResults(1).pyLabel", pRef_1, myStepPage, "External Service", "sTN64", false, true);
                                    actionEpilog(runtime, "2.2.1", "Set .pxResults(1).pyLabel", null, null, runtimeTraceContext);
                                    actionProlog(runtime, "2.2.2", "Set .pxResults(1).pyDescription", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pxResults(1).pyDescription", pRef_2, myStepPage, "External Service", "sTN", false, true);
                                    actionEpilog(runtime, "2.2.2", "Set .pxResults(1).pyDescription", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_3) {
                                runtimeTraceContext.setError(e_3);
                                throw e_3;
                            } finally {
                                actionEpilog(runtime, "2.2", "Otherwise When @(Pega-RULES:String).startsWith(Param.UserType, Ext)", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_5) {
                    runtimeTraceContext.setError(e_5);
                    throw e_5;
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
