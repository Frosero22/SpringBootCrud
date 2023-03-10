package com.example.demo.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseResponseDTO {
	
	private String message;
	private int code = HttpStatus.OK.value();
	private String status = HttpStatus.OK.getReasonPhrase();

	
	public String getMessage() {
		return message;
	}

	
	public BaseResponseDTO message(String message) {
		this.message = message;
		return this;
	
	}
	
	public int getCode() {
		return code;
	}
	
	public String getStatus() {
		return status;
	}

	public ResponseEntity<BaseResponseDTO> send(HttpStatus status){
		this.code = status.value();
		this.status = status.getReasonPhrase();
		return new ResponseEntity<>(this,status);
	}
}
