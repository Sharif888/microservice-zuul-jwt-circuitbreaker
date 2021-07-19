package com.cognizant.loan.exception;

import java.net.http.HttpRequest;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDefiner> getException(Exception ex , WebRequest request)
	{
		ExceptionDefiner exceptionDefiner = new ExceptionDefiner();
		exceptionDefiner.setLocalDateTime(LocalDateTime.now());
		exceptionDefiner.setMsg(ex.getMessage());
		exceptionDefiner.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<ExceptionDefiner>(exceptionDefiner,HttpStatus.BAD_REQUEST);
	}
}
