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
import com.pega.platform.clipboard.query.PageQuery;
import com.pega.platform.clipboard.query.QueryBuilderFactory;

public class ra_model__baseclass_pygetroutingtableconfig__1419693640 extends AbstractDataTransform {

    private final PageQuery pageQuery_6;

    private final PageQuery pageQuery_5;

    private final PageQuery pageQuery_1;

    private static final String [] pRef_4 = new String[] { "", "", "pyPayload", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pySemanticURL", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyRouteKey", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL @BASECLASS PYGETROUTINGTABLECONFIG #20220530T125225.470 GMT", "@baseclass pyGetRoutingTableConfig", "Pega-UIEngine", "08-08-01", "20220530T125225.470 GMT");

    public ra_model__baseclass_pygetroutingtableconfig__1419693640(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        pageQuery_1 = queryBuilderFactory.create().pageGroup("pyURLRoutings", "page").buildPageQuery();
        pageQuery_5 = queryBuilderFactory.create().pageGroup("pyURLRoutings", "case").buildPageQuery();
        pageQuery_6 = queryBuilderFactory.create().pageGroup("pyURLRoutings", "data").buildPageQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            ClipboardPage sourcePage_1 = myStepPage;
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = pageQuery_1.resolve(tools, myStepPage);
            PRStackFrame stackFrame_2 = null;
            try {
                stackFrame_2 = pega.pushStackFrame("@baseclass", null, myStepPage, false, false);
                actionProlog(runtime, "1", "Update Page . pyURLRoutings(page)", sourcePage_1, myStepPage, runtimeTraceContext);
                ClipboardPage sourcePage_2 = sourcePage_1;
                ClipboardPage tmp_2 = myStepPage;
                myStepPage = myStepPage.getProperty(".pxResults(<append>)").getPageValue();
                PRStackFrame stackFrame_1 = null;
                try {
                    stackFrame_1 = pega.pushStackFrame("@baseclass", null, myStepPage, false, false);
                    actionProlog(runtime, "1.1", "Update Page .pxResults(<APPEND>)", sourcePage_2, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "1.1.1", "Set .pySemanticURL", sourcePage_2, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pySemanticURL", pRef_2, myStepPage, "{pageName}", "sTN", false, true);
                    actionEpilog(runtime, "1.1.1", "Set .pySemanticURL", sourcePage_2, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "1.1.2", "Set .pyRouteKey", sourcePage_2, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyRouteKey", pRef_3, myStepPage, "showView", "sTN", false, true);
                    actionEpilog(runtime, "1.1.2", "Set .pyRouteKey", sourcePage_2, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "1.1.3", "Set .pyPayload", sourcePage_2, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyPayload", pRef_4, myStepPage, "{\"page\": \"{pageId}\",\"pageClass\": \"{pageClassName}\"}", "sTN", false, true);
                    actionEpilog(runtime, "1.1.3", "Set .pyPayload", sourcePage_2, myStepPage, runtimeTraceContext);
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "1.1", "Update Page .pxResults(<APPEND>)", sourcePage_2, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_1);
                    myStepPage = tmp_2;
                }
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "1", "Update Page . pyURLRoutings(page)", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_2);
                myStepPage = tmp_1;
            }
            ClipboardPage sourcePage_3 = myStepPage;
            ClipboardPage tmp_3 = myStepPage;
            myStepPage = pageQuery_5.resolve(tools, myStepPage);
            PRStackFrame stackFrame_5 = null;
            try {
                stackFrame_5 = pega.pushStackFrame("@baseclass", null, myStepPage, false, false);
                actionProlog(runtime, "2", "Update Page . pyURLRoutings(case)", sourcePage_3, myStepPage, runtimeTraceContext);
                ClipboardPage sourcePage_4 = sourcePage_3;
                ClipboardPage tmp_4 = myStepPage;
                myStepPage = myStepPage.getProperty(".pxResults(<append>)").getPageValue();
                PRStackFrame stackFrame_3 = null;
                try {
                    stackFrame_3 = pega.pushStackFrame("@baseclass", null, myStepPage, false, false);
                    actionProlog(runtime, "2.1", "Update Page .pxResults(<APPEND>)", sourcePage_4, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.1.1", "Set .pySemanticURL", sourcePage_4, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pySemanticURL", pRef_2, myStepPage, "{caseName}/create", "sTN", false, true);
                    actionEpilog(runtime, "2.1.1", "Set .pySemanticURL", sourcePage_4, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.1.2", "Set .pyRouteKey", sourcePage_4, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyRouteKey", pRef_3, myStepPage, "createWork", "sTN", false, true);
                    actionEpilog(runtime, "2.1.2", "Set .pyRouteKey", sourcePage_4, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.1.3", "Set .pyPayload", sourcePage_4, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyPayload", pRef_4, myStepPage, "{ \"caseTypeID\": \"{caseClassName}\", \"processID\": \"pyStartCase\" }", "sTN", false, true);
                    actionEpilog(runtime, "2.1.3", "Set .pyPayload", sourcePage_4, myStepPage, runtimeTraceContext);
                } catch (Exception e_5) {
                    runtimeTraceContext.setError(e_5);
                    throw e_5;
                } finally {
                    actionEpilog(runtime, "2.1", "Update Page .pxResults(<APPEND>)", sourcePage_4, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_3);
                    myStepPage = tmp_4;
                }
                ClipboardPage sourcePage_5 = sourcePage_3;
                ClipboardPage tmp_5 = myStepPage;
                myStepPage = myStepPage.getProperty(".pxResults(<append>)").getPageValue();
                PRStackFrame stackFrame_4 = null;
                try {
                    stackFrame_4 = pega.pushStackFrame("@baseclass", null, myStepPage, false, false);
                    actionProlog(runtime, "2.2", "Update Page .pxResults(<APPEND>)", sourcePage_5, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.2.1", "Set .pySemanticURL", sourcePage_5, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pySemanticURL", pRef_2, myStepPage, "{caseName}/{workID}", "sTN", false, true);
                    actionEpilog(runtime, "2.2.1", "Set .pySemanticURL", sourcePage_5, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.2.2", "Set .pyRouteKey", sourcePage_5, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyRouteKey", pRef_3, myStepPage, "openWorkByHandle", "sTN", false, true);
                    actionEpilog(runtime, "2.2.2", "Set .pyRouteKey", sourcePage_5, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.2.3", "Set .pyPayload", sourcePage_5, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyPayload", pRef_4, myStepPage, "{ \"caseID\": \"{caseClass} {workID}\", \"caseName\": \"{caseName}\",\"caseClassName\": \"{caseClassName}\",\"page\": \"pyDetails\",\"workID\": \"{workID}\"}", "sTN", false, true);
                    actionEpilog(runtime, "2.2.3", "Set .pyPayload", sourcePage_5, myStepPage, runtimeTraceContext);
                } catch (Exception e_6) {
                    runtimeTraceContext.setError(e_6);
                    throw e_6;
                } finally {
                    actionEpilog(runtime, "2.2", "Update Page .pxResults(<APPEND>)", sourcePage_5, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_4);
                    myStepPage = tmp_5;
                }
            } catch (Exception e_4) {
                runtimeTraceContext.setError(e_4);
                throw e_4;
            } finally {
                actionEpilog(runtime, "2", "Update Page . pyURLRoutings(case)", sourcePage_3, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_5);
                myStepPage = tmp_3;
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (!(tools.getParamValue("URLParams").equals("")));
                }
            }, "Param.URLParams != ")) {
                try {
                    actionProlog(runtime, "3", "When Param.URLParams != ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "3.1", "Set Param.URLParams", null, null, runtimeTraceContext);
                        tools.putParamValue("URLParams", PropertyInfo.TYPE_TEXT, ("&" + tools.getParamValue("URLParams")));
                        actionEpilog(runtime, "3.1", "Set Param.URLParams", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_7) {
                    runtimeTraceContext.setError(e_7);
                    throw e_7;
                } finally {
                    actionEpilog(runtime, "3", "When Param.URLParams != ", null, null, runtimeTraceContext);
                }
            }
            ClipboardPage sourcePage_6 = myStepPage;
            ClipboardPage tmp_6 = myStepPage;
            myStepPage = pageQuery_6.resolve(tools, myStepPage);
            PRStackFrame stackFrame_7 = null;
            try {
                stackFrame_7 = pega.pushStackFrame("@baseclass", null, myStepPage, false, false);
                actionProlog(runtime, "4", "Update Page . pyURLRoutings(data)", sourcePage_6, myStepPage, runtimeTraceContext);
                ClipboardPage sourcePage_7 = sourcePage_6;
                ClipboardPage tmp_7 = myStepPage;
                myStepPage = myStepPage.getProperty(".pxResults(<append>)").getPageValue();
                PRStackFrame stackFrame_6 = null;
                try {
                    stackFrame_6 = pega.pushStackFrame("@baseclass", null, myStepPage, false, false);
                    actionProlog(runtime, "4.1", "Update Page .pxResults(<APPEND>)", sourcePage_7, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "4.1.1", "Set .pySemanticURL", sourcePage_7, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pySemanticURL", pRef_2, myStepPage, pega.evaluateWithPage(sourcePage_7, new EvaluateFunction<String>() {

                        public String apply(ClipboardPage myStepPage) {
                            return ("data/{dataTypeName}?dataViewName={dataContext}" + tools.getParamValue("URLParams"));
                        }
                    }), "sTN", false, true);
                    actionEpilog(runtime, "4.1.1", "Set .pySemanticURL", sourcePage_7, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "4.1.2", "Set .pyRouteKey", sourcePage_7, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyRouteKey", pRef_3, myStepPage, "showData", "sTN", false, true);
                    actionEpilog(runtime, "4.1.2", "Set .pyRouteKey", sourcePage_7, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "4.1.3", "Set .pyPayload", sourcePage_7, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyPayload", pRef_4, myStepPage, "{\"pageName\": \"pyDetails\",\"dataViewName\":\"{dataContext}\",\"dataViewKeys\":{dataContextParameters}}", "sTN", false, true);
                    actionEpilog(runtime, "4.1.3", "Set .pyPayload", sourcePage_7, myStepPage, runtimeTraceContext);
                } catch (Exception e_9) {
                    runtimeTraceContext.setError(e_9);
                    throw e_9;
                } finally {
                    actionEpilog(runtime, "4.1", "Update Page .pxResults(<APPEND>)", sourcePage_7, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_6);
                    myStepPage = tmp_7;
                }
            } catch (Exception e_8) {
                runtimeTraceContext.setError(e_8);
                throw e_8;
            } finally {
                actionEpilog(runtime, "4", "Update Page . pyURLRoutings(data)", sourcePage_6, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_7);
                myStepPage = tmp_6;
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
