package com.kodewala.emailmsg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Driver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		EmailMessageSerializable emailMessageSerializable = new EmailMessageSerializable();
		
		EmailMessage emailMessage1 = new EmailMessage("Hello sir/ma,am I am looking for job change", "83724");
		
		
		FileInputStream fis = new FileInputStream("E:\\KW Java Backend Course\\Serialization\\emailmessage.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		 EmailMessage message = (EmailMessage)ois.readObject();
		 
		System.out.println(message.geteMessage());
	}

}
