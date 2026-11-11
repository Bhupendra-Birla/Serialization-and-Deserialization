package com.kodewala.emailmsg;

import java.io.IOException;
import java.io.Serializable;

public class Driver {
	public static void main(String[] args) throws IOException {
		
		EmailMessageSerializable emailMessageSerializable = new EmailMessageSerializable();
		
		EmailMessage emailMessage1 = new EmailMessage("Hello sir/ma,am I am looking for job change", "83724");
		
		 emailMessageSerializable.serializeMessage(emailMessage1);
		 
		 if(emailMessage1 instanceof Serializable) {
			 System.out.println("yes");
		 }
		 else {
			 System.out.println("no");
		 }
	}

}
