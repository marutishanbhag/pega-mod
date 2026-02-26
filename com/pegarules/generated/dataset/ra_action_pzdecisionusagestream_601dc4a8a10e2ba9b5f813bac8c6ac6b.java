package com.pegarules.generated.dataset;
/*
 * Copyright (c) 2024 Pegasystems Inc.
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
import com.pega.dsm.dnode.api.dataset.DataSet;
import com.pega.dsm.dnode.api.dataset.operation.Operation;
import com.pega.dsm.dnode.api.stream.DataObservable;
import com.pega.dsm.dnode.api.stream.DataSubscriber;
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
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
import com.pegarules.generated.*;
import java.util.*;
public class ra_action_pzdecisionusagestream_601dc4a8a10e2ba9b5f813bac8c6ac6b  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Decision_DataSet.pzDecisionUsageStream.Data_Decision_Usage.Action");
	public ra_action_pzdecisionusagestream_601dc4a8a10e2ba9b5f813bac8c6ac6b(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-DECISION-DATASET DATA-DECISION-USAGE PZDECISIONUSAGESTREAM #20230618T003547.711 GMT	Pega-DecisionEngine:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
}
static com.pega.dsm.dnode.api.dataset.DataSet static_dataSet = null;
java.lang.String GET_DATA_SET_OPERATION = "GetDataSet";

	public DataSet createDataSetInstance( ) {
		DataSet dataSet = null;
  dataSet = new com.pega.dsm.dnode.api.dataset.stream.StreamDataSetFactory().createFromKey("RULE-DECISION-DATASET DATA-DECISION-USAGE PZDECISIONUSAGESTREAM #20230618T003547.711 GMT", tools);
return dataSet;
	}

	public void perform( ) {
		String operationName = (String) tools.getParameterPage().get("OPERATION");
		final ClipboardPage operationParameters = (ClipboardPage) tools.getParameterPage().get("OPERATION_PARAMS");
		if (operationParameters != null) {
			operationName = operationParameters.getString("pyOperationID");
		}
		if (StringUtils.isBlank(operationName)) {
			throw new PRRuntimeException("Operation parameter must be provided");
		}
		if (static_dataSet == null) {
			static_dataSet = createDataSetInstance();
		}
		if (GET_DATA_SET_OPERATION.equals(operationName)) {
			tools.getParameterPage().put("DATA_SET", static_dataSet);
			return;
		}
    // Perform operation passed in parameter page with keys:
    // "OPERATION"
    // "OPERATION_PARAMS"
		com.pega.pegarules.exec.internal.rules.methods.PerformOperation.perform(tools, static_dataSet, oLog);
	}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:DOFUASSEMBLY", 
	"Rule-Utility-Function:DATASETFUA!PZDATASETMETHODACCESS", 
	"Rule-Utility-Function:DATASETTEMPLATE!PERFORM", 
	"Rule-Utility-Function:DATASETFUA!PZDATASETMETHODHEADER", 
	"Rule-Utility-Function:DATASETTEMPLATE!CREATEDATASETINSTANCE", 
	"Rule-Utility-Function:DATASETFUA!PZDATASETMETHODABSENT", 
	"Rule-Utility-Function:DATASETFUA!PZDATASETMETHODBODY", 
	"Rule-Utility-Function:DATASETFUA!PZDATASETMETHODCALL", 
	"Rule-Utility-Function:DATASETFUA!PZDATASETMETHODFINISH", 
	"Rule-Decision-DataSet:PZDECISIONUSAGESTREAM"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-DECISION-DATASET",true,"Rule-Decision-DataSet","Pega-DecisionEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-DECISION-DATASET DOFUASSEMBLY #20180713T140241.429 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",-1452591993), 
		new DependentRuleInfo("DATASETFUA!PZDATASETMETHODACCESS","Rule-Utility-Function","",false,"","Pega-DecisionEngine","08-01-01","RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODACCESS #20180713T140311.662 GMT","DATASETFUA!PZDATASETMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DATASETTEMPLATE!PERFORM","Rule-Utility-Function","",false,"","Pega-DecisionEngine","08-23-01","RULE-UTILITY-FUNCTION DATASETTEMPLATE PERFORM #20230618T003606.118 GMT","DATASETTEMPLATE!PERFORM",true,false,"ABSOLUTE_CLASSLESS",1617606891), 
		new DependentRuleInfo("DATASETFUA!PZDATASETMETHODHEADER","Rule-Utility-Function","",false,"","Pega-DecisionEngine","08-01-01","RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODHEADER #20180713T140311.680 GMT","DATASETFUA!PZDATASETMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DATASETTEMPLATE!CREATEDATASETINSTANCE","Rule-Utility-Function","",false,"","Pega-DecisionEngine","08-01-01","RULE-UTILITY-FUNCTION DATASETTEMPLATE CREATEDATASETINSTANCE #20180713T140311.687 GMT","DATASETTEMPLATE!CREATEDATASETINSTANCE",true,false,"ABSOLUTE_CLASSLESS",1526874120), 
		new DependentRuleInfo("DATASETFUA!PZDATASETMETHODABSENT","Rule-Utility-Function","",false,"","Pega-DecisionEngine","08-01-01","RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODABSENT #20180713T140311.658 GMT","DATASETFUA!PZDATASETMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DATASETFUA!PZDATASETMETHODBODY","Rule-Utility-Function","",false,"","Pega-DecisionEngine","08-01-01","RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODBODY #20180713T140311.666 GMT","DATASETFUA!PZDATASETMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DATASETFUA!PZDATASETMETHODCALL","Rule-Utility-Function","",false,"","Pega-DecisionEngine","08-01-01","RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODCALL #20180713T140311.672 GMT","DATASETFUA!PZDATASETMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DATASETFUA!PZDATASETMETHODFINISH","Rule-Utility-Function","",false,"","Pega-DecisionEngine","08-01-01","RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODFINISH #20180713T140311.676 GMT","DATASETFUA!PZDATASETMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZDECISIONUSAGESTREAM","Rule-Decision-DataSet","DATA-DECISION-USAGE",false,"","Pega-DecisionEngine","08-23-01","RULE-DECISION-DATASET DATA-DECISION-USAGE PZDECISIONUSAGESTREAM #20230618T003547.711 GMT","!PZDECISIONUSAGESTREAM",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1012304464)
	};

	 /**
	 * This method returns the set of dependent rules required to build
	 * the generated code and (possibly) whole classes that the rules assembler declared.
	 * @return array of <code>DependentRuleInfo</code> objects.
	 */
	public DependentRuleInfo[] getDependentRuleInfos() {
		return oDependentRuleInfos;
	}

public static final DependentRuleInfo[] oTrackedDependencies = new DependentRuleInfo[]{oDependentRuleInfos[0]};

//	Rules used in this assembly (order and duplicates ARE significant to hash code) :
//	RULE-OBJ-ACTIVITY RULE-DECISION-DATASET DOFUASSEMBLY #20180713T140241.429 GMT:crc:-1452591993
//	RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODABSENT #20180713T140311.658 GMT:20180713T140311.658 GMT
//	RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODACCESS #20180713T140311.662 GMT:20180713T140311.662 GMT
//	RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODBODY #20180713T140311.666 GMT:20180713T140311.666 GMT
//	RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODCALL #20180713T140311.672 GMT:20180713T140311.672 GMT
//	RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODFINISH #20180713T140311.676 GMT:20180713T140311.676 GMT
//	RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODHEADER #20180713T140311.680 GMT:20180713T140311.680 GMT
//	RULE-DECISION-DATASET DATA-DECISION-USAGE PZDECISIONUSAGESTREAM #20230618T003547.711 GMT:20230618T003547.711 GMT
//	RULE-UTILITY-FUNCTION DATASETTEMPLATE CREATEDATASETINSTANCE #20180713T140311.687 GMT:20180713T140311.687 GMT
//	RULE-UTILITY-FUNCTION DATASETTEMPLATE PERFORM #20230618T003606.118 GMT:20230618T003606.118 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODBODY #20180713T140311.666 GMT:20180713T140311.666 GMT
//	RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODFINISH #20180713T140311.676 GMT:20180713T140311.676 GMT
//	RULE-UTILITY-FUNCTION DATASETFUA PZDATASETMETHODHEADER #20180713T140311.680 GMT:20180713T140311.680 GMT
//	RULE-UTILITY-FUNCTION DSMFUAUTILS GENERATEFROMTEMPLATE #20180713T140313.206 GMT:20180713T140313.206 GMT
//	RULE-UTILITY-FUNCTION DSMFUAUTILS GENERATETEMPLATEFUNCTION #20190211T070730.011 GMT:20190211T070730.011 GMT
//	RULE-UTILITY-FUNCTION DSMFUAUTILS REPLACEVARIABLES #20180713T140313.234 GMT:20180713T140313.234 GMT
//	RULE-UTILITY-FUNCTION DSMFUAUTILS TRANSFORMPARAMETERS #20180713T140313.238 GMT:20180713T140313.238 GMT
//	RULE-UTILITY-FUNCTION DSMFUAUTILS TRANSFORMTEMPLATE #20201103T143139.590 GMT:20201103T143139.590 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "41b454b0d3257e770471ed71691afd9f";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Decision-Usage";
	}
public String getAspect() {
return "Action";
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-DECISION-DATASET DATA-DECISION-USAGE PZDECISIONUSAGESTREAM #20230618T003547.711 GMT", "Data-Decision-Usage pzDecisionUsageStream", "Pega-DecisionEngine", "08-23-01", "20230618T003547.711 GMT");
}
