package com.zhang.dao;

public interface AccountDao {
	String userName = "";
	Integer money = 0;
	public void out(String userName, Integer money);
	public void in(String userName, Integer money);
}