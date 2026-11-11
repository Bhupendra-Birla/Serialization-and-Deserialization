package com.kodewala.smsmessage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SMSSerializable  {

	SMS sms = new SMS("Hello,Good Morning", "ka8889w");
	
	
	public void serializeSMS(SMS sms) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("SMS.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(sms);
		
	
		
		
	}
}
