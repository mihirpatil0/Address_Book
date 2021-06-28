package com.bridgelab.addressbook;

/**************************************************************
 * @author mihir
 * 
 * @since 28-June-2021
 * 
 * This class will acts as POJO class.
 * Class contains private variables, their getter and setter.
 * overriding toString() method.
 **************************************************************/

public class Contacts
{
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private long phoneNumber;
	private String emailId;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	  @Override public String toString() 
	  { 
		  return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" +
				  city + ", state=" + state + ", zipCode=" + zipCode + ", phoneNumber=" +
				  phoneNumber + ", emailId=" + emailId + "]";
	  }
}
