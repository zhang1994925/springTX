package com.zhang.serviceImpl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zhang.dao.AccountDao;
import com.zhang.daoImpl.AccountDaoImpl;
import com.zhang.service.AccountService;

@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService{

	AccountDao accountDao = new AccountDaoImpl();
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(String outer, String inner, Integer money) {
		accountDao.out(outer, money);
//		int i = 1/0;
		accountDao.in(inner, money);
	}
}