package com.kodewala.whatmsg.day40;

import java.io.IOException;
import java.io.Serializable;

public class Driver {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
	
    	MessageSerializable messageSerializable = new MessageSerializable();
    	
    	Message message = new Message("Hello , good morning", 923493,"kya kar rhi ho");
    	
    	messageSerializable.serializeMsg(message);
    	
   System.out.println(message.getMessage());
    	if(message instanceof Serializable) {
    		System.out.println("Yes");
    	}
    	else {
    		System.out.println("No");
    	}
}
}
