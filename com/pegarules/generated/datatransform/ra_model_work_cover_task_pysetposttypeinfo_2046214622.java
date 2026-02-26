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

public class ra_model_work_cover_task_pysetposttypeinfo_2046214622 extends AbstractDataTransform {

    private static final String [] pRef_6 = new String[] { "", "", "pyLineNumber", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyImage", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pySelected", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyCategory", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyDescription", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyLabel", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL WORK-COVER-TASK PYSETPOSTTYPEINFO #20180907T122403.940 GMT", "Work-Cover-Task pySetPostTypeInfo", "Pega-Social", "08-02-01", "20180919T103254.117 GMT");

    public ra_model_work_cover_task_pysetposttypeinfo_2046214622(final Loadtime loadtime) {
        super(ruleTracer, false);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "PostTypeLabel", "pyCaption", tools }), "sTN64", false, true);
            actionEpilog(runtime, "1", "Set .pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyCategory", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyCategory", pRef_2, myStepPage, "Task", "sTN", false, true);
            actionEpilog(runtime, "2", "Set .pyCategory", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pyDescription", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyDescription", pRef_3, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "pyPostDescription", "pyCaption", tools }), "sTN", false, true);
            actionEpilog(runtime, "3", "Set .pyDescription", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set .pyImage", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyImage", pRef_4, myStepPage, "pi pi-clipboard-check", "sTN", false, true);
            actionEpilog(runtime, "4", "Set .pyImage", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set .pySelected", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pySelected", pRef_5, myStepPage, false, "sSN", false, true);
            actionEpilog(runtime, "5", "Set .pySelected", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set .pyLineNumber", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyLineNumber", pRef_6, myStepPage, 2, "sNN", false, true);
            actionEpilog(runtime, "6", "Set .pyLineNumber", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
