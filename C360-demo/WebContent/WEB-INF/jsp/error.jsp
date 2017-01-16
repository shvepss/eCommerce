<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en-US" xml:lang="en-US">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<link rel="schema.DC" href="http://purl.org/DC/elements/1.0/"/>
		<link rel="SHORTCUT ICON" href="//w3.ibm.com/favicon.ico"/>
		<link rel="ICON" href="//w3.ibm.com/favicon.ico"/>
		
		<title>IBM Contact 360 Error Page</title>
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
							<h1>Error</h1>
						</div>
					</div>
					<!-- CONTENT_BODY -->
					<div id="ibm-content-body">
						<div id="ibm-content-main">
							<!-- 6-4 6-2 grid -->
							<div class="ibm-columns">
								<div class="ibm-col-6-4" style="height: 300px;">
									<c:if test="${fn:length(errorMessage)>0}">
												${errorMessage}
												</c:if>
												
									<!-- FORM_END -->
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
	
		</div>
	</body>
</html>