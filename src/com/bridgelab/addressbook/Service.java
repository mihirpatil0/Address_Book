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
	Scanner scannerObject = new Scanner(System.in);
	//Creating reference for Contacts class.
	Contacts[] contactArray;
	
	/**
	 * Name : Service ( Constructor )
	 * 
	 * Description : Passing arraySize for contactArray[].
	 * instantiating contactArray with the user passed value (length).
	 * 
	 * @param arraySize
	 */
	public Service(int arraySize)
	{
		contactArray = new Contacts[arraySize];
	}
	
	/**
	 * Name : addNewContact
	 * 
	 * Description : Adding new contact to AddressBook.
	 * 
	 * Algorithm : In this method accepting all necessary contact details from user,
	 * and adding those all details to store in AddressBook as a new contact.
	 *  
	 * @return Contacts object type which holds all the details.
	 * 
	 * Modification : First commit 28-June-2021.
	 */
	public void addNewContact()
	{
		for(int i = 0; i < contactArray.length; i++)
		{
			Contacts contactsObject = new Contacts();
			
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
			
			contactArray[i] = contactsObject;
			System.out.println("\nContact added successfully.\n");
		}
	}
	
	/**
	 * Name : displayContacts
	 * 
	 * Description : Displaying all the contact to user.
	 * 
	 * Algorithm : Using for each loop to traverse through array.
	 * and printing records rows one by one.
	 * 
	 * Modification : Fist Commit 29-June-2021
	 */
	public void displayContacts()
	{
		for(Contacts element : contactArray)
		{
			if(element != null)
			{
				System.out.println(element);
			}
		}
	}
}
