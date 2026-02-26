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

public class ra_model_pegasocial_post_private_pygetpostdatasource__469376171 extends AbstractDataTransform {

    private static final String [] pRef_2 = new String[] { "", "", "pyLabel", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyIsSearchEnabled", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyDataSourceReference", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGASOCIAL-POST-PRIVATE PYGETPOSTDATASOURCE #20200409T055859.650 GMT", "PegaSocial-Post-Private pyGetPostDataSource", "Pega-Social", "08-05-01", "20200409T055859.650 GMT");

    public ra_model_pegasocial_post_private_pygetpostdatasource__469376171(final Loadtime loadtime) {
        super(ruleTracer, true);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            ClipboardPage sourcePage_1 = myStepPage;
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = runtime.safeFindPage(tools.getParamValue("postDataSourceTemplate"), "Embed-Feed-DataSource");
            PRStackFrame stackFrame_1 = null;
            try {
                stackFrame_1 = pega.pushStackFrame("Embed-Feed-DataSource", null, myStepPage, false, false);
                actionProlog(runtime, "1", "Update Page Param.postDataSourceTemplate", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.1", "Set .pyDataSourceReference", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyDataSourceReference", pRef_1, myStepPage, "D_pxDirectMessages", "sTN", false, true);
                actionEpilog(runtime, "1.1", "Set .pyDataSourceReference", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.2", "Set .pyLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyLabel", pRef_2, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                    public String apply(ClipboardPage myStepPage) {
                        return ((tools.getParamValue("Label").equals("")) ? "pyDirectMessages" : tools.getParamValue("Label"));
                    }
                }), "sTN64", false, true);
                actionEpilog(runtime, "1.2", "Set .pyLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.3", "Set .pyIsSearchEnabled", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyIsSearchEnabled", pRef_3, myStepPage, true, "sSN", false, true);
                actionEpilog(runtime, "1.3", "Set .pyIsSearchEnabled", sourcePage_1, myStepPage, runtimeTraceContext);
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "1", "Update Page Param.postDataSourceTemplate", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_1);
                myStepPage = tmp_1;
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
