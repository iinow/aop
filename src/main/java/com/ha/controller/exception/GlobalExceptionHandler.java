package com.ha.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ha.domain.Error;
import com.ha.exception.UserNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({
		UserNotFoundException.class
	})
	public final ResponseEntity<Error> handleUserNotFoundException(UserNotFoundException ex){
		Error e = new Error();
		e.setError(ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
	}
}
