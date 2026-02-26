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

public class ra_model__baseclass_pzmapgroupmembersdata__1812792372 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_6;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_5 = new String[] { "", "", "pyOwnerID", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyOwnerName", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyMemberCount", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL @BASECLASS PZMAPGROUPMEMBERSDATA #20180713T134541.554 GMT", "@baseclass pzMapGroupMembersData", "Pega-Social", "08-01-01", "20180713T134541.554 GMT");

    public ra_model__baseclass_pzmapgroupmembersdata__1812792372(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().pageGroup("pxPages", "MC").scalarList("pySummaryCount", 1).buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().pageGroup("pxPages", "OP").scalarProperty("pyUserName").buildScalarValueQuery();
        scalarValueQuery_6 = queryBuilderFactory.create().pageGroup("pxPages", "OP").scalarProperty("pyUserIdentifier").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            ClipboardPage tmp_1 = myStepPage;
            PageIterator iter_1 = runtime.createIterator(tools.getPrimaryPage().getProperty("pxResults"));
            try {
                int currentLoopOffset_1 = 0;
                actionProlog(runtime, "1", "For Each Page In Primary.pxResults", null, iter_1.getSource(), runtimeTraceContext);
                while (iter_1.hasNext()) {
                    currentLoopOffset_1++;
                    pega.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset_1));
                    ClipboardPage currentExp_1 = iter_1.next();
                    {
                        ClipboardPage sourcePage_1 = currentExp_1;
                        ClipboardPage tmp_2 = myStepPage;
                        myStepPage = currentExp_1;
                        PRStackFrame stackFrame_1 = null;
                        try {
                            stackFrame_1 = pega.pushStackFrame("PegaSocial-Group", null, myStepPage, false, false);
                            actionProlog(runtime, "1.1", "Set .pyMemberCount", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyMemberCount", pRef_1, myStepPage, (int) pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<Integer>() {

                                public Integer apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_2.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER);
                                }
                            }), "sNN", false, true);
                            actionEpilog(runtime, "1.1", "Set .pyMemberCount", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "1.2", "Set .pyOwnerName", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyOwnerName", pRef_3, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                                }
                            }), "sTN", false, true);
                            actionEpilog(runtime, "1.2", "Set .pyOwnerName", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "1.3", "Set .pyOwnerID", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyOwnerID", pRef_5, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                                }
                            }), "sTN", false, true);
                            actionEpilog(runtime, "1.3", "Set .pyOwnerID", sourcePage_1, myStepPage, runtimeTraceContext);
                        } catch (Exception e_3) {
                            runtimeTraceContext.setError(e_3);
                            throw e_3;
                        } finally {
                            pega.popStackFrameAndReturnStepPage(stackFrame_1);
                            myStepPage = tmp_2;
                        }
                    }
                }
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "1", "For Each Page In Primary.pxResults", null, iter_1.getSource(), runtimeTraceContext);
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
