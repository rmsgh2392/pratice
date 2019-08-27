package com.bitcamp.service;
import com.bitcamp.domain.*;
public interface AccountService {
	void createAccount(int money);
	public String createAccountNum();
	// 계좌번호 생성(1234-5678)
	AccountBean[] findAll();
	AccountBean findByAccountNum(String accountNum);
	int countAccounts();
	boolean existAccountNum(String accountNum);
	String findDate(); // 오늘날짜, 현재시간(분까지) 반환
	void depositMoney(AccountBean param);
	void withdrawMoney(AccountBean param);
	void deleteAccountNum(String accountNum);
}
