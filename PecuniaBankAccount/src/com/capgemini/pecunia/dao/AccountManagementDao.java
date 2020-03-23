package com.capgemini.pecunia.dao;

import java.util.HashMap;

import com.capgemini.pecunia.beans.Account;

public interface AccountManagementDao {

	boolean createAccount(Account account);
	
	HashMap<Integer, Account> display();

    Account updatedCustomerName(int accountId, String updatedName);

	Account updatedCustomerAddress(int accountId, String updatedAddress);

	Account updatedCustomerContact(int accountId, String updatedContact);

	Account deleteAccount(int accountId);

}
