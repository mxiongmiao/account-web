package com.maxm.account.dao;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maxm.account.dao.ibatis.SqlMapAccountDao;
import com.maxm.account.domain.Account;

public class TestSqlMapAccountDao {
	private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	private SqlMapAccountDao sqlMapAccountDao;
	
	@Before
	public void setUp(){
		sqlMapAccountDao = (SqlMapAccountDao)context.getBean("sqlMapAccountDao");
	}
	
	@Test
	public void test_插入一条数据(){
		Account account = new Account();
		account.setName("twwiter");
		account.setUrl("http://www.twwiter.com");
		account.setUserName("maxiongmiao");
		account.setPwd("123456");
		account.setEmail("maxm09@163.com");
		sqlMapAccountDao.insertAccount(account);
	}
	
	@Ignore
	public void test_根据id查找一条记录(){
		int id=2;
		Account account = sqlMapAccountDao.getAccountById(id);
		Assert.assertEquals(2, account.getId());
	}
	
	@Ignore
	public void test_更新一条记录(){
		int id=7;
		Account account = sqlMapAccountDao.getAccountById(id);
		
		String name="github";
		String url="http://www.github.com";
		account.setName(name);
		account.setUrl(url);
		
		sqlMapAccountDao.updateAccount(account);
	}
	
	@Ignore
	public void test_根据id删除一条记录(){
		int id=11;
		sqlMapAccountDao.deleteAccount(id);
	}
}
