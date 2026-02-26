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

public class ra_decision_pega_landing_appview_pzgetchannelicon__856843498 extends AbstractDecisionTable {

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTABLE PEGA-LANDING-APPVIEW PZGETCHANNELICON #20200511T122717.144 GMT", "Pega-Landing-AppView pzGetChannelIcon", "Pega-ProcessEngine", "08-05-01", "20200511T122717.144 GMT");

    public ra_decision_pega_landing_appview_pzgetchannelicon__856843498(final Loadtime loadtime) {
        super(ruleTracer);
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String var0 = tools.getParamValue("Class");
        String var1 = tools.getParamValue("AppViewDelegateClass");
        if (((var0.equals("Pega-Landing-AppView-Web")) && true)) {
            return "webwb/pzPortalIcon.svg";
        } else if (((var0.equals("Pega-Landing-AppView-Mobile")) && true)) {
            return "webwb/pzMobileIcon.svg";
        } else if (((var0.equals("Pega-Landing-AppView-Email")) && true)) {
            return "webwb/pzEmailIcon.svg";
        } else if (((var0.equals("Pega-Landing-AppView-Mashup")) && true)) {
            return "webwb/pzWebMashupIcon.svg";
        } else if (((var0.equals("Pega-Landing-AppView-MCP")) && (var1.equals("Data-Channel-Configuration-BotAgent")))) {
            return "webwb/pzBotAgentIcon.svg";
        } else if (((var0.equals("Pega-Landing-AppView-MCP")) && (var1.equals("Data-Channel-Configuration-WebChat")))) {
            return "webwb/pzWebChatbotIcon.svg";
        } else if (((var0.equals("Pega-Landing-AppView-MCP")) && (var1.equals("Data-Channel-Configuration-Alexa")))) {
            return "webwb/pzAlexaIcon.svg";
        } else if (((var0.equals("Pega-Landing-AppView-MCP")) && (var1.equals("Data-Channel-Configuration-Facebook")))) {
            return "webwb/pzFacebookIcon.svg";
        } else {
            return "";
        }
    }
}
