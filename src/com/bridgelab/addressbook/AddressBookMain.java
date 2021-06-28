package com.bridgelab.addressbook;

import java.util.Scanner;
import java.util.ArrayList;

/**************************************************************************
 * @author mihir
 * 
 * @since 28-June-2021
 * 
 * This class is having main method.
 * from here all the execution of the project will start.
 * From this class other classes will get called along with their functions.
 * Class accepting input from user.
 **************************************************************************/

public class AddressBookMain
{
	//Scanner object creation.
	public Scanner scannerObject = new Scanner(System.in);
	//ArrayList object creation
	ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();
	//Instantiating Service class object and in constructor passing scanner object.
	Service serviceObject = new Service(scannerObject);
	
	/**
	 * Name : chooseOption
	 * 
	 * Description : Displaying option to user to choose from.
	 * 
	 * Algorithm : In this method displaying user multiple option from switch statement.
	 * according to users choice respective method will get called.
	 * 
	 * Modification : First commit 28-June-2021
	 */
	public void chooseOption()
	{
		boolean isExit = false;
	    
	    while (!isExit) 
	    {
	      System.out.print("Enter options 1.Add-New Contacts : ");
		  int userInput = scannerObject.nextInt();
		  
	      switch (userInput)
	      	{
	        case 1:
	        		// Add New-Contact details.
	        		contactsArrayList.add(serviceObject.addNewContact());
	        		break;
	        default:
	        		System.out.println("Please enter valid input");
			}
		}
	}
	
	public static void main(String[] args)
	{
		AddressBookMain addressBookMainObject = new AddressBookMain();
		addressBookMainObject.chooseOption();
	}
}
