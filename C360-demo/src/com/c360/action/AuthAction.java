package com.c360.action;

import javax.naming.InitialContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.c360.key.SessionKeys;
import com.c360.service.AuthService;

@Controller 
public class AuthAction extends BaseAction{
	private static final Logger logger = Logger.getLogger(AuthAction.class);
	
	
	@Autowired
	AuthService authService=null;
	
	
	@RequestMapping(value = "/WebAuth.action")  
	public String authenticate(@RequestParam(value="username",required=true,defaultValue="") final String username,@RequestParam(value="password",required=true,defaultValue="") final String password,Model model) throws Exception {
	    InitialContext initialContext = new javax.naming.InitialContext();  
	    String bluegroupOpenContact = (String) initialContext.lookup("java:comp/env/bluegroupOpenContact");
	    String bluegroupSearch360 = (String) initialContext.lookup("java:comp/env/bluegroupSearch360");
		
		if (isLoggedIn()) {
			session.setAttribute(SessionKeys.CAN_AJAX_FLAG, "success");
			if (session.getAttribute(SessionKeys.CAN_OPEN_SEARCH360) != null && session.getAttribute(SessionKeys.CAN_OPEN_SEARCH360).equals(Boolean.TRUE)) {
				return "redirect:/Search360.action";
			}
			return "redirect:/openContact.action";
		}
		if (username == null || "".equalsIgnoreCase(username)) {
			model.addAttribute("errorKey", "user_name_empty");
			return "login";
		}
		if (password == null || "".equalsIgnoreCase(password)) {
			model.addAttribute("errorKey", "user_password_empty");
			return "login";
		}
		
		final AuthenticationResult r = new AuthenticationResult();
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				r.result = authService.validUser(username, password);
			}
		});
		thread.run();
		thread.join();
		if (!r.result) {
			model.addAttribute("errorKey", "user_failed_authenticate2");
			return "login";
		}
		
		String userID = authService.validUserFiveChar(username);
		session.setAttribute(SessionKeys.CAN_OPEN_CONTACT, Boolean.valueOf(authService.validGroup(username, bluegroupOpenContact)));
		session.setAttribute(SessionKeys.CAN_OPEN_SEARCH360, Boolean.valueOf(authService.validGroup(username, bluegroupSearch360)));
		session.setAttribute(SessionKeys.LOGIN_STATUS, Boolean.valueOf(true));
		session.setAttribute(SessionKeys.USER_ID, userID);
		session.setAttribute(SessionKeys.USER_EMAIL_ADDRESS, username);
		session.setAttribute(SessionKeys.CAN_AJAX_FLAG, "success");
		session.setAttribute(SessionKeys.USER_SERIAL_NUMBER, authService.getUserSerial(username));
		if (session.getAttribute(SessionKeys.REQUEST_URL) != null) {
			logger.info("user jump to:" + session.getAttribute(SessionKeys.REQUEST_URL).toString());
			return "redirect:" + session.getAttribute(SessionKeys.REQUEST_URL);
		}
		logger.info("Request url in session is : " + session.getAttribute(SessionKeys.REQUEST_URL));
		if (session.getAttribute(SessionKeys.CAN_OPEN_SEARCH360) != null && session.getAttribute(SessionKeys.CAN_OPEN_SEARCH360).equals(Boolean.TRUE)) {
			return "redirect:/Search360.action";
		}
		return "redirect:/openContact.action";
	}
	
	private class AuthenticationResult{
		public boolean result = false;
	}
}