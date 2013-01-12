package com.maxm.account.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maxm.account.dao.AccountDao;

public class TestAccountService {
	
	private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	private AccountService accountService;
	
	@Before
	public void setUp(){
		accountService=(AccountService)context.getBean("accountService");
	}
	
	@Test
	public void test_Spring的set注入方式(){
		String desc = accountService.getAccountDao().getDesc();
		Assert.assertEquals("accountDao desc", desc);
	}
	
	@Test
	public void testAddAccount(){
		accountService.addAccount();
	}
	
	@Test
	public void test_Spring的scope(){
		// 因为 accountService 的 scope 是 singleton , 所以只实例化一次，每次取出的是同一个,spring默认是singleton
		Assert.assertEquals(accountService, (AccountService)context.getBean("accountService"));
	}
}
