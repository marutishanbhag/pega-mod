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

public class ra_model_embed_methodparams_pzsetparameter_518902459 extends AbstractDataTransform {

    private static final String [] pRef_10 = new String[] { "", "", "pyParametersParamIntelliValidateAs", "" };

    private static final String [] pRef_8 = new String[] { "", "", "pyParametersParamIntelliRule", "" };

    private static final String [] pRef_9 = new String[] { "", "", "pyParametersParamIntelliBaseClass", "" };

    private static final String [] pRef_6 = new String[] { "", "", "pyParametersParamSize", "" };

    private static final String [] pRef_11 = new String[] { "", "", "pyParametersParamType", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyParametersParamDefaultValue", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyParametersParamLabel", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyParametersParamReq", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyParametersParamInOut", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyParametersParamName", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyParametersParamDesc", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-METHODPARAMS PZSETPARAMETER #20181015T210301.151 GMT", "Embed-MethodParams pzSetParameter", "Pega-SystemArchitect", "08-02-01", "20181015T210301.151 GMT");

    public ra_model_embed_methodparams_pzsetparameter_518902459(final Loadtime loadtime) {
        super(ruleTracer, false);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyParametersParamDesc", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamDesc", pRef_1, myStepPage, tools.getParamValue("Label"), "sTN", false, true);
            actionEpilog(runtime, "1", "Set .pyParametersParamDesc", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyParametersParamInOut", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamInOut", pRef_2, myStepPage, "IN", "sTN", false, true);
            actionEpilog(runtime, "2", "Set .pyParametersParamInOut", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pyParametersParamName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamName", pRef_3, myStepPage, tools.getParamValue("Name"), "sTN", false, true);
            actionEpilog(runtime, "3", "Set .pyParametersParamName", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set .pyParametersParamLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamLabel", pRef_4, myStepPage, tools.getParamValue("DisplayName"), "sTN", false, true);
            actionEpilog(runtime, "4", "Set .pyParametersParamLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set .pyParametersParamReq", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamReq", pRef_5, myStepPage, (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "Required") ? "-1" : ""), "sTN", false, true);
            actionEpilog(runtime, "5", "Set .pyParametersParamReq", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set .pyParametersParamSize", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamSize", pRef_6, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "6", "Set .pyParametersParamSize", null, null, runtimeTraceContext);
            actionProlog(runtime, "7", "Set .pyParametersParamDefaultValue", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamDefaultValue", pRef_7, myStepPage, tools.getParamValue("DefaultValue"), "sTN", false, true);
            actionEpilog(runtime, "7", "Set .pyParametersParamDefaultValue", null, null, runtimeTraceContext);
            actionProlog(runtime, "8", "Set .pyParametersParamIntelliRule", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamIntelliRule", pRef_8, myStepPage, tools.getParamValue("SmartpromptType"), "sTN", false, true);
            actionEpilog(runtime, "8", "Set .pyParametersParamIntelliRule", null, null, runtimeTraceContext);
            actionProlog(runtime, "9", "Set .pyParametersParamIntelliBaseClass", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamIntelliBaseClass", pRef_9, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "9", "Set .pyParametersParamIntelliBaseClass", null, null, runtimeTraceContext);
            actionProlog(runtime, "10", "Set .pyParametersParamIntelliValidateAs", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamIntelliValidateAs", pRef_10, myStepPage, tools.getParamValue("ValidateAs"), "sTN", false, true);
            actionEpilog(runtime, "10", "Set .pyParametersParamIntelliValidateAs", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ((((tools.getParamValue("Type").equalsIgnoreCase("Text")) || (tools.getParamValue("Type").equalsIgnoreCase("Identifier"))) || (tools.getParamValue("Type").equalsIgnoreCase("Password"))) || (tools.getParamValue("Type").equalsIgnoreCase("TextEncrypted")));
                }
            }, "param.Type ~= Text || param.Type ~= Identifier || param.Type ~= Password || param.Type ~= TextEncrypted")) {
                try {
                    actionProlog(runtime, "12", "When param.Type ~= Text || param.Type ~= Identifier || param.Type ~= Password || param.Type ~= TextEncrypted", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "12.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyParametersParamType", pRef_11, myStepPage, "STRING", "sTN", false, true);
                        actionEpilog(runtime, "12.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_10) {
                    runtimeTraceContext.setError(e_10);
                    throw e_10;
                } finally {
                    actionEpilog(runtime, "12", "When param.Type ~= Text || param.Type ~= Identifier || param.Type ~= Password || param.Type ~= TextEncrypted", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (tools.getParamValue("Type").equalsIgnoreCase("TrueFalse"));
                }
            }, "param.Type~=TrueFalse")) {
                try {
                    actionProlog(runtime, "13", "Otherwise When param.Type~=TrueFalse", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "13.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyParametersParamType", pRef_11, myStepPage, "BOOLEAN", "sTN", false, true);
                        actionEpilog(runtime, "13.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_9) {
                    runtimeTraceContext.setError(e_9);
                    throw e_9;
                } finally {
                    actionEpilog(runtime, "13", "Otherwise When param.Type~=TrueFalse", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (tools.getParamValue("Type").equalsIgnoreCase("Integer"));
                }
            }, "param.Type~=Integer")) {
                try {
                    actionProlog(runtime, "14", "Otherwise When param.Type~=Integer", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "14.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyParametersParamType", pRef_11, myStepPage, "INTEGER", "sTN", false, true);
                        actionEpilog(runtime, "14.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_8) {
                    runtimeTraceContext.setError(e_8);
                    throw e_8;
                } finally {
                    actionEpilog(runtime, "14", "Otherwise When param.Type~=Integer", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (tools.getParamValue("Type").equalsIgnoreCase("Double"));
                }
            }, "param.Type~=Double")) {
                try {
                    actionProlog(runtime, "15", "Otherwise When param.Type~=Double", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "15.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyParametersParamType", pRef_11, myStepPage, "Double", "sTN", false, true);
                        actionEpilog(runtime, "15.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_7) {
                    runtimeTraceContext.setError(e_7);
                    throw e_7;
                } finally {
                    actionEpilog(runtime, "15", "Otherwise When param.Type~=Double", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (tools.getParamValue("Type").equalsIgnoreCase("Date"));
                }
            }, "param.Type~=Date")) {
                try {
                    actionProlog(runtime, "16", "Otherwise When param.Type~=Date", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "16.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyParametersParamType", pRef_11, myStepPage, "Date", "sTN", false, true);
                        actionEpilog(runtime, "16.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_6) {
                    runtimeTraceContext.setError(e_6);
                    throw e_6;
                } finally {
                    actionEpilog(runtime, "16", "Otherwise When param.Type~=Date", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (tools.getParamValue("Type").equalsIgnoreCase("DateTime"));
                }
            }, "param.Type~=DateTime")) {
                try {
                    actionProlog(runtime, "17", "Otherwise When param.Type~=DateTime", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "17.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyParametersParamType", pRef_11, myStepPage, "DateTime", "sTN", false, true);
                        actionEpilog(runtime, "17.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_5) {
                    runtimeTraceContext.setError(e_5);
                    throw e_5;
                } finally {
                    actionEpilog(runtime, "17", "Otherwise When param.Type~=DateTime", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (tools.getParamValue("Type").equalsIgnoreCase("TimeOfDay"));
                }
            }, "param.Type~=TimeOfDay")) {
                try {
                    actionProlog(runtime, "18", "Otherwise When param.Type~=TimeOfDay", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "18.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyParametersParamType", pRef_11, myStepPage, "TimeOfDay", "sTN", false, true);
                        actionEpilog(runtime, "18.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_4) {
                    runtimeTraceContext.setError(e_4);
                    throw e_4;
                } finally {
                    actionEpilog(runtime, "18", "Otherwise When param.Type~=TimeOfDay", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (tools.getParamValue("Type").equalsIgnoreCase("Decimal"));
                }
            }, "param.Type~=Decimal")) {
                try {
                    actionProlog(runtime, "19", "Otherwise When param.Type~=Decimal", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "19.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyParametersParamType", pRef_11, myStepPage, "Decimal", "sTN", false, true);
                        actionEpilog(runtime, "19.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "19", "Otherwise When param.Type~=Decimal", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "20", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "20.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyParametersParamType", pRef_11, myStepPage, "STRING", "sTN", false, true);
                        actionEpilog(runtime, "20.1", "Set .pyParametersParamType", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "20", "Otherwise ", null, null, runtimeTraceContext);
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
