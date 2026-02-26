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

public class ra_model_embed_methodparams_pzparametersmodel__2109473989 extends AbstractDataTransform {

    private static final String [] pRef_10 = new String[] { "", "", "pyParametersParamIntelliValidateAs", "" };

    private static final String [] pRef_8 = new String[] { "", "", "pyParametersParamIntelliRule", "" };

    private static final String [] pRef_9 = new String[] { "", "", "pyParametersParamIntelliBaseClass", "" };

    private static final String [] pRef_6 = new String[] { "", "", "pyParametersParamType", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyParametersParamSize", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyParametersParamName", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyParametersParamReq", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyParametersParamLabel", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyParametersParamInOut", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyParametersParamDesc", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-METHODPARAMS PZPARAMETERSMODEL #20181015T210301.093 GMT", "Embed-MethodParams pzParametersModel", "Pega-UIDesign", "08-02-01", "20181015T210301.093 GMT");

    public ra_model_embed_methodparams_pzparametersmodel__2109473989(final Loadtime loadtime) {
        super(ruleTracer, false);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyParametersParamDesc", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamDesc", pRef_1, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "1", "Set .pyParametersParamDesc", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyParametersParamLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamLabel", pRef_2, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "2", "Set .pyParametersParamLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pyParametersParamInOut", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamInOut", pRef_3, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "3", "Set .pyParametersParamInOut", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set .pyParametersParamName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamName", pRef_4, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "4", "Set .pyParametersParamName", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set .pyParametersParamReq", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamReq", pRef_5, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "5", "Set .pyParametersParamReq", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set .pyParametersParamType", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamType", pRef_6, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "6", "Set .pyParametersParamType", null, null, runtimeTraceContext);
            actionProlog(runtime, "7", "Set .pyParametersParamSize", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamSize", pRef_7, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "7", "Set .pyParametersParamSize", null, null, runtimeTraceContext);
            actionProlog(runtime, "8", "Set .pyParametersParamIntelliRule", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamIntelliRule", pRef_8, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "8", "Set .pyParametersParamIntelliRule", null, null, runtimeTraceContext);
            actionProlog(runtime, "9", "Set .pyParametersParamIntelliBaseClass", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamIntelliBaseClass", pRef_9, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "9", "Set .pyParametersParamIntelliBaseClass", null, null, runtimeTraceContext);
            actionProlog(runtime, "10", "Set .pyParametersParamIntelliValidateAs", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyParametersParamIntelliValidateAs", pRef_10, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "10", "Set .pyParametersParamIntelliValidateAs", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
