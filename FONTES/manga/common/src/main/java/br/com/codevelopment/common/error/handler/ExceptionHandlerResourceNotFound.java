package br.com.codevelopment.common.error.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.codevelopment.common.error.ResourceNotFoundException;
import br.com.codevelopment.common.error.ResourceNotFoundExceptionDetailsBuilder;

@ControllerAdvice
public class ExceptionHandlerResourceNotFound {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException rnfex) {
		ResourceNotFoundExceptionDetailsBuilder rnfdb= new ResourceNotFoundExceptionDetailsBuilder
		.Builder()
		.title("Resource not Found")
		.status(HttpStatus.NOT_FOUND.value())
		.detail(rnfex.getMessage())
		.timestamp(new Date().getTime())
		.message(rnfex.getClass().getName())
		.build();
		return new ResponseEntity<>(rnfdb, HttpStatus.NOT_FOUND);
	}
}
