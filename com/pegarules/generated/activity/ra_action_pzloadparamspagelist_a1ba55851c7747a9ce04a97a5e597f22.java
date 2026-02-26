package com.pegarules.generated.activity;
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
import Pega.*;
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.*;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class ra_action_pzloadparamspagelist_a1ba55851c7747a9ce04a97a5e597f22 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzLoadParamsPageList.Code_Pega_List.Action");
	public ra_action_pzloadparamspagelist_a1ba55851c7747a9ce04a97a5e597f22(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADPARAMSPAGELIST #20180713T135334.368 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADPARAMSPAGELIST #20180713T135334.368 GMT";
pz_CurrentCircumstance = "0";
pz_CurrentTraceInfo = oTraceInfo_0;
if (pega.activityProlog(snapshotLocalVariables(), pz_CurrentTraceInfo)) {
ClipboardProperty pageRef = null;
ClipboardProperty nextPage = null;
java.util.Iterator myPageList = null;
ClipboardPage thisStepPage = null;
pz_Dictionary = tools.getThread().getDictionary();

// Code to call step 1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_circum0");
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADPARAMSPAGELIST #20180713T135334.368 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} 
} catch (ActivityTerminateException ate) {
throw ate; // Terminate all activity processing
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (PRRuntimeException prre) {
if (!pz_methodStatusUpdated) {pega.setThreadPropertyValue(".pxMethodStatus", prre.toString());}
pega.activityStepExceptionHandler(prre, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw prre;
} catch (RuntimeException re) {
pega.setThreadPropertyValue(".pxMethodStatus", re.toString());
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pega.activityEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo);}
}
} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

	public boolean isAllowedInWeb() {
	 return isAllowedInWeb;
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:PZLOADPARAMSPAGELIST"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZLOADPARAMSPAGELIST","Rule-Obj-Activity","CODE-PEGA-LIST",false,"","Pega-Desktop","08-01-01","RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADPARAMSPAGELIST #20180713T135334.368 GMT","!PZLOADPARAMSPAGELIST",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1192699684)
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
//	RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADPARAMSPAGELIST #20180713T135334.368 GMT:20180713T135334.368 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "8e983ae2dad9fef89b1bd1fcb7881b4f";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
	}
public String getAspect() {
return "Action";
}
/**
 * Convert xmlSignature to PageList.
 * <p>
 * Step 1 <code>Java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.xmlSignature==\"\"");
try {
boolean pz_1 = (tools.getParamValue("xmlSignature").equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.xmlSignature==\"\"",pz_1);
if (pz_1) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzLoadParamsPageList - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.xmlSignature==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
class DomUtilities{
	org.w3c.dom.Document methodXML = null;
	org.w3c.dom.ls.LSSerializer serializer = null;
	org.w3c.dom.Element documentNode = null;
	
	//Init dom structure from XML and make a serializer
	DomUtilities(String xml){		
		try {
			javax.xml.parsers.DocumentBuilder builder = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder();
			methodXML = builder.parse(new org.xml.sax.InputSource(new java.io.StringReader(xml)));
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
			
		org.w3c.dom.ls.DOMImplementationLS domImplLS = (org.w3c.dom.ls.DOMImplementationLS)methodXML.getImplementation();
		serializer = domImplLS.createLSSerializer();
		serializer.getDomConfig().setParameter("xml-declaration", Boolean.FALSE);
		documentNode = methodXML.getDocumentElement();
	}
	
	//Takes a node and a tag name
	//Searches direct children of parentNode for a node with the tag nodeName
	//Returns the node if found, null otherwise
	org.w3c.dom.Node findNode(org.w3c.dom.Node parentNode,String nodeName){
		if(parentNode == null)
			parentNode = documentNode;
			
		org.w3c.dom.NodeList childNodes = parentNode.getChildNodes();
		for(int i=0;i<childNodes.getLength();i++){
			org.w3c.dom.Node currChild = childNodes.item(i);
			if(currChild.getNodeName().equals(nodeName))
				return currChild;
		}
		return null;
	}
	
	//Returns the array of direct children for parentNode
	org.w3c.dom.NodeList getChildNodes(org.w3c.dom.Node parentNode){
		if(parentNode == null)
			parentNode = documentNode;
		return parentNode.getChildNodes();
	}
	
	//Serializes node and returns the string
	String serializeNode(org.w3c.dom.Node node){
		if(node == null)
			node = documentNode;
		return serializer.writeToString(node);
	}
	
	//Takes in a node, the name of an attribute to look for, and a flag to specify whether null should be returned if not found, otherwise "" is returned
	//Searches the attributes of node for one with the tag of attrName
	//Returns the text of the attribute if found, otherwise "" or null depending on nullIfMissing
	String getAttributeValue(org.w3c.dom.Node node, String attrName, boolean nullIfMissing){
		if(node == null)
			node = documentNode;
		org.w3c.dom.NamedNodeMap attributes = node.getAttributes();
		org.w3c.dom.Node attr = attributes.getNamedItem(attrName);
		String returnVal = ((attr != null) ? attr.getNodeValue() : null);
		if(!nullIfMissing && returnVal == null)
			returnVal = "";
		return returnVal;
	}
	
	//Passes params to getAttributeValue with nullIfMissing set to false
	String getAttributeValue(org.w3c.dom.Node node, String attrName){
		return getAttributeValue(node,attrName,false);
	}
	
	//Takes in a node, the tag name for an attribute and the value to put in that attribute
	//Makes a new attribute with tag name attrName and value attrValue and adds it to node
	//Will overwrite an existing node with the same tagName if one exists
	void appendAttribute(org.w3c.dom.Node node, String attrName, String attrValue){
		if(node == null)
			node = documentNode;
		
		org.w3c.dom.Document currDoc = node.getOwnerDocument();
		org.w3c.dom.Attr newAttr = currDoc.createAttribute(attrName);
		newAttr.setValue(attrValue);
		org.w3c.dom.NamedNodeMap attributes = node.getAttributes();
		attributes.setNamedItem(newAttr);
	}
}

String xmlSignature = tools.getParamValue("xmlSignature");

DomUtilities domUtil = new DomUtilities(xmlSignature);
org.w3c.dom.NodeList paramNodes = domUtil.getChildNodes(null);

ClipboardPage primary = tools.getPrimaryPage();
String pageName = tools.getParamValue("pageName");
ClipboardPage clipboardPage = primary.getPage(pageName);
ClipboardProperty pageGroup = clipboardPage.getProperty("pyStepsParamUI");

for(int i = 0; i< paramNodes.getLength(); i++){
	org.w3c.dom.Node currNode = paramNodes.item(i);
	if(currNode.getNodeType() != org.w3c.dom.Node.ELEMENT_NODE)
		continue;
	
	ClipboardPage newPage = tools.createPage("Embed-MethodParams", null);
	
	//Get all params and put them in save values so we can tweak them and pass them along
	String 	paramName 	= currNode.getNodeName(),
		paramDesc 	= domUtil.getAttributeValue(currNode,"DESCRIPTION"),
		paramType 	= domUtil.getAttributeValue(currNode,"TYPE"),
		paramReqStr	= domUtil.getAttributeValue(currNode,"REQUIRED"),
		paramInOutStr	= domUtil.getAttributeValue(currNode,"INOUT"),
		paramSize 	= domUtil.getAttributeValue(currNode,"SIZE"),
		paramSPStr	= domUtil.getAttributeValue(currNode,"SMARTPROMPT"),
		paramSPRule	= domUtil.getAttributeValue(currNode,"SMARTPROMPTRULE"),
		paramSPRClass	= domUtil.getAttributeValue(currNode,"SMARTPROMPTRULECLASS"),
		paramSPBClass	= domUtil.getAttributeValue(currNode,"SMARTPROMPTBASECLASS"),
		paramSPDataNode	= domUtil.getAttributeValue(currNode,"SMARTPROMPTDATANODE"),
		paramDropDown	= domUtil.getAttributeValue(currNode,"DROPDOWNVALUES"),
		paramDefVal	= domUtil.getAttributeValue(currNode,"DEFAULTVALUE");
	
	if(paramSPDataNode.equals("")){
		paramSPDataNode = domUtil.getAttributeValue(currNode,"SMARTPROMPTADDLPARAM");
}
	
	boolean	paramReq = paramReqStr.equals("-1");
	boolean paramInOut = paramInOutStr.equals("") || paramInOutStr.substring(0,1).equalsIgnoreCase("I");
	boolean paramSP = paramSPStr.equals("Y");
			
	newPage.putString("pyParametersParamName",paramName);
	newPage.putString("pyParametersParamDesc ",paramDesc);
	newPage.putString("pyParametersParamType",paramType);
	newPage.putString("pyParametersParamReq",((paramReq) ? "true" : "false"));
	newPage.putString("pyParametersParamInOut",((paramInOut) ? "true" : "false"));
	newPage.putString("pyParametersParamSize",paramSize);
	newPage.putString("pyParametersParamIntelliRule",paramSPRClass);
	newPage.putString("pyParametersParamIntelliBaseClass",paramSPBClass);
	newPage.putString("pyParametersParamDropdownValues",paramDropDown);
	newPage.putString("pyParametersParamDefaultValue",paramDefVal);
	
	newPage.putString("pyParametersParamSmartPrompt",((paramSP) ? "true" : "false"));
	newPage.putString("pyParametersParamSmartPromptRule",paramSPRule);
	newPage.putString("pyParametersParamSmartPromptDataNode",paramSPDataNode);
	
	clipboardPage.putString(paramName, paramDefVal);
	pageGroup.add(newPage);
}
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public String nextBlock="";
boolean pz_Status = true;
boolean pz_methodStatusUpdated = false;
private boolean debugIsOn=false;
private int forEachCounter = 0;
private int pz_forEachSkipClass = 0;
private InfEngUtils infEngine = null;
ClipboardProperty nextProperty = null;
String pz_CurrentRuleKey = "";
String pz_CurrentCircumstance = "";
String pz_CurrentStepNum = "";
com.pega.pegarules.priv.tracer.ActivityTraceInfo pz_CurrentTraceInfo = null;
String pz_thisPageClass = "";
Dictionary pz_Dictionary = null;
private static final boolean isAllowedInWeb = true;
String statusReturnedFromNestedLoop = "";

public void initializeStandardLocalVariables() {
	nextBlock="";
	pz_Status = true;
	pz_methodStatusUpdated = false;
	debugIsOn=false;
	forEachCounter = 0;
	pz_forEachSkipClass = 0;
	infEngine = null;
	nextProperty = null;
	pz_CurrentRuleKey = "";
	pz_CurrentCircumstance = "";
	pz_CurrentStepNum = "";
	pz_CurrentTraceInfo = null;
	pz_thisPageClass = "";
	pz_Dictionary = null;
	statusReturnedFromNestedLoop = "";
}


public void initializeUserLocalVariables() {
}


public StringMap snapshotLocalVariables() {
	return null;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADPARAMSPAGELIST #20180713T135334.368 GMT", "Code-Pega-List pzLoadParamsPageList", "Pega-Desktop", "08-01-01", false, true, "", "ACTIVITY", "20180713T135334.368 GMT" ,"Rule-Obj-Activity"); }
