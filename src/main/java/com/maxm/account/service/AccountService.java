package com.maxm.account.service;

import com.maxm.account.dao.AccountDao;


public class AccountService {
	
	private AccountDao accountDao;
	
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
