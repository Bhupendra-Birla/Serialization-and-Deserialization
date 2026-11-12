package com.kodewala.smsmessage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SMSSerializable  {

	SMS sms = new SMS("Hello,Good Morning", "ka8889w");
	
	
	public void serializeSMS(SMS sms) throws IOException, ClassNotFoundException {
		/**
		 * FileInputStream  is used to connect with file where the serialized object is stored 
		 * and read the bytes from file.
		 */
		
		FileInputStream fis = new FileInputStream("E:\\KW Java Backend Course\\Serialization\\SMS.ser");
		
		//objectInputStream is used to read serialized objects.
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//convert byte stream  back into an Object inside heap 
		//down casting
		SMS sms1 = (SMS)ois.readObject();
		
		System.out.println(sms1.getSms());
		
		
	}
}
