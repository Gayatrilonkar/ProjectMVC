package com.repo;

import com.entity.Account;

public class Repo {
	private static Account[] arr;
	private static int index ;

	static {
		arr = new Account[100];
	}

	public void createAccount(Account acc) {
		arr[index++] = acc;
		acc.setAccount_id("10020030" + index);
		System.out.println("Account No : "+ acc.getAccount_id());
		System.out.println("Account Created Sucessfully !!");
	}
	
	public Account getObject(String ac) {
		for(int i = 0; i<arr.length ; i++) {
			if(arr[i] != null && arr[i] .getAccount_id().equals(ac)) {
				return arr[i];
			}
		}
		return null;
	}

}