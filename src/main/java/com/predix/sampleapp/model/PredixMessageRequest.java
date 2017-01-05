package com.predix.sampleapp.model;

public class PredixMessageRequest {
	private Message msg ;
	private String dateSend;
	private  String dateRecieved;
	private String header;
	private String title;
	
	public Message getMsg() {
		return msg;
	}
	public void setMsg(Message msg) {
		this.msg = msg;
	}
	public String getDateSend() {
		return dateSend;
	}
	public void setDateSend(String dateSend) {
		this.dateSend = dateSend;
	}
	public String getDateRecieved() {
		return dateRecieved;
	}
	public void setDateRecieved(String dateRecieved) {
		this.dateRecieved = dateRecieved;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
