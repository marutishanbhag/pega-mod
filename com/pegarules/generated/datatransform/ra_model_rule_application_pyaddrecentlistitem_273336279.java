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

public class ra_model_rule_application_pyaddrecentlistitem_273336279 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_4 = new String[] { "", "", "pyRuleTypeLabel", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE-APPLICATION PYADDRECENTLISTITEM #20180713T133325.210 GMT", "Rule-Application pyAddRecentListItem", "Pega-UIEngine", "08-01-01", "20180713T133325.210 GMT");

    public ra_model_rule_application_pyaddrecentlistitem_273336279(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pxObjClass").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyMode").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().page("pyExecute").scalarProperty("pyAction").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ((scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Rule-Application")) && (scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Component")));
                }
            }, ".pxObjClass == Rule-Application && .pyMode == Component")) {
                try {
                    actionProlog(runtime, "1", "When .pxObjClass == Rule-Application && .pyMode == Component", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set Param.IsComponent", null, null, runtimeTraceContext);
                        tools.putParamValue("IsComponent", PropertyInfo.TYPE_TEXT, true);
                        actionEpilog(runtime, "1.1", "Set Param.IsComponent", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "1", "When .pxObjClass == Rule-Application && .pyMode == Component", null, null, runtimeTraceContext);
                }
            }
            ClipboardPage sourcePage_1 = myStepPage;
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = runtime.safeFindPage("pyRecentListItem", "System-User-Recents");
            PRStackFrame stackFrame_1 = null;
            try {
                stackFrame_1 = pega.pushStackFrame("System-User-Recents", null, myStepPage, false, false);
                actionProlog(runtime, "2", "Update Page pyRecentListItem", sourcePage_1, myStepPage, runtimeTraceContext);
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return (scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("pyRecentListItem", "System-User-Recents"), ImmutablePropertyInfo.TYPE_TEXT).equals("openRule"));
                    }
                }, "pyRecentListItem.pyExecute.pyAction==openRule")) {
                    try {
                        actionProlog(runtime, "2.1", "When pyRecentListItem.pyExecute.pyAction==openRule", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                public Boolean apply(ClipboardPage myStepPage) {
                                    return tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "IsComponent");
                                }
                            }, "Param.IsComponent")) {
                                try {
                                    actionProlog(runtime, "2.1.1", "When Param.IsComponent", sourcePage_1, myStepPage, runtimeTraceContext);
                                    {
                                        actionProlog(runtime, "2.1.1.1", "Set .pyRuleTypeLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                                        pega.setViaPropRef(".pyRuleTypeLabel", pRef_4, myStepPage, "Component", "sTN", false, true);
                                        actionEpilog(runtime, "2.1.1.1", "Set .pyRuleTypeLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                                    }
                                } catch (Exception e_4) {
                                    runtimeTraceContext.setError(e_4);
                                    throw e_4;
                                } finally {
                                    actionEpilog(runtime, "2.1.1", "When Param.IsComponent", sourcePage_1, myStepPage, runtimeTraceContext);
                                }
                            } else {
                                try {
                                    actionProlog(runtime, "2.1.2", "Otherwise ", sourcePage_1, myStepPage, runtimeTraceContext);
                                    {
                                        actionProlog(runtime, "2.1.2.1", "Set .pyRuleTypeLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                                        pega.setViaPropRef(".pyRuleTypeLabel", pRef_4, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                            public String apply(ClipboardPage myStepPage) {
                                                return pega.<String>resolveMethodCall("lookup--(String,String,String,String,String)", "lookup", "Pega-RULES", "Utilities", new Object[] { "pyLabel", "Rule-Obj-Class", "pyClassName", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" });
                                            }
                                        }), "sTN", false, true);
                                        actionEpilog(runtime, "2.1.2.1", "Set .pyRuleTypeLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                                    }
                                } catch (Exception e_5) {
                                    runtimeTraceContext.setError(e_5);
                                    throw e_5;
                                } finally {
                                    actionEpilog(runtime, "2.1.2", "Otherwise ", sourcePage_1, myStepPage, runtimeTraceContext);
                                }
                            }
                        }
                    } catch (Exception e_6) {
                        runtimeTraceContext.setError(e_6);
                        throw e_6;
                    } finally {
                        actionEpilog(runtime, "2.1", "When pyRecentListItem.pyExecute.pyAction==openRule", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
            } catch (Exception e_3) {
                runtimeTraceContext.setError(e_3);
                throw e_3;
            } finally {
                actionEpilog(runtime, "2", "Update Page pyRecentListItem", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_1);
                myStepPage = tmp_1;
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
