package com.maxm.account.dao;

public class AccountDao {
	
	private String desc;
	
	public AccountDao() {
		super();
		System.out.println("new AccountDao");
	}
	
	public void add(){
		System.out.println("add account");
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
	
}
