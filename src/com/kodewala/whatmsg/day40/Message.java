package com.kodewala.whatmsg.day40;

import java.io.Serializable;

// critical activity it required permission
public class Message implements Serializable {
	private String message;
	private int messageID;
	private transient String personalMessage;
	private static final long serialVersionUId = 1L;
	
	//private int messageLength;

	public Message(String message, int messageID, String personalMessage) {
		super();
		this.message = message;
		this.messageID = messageID;
		this.personalMessage = personalMessage;
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getMessageID() {
		return messageID;
	}

	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}


	

}
