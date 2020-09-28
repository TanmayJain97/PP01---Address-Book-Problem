package AddressBook;

import java.io.*;
import java.util.*;

public class AddressBookUC2 {
	
	public String firstName;		//Obj Attributes
	public String lastName;
	public String address;
	public String city;
	public String state;
	public long zipCode;
	public String phoneNo;
	public String email;
	
	public AddressBookUC2(String firstName, String lastName, String address,
			String city, String state, long zipCode,
			String phoneNo, String email) {
		this.firstName = firstName;				//Constructor
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	public void display() {				//Method for displaying all details
		
		System.out.println("------------------------------------------------------");
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Address: "+address);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Zip: "+zipCode);
		System.out.println("Phone No.: "+phoneNo);
		System.out.println("Email: "+email);
		System.out.println("------------------------------------------------------");
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Created object for "+firstName+" "+lastName;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Adding a record for all entries
		ArrayList<AddressBookUC2> record=new ArrayList<AddressBookUC2>();
		
		//Creating first entry
		AddressBookUC2 entry1=new AddressBookUC2("Narendra", "Modi",
				"PMO", "New Delhi", "Delhi", 114102, "9765422564",
				"pmo@office.com");
		record.add(entry1);					//Adding entry to record
		System.out.println(entry1);
		
		//Creating second entry
		AddressBookUC2 entry2=new AddressBookUC2("Tanmay", "Jain",
				"Mahaveer Nagar", "Jaipur", "Raj", 302011, "9765485884",
				"mail.tanmay@gmail.com");
		record.add(entry2);					//Adding entry to record
		System.out.println(entry2);

		//adding a new entry
		
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
		AddressBookUC2 entry3=new AddressBookUC2(firstName,lastName,
				address,city,state,zipCode,phoneNo,email);
		record.add(entry3);					//Adding entry to record
		System.out.println(entry3);
		
		//displaying all entries
		entry1.display();
		entry2.display();
		entry3.display();
	}
}