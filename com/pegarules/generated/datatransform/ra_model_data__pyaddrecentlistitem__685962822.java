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

public class ra_model_data__pyaddrecentlistitem__685962822 extends AbstractDataTransform {

    private static final String [] pRef_6 = new String[] { "", "", "pyRuleTypeLabel", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyDescription", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyRecordName", "" };

    private final ScalarValueQuery scalarValueQuery_13;

    private final ScalarValueQuery scalarValueQuery_12;

    private final ScalarValueQuery scalarValueQuery_11;

    private final ScalarValueQuery scalarValueQuery_10;

    private final ScalarValueQuery scalarValueQuery_9;

    private final ScalarValueQuery scalarValueQuery_8;

    private final ScalarValueQuery scalarValueQuery_7;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL DATA- PYADDRECENTLISTITEM #20180713T133324.748 GMT", "Data- pyAddRecentListItem", "Pega-UIEngine", "08-01-01", "20180713T133324.748 GMT");

    public ra_model_data__pyaddrecentlistitem__685962822(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pxInsName").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyRecordName").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().page("pyExecute").scalarProperty("pyAction").buildScalarValueQuery();
        scalarValueQuery_7 = queryBuilderFactory.create().scalarProperty("pxObjClass").buildScalarValueQuery();
        scalarValueQuery_8 = queryBuilderFactory.create().scalarProperty("pyClassName").buildScalarValueQuery();
        scalarValueQuery_9 = queryBuilderFactory.create().scalarProperty("pyDescription").buildScalarValueQuery();
        scalarValueQuery_10 = queryBuilderFactory.create().scalarProperty("pyTestSuiteID").buildScalarValueQuery();
        scalarValueQuery_11 = queryBuilderFactory.create().scalarProperty("pyEndTime").buildScalarValueQuery();
        scalarValueQuery_12 = queryBuilderFactory.create().scalarProperty("pyTestCaseName").buildScalarValueQuery();
        scalarValueQuery_13 = queryBuilderFactory.create().scalarProperty("pyRunTime").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            ClipboardPage sourcePage_1 = myStepPage;
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = runtime.safeFindPage("pyRecentListItem", "System-User-Recents");
            PRStackFrame stackFrame_1 = null;
            try {
                stackFrame_1 = pega.pushStackFrame("System-User-Recents", null, myStepPage, false, false);
                actionProlog(runtime, "1", "Update Page pyRecentListItem", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.1", "Set .pyRecordName", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyRecordName", pRef_1, myStepPage, scalarValueQuery_2.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                actionEpilog(runtime, "1.1", "Set .pyRecordName", sourcePage_1, myStepPage, runtimeTraceContext);
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return (scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                    }
                }, ".pyRecordName==")) {
                    try {
                        actionProlog(runtime, "1.2", "When .pyRecordName==", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            actionProlog(runtime, "1.2.1", "Set .pyRecordName", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyRecordName", pRef_1, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return pega.<String>resolveMethodCall("pxSetNewRuleNameForRecents--(PublicAPI)", "pxSetNewRuleNameForRecents", "Pega-UIEngine", "UIElementModel", new Object[] { tools });
                                }
                            }), "sTN", false, true);
                            actionEpilog(runtime, "1.2.1", "Set .pyRecordName", sourcePage_1, myStepPage, runtimeTraceContext);
                        }
                    } catch (Exception e_3) {
                        runtimeTraceContext.setError(e_3);
                        throw e_3;
                    } finally {
                        actionEpilog(runtime, "1.2", "When .pyRecordName==", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return (scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("pyRecentListItem", "System-User-Recents"), ImmutablePropertyInfo.TYPE_TEXT).equals("openRule"));
                    }
                }, "pyRecentListItem.pyExecute.pyAction==openRule")) {
                    try {
                        actionProlog(runtime, "1.3", "When pyRecentListItem.pyExecute.pyAction==openRule", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            actionProlog(runtime, "1.3.1", "Set .pyDescription", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyDescription", pRef_5, myStepPage, "", "sTN", false, true);
                            actionEpilog(runtime, "1.3.1", "Set .pyDescription", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "1.3.2", "Set .pyRuleTypeLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyRuleTypeLabel", pRef_6, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return pega.<String>resolveMethodCall("lookup--(String,String,String,String,String)", "lookup", "Pega-RULES", "Utilities", new Object[] { "pyLabel", "Rule-Obj-Class", "pyClassName", scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" });
                                }
                            }), "sTN", false, true);
                            actionEpilog(runtime, "1.3.2", "Set .pyRuleTypeLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                public Boolean apply(ClipboardPage myStepPage) {
                                    return (!(scalarValueQuery_8.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
                                }
                            }, "Primary.pyClassName != ")) {
                                try {
                                    actionProlog(runtime, "1.3.3", "When Primary.pyClassName != ", sourcePage_1, myStepPage, runtimeTraceContext);
                                    {
                                        actionProlog(runtime, "1.3.3.1", "Set .pyDescription", sourcePage_1, myStepPage, runtimeTraceContext);
                                        pega.setViaPropRef(".pyDescription", pRef_5, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                            public String apply(ClipboardPage myStepPage) {
                                                return ((scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("pyRecentListItem", "System-User-Recents"), ImmutablePropertyInfo.TYPE_TEXT) + scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + " • ");
                                            }
                                        }), "sTN", false, true);
                                        actionEpilog(runtime, "1.3.3.1", "Set .pyDescription", sourcePage_1, myStepPage, runtimeTraceContext);
                                    }
                                } catch (Exception e_4) {
                                    runtimeTraceContext.setError(e_4);
                                    throw e_4;
                                } finally {
                                    actionEpilog(runtime, "1.3.3", "When Primary.pyClassName != ", sourcePage_1, myStepPage, runtimeTraceContext);
                                }
                            }
                            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                public Boolean apply(ClipboardPage myStepPage) {
                                    return (scalarValueQuery_7.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("Data-TestCaseResults"));
                                }
                            }, "Primary.pxObjClass==Data-TestCaseResults")) {
                                try {
                                    actionProlog(runtime, "1.3.5", "When Primary.pxObjClass==Data-TestCaseResults", sourcePage_1, myStepPage, runtimeTraceContext);
                                    {
                                        actionProlog(runtime, "1.3.5.1", "Set .pyDescription", sourcePage_1, myStepPage, runtimeTraceContext);
                                        pega.setViaPropRef(".pyDescription", pRef_5, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                            public String apply(ClipboardPage myStepPage) {
                                                return ((scalarValueQuery_12.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT) + " • ") + pega.<String>resolveMethodCall("FormatDateTime--(String,String,String,String)", "FormatDateTime", null, "DateTime", new Object[] { scalarValueQuery_13.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "EEEEEEEEE dd/MM/yyyy 'at' h:mm a", "", "" }));
                                            }
                                        }), "sTN", false, true);
                                        actionEpilog(runtime, "1.3.5.1", "Set .pyDescription", sourcePage_1, myStepPage, runtimeTraceContext);
                                    }
                                } catch (Exception e_7) {
                                    runtimeTraceContext.setError(e_7);
                                    throw e_7;
                                } finally {
                                    actionEpilog(runtime, "1.3.5", "When Primary.pxObjClass==Data-TestCaseResults", sourcePage_1, myStepPage, runtimeTraceContext);
                                }
                            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                public Boolean apply(ClipboardPage myStepPage) {
                                    return (scalarValueQuery_7.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("Data-TestSuiteResults"));
                                }
                            }, "Primary.pxObjClass==Data-TestSuiteResults")) {
                                try {
                                    actionProlog(runtime, "1.3.6", "Otherwise When Primary.pxObjClass==Data-TestSuiteResults", sourcePage_1, myStepPage, runtimeTraceContext);
                                    {
                                        actionProlog(runtime, "1.3.6.1", "Set .pyDescription", sourcePage_1, myStepPage, runtimeTraceContext);
                                        pega.setViaPropRef(".pyDescription", pRef_5, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                            public String apply(ClipboardPage myStepPage) {
                                                return ((scalarValueQuery_10.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT) + " • ") + pega.<String>resolveMethodCall("FormatDateTime--(String,String,String,String)", "FormatDateTime", null, "DateTime", new Object[] { scalarValueQuery_11.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_DATETIME), "EEEEEEEEE dd/MM/yyyy 'at' h:mm a", "", "" }));
                                            }
                                        }), "sTN", false, true);
                                        actionEpilog(runtime, "1.3.6.1", "Set .pyDescription", sourcePage_1, myStepPage, runtimeTraceContext);
                                    }
                                } catch (Exception e_5) {
                                    runtimeTraceContext.setError(e_5);
                                    throw e_5;
                                } finally {
                                    actionEpilog(runtime, "1.3.6", "Otherwise When Primary.pxObjClass==Data-TestSuiteResults", sourcePage_1, myStepPage, runtimeTraceContext);
                                }
                            } else {
                                try {
                                    actionProlog(runtime, "1.3.7", "Otherwise ", sourcePage_1, myStepPage, runtimeTraceContext);
                                    {
                                        actionProlog(runtime, "1.3.7.1", "Set .pyDescription", sourcePage_1, myStepPage, runtimeTraceContext);
                                        pega.setViaPropRef(".pyDescription", pRef_5, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                            public String apply(ClipboardPage myStepPage) {
                                                return (scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("pyRecentListItem", "System-User-Recents"), ImmutablePropertyInfo.TYPE_TEXT) + scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("pyRecentListItem", "System-User-Recents"), ImmutablePropertyInfo.TYPE_TEXT));
                                            }
                                        }), "sTN", false, true);
                                        actionEpilog(runtime, "1.3.7.1", "Set .pyDescription", sourcePage_1, myStepPage, runtimeTraceContext);
                                    }
                                } catch (Exception e_6) {
                                    runtimeTraceContext.setError(e_6);
                                    throw e_6;
                                } finally {
                                    actionEpilog(runtime, "1.3.7", "Otherwise ", sourcePage_1, myStepPage, runtimeTraceContext);
                                }
                            }
                        }
                    } catch (Exception e_8) {
                        runtimeTraceContext.setError(e_8);
                        throw e_8;
                    } finally {
                        actionEpilog(runtime, "1.3", "When pyRecentListItem.pyExecute.pyAction==openRule", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "1", "Update Page pyRecentListItem", sourcePage_1, myStepPage, runtimeTraceContext);
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
