<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en-US" xml:lang="en-US">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<link rel="schema.DC" href="http://purl.org/DC/elements/1.0/"/>
		<link rel="SHORTCUT ICON" href="//w3.ibm.com/favicon.ico"/>
		<link rel="ICON" href="//w3.ibm.com/favicon.ico"/>
		<meta name="DC.Rights" content="© Copyright IBM Corp. 2014"/>
		<meta name="Keywords" content="Contact 360,Sales,Connect"/>
		<meta name="DC.Date" scheme="iso8601" content="2014-11-14"/>
		<meta name="Source" content="Contact 360 for Sales Connect:IBM  authoring:IBM"/> <!-- Kindly change the "delivery" and "authoring" as per what is appropriate.  -->
		<meta name="Security" content="internal use only"/>
		<meta name="Abstract" content="Contact 360 for Sales Connect"/>
		<meta name="IBM.Effective" scheme="W3CDTF" content="2014-11-14"/>
		<meta name="DC.Subject" scheme="IBM_SubjectTaxonomy" content="Contact 360 for Sales Connect"/>
		<meta name="Owner" content="Mickael Jauneau/Spain/IBM"/>
		<meta name="DC.Language" scheme="rfc1766" content="en-US"/>
		<meta name="IBM.Country" content="US"/>
		<meta name="Robots" content="index,follow"/>
		<meta name="DC.Type" scheme="IBM_ContentClassTaxonomy" content="Marketing"/>
		<meta name="Description" content="Contact 360 for Sales Connect"/>
		<meta name="IBM.WTMCategory" scheme="IBM_WTMCategory" content="CONTACT360SC" />
		<meta name="IBM.WTMSite" content="CONTACT360Bluemix"/>
		
		<!-- Please ensure appropriate meta tag values are aligned with the standards -->
		
		<title>IBM Contact 360</title>
		<link href="//1.w3.s81c.com/common/v17/css/w3.css" rel="stylesheet" title="w3" type="text/css" />
		<script src="//1.w3.s81c.com/common/js/dojo/1.8/w3.js" type="text/javascript">
			//
		</script>
		<style>
			a:link {
				text-decoration: none;
			}

			a:visited {
				text-decoration: none;
			}
			a:hover {
				text-decoration: underline;
			}

			a:active {
				text-decoration: underline;
			}
		</style>
	</head>
	<body id="ibm-com">
		<div id="ibm-top" class="ibm-landing-page">
			<!-- MASTHEAD_BEGIN -->
			<%@include file="header.jsp" %>
			<!-- MASTHEAD_END -->
			<div id="ibm-pcon">
				<!-- CONTENT_BEGIN -->
				<div id="ibm-content">
					<div id="ibm-leadspace-head" class="ibm-alternate">
						<div id="ibm-leadspace-body">
							<h1>Open Contact Information</h1>
						</div>
					</div>
					<!-- CONTENT_BODY -->
					<div id="ibm-content-body">
						<div id="ibm-content-main">
							<!-- 6-4 6-2 grid -->
							<div class="ibm-columns">
								<div class="ibm-col-6-4">
									<div class="ibm-container">
										<h2>Enter a valid Email address or Trial Id</h2>
									</div>
									<p></p>
									<!--<div class="ibm-caution-link">${openContact.errorDescription}</div> -->
									<!-- Single Column Form -->
									<form action="openContact.action" class="ibm-column-form ibm-styled-form" method="get">
										<p>
											<label for="email">Email/Trial Id:<span class="ibm-required">*</span></label>
											<span><input name="param.email" id="email" size="40" value="" type="text" /></span>
										</p>
										<div class="ibm-rule"><hr/></div>
										<div class="ibm-columns">
											<div class="ibm-col-6-1">
												<p>
													<input class="ibm-btn-pri" name="ibm-submit" value="Submit" type="submit"/>
												</p>
											</div>
										</div>
									</form>
									<!-- FORM_END -->
								</div>
								<div class="ibm-col-6-2">
									<div class="ibm-container">
										<h2>Help</h2>
										<p>Please, enter a valid client email address in the field. </p>
									</div>
								</div>
							</div>
							<!-- 6-4 6-2 grid -->
						</div>
						<!-- FEATURES_BEGIN -->
						<div id="ibm-content-sidebar">
							<div id="ibm-contact-module">
								<!--IBM Contact Module-->
							</div>
							%%sidebarspace%%
						</div>
						<!-- FEATURES_END -->
						<!-- CONTENT_BODY_END -->
					</div>
				</div>
				<!-- CONTENT_END -->
				<!-- NAVIGATION_END -->
			</div>
			<!-- FOOTER_BEGIN -->
			<%@include file="footer.jsp" %>
			<!-- FOOTER_END -->
		</div>
		<div id="ibm-metrics">
			<script src="//w3.ibm.com/w3webmetrics/js/ntpagetag.js" type="text/javascript">
				//
			</script>
		</div>
	</body>
</html>