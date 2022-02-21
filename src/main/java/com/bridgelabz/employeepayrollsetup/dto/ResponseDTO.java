package com.bridgelabz.employeepayrollsetup.dto;

import lombok.Data;

@Data
public class ResponseDTO {
	private String message;
	private Object content;
	
	public ResponseDTO(String message, Object content) {
		super();
		this.message = message;
		this.content = content;
	}
	public ResponseDTO() {}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
	
}
