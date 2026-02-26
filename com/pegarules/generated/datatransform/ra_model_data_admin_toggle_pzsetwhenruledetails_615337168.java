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

public class ra_model_data_admin_toggle_pzsetwhenruledetails_615337168 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_10;

    private final ScalarValueQuery scalarValueQuery_9;

    private final ScalarValueQuery scalarValueQuery_6;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_8 = new String[] { "", "", "pyWhenInsName", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyTrimmedWhenRuleName", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyRuleName", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyClassName", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL DATA-ADMIN-TOGGLE PZSETWHENRULEDETAILS #20180713T135510.315 GMT", "Data-Admin-Toggle pzSetWhenRuleDetails", "Pega-Desktop", "08-01-01", "20180713T135510.315 GMT");

    public ra_model_data_admin_toggle_pzsetwhenruledetails_615337168(final Loadtime loadtime) {
        super(ruleTracer, false);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pyIsWhenEnabled").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pxCreateDateTime").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().scalarProperty("pyToggleIdentifier").buildScalarValueQuery();
        scalarValueQuery_6 = queryBuilderFactory.create().scalarProperty("pyToggleType").buildScalarValueQuery();
        scalarValueQuery_9 = queryBuilderFactory.create().scalarProperty("pyRuleName").buildScalarValueQuery();
        scalarValueQuery_10 = queryBuilderFactory.create().scalarProperty("pzInsKey").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
                }
            }, ".pyIsWhenEnabled==true")) {
                try {
                    actionProlog(runtime, "1", "When .pyIsWhenEnabled==true", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.2", "Set .pyClassName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyClassName", pRef_2, myStepPage, "@baseclass", "siN", false, true);
                        actionEpilog(runtime, "1.2", "Set .pyClassName", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.3", "Set Param.toggleTimeStamp", null, null, runtimeTraceContext);
                        tools.putParamValue("toggleTimeStamp", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("whatComesBeforeFirst--(String,char)", "whatComesBeforeFirst", null, null, new Object[] { scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME), '.' }));
                        actionEpilog(runtime, "1.3", "Set Param.toggleTimeStamp", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.4", "Set Param.toggleIdentifierTrimmed", null, null, runtimeTraceContext);
                        tools.putParamValue("toggleIdentifierTrimmed", PropertyInfo.TYPE_TEXT, (((pega.<Integer>resolveMethodCall("length--(String)", "length", null, null, new Object[] { scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).intValue() <= 40) ? scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) : pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, "String", new Object[] { scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), 0, 40 })));
                        actionEpilog(runtime, "1.4", "Set Param.toggleIdentifierTrimmed", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.5", "Set .pyRuleName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyRuleName", pRef_5, myStepPage, ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, "String", new Object[] { scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "PegaRULES" })).booleanValue() ? (("pzToggle_" + tools.getParamValue("toggleIdentifierTrimmed")) + tools.getParamValue("toggleTimeStamp")) : (("Toggle_" + tools.getParamValue("toggleIdentifierTrimmed")) + tools.getParamValue("toggleTimeStamp"))), "sTN", false, true);
                        actionEpilog(runtime, "1.5", "Set .pyRuleName", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.6", "Set .pyTrimmedWhenRuleName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyTrimmedWhenRuleName", pRef_7, myStepPage, ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, "String", new Object[] { scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "PegaRULES" })).booleanValue() ? (("pzToggle_" + tools.getParamValue("toggleIdentifierTrimmed")) + "...") : (("Toggle_" + tools.getParamValue("toggleIdentifierTrimmed")) + "...")), "sTN", false, true);
                        actionEpilog(runtime, "1.6", "Set .pyTrimmedWhenRuleName", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.7", "Set .pyWhenInsName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyWhenInsName", pRef_8, myStepPage, scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                        actionEpilog(runtime, "1.7", "Set .pyWhenInsName", null, null, runtimeTraceContext);
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_10.resolveToString(tools, pega.findDataPage("D_pzToggleWhenInstance", false, "BlockName", scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                            }
                        }, "D_pzToggleWhenInstance[BlockName:.pyRuleName].pzInsKey==")) {
                            try {
                                actionProlog(runtime, "1.8", "When D_pzToggleWhenInstance[BlockName:.pyRuleName].pzInsKey==", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "1.8.1", "Set .pyTrimmedWhenRuleName", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyTrimmedWhenRuleName", pRef_7, myStepPage, "", "sTN", false, true);
                                    actionEpilog(runtime, "1.8.1", "Set .pyTrimmedWhenRuleName", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_2) {
                                runtimeTraceContext.setError(e_2);
                                throw e_2;
                            } finally {
                                actionEpilog(runtime, "1.8", "When D_pzToggleWhenInstance[BlockName:.pyRuleName].pzInsKey==", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "1", "When .pyIsWhenEnabled==true", null, null, runtimeTraceContext);
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
