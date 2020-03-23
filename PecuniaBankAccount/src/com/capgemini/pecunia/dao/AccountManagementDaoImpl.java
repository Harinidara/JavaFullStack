package com.capgemini.pecunia.dao;

import java.util.HashMap;

import com.capgemini.pecunia.beans.Account;

public class AccountManagementDaoImpl implements AccountManagementDao {
	
	HashMap<Integer,Account> hm=new HashMap();

	public boolean createAccount(Account account) {
		hm.put(account.getAccountId(),account);
		Account acc=hm.get(account.getAccountId());
		if(acc==null){
			return false;
		}else{
		return true;}}
 	@Override
	public HashMap<Integer, Account> display() {
		// TODO Auto-generated method stub
		return hm;
	}
 
	public Account updatedCustomerName(int accountId, String updatedName) {
		Account acc1=new Account();
		acc1.setCustomerName(updatedName);
		return hm.get(acc1);
	}

	public Account updatedCustomerAddress(int accountId, String updatedAddress) {
		Account acc2=new Account();
    acc2.setAddress(updatedAddress);
		return hm.get(acc2);
	}

	public Account updatedCustomerContact(int accountId, String updatedContact) {
		Account acc3=new Account();
		acc3.setCustomerContact(updatedContact);
		return hm.get(acc3);
	}

	public Account deleteAccount(int accountId) {
		return hm.remove(accountId);
	}

}