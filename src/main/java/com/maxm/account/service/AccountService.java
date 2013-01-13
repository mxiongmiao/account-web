package com.maxm.account.service;

import com.maxm.account.dao.AccountDao;


public class AccountService {
	
	private AccountDao accountDao;
	
	public void init(){
		if (accountDao==null) {
			throw new RuntimeException("first initialize accountDao");
		}
		System.out.println("AccountService init ...");
	}
	
	public void destory(){
		System.out.println("AccountService destroy ...");
	}
	
	public void addAccount(){
		accountDao.add();
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}
	
	
}
