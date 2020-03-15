

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department = "tech";
	private int inboxCapacity;
	private String email;
	private int capacity;
	private int passwordlength = 500;
	private String companySuffix = "";
	private String altEmail;
	
	public Email(String fn, String ln) {
		firstName = fn;
		lastName = ln;
		
		
		System.out.println("Email created " +fn +" " +lastName);
		
		this.department = setDepartment();
		
		System.out.println("Department: " +this.department);
		
		this.password = RandomPassword(9);
		System.out.println("Your password is: "  +this.password);
		
		email = firstName.toLowerCase() +"." +lastName.toLowerCase()  
		+"@" +department +"." +companySuffix;
		System.out.println("your email is :" +email);
		
		//setPassword();
		
	}
	public Email() {
		setPassword();
	}
	public String getEmail() {
		return email = firstName.toLowerCase() +"." +lastName.toLowerCase()  
		+"@" +department +"." +companySuffix +".com";
		
	}
	public void setname(String fn) {
		firstName = fn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String ln) {
		lastName = ln;
	}
	public String getLastName() {
		return lastName;
	}
	private String setDepartment() {
		
		System.out.println("Enter the department\n1 for sales\n2 for Development\n3 for accounting\n4 for research"
				+ "\n5 for Marketing \n6 for Human Resources");
		Scanner in = new Scanner(System.in);
		int deepChoice = in.nextInt();
		if(deepChoice == 1) {
			return "Sales";
		}
		else if(deepChoice == 2) {
			return "Development";
		}
		else if (deepChoice == 3) {
			return "Acounting";
		}else if (deepChoice == 4) {
			return "R&D";
		}else if (deepChoice == 5) {
				return "Marketing";}
		else if (deepChoice == 6) {
			return "HumanResources";}
		else {return "";}
	}
		public void setDeparment(String dep) {
		department = dep;
	}
	public void setCompany(String com) {
		companySuffix = com;
		
	}
	
//	private Boolean isUnique(String passWord) {
		
		
		
//	}
	
	private String RandomPassword(int length) {
		
		String passwordSet = "1234567890!@#$%^&*QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i]=  passwordSet.charAt(rand);
			
		
		}
		return new String(password);
		
	}
	public void setMailboxCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.altEmail = altEmail;
		
	}
	private void setPassword() {
		password = RandomPassword(10);
		
	}
	
	public void ChangePassword(String password) {
		this.password = password;
	}
	public String getCompany() {
		return companySuffix;
	}
	
	public int getMailCapacity() {
		return capacity;
	}
	public String getAlternativeEmail() {
		return altEmail;
	}
	public String getPassword() {
		return password;
	}
	public String getDepartment() {
		return department;
	}
	
	public String Info() {
		
		return "\nName: " +firstName +" " +lastName +"\nEmail: " +email
				+"\nCapacity: " +capacity +"mb";
	}

	public static void main(String[] args) {
	
		String a = "Jon";
		String b = "Snow";		
		Email em = new Email(a, b );
		System.out.println(em.Info());
	
		
	}}
