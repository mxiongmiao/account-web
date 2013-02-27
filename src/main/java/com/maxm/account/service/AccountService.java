package com.maxm.account.service;

import java.util.HashMap;
import java.util.Map;

import com.maxm.account.dao.AccountDao;
import com.maxm.account.domain.Account;
import com.maxm.account.util.ErrorCode;


public class AccountService {

    private AccountDao accountDao;

    public Map<Integer, String> addAccount(Account account) {
        Map<Integer, String> ret = new HashMap<Integer, String>();
        String name = account.getName();
        if (duplicate(name)) {
            ret.put(ErrorCode.ACCOUNTNAMEDUPLICATE, "重复的账户名");
        } else {
            accountDao.insertAccount(account);
        }
        return ret;
    }

    private boolean duplicate(String name) {
        Account accountByName = accountDao.getAccountByName(name);
        if (accountByName != null) {
            return true;
        }
        return false;
    }

    public void deleteAccount(int id){
        accountDao.deleteAccount(id);
    }

    public void updateAccount(Account account){
        accountDao.updateAccount(account);
    }

    public Account getAccount(int id) {
        Account account = accountDao.getAccountById(id);
        return account;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

}
