package com.maxm.account.dao;

import com.maxm.account.domain.Account;


public interface AccountDao {

	void insertAccount(Account account);
	
	void deleteAccount(int id);
	
	void updateAccount(Account account);
	
	Account getAccountById(int id);

	Account getAccountByName(String name);
	
}
