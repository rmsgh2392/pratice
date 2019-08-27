package com.bitcamp.serviceImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.bitcamp.domain.AccountBean;
import com.bitcamp.service.*;
public class AccountServiceImpl implements AccountService{
	
	private AccountBean[] accounts;
	private int count;
	
	public AccountServiceImpl() {
		accounts = new AccountBean[10];
		count = 0;
	}
	
	@Override
	public void createAccount(int money) {
		AccountBean acc = new AccountBean();
		acc.setAccountNum(createAccountNum());
		acc.setToday(findDate());
		acc.setMoney(money+"");
		accounts[count] = acc;
		count++;
		
	}

	@Override
	public String createAccountNum() {
		Random random = new Random();
		int t1 = random.nextInt(8999)+1000;
		int t2 = random.nextInt(9999)+1;
		
		return String.format("%d-%04d", t1,t2);
	}

	@Override
	public AccountBean[] findAll() {
		AccountBean[] acc = new AccountBean[count];
		for(int i=0;i<count;i++) {
			acc[i] = accounts[i]; 
			}
			return acc;
		}
		
	
	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		
		for(int i=0;i<count;i++) {
			if(accountNum.equals(accounts[i].getAccountNum())) {
				account = accounts[i];
				break;
			}
		}
		return account;
	}

	@Override
	public int countAccounts() {
		
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean result = false;
		AccountBean account = new AccountBean();
		for(int i=0;i<count;i++) {
			if(findByAccountNum(accountNum)
					.equals(accounts[i].getAccountNum())) {
					result = true;
			}
		}
		return result;
	}

	@Override
	public String findDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		return sdf.format(date);
	}

	@Override
	public void depositMoney(AccountBean param) {
		String money = "";
		for(int i=0;i<count;i++) {
			if(param.equals(accounts[i])) {
				param.setMoney(money);
		}
	}
}
	@Override
	public void withdrawMoney(AccountBean param) {
		
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		
		for(int i=0;i<count;i++) {
			if(createAccountNum().equals(accounts[i].getAccountNum())) {
				accounts[i] = accounts[count-1];
				count--;
				break;
			}
		}
		
	}
}
