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

public class ra_model_rule_obj_class_pysetrecordrulesetandversion_1955431781 extends AbstractDataTransform {

    private static final String [] pRef_2 = new String[] { "", "", "pyInitialVersion", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyRuleSet", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE-OBJ-CLASS PYSETRECORDRULESETANDVERSION #20180713T132715.264 GMT", "Rule-Obj-Class pySetRecordRuleSetAndVersion", "Pega-RulesEngine", "08-01-01", "20180713T132715.264 GMT");

    public ra_model_rule_obj_class_pysetrecordrulesetandversion_1955431781(final Loadtime loadtime) {
        super(ruleTracer, false);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyRuleSet", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyRuleSet", pRef_1, myStepPage, tools.getParamValue("ruleSet"), "sTN", false, true);
            actionEpilog(runtime, "1", "Set .pyRuleSet", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyInitialVersion", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyInitialVersion", pRef_2, myStepPage, tools.getParamValue("version"), "sTN", false, true);
            actionEpilog(runtime, "2", "Set .pyInitialVersion", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
