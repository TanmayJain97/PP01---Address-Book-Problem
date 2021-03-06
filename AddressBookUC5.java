package AddressBook;

import java.io.*;
import java.util.*;

public class AddressBookUC5 {
	
	private ArrayList<Collection> record;

	public AddressBookUC5() {
		record=new ArrayList<Collection>();
	}

	public void display() {
		for (Collection obj:record) {
			obj.display();
		}
	}
	
	public void addToRecord(Collection obj) {
		record.add(new Collection(obj.firstName, obj.lastName, obj.address,
				obj.city,obj.state, obj.zipCode, obj.phoneNo, obj.email));
	}

	public static Collection add() {
		
		//method for adding new entries.
		Scanner sc=new Scanner(System.in);
		String firstName;					//Attributes to be added
		String lastName;
		String address;
		String city;
		String state;
		long zipCode;
		String phoneNo;
		String email;
		
		//asking user input
		System.out.println("Please enter details to be added.");
		System.out.print("First Name: ");
		firstName=sc.next();
		System.out.print("Last Name: ");
		lastName=sc.next();
		System.out.print("Address: ");
		address=sc.next();
		System.out.print("City: ");
		city=sc.next();
		System.out.print("State: ");
		state=sc.next();
		System.out.print("ZipCode: ");
		zipCode=sc.nextLong();
		System.out.print("Phone No.: ");
		phoneNo=sc.next();
		System.out.print("Email: ");
		email=sc.next();
		
		//saving as new entry
		Collection entry=new Collection(firstName,lastName,
				address,city,state,zipCode,phoneNo,email);
		return entry;					//returning entry to main
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		AddressBookUC5 buildObj=new AddressBookUC5();
		
		//Creating first entry
		Collection entry1=new Collection("Narendra", "Modi",
				"PMO", "New Delhi", "Delhi", 114102, "9765422564",
				"pmo@office.com");
		buildObj.addToRecord(entry1);				//Adding entry to record
		System.out.println(entry1);
		
		//Creating second entry
		Collection entry2=new Collection("Tanmay", "Jain",
				"Mahaveer Nagar", "Jaipur", "Raj", 302011, "9765485884",
				"mail.tanmay@gmail.com");
		buildObj.addToRecord(entry2);				//Adding entry to record
		System.out.println(entry2);

		//initiating addition of entries
		
		String user_input="1";
		while(user_input.equals("1")) {
			
			Collection entry=buildObj.add();		//calling function to make new entry
			buildObj.addToRecord(entry);			//Adding entry to record
			System.out.println(entry);
			
			//asking user to continue adding entries
			System.out.println();
			System.out.println("Press 1 to add new entry");
			System.out.println("Press any other key to exit.");
			user_input=sc.next();
		}
		
		//displaying all entries
			buildObj.display();
	}
}