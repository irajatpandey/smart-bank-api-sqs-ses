package com.axess.smartbankapi.model;

public class Message {
	String body;
	String title;
	String emailId;
	@Override
	public String toString() {
		return "Message [body=" + body + ", title=" + title + ", emailId=" + emailId + "]";
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
