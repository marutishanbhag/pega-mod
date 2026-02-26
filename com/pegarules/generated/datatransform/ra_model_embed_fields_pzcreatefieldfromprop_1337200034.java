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

public class ra_model_embed_fields_pzcreatefieldfromprop_1337200034 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_20;

    private final ScalarValueQuery scalarValueQuery_18;

    private final ScalarValueQuery scalarValueQuery_16;

    private final ScalarValueQuery scalarValueQuery_14;

    private final ScalarValueQuery scalarValueQuery_11;

    private final ScalarValueQuery scalarValueQuery_9;

    private final ScalarValueQuery scalarValueQuery_6;

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_3;

    private final RuleHandle rule3;

    private final RuleHandle rule2;

    private final RuleHandle rule1;

    private final RuleHandle rule0;

    private static final String [] pRef_21 = new String[] { "", "", "pyPropertyType", "" };

    private static final String [] pRef_10 = new String[] { "", "", "pyStreamName", "" };

    private static final String [] pRef_23 = new String[] { "", "", "pyParagraphControlType", "" };

    private static final String [] pRef_12 = new String[] { "", "", "pyDataRetrievalType", "" };

    private static final String [] pRef_22 = new String[] { "", "", "pyUIControlType", "" };

    private static final String [] pRef_24 = new String[] { "", "", "pyPicklistControlType", "" };

    private static final String [] pRef_13 = new String[] { "", "", "pyStringType", "" };

    private static final String [] pRef_8 = new String[] { "", "", "pyPropertyMode", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyRelevantClassLabel", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyPropertyName", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyClassName", "" };

    private static final String [] pRef_15 = new String[] { "", "", "pyTableOption", "" };

    private static final String [] pRef_17 = new String[] { "", "", "pyTableClass", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyRelevantClass", "" };

    private static final String [] pRef_19 = new String[] { "", "", "pyGatewayClass", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-FIELDS PZCREATEFIELDFROMPROP #20190305T194743.474 GMT", "Embed-Fields pzCreateFieldFromProp", "Pega-ProcessArchitect", "08-03-01", "20190415T194311.992 GMT");

    public ra_model_embed_fields_pzcreatefieldfromprop_1337200034(final Loadtime loadtime) {
        super(ruleTracer, false);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZISAFIELDSAVAILABLEPROPERTYTYPE", "pzIsAFieldsAvailablePropertyType");
        rule1 = ruleHandleFactory.create("Rule-Obj-When", "!PZISUSERREFERENCEFIELD", "pzIsUserReferenceField");
        rule2 = ruleHandleFactory.create("Rule-Obj-When", "!PZISTHISFIELDAPARAGRAPH", "pzIsThisFieldAParagraph");
        rule3 = ruleHandleFactory.create("Rule-Obj-When", "!PZISTHISFIELDAPICKLIST", "pzIsThisFieldAPicklist");
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyRelevantClass").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().scalarProperty("pyClassName").buildScalarValueQuery();
        scalarValueQuery_6 = queryBuilderFactory.create().scalarProperty("pyPropertyName").buildScalarValueQuery();
        scalarValueQuery_9 = queryBuilderFactory.create().scalarProperty("pyPropertyMode").buildScalarValueQuery();
        scalarValueQuery_11 = queryBuilderFactory.create().scalarProperty("pyStreamName").buildScalarValueQuery();
        scalarValueQuery_14 = queryBuilderFactory.create().scalarProperty("pyStringType").buildScalarValueQuery();
        scalarValueQuery_16 = queryBuilderFactory.create().scalarProperty("pyTableOption").buildScalarValueQuery();
        scalarValueQuery_18 = queryBuilderFactory.create().scalarProperty("pyTableClass").buildScalarValueQuery();
        scalarValueQuery_20 = queryBuilderFactory.create().scalarProperty("pyPropertyType").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyRelevantClass", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyRelevantClass", pRef_1, myStepPage, pega.<String>resolveMethodCall("pzGetClassInfoFromDefinition--(String,String)", "pzGetClassInfoFromDefinition", null, "pxRuleManagement", new Object[] { tools.getParamValue("AppliesTo"), ".pyClassName" }), "sTN", false, true);
            actionEpilog(runtime, "1", "Set .pyRelevantClass", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyClassName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyClassName", pRef_2, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), tools.getParamValue("PropertyName"), ".pyClassName" }), "siN", false, true);
            actionEpilog(runtime, "2", "Set .pyClassName", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pyPropertyName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyPropertyName", pRef_4, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { tools.getParamValue("AppliesTo"), tools.getParamValue("PropertyName"), ".pyPropertyName" }), "sTN", false, true);
            actionEpilog(runtime, "3", "Set .pyPropertyName", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ((!(((scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")) || (scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))) || (scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")))));
                }
            }, "!(.pyRelevantClass ==  || .pyClassName ==  || .pyPropertyName == )")) {
                try {
                    actionProlog(runtime, "5", "When !(.pyRelevantClass ==  || .pyClassName ==  || .pyPropertyName == )", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "5.1", "Set .pyRelevantClassLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyRelevantClassLabel", pRef_7, myStepPage, pega.<String>resolveMethodCall("pzGetClassInfoFromDefinition--(String,String)", "pzGetClassInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyLabel" }), "sTN", false, true);
                        actionEpilog(runtime, "5.1", "Set .pyRelevantClassLabel", null, null, runtimeTraceContext);
                        ParameterPage newParams_5_2 = runtime.parameterPageConstructor(null, null);
                        {
                            actionProlog(runtime, "5.2", "Apply Data Transform pzCreateFieldFromCachedData", null, null, runtimeTraceContext);
                            pega.applyModel(myStepPage, "Embed-Fields", newParams_5_2, "pzCreateFieldFromCachedData");
                            actionEpilog(runtime, "5.2", "Apply Data Transform pzCreateFieldFromCachedData", null, null, runtimeTraceContext);
                        }
                        ClipboardPage sourcePage_1 = tools.getPrimaryPage();
                        ClipboardPage tmp_1 = myStepPage;
                        myStepPage = runtime.safeFindPage("propPage", "Rule-Obj-Property");
                        PRStackFrame stackFrame_1 = null;
                        try {
                            stackFrame_1 = pega.pushStackFrame("Rule-Obj-Property", null, myStepPage, false, false);
                            actionProlog(runtime, "5.4", "Update Page propPage", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "5.4.1", "Set .pyPropertyMode", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyPropertyMode", pRef_8, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                                }
                            }), "siN", false, true);
                            actionEpilog(runtime, "5.4.1", "Set .pyPropertyMode", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "5.4.2", "Set .pyStreamName", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyStreamName", pRef_10, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                                }
                            }), "sIN", false, true);
                            actionEpilog(runtime, "5.4.2", "Set .pyStreamName", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "5.4.3", "Set .pyDataRetrievalType", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyDataRetrievalType", pRef_12, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyDataRetrievalType" });
                                }
                            }), "stN", false, true);
                            actionEpilog(runtime, "5.4.3", "Set .pyDataRetrievalType", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "5.4.4", "Set .pyStringType", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyStringType", pRef_13, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                                }
                            }), "siN", false, true);
                            actionEpilog(runtime, "5.4.4", "Set .pyStringType", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "5.4.5", "Set .pyTableOption", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyTableOption", pRef_15, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                                }
                            }), "siN", false, true);
                            actionEpilog(runtime, "5.4.5", "Set .pyTableOption", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "5.4.6", "Set .pyTableClass", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyTableClass", pRef_17, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                                }
                            }), "sIN", false, true);
                            actionEpilog(runtime, "5.4.6", "Set .pyTableClass", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "5.4.7", "Set .pyGatewayClass", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyGatewayClass", pRef_19, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyGatewayClass" });
                                }
                            }), "sTN", false, true);
                            actionEpilog(runtime, "5.4.7", "Set .pyGatewayClass", sourcePage_1, myStepPage, runtimeTraceContext);
                        } catch (Exception e_2) {
                            runtimeTraceContext.setError(e_2);
                            throw e_2;
                        } finally {
                            actionEpilog(runtime, "5.4", "Update Page propPage", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.popStackFrameAndReturnStepPage(stackFrame_1);
                            myStepPage = tmp_1;
                        }
                        ParameterPage newParams_5_5 = runtime.parameterPageConstructor(Arrays.asList(new InputBinding("propPage", "propPage")), null);
                        {
                            actionProlog(runtime, "5.5", "Apply Data Transform pzSetPropertyType", null, null, runtimeTraceContext);
                            pega.applyModel(myStepPage, "Embed-Fields", newParams_5_5, "pzSetPropertyType");
                            actionEpilog(runtime, "5.5", "Apply Data Transform pzSetPropertyType", null, null, runtimeTraceContext);
                        }
                        actionProlog(runtime, "5.6", "Set param.Mode", null, null, runtimeTraceContext);
                        tools.putParamValue("Mode", PropertyInfo.TYPE_TEXT, "TopLevel");
                        actionEpilog(runtime, "5.6", "Set param.Mode", null, null, runtimeTraceContext);
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY, "Embed-Fields");
                            }
                        }, "")) {
                            try {
                                actionProlog(runtime, "5.7", "When pzIsAFieldsAvailablePropertyType", null, null, runtimeTraceContext);
                                {
                                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                        public Boolean apply(ClipboardPage myStepPage) {
                                            return ruleDispatcher.invokeBoolean(runtime, rule3, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY, "Embed-Fields");
                                        }
                                    }, "")) {
                                        try {
                                            actionProlog(runtime, "5.7.1", "When pzIsThisFieldAPicklist", null, null, runtimeTraceContext);
                                            {
                                                actionProlog(runtime, "5.7.1.1", "Set .pyPicklistControlType", null, null, runtimeTraceContext);
                                                pega.setViaPropRef(".pyPicklistControlType", pRef_24, myStepPage, scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
                                                actionEpilog(runtime, "5.7.1.1", "Set .pyPicklistControlType", null, null, runtimeTraceContext);
                                            }
                                        } catch (Exception e_6) {
                                            runtimeTraceContext.setError(e_6);
                                            throw e_6;
                                        } finally {
                                            actionEpilog(runtime, "5.7.1", "When pzIsThisFieldAPicklist", null, null, runtimeTraceContext);
                                        }
                                    } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                        public Boolean apply(ClipboardPage myStepPage) {
                                            return ruleDispatcher.invokeBoolean(runtime, rule2, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY, "Embed-Fields");
                                        }
                                    }, "")) {
                                        try {
                                            actionProlog(runtime, "5.7.2", "Otherwise When pzIsThisFieldAParagraph", null, null, runtimeTraceContext);
                                            {
                                                actionProlog(runtime, "5.7.2.1", "Set .pyParagraphControlType", null, null, runtimeTraceContext);
                                                pega.setViaPropRef(".pyParagraphControlType", pRef_23, myStepPage, ((scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pxRichTextEditor")) ? scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) : "pxTextArea"), "stN", false, true);
                                                actionEpilog(runtime, "5.7.2.1", "Set .pyParagraphControlType", null, null, runtimeTraceContext);
                                            }
                                        } catch (Exception e_5) {
                                            runtimeTraceContext.setError(e_5);
                                            throw e_5;
                                        } finally {
                                            actionEpilog(runtime, "5.7.2", "Otherwise When pzIsThisFieldAParagraph", null, null, runtimeTraceContext);
                                        }
                                    } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                        public Boolean apply(ClipboardPage myStepPage) {
                                            return ruleDispatcher.invokeBoolean(runtime, rule1, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY, "Embed-Fields");
                                        }
                                    }, "")) {
                                        try {
                                            actionProlog(runtime, "5.7.3", "Otherwise When pzIsUserReferenceField", null, null, runtimeTraceContext);
                                            {
                                                actionProlog(runtime, "5.7.3.1", "Set .pyUIControlType", null, null, runtimeTraceContext);
                                                pega.setViaPropRef(".pyUIControlType", pRef_22, myStepPage, scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
                                                actionEpilog(runtime, "5.7.3.1", "Set .pyUIControlType", null, null, runtimeTraceContext);
                                            }
                                        } catch (Exception e_4) {
                                            runtimeTraceContext.setError(e_4);
                                            throw e_4;
                                        } finally {
                                            actionEpilog(runtime, "5.7.3", "Otherwise When pzIsUserReferenceField", null, null, runtimeTraceContext);
                                        }
                                    }
                                }
                            } catch (Exception e_7) {
                                runtimeTraceContext.setError(e_7);
                                throw e_7;
                            } finally {
                                actionEpilog(runtime, "5.7", "When pzIsAFieldsAvailablePropertyType", null, null, runtimeTraceContext);
                            }
                        } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", null, "String", new Object[] { scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ":" })).booleanValue();
                            }
                        }, "@String.contains(.pyPropertyType, :)")) {
                            try {
                                actionProlog(runtime, "5.8", "Otherwise When @String.contains(.pyPropertyType, :)", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "5.8.1", "Set .pyPropertyType", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyPropertyType", pRef_21, myStepPage, scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
                                    actionEpilog(runtime, "5.8.1", "Set .pyPropertyType", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_3) {
                                runtimeTraceContext.setError(e_3);
                                throw e_3;
                            } finally {
                                actionEpilog(runtime, "5.8", "Otherwise When @String.contains(.pyPropertyType, :)", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_8) {
                    runtimeTraceContext.setError(e_8);
                    throw e_8;
                } finally {
                    actionEpilog(runtime, "5", "When !(.pyRelevantClass ==  || .pyClassName ==  || .pyPropertyName == )", null, null, runtimeTraceContext);
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
