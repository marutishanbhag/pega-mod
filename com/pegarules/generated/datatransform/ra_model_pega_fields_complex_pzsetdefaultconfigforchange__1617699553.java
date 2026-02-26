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

public class ra_model_pega_fields_complex_pzsetdefaultconfigforchange__1617699553 extends AbstractDataTransform {

    private static final String [] pRef_1 = new String[] { "", "", "pyDataRetrievalType", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-FIELDS-COMPLEX PZSETDEFAULTCONFIGFORCHANGE #20201121T155306.555 GMT", "Pega-Fields-Complex pzSetDefaultConfigForChange", "Pega-ProcessArchitect", "08-06-01", "20210128T184526.736 GMT");

    public ra_model_pega_fields_complex_pzsetdefaultconfigforchange__1617699553(final Loadtime loadtime) {
        super(ruleTracer, true);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyDataRetrievalType", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyDataRetrievalType", pRef_1, myStepPage, "MANUAL", "stN", false, true);
            actionEpilog(runtime, "1", "Set .pyDataRetrievalType", null, null, runtimeTraceContext);
            ParameterPage newParams_2 = runtime.parameterPageConstructor(null, null);
            {
                actionProlog(runtime, "2", "Apply Data Transform pzSetPageMode", null, null, runtimeTraceContext);
                pega.applyModel(myStepPage, "Pega-Fields-Complex", newParams_2, "pzSetPageMode");
                actionEpilog(runtime, "2", "Apply Data Transform pzSetPageMode", null, null, runtimeTraceContext);
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
