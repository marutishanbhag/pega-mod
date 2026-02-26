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

public class ra_model_code_pega_list_pzgetcountinterval_1365301345 extends AbstractDataTransform {

    private static final String [] pRef_10 = new String[] { "", "", "pxResults", "5", "pyDescription", "" };

    private static final String [] pRef_8 = new String[] { "", "", "pxResults", "4", "pyDescription", "" };

    private static final String [] pRef_9 = new String[] { "", "", "pxResults", "5", "pyLabel", "" };

    private static final String [] pRef_12 = new String[] { "", "", "pxResults", "6", "pyDescription", "" };

    private static final String [] pRef_6 = new String[] { "", "", "pxResults", "3", "pyDescription", "" };

    private static final String [] pRef_11 = new String[] { "", "", "pxResults", "6", "pyLabel", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pxResults", "4", "pyLabel", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pxResults", "2", "pyDescription", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pxResults", "3", "pyLabel", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pxResults", "1", "pyDescription", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pxResults", "2", "pyLabel", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pxResults", "1", "pyLabel", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZGETCOUNTINTERVAL #20181121T090150.600 GMT", "Code-Pega-List pzGetCountInterval", "Pega-AppDefinition", "08-02-01", "20181121T090150.600 GMT");

    public ra_model_code_pega_list_pzgetcountinterval_1365301345(final Loadtime loadtime) {
        super(ruleTracer, false);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pxResults(1).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(1).pyLabel", pRef_1, myStepPage, "Per Minute", "sTN64", false, true);
            actionEpilog(runtime, "1", "Set .pxResults(1).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pxResults(1).pyDescription", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(1).pyDescription", pRef_2, myStepPage, "Per Minute", "sTN", false, true);
            actionEpilog(runtime, "2", "Set .pxResults(1).pyDescription", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pxResults(2).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(2).pyLabel", pRef_3, myStepPage, "Per Hour", "sTN64", false, true);
            actionEpilog(runtime, "3", "Set .pxResults(2).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set .pxResults(2).pyDescription", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(2).pyDescription", pRef_4, myStepPage, "Per Hour", "sTN", false, true);
            actionEpilog(runtime, "4", "Set .pxResults(2).pyDescription", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set .pxResults(3).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(3).pyLabel", pRef_5, myStepPage, "Per Day", "sTN64", false, true);
            actionEpilog(runtime, "5", "Set .pxResults(3).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set .pxResults(3).pyDescription", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(3).pyDescription", pRef_6, myStepPage, "Per Day", "sTN", false, true);
            actionEpilog(runtime, "6", "Set .pxResults(3).pyDescription", null, null, runtimeTraceContext);
            actionProlog(runtime, "7", "Set .pxResults(4).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(4).pyLabel", pRef_7, myStepPage, "Per Week", "sTN64", false, true);
            actionEpilog(runtime, "7", "Set .pxResults(4).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "8", "Set .pxResults(4).pyDescription", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(4).pyDescription", pRef_8, myStepPage, "Per Week", "sTN", false, true);
            actionEpilog(runtime, "8", "Set .pxResults(4).pyDescription", null, null, runtimeTraceContext);
            actionProlog(runtime, "9", "Set .pxResults(5).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(5).pyLabel", pRef_9, myStepPage, "Per Month", "sTN64", false, true);
            actionEpilog(runtime, "9", "Set .pxResults(5).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "10", "Set .pxResults(5).pyDescription", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(5).pyDescription", pRef_10, myStepPage, "Per Month", "sTN", false, true);
            actionEpilog(runtime, "10", "Set .pxResults(5).pyDescription", null, null, runtimeTraceContext);
            actionProlog(runtime, "11", "Set .pxResults(6).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(6).pyLabel", pRef_11, myStepPage, "Per Year", "sTN64", false, true);
            actionEpilog(runtime, "11", "Set .pxResults(6).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "12", "Set .pxResults(6).pyDescription", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(6).pyDescription", pRef_12, myStepPage, "Per Year", "sTN", false, true);
            actionEpilog(runtime, "12", "Set .pxResults(6).pyDescription", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
