package com.bitcamp.domain;

public class AccountBean {
	private String accountNum,today,money;
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public String getToday() {
		return today;
	}
	public String getMoney() {
		return money;
	}
	
	@Override
	public String toString() {
		return String.format("계좌번호 :%s\n"
				+ "오늘날짜 :%s\n"
				+ "돈 :%s",accountNum,today,money);
	}
}
