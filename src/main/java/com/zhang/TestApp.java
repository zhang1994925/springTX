package com.zhang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhang.service.AccountService;

import jdk.jfr.internal.PrivateAccess;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestApp {

	@Autowired
	private AccountService accotService;

	@Test
	public void pub() {
//		String xmlPath = "applicationContext.xml";
//		@SuppressWarnings("resource")
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		accotService.transfer("jack", "rose", 1000);
	}
}