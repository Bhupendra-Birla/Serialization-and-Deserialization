package com.kodewala.emailmsg;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;

public class EmailMessageSerializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void serializeMessage(EmailMessage emailMessage) throws IOException {
		
		EmailMessage emailMessage1 = new EmailMessage("Hello Sir,I am looking for job change", "g@1234");
		/**
		 * to save the object data  we need these 3 steps below
		 * 
		 * 1.Create  a file where we want to save our data.
		 * 2.Convert java object into  stream of bytes
		 * 3.write the serialize object into the file. 
		 */
		//create a file where we save the data
		FileOutputStream fos = new FileOutputStream("emailmessage.ser");
		
		//establish connection bw object and file
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		/**
		 * converts the emailMessage1 object into a serialized byte stream 
		 * and writes that byte stream to the file.
		 */
		// convert  object into stream of bytes and save into a file
		oos.writeObject(emailMessage1);
		oos.close();
		
		}
}

