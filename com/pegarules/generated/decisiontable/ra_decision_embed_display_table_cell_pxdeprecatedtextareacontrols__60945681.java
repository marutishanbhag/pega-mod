package com.pegarules.generated.decisiontable;

import com.pega.platform.coreassemblers.decision.AbstractDecisionTable;
import java.util.List;
import com.pega.pegarules.priv.util.ExceptionDescriptor;
import java.util.Arrays;
import java.util.Collections;
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

public class ra_decision_embed_display_table_cell_pxdeprecatedtextareacontrols__60945681 extends AbstractDecisionTable {

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTABLE EMBED-DISPLAY-TABLE-CELL PXDEPRECATEDTEXTAREACONTROLS #20180713T133610.098 GMT", "Embed-Display-Table-Cell pxDeprecatedTextAreaControls", "Pega-UIDesign", "08-01-01", "20180713T133610.098 GMT");

    public ra_decision_embed_display_table_cell_pxdeprecatedtextareacontrols__60945681(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyFormat").buildScalarValueQuery();
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String var0 = pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) });
        if ((var0.equals("TEXTAREASMALL"))) {
            return "pxTextAreaSmallConverter";
        } else if ((var0.equals("TEXTAREA"))) {
            return "pxTextAreaConverter";
        } else if ((var0.equals("TEXTAREAEXPANDED"))) {
            return "pxTextAreaExpandedConverter";
        } else if ((var0.equals("TEXTAREAEXPANDEDOVERFLOW"))) {
            return "pxTextAreaExpandedOverflowConverter";
        } else if ((var0.equals("TEXTAREAWITHEXPAND"))) {
            return "pxTextAreaWithExpandConverter";
        } else if ((var0.equals("TEXTAREAWITHEXPANDEXPANDED"))) {
            return "pxTextAreaWithExpandExpandedConverter";
        } else if ((var0.equals("TEXTAREAWITHEXPANDSMALL"))) {
            return "pxTextAreaWithExpandSmallConverter";
        } else if ((var0.equals("TEXTAREAINTABLE"))) {
            return "pxTextAreaInTableConverter";
        } else {
            return "";
        }
    }
}
