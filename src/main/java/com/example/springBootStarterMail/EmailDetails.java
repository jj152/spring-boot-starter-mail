package com.example.springBootStarterMail;


//Importing required classes
import lombok.Data;

//Annotations
@Data
public class EmailDetails {

	// Class data members
	
	private String recipient;
	private String msgBody;
	private String subject;
	private String attachment;
}

