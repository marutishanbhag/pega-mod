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
import com.pega.platform.clipboard.query.ScalarValueQuery;
import com.pega.platform.clipboard.query.QueryBuilderFactory;

public class ra_model_code_pega_list_pzsetnotificationscountforoperator_1686820613 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_3 = new String[] { "", "", "pyUserIdentifier", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyUnreadNotificationsCount", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZSETNOTIFICATIONSCOUNTFOROPERATOR #20180713T133119.484 GMT", "Code-Pega-List pzSetNotificationsCountForOperator", "Pega-ProcessEngine", "08-01-01", "20180713T133119.484 GMT");

    public ra_model_code_pega_list_pzsetnotificationscountforoperator_1686820613(final Loadtime loadtime) {
        super(ruleTracer, false);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().pageList("pxResults", 1).scalarList("pySummaryCount", 1).buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().scalarProperty("pyUserIdentifier").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set Primary.pyUnreadNotificationsCount", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyUnreadNotificationsCount", pRef_1, tools.getPrimaryPage(), scalarValueQuery_2.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER), "sNN", false, true);
            actionEpilog(runtime, "1", "Set Primary.pyUnreadNotificationsCount", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set Primary.pyUserIdentifier", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyUserIdentifier", pRef_3, tools.getPrimaryPage(), pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", null, null, new Object[] { scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("OperatorID", "Data-Admin-Operator-ID"), ImmutablePropertyInfo.TYPE_TEXT) }), "sTN", false, true);
            actionEpilog(runtime, "2", "Set Primary.pyUserIdentifier", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
