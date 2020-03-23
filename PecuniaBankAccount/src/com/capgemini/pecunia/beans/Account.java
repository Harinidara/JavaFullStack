package com.capgemini.pecunia.beans;

public class Account {
	String customerName;
	String userName;
	String customerContact;
	String customerAadhar;
	String customerPan;
	String customerDob;
	String customerGender;
	String address;
	String city;
	String state;
	String country;
	String zipCode;
	int accountId;
	String accountType;
	String branch;
	Long amount;
	@Override
	public String toString() {
		return "AccountBeans [customerName=" + customerName + ", userName=" + userName + ", customerContact="
				+ customerContact + ", customerAadhar=" + customerAadhar + ", customerPan=" + customerPan
				+ ", customerDob=" + customerDob + ", customerGender=" + customerGender + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode
				+ ", accountId=" + accountId + ", accountType=" + accountType + ", branch=" + branch + ", amount="
				+ amount + "]";
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerAadhar() {
		return customerAadhar;
	}
	public void setCustomerAadhar(String customerAadhar) {
		this.customerAadhar = customerAadhar;
	}
	public String getCustomerPan() {
		return customerPan;
	}
	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}
	public String getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Account(String customerName, String userName, String customerContact, String customerAadhar,
			String customerPan, String customerDob, String customerGender, String address, String city, String state,
			String country, String zipCode, int accountId, String accountType, String branch, Long amount) {
		super();
		this.customerName = customerName;
		this.userName = userName;
		this.customerContact = customerContact;
		this.customerAadhar = customerAadhar;
		this.customerPan = customerPan;
		this.customerDob = customerDob;
		this.customerGender = customerGender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.accountId = accountId;
		this.accountType = accountType;
		this.branch = branch;
		this.amount = amount;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
