package com.bridgelab.addressbook;

import java.util.Scanner;

/************************************************************************
 * @author mihir
 * 
 * @since 28-June-2021
 * 
 * This class will hold all the business logic nothing but methods.
 * Method like addNewContact(),editExistingContact(), and deleteContact(). 
 ************************************************************************/

public class Service
{
	Scanner scannerObject;
	//Creating object of Contacts class.
	Contacts contactsObject = new Contacts();
	
	
	/**
	 * Name : Service ( Constructor )
	 * 
	 * Description : Passing scanner object in a constructor.
	 * Scanner object is being passed from {@link AddressBookMain} class to {@link Service} class.
	 * 
	 * @param scannerObject
	 */
	public Service(Scanner scannerObject)
	{
		this.scannerObject = scannerObject;
	}
	
	/**
	 * Name : addNewContact
	 * 
	 * Description : Adding new contact to AddressBook.
	 * 
	 * Algorithm : In this method accepting all necessary contact details from user,
	 * and returning those all details to store in AddressBook as a new contact.
	 *  
	 * @return Contacts object type which holds all the details.
	 * 
	 * Modification : First commit 28-June-2021.
	 */
	public Contacts addNewContact()
	{
		System.out.print("Enter First Name : ");
		contactsObject.setFirstName(scannerObject.next());
		
		System.out.print("Enter Lirst Name : ");
		contactsObject.setLastName(scannerObject.next());
		
		System.out.print("Enter Address : ");
		contactsObject.setAddress(scannerObject.next());
		
		System.out.print("Enter City : ");
		contactsObject.setCity(scannerObject.next());
		
		System.out.print("Enter State : ");
		contactsObject.setState(scannerObject.next());
		
		System.out.print("Enter ZipCode : ");
		contactsObject.setZipCode(scannerObject.nextInt());
		
		System.out.print("Enter Phone-Number : ");
		contactsObject.setPhoneNumber(scannerObject.nextLong());
		
		System.out.print("Enter Email-Id : ");
		contactsObject.setEmailId(scannerObject.next());
		
		return contactsObject;
	}
}
