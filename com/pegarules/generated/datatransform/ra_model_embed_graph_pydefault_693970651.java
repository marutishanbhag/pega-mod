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

public class ra_model_embed_graph_pydefault_693970651 extends AbstractDataTransform {

    private static final String [] pRef_8 = new String[] { "", "", "pyMinNodeHeight", "" };

    private static final String [] pRef_9 = new String[] { "", "", "pyMinEdgeHeight", "" };

    private static final String [] pRef_6 = new String[] { "", "", "pyNodeCornerRadius", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyMinNodeWidth", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyMasterDetailMode", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyIconsOnLeft", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyHideExpandCollapse", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyShowEdgesInNodes", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyShowAllNodes", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-GRAPH PYDEFAULT #20190219T174816.413 GMT", "Embed-Graph pyDefault", "Pega-Desktop", "08-03-01", "20190219T221438.463 GMT");

    public ra_model_embed_graph_pydefault_693970651(final Loadtime loadtime) {
        super(ruleTracer, true);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyShowAllNodes", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyShowAllNodes", pRef_1, myStepPage, false, "sTN", false, true);
            actionEpilog(runtime, "1", "Set .pyShowAllNodes", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyHideExpandCollapse", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyHideExpandCollapse", pRef_2, myStepPage, false, "sSN", false, true);
            actionEpilog(runtime, "2", "Set .pyHideExpandCollapse", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pyShowEdgesInNodes", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyShowEdgesInNodes", pRef_3, myStepPage, true, "sSN", false, true);
            actionEpilog(runtime, "3", "Set .pyShowEdgesInNodes", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set .pyMasterDetailMode", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyMasterDetailMode", pRef_4, myStepPage, false, "sSN", false, true);
            actionEpilog(runtime, "4", "Set .pyMasterDetailMode", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set .pyIconsOnLeft", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyIconsOnLeft", pRef_5, myStepPage, true, "sSN", false, true);
            actionEpilog(runtime, "5", "Set .pyIconsOnLeft", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set .pyNodeCornerRadius", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyNodeCornerRadius", pRef_6, myStepPage, 0, "sNN", false, true);
            actionEpilog(runtime, "6", "Set .pyNodeCornerRadius", null, null, runtimeTraceContext);
            actionProlog(runtime, "7", "Set .pyMinNodeWidth", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyMinNodeWidth", pRef_7, myStepPage, "220", "sNN", false, true);
            actionEpilog(runtime, "7", "Set .pyMinNodeWidth", null, null, runtimeTraceContext);
            actionProlog(runtime, "8", "Set .pyMinNodeHeight", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyMinNodeHeight", pRef_8, myStepPage, 36, "sNN", false, true);
            actionEpilog(runtime, "8", "Set .pyMinNodeHeight", null, null, runtimeTraceContext);
            actionProlog(runtime, "9", "Set .pyMinEdgeHeight", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyMinEdgeHeight", pRef_9, myStepPage, 36, "sNN", false, true);
            actionEpilog(runtime, "9", "Set .pyMinEdgeHeight", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
