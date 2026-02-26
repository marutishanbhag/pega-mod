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

public class ra_model_pega_fields_scalar_picklist_pzsetdefaultconfigforchange_1512423092 extends AbstractDataTransform {

    private static final String [] pRef_2 = new String[] { "", "", "pySourceType", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pySupportsCalculation", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyStringType", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-FIELDS-SCALAR-PICKLIST PZSETDEFAULTCONFIGFORCHANGE #20220222T193820.397 GMT", "Pega-Fields-Scalar-Picklist pzSetDefaultConfigForChange", "Pega-ProcessArchitect", "08-08-01", "20220222T193820.397 GMT");

    public ra_model_pega_fields_scalar_picklist_pzsetdefaultconfigforchange_1512423092(final Loadtime loadtime) {
        super(ruleTracer, true);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyStringType", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyStringType", pRef_1, myStepPage, "Text", "sTN", false, true);
            actionEpilog(runtime, "1", "Set .pyStringType", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pySourceType", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pySourceType", pRef_2, myStepPage, "Local", "stN", false, true);
            actionEpilog(runtime, "2", "Set .pySourceType", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pySupportsCalculation", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pySupportsCalculation", pRef_3, myStepPage, false, "sSN", false, true);
            actionEpilog(runtime, "3", "Set .pySupportsCalculation", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set Param.noop", null, null, runtimeTraceContext);
            tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pxExecuteAnActivity--(ClipboardPage,String)", "pxExecuteAnActivity", null, "Utilities", new Object[] { myStepPage, "pzExecuteFieldsSourceExtension" })).booleanValue()));
            actionEpilog(runtime, "5", "Set Param.noop", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
