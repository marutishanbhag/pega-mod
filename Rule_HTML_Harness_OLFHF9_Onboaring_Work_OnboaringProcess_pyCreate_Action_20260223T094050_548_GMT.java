package com.pegarules.generated.testgen;

/*
 * Copyright (c) 2026 Pegasystems Inc.
 * All rights reserved.
 *
 * This software is governed by a License Agreement that restricts its
 * use.  The software contains valuable trade secrets and proprietary
 * information of Pegasystems Inc and is protected by federal copyright
 * law.  It may not be copied, modified, translated or distributed in any
 * form or medium, disclosed to third parties or used in any manner not
 * expressly provided for in said License Agreement except with written
 * authorization from Pegasystems Inc.
*/
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.AssemblyParameters;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
import com.pega.pegarules.pub.infengine.*;
import com.pega.pegarules.pub.presence.*;
import com.pega.pegarules.pub.runtime.*;
import com.pega.pegarules.pub.services.*;
import com.pega.pegarules.pub.util.*;
import com.pega.platform.clipboard.query.PageListQuery;
import com.pega.platform.clipboard.query.PageQuery;
import com.pega.platform.clipboard.query.PropertyQuery;
import com.pega.platform.clipboard.query.ScalarListQuery;
import com.pega.platform.clipboard.query.ScalarValueQuery;
import com.pega.platform.executionengine.runtime.Loadtime;
import java.net.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.simple.*;
import org.json.simple.parser.*;
public class Rule_HTML_Harness_OLFHF9_Onboaring_Work_OnboaringProcess_pyCreate_Action_20260223T094050_548_GMT  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Harness.pyCreate.OLFHF9_Onboaring_Work_OnboaringProcess.Action");
	public Rule_HTML_Harness_OLFHF9_Onboaring_Work_OnboaringProcess_pyCreate_Action_20260223T094050_548_GMT(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}

public void perform() {
	ClipboardPage myStepPage = tools.getStepPage();
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:DOFUASSEMBLY", 
	"Rule-Utility-Function:DXAPIFUA!PZHARNESSDXAPIMETHODHEADER", 
	"Rule-Utility-Function:DXAPIFUA!PZHARNESSDXAPIMETHODABSENT", 
	"Rule-Utility-Function:DXAPIFUA!PZHARNESSDXAPIMETHODACCESS", 
	"Rule-Utility-Function:DXAPIFUA!PZHARNESSDXAPIMETHODFINISH", 
	"Rule-Utility-Function:DXAPIFUA!PZHARNESSDXAPIMETHODCALL", 
	"Rule-Utility-Function:DXAPIFUA!PZHARNESSDXAPIMETHODBODY"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","",true,"Rule-HTML-Harness","","","","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("DXAPIFUA!PZHARNESSDXAPIMETHODHEADER","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-23-01","RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODHEADER--(PUBLICAPI,CLIPBOARDPAGE) #20230618T003029.845 GMT","DXAPIFUA!PZHARNESSDXAPIMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DXAPIFUA!PZHARNESSDXAPIMETHODABSENT","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-08-01","RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODABSENT--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.015 GMT","DXAPIFUA!PZHARNESSDXAPIMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DXAPIFUA!PZHARNESSDXAPIMETHODACCESS","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-08-01","RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODACCESS--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.021 GMT","DXAPIFUA!PZHARNESSDXAPIMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DXAPIFUA!PZHARNESSDXAPIMETHODFINISH","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-08-01","RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODFINISH--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.043 GMT","DXAPIFUA!PZHARNESSDXAPIMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DXAPIFUA!PZHARNESSDXAPIMETHODCALL","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-08-01","RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODCALL--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.036 GMT","DXAPIFUA!PZHARNESSDXAPIMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DXAPIFUA!PZHARNESSDXAPIMETHODBODY","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-23-01","RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODBODY--(PUBLICAPI,CLIPBOARDPAGE) #20230618T003029.833 GMT","DXAPIFUA!PZHARNESSDXAPIMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1)
	};

	 /**
	 * This method returns the set of dependent rules required to build
	 * the generated code and (possibly) whole classes that the rules assembler declared.
	 * @return array of <code>DependentRuleInfo</code> objects.
	 */
	public DependentRuleInfo[] getDependentRuleInfos() {
		return oDependentRuleInfos;
	}


//	Rules used in this assembly (order and duplicates ARE significant to hash code) :
//	RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODABSENT--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.015 GMT:20220209T125423.015 GMT
//	RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODACCESS--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.021 GMT:20220209T125423.021 GMT
//	RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODBODY--(PUBLICAPI,CLIPBOARDPAGE) #20230618T003029.833 GMT:20230618T003029.833 GMT
//	RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODCALL--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.036 GMT:20220209T125423.036 GMT
//	RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODFINISH--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.043 GMT:20220209T125423.043 GMT
//	RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODHEADER--(PUBLICAPI,CLIPBOARDPAGE) #20230618T003029.845 GMT:20230703T185217.498 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODBODY--(PUBLICAPI,CLIPBOARDPAGE) #20230618T003029.833 GMT:20230618T003029.833 GMT
//	RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODFINISH--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.043 GMT:20220209T125423.043 GMT
//	RULE-UTILITY-FUNCTION DXAPIFUA PZHARNESSDXAPIMETHODHEADER--(PUBLICAPI,CLIPBOARDPAGE) #20230618T003029.845 GMT:20230703T185217.498 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "54ebc0594c98999a1a6489576993b40f";
	}

	public String getDefinitionAppliesToClass() {
		return "OLFHF9-Onboaring-Work-OnboaringProcess";
	}
public String getAspect() {
return "Action";
}
public static Map<String, AssemblyParameters>getAssemblyParametersMap
(StreamBuilderToolKit tools) {Map<String, AssemblyParameters> clone = new HashMap<String, AssemblyParameters>();
	return clone;
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("", "OLFHF9-Onboaring-Work-OnboaringProcess pyCreate", "OnboaringProcess", "01-01-01", "20210114T162756.092 GMT");
}
