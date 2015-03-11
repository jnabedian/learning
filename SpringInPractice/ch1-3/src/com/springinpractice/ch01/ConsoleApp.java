package com.springinpractice.ch01;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinpractice.ch01.model.Account;
import com.springinpractice.ch01.service.AccountService;

public class ConsoleApp {

	public static void main(String[] args) throws Exception {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("application-Context.xml");
		AccountService accountService = (AccountService)appCtx.getBean("accountService");
		List<Account> delinquentAccounts = accountService.findDelinquentAccounts();
		
		for (Account account : delinquentAccounts) {
			System.out.println(account.getAccountNo());
		}

		((ClassPathXmlApplicationContext)appCtx).close();
	}

}
