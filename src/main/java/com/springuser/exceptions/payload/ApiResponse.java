package com.springuser.exceptions.payload;

import org.springframework.http.HttpStatus;

public class ApiResponse {
	private String msg;
	private boolean succes;
	private HttpStatus status;
	public ApiResponse(String msg, boolean succes, HttpStatus status) {
		//super();
		this.msg = msg;
		this.succes = succes;
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isSucces() {
		return succes;
	}
	public void setSucces(boolean succes) {
		this.succes = succes;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	
	
	
}
