package com.bitcamp.controller;
import java.util.Random;

import javax.swing.JOptionPane;

import com.bitcamp.domain.*;
import com.bitcamp.service.*;
import com.bitcamp.serviceImpl.*;
public class AdminController {

	public static void main(String[] args) {
		AccountBean acc = null;
		AccountBean[] accounts = new AccountBean[10];
		AccountService ac = new AccountServiceImpl();
		
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.계좌계설\n"
					+ "2.계좌번호 찾기\n"
					+ "3.같은 계좌 여")) {
			case "1":
				ac.createAccount(555555);
				ac.createAccount(666666);
				System.out.println(ac.findAll()[0]);
				System.out.println(ac.findAll()[1]);
				break;
			case "2":
			acc = new AccountBean();
			acc = ac.findByAccountNum(JOptionPane.showInputDialog("계좌번호:"));
			JOptionPane.showMessageDialog(null, acc.toString());
			break;
			
			case "3":
				String accountNum = JOptionPane.showInputDialog("계좌번호 입력");
				System.out.println(ac.existAccountNum(accountNum));
			default:
				break;
			}
		}
	}

}
