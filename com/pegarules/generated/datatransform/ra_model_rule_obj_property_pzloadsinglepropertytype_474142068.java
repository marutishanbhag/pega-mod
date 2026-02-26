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
import com.pega.platform.clipboard.query.QueryBuilderFactory;
import com.pega.platform.clipboard.query.PropertyQuery;

public class ra_model_rule_obj_property_pzloadsinglepropertytype_474142068 extends AbstractDataTransform {

    private final PropertyQuery propertyQuery_8;

    private final PropertyQuery propertyQuery_7;

    private static final String [] pRef_6 = new String[] { "", "", "pyUsage", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyStreamName", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyDescription", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyStringType", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyLabel", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyPropertyMode", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE-OBJ-PROPERTY PZLOADSINGLEPROPERTYTYPE #20180713T141246.512 GMT", "Rule-Obj-Property pzLoadSinglePropertyType", "Pega-ProcessArchitect", "08-01-01", "20180713T141246.512 GMT");

    public ra_model_rule_obj_property_pzloadsinglepropertytype_474142068(final Loadtime loadtime) {
        super(ruleTracer, false);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        propertyQuery_7 = queryBuilderFactory.create().scalarProperty("pyLabel").buildPropertyQuery();
        propertyQuery_8 = queryBuilderFactory.create().scalarProperty("pyUsage").buildPropertyQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyPropertyMode", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyPropertyMode", pRef_1, myStepPage, tools.getParamValue("PropertyMode"), "siN", false, true);
            actionEpilog(runtime, "1", "Set .pyPropertyMode", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyStringType", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyStringType", pRef_2, myStepPage, tools.getParamValue("StringType"), "siN", false, true);
            actionEpilog(runtime, "2", "Set .pyStringType", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyLabel", pRef_3, myStepPage, tools.getParamValue("Label"), "sTN64", false, true);
            actionEpilog(runtime, "3", "Set .pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set .pyStreamName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, tools.getParamValue("Control"), "sIN", false, true);
            actionEpilog(runtime, "4", "Set .pyStreamName", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (!(tools.getParamValue("StringType").equals("")));
                }
            }, "param.StringType != ")) {
                try {
                    actionProlog(runtime, "5", "When param.StringType != ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "5.1", "Set .pyDescription", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyDescription", pRef_5, myStepPage, ((tools.getParamValue("StringType") + ":") + tools.getParamValue("Control")), "sTN", false, true);
                        actionEpilog(runtime, "5.1", "Set .pyDescription", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "5", "When param.StringType != ", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "6", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "6.1", "Set .pyDescription", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyDescription", pRef_5, myStepPage, tools.getParamValue("Control"), "sTN", false, true);
                        actionEpilog(runtime, "6.1", "Set .pyDescription", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "6", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "7", "Set .pyUsage", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyUsage", pRef_6, myStepPage, tools.getParamValue("FieldsGrouping"), "sTN", false, true);
            actionEpilog(runtime, "7", "Set .pyUsage", null, null, runtimeTraceContext);
            actionProlog(runtime, "9", "Set .pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyLabel", pRef_3, myStepPage, pega.<String>resolveMethodCall("getLocalizedValue--(ClipboardProperty)", "getLocalizedValue", "Pega-RULES", "String", new Object[] { propertyQuery_7.resolve(tools, myStepPage) }), "sTN64", false, true);
            actionEpilog(runtime, "9", "Set .pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "11", "Set .pyUsage", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyUsage", pRef_6, myStepPage, pega.<String>resolveMethodCall("getLocalizedValue--(ClipboardProperty)", "getLocalizedValue", "Pega-RULES", "String", new Object[] { propertyQuery_8.resolve(tools, myStepPage) }), "sTN", false, true);
            actionEpilog(runtime, "11", "Set .pyUsage", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
