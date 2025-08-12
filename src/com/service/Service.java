package com.service;

import com.entity.Account;
import com.repo.Repo;

import ScannerUtil.ScannerUtil;

public class Service {
	private static Repo repo = new Repo();
	
	public void createAccount(Account acc)
	{
		System.out.println("Enter a Account Holder Name :");
		String name = ScannerUtil.scanner.next();
		acc.setAccount_holder_name(name);
		
		System.out.println("Enter a Balance ");
		double bal = ScannerUtil.scanner.nextDouble();
		acc.setBalance(bal);
		
		System.out.println("Enter a Account Type :");
		String type = ScannerUtil.scanner.next();
		acc.setAccount_type(type);
		
		repo.createAccount(acc);
	}
	
	public Account getAccountID() {
		System.out.println("Enter a Account number");
		String ac = ScannerUtil.scanner.next();
		Account acc = repo.getObject(ac);
		return acc;	
	}
	
	public void displayAccount() {
		Account acc = getAccountID();
		if(acc==null) {
			return;
		}
		System.out.println("Account number " + acc.getAccount_id());
		System.out.println("Account Holder name " + acc.getAccount_holder_name());
		System.out.println("Account Balance " + acc.getBalance());
		System.out.println("Account Type " + acc.getAccount_type());
	}

}
