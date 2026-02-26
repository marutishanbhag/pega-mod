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

public class ra_model_embed_stage_pzupdatecasedesignerstagecontext_2007592420 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_4 = new String[] { "", "", "pySelectedStageReference", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pySelectedStage", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyContextName", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-STAGE PZUPDATECASEDESIGNERSTAGECONTEXT #20180713T141238.990 GMT", "Embed-Stage pzUpdateCaseDesignerStageContext", "Pega-ProcessArchitect", "08-01-01", "20180713T141238.990 GMT");

    public ra_model_embed_stage_pzupdatecasedesignerstagecontext_2007592420(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyStageName").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().scalarProperty("pxPageReference").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set CaseTypeStages.pyContextName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyContextName", pRef_1, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "1", "Set CaseTypeStages.pyContextName", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set CaseTypeStages.pySelectedStage", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pySelectedStage", pRef_3, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "2", "Set CaseTypeStages.pySelectedStage", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set CaseTypeStages.pySelectedStageReference", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pySelectedStageReference", pRef_4, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "3", "Set CaseTypeStages.pySelectedStageReference", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
