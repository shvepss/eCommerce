
package com.c360.service.impl;

import org.apache.log4j.Logger;

import com.c360.service.AuthService;
import com.ibm.bluepages.BPResults;
import com.ibm.bluepages.BluePages;
import com.ibm.swat.password.ReturnCode;
import com.ibm.swat.password.cwa2;
import com.ibm.swat.password.cwaapi;

/**
 * @author yuqing
 * 
 * Created on May 8, 2009
 *  * (C) Copyright 2000-2002 by IBM Corporation
 *  All Rights Reserved.
 *  
 * This software is the confidential and proprietary information
 * of the IBM Corporation. ("Confidential Information"). Redistribution
 * of the source code or binary form is not permitted without prior authorization
 * from the IBM Corporation.
 */
public class AuthServiceImpl implements AuthService {
	private static Logger logger = Logger.getLogger(AuthServiceImpl.class);
	private static final int userChar = 5;
	public boolean validUser(String username, String password) {
		ReturnCode rc;
		cwa2 cwa = new cwa2("bluepages.ibm.com", "bluegroups.ibm.com");
		rc = cwa.authenticate(username, password, "bluepages.ibm.com");
		logger.info("rc is:" + rc.getCode() + " should be:" + cwaapi.SUCCESS.getCode());
		if (!rc.equals(cwaapi.SUCCESS)) {
			//username not found
			//credentials did not authenticate
			logger.error(rc.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean validGroup(String username, String groupName) {
		ReturnCode rc;
		cwa2 cwa = new cwa2("bluepages.ibm.com", "bluegroups.ibm.com");
		 rc = cwa.inAGroup(username, groupName);
		 if (rc.equals(cwaapi.NOT_IN_GROUP)) {
			 logger.error(rc.getMessage());
			 return false;
		 }
		 return true;
	}
	
	public String validUserFiveChar(String username) {
//		String userID=null;
//		String usernamePeriod=null;
		String usernameCut = "";
		if (username.contains(".")) {
			username = username.replace(".", ""); 
		}
		if (username.indexOf("@") != -1) {
                 usernameCut = username.substring(0, username.indexOf("@"));
		}
		
		int usernameCutLen = usernameCut.length();
		   if (usernameCutLen < userChar && usernameCutLen != 0) {
			   username = usernameCut;
		   } else {
			   username = username.substring(0, userChar);
		}
		
		return username;
	}
	
	public String getUserSerial(String username){
		String serial = null;
		BPResults person = BluePages.getPersonsByInternet(username);
        if(person.succeeded() && person.rows() == 1) {
            serial = person.getRow(0).get("CNUM");
            logger.debug("Intranet ID: " + username + ", Serial number: " + serial);
        } else {
            logger.error("Error getting user country: " + person.getStatusMsg());
        }
		return serial;
	}
}
