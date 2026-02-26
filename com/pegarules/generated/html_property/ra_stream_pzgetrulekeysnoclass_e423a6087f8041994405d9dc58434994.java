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
/**
 * Builds JSP stream PZGETRULEKEYSNOCLASS.
 */
public class ra_stream_pzgetrulekeysnoclass_e423a6087f8041994405d9dc58434994 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pzGetRuleKeysNoClass.Stream");
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
	public ra_stream_pzgetrulekeysnoclass_e423a6087f8041994405d9dc58434994(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "9daf52ae26699d76b9767498d6c37d11abac4d2d";
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
/* Instance RULE-HTML-PROPERTY PZGETRULEKEYSNOCLASS #20190312T214921.598 GMT	Pega-Desktop:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZGETRULEKEYSNOCLASS #20190312T214921.598 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZGETRULEKEYSNOCLASS #20190312T214921.598 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY PZGETRULEKEYSNOCLASS #20190312T214921.598 GMT */
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
	"Rule-HTML-Property:PZGETRULEKEYSNOCLASS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZGETRULEKEYSNOCLASS","Rule-HTML-Property","",false,"","Pega-Desktop","08-03-01","RULE-HTML-PROPERTY PZGETRULEKEYSNOCLASS #20190312T214921.598 GMT","PZGETRULEKEYSNOCLASS",true,false,"ABSOLUTE_CLASSLESS",-1458445684)
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
//	RULE-HTML-PROPERTY PZGETRULEKEYSNOCLASS #20190312T214921.598 GMT:20190312T214921.598 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "a5a7f0ebb6eb4272498b93643f95f9ee";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
private void performStream_1() throws Throwable {
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || tools.findPage("pxRequestor").getString("pyPegaDesignMode").equals("true"))) {
tools.appendString(" <label>Rule Info</label> ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" ");

String strObjClass = tools.getStepPage().getString("pxObjClass");
String menuHTML="data-click='[[\"showMenu\",[{\"dataSource\":\"pzRuleformHeaderClassMenu\", \"isNavNLDeferLoaded\":\"false\",  \"className\":\""+strObjClass+"\", \"menuAlign\":\"left\",\"format\":\"menu-format-standard\" , \"loadBehavior\":\"ondisplay\", \"ellipsisAfter\":\"999\",\"usingPage\":\""+tools.getStepPage().getName() +"\", \"useNewMenu\":\"true\"},\":event\"]]]' ";
ClipboardPage pgTemp = null;
try {
  HashStringMap keys = new HashStringMap();
  keys.putString("pxObjClass", "Rule-Obj-Class");
  keys.putString("pyClassName", strObjClass);
  keys.putString("pyActivityName", "OpenClass");
  pgTemp = tools.getDatabase().open(keys,true);
} catch (DatabaseException e) {
  tools.appendString("Cannot open class record");
}
String strRuleName = "";
if (pgTemp != null) {
  pgTemp.rename("ClassRecord");
  int cnt = pgTemp.getProperty("pyKeyDefList").size();
  for(int i = 1; i <= cnt; i++) {
    ClipboardProperty keyDef = pgTemp.getProperty("pyKeyDefList(" + i + ")");
    String strKeyName = keyDef.getProperty("pyKeyName").getStringValue();
    String strKeyCaption = keyDef.getProperty("pyKeyCaption").getStringValue();
    //Fix for BUG-291880
    //key name can be empty for some classes like embed-. We need to handle this, otherwise we see log errors
     if("".equals(strKeyName)){
       continue;
     }    
    //FIX for BUG-291880 Ends here
    // Get the KeyName from Class Keys , get its value from xml through the key
    String strTempName = tools.getStepPage().getString(strKeyName);
    strTempName = StringUtils.crossScriptingFilter(strTempName);
    if (strKeyName.equals("pyClassName") ){		
			ClassDefinition oCD  = tools.getDatabase().getClassDef(strObjClass);

			if (oCD.usesInheritance()) {
 					 continue;					
			}
		 
    }
    if (i == 1) {
      if (strObjClass.equals("Data-Admin-Connect-EmailListener") && strRuleName.equalsIgnoreCase("Listener")) {
        strRuleName = ""; 
      } else {
        if("Rule-Obj-Class".equals(strObjClass)){
           strRuleName = "<span style='display:inline-block' data-ctl title=\""+strKeyCaption+"\" "  +menuHTML +" onclick=\"pd(event);\" >" + strTempName+" ";  
           strRuleName+= "<i class=\"pi pi-caret-down pi-right\" role=\"link\" aria-haspopup=\"true\" data-ctl=\"\" "+menuHTML+" ></i></span>";

        }
        else{
           strRuleName = "<span title=\""+strKeyCaption+"\">" + strTempName + "</span>";    
        }
      }
       
    } else {
      if (strObjClass.equals("Data-EmailAccount") && strTempName.equalsIgnoreCase("Notify")) {
        strTempName = "";  
      }
      if (strRuleName.equals("")) {
        strRuleName += "<span title=\"" + strKeyCaption + "\">" + strTempName + "</span>";                                            
      } else if (!strTempName.equals("")) {
        strRuleName += "<span>&nbsp;&bull;&nbsp;</span><span title=\"" + strKeyCaption + "\">" + strTempName + "</span>";                           
      }
    }
  }
}

tools.appendString(" ");
out.print(strRuleName);
tools.appendString(" ");
}
tools.appendString(" ");
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZGETRULEKEYSNOCLASS #20190312T214921.598 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzGetRuleKeysNoClass");
	oStreamProperties_1.put("pyRuleSetVersion", "08-03-01");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZGETRULEKEYSNOCLASS #20190312T214921.598 GMT", "pzGetRuleKeysNoClass", "Pega-Desktop", "08-03-01", "20190312T214921.598 GMT");
}
