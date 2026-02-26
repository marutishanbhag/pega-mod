package com.pegarules.generated.html_section;
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
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderBase;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderSection;
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
 * Builds JSP stream @BASECLASS!PZABOUTHELPINC.
 */
public class ra_stream_pzabouthelpinc_578b3bbb2c5a0b5addf2bf91cdecccb9 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzAboutHelpInc.Data_Portal_DesignerStudio.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 387917204;
private static boolean pz_isValidAssembly= true;
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
	public ra_stream_pzabouthelpinc_578b3bbb2c5a0b5addf2bf91cdecccb9(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
		initAssemblyParameters(tools);
	}
public static Map<String, AssemblyParameters> getAssemblyParametersMap(StreamBuilderToolKit tools) {		
 initAssemblyParameters(tools);	
 Map<String, AssemblyParameters> clone = new HashMap<String, AssemblyParameters>();	
 clone.putAll(oAssemblyParamsMap);	
 return clone;
}
public static void initAssemblyParameters(StreamBuilderToolKit tools) { 
	try {
		if(oAssemblyParamsMap == null || oAssemblyParamsMap.isEmpty()){
			oAssemblyParamsMap = tools.getControlUtilities().getAssemblyParamsMap(oControlPathsMap, tools, oCellRuntimeParamsMap, pxUniqueStreamHash);
		if(oAssemblyParamsMap != null && !oAssemblyParamsMap.isEmpty()){
			oControlPathsMap = null;
			oCellRuntimeParamsMap = null;
		}
		}
	} catch(IllegalStateException e) {
	pz_isValidAssembly = false;
	}
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "31990b9b7a37af4835b2a2c2b84b31fb0e362a66";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
	if(!pz_isValidAssembly){
	throw new PRRuntimeException("Invalid Section Assembly ");
	}
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
/* Instance RULE-HTML-SECTION @BASECLASS PZABOUTHELPINC #20211026T105523.321 GMT	Pega-Desktop:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "31990b9b7a37af4835b2a2c2b84b31fb0e362a66";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzAboutHelpInc",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, true, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
pxIsNonTemplateStream = true;
pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_1");
/*
 * Begin RULE-HTML-SECTION @BASECLASS PZABOUTHELPINC #20211026T105523.321 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS PZABOUTHELPINC #20211026T105523.321 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Section");
final Map prevPropDefs_1 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_1);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_1);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	pzSection.abortComponent();
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION @BASECLASS PZABOUTHELPINC #20211026T105523.321 GMT */
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
	"Rule-HTML-Section:PZABOUTHELPINC"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZABOUTHELPINC","Rule-HTML-Section","@BASECLASS",false,"","Pega-Desktop","08-07-01","RULE-HTML-SECTION @BASECLASS PZABOUTHELPINC #20211026T105523.321 GMT","!PZABOUTHELPINC",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",387917204)
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
//	RULE-HTML-SECTION @BASECLASS PZABOUTHELPINC #20211026T105523.321 GMT:20211026T105523.321 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "d63a02b892a679488372fd52c55cd61a";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Stream";
}
private void performStream_1() throws Throwable {
tools.appendString("<style> #modaldialog .bd, #modaldialog .bd .customExpandInnerDivStyle, #modaldialog .ft, #modalOverlay .modal-content, #modalOverlay .modal-content .customExpandInnerDivStyle { background: none; border: none; } div[data-node-id='pzModalAboutHelp'] { background: #1F2555; padding: 14px; height: 552px; width:752px; max-height: 552px!important; max-width: 752px!important; min-width: 752px!important; overflow:hidden!important; } div[data-node-id='pzModalAboutHelp'] > .float-right { position: absolute; right: 14px; top: 7px; z-index: 1; } div[data-node-id='pzModalAboutHelp'] .iconClose, div[data-node-id='pzModalAboutHelp'] .iconClose:before { color: #FFF; font-size:24px; } .modal-content > div[data-node-id='pzModalAboutHelp'] .yui-resize-handle { display: none; } div[data-node-id='pzAboutHelp'] { color: #FFF; font-size:14px; height:550px; width:780px; background: #1F2555; } div[data-node-id='pzModalAboutHelp'] div[data-node-id='pzAboutHelp'] { height:552px; width:752px; max-width:752px; min-width:752px; } div[data-node-id='pzAboutHelp'] .flex.layout-content-inline { width: 100.0%; min-width: 0; max-width: none; display: flex; flex-flow: row wrap; } div[data-node-id='pzAboutHelp'] .flex.content-inline>.flex.content-item.flex-row { display: flex; color: #FFF; margin: 0 7px 0 0; padding: 0px; min-height: 17.0px; width: auto; min-width: 0.0px; flex-direction: column; justify-content: center; } div[data-node-id='pzAboutHelp'] span { font-size: 14px; color: #FFF; } div[data-node-id='pzAboutHelp'] > span.inspector-span { display: block; } div[data-node-id='pzAboutHelp'] > span.inspector-span:first-child { margin-top: -14px; margin-left: -14px; margin-right: -14px; } .pega-about-help-centered { text-align: center; justify-content:center; } div[data-node-id='pzAboutHelp'] .icons { margin-top: 14px; } .flex.pega-about-help-title, .flex.pega-about-help-title span { font-size:18px; color: #FFF; font-weight: normal; } div[data-node-id='pzAboutHelp'] .content-paragraph > div { width:100%; } div[data-node-id='pzAboutHelp'] p { text-align:justify; margin: 14px 14px 14px 0; padding:0; } div[data-node-id='pzAboutHelp'] .flex >.flex.content-item.flex-row > span:not(.autocomplete_span):only-of-type { width:100%; flex: none; text-align: center; justify-content: center; } div[data-node-id='pzAboutHelp'] > .float-right { transition: all 0.4s ease-in; margin-right: -200px; } #url_qr > canvas { background:#FFF; } div[data-node-id='pzAboutHelp'] button.pzhc.pzbutton { background: #10142D; min-width:0; padding: 0 14px; color: #FFF; font-size: 14px; border: 1px solid #10142D; height:40px; } .pega-about-help-align-middle { line-height:40px; } div[data-node-id='pzAboutHelp'] button.pzhc.pzbutton:hover, div[data-node-id='pzAboutHelp'] button.pzhc.pzbutton:focus, div[data-node-id='pzAboutHelp'] button.pzhc.pzbutton:active { background: #292b38; } div[data-node-id='pzAboutHelp'] div.fill-space { flex-grow: 1; } div[data-node-id='pzAboutHelp'] .dataLabelRead { font-size: inherit; } @-webkit-keyframes pzAboutInit { 0% { -webkit-transform: rotate(0.2turn) scale(1.9); transform: rotate(0.2turn) scale(1.9); opacity: 0; } 100% { -webkit-transform: rotateY(0) scale(1); transform: rotateY(0) scale(1); opacity: 1; } } @keyframes pzAboutInit { 0% { -webkit-transform: rotate(0.2turn) scale(1.9); transform: rotate(0.2turn) scale(1.9); opacity: 0; } 100% { -webkit-transform: rotateY(0) scale(1); transform: rotateY(0) scale(1); opacity: 1; } } @-webkit-keyframes pzAboutRFlipL { 0% { -webkit-transform: rotateY(-180deg); transform: rotateY(-180deg); background-color: black; opacity: 1; } 100% { -webkit-transform: rotateY(0); transform: rotateY(0); opacity: 1; } } @keyframes pzAboutRFlipL { 0% { -webkit-transform: rotateY(-180deg); transform: rotateY(-180deg); background-color: black; opacity: 1; } 100% { -webkit-transform: rotateY(0); transform: rotateY(0); opacity: 1; } } @-webkit-keyframes pzAboutRFlipD { 0% { -webkit-transform: rotateX(-180deg); transform: rotateX(-180deg); background-color: black; opacity: 1; } 100% { -webkit-transform: rotateX(0); transform: rotateX(0); opacity: 1; } } @keyframes pzAboutRFlipD { 0% { -webkit-transform: rotateX(-180deg); transform: rotateX(-180deg); background-color: black; opacity: 1; } 100% { -webkit-transform: rotateX(0); transform: rotateX(0); opacity: 1; } } @-webkit-keyframes pzAboutRFlipR { 0% { -webkit-transform: rotateY(180deg); transform: rotateY(180deg); opacity: 0; } 1% { opacity: 1; background-color: black; } 100% { -webkit-transform: rotateY(0); transform: rotateY(0); opacity: 1; } } @keyframes pzAboutRFlipR { 0% { -webkit-transform: rotateY(180deg); transform: rotateY(180deg); opacity: 0; } 1% { opacity: 1; background-color: black; } 100% { -webkit-transform: rotateY(0); transform: rotateY(0); opacity: 1; } } @-webkit-keyframes pzAboutLFlipL { 0% { -webkit-transform: rotateY(-180deg); transform: rotateY(-180deg); background-color: #000001; opacity: 1; } 100% { -webkit-transform: rotateY(0); transform: rotateY(0); opacity: 1; } } @keyframes pzAboutLFlipL { 0% { -webkit-transform: rotateY(-180deg); transform: rotateY(-180deg); background-color: #000001; opacity: 1; } 100% { -webkit-transform: rotateY(0); transform: rotateY(0); opacity: 1; } } @-webkit-keyframes pzAboutLFlipD { 0% { -webkit-transform: rotateX(-180deg); transform: rotateX(-180deg); background-color: #000001; opacity: 1; } 100% { -webkit-transform: rotateX(0); transform: rotateX(0); opacity: 1; } } @keyframes pzAboutLFlipD { 0% { -webkit-transform: rotateX(-180deg); transform: rotateX(-180deg); background-color: #000001; opacity: 1; } 100% { -webkit-transform: rotateX(0); transform: rotateX(0); opacity: 1; } } @-webkit-keyframes pzAboutLFlipR { 0% { -webkit-transform: rotateY(180deg); transform: rotateY(180deg); opacity: 0; } 1% { opacity: 1; background-color: #000001; } 100% { -webkit-transform: rotateY(0); transform: rotateY(0); opacity: 1; } } @keyframes pzAboutLFlipR { 0% { -webkit-transform: rotateY(180deg); transform: rotateY(180deg); opacity: 0; } 1% { opacity: 1; background-color: #000001; } 100% { -webkit-transform: rotateY(0); transform: rotateY(0); opacity: 1; } } .top-about { background: url('webwb/pzAboutHelpBkg.jpg'); margin-bottom:21px; position:relative; height:300px; } .top-about > svg { position: absolute; bottom: 14px; left: 0; right: 0; margin: 0 auto; } .ie11 .top-about > svg { top:40%; } .scene { position: absolute; top: 0; left: 0; right: 0; transform: scale(0.5); } .top-about > .scene, .top-about > .scene > .loader { overflow: hidden; -webkit-perspective: 99; perspective: 99; } .top-about .loader { height:300px; align-items: center; -webkit-animation: pzAboutInit 0.375s cubic-bezier(0.165, 0.84, 0.44, 1) both; animation: pzAboutInit 0.375s cubic-bezier(0.165, 0.84, 0.44, 1) both; display: flex; justify-content: center; position: relative; /* hiding new loader */ background: none; } .top-about .loader *, .top-about .loader :after, .top-about .loader :before { -webkit-backface-visibility: hidden; backface-visibility: hidden; position: absolute; -webkit-transform-style: preserve-3d; transform-style: preserve-3d; will-change: transform, background-color; } .top-about .loader .box, .top-about .loader .anim, .top-about .loader .anim:after, .top-about .loader .anim:before { height: 100px; width: 100px; } .top-about .loader .box { background: #080F19 url(\"webwb/pzpega-c-art.jpg\") no-repeat; background-size: cover; -webkit-transform: rotate(45deg); transform: rotate(45deg); z-index: 2; } .top-about .loader .box-l, .loader .box-r { margin-top: -141.1px; margin-left: -70.2px; -webkit-transform: rotate(45deg); transform: rotate(45deg); } .top-about .loader .box-r { margin-top: 141.1px; margin-left: 70.2px; -webkit-transform: rotate(-135deg); transform: rotate(-135deg); } /* fixing margin for infinity loader for chrome */ .chrome .top-about .loader .box-l, .loader .box-r { margin-top: -284.1px; margin-left: -145.2px; } .chrome .top-about .loader .box-r { margin-top: 284.1px; margin-left: 145.2px; } .top-about .loader .box-r .anim { -webkit-animation-name: pzAboutRFlipL; animation-name: pzAboutRFlipL; } .top-about .loader .box-r .anim, .top-about .loader .box-r .anim:after, .top-about .loader .box-r .anim:before { background: #061E38 url(\"webwb/pzpega-r-art.jpg\") no-repeat; background-position: top left; background-size: 200% 200%; background-color: #061E38; } .top-about .loader .box-r .anim:before { -webkit-animation-name: pzAboutRFlipD; animation-name: pzAboutRFlipD; background-position: bottom left; } .top-about .loader .box-r .anim:after { background-position: bottom right; -webkit-animation-name: pzAboutRFlipR; animation-name: pzAboutRFlipR; } .top-about .loader .anim { -webkit-transform-origin: right center; transform-origin: right center; } .top-about .loader .anim, .top-about .loader .anim:before, .top-about .loader .anim:after { opacity: 0; -webkit-animation: pzAboutLFlipL 0.5s cubic-bezier(0.165, 0.84, 0.44, 1); animation: pzAboutLFlipL 0.5s cubic-bezier(0.165, 0.84, 0.44, 1); -webkit-animation-fill-mode: forwards; animation-fill-mode: forwards; background: #2A2F3D url(\"webwb/pzpega-l-art.jpg\") no-repeat; background-position: top left; background-size: 200% 200%; } .top-about .loader .anim:before, .top-about .loader .anim:after { -webkit-animation-delay: 0.5s; animation-delay: 0.5s; -webkit-animation-name: pzAboutLFlipD; animation-name: pzAboutLFlipD; background-position: bottom left; content: ''; display: block; -webkit-transform-origin: top center; transform-origin: top center; top: 99px; } .top-about .loader .anim:after { -webkit-animation-delay: 1s; animation-delay: 1s; -webkit-animation-name: pzAboutLFlipR; animation-name: pzAboutLFlipR; background-position: bottom right; left: 99px; -webkit-transform-origin: left center; transform-origin: left center; } @-moz-document url-prefix() { .top-about .box-l { margin-top: -282.2px !important; margin-left: -140.4px !important; } .top-about .box-r { margin-top: 282.2px !important; margin-left: 140.4px !important; } } @supports (-ms-ime-align: auto) { .top-about .box-l { margin-top: -282.2px !important; margin-left: -140.4px !important; } .top-about .box-r { margin-top: 282.2px !important; margin-left: 140.4px !important; } } @media all and (-ms-high-contrast: none), (-ms-high-contrast: active) { .top-about .box { margin-top: -50px; margin-left: -50px; } } </style> <script> function pzpega_slideQRCode() { var elem = document.querySelector(\"div[data-node-id='pzAboutHelp'] > .float-right\"); if(elem){ elem.style.margin=\"0\"; } /* Reset the focus to the close button */ elem = document.querySelector(\"div[data-node-id='pzModalAboutHelp'] .iconClose\"); if(elem){ elem.focus(); } } </script> <div class=\"top-about\"> <div class=\"scene\"> <div class=\"loader\"> <div class=\"box\"></div> <div class=\"box-l\"> <div class=\"anim\"></div> </div> <div class=\"box-r\"> <div class=\"anim\"></div> </div> </div> </div> <svg width=\"200px\" viewBox=\"0 0 168.46 30.61\" xmlns=\"http://www.w3.org/2000/svg\"><title>Pega Infinity</title><path d=\"m13.79 7.36a6.1 6.1 0 0 1 -2.25 5.08 10.27 10.27 0 0 1 -6.45 1.77h-2.56v8.56h-2.53v-21.77h5.64q8.15 0 8.15 6.36zm-11.26 4.64h2.27a8.49 8.49 0 0 0 4.87-1 4 4 0 0 0 1.5-3.49 3.77 3.77 0 0 0 -1.41-3.25 7.41 7.41 0 0 0 -4.4-1h-2.83zm19.47 11.06a7.47 7.47 0 0 1 -5.7-2.2 8.48 8.48 0 0 1 -2.09-6.11 9.4 9.4 0 0 1 1.94-6.26 6.43 6.43 0 0 1 5.21-2.32 6.15 6.15 0 0 1 4.85 2 7.73 7.73 0 0 1 1.79 5.33v1.56h-11.27a6.44 6.44 0 0 0 1.45 4.36 5 5 0 0 0 3.87 1.49 13.21 13.21 0 0 0 5.21-1.1v2.19a14 14 0 0 1 -2.48.81 14.25 14.25 0 0 1 -2.78.25zm-.71-14.83a4 4 0 0 0 -3.13 1.28 5.87 5.87 0 0 0 -1.37 3.54h8.52a5.43 5.43 0 0 0 -1-3.57 3.68 3.68 0 0 0 -3.02-1.25zm23.46-1.77v1.54l-3 .36a5.35 5.35 0 0 1 1.07 3.26 4.81 4.81 0 0 1 -1.64 3.82 6.59 6.59 0 0 1 -4.49 1.43 7.51 7.51 0 0 1 -1.37-.12 2.44 2.44 0 0 0 -1.57 2.1 1.06 1.06 0 0 0 .55 1 4 4 0 0 0 1.89.32h2.88a6.49 6.49 0 0 1 4.07 1.11 3.89 3.89 0 0 1 1.42 3.25 4.61 4.61 0 0 1 -2.17 4.12 11.6 11.6 0 0 1 -6.39 1.44 8.61 8.61 0 0 1 -4.93-1.2 3.84 3.84 0 0 1 -1.73-3.36 3.74 3.74 0 0 1 .98-2.53 4.87 4.87 0 0 1 2.68-1.51 2.54 2.54 0 0 1 -1-.88 2.35 2.35 0 0 1 -.43-1.38 2.63 2.63 0 0 1 .43-1.57 5.22 5.22 0 0 1 1.5-1.29 4.45 4.45 0 0 1 -2.06-1.77 5.21 5.21 0 0 1 -.79-2.86 5.25 5.25 0 0 1 1.6-4.12 6.55 6.55 0 0 1 4.56-1.45 8.18 8.18 0 0 1 2.3.29zm-13 19a2.2 2.2 0 0 0 1.11 2 6.13 6.13 0 0 0 3.2.69 9 9 0 0 0 4.61-.93 2.86 2.86 0 0 0 1.49-2.53 2 2 0 0 0 -.82-1.83 6.34 6.34 0 0 0 -3.08-.52h-3a3.85 3.85 0 0 0 -2.61.81 2.84 2.84 0 0 0 -.9 2.35zm1.34-13.82a3.33 3.33 0 0 0 1 2.59 3.87 3.87 0 0 0 2.7.88q3.61 0 3.61-3.51-.04-3.6-3.7-3.6a3.65 3.65 0 0 0 -2.7.9 3.8 3.8 0 0 0 -.91 2.78zm23.51 11.13-.49-2.32h-.11a6.87 6.87 0 0 1 -2.43 2.07 7.47 7.47 0 0 1 -3 .54 5.41 5.41 0 0 1 -3.8-1.25 4.53 4.53 0 0 1 -1.38-3.55q0-4.94 7.9-5.18l2.71-.08v-1a4.12 4.12 0 0 0 -.83-2.83 3.39 3.39 0 0 0 -2.64-.92 10.81 10.81 0 0 0 -4.61 1.25l-.76-1.89a11.77 11.77 0 0 1 2.64-1 11.38 11.38 0 0 1 2.9-.41 6.21 6.21 0 0 1 4.3 1.29 5.39 5.39 0 0 1 1.41 4.15v11.13zm-5.6-1.77a5 5 0 0 0 3.62-1.27 4.66 4.66 0 0 0 1.38-3.51v-1.47l-2.47.1a9 9 0 0 0 -4.25.92 2.77 2.77 0 0 0 -1.3 2.52 2.56 2.56 0 0 0 .81 2 3.4 3.4 0 0 0 2.21.71zm17.22-19.48h3.49v21.79h-3.49zm21.45 21.67v-10.58c0-4-2-6-5.9-6a7.15 7.15 0 0 0 -3 .64 4.93 4.93 0 0 0 -2.11 1.81h-.18l-.48-2.16h-2.77v16.41h3.49v-8.18a7.22 7.22 0 0 1 1-4.37 3.89 3.89 0 0 1 3.28-1.31 2.94 2.94 0 0 1 2.43.94 4.45 4.45 0 0 1 .76 2.83v10.09h2.5v-.12zm11.84-16.29h3.49v16.3h-3.49zm15.55-.3a7.15 7.15 0 0 0 -3 .64 4.93 4.93 0 0 0 -2.11 1.81h-.18l-.49-2.15h-2.73v16.29h.93v.12h2.52v-8.18a7.22 7.22 0 0 1 1-4.37 3.89 3.89 0 0 1 3.24-1.31 2.94 2.94 0 0 1 2.43.94 4.45 4.45 0 0 1 .76 2.83v10.09h3.57v-10.7c0-4-2-6.01-5.94-6.01zm9.29.3h3.49v16.41h-3.49zm12.11 13.29a2.47 2.47 0 0 1 -.63-1.87v-8.78h4.68v-2.64h-4.68v-3.65h-2.15l-1.18 3.47-2.41 1.28v1.54h2.24v8.84q0 5.24 5 5.23a10.63 10.63 0 0 0 1.89-.17 7.12 7.12 0 0 0 1.49-.43v-2.62a8.69 8.69 0 0 1 -2.55.4 2.33 2.33 0 0 1 -1.7-.6zm14.15-2.19a15.63 15.63 0 0 0 -.49 2h-.12a18.08 18.08 0 0 0 -1-3.74l-3.34-9.3h-3.8l6.59 16.41-.61 1.54q-1 2.92-3.54 2.93a8.12 8.12 0 0 1 -1.8-.18v2.76a10 10 0 0 0 2.26.25q4.45 0 6.38-5.12l7-18.59h-3.77q-3.37 9.84-3.76 11.04zm-63.94 5.19h1v.11h-1zm12.84 0h3.49v.11h-3.49zm7.01 0h.93v.11h-.93zm-11.98-17.4a3.71 3.71 0 0 1 .54-2.21 2 2 0 0 1 1.73-.74 8 8 0 0 1 2.47.42l.92-2.65a11.07 11.07 0 0 0 -3.63-.61 5.6 5.6 0 0 0 -4.18 1.41 6 6 0 0 0 -1.39 4.32v17.58h3.51v-13.62h2.67v-2.79h-2.64zm66.53 4.77h-.6v-3.2h-1.1v-.52h2.8v.52h-1.1zm3.17 0-1.08-3.11.05 1.3v1.81h-.56v-3.72h.86l1 3 1.06-3h.86v3.72h-.58v-3.1l-1.12 3.1z\" fill=\"#fff\"/></svg></div>");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "@baseclass");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS PZABOUTHELPINC #20211026T105523.321 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzAboutHelpInc");
	oStreamProperties_1.put("pyRuleSetVersion", "08-07-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS PZABOUTHELPINC #20211026T105523.321 GMT", "@baseclass pzAboutHelpInc", "Pega-Desktop", "08-07-01", "20211026T105523.321 GMT");
}
