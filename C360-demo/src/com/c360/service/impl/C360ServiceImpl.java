package com.c360.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c360.bean.SearchBean;
import com.c360.dao.C360Dao;
import com.c360.service.C360Service;

@Service
public class C360ServiceImpl implements C360Service {
	private static Logger logger = Logger.getLogger(C360ServiceImpl.class);

	@Autowired
	private C360Dao c360Dao;
	
	@Override
	public List<SearchBean> getSearch360List() throws Exception {
		logger.debug("MKT_RPT Service");
		List<SearchBean> search360List = c360Dao.getSearch360List();
		
		System.out.println("\n\n******** search360List SERVICE = " + search360List);
		return search360List;
	}
	
//	public C360Dao getC360Dao() {
//		return c360Dao;
//	}
//	
//	public void setC360Dao(C360Dao c360Dao) {
//		this.c360Dao = c360Dao;
//	}
}
