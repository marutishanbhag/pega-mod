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

public class ra_model_pega_discoverlayercake_pzloaddiscovergadgetbase_436823045 extends AbstractDataTransform {

    private static final String [] pRef_2 = new String[] { "", "", "pyContext", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pzInsKey", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-DISCOVERLAYERCAKE PZLOADDISCOVERGADGETBASE #20230618T001815.609 GMT", "Pega-DiscoverLayerCake pzLoadDiscoverGadgetBase", "Pega-ProcessArchitect", "08-23-01", "20230618T001815.609 GMT");

    public ra_model_pega_discoverlayercake_pzloaddiscovergadgetbase_436823045(final Loadtime loadtime) {
        super(ruleTracer, true);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pzInsKey", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pzInsKey", pRef_1, myStepPage, tools.getParamValue("pzInsKey"), "sIY", false, true);
            actionEpilog(runtime, "1", "Set .pzInsKey", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyContext", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyContext", pRef_2, myStepPage, tools.getParamValue("StepPage"), "sTN", false, true);
            actionEpilog(runtime, "2", "Set .pyContext", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
