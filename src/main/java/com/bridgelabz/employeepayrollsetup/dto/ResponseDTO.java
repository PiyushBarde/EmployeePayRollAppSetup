package com.bridgelabz.employeepayrollsetup.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ResponseDTO {
	private String message;
	private Object content;
	
	public ResponseDTO(String message, Object content) {
		super();
		this.message = message;
		this.content = content;
	}
	public ResponseDTO() {}	
}
