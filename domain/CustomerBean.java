package com.bitcamp.domain;

public class CustomerBean extends MemberBean{
	private String credit;
	
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getCredit() {
		return credit;
	}
	
	@Override
	public String toString() {
		return String.format("아이디:\n"
				+ "비밀번호 :\n"
				+ "이름 :\n"
				+ "주민번호 :\n"
				+ "신용도 :",getId(),getPw(),getName(),getSsn(),credit);
	}
}
