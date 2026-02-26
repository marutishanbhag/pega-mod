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
import com.pega.platform.clipboard.query.PageQuery;
import com.pega.platform.clipboard.query.QueryBuilderFactory;
import com.pega.platform.clipboard.query.PropertyQuery;

public class ra_model_rule_portalskin_pzupgradeskin_82_chart_1532725099 extends AbstractDataTransform {

    private final PageQuery pageQuery_5;

    private final PropertyQuery propertyQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final PageQuery pageQuery_1;

    private static final String [] pRef_6 = new String[] { "", "", "pyFormatOverriding", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pzSkinVersion", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyAllowUserFormats", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE-PORTALSKIN PZUPGRADESKIN_82_CHART #20181005T195916.767 GMT", "Rule-PortalSkin pzUpgradeSkin_82_Chart", "Pega-UIDesign", "08-02-01", "20181018T184156.852 GMT");

    public ra_model_rule_portalskin_pzupgradeskin_82_chart_1532725099(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        pageQuery_1 = queryBuilderFactory.create().pageList("pyElements", 44).buildPageQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyInheritFromParent").buildScalarValueQuery();
        propertyQuery_4 = queryBuilderFactory.create().pageList("pyFormats", 1).buildPropertyQuery();
        pageQuery_5 = queryBuilderFactory.create().pageList("pyFormats", 1).buildPageQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PropertyUtility propertyUtility = runtime.get(PropertyUtility.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            ClipboardPage sourcePage_1 = myStepPage;
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = pageQuery_1.resolve(tools, myStepPage);
            PRStackFrame stackFrame_2 = null;
            try {
                stackFrame_2 = pega.pushStackFrame("Embed-Skin-Element", null, myStepPage, false, false);
                actionProlog(runtime, "1", "Update Page .pyElements(44)", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.1", "Set .pyAllowUserFormats", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyAllowUserFormats", pRef_2, myStepPage, true, "sSN", false, true);
                actionEpilog(runtime, "1.1", "Set .pyAllowUserFormats", sourcePage_1, myStepPage, runtimeTraceContext);
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return scalarValueQuery_3.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
                    }
                }, ".pyInheritFromParent")) {
                    try {
                        actionProlog(runtime, "1.2", "When .pyInheritFromParent", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            actionProlog(runtime, "1.2.1", "Remove .pyFormats(1)", null, null, runtimeTraceContext);
                            {
                                ClipboardProperty remove_1 = propertyQuery_4.resolve(tools, myStepPage);
                                propertyUtility.removePropertyFromClipboard(remove_1);
                            }
                            actionEpilog(runtime, "1.2.1", "Remove .pyFormats(1)", null, null, runtimeTraceContext);
                        }
                    } catch (Exception e_3) {
                        runtimeTraceContext.setError(e_3);
                        throw e_3;
                    } finally {
                        actionEpilog(runtime, "1.2", "When .pyInheritFromParent", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                } else {
                    try {
                        actionProlog(runtime, "1.3", "Otherwise ", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            ClipboardPage sourcePage_2 = sourcePage_1;
                            ClipboardPage tmp_2 = myStepPage;
                            myStepPage = pageQuery_5.resolve(tools, myStepPage);
                            PRStackFrame stackFrame_1 = null;
                            try {
                                stackFrame_1 = pega.pushStackFrame("Embed-Skin-Component", null, myStepPage, false, false);
                                actionProlog(runtime, "1.3.1", "Update Page .pyFormats(1)", sourcePage_2, myStepPage, runtimeTraceContext);
                                actionProlog(runtime, "1.3.1.1", "Set .pyFormatOverriding", sourcePage_2, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyFormatOverriding", pRef_6, myStepPage, true, "sSN", false, true);
                                actionEpilog(runtime, "1.3.1.1", "Set .pyFormatOverriding", sourcePage_2, myStepPage, runtimeTraceContext);
                            } catch (Exception e_4) {
                                runtimeTraceContext.setError(e_4);
                                throw e_4;
                            } finally {
                                actionEpilog(runtime, "1.3.1", "Update Page .pyFormats(1)", sourcePage_2, myStepPage, runtimeTraceContext);
                                pega.popStackFrameAndReturnStepPage(stackFrame_1);
                                myStepPage = tmp_2;
                            }
                        }
                    } catch (Exception e_5) {
                        runtimeTraceContext.setError(e_5);
                        throw e_5;
                    } finally {
                        actionEpilog(runtime, "1.3", "Otherwise ", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "1", "Update Page .pyElements(44)", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_2);
                myStepPage = tmp_1;
            }
            actionProlog(runtime, "2", "Set .pzSkinVersion", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pzSkinVersion", pRef_7, myStepPage, "74", "sNN", false, true);
            actionEpilog(runtime, "2", "Set .pzSkinVersion", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
