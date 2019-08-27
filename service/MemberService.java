package com.bitcamp.service;
import com.bitcamp.domain.*;
public interface MemberService {
	void join(CustomerBean param);
	CustomerBean[] findAllCustomers();
	EmployBean[] findAllAdmins();
	MemberBean[] findByName(String name); // 고객, 사원 공용메소드
	MemberBean findById(String id); // 고객, 사원 공용메소드
	boolean login(MemberBean param); // 고객, 사원 공용메소드
	int countCustomers(); // 고객수
	int countAdmins(); // 직원수
	boolean existId(String id);
	void updatePass(MemberBean param);
	void deleteMember(MemberBean param);
	public void register(EmployBean param);
}	
