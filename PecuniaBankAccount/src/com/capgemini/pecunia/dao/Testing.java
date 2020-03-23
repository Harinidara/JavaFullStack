package com.capgemini.pecunia.dao;

import org.junit.Test;

import com.capgemini.pecunia.beans.Account;

public class Testing{
	AccountManagementDaoImpl dao=new AccountManagementDaoImpl();
	@SuppressWarnings("unused")
	@Test
	public void method1() throws Exception{
		String updatedName="";
		Account r=dao.updatedCustomerName(123456,updatedName);
		}
	@SuppressWarnings("unused")
	public void method2() throws Exception{
		String updatedContact="";
		Account r1=dao.updatedCustomerContact(123456,updatedContact);
		}
	@SuppressWarnings("unused")
	public void method3() throws Exception{
		String updatedAddress="";
		Account r2=dao.updatedCustomerAddress(123456, updatedAddress);
	}
}