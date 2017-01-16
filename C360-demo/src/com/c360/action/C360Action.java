package com.c360.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.c360.bean.SearchBean;
import com.c360.key.ApplicationKeys;
import com.c360.key.SessionKeys;
import com.c360.service.C360Service;

@Controller
public class C360Action extends BaseAction {
	private static final Logger logger = Logger.getLogger(C360Action.class);
	
	@Autowired
	private C360Service c360Service;

	public C360Service getC360Service() {
		return c360Service;
	}

	public void setC360Service(C360Service c360Service) {
		this.c360Service = c360Service;
	}
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String loadHomePage(Model model) {
//		String message = "<br><div style='text-align:center;'>"
//				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
//		return message;
				
				
		return "homePage";
	}
	
	@RequestMapping(value = "/Search360.action")
	public String search360(Model model) {
		if (!isLoggedIn()) {
			return "login";
		}
		
		if (session.getAttribute(SessionKeys.CAN_OPEN_SEARCH360) == null && session.getAttribute(SessionKeys.CAN_OPEN_SEARCH360).equals(Boolean.FALSE)) {
			model.addAttribute("errorKey", "user_failed_authenticate1");
			return "login";
		}
		
		List<SearchBean> searchList = null;
		
		try {
			searchList = c360Service.getSearch360List();
			model.addAttribute("searchList", searchList);
		} catch (Exception e) {
			logger.error("search360", e);
			model.addAttribute(
					"errorMessage", ApplicationKeys.ERROR_GENERIC_ERROR);
			return "error";
		}
		
		return "welcome360";
	}
}
