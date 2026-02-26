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

public class ra_decision__baseclass_pybackgroundcolorsforfeatures__461140892 extends AbstractDecisionTable {

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTABLE @BASECLASS PYBACKGROUNDCOLORSFORFEATURES #20180713T141643.405 GMT", "@baseclass pyBackgroundColorsForFeatures", "Pega-AppDefinition", "08-01-01", "20180713T141643.405 GMT");

    public ra_decision__baseclass_pybackgroundcolorsforfeatures__461140892(final Loadtime loadtime) {
        super(ruleTracer);
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String var0 = tools.getParamValue("Code");
        if ((var0.equals("0"))) {
            return "#767676";
        } else if ((var0.equals("1"))) {
            return "#227bc4";
        } else if ((var0.equals("2"))) {
            return "#227bc4";
        } else if ((var0.equals("3"))) {
            return "#227bc4";
        } else if ((var0.equals("4"))) {
            return "#227bc4";
        } else if ((var0.equals("5"))) {
            return "#227bc4";
        } else if ((var0.equals("6"))) {
            return "#227bc4";
        } else if ((var0.equals("7"))) {
            return "#227bc4";
        } else if ((var0.equals("8"))) {
            return "#227bc4";
        } else {
            return "#c23824";
        }
    }
}
