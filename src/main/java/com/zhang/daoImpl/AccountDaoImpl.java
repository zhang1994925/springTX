package com.zhang.daoImpl;

import com.zhang.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	
	@Override
	public void out(String userName, Integer money) {
		this.getJdbcTemplate().update("update account set money = money - ? where username = ?", money, userName);
	}

	@Override
	public void in(String userName, Integer money) {
		this.getJdbcTemplate().update("update account set money = money + ? where username = ?",  money, userName);
	}
}