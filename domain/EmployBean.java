package com.bitcamp.domain;

public class EmployBean extends MemberBean{
		private String sabun;
		
		public void setSabus(String sabun) {
			this.sabun = sabun;
		}
		public String getSabum() {
			return sabun;
		}
		
		@Override
		public String toString() {
		return String.format("아이디:%s\n"
				+ "비밀번호 :%s\n"
				+ "이름:%s\n"
				+ "주민번호:%s\n"
				+ "사번:%s",getId(),getPw(),getName(),getSsn(),sabun);
		}
}
