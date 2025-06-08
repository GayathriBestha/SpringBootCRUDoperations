package com.springuser.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springuser.exceptions.payload.ApiResponse;



@RestControllerAdvice
public class ExceptionHander {
	@org.springframework.web.bind.annotation.ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException ex){
		ApiResponse res= new ApiResponse
				("USER DATA NOT EXIST INVALID INPUT =>"+ex.getMessage(),false,HttpStatus.NOT_FOUND);
		return new ResponseEntity<ApiResponse>(HttpStatus.NOT_FOUND);
	}
}
