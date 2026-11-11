package com.kodewala.smsmessage;

import java.io.Serializable;

public class SMS implements Serializable{

	String sms;
	String smsId;
	
	
	public SMS(String sms, String smsId) {
		super();
		this.sms = sms;
		this.smsId = smsId;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	public String getSmsId() {
		return smsId;
	}
	public void setSmsId(String smsId) {
		this.smsId = smsId;
	}
	
	
}
