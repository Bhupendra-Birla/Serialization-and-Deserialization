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
		//   connection bw object and file // write stream of bytes into the file
		FileOutputStream fos = new FileOutputStream("emailmessage.ser");
		//converts object into byte stream //connect with existing file
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		/**
		 * converts the emailMessage1 object into a serialized byte stream 
		 * and writes that byte stream to the file.
		 */
		oos.writeObject(emailMessage1);
		oos.close();
		
		}
}

