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

public class ra_model__baseclass_pzaddnewfieldtodatamodel__431446388 extends AbstractDataTransform {

    private static final String [] pRef_2 = new String[] { "", "", "pyPageName", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyMode", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pxResultCount", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL @BASECLASS PZADDNEWFIELDTODATAMODEL #20200605T124948.819 GMT", "@baseclass pzAddNewFieldToDataModel", "Pega-ProcessArchitect", "08-05-01", "20200605T124948.819 GMT");

    public ra_model__baseclass_pzaddnewfieldtodatamodel__431446388(final Loadtime loadtime) {
        super(ruleTracer, true);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PageUtility pageUtility = runtime.get(PageUtility.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Remove pyTempManageDataModel", null, null, runtimeTraceContext);
            {
                ClipboardPage remove_1 = tools.findPage("pyTempManageDataModel");
                pageUtility.removePageFromClipboard(remove_1);
            }
            actionEpilog(runtime, "1", "Remove pyTempManageDataModel", null, null, runtimeTraceContext);
            ClipboardPage sourcePage_1 = myStepPage;
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = runtime.safeFindPage("pyTempManageDataModel", "Pega-DataModel-Manage");
            PRStackFrame stackFrame_1 = null;
            try {
                stackFrame_1 = pega.pushStackFrame("Pega-DataModel-Manage", null, myStepPage, false, false);
                actionProlog(runtime, "2", "Update Page pyTempManageDataModel", sourcePage_1, myStepPage, runtimeTraceContext);
                ParameterPage newParams_2_1 = runtime.parameterPageConstructor(Arrays.asList(new InputBinding("ClassName", tools.getParamValue("ClassName"))), null);
                {
                    actionProlog(runtime, "2.1", "Apply Data Transform pzManageDataModel", null, null, runtimeTraceContext);
                    pega.applyModel(myStepPage, "@baseclass", newParams_2_1, "pzManageDataModel");
                    actionEpilog(runtime, "2.1", "Apply Data Transform pzManageDataModel", null, null, runtimeTraceContext);
                }
                actionProlog(runtime, "2.2", "Set .pxResultCount", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pxResultCount", pRef_1, myStepPage, 0, "sNY", false, true);
                actionEpilog(runtime, "2.2", "Set .pxResultCount", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "2.3", "Set .pyPageName", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyPageName", pRef_2, myStepPage, tools.getParamValue("pzPrimaryPageName"), "sTN", false, true);
                actionEpilog(runtime, "2.3", "Set .pyPageName", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "2.4", "Set .pyMode", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyMode", pRef_3, myStepPage, tools.getParamValue("Mode"), "sTN", false, true);
                actionEpilog(runtime, "2.4", "Set .pyMode", sourcePage_1, myStepPage, runtimeTraceContext);
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "2", "Update Page pyTempManageDataModel", sourcePage_1, myStepPage, runtimeTraceContext);
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
