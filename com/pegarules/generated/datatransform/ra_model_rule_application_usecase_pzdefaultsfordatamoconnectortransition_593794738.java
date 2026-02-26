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

public class ra_model_rule_application_usecase_pzdefaultsfordatamoconnectortransition_593794738 extends AbstractDataTransform {

    private final RuleHandle rule0;

    private static final String [] pRef_10 = new String[] { "", "", "pzEditLabel", "" };

    private static final String [] pRef_8 = new String[] { "", "", "pyDefaultOwner", "" };

    private static final String [] pRef_9 = new String[] { "", "", "pyDefaultPurpose", "" };

    private static final String [] pRef_6 = new String[] { "", "", "pyLabel", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyDefaultProductName", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyRuleSet", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyRuleSetVersion", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyOwner", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyPurpose", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyProductName", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE-APPLICATION-USECASE PZDEFAULTSFORDATAMOCONNECTORTRANSITION #20180713T141242.661 GMT", "Rule-Application-UseCase pzDefaultsForDataMoConnectorTransition", "Pega-ProcessArchitect", "08-01-01", "20180713T141242.661 GMT");

    public ra_model_rule_application_usecase_pzdefaultsfordatamoconnectortransition_593794738(final Loadtime loadtime) {
        super(ruleTracer, true);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZISSPECNAMEADEFAULTVALUE", "pzIsSpecNameADefaultValue");
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            ParameterPage newParams_1 = runtime.parameterPageConstructor(null, null);
            {
                actionProlog(runtime, "1", "Apply Data Transform pyDefault", null, null, runtimeTraceContext);
                pega.applyModel(myStepPage, "Rule-Application-UseCase", newParams_1, "pyDefault");
                actionEpilog(runtime, "1", "Apply Data Transform pyDefault", null, null, runtimeTraceContext);
            }
            actionProlog(runtime, "2", "Set .pyProductName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyProductName", pRef_1, myStepPage, tools.getParamValue("ApplicationName"), "sIN", false, true);
            actionEpilog(runtime, "2", "Set .pyProductName", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pyOwner", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyOwner", pRef_2, myStepPage, tools.getParamValue("WorkType"), "sTN", false, true);
            actionEpilog(runtime, "3", "Set .pyOwner", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set .pyPurpose", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyPurpose", pRef_3, myStepPage, tools.getParamValue("SpecificationName"), "sTI64", false, true);
            actionEpilog(runtime, "4", "Set .pyPurpose", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set .pyRuleSet", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyRuleSet", pRef_4, myStepPage, tools.getParamValue("RuleSet"), "sTN", false, true);
            actionEpilog(runtime, "5", "Set .pyRuleSet", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set .pyRuleSetVersion", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyRuleSetVersion", pRef_5, myStepPage, tools.getParamValue("RuleSetVersion"), "sTN", false, true);
            actionEpilog(runtime, "6", "Set .pyRuleSetVersion", null, null, runtimeTraceContext);
            actionProlog(runtime, "7", "Set .pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyLabel", pRef_6, myStepPage, pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, null, new Object[] { tools.getParamValue("DefaultLabel"), 0, 63 }), "sTN64", false, true);
            actionEpilog(runtime, "7", "Set .pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "8", "Set .pyDefaultProductName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyDefaultProductName", pRef_7, myStepPage, tools.getParamValue("ApplicationName"), "sTN", false, true);
            actionEpilog(runtime, "8", "Set .pyDefaultProductName", null, null, runtimeTraceContext);
            actionProlog(runtime, "9", "Set .pyDefaultOwner", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyDefaultOwner", pRef_8, myStepPage, tools.getParamValue("WorkType"), "sTN", false, true);
            actionEpilog(runtime, "9", "Set .pyDefaultOwner", null, null, runtimeTraceContext);
            actionProlog(runtime, "10", "Set .pyDefaultPurpose", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyDefaultPurpose", pRef_9, myStepPage, tools.getParamValue("SpecificationName"), "sTN", false, true);
            actionEpilog(runtime, "10", "Set .pyDefaultPurpose", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY, "Rule-Application-UseCase");
                }
            }, "")) {
                try {
                    actionProlog(runtime, "11", "When pzIsSpecNameADefaultValue", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "11.1", "Set .pzEditLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pzEditLabel", pRef_10, myStepPage, true, "sSN", false, true);
                        actionEpilog(runtime, "11.1", "Set .pzEditLabel", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "11", "When pzIsSpecNameADefaultValue", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "12", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "12.1", "Set .pzEditLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pzEditLabel", pRef_10, myStepPage, false, "sSN", false, true);
                        actionEpilog(runtime, "12.1", "Set .pzEditLabel", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "12", "Otherwise ", null, null, runtimeTraceContext);
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
