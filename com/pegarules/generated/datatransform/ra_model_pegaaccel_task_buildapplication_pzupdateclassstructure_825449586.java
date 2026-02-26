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

public class ra_model_pegaaccel_task_buildapplication_pzupdateclassstructure_825449586 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_4 = new String[] { "", "", "pyUnitClassLayer", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyApplicationClassLayer", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyOrgClassLayer", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyDivClassLayer", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGAACCEL-TASK-BUILDAPPLICATION PZUPDATECLASSSTRUCTURE #20180713T141239.276 GMT", "PegaAccel-Task-BuildApplication pzUpdateClassStructure", "Pega-ProcessArchitect", "08-01-01", "20180713T141239.276 GMT");

    public ra_model_pegaaccel_task_buildapplication_pzupdateclassstructure_825449586(final Loadtime loadtime) {
        super(ruleTracer, false);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pyOrganizationExists").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (!(tools.getParamValue("OrgClassLayer").equals("")));
                }
            }, "param.OrgClassLayer != ")) {
                try {
                    actionProlog(runtime, "1", "When param.OrgClassLayer != ", null, null, runtimeTraceContext);
                    {
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return scalarValueQuery_1.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
                            }
                        }, ".pyOrganizationExists")) {
                            try {
                                actionProlog(runtime, "1.1", "When .pyOrganizationExists", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "1.1.1", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyOrgClassLayer", pRef_2, myStepPage, tools.getParamValue("OrgClassLayer"), "sTN", false, true);
                                    actionEpilog(runtime, "1.1.1", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_2) {
                                runtimeTraceContext.setError(e_2);
                                throw e_2;
                            } finally {
                                actionEpilog(runtime, "1.1", "When .pyOrganizationExists", null, null, runtimeTraceContext);
                            }
                        } else {
                            try {
                                actionProlog(runtime, "1.2", "Otherwise ", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "1.2.1", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyOrgClassLayer", pRef_2, myStepPage, tools.getParamValue("OrgClassLayer"), "sTN", false, true);
                                    actionEpilog(runtime, "1.2.1", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                        public Boolean apply(ClipboardPage myStepPage) {
                                            return tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "RestrictLength");
                                        }
                                    }, "param.RestrictLength")) {
                                        try {
                                            actionProlog(runtime, "1.2.2", "When param.RestrictLength", null, null, runtimeTraceContext);
                                            {
                                                actionProlog(runtime, "1.2.2.1", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                                                pega.setViaPropRef(".pyOrgClassLayer", pRef_2, myStepPage, pega.<String>resolveMethodCall("pzGenerateOrgNickname--(String)", "pzGenerateOrgNickname", null, "Utilities", new Object[] { tools.getParamValue("OrgClassLayer") }), "sTN", false, true);
                                                actionEpilog(runtime, "1.2.2.1", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                                            }
                                        } catch (Exception e_3) {
                                            runtimeTraceContext.setError(e_3);
                                            throw e_3;
                                        } finally {
                                            actionEpilog(runtime, "1.2.2", "When param.RestrictLength", null, null, runtimeTraceContext);
                                        }
                                    }
                                }
                            } catch (Exception e_4) {
                                runtimeTraceContext.setError(e_4);
                                throw e_4;
                            } finally {
                                actionEpilog(runtime, "1.2", "Otherwise ", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_5) {
                    runtimeTraceContext.setError(e_5);
                    throw e_5;
                } finally {
                    actionEpilog(runtime, "1", "When param.OrgClassLayer != ", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (!(tools.getParamValue("DivClassLayer").equals("")));
                }
            }, "param.DivClassLayer != ")) {
                try {
                    actionProlog(runtime, "2", "When param.DivClassLayer != ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "2.1", "Set param.DivClassLayer", null, null, runtimeTraceContext);
                        tools.putParamValue("DivClassLayer", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("pzMakeRecordID--(String,String)", "pzMakeRecordID", null, "pxRuleManagement", new Object[] { tools.getParamValue("DivClassLayer"), "" }));
                        actionEpilog(runtime, "2.1", "Set param.DivClassLayer", null, null, runtimeTraceContext);
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "RestrictLength");
                            }
                        }, "param.RestrictLength")) {
                            try {
                                actionProlog(runtime, "2.2", "When param.RestrictLength", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "2.2.1", "Set .pyDivClassLayer", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyDivClassLayer", pRef_3, myStepPage, pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, "String", new Object[] { tools.getParamValue("DivClassLayer"), 0, 4 }), "sTN", false, true);
                                    actionEpilog(runtime, "2.2.1", "Set .pyDivClassLayer", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_6) {
                                runtimeTraceContext.setError(e_6);
                                throw e_6;
                            } finally {
                                actionEpilog(runtime, "2.2", "When param.RestrictLength", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_7) {
                    runtimeTraceContext.setError(e_7);
                    throw e_7;
                } finally {
                    actionEpilog(runtime, "2", "When param.DivClassLayer != ", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (!(tools.getParamValue("UnitClassLayer").equals("")));
                }
            }, "param.UnitClassLayer != ")) {
                try {
                    actionProlog(runtime, "3", "When param.UnitClassLayer != ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "3.1", "Set param.UnitClassLayer", null, null, runtimeTraceContext);
                        tools.putParamValue("UnitClassLayer", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("pzMakeRecordID--(String,String)", "pzMakeRecordID", null, "pxRuleManagement", new Object[] { tools.getParamValue("UnitClassLayer"), "" }));
                        actionEpilog(runtime, "3.1", "Set param.UnitClassLayer", null, null, runtimeTraceContext);
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "RestrictLength");
                            }
                        }, "param.RestrictLength")) {
                            try {
                                actionProlog(runtime, "3.2", "When param.RestrictLength", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "3.2.1", "Set .pyUnitClassLayer", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyUnitClassLayer", pRef_4, myStepPage, pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, "String", new Object[] { tools.getParamValue("UnitClassLayer"), 0, 4 }), "sTN", false, true);
                                    actionEpilog(runtime, "3.2.1", "Set .pyUnitClassLayer", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_8) {
                                runtimeTraceContext.setError(e_8);
                                throw e_8;
                            } finally {
                                actionEpilog(runtime, "3.2", "When param.RestrictLength", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_9) {
                    runtimeTraceContext.setError(e_9);
                    throw e_9;
                } finally {
                    actionEpilog(runtime, "3", "When param.UnitClassLayer != ", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (!(tools.getParamValue("AppClassLayer").equals("")));
                }
            }, "param.AppClassLayer != ")) {
                try {
                    actionProlog(runtime, "4", "When param.AppClassLayer != ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "4.1", "Set .pyApplicationClassLayer", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyApplicationClassLayer", pRef_5, myStepPage, tools.getParamValue("AppClassLayer"), "sTN", false, true);
                        actionEpilog(runtime, "4.1", "Set .pyApplicationClassLayer", null, null, runtimeTraceContext);
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "RestrictLength");
                            }
                        }, "param.RestrictLength")) {
                            try {
                                actionProlog(runtime, "4.2", "When param.RestrictLength", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "4.2.1", "Set .pyApplicationClassLayer", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyApplicationClassLayer", pRef_5, myStepPage, pega.<String>resolveMethodCall("pzGenerateAppNickname--(String)", "pzGenerateAppNickname", null, "Utilities", new Object[] { tools.getParamValue("AppClassLayer") }), "sTN", false, true);
                                    actionEpilog(runtime, "4.2.1", "Set .pyApplicationClassLayer", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_10) {
                                runtimeTraceContext.setError(e_10);
                                throw e_10;
                            } finally {
                                actionEpilog(runtime, "4.2", "When param.RestrictLength", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_11) {
                    runtimeTraceContext.setError(e_11);
                    throw e_11;
                } finally {
                    actionEpilog(runtime, "4", "When param.AppClassLayer != ", null, null, runtimeTraceContext);
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
