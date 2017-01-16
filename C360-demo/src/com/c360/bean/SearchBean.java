package com.c360.bean;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class SearchBean {

	private String scId;
	private String countryName;
	private String email;
	private String individualId;
	public String getScId() {
		return scId;
	}
	public void setScId(String scId) {
		this.scId = scId;
	}

	public String getIndividualId() {
		if(individualId == null)
			return null;
		try{
			return URLEncoder.encode(individualId,"UTF-8");
		}catch(UnsupportedEncodingException ue){
			ue.printStackTrace();
		}
		return individualId;
	}
	public void setIndividualId(String individualId) {
		this.individualId = individualId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	
}
