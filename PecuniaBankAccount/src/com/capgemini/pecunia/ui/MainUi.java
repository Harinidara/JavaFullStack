package com.capgemini.pecunia.ui;

import java.util.HashMap;
import java.util.Scanner;
import com.capgemini.pecunia.beans.Account;

import com.capgemini.pecunia.service.AccountManagementServiceImpl;

public class MainUi {

	static AccountManagementServiceImpl service = new AccountManagementServiceImpl();
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
	   while(true) {
			System.out.println("1.create a account");
			System.out.println("2.show account details");
			System.out.println("3.update customer name");
			System.out.println("4.update customer address");
			System.out.println("5.update customer contact");
			System.out.println("6.delete account");
			System.out.println("7.exit");
			System.out.println("enter option");
			int option = scan.nextInt();
		switch (option) {
		case 1:
			System.out.println("Enter customer name");
			String customerName = scan.next();
			while (!(customerName.charAt(0) >= 'A' && customerName.charAt(0) <= 'Z')) {
				System.out.println("First letter should be in capitals");
				customerName = scan.next();}
				System.out.println("Enter user name");
				String userName = scan.next();
				System.out.println("Enter contact number");
				String customerContact = scan.next();
				while(!(customerContact.length()==10&&((customerContact.charAt(0) == '6') || (customerContact.charAt(0) == '7')
						|| (customerContact.charAt(0) == '8') || (customerContact.charAt(0) == '9')))) {
					System.out.println("phone number should be 10digits");
					System.out.println("phone number should start with 6 or 7 or 8 or 9");
					System.out.println("Enter phone number");
					customerContact = scan.next();
					}
				System.out.println("Enter Aadhar number ");
				String customerAadhar = scan.next();
				while(!(customerAadhar.length()==12)) {
					System.out.println("Aadhar number  should be 10digits");
					System.out.println("enter Aadhar number");
					customerAadhar = scan.next();
				}
				System.out.println("Enter pan details");
				String customerPan = scan.next();
				@SuppressWarnings("unused") int countalpha=0;
				@SuppressWarnings("unused") int countnumber=0;
				for(int i=0;i<customerPan.length();i++)
				{
					if(i<5 || i==9)
					if((customerPan.charAt(i)>='a' && customerPan.charAt(i)<='z') || (customerPan.charAt(i)>='A' && customerPan.charAt(i)<='Z'))
				     countalpha++;
				    if(i>=5 && i<9)
				     countnumber++;
				}
				
				System.out.println("Enter date of birth");
				String customerDob = scan.next();
				System.out.println("Enter gender");
				String customerGender = scan.next();
				while (!(customerGender.equalsIgnoreCase("male") ||customerGender.equalsIgnoreCase("female"))) {
					System.out.println("Gender should be male or female");
					customerGender = scan.next();
				}
				System.out.println("Enter address");
				String address = scan.next();
				System.out.println("Enter city");
				String city = scan.next();
				System.out.println("Enter state");
				String state = scan.next();
				System.out.println("Enter country");
				String country = scan.next();
				System.out.println("Enter Zipcode");
			    String zipCode = scan.next();
			    System.out.println("Enter account id");
				int accountId=scan.nextInt();
				System.out.println("Enter branch");
				String branch = scan.next();
				System.out.println("Enter account type");
				String accountType = scan.next();
				System.out.println("Enter amount");
				Long amount = scan.nextLong();
				Account account=new Account(customerName,userName,customerContact,customerAadhar,customerPan,customerDob,customerGender,address,city,state,country,zipCode,accountId,accountType,branch,amount);
				boolean res=service.createAccount(account);
				if(res==true) {
					System.out.println("Your account was successfully created");
				}else {
					System.out.println("Your account was not created");
				}
				break;
			
		case 2:
		{
			System.out.println("display all account details");
	        HashMap<Integer,Account> h=service.display();
	        if(h==null){
	        	System.out.println(" no records");
	        }else{
	        	System.out.println(h);
	        }
		}			break;
		case 3:
			System.out.println("Enter account id");
			accountId = scan.nextInt();
			System.out.println("Enter new name");
			String updatedName = scan.next();
			Account uName=service.updatedCustomerName(accountId, updatedName);
			System.out.println(uName);
			break;
		case 4:
			System.out.println("Enter account id");
			accountId = scan.nextInt();
			System.out.println("Enter new address");
			String updatedAddress = scan.next();
			Account uAddress=service.updatedCustomerAddress(accountId, updatedAddress);
			System.out.println(uAddress);
             break;
		case 5:
			System.out.println("Enter account id");
			accountId = scan.nextInt();
			System.out.println("Enter new contact number");
			String updatedContact = scan.next();
			Account uContact=service.updatedCustomerContact(accountId, updatedContact);
			System.out.println(uContact);
			break;
		case 6:
			System.out.println("Enter account id");
			accountId = scan.nextInt();
		     Account res1=service.deleteAccount(accountId);
		     if(res1==null) {
			System.out.println("Your account was successfully deleted");
		     }else {
		    	 System.out.println("not deleted");
		     }
			break;
		default :
			scan.close();
			System.out.println("Thankyou!!");
			System.exit(0);
		}

	}
}
}