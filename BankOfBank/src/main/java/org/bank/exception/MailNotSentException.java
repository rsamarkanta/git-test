package org.bank.exception;


public class MailNotSentException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	
	public MailNotSentException() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MailNotSentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}


	public MailNotSentException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}


	public MailNotSentException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}


	public MailNotSentException(String message) {
		super(message);
	}
}
