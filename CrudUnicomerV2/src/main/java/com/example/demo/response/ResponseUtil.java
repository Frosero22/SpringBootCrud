package com.example.demo.response;

public class ResponseUtil {

	
	public static SuccessResponseDTO<Object> success(){
		return new SuccessResponseDTO<>();
	}
	
	
	public static ErrorResponseDTO error() {
		return new ErrorResponseDTO();
	}
	
}
