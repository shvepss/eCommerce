
package com.c360.service;

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
public interface AuthService {
	boolean validUser(String username, String password) ;
	boolean validGroup(String username, String groupName) ;
	String validUserFiveChar(String username);
	String getUserSerial(String username);
}
