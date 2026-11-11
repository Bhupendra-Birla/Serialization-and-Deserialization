package com.kodewala.whatmsg.day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerializable {
	public void serializeMsg(Message message) throws IOException {

		Message message1 = new Message("Hello, How are you ?", 912791, "kya kar rhi ho");

		/**
		 * 
		 * 
		 * Create the file and make the connection bw file and object
		 */

		FileOutputStream fis = new FileOutputStream("message.ser");
		/**
		 * write data as a object
		 * 
		 */
		ObjectOutputStream oos = new ObjectOutputStream(fis);

		oos.writeObject(message1);

		// close the connection
		oos.close();

	}
}
