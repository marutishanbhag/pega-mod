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

public class ra_model_data_admin_operator_id_pzsetcountsforuserprofile__1967129153 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_7;

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_3;

    private final RuleHandle rule1;

    private final RuleHandle rule0;

    private static final String [] pRef_8 = new String[] { "", "", "pyIsSocialContext", "" };

    private static final String [] pRef_6 = new String[] { "", "", "pySkillsLabel", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pySkillLabel", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyTeamsHeaderLabel", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyDirectReportsHeaderLabel", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL DATA-ADMIN-OPERATOR-ID PZSETCOUNTSFORUSERPROFILE #20180713T142742.232 GMT", "Data-Admin-Operator-ID pzSetCountsForUserProfile", "Pega-LP-OrgAndSecurity", "08-01-01", "20180713T142742.232 GMT");

    public ra_model_data_admin_operator_id_pzsetcountsforuserprofile__1967129153(final Loadtime loadtime) {
        super(ruleTracer, true);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PYUSERHASSKILLS", "pyUserHasSkills");
        rule1 = ruleHandleFactory.create("Rule-Obj-When", "!PZUSERPROFILEISCURRENTUSER", "pzUserProfileIsCurrentUser");
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pySkillName").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().scalarProperty("pySkillLabel").buildScalarValueQuery();
        scalarValueQuery_7 = queryBuilderFactory.create().scalarProperty("pySkillsLabel").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyDirectReportsHeaderLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyDirectReportsHeaderLabel", pRef_1, myStepPage, Integer.toString((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, "Utilities", new Object[] { pega.findDataPage("D_pyDirectReports", false, "Manager", tools.getParamValue("OperatorID")).getProperty("pxResults") })).intValue()), "sTN", false, true);
            actionEpilog(runtime, "1", "Set .pyDirectReportsHeaderLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyTeamsHeaderLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyTeamsHeaderLabel", pRef_2, myStepPage, Integer.toString((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, "Utilities", new Object[] { pega.findDataPage("D_pyTeamsByOperator", false, "OperatorID", tools.getParamValue("OperatorID")).getProperty("pxResults") })).intValue()), "sTN", false, true);
            actionEpilog(runtime, "2", "Set .pyTeamsHeaderLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set param.context", null, null, runtimeTraceContext);
            tools.putParamValue("context", PropertyInfo.TYPE_TEXT, "Following");
            actionEpilog(runtime, "3", "Set param.context", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set param.check", null, null, runtimeTraceContext);
            tools.putParamValue("check", PropertyInfo.TYPE_TRUEFALSE, (pega.<Boolean>resolveMethodCall("pxExecuteAnActivity--(ClipboardPage,String)", "pxExecuteAnActivity", null, "Utilities", new Object[] { tools.getPrimaryPage(), "pyGetFollowUsersCount" })).booleanValue());
            actionEpilog(runtime, "4", "Set param.check", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY, "Data-Admin-Operator-ID");
                }
            }, "")) {
                try {
                    actionProlog(runtime, "5", "When pyUserHasSkills", null, null, runtimeTraceContext);
                    {
                        ClipboardPage tmp_1 = myStepPage;
                        PageIterator iter_1 = runtime.createIterator(myStepPage.getProperty("pySkills"));
                        try {
                            int currentLoopOffset_1 = 0;
                            actionProlog(runtime, "5.1", "For Each Page In .pySkills", null, iter_1.getSource(), runtimeTraceContext);
                            while (iter_1.hasNext()) {
                                currentLoopOffset_1++;
                                pega.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset_1));
                                ClipboardPage currentExp_1 = iter_1.next();
                                {
                                    ClipboardPage sourcePage_1 = currentExp_1;
                                    ClipboardPage tmp_2 = myStepPage;
                                    myStepPage = currentExp_1;
                                    PRStackFrame stackFrame_1 = null;
                                    try {
                                        stackFrame_1 = pega.pushStackFrame("Embed-Data-Admin-Skill", null, myStepPage, false, false);
                                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                            public Boolean apply(ClipboardPage myStepPage) {
                                                return (!(scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
                                            }
                                        }, ".pySkillName != ")) {
                                            try {
                                                actionProlog(runtime, "5.1.1", "When .pySkillName != ", sourcePage_1, myStepPage, runtimeTraceContext);
                                                {
                                                    actionProlog(runtime, "5.1.1.1", "Set .pySkillLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                                                    pega.setViaPropRef(".pySkillLabel", pRef_4, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                                        public String apply(ClipboardPage myStepPage) {
                                                            return pega.<String>resolveMethodCall("lookup--(String,String,String,String,String)", "lookup", null, "Utilities", new Object[] { "pyLabel", "Rule-Admin-Skill", "pyRuleName", scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), null });
                                                        }
                                                    }), "sTN", false, true);
                                                    actionEpilog(runtime, "5.1.1.1", "Set .pySkillLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                                                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                                        public Boolean apply(ClipboardPage myStepPage) {
                                                            return (!(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
                                                        }
                                                    }, ".pySkillLabel != ")) {
                                                        try {
                                                            actionProlog(runtime, "5.1.1.2", "When .pySkillLabel != ", sourcePage_1, myStepPage, runtimeTraceContext);
                                                            {
                                                                actionProlog(runtime, "5.1.1.2.1", "Set Primary.pySkillsLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                                                                pega.setViaPropRef(".pySkillsLabel", pRef_6, tools.getPrimaryPage(), pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                                                    public String apply(ClipboardPage myStepPage) {
                                                                        return (scalarValueQuery_7.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT) + scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
                                                                    }
                                                                }), "sTN", false, true);
                                                                actionEpilog(runtime, "5.1.1.2.1", "Set Primary.pySkillsLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                                                                actionProlog(runtime, "5.1.1.2.2", "Set Primary.pySkillsLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                                                                pega.setViaPropRef(".pySkillsLabel", pRef_6, tools.getPrimaryPage(), pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                                                    public String apply(ClipboardPage myStepPage) {
                                                                        return (scalarValueQuery_7.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT) + ",");
                                                                    }
                                                                }), "sTN", false, true);
                                                                actionEpilog(runtime, "5.1.1.2.2", "Set Primary.pySkillsLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                                                            }
                                                        } catch (Exception e_4) {
                                                            runtimeTraceContext.setError(e_4);
                                                            throw e_4;
                                                        } finally {
                                                            actionEpilog(runtime, "5.1.1.2", "When .pySkillLabel != ", sourcePage_1, myStepPage, runtimeTraceContext);
                                                        }
                                                    }
                                                }
                                            } catch (Exception e_5) {
                                                runtimeTraceContext.setError(e_5);
                                                throw e_5;
                                            } finally {
                                                actionEpilog(runtime, "5.1.1", "When .pySkillName != ", sourcePage_1, myStepPage, runtimeTraceContext);
                                            }
                                        }
                                    } catch (Exception e_3) {
                                        runtimeTraceContext.setError(e_3);
                                        throw e_3;
                                    } finally {
                                        pega.popStackFrameAndReturnStepPage(stackFrame_1);
                                        myStepPage = tmp_2;
                                    }
                                }
                            }
                        } catch (Exception e_2) {
                            runtimeTraceContext.setError(e_2);
                            throw e_2;
                        } finally {
                            actionEpilog(runtime, "5.1", "For Each Page In .pySkills", null, iter_1.getSource(), runtimeTraceContext);
                            myStepPage = tmp_1;
                        }
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (!(scalarValueQuery_7.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
                            }
                        }, "Primary.pySkillsLabel != ")) {
                            try {
                                actionProlog(runtime, "5.2", "When Primary.pySkillsLabel != ", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "5.2.1", "Set Primary.pySkillsLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pySkillsLabel", pRef_6, tools.getPrimaryPage(), pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, "String", new Object[] { scalarValueQuery_7.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), 0, ((pega.<Integer>resolveMethodCall("length--(String)", "length", null, "String", new Object[] { scalarValueQuery_7.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT) })).intValue() - 1) }), "sTN", false, true);
                                    actionEpilog(runtime, "5.2.1", "Set Primary.pySkillsLabel", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_6) {
                                runtimeTraceContext.setError(e_6);
                                throw e_6;
                            } finally {
                                actionEpilog(runtime, "5.2", "When Primary.pySkillsLabel != ", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_7) {
                    runtimeTraceContext.setError(e_7);
                    throw e_7;
                } finally {
                    actionEpilog(runtime, "5", "When pyUserHasSkills", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ruleDispatcher.invokeBoolean(runtime, rule1, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY, "Data-Admin-Operator-ID");
                }
            }, "")) {
                try {
                    actionProlog(runtime, "6", "When pzUserProfileIsCurrentUser", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "6.1", "Set Primary.pyIsSocialContext", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyIsSocialContext", pRef_8, tools.getPrimaryPage(), true, "sTN", false, true);
                        actionEpilog(runtime, "6.1", "Set Primary.pyIsSocialContext", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_8) {
                    runtimeTraceContext.setError(e_8);
                    throw e_8;
                } finally {
                    actionEpilog(runtime, "6", "When pzUserProfileIsCurrentUser", null, null, runtimeTraceContext);
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
