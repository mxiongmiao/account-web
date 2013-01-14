package com.maxm.account.dao.ibatis;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.maxm.account.dao.AccountDao;
import com.maxm.account.domain.Account;

public class SqlMapAccountDao implements AccountDao{
	
	private SqlMapClient sqlMapClient;
	
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@Override
	public void insertAccount(Account account) {
		try {
			this.sqlMapClient.insert("Account.insertAccount", account);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAccount(int id) {
		try {
			int delete = this.sqlMapClient.delete("Account.deleteById", id);
			System.out.println("deleted " + delete + " 条记录");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateAccount(Account account) {
		try {
			this.sqlMapClient.update("Account.updateAccount", account);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Account getAccountById(int id) {
		Account account=null;
		try {
			account = (Account)this.sqlMapClient.queryForObject("Account.getAccountById", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account;
	}
	
}
