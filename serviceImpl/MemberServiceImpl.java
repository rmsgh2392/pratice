package com.bitcamp.serviceImpl;
import com.bitcamp.domain.EmployBean;
import com.bitcamp.domain.CustomerBean;

import com.bitcamp.domain.EmployBean;
import com.bitcamp.domain.MemberBean;
import com.bitcamp.service.*;
public class MemberServiceImpl implements MemberService{
	
	private CustomerBean[] customers ;
	private EmployBean[] employers;
	private int count,cusCount,empCount ;
	
	public MemberServiceImpl() {
		customers = new CustomerBean[10];
		employers = new EmployBean[10];
		cusCount = 0;
		empCount = 0;
	}	
	
	
	@Override
	public void join(CustomerBean param) {
		customers[cusCount] = param;
		cusCount++;
		
	}
	
	public void register(EmployBean param) {
		employers [empCount] = param;
		empCount++;
	}


	@Override
	public CustomerBean[] findAllCustomers() {
		
		return customers;
	}

	@Override
	public EmployBean[] findAllAdmins() {
		
		return employers;
	}

	@Override
	public MemberBean[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(MemberBean param) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countAdmins() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existId(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePass(MemberBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberBean param) {
		// TODO Auto-generated method stub
		
	}

}
