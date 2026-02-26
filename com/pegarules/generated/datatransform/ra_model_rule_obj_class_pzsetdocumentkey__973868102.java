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

public class ra_model_rule_obj_class_pzsetdocumentkey__973868102 extends AbstractDataTransform {

    private static final String [] pRef_10 = new String[] { "", "", "pyDisplayDataModelTab", "" };

    private static final String [] pRef_8 = new String[] { "", "", "pyCategory", "" };

    private static final String [] pRef_9 = new String[] { "", "", "pyIsCaseOpenedFromUCC", "" };

    private static final String [] pRef_6 = new String[] { "", "", "pyParentLabel", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyTopLevelClassName", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyClassName", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyCircumstanceVal", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyDocumentTitle", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyDocumentTooltip", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pzDocumentKey", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE-OBJ-CLASS PZSETDOCUMENTKEY #20190313T170717.549 GMT", "Rule-Obj-Class pzSetDocumentKey", "Pega-ProcessArchitect", "08-03-01", "20190313T170717.549 GMT");

    public ra_model_rule_obj_class_pzsetdocumentkey__973868102(final Loadtime loadtime) {
        super(ruleTracer, true);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (tools.getParamValue("lpParamImmediateParent").equals("undefined"));
                }
            }, "Param.lpParamImmediateParent==undefined")) {
                try {
                    actionProlog(runtime, "1", "When Param.lpParamImmediateParent==undefined", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set Param.lpParamImmediateParent", null, null, runtimeTraceContext);
                        tools.putParamValue("lpParamImmediateParent", PropertyInfo.TYPE_TEXT, "");
                        actionEpilog(runtime, "1.1", "Set Param.lpParamImmediateParent", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "1", "When Param.lpParamImmediateParent==undefined", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (tools.getParamValue("lpParamTopMostParent").equals("undefined"));
                }
            }, "Param.lpParamTopMostParent==undefined")) {
                try {
                    actionProlog(runtime, "2", "When Param.lpParamTopMostParent==undefined", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "2.1", "Set Param.lpParamTopMostParent", null, null, runtimeTraceContext);
                        tools.putParamValue("lpParamTopMostParent", PropertyInfo.TYPE_TEXT, "");
                        actionEpilog(runtime, "2.1", "Set Param.lpParamTopMostParent", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "2", "When Param.lpParamTopMostParent==undefined", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (tools.getParamValue("lpParampyCircumstanceVal").equals("undefined"));
                }
            }, "Param.lpParampyCircumstanceVal==undefined")) {
                try {
                    actionProlog(runtime, "3", "When Param.lpParampyCircumstanceVal==undefined", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "3.1", "Set Param.lpParampyCircumstanceVal", null, null, runtimeTraceContext);
                        tools.putParamValue("lpParampyCircumstanceVal", PropertyInfo.TYPE_TEXT, "");
                        actionEpilog(runtime, "3.1", "Set Param.lpParampyCircumstanceVal", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_4) {
                    runtimeTraceContext.setError(e_4);
                    throw e_4;
                } finally {
                    actionEpilog(runtime, "3", "When Param.lpParampyCircumstanceVal==undefined", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "4", "Set .pzDocumentKey", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pzDocumentKey", pRef_1, myStepPage, (((("CaseType:" + tools.getParamValue("lpParampyClassName")) + tools.getParamValue("lpParamImmediateParent")) + tools.getParamValue("lpParamTopMostParent")) + pega.<String>resolveMethodCall("replaceAll--(String,String,String)", "replaceAll", null, "String", new Object[] { tools.getParamValue("lpParampyCircumstanceVal"), "\"", "\\\"" })), "sTN", false, true);
            actionEpilog(runtime, "4", "Set .pzDocumentKey", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set Param.lpTitle", null, null, runtimeTraceContext);
            tools.putParamValue("lpTitle", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("crossScriptingFilter--(String)", "crossScriptingFilter", null, "Utilities", new Object[] { tools.getParamValue("lpTitle") }));
            actionEpilog(runtime, "5", "Set Param.lpTitle", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set .pyDocumentTitle", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyDocumentTitle", pRef_2, myStepPage, pega.<String>resolveMethodCall("replaceAll--(String,String,String)", "replaceAll", null, "String", new Object[] { tools.getParamValue("lpTitle"), "\"", "\\\"" }), "sTN", false, true);
            actionEpilog(runtime, "6", "Set .pyDocumentTitle", null, null, runtimeTraceContext);
            actionProlog(runtime, "7", "Set .pyDocumentTooltip", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyDocumentTooltip", pRef_3, myStepPage, pega.<String>resolveMethodCall("replaceAll--(String,String,String)", "replaceAll", null, "String", new Object[] { tools.getParamValue("lpTitle"), "\"", "\\\"" }), "sTN", false, true);
            actionEpilog(runtime, "7", "Set .pyDocumentTooltip", null, null, runtimeTraceContext);
            ClipboardPage sourcePage_1 = myStepPage;
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = runtime.safeFindPage("SelectedCaseTempPage", "Rule-Obj-Class");
            PRStackFrame stackFrame_1 = null;
            try {
                stackFrame_1 = pega.pushStackFrame("Rule-Obj-Class", null, myStepPage, false, false);
                actionProlog(runtime, "8", "Update Page SelectedCaseTempPage", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "8.1", "Set .pyClassName", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyClassName", pRef_4, myStepPage, tools.getParamValue("lpParampyClassName"), "sIN", false, true);
                actionEpilog(runtime, "8.1", "Set .pyClassName", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "8.2", "Set .pyCircumstanceVal", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyCircumstanceVal", pRef_5, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                    public String apply(ClipboardPage myStepPage) {
                        return pega.<String>resolveMethodCall("replaceAll--(String,String,String)", "replaceAll", null, "String", new Object[] { tools.getParamValue("lpParampyCircumstanceVal"), "\"", "" });
                    }
                }), "sTN64", false, true);
                actionEpilog(runtime, "8.2", "Set .pyCircumstanceVal", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "8.3", "Set .pyParentLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyParentLabel", pRef_6, myStepPage, tools.getParamValue("lpParamImmediateParent"), "sTN", false, true);
                actionEpilog(runtime, "8.3", "Set .pyParentLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "8.4", "Set .pyTopLevelClassName", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyTopLevelClassName", pRef_7, myStepPage, tools.getParamValue("lpParamTopMostParent"), "sTN", false, true);
                actionEpilog(runtime, "8.4", "Set .pyTopLevelClassName", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "8.5", "Set .pyCategory", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyCategory", pRef_8, myStepPage, tools.getParamValue("lpCategory"), "sTN", false, true);
                actionEpilog(runtime, "8.5", "Set .pyCategory", sourcePage_1, myStepPage, runtimeTraceContext);
            } catch (Exception e_5) {
                runtimeTraceContext.setError(e_5);
                throw e_5;
            } finally {
                actionEpilog(runtime, "8", "Update Page SelectedCaseTempPage", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_1);
                myStepPage = tmp_1;
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "lpParamIsCaseOpenedFromUCC");
                }
            }, "Param.lpParamIsCaseOpenedFromUCC")) {
                try {
                    actionProlog(runtime, "10", "When Param.lpParamIsCaseOpenedFromUCC", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "10.1", "Set .pyIsCaseOpenedFromUCC", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyIsCaseOpenedFromUCC", pRef_9, myStepPage, true, "sSN", false, true);
                        actionEpilog(runtime, "10.1", "Set .pyIsCaseOpenedFromUCC", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_6) {
                    runtimeTraceContext.setError(e_6);
                    throw e_6;
                } finally {
                    actionEpilog(runtime, "10", "When Param.lpParamIsCaseOpenedFromUCC", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "11", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "11.1", "Set .pyIsCaseOpenedFromUCC", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyIsCaseOpenedFromUCC", pRef_9, myStepPage, false, "sSN", false, true);
                        actionEpilog(runtime, "11.1", "Set .pyIsCaseOpenedFromUCC", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_7) {
                    runtimeTraceContext.setError(e_7);
                    throw e_7;
                } finally {
                    actionEpilog(runtime, "11", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "lpDisplayDataModelTab");
                }
            }, "Param.lpDisplayDataModelTab")) {
                try {
                    actionProlog(runtime, "12", "When Param.lpDisplayDataModelTab", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "12.1", "Set SelectedCaseTempPage.pyDisplayDataModelTab", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyDisplayDataModelTab", pRef_10, pega.findPageWithException("SelectedCaseTempPage", "Rule-Obj-Class"), true, "sSN", false, true);
                        actionEpilog(runtime, "12.1", "Set SelectedCaseTempPage.pyDisplayDataModelTab", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_8) {
                    runtimeTraceContext.setError(e_8);
                    throw e_8;
                } finally {
                    actionEpilog(runtime, "12", "When Param.lpDisplayDataModelTab", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "13", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "13.1", "Set SelectedCaseTempPage.pyDisplayDataModelTab", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyDisplayDataModelTab", pRef_10, pega.findPageWithException("SelectedCaseTempPage", "Rule-Obj-Class"), false, "sSN", false, true);
                        actionEpilog(runtime, "13.1", "Set SelectedCaseTempPage.pyDisplayDataModelTab", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_9) {
                    runtimeTraceContext.setError(e_9);
                    throw e_9;
                } finally {
                    actionEpilog(runtime, "13", "Otherwise ", null, null, runtimeTraceContext);
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
