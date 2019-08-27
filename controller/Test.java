package com.bitcamp.controller;
import com.bitcamp.serviceImpl.*;
import com.bitcamp.service.*;
public class Test {

	public static void main(String[] args) {
		
		AccountService a = new AccountServiceImpl();
		a.createAccountNum();
		System.out.println(a);
	
	}

}
