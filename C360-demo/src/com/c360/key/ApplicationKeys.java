package com.c360.key;

public interface ApplicationKeys {
	String BLUEMIX = "BLUEMIX";
	String SECURITY_LDR = "SCRTY";
	String SILVERPOP = "SP-ENG";
	String WATSON_ANALYTICS = "WATSON";
	String SERVICE_ENGAGE = "SE-APM";
	
	String NO_DATA_FOUND = "No Data found at this time";
	String NO_TRIAL_DATA_FOUND = "No Trial Data found at this time";
	String NO_INTERACTION_DATA_FOUND = "No Interaction History Data found at this time";
	String ERROR_LOADING_DATA = "Error occurred while loading the data";
	
    String CUSTOMER_OFFER_HISTORY="HISTORY";
    String LATEST_CUSTOMER_OFFER="LATEST";
    String LATEST_CUSTOMER_OFFER_EQ_ZERO="LATESTEQZERO";
    String RECOMMEND_OFFER="RECOMMEND";
    String NULL_VALUE="Not available";
    String Job_title_NULL_VALUE="Job title: Not available";
    
    String ERROR_NONE_CODE="SUCCESS";
    String ERROR_NONE_DESC="SUCCESS";
    
    String ERROR_SERVER_CODE="500ERROR";
    String ERROR_SERVER_DESC="Server side error exists.";
    
    
    String ERROR_CODE_PREFER_01="PRE000001";
    String ERROR_DESC_PREFER_01="No preferences for this contact.";
    
    String ERROR_NO_OFFER_CODE="NOOFFER";
    String ERROR_NO_OFFER_DESC="Can not get the current offer.";
    
    String ERROR_NO_ACCT_HISTORY_OFFER_CODE="NOOFFER";
    String ERROR_NO_ACCT_HISTORY_OFFER_DESC="No account history offer found.";
    
    String ERROR_PARSE_DATE_OFFER_CODE="PARSEDATEERROR";
    String ERROR_PARSE_DATE_OFFER_DESC="Parse date error.";
    
    String ERROR_OFFER_NOT_AVAILABLE="Current accepted offer is not available.";
    String ERROR_CAMPAIGN_CODE_EMPTY="offer ID is empty for this contact's current accepted offer.";
    String ERROR_BJ_CODE_EMPTY="Buyer Journey Code is empty for this contact's current accepted offer.";
    
    String ERROR_INTEREST_NULL_CODE="NULLDATA";
    String ERROR_INTEREST_NULL_DESC="No interest that for this contact";
    
    String ERROR_PIPELINE_NULL_CODE="NULLDATA";
    String ERROR_PIPELINE_NULL_DESC="No pipeline  for this contact";
    
    String ERROR_KEY_GEN_ERROR="This page can't be refreshed for some security reasons. Please click the Contact 360 button and try again.";
    String ERROR_COMP_KEY_ERROR="Key match error. Please click the Contact 360 button in Leads Detail Page and try again.";
    
    String UnsupportedEncodingException="Unsupported utf-8 encoding for parameters.";
    
    String ERROR_DB_ERROR="Database is not responding and we are looking into it. Please try again later. If the issue persists contact the support at <a href=\"mailto:mktsystm@us.ibm.com\">mktsystm@us.ibm.com</a>.";
    String ERROR_GENERIC_ERROR="We are experiencing problems, please contact the support at <a href=\"mailto:mktsystm@us.ibm.com\">mktsystm@us.ibm.com</a>.";
    
    
    String [] PROACTIVE_LEAD_DATASOURCE={"IWM","GRP","THIRDPARTY","MATLEADSNC"};
    
    String  NO_TELE_PROACTIVE="No Tele Proactive";
    String  NO_TELE_AND_ELECTRONIC_PROACTIVE="No Outbound Marketing Emails for this Contact";
    
    String LATEST_OFFER_TYPE_PROACTIVE="PROACTIVE";
    
    String OFFER_URL_HEADER_HTTP="http://";
    
    String OFFER_URL_HEADER_HTTPS="https://";
    
    String OFFER_URL_HEADER_FTP="ftp://";
    
    int DOMAIN_USER_ITEMS_PER_PAGE = 10;
    
    String CURRENT_DATETIME_LABEL_FORMAT = "dd-MMM-yyyy, hh:mm a z";
 
}
