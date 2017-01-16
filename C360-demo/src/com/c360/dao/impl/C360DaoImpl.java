package com.c360.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.c360.bean.SearchBean;
import com.c360.dao.C360Dao;

public class C360DaoImpl implements C360Dao {
	private static Logger logger = Logger.getLogger(C360DaoImpl.class);
	
//	private SqlSession sqlSession;  
//	private SqlSession sqlSessionOds;  
//	private SqlSession sqlSessionRptV9; 
	private SqlSession sqlSessionEtlRpt;
	//private SqlSession sqlSessionXPS;
//	private SqlSession sqlSessionEtl;  
	
	@Override
	public List<SearchBean> getSearch360List() {
		logger.debug("MKT_RPT DAO");
		List<SearchBean> search360List = sqlSessionEtlRpt.selectList("rptV9GetSimulationData");
		System.out.println("\n\n******** search360List DAO = " + search360List);
		
		return search360List;
	}
	
	public SqlSession getSqlSessionEtlRpt() {
		return sqlSessionEtlRpt;
	}


	public void setSqlSessionEtlRpt(SqlSession sqlSessionEtlRpt) {
		this.sqlSessionEtlRpt = sqlSessionEtlRpt;
	}

//	public SqlSession getSqlSession() {
//		return sqlSession;
//	}
//
//	public void setSqlSession(SqlSession sqlSession) {
//		this.sqlSession = sqlSession;
//	}
//
//	public SqlSession getSqlSessionOds() {
//		return sqlSessionOds;
//	}
//
//	public void setSqlSessionOds(SqlSession sqlSessionOds) {
//		this.sqlSessionOds = sqlSessionOds;
//	}
//
//	public SqlSession getSqlSessionRptV9() {
//		return sqlSessionRptV9;
//	}
//
//	public void setSqlSessionRptV9(SqlSession sqlSessionRptV9) {
//		this.sqlSessionRptV9 = sqlSessionRptV9;
//	}
//
//	public SqlSession getSqlSessionXPS() {
//		return sqlSessionXPS;
//	}
//
//	public void setSqlSessionXPS(SqlSession sqlSessionXPS) {
//		this.sqlSessionXPS = sqlSessionXPS;
//	}
//
//	public SqlSession getSqlSessionEtl() {
//		return sqlSessionEtl;
//	}
//
//	public void setSqlSessionEtl(SqlSession sqlSessionEtl) {
//		this.sqlSessionEtl = sqlSessionEtl;
//	}
	

}
