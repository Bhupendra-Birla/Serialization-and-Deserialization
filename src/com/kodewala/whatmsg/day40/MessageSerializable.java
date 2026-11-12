package com.kodewala.whatmsg.day40;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kodewala.smsmessage.SMS;

public class MessageSerializable {
	public void serializeMsg(Message message) throws IOException, ClassNotFoundException {

		Message message1 = new Message("Hello, Good Morning", 912791, "kya kar rhi ho" );

		/**
		 * FileInputStream  is used to connect with file where the serialized object is stored 
		 * and read the bytes from file.
		 */
		
		FileInputStream fis = new FileInputStream("E:\\KW Java Backend Course\\Serialization\\message.ser");
		
		//objectInputStream is used to read serialized objects.
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//convert byte stream  back into an Object inside heap 
		//down casting
		Message  msg  = (Message)ois.readObject();
		System.out.println(msg.getMessage());
		
		ois.close();
		fis.close();
	}
}
