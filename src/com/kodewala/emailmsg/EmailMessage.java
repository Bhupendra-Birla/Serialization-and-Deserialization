package com.kodewala.emailmsg;

import java.io.Serializable;

public class EmailMessage implements Serializable {

	String eMessage;
	String eMessageID;

	public EmailMessage(String eMessage, String eMessageID) {
		super();
		this.eMessage = eMessage;
		this.eMessageID = eMessageID;
	}
	public String geteMessage() {
		return eMessage;
	}
	public void seteMessage(String eMessage) {
		this.eMessage = eMessage;
	}
	public String geteMessageID() {
		return eMessageID;
	}
	public void seteMessageID(String eMessageID) {
		this.eMessageID = eMessageID;
	}
	
}
