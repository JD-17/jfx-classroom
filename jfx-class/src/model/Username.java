package model;

enum Gender{
	MALE, 
	FEMALE,
	OTHER;
}
enum Browser {
	CHROME,
	SAFARI,
	OPERA,
	BRAVE;
}

public class Username {
	
	private String username;
	private String password;
	private String photoDirectory;
	private Gender gender;
	private Browser browser;
	
	public Username(String username, String password, String photoDirectory, Gender gender, Browser browser) {
		this.username = username;
		this.password = password;
		this.photoDirectory = photoDirectory;
		this.gender = gender;
		this.browser = browser; 
	}
	
}
