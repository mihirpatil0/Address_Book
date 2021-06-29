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
	 * Name : editFullContact
	 * 
	 * Description : Asking user to enter mobile number associated contact will be edited.
	 * 
	 * Algorithm : Taking input from user mobile number because that will be unique,
	 * fetching associated record to that mobile number.
	 * asking user to choose which field from contact you want to edit.
	 * accordingly user will enter new value that is to be set to respective field of contact.
	 * 
	 * Modification : First Commit 29-June-2021
	 */
	public void editFullContact()
	{
		System.out.print("Enter mobile number to select the contact to be edited : ");
		int searchMNumber = scannerObject.nextInt();
		System.out.println("Select filed number that you want to edit :\n1.Edit First-Name,\n2.Edit Last-Name,\n3.Edit Address,\n4.Edit City.\n5.Edit State,\n6.Edit ZipCode,\n7.Edit Phone-Number,\n8.Edit EmailId.\n");
		int fieldNumber = scannerObject.nextInt();
		switch(fieldNumber) 
		{
			case 1:
					//Edit Fist-Name
					System.out.print("What new first name you want to set : ");
					String editFistName = scannerObject.next();
					for(int i = 0; i < contactArray.length; i++)
					{
						if(contactArray[i].getPhoneNumber() == searchMNumber)
						{
							contactArray[i].setFirstName(editFistName);
							System.out.println("\nFirst-Name of respective contact has been successfully edited.\n");
						}
					}
					
					break;
			case 2:
					//Edit Last-Name
					System.out.print("What new last name you want to set : ");
					String editLastName = scannerObject.next();
					for(int i = 0; i < contactArray.length; i++)
					{
						if(contactArray[i].getPhoneNumber() == searchMNumber)
						{
							contactArray[i].setLastName(editLastName);
							System.out.println("\nLast-Name of respective contact has been successfully edited.\n");
						}
					}
					break;
			case 3:
					//Edit Address
					System.out.print("What new address you want to set : ");
					String editAddress = scannerObject.next();
					for(int i = 0; i < contactArray.length; i++)
					{
						if(contactArray[i].getPhoneNumber() == searchMNumber)
						{
							contactArray[i].setAddress(editAddress);
							System.out.println("\nAddress of respective contact has been successfully edited.\n");
						}
					}
					break;
			case 4:
					//Edit City
					System.out.print("What new city you want to set : ");
					String editCity = scannerObject.next();
					for(int i = 0; i < contactArray.length; i++)
					{
						if(contactArray[i].getPhoneNumber() == searchMNumber)
						{
							contactArray[i].setCity(editCity);
							System.out.println("\nCity of respective contact has been successfully edited.\n");
						}
					}
					break;
			case 5:
					//Edit State
					System.out.print("What new state you want to set : ");
					String editState = scannerObject.next();
					for(int i = 0; i < contactArray.length; i++)
					{
						if(contactArray[i].getPhoneNumber() == searchMNumber)
						{
							contactArray[i].setState(editState);
							System.out.println("\nState of respective contact has been successfully edited.\n");
						}
					}
					break;
			case 6:
					//Edit ZipCode
					System.out.print("What new zipcode you want to set : ");
					int editZipCode = scannerObject.nextInt();
					for(int i = 0; i < contactArray.length; i++)
					{
						if(contactArray[i].getPhoneNumber() == searchMNumber)
						{
							contactArray[i].setZipCode(editZipCode);
							System.out.println("\nZip-Code of respective contact has been successfully edited.\n");
						}
					}
					break;
			case 7:
					//Edit Mobile-Number
					System.out.print("What new mobile number you want to set : ");
					long editPhoneNumber = scannerObject.nextLong();
					for(int i = 0; i < contactArray.length; i++)
					{
						if(contactArray[i].getPhoneNumber() == searchMNumber)
						{
							contactArray[i].setPhoneNumber(editPhoneNumber);
							System.out.println("\nMobile-Number of respective contact has been successfully edited.\n");
						}
					}
					break;
			case 8:
					//Edit Email-id
					System.out.print("What new email-id you want to set : ");
					String editEmailId = scannerObject.next();
					for(int i = 0; i < contactArray.length; i++)
					{
						if(contactArray[i].getPhoneNumber() == searchMNumber)
						{
							contactArray[i].setEmailId(editEmailId);
							System.out.println("\nEmail-Id of respective contact has been successfully edited.\n");
						}
					}
					break;
			default:
					System.out.println("Incorrect Entry !");
		}
	}
	
	/**
	 * Name : deleteContact
	 * 
	 * Description : Deleting contact as per user input.
	 * 
	 * Algorithm : Taking mobile number because it will be unique to delete associated contact.
	 * Iterating over array to get the exact match record once we get it making that record as null.
	 * Which is considered to be deleted.
	 * 
	 * Modification : First commit 29-June-2021
	 */
	public void deleteContact()
	{
		System.out.print("\nGive a mobile number to deleted associated contact : ");
		long searchNumber = scannerObject.nextLong();
		for(int i = 0; i < contactArray.length; i++)
		{
			if(contactArray[i].getPhoneNumber() == searchNumber)
			{
				contactArray[i] = null;
				System.out.println("\nContact successfully deleted\n");
				break;
			}
		}
	}
}
