package com.c360.action;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.c360.key.SessionKeys;

public class BaseAction {
	protected static Logger logger = Logger.getLogger(BaseAction.class);
	
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	
	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
	try {
		this.request.setCharacterEncoding("UTF-8");
		String path = request.getContextPath();
		request.setAttribute("appUrl", path);
	} catch (UnsupportedEncodingException e) {
		logger.error("this.request.setCharacterEncoding(\"UTF-8\");", e);
	}
		
		this.response = response;
		this.response.setContentType("application/x-www-form-urlencoded");
		this.response.setCharacterEncoding("UTF-8");
		this.session = request.getSession();
	}
	
	protected boolean isLoggedIn() {
		return session.getAttribute(SessionKeys.LOGIN_STATUS) != null && session.getAttribute(SessionKeys.LOGIN_STATUS).equals(Boolean.TRUE);
	}
	
	public String getNotNullParam(HttpServletRequest request,String paramName) throws Exception {
		String param = request.getParameter(paramName);
		if (param != null && param.equalsIgnoreCase("")) {
			param = URLDecoder.decode(request.getParameter(paramName), "utf-8");
		}
		
		return (param == null) ? "" :param.trim();
	}
	
	public Boolean checkEmail(String email){
		if (email == null) {
			return false;
		} else if (email.trim().equals("")) {
			return false;
		} else {
			Pattern pattern = Pattern
					.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		}
	}
}
