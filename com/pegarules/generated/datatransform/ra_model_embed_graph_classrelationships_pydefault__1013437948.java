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

public class ra_model_embed_graph_classrelationships_pydefault__1013437948 extends AbstractDataTransform {

    private static final String [] pRef_6 = new String[] { "", "", "pyApplicationList", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyTargetNodeRef", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyIsShowInherited", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyCustomEdgeSignature", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pySourceNodeRef", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyCustomNodeSignature", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-GRAPH-CLASSRELATIONSHIPS PYDEFAULT #20190219T174816.425 GMT", "Embed-Graph-ClassRelationships pyDefault", "Pega-Desktop", "08-03-01", "20190404T185242.768 GMT");

    public ra_model_embed_graph_classrelationships_pydefault__1013437948(final Loadtime loadtime) {
        super(ruleTracer, true);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyCustomNodeSignature", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyCustomNodeSignature", pRef_1, myStepPage, "pyClassName", "sTN", false, true);
            actionEpilog(runtime, "1", "Set .pyCustomNodeSignature", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyCustomEdgeSignature", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyCustomEdgeSignature", pRef_2, myStepPage, "pxObjClass pyClassName pyPropertyName pyPageClass", "sTN", false, true);
            actionEpilog(runtime, "2", "Set .pyCustomEdgeSignature", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pySourceNodeRef", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pySourceNodeRef", pRef_3, myStepPage, "pyClassName", "sTN", false, true);
            actionEpilog(runtime, "3", "Set .pySourceNodeRef", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set .pyTargetNodeRef", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyTargetNodeRef", pRef_4, myStepPage, "pyPageClass", "sTN", false, true);
            actionEpilog(runtime, "4", "Set .pyTargetNodeRef", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set .pyIsShowInherited", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyIsShowInherited", pRef_5, myStepPage, false, "sSN", false, true);
            actionEpilog(runtime, "5", "Set .pyIsShowInherited", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set .pyApplicationList", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyApplicationList", pRef_6, myStepPage, (("\"" + tools.getParamValue("ApplicationName")) + "\""), "sTN", false, true);
            actionEpilog(runtime, "6", "Set .pyApplicationList", null, null, runtimeTraceContext);
            ParameterPage newParams_8 = runtime.parameterPageConstructor(null, null);
            {
                actionProlog(runtime, "8", "Apply Data Transform pzSetApplicationListFilter", null, null, runtimeTraceContext);
                pega.applyModel(myStepPage, "Embed-Graph-ClassRelationships", newParams_8, "pzSetApplicationListFilter");
                actionEpilog(runtime, "8", "Apply Data Transform pzSetApplicationListFilter", null, null, runtimeTraceContext);
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
