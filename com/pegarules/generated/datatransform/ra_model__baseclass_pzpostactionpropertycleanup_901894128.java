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
import com.pega.platform.clipboard.query.QueryBuilderFactory;
import com.pega.platform.clipboard.query.PropertyQuery;

public class ra_model__baseclass_pzpostactionpropertycleanup_901894128 extends AbstractDataTransform {

    private final PropertyQuery propertyQuery_21;

    private final PropertyQuery propertyQuery_20;

    private final PropertyQuery propertyQuery_19;

    private final PropertyQuery propertyQuery_18;

    private final PropertyQuery propertyQuery_17;

    private final PropertyQuery propertyQuery_16;

    private final PropertyQuery propertyQuery_15;

    private final PropertyQuery propertyQuery_14;

    private final PropertyQuery propertyQuery_13;

    private final PropertyQuery propertyQuery_12;

    private final PropertyQuery propertyQuery_11;

    private final PropertyQuery propertyQuery_10;

    private final PropertyQuery propertyQuery_9;

    private final PropertyQuery propertyQuery_8;

    private final PropertyQuery propertyQuery_7;

    private final PropertyQuery propertyQuery_6;

    private final PropertyQuery propertyQuery_5;

    private final PropertyQuery propertyQuery_4;

    private final PropertyQuery propertyQuery_3;

    private final PropertyQuery propertyQuery_2;

    private final PropertyQuery propertyQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL @BASECLASS PZPOSTACTIONPROPERTYCLEANUP #20180713T142037.593 GMT", "@baseclass pzPostActionPropertyCleanup", "Pega-AppDefinition", "08-01-01", "20180713T142037.593 GMT");

    public ra_model__baseclass_pzpostactionpropertycleanup_901894128(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        propertyQuery_1 = queryBuilderFactory.create().scalarProperty("pyApplicationInsName").buildPropertyQuery();
        propertyQuery_2 = queryBuilderFactory.create().scalarProperty("pyAppliesToChangedBySystem").buildPropertyQuery();
        propertyQuery_3 = queryBuilderFactory.create().scalarProperty("pyEditedName").buildPropertyQuery();
        propertyQuery_4 = queryBuilderFactory.create().scalarProperty("pyFocusKey").buildPropertyQuery();
        propertyQuery_5 = queryBuilderFactory.create().scalarProperty("pyFocusKeyRemoveSpaces").buildPropertyQuery();
        propertyQuery_6 = queryBuilderFactory.create().scalarProperty("pyHasAccessToPegaRULES").buildPropertyQuery();
        propertyQuery_7 = queryBuilderFactory.create().scalarProperty("pyHasKeyClassName").buildPropertyQuery();
        propertyQuery_8 = queryBuilderFactory.create().scalarProperty("pyHasKeyFocusKey").buildPropertyQuery();
        propertyQuery_9 = queryBuilderFactory.create().scalarProperty("pyLastClassName").buildPropertyQuery();
        propertyQuery_10 = queryBuilderFactory.create().scalarProperty("pyOriginalFocusKeyValue").buildPropertyQuery();
        propertyQuery_11 = queryBuilderFactory.create().scalarProperty("pyOriginalLabel").buildPropertyQuery();
        propertyQuery_12 = queryBuilderFactory.create().scalarProperty("pyRAOriginalRuleSet").buildPropertyQuery();
        propertyQuery_13 = queryBuilderFactory.create().scalarProperty("pyRAOriginalRuleSetVersion").buildPropertyQuery();
        propertyQuery_14 = queryBuilderFactory.create().scalarProperty("pyRAOriginalClassName").buildPropertyQuery();
        propertyQuery_15 = queryBuilderFactory.create().scalarProperty("pyRASpecializeBy").buildPropertyQuery();
        propertyQuery_16 = queryBuilderFactory.create().scalarProperty("pyRefToFocusKey").buildPropertyQuery();
        propertyQuery_17 = queryBuilderFactory.create().scalarProperty("pyRefToFocusKeyLabel").buildPropertyQuery();
        propertyQuery_18 = queryBuilderFactory.create().scalarProperty("pySelectedApplicationName").buildPropertyQuery();
        propertyQuery_19 = queryBuilderFactory.create().scalarProperty("pySelectedApplicationVersion").buildPropertyQuery();
        propertyQuery_20 = queryBuilderFactory.create().scalarProperty("pySelectedBranchIdentifier").buildPropertyQuery();
        propertyQuery_21 = queryBuilderFactory.create().scalarProperty("pzQuickConfigure").buildPropertyQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PropertyUtility propertyUtility = runtime.get(PropertyUtility.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Remove .pyApplicationInsName", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_1 = propertyQuery_1.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_1);
            }
            actionEpilog(runtime, "1", "Remove .pyApplicationInsName", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Remove .pyAppliesToChangedBySystem", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_2 = propertyQuery_2.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_2);
            }
            actionEpilog(runtime, "2", "Remove .pyAppliesToChangedBySystem", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Remove .pyEditedName", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_3 = propertyQuery_3.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_3);
            }
            actionEpilog(runtime, "3", "Remove .pyEditedName", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Remove .pyFocusKey", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_4 = propertyQuery_4.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_4);
            }
            actionEpilog(runtime, "4", "Remove .pyFocusKey", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Remove .pyFocusKeyRemoveSpaces", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_5 = propertyQuery_5.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_5);
            }
            actionEpilog(runtime, "5", "Remove .pyFocusKeyRemoveSpaces", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Remove .pyHasAccessToPegaRULES", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_6 = propertyQuery_6.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_6);
            }
            actionEpilog(runtime, "6", "Remove .pyHasAccessToPegaRULES", null, null, runtimeTraceContext);
            actionProlog(runtime, "7", "Remove .pyHasKeyClassName", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_7 = propertyQuery_7.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_7);
            }
            actionEpilog(runtime, "7", "Remove .pyHasKeyClassName", null, null, runtimeTraceContext);
            actionProlog(runtime, "8", "Remove .pyHasKeyFocusKey", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_8 = propertyQuery_8.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_8);
            }
            actionEpilog(runtime, "8", "Remove .pyHasKeyFocusKey", null, null, runtimeTraceContext);
            actionProlog(runtime, "9", "Remove .pyLastClassName", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_9 = propertyQuery_9.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_9);
            }
            actionEpilog(runtime, "9", "Remove .pyLastClassName", null, null, runtimeTraceContext);
            actionProlog(runtime, "10", "Remove .pyOriginalFocusKeyValue", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_10 = propertyQuery_10.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_10);
            }
            actionEpilog(runtime, "10", "Remove .pyOriginalFocusKeyValue", null, null, runtimeTraceContext);
            actionProlog(runtime, "11", "Remove .pyOriginalLabel", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_11 = propertyQuery_11.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_11);
            }
            actionEpilog(runtime, "11", "Remove .pyOriginalLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "12", "Remove .pyRAOriginalRuleSet", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_12 = propertyQuery_12.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_12);
            }
            actionEpilog(runtime, "12", "Remove .pyRAOriginalRuleSet", null, null, runtimeTraceContext);
            actionProlog(runtime, "13", "Remove .pyRAOriginalRuleSetVersion", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_13 = propertyQuery_13.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_13);
            }
            actionEpilog(runtime, "13", "Remove .pyRAOriginalRuleSetVersion", null, null, runtimeTraceContext);
            actionProlog(runtime, "14", "Remove .pyRAOriginalClassName", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_14 = propertyQuery_14.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_14);
            }
            actionEpilog(runtime, "14", "Remove .pyRAOriginalClassName", null, null, runtimeTraceContext);
            actionProlog(runtime, "15", "Remove .pyRASpecializeBy", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_15 = propertyQuery_15.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_15);
            }
            actionEpilog(runtime, "15", "Remove .pyRASpecializeBy", null, null, runtimeTraceContext);
            actionProlog(runtime, "16", "Remove .pyRefToFocusKey", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_16 = propertyQuery_16.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_16);
            }
            actionEpilog(runtime, "16", "Remove .pyRefToFocusKey", null, null, runtimeTraceContext);
            actionProlog(runtime, "17", "Remove .pyRefToFocusKeyLabel", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_17 = propertyQuery_17.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_17);
            }
            actionEpilog(runtime, "17", "Remove .pyRefToFocusKeyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "18", "Remove .pySelectedApplicationName", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_18 = propertyQuery_18.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_18);
            }
            actionEpilog(runtime, "18", "Remove .pySelectedApplicationName", null, null, runtimeTraceContext);
            actionProlog(runtime, "19", "Remove .pySelectedApplicationVersion", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_19 = propertyQuery_19.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_19);
            }
            actionEpilog(runtime, "19", "Remove .pySelectedApplicationVersion", null, null, runtimeTraceContext);
            actionProlog(runtime, "20", "Remove .pySelectedBranchIdentifier", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_20 = propertyQuery_20.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_20);
            }
            actionEpilog(runtime, "20", "Remove .pySelectedBranchIdentifier", null, null, runtimeTraceContext);
            actionProlog(runtime, "21", "Remove .pzQuickConfigure", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_21 = propertyQuery_21.resolve(tools, myStepPage);
                propertyUtility.removePropertyFromClipboard(remove_21);
            }
            actionEpilog(runtime, "21", "Remove .pzQuickConfigure", null, null, runtimeTraceContext);
            actionProlog(runtime, "23", "Remove .pyKeyPrompts", null, null, runtimeTraceContext);
            {
                ClipboardProperty remove_22 = myStepPage.getProperty("pyKeyPrompts");
                propertyUtility.removePropertyFromClipboard(remove_22);
            }
            actionEpilog(runtime, "23", "Remove .pyKeyPrompts", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
