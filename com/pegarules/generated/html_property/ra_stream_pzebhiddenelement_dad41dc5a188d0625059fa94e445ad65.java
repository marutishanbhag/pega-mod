package com.pegarules.generated.html_property;
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
import com.pega.pegarules.jsptags.TagTools;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.AssemblyParameters;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.runtime.ComplexParameterPage;
import com.pega.pegarules.priv.runtime.IActionRequest;
import com.pega.pegarules.priv.runtime.IActionRequestRegistrar;
import com.pega.pegarules.priv.runtime.IAutoStreamRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
import com.pega.pegarules.priv.runtime.jsp.JSPTagHandlerPool;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderBase;
import com.pega.pegarules.priv.util.JSPResponse;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
import com.pega.pegarules.pub.generator.*;
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
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream PZEBHIDDENELEMENT.
 */
public class ra_stream_pzebhiddenelement_dad41dc5a188d0625059fa94e445ad65 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pzEBHiddenElement.Stream");
/** The current stream builder. */
	/** Properties of the stream definition for the stream that included the current stream (or null if none). */
	private Map mParentStreamProperties = null;

	/** The handle of the current stream. */
	protected String pz_CurrentRuleKey;
private IControlRuntimeUtilities controlRuntimeUtilities = null;

/**
 * Creates a stream builder.
 *
 * @param aContext the current executable
 */
	public ra_stream_pzebhiddenelement_dad41dc5a188d0625059fa94e445ad65(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "7c2cf6f43baa7ddd1ecb758a598d740caf5125d";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
previousTemplatingStatus = '\0';
	pzAuto.beginStream(pega);
	initRequiredPages();
pageContext = pega.getJSPFactory().getPageContext(mHttpServlet, request, mStreamResponse, null, true, 0, true);
application = pageContext.getServletContext();
out = pageContext.getOut();
session = pageContext.getSession();
mStreamResponse.setContentType("text/html;charset=UTF-8");
try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PZEBHIDDENELEMENT #20230618T002003.666 GMT	Pega-Gadgets:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZEBHIDDENELEMENT #20230618T002003.666 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZEBHIDDENELEMENT #20230618T002003.666 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_1 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_1);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_1);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
}
/* end RULE-HTML-PROPERTY PZEBHIDDENELEMENT #20230618T002003.666 GMT */
}
	} catch (Throwable ex) {
		handleError(ex);
	} finally {
		pzAuto.finishStream();
		if (pega.getJSPFactory() != null) {
			pega.getJSPFactory().releasePageContext(pageContext);
		}
		pega.returnHTTPServletRequest(request);
	}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Property:PZEBHIDDENELEMENT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZEBHIDDENELEMENT","Rule-HTML-Property","",false,"","Pega-Gadgets","08-23-01","RULE-HTML-PROPERTY PZEBHIDDENELEMENT #20230618T002003.666 GMT","PZEBHIDDENELEMENT",true,false,"ABSOLUTE_CLASSLESS",-928472365)
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
//	RULE-HTML-PROPERTY PZEBHIDDENELEMENT #20230618T002003.666 GMT:20230618T002003.666 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "e7f9ec399dfbc4ef910ba225893b6a61";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
private void performStream_1() throws Throwable {
 

  pega_rules_utilities.pzRegisterActivity(tools,"PegaGadget-ExpressionBuilder.pzUpdateExpressionBuilder"); 
  pega_rules_utilities.pzRegisterActivity(tools,"PegaGadget-ExpressionBuilder.pzGetUpdatedExpression"); 
  pega_rules_utilities.pzRegisterActivity(tools,"@baseclass.pzCreateNewTempPage"); 


  String refPage = tools.getStepPage().getReference();
  String repeatType = "";
  String searchElement="";
  boolean shouldBeReadOnly = false;

  if(refPage.indexOf(")")!=-1)
    repeatType = "Embedded";

  tools.putSaveValue("ebReference", refPage);

  String targetElementName = "";
  String promptClass = "";

  if(tools.findPage("myParamPage") !=null){
	targetElementName = tools.findPage("myParamPage").getString("pyTargetElementId");
	promptClass =  tools.findPage("myParamPage").getString("pyPromptClass");
    
       //Fix for SE-46260 
  if(promptClass!=null && promptClass.startsWith("."))  {
    
    if(tools.getPrimaryPage()!=null && tools.getPrimaryPage().getParentPage()!=null )
      
      try{
        promptClass = tools.getPrimaryPage().getParentPage().getString(promptClass.substring(1));
      }catch(Exception e)
      {
          //Handling exception 
      }
  }  
    //Fix for SE-46260 ends    
  }  
  else{
	targetElementName = tools.getParameterPage().getString("pyTargetElementId");
	promptClass =  tools.getParameterPage().getString("pyPromptClass");
    
     //Fix for SE-46260
  if(promptClass!=null && promptClass.startsWith("."))  {
    
    if(tools.getPrimaryPage()!=null && tools.getPrimaryPage().getParentPage()!=null )
      
      try{
        promptClass = tools.getPrimaryPage().getParentPage().getString(promptClass.substring(1));
      }catch(Exception e)
      {
          //Handling exception 
      }
  }    
   //Fix for SE-46260 ends   
  }  
           
  /* if configuration is Top.xxxx
   * promptClass is null when used in decision table property chooser
  **/
  if(promptClass!=null && promptClass.toUpperCase().startsWith("TOP.")) {
     promptClass = tools.getStepPage().getTopLevelPage().getString(promptClass.substring(4));   
  }

  if(targetElementName!=null && targetElementName!="") {

    searchElement=targetElementName.replace(".", "$p");
    if(!searchElement.startsWith("$p"))
      searchElement="$p"+searchElement;
    
    targetElementName = targetElementName.replace(".", ""); //replace all occurances of dot
    


    
    //these changes led to BUG-283312. user was not able to delete empty rows from when rule
   /* //BUG-249152 - Save/Checkout/PrivateEdit breaks read-only mode of the target 
    ClipboardPage cp_topPage = tools.getActive().getTopLevelPage();
    String topClassName = cp_topPage.getString(".pxObjClass");

    if( (topClassName.equals("Rule-Obj-When") || topClassName.equals("Rule-Access-When")) ){ 
      HashStringMap keys = new HashStringMap();
      keys.putString("pxObjClass", "Rule-Obj-Model");
      keys.putString("pyClassName", "PegaGadget-ExpressionBuilder");
      keys.putString("pyModelName", "pzCopyExpressionForWhen");
      ParameterPage pp = tools.getParameterPage();
      pp.putString("target", targetElementName);
      tools.applyModel(tools.getPrimaryPage(),keys, pp); 
    }
    */
    String exprWithComments = tools.getStepPage().getString(".pyExpressionMapNew("+targetElementName+")");
    String exprInField =   tools.getStepPage().getString(".pyExpression");

  /* for backward compatibilty we need to ensure that check for expression and comments happen only when they are not blank
   * otherwise as both are blank for at all existing usage of expression builder, all fields would have become read only
  */
         
    	if(!"".equals(exprWithComments) && (exprWithComments.indexOf("//")!=-1 || exprWithComments.indexOf("/*")!=-1)) {
      		shouldBeReadOnly = true;    
        }
      
		if(!"".equals(exprInField) && !"".equals(exprWithComments)&&!exprWithComments.equals(exprInField)) {
          	shouldBeReadOnly = true;    
        }
     
  }
    tools.putSaveValue("promptClass", promptClass);
    tools.putSaveValue("repeatType", repeatType);
    tools.putSaveValue("eleName", searchElement);   

tools.appendString("\n\n<div> \n <input type=\"hidden\"  id=\"testID\"\n        value = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(eleName)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(eleName)")) {
	return;
}
tools.appendString("\"\n        pgRef=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ebReference)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(ebReference)")) {
	return;
}
tools.appendString("\" \n        pClass=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(promptClass)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(promptClass)")) {
	return;
}
tools.appendString("\"  \n        repeatType=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(repeatType)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(repeatType)")) {
	return;
}
tools.appendString("\" /></input>\n</div>\n\n");
if (!pega.isResearchMode() && !pega.checkOnlyOnce("EBScript")) {
tools.appendString("\n<script>\nfunction showExpressionBuilderNewEB(ev) {\n\n    pega.u.d.EBTargetElement = \"\";   /*holds dom element which is tied to EB being launched currently */\n    pega.u.d.EBPageRef = \"\";        /* holds primary page on which EB would be launched */\n    pega.u.d.EBRepeatType = \"\";     /* holds whether current element is embedded or not. Used by validation */\n    pega.u.d.EBPromptClass = \"\";    /*holds class whose properties would be displayed on prompting and nav pane  */\n    pega.u.d.EBOriginalValue = \"\";  /*holds original value when EB is launched. used by Reset  */\n\tpega.u.d.EBTargetElementCurrentValue =\"\";\n   // pega.u.d.exprHasComents = false; /*default it to false. Should be made true on submit if expr has comments in it */\n    if(pega.ui.expr)\n  \t\tpega.ui.expr.currEvalExpr = undefined;\n  \n\t/*pause action sequencer so that modal dialog is not launched till all pre async requests are completed*/\n    pega.c.actionSequencer.pause();\n\n    var e = ev || window.event;\n    //var eClone = $.extend(true, {}, e);\n\n    /* find hidden element corresponding to current source element*/\n    var srcEle = pega.util.Event.getTarget(e);\n    var parentEle = srcEle.parentElement;\n\twhile(parentEle && !pega.util.Dom.getElementsById(\"testID\",parentEle)) {\n\t\tparentEle = parentEle.parentElement;\n\t}\n  \n   /*find target element name using hidden element created*/\n   var dummyTextEle = pega.util.Dom.getElementsById(\"testID\",parentEle)[0];\n   var targetName = dummyTextEle.value;\n   pega.u.d.EBPageRef = dummyTextEle.getAttribute(\"pgRef\");\n   pega.u.d.EBRepeatType = dummyTextEle.getAttribute(\"repeatType\");\n      \n   var cls = dummyTextEle.getAttribute(\"pClass\");    \n   var classElement = \"\",\n       currentValue = \"\";\n\n  /*for advanced expr builder clear error messages on re-launch */\n   if(pega.ui.expr){\n      pega.ui.expr.builder.clearMarks();\n   }\n  \n    /** US-79930 : in case of decision table source element is fixed : Property Chooser EB**/\n    if(pega.u.d.EBPageRef == \"TempPage.pyExpressionGadget\"){   \n      createNewTempPage();     \n      return false;\n    }\n  \n    /* fetch property prompting class using property/string specified by user in parameter */ \n    if(\"\" != cls){\n\t\tif(cls.indexOf(\".\")==0) // property has been specified for class\n\t\t\tcls = cls.substring(1);\n      \n\t\tparentEle = srcEle.parentElement;\n\t\t/*while(parentEle && !pega.util.Dom.getElementsById(cls,parentEle)) {\n\t\t\tparentEle = parentEle.parentElement;\n\t\t}*/\n\t/*Start of BUG-394952\n\t\tSearching for the element with the name attribute ending with cls instead of id attribute\n\t*/\n    while(parentEle){\n      var targetElement = parentEle.querySelector(\"[name$='\"+cls+\"']\")\n      if(targetElement !== null){\n        break;\n      }                                            \n      parentEle = parentEle.parentElement;\n    }\n\t\tif(parentEle!=null)\n\t\t\t//pega.u.d.EBPromptClass = pega.util.Dom.getElementsById(cls,parentEle)[0].value;\n      pega.u.d.EBPromptClass = parentEle.querySelector(\"[name$='\"+cls+\"']\").value;\n\t\telse {\n\t\t\t/*this implies that cls was a page name. we need to find it's class now */        \n\t\t    var xmlhttp;\n\t\t    try {\n\t\t\t   xmlhttp = new ActiveXObject (\"Microsoft.XMLHTTP\");\n\t\t    } catch (e) {\n\t\t\t   xmlhttp = new XMLHttpRequest();\n\t\t    }\t\n       ");

          String stringToEncrypt = "pyActivity=Rule-Obj-Model.pzgetEmbedClassOfPropertyReference";
          String encryptedString = pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", stringToEncrypt);
        
tools.appendString("\n\t\t    var encryptedAction=\"");
out.print(encryptedString);
tools.appendString("\";\n\t\t    xmlhttp.open(\"GET\", pxReqURI + \"?\"+encryptedAction+\"&strInput=\" + \n                      cls+ \"&strClassName=\"+\"&pzPrimaryPageName=");
out.print(tools.getActive().getTopLevelPage().getName());
tools.appendString("\", false);\n\t\t    xmlhttp.send();\n\t\t    pega.u.d.EBPromptClass = xmlhttp.responseText;\n            if(pega.u.d.EBPromptClass == \"Please enter a valid property.\")\n              pega.u.d.EBPromptClass = cls;\n        }\n\t            } else { // if cls is blank\n              // Activity specific code for refresh of expression builder icon\n              var activityStepClassName = null;\n              if (pega.u.d.EBPageRef.endsWith(\".pyExpressionGadget\")) {\n                var withoutpyEG = pega.u.d.EBPageRef.substring(0, pega.u.d.EBPageRef.lastIndexOf('.'));\n                var activityRowReference = withoutpyEG.substring(0, withoutpyEG.lastIndexOf('.'));\n                var activityRowHandle = pega.u.property.toHandle(activityRowReference);\n                var activityStepClassInputName = activityRowHandle + \"$ppyStepsClassName\";\n                activityStepClassName = document.querySelector(\"[name$='\" + activityStepClassInputName + \"']\");\n              }\n              if (null != activityStepClassName) {\n                pega.u.d.EBPromptClass = activityStepClassName.value;\n              } else {\n                pega.u.d.EBPromptClass = document.querySelector(\"[name$=pyClassName]\").value;\n              }\n            }\n   // find target element\n    pega.u.d.EBTargetElement = findTargetElement(targetName,srcEle); \n    \n  /*BUG-191945: in case of DT->UpdatePage scenario, get class of page being updated  */\n  /*BUG-568239: only use propElement for Data Transforms*/\n  if (typeof getSmartPromptClass == 'function') { \n    var propElement = document.getElementsByName(pega.u.d.EBTargetElement.name)[0];\n    if(propElement) {\n     pega.u.d.EBPromptClass = getSmartPromptClass(null, \"Rule-Obj-Property\", propElement);\n    }\n  } else {\n    var propElement = null;\n  }\n  \n  /* changes end*/\n    \n  /*check if target element has an overlabel and current value is default overlabel string */\n   if(pega.u.d.EBTargetElement.getAttribute(\"overlabel\")){          \n\t if(pega.u.d.EBTargetElement.getAttribute(\"overlabel\") !==\"true\")\n           currentValue = pega.u.d.EBTargetElement.value;       \t\t\t\t\t\t\n   } else\n      currentValue = pega.u.d.EBTargetElement.value; \n    /* set target element's value to EB */\n   \tpega.u.d.EBOriginalValue = currentValue;\n    if(pega.ui.expr) {\n       var response = pega.ui.expr.antlr.parseExpression(currentValue);\n       pega.ui.expr.evalExpr = response.refactoredExpr;\n    } \n\tupdateValueOnExpressionBuilderPage(currentValue);  \n}\n\nfunction findTargetElement(targetName,srcEle){\n \n    var targetEle = null;\n    /*find target element's dom  */\n    var parentEle = srcEle.parentElement;\n  \n  \n\tif(\"\"!=targetName) { /*if target name has nt been passed:ex: property-set of activity : then skip this */\n\t\t/*while(parentEle && !pega.util.Dom.getElementsById(targetName,parentEle)) {\n\t\t\tparentEle = parentEle.parentElement;\n\t\t}*/\n\t/*Start of BUG-394952\n\t\tSearching for the element with the name attribute ending with targetName instead of id attribute\n\t*/\n    while(parentEle){\n      var targetElement = parentEle.querySelector(\"[name$='\"+targetName+\"']\");\n      if(targetElement !== null){\n        break;\n      }                                            \n      parentEle = parentEle.parentElement;\n    }\n\t}  \n  \n   /*if target element was an embedded property whereas target was specified only as property name\n    *  example is pzParams section for PROPERTY-SET-MESSAGES\n    */\n   if(parentEle == null || \"\"==targetName){\n      var parentEle = srcEle.parentElement;\n\t  while(parentEle && !pega.util.Dom.getElementsByAttribute(\"isns_onchange\",\"onChangeHandler\",\"input\",parentEle).length!=0) {\n\t\tparentEle = parentEle.parentElement;\n\t  }     \n      targetEle = pega.util.Dom.getElementsByAttribute(\"isns_onchange\",\"onChangeHandler\",\"input\",parentEle)[0];\n   } else {\t\n     /* store target element object for future reference*/\n     //targetEle = pega.util.Dom.getElementsById(targetName,parentEle)[0];     \n     targetEle = parentEle.querySelector(\"[name$='\"+targetName+\"']\");\n   }\n  \n  return targetEle;\n}\n  \nfunction createNewTempPage(){\n   pega.c.actionSequencer.pause();\n   var ruleSet =  objPRXMLDoc.selectSingleNode(\"//pyRuleSet\").text;\n   var ruleSetVersion = objPRXMLDoc.selectSingleNode(\"//pyRuleSetVersion\").text;\n   if(ruleSet.indexOf(\"@\")!=-1){\n    ruleSet = objPRXMLDoc.selectSingleNode(\"//pxInstanceLockedRuleSet\").text;\n    ruleSetVersion = objPRXMLDoc.selectSingleNode(\"//pxInstanceLockedRuleSetVersion\").text;\n   }\n\n  pega.u.d.EBPromptClass = document.getElementById(\"pyClassName\").value;\n   var oSafeURL = new SafeURL(\"@baseclass.pzCreateNewTempPage\");\n   oSafeURL.put(\"pageClass\",pega.u.d.EBPromptClass);   \n   oSafeURL.put(\"pyRuleSet\",ruleSet);\n   oSafeURL.put(\"pyRuleSetVersion\",ruleSetVersion);\n\n    var callback = {\n\t\tsuccess: function(oResponse){\t\t\t\t\n\t\t\t\ttry {\n\t\t\t\t      var currentValue = document.getElementById(\"property\").value;\n\t\t\t\t\t  if(currentValue!=\"\")\n\t\t\t\t\t\tupdateValueOnExpressionBuilderPage(currentValue); \t\t\t\t\t \n\t\t\t\t\t  pega.c.actionSequencer.resume();\n\t\t\t\t} catch (exception){}\n\t\t},\n\t\tfailure: function(oResponse){\n\t\t\tpega.c.actionSequencer.resume();\n            alert(\"request failed\");            \n\t\t}\n\t};\n  pega.u.d.convertToRunActivityAction(oSafeURL);\n\tvar request = pega.util.Connect.asyncRequest('GET',oSafeURL.toURL(false, false),callback);   \n} \n  \n\n/* update dom value of currently selected element on to pyExpressionGadget page */\nfunction updateValueOnExpressionBuilderPage(currentValue) {\n    \n    pega.u.d.EBTargetElementCurrentValue = currentValue;  \n    pega.u.d.EBOriginalValue = currentValue; \n  \n  \n    var oSafeURL = new SafeURL(\"PegaGadget-ExpressionBuilder.pzUpdateExpressionBuilder\"); \n    oSafeURL.put(\"value\",currentValue);\n    oSafeURL.put(\"primaryPage\",pega.u.d.EBPageRef);\n\toSafeURL.put(\"pzPrimaryPage\",pega.u.d.EBPageRef);\n\toSafeURL.put(\"promptClass\",pega.u.d.EBPromptClass);\n\toSafeURL.put(\"pzPrimaryPageName\",pega.u.d.EBPageRef);\n  \t\n  \tvar targetElementID=\"\";\n  \tif(pega.u.d.EBPageRef != \"TempPage.pyExpressionGadget\") {\n      \n  /* If id is missing fallback on pn attribute and remove all occurances of dot*/ \n      \tif(pega.u.d.EBTargetElement.id){\n          //targetElementID = pega.u.d.EBTargetElement.id;\n\t\t  /*Start of BUG-394952\n\t\t\tGetting the propertyName from the name attribtue instead of the id attribute\n\t\t  */\n\t\t  var targetElementNameAttribute = pega.u.d.EBTargetElement.name;\n      \t  targetElementID = targetElementNameAttribute.substring(targetElementNameAttribute.lastIndexOf(\"$p\")+2);\t\n        }else{\n          targetElementID = pega.u.d.EBTargetElement.getAttribute(\"pn\");\n          targetElementID = targetElementID.split(\".\").join(\"\");\n        }\n      \n      oSafeURL.put(\"target\",targetElementID);\n  \t}  \n  \t \n    var callback = {\n\t\tsuccess: function(oResponse){\t\t\t\t\n\t\t\t\ttry {\n\t\t\t\t     pega.c.actionSequencer.resume();\n\t\t\t\t} catch (exception){}\n\t\t},\n\t\tfailure: function(oResponse){\n\t\t\tpega.c.actionSequencer.resume();\n            alert(\"request failed\");            \n\t\t}\n\t};\n  pega.u.d.convertToRunActivityAction(oSafeURL);\n\tvar request = pega.util.Connect.asyncRequest('GET',oSafeURL.toURL(false, false),callback);   \n}\n  \n/* get new value as entered by user in EB and update dom for corresponding target property */\nfunction updateValueOnScreenFromEB(){\n \n    /*set this to blank as used by validateAndEvaluate to check if server side evaluation needs to be called  */\n    if(pega.ui.expr){\n  \t\tpega.ui.expr.evaluateExpr = undefined;\n    }\n  \n\t//close the function prompting list and property smart prompt hidden behind the model dialog once the dialog is closing\n\tcloseEBPrompts();  \n\n\tvar returnVal = pega.ui.CodeEditorUtils.getLatestEditor().getValue();\n\n\t /* US-79930: when element is in a decision table\n      * first condition is when submitting eb launched from property chooser\n      * 2nd condition is when submitting eb launched from individual table cell\n     **/\n    if(pega.u.d.EBPageRef == \"TempPage.pyExpressionGadget\" || pega.u.d.EBPageRef == \"pyTempPageNewEB.pyExpressionGadget\"){    \n       var value;\n       if(pega.ui.expr){                              \n         value = (pega.ui.expr.currEvalExpr!==undefined)?pega.ui.expr.currEvalExpr: pega.u.d.EBOriginalValue;\n       } else {\n         value = returnVal;\n       }\n      \n      // TODO : fix comment parsing issue, either through js parsing or existing client side parsing\n      if(document.getElementById(\"property\"))\n\t     document.getElementById(\"property\").value = value;\n           \n      if(pega.u.d.EBTargetElement.id == \"launchEBIcon\") { /*non-IE browsers */\n         pega.u.d.EBTargetElement.parentNode.parentNode.parentNode.childNodes[0].childNodes[0].value = value;\n         pega.u.d.EBTargetElement.parentNode.parentNode.parentNode.childNodes[0].childNodes[0].focus();\n      } \n      else if(pega.u.d.EBTargetElement.id == \"FloatingButton\")  { /*IE browser*/\n         pega.u.d.EBTargetElement.parentNode.parentNode.childNodes[0].childNodes[0].value = value;\n         pega.u.d.EBTargetElement.parentNode.parentNode.childNodes[0].childNodes[0].focus();\n      }\n      \n\t  return false;\n    } else {\n        var page = pega.u.d.EBPageRef;\n\t\tvar oSafeURL = new SafeURL(\"PegaGadget-ExpressionBuilder.pzGetUpdatedExpression\");\n    oSafeURL.put(\"actualCEText\",returnVal);  \n\t\toSafeURL.put(\"primaryPage\",page);\n\t\toSafeURL.put(\"pzPrimaryPageName\",pega.u.d.EBPageRef);\n      \tif(pega.ui.expr){\n          oSafeURL.put(\"advancedEB\",\"true\");\n        }\n     \telse{\n          oSafeURL.put(\"advancedEB\",\"false\");\n        }\n       /* If id is missing fallback on pn attribute and remove all occurances of dot*/ \n       var targetElementID=\"\"; \n      \tif(pega.u.d.EBTargetElement.id){\n          //targetElementID = pega.u.d.EBTargetElement.id;\n\t\t  /*Start of BUG-394952\n\t\t\tGetting the propertyName from the name attribtue instead of the id attribute\n\t\t  */\t\n          var targetElementNameAttribute = pega.u.d.EBTargetElement.name;\n          targetElementID = targetElementNameAttribute.substring(targetElementNameAttribute.lastIndexOf(\"$p\")+2);\n        }else{\n          targetElementID = pega.u.d.EBTargetElement.getAttribute(\"pn\");\n          targetElementID = targetElementID.split(\".\").join(\"\");\n        }\n\n      \n      \toSafeURL.put(\"target\",targetElementID);\n\t\t\n\t\tvar callback = {\n\t\t\tsuccess: function(oResponse){\t\t\t\t\n\t\t\t\t\ttry {\t\t\t\t \n         \n                      var retVal = \"\";                \n\t\t\t\t\t   if(\"EMPTY EXPRESSION Has Been Provided\"!=oResponse.responseText)\n\t\t\t\t\t\t retVal = \toResponse.responseText;\n                       else\n                         retVal = \"\";//pega.u.d.EBOriginalValue;\n\n\t\t\t\t\t\tvar name = pega.u.d.EBTargetElement.name;\n\t\t\t\t\t\tvar eleArr = pega.util.Dom.getElementsById(pega.u.d.EBTargetElement.id,document);\n            /*Start of BUG-394952\n              Getting the elements by name instead of id\n            */\n            eleArr = pega.util.Dom.getElementsByName(pega.u.d.EBTargetElement.name,document);\n\t\t\t\t\t\t\n\t\t\t\t\t\t/*for cases like pzParams section for PROPERTY-SET-MESSAGES */\n\t\t\t\t\t\tif(null == eleArr){\n\t\t\t\t\t\t  eleArr = pega.util.Dom.getElementsByAttribute(\"isns_onchange\",\"onChangeHandler\",\"input\",document);                      \n\t\t\t\t\t\t}\n                      \n                     // console.log(\"pega.ui.expr.evalExpr :\"+pega.ui.expr.evalExpr);\n                     // console.log(\"pega.ui.expr.currEvalExpr :\"+pega.ui.expr.currEvalExpr);\n                     // console.log(\"retVal =\"+retVal);\n                      \n                        for(i=0;i<eleArr.length;i++){\n\t\t\t\t\t\t   if(eleArr[i].name == name){\n                             if(pega.ui.expr){\n                               //console.log(\"**********\");\n                                eleArr[i].value = (pega.ui.expr.currEvalExpr!==undefined)?pega.ui.expr.currEvalExpr: pega.u.d.EBOriginalValue;\n                             } else {\n\t\t\t\t\t\t\t    eleArr[i].value = retVal;\n                             }\n                          \n\t\t\t\t\t\t\t /*handle use case for DT proeprty-set where base element has an overlabel */\n\t\t\t\t\t\t\t if(eleArr[i].getAttribute(\"overlabel\")){\n\t\t\t\t\t\t\t\teleArr[i].setAttribute(\"overlabel\",\"false\");\n\t\t\t\t\t\t\t\teleArr[i].className = \"InputIntellisenseStyle\";    \t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t }\n                             if(retVal.indexOf(\"//\")!=-1 || retVal.indexOf(\"/*\")!=-1){\n                                eleArr[i].readOnly = true;\n                                eleArr[i].title = 'This field is currently read-only.Please click on the gear icon to view/edit the expression';\n                             }\n                             else \n                                eleArr[i].readOnly = false;\n                             \n                             eleArr[i].focus();\n\t\t\t\t\t\t\t break;\t\t\t\t\t\n\t\t\t\t\t\t   }\n\t\t\t\t\t\t}\n\t\t\t\t\t} catch (exception){}\n\t\t\t},\n\t\t\tfailure: function(oResponse){\n\t\t\t\talert(\"request failed\");            \n\t\t\t}\n\t\t};\n\t\t/* sharm :Bug-189170*/\n    pega.u.d.convertToRunActivityAction(oSafeURL);\n\t\tif(pega.u.d.EBPageRef != \"\"){\n            if (/Edge\\/\\d./i.test(navigator.userAgent)){ //GUBBM: BUG-246869\n            setTimeout(function(){\n            var request = pega.util.Connect.asyncRequest('GET',oSafeURL.toURL(false, false),callback);}, 200);\n          }else{\n            var request =  pega.util.Connect.asyncRequest('GET',oSafeURL.toURL(false, false),callback);\n           }\n        }\n    }\t\t\t\t\t\n}\n  \nfunction resetExpression(){    \n   pega.ui.CodeEditorUtils.getLatestEditor().setValue(pega.u.d.EBOriginalValue) \n   pega.ui.CodeEditorUtils.getLatestEditor().focus();\n}   \n\n</script>\n");
}
tools.appendString("\n\n");
	if (pega.isPreviewMode() || shouldBeReadOnly) {
tools.appendString("\n  <script>     \n   // if( pega.u.d.exprHasComents===undefined || pega.u.d.exprHasComents) {\n          var targetProperty = \"\";\n          var hiddenEle = $(\"input[pgref='");
out.print(tools.getStepPage().getReference());
tools.appendString("']\");\n          var currVal = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(eleName)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(eleName)")) {
	return;
}
tools.appendString("\";\n          for(i=0;i<hiddenEle.length;i++){\n            if(hiddenEle[i].getAttribute(\"value\") == currVal){\n               targetProperty = hiddenEle[i];\n            }\n          }\n    \n          var targetName = targetProperty.value;\n          var targetEle = findTargetElement(targetName,targetProperty);    \n    \t  //var returnVal = targetEle.value;\n     \t  //if(returnVal.indexOf(\"//\")!=-1 || returnVal.indexOf(\"/*\")!=-1)\n    \t  \ttargetEle.readOnly = true;  \n    \t\ttargetEle.title = 'This field is currently read-only.Please click on the gear icon to view/edit the expression'\n   //}\n  </script>\n");
	}
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZEBHIDDENELEMENT #20230618T002003.666 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzEBHiddenElement");
	oStreamProperties_1.put("pyRuleSetVersion", "08-23-01");
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public void cleanForReuse(PegaAPI aContext) {
	tools = (StreamBuilderToolKit)aContext;
	pega = (com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext;
	if( pega != null ) {
		pzAuto = pega.getAutoStreamRuntime();
	}
	else {
		pzAuto = null;
	}
	mParentTag = null;
	mStreamResponse = (JSPResponse) tools;
	mHttpServlet = aContext == null ? null : (HttpServlet) aContext.getHttpServlet();
	request = aContext == null ? null : (HttpServletRequest)aContext.getHttpServletRequest();
	mParentStreamProperties = null;
	pz_CurrentRuleKey = null;
	if( pega != null ) pega.setTrackMissingProperties("Rule-HTML-Property");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZEBHIDDENELEMENT #20230618T002003.666 GMT", "pzEBHiddenElement", "Pega-Gadgets", "08-23-01", "20230618T002003.666 GMT");
}
