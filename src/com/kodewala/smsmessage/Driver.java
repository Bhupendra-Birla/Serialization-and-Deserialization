package com.kodewala.smsmessage;

import java.io.IOException;
import java.io.Serializable;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		SMSSerializable serializable = new SMSSerializable();
		
		SMS sms = new SMS("Hello,Good morning", "394hnr34");
	
		serializable.serializeSMS(sms);
		
         if(sms instanceof Serializable) {
	           System.out.println("yes");
            }
         else {
	            System.out.println("no");
           }
	}

}
