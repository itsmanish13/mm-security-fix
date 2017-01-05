package com.predix.sampleapp.model;

public class PredixMessageResponse {
	private String status;
	private Message msg;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Message getMsg() {
		return msg;
	}
	public void setMsg(Message msg) {
		this.msg = msg;
	}

}
