package com.capgemini.pecunia.service;

import java.util.HashMap;

import com.capgemini.pecunia.beans.Account;
import com.capgemini.pecunia.dao.AccountManagementDaoImpl;
//import com.capgemini.pecunia.repository.AccountBean;

public class AccountManagementServiceImpl implements AccountManagementService {
	AccountManagementDaoImpl dao=new AccountManagementDaoImpl();
@Override
	public boolean createAccount(Account account) {
		return dao.createAccount(account);
	}
@Override
	public HashMap<Integer, Account> display() {
		// TODO Auto-generated method stub
		return dao.display();
	}
	
    @Override
	public Account updatedCustomerName(int  accountId, String updatedName) 
    {
	     
	  return dao.updatedCustomerName(accountId,updatedName);
		
		
	}
    @Override
	public Account updatedCustomerAddress(int accountId, String updatedAddress) {
    	
		return dao.updatedCustomerAddress(accountId, updatedAddress);
    }
    @Override
	public Account updatedCustomerContact(int  accountId, String updatedContact) {
		return dao.updatedCustomerContact(accountId, updatedContact);
		
	}
    @Override
	public Account deleteAccount(int accountId) {
		return dao.deleteAccount(accountId);
		
		
	}
   
}