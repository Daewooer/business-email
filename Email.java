package emailapp1;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private	String Password;
	private	String Department;
	private String defaultPasswordLength;
	private	int MailBoxCapacity;
	private	String altemail;
	
	
	//Constructor for first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
	
		//call the method that asks for the department - return the department
		this.Department = setDepartment(); 
		System.out.println("Department: " + this.Department); 
		
		//call a method that returns a random password
		this.Password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.Password);
	}
	
	
	private String randomPassword(String defaultPasswordLength2) {
		// TODO Auto-generated method stub
		return null;
	}


	// Ask for the department
	private String setDepartment() {
		System.out.print("departnemt codes\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department code: ");
		Scanner in = new Scanner(System.in); 
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales"; }
		else if (depChoice == 2) { return "dev"; }
		else if (depChoice == 3) { return "acct"; }
		else { return ""; } 
	}
	
	//generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			System.out.println(rand);
			System.out.println(passwordSet.charAt(rand));
		}
		return new String(password);
	}
	
	// set the mailbox capacity
	
	//set the alternate email
	
	//change the password
	
}

