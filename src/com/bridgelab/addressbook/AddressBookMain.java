package com.bridgelab.addressbook;

import java.util.Scanner;

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
	//Creating reference for Service class.
	Service serviceObject = null;
	
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
		    System.out.print("Enter number options:\n1.Add-New Contacts:\n2.Edit Contact:\n3.Delete Contact:\n4.Display All Contacts:\n5.Exit:\n");
			int userInput = scannerObject.nextInt();
			switch (userInput)
		    {
			    case 1:
			    		// Add New-Contact details.
			        	System.out.print("\n" + "How many number of records you want to store : ");
			        	int arraySize = scannerObject.nextInt();
			        	serviceObject = new Service(arraySize);
			        	serviceObject.addNewContact();
			        	break;
			    case 2:	
			    		//Edit contacts.
			    		serviceObject.editFullContact();
				        break;
			    case 3:	
			    		//Delete contacts.
			    		serviceObject.deleteContact();
				        break;
			    case 4:	
			    		//Display contacts.
			    		serviceObject.displayContacts();
				        break;
			    case 5:
			       		//Exit from program.
			        	isExit = true;
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
