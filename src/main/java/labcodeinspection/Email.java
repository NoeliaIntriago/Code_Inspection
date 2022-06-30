package labcodeinspection;

import java.util.Locale;

public class Email {
	
	private String m_firstName; 
	private String m_lastName;
	private String password;
	private String department;
	private int defaultpasswordLength = 8;
	private String email;
	
	/**
	* 
	*
	* @author Dynamite
	* @param firstName
	* @param lastName
	*/
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}
	
	/**
	* 
	*
	* @author Dynamite
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @param depChoice
	*/
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	
	/**
	* 
	*
	* @author Dynamite
	*/
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase(Locale.US) + this.m_lastName.toLowerCase(Locale.US) + "@" + this.department
				+ ".espol.edu.ec";
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @return m_firstName
	*/
	public String getM_firstName() {
		return this.m_firstName;
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @param m_firstName
	*/
	public void setM_firstName(String m_firstName) {
		this.m_firstName = m_firstName;
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @return m_lastName
	*/
	public String getM_lastName() {
		return this.m_lastName;
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @param m_lastName
	*/
	public void setM_lastName(String m_lastName) {
		this.m_lastName = m_lastName;
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @return password
	*/
	public String getPassword() {
		return this.password;
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @param password
	*/
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @return department
	*/
	public String getDepartment() {
		return this.department;
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @param department
	*/
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @return defaultpasswordLength
	*/
	public int getDefaultpasswordLength() {
		return this.defaultpasswordLength;
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @param defaultpasswordLength
	*/
	public void setDefaultpasswordLength(int defaultpasswordLength) {
		this.defaultpasswordLength = defaultpasswordLength;
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @return email
	*/
	public String getEmail() {
		return this.email;
	}
	
	/**
	* 
	*
	* @author Dynamite
	* @param email
	*/
	public void setEmail(String email) {
		this.email = email;
	}
}