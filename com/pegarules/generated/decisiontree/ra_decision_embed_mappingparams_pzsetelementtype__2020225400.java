package com.pegarules.generated.decisiontree;

import com.pega.platform.coreassemblers.decision.AbstractDecisionTree;
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

public class ra_decision_embed_mappingparams_pzsetelementtype__2020225400 extends AbstractDecisionTree {

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTREE EMBED-MAPPINGPARAMS PZSETELEMENTTYPE #20190812T172345.075 GMT", "Embed-MappingParams pzSetElementType", "Pega-IntegrationArchitect", "08-04-01", "20190812T172345.075 GMT");

    public ra_decision_embed_mappingparams_pzsetelementtype__2020225400(final Loadtime loadtime) {
        super(ruleTracer);
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String paramInputValue = ((((!StringUtils.isNotBlank(tools.getParamValue("DecisionTreeInput")))) || (tools.getParamValue("DecisionTreeInput").equals("none"))) ? "" : tools.getParamValue("DecisionTreeInput"));
        boolean allowMissingProperty = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "AllowMissingProperties");
        if ((pega.<String>resolveMethodCall("getPropertyValueFormPage--(PublicAPI,String,String)", "getPropertyValueFormPage", null, null, new Object[] { tools, "Parent", "pyActionName" }).equals("APPEND_AND_MAP_TO"))) {
            if (FUAUtil.compareTwoValues(pega.<String>resolveMethodCall("getPropertyValueFormPage--(PublicAPI,String,String)", "getPropertyValueFormPage", null, null, new Object[] { tools, "Parent", "pyAppendAndMapToOptions" }), FUAUtil.C2VOp.EQ, "SCALARS")) {
                return "Scalars";
            }
            if (FUAUtil.compareTwoValues(pega.<String>resolveMethodCall("getPropertyValueFormPage--(PublicAPI,String,String)", "getPropertyValueFormPage", null, null, new Object[] { tools, "Parent", "pyAppendAndMapToOptions" }), FUAUtil.C2VOp.EQ, "ARRAYS")) {
                return "Arrays";
            } else {
                return "Objects";
            }
        }
        return "Objects";
    }
}
