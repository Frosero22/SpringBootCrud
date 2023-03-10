package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "code", "status", "data", "message" })
public class SuccessResponseDTO<T> extends BaseResponseDTO {
	
	private T data;

	public SuccessResponseDTO() {
	}
	
	public SuccessResponseDTO(T data) {
		this();
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	public SuccessResponseDTO<T> body(T data){
		this.data = data;
		return this;
	}
	
}