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

public class ra_model_embed_display_table_cell_pzgetgridheaderlabel_1478676877 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_7;

    private final ScalarValueQuery scalarValueQuery_6;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_5 = new String[] { "", "", "pyModes", "2", "pyLabel", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-DISPLAY-TABLE-CELL PZGETGRIDHEADERLABEL #20180831T145424.845 GMT", "Embed-Display-Table-Cell pzGetGridHeaderLabel", "Pega-UIDesign", "08-02-01", "20181115T045941.166 GMT");

    public ra_model_embed_display_table_cell_pzgetgridheaderlabel_1478676877(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pyControlDisplayTitle").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().pageList("pyModes", 2).scalarProperty("pyNavigation").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyValue").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().pageList("pyModes", 2).scalarProperty("pyLabel").buildScalarValueQuery();
        scalarValueQuery_6 = queryBuilderFactory.create().pageList("pyModes", 1).scalarProperty("pyCheckboxCaption").buildScalarValueQuery();
        scalarValueQuery_7 = queryBuilderFactory.create().pageList("pyModes", 2).scalarProperty("pyTooltip").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Icon"));
                }
            }, ".pyControlDisplayTitle==Icon")) {
                try {
                    actionProlog(runtime, "1", "When .pyControlDisplayTitle==Icon", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set Param.labelPath", null, null, runtimeTraceContext);
                        tools.putParamValue("labelPath", PropertyInfo.TYPE_TEXT, scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
                        actionEpilog(runtime, "1.1", "Set Param.labelPath", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_7) {
                    runtimeTraceContext.setError(e_7);
                    throw e_7;
                } finally {
                    actionEpilog(runtime, "1", "When .pyControlDisplayTitle==Icon", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Checkbox"));
                }
            }, ".pyControlDisplayTitle==Checkbox")) {
                try {
                    actionProlog(runtime, "2", "Otherwise When .pyControlDisplayTitle==Checkbox", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "2.1", "Set Param.labelPath", null, null, runtimeTraceContext);
                        tools.putParamValue("labelPath", PropertyInfo.TYPE_TEXT, scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
                        actionEpilog(runtime, "2.1", "Set Param.labelPath", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_6) {
                    runtimeTraceContext.setError(e_6);
                    throw e_6;
                } finally {
                    actionEpilog(runtime, "2", "Otherwise When .pyControlDisplayTitle==Checkbox", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (((scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Button")) || (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Link"))) || (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Attach content")));
                }
            }, ".pyControlDisplayTitle==Button||.pyControlDisplayTitle==Link ||.pyControlDisplayTitle==Attach content")) {
                try {
                    actionProlog(runtime, "3", "Otherwise When .pyControlDisplayTitle==Button||.pyControlDisplayTitle==Link ||.pyControlDisplayTitle==Attach content", null, null, runtimeTraceContext);
                    {
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, null, new Object[] { scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
                            }
                        }, "@pxIsBlank(.pyModes(2).pyLabel)")) {
                            try {
                                actionProlog(runtime, "3.1", "When @pxIsBlank(.pyModes(2).pyLabel)", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "3.1.1", "Set .pyModes(2).pyLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyModes(2).pyLabel", pRef_5, myStepPage, scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
                                    actionEpilog(runtime, "3.1.1", "Set .pyModes(2).pyLabel", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_4) {
                                runtimeTraceContext.setError(e_4);
                                throw e_4;
                            } finally {
                                actionEpilog(runtime, "3.1", "When @pxIsBlank(.pyModes(2).pyLabel)", null, null, runtimeTraceContext);
                            }
                        }
                        actionProlog(runtime, "3.2", "Set Param.labelPath", null, null, runtimeTraceContext);
                        tools.putParamValue("labelPath", PropertyInfo.TYPE_TEXT, scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
                        actionEpilog(runtime, "3.2", "Set Param.labelPath", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_5) {
                    runtimeTraceContext.setError(e_5);
                    throw e_5;
                } finally {
                    actionEpilog(runtime, "3", "Otherwise When .pyControlDisplayTitle==Button||.pyControlDisplayTitle==Link ||.pyControlDisplayTitle==Attach content", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Menu"));
                }
            }, ".pyControlDisplayTitle==Menu")) {
                try {
                    actionProlog(runtime, "4", "Otherwise When .pyControlDisplayTitle==Menu", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "4.1", "Set Param.labelPath", null, null, runtimeTraceContext);
                        tools.putParamValue("labelPath", PropertyInfo.TYPE_TEXT, scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
                        actionEpilog(runtime, "4.1", "Set Param.labelPath", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "4", "Otherwise When .pyControlDisplayTitle==Menu", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "5", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "5.1", "Set Param.labelPath", null, null, runtimeTraceContext);
                        tools.putParamValue("labelPath", PropertyInfo.TYPE_TEXT, scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
                        actionEpilog(runtime, "5.1", "Set Param.labelPath", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "5", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
