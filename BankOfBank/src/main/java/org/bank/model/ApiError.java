package org.bank.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatusCode;

public class ApiError {

	public String message;
	public List<String> details;
	public HttpStatusCode status;
	public LocalDateTime timestamp;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}

	public HttpStatusCode getStatus() {
		return status;
	}

	public void setStatus(HttpStatusCode status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "ApiError [message=" + message + ", details=" + details + ", status=" + status + ", timestamp="
				+ timestamp + "]";
	}

	public ApiError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApiError(String message, List<String> details, HttpStatusCode status, LocalDateTime timestamp) {
		super();
		this.message = message;
		this.details = details;
		this.status = status;
		this.timestamp = timestamp;
	}

}
