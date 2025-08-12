package com.controller;

import com.entity.Account;
import com.service.Service;
import ScannerUtil.ScannerUtil;

public class Main {
	private static Service sc = new Service();

	public static void main(String[] args) {

		System.out.println("Welcome to our bank!!!");
		while (true) {
			System.out.println("Press 1 : Create Account");
			System.out.println("Press 2 : Display Account Details");
			System.out.println("Press 3 : Deposite Money ");
			System.out.println("Press 4 : Withdraw Money");
			System.out.println("Press 5 : Check Account Balance");
			System.out.println("Press 6 : Exit");
			System.out.println("Enter a your choice :");

			int choice = ScannerUtil.scanner.nextInt();
			if (choice == 1) {
				Account acc = new Account();
				sc.createAccount(acc);
			} else if (choice == 2) {
				sc.displayAccount();
			} else if (choice == 3) {

			} else if (choice == 4) {

			} else if (choice == 5) {

			} else {
				System.out.println("Exit");
				break;
			}
		}
		System.out.println("Thank You for contact us ");

	}
}
