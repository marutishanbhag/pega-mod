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

public class ra_model_data_portal_pzsetcurrentcase__2018199765 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_2 = new String[] { "", "", "pyCurrentCase", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL DATA-PORTAL PZSETCURRENTCASE #20180713T134931.305 GMT", "Data-Portal pzSetCurrentCase", "Pega-EndUserUI", "08-01-01", "20180713T134931.305 GMT");

    public ra_model_data_portal_pzsetcurrentcase__2018199765(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pyCurrentCase").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().pageList("pxResults", 1).scalarProperty("pyClassName").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ((pega.<Integer>resolveMethodCall("Size--(String,Activity)", "Size", "Pega-RULES", "Default", new Object[] { "D_AllCasesInApp.pxResults", tools })).intValue() > 0);
                }
            }, "@(Pega-RULES:Default).Size(D_AllCasesInApp.pxResults, tools) > 0")) {
                try {
                    actionProlog(runtime, "1", "When @(Pega-RULES:Default).Size(D_AllCasesInApp.pxResults, tools) > 0", null, null, runtimeTraceContext);
                    {
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                            }
                        }, ".pyCurrentCase==")) {
                            try {
                                actionProlog(runtime, "1.1", "When .pyCurrentCase==", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "1.1.1", "Set .pyCurrentCase", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyCurrentCase", pRef_2, myStepPage, scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("D_AllCasesInApp", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                                    actionEpilog(runtime, "1.1.1", "Set .pyCurrentCase", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_3) {
                                runtimeTraceContext.setError(e_3);
                                throw e_3;
                            } finally {
                                actionEpilog(runtime, "1.1", "When .pyCurrentCase==", null, null, runtimeTraceContext);
                            }
                        } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return ((!(pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, null, new Object[] { scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyClassName", pega.findPageWithException("D_AllCasesInApp", "Data-Portal").getProperty("pxResults") })).booleanValue()));
                            }
                        }, "! @IsInPageList(.pyCurrentCase, pyClassName, D_AllCasesInApp.pxResults)")) {
                            try {
                                actionProlog(runtime, "1.2", "Otherwise When ! @IsInPageList(.pyCurrentCase, pyClassName, D_AllCasesInApp.pxResults)", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "1.2.1", "Set .pyCurrentCase", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyCurrentCase", pRef_2, myStepPage, scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("D_AllCasesInApp", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                                    actionEpilog(runtime, "1.2.1", "Set .pyCurrentCase", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_2) {
                                runtimeTraceContext.setError(e_2);
                                throw e_2;
                            } finally {
                                actionEpilog(runtime, "1.2", "Otherwise When ! @IsInPageList(.pyCurrentCase, pyClassName, D_AllCasesInApp.pxResults)", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_4) {
                    runtimeTraceContext.setError(e_4);
                    throw e_4;
                } finally {
                    actionEpilog(runtime, "1", "When @(Pega-RULES:Default).Size(D_AllCasesInApp.pxResults, tools) > 0", null, null, runtimeTraceContext);
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
