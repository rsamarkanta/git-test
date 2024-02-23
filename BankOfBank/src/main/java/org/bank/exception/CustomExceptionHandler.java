package org.bank.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.bank.model.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> idNotFoundExceptionHandler(IdNotFoundException ex) {
		String message = ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Id is Not Available");
		ApiError errors = new ApiError(message, details, HttpStatus.NOT_FOUND, LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errors);
	}

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Object> resourceNotFoundExceptionHandler(ResourceNotFoundException ex) {
		String message = ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Resource is Not Available");
		ApiError errors = new ApiError(message, details, HttpStatus.BAD_REQUEST, LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}

	@ExceptionHandler(MailNotSentException.class)
	public ResponseEntity<Object> handleMailNotSentException(MailNotSentException ex) {
		String message = ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Mail not sent !!");
		ApiError errors = new ApiError(message, details, HttpStatus.BAD_REQUEST, LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}

	@ExceptionHandler(BadCredentialException.class)
	public ResponseEntity<Object> handleBadCredentialException(BadCredentialException ex) {
		String message = ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Credential invalid !!");
		ApiError errors = new ApiError(message, details, HttpStatus.BAD_REQUEST, LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}
}
