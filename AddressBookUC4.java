package AddressBook;

import java.io.*;
import java.util.*;

public class AddressBookUC4 {
	
	public String firstName;		//Obj Attributes
	public String lastName;
	public String address;
	public String city;
	public String state;
	public long zipCode;
	public String phoneNo;
	public String email;
	
	public AddressBookUC4(String firstName, String lastName, String address,
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

	public static ArrayList<AddressBookUC4> delete(ArrayList<AddressBookUC4> list, String name) {
		
		//method for delete
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		name.replaceAll("\\P{Print}","");
		String lower_name=name.toLowerCase();
		
		try {
			for (AddressBookUC4 obj:list) {
				String firstName=obj.firstName.toLowerCase();
				String lastName=obj.lastName.toLowerCase();
				if (firstName.equals(lower_name) ||
						lastName.equals(lower_name)) {
					flag=true;
					
					System.out.println("Record deleted for "+obj.firstName+" "+obj.lastName);
					list.remove(obj);			//delete entry from record
					System.out.println("Record updated.");
				}
			}
		}catch(Exception e) {}
		if (flag==false) {
			System.out.println("No entry found for "+name);
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Adding a record for all entries
		ArrayList<AddressBookUC4> record=new ArrayList<AddressBookUC4>();
		
		//Creating first entry
		AddressBookUC4 entry1=new AddressBookUC4("Narendra", "Modi",
				"PMO", "New Delhi", "Delhi", 114102, "9765422564",
				"pmo@office.com");
		record.add(entry1);					//Adding entry to record
		System.out.println(entry1);
		
		//Creating second entry
		AddressBookUC4 entry2=new AddressBookUC4("Tanmay", "Jain",
				"Mahaveer Nagar", "Jaipur", "Raj", 302011, "9765485884",
				"mail.tanmay@gmail.com");
		record.add(entry2);					//Adding entry to record
		System.out.println(entry2);

		//deleting an existing entry
		
		//asking user input
		System.out.println("Please enter First/Last name of entry to be deleted.");
		String name=sc.next();
		record=delete(record,name);
		
		//displaying all entries
		for (AddressBookUC4 obj:record) {
			obj.display();
		}
	}
}