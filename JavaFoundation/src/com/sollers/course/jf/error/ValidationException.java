package com.sollers.course.jf.error;

public class ValidationException extends EnterpriseSecurityException {

	protected static final long serialVersionUID = 1L;

	/** The UI reference that caused this ValidationException */
	private String context;

	/**
	 * Instantiates a new validation exception.
	 */
	protected ValidationException() {
		// hidden
	}

	/**
	 * Creates a new instance of ValidationException.
	 * 
	 * @param userMessage
	 *            the message to display to users
	 * @param logMessage
	 *            the message logged
	 */
	public ValidationException(String userMessage, String logMessage) {
		super(userMessage, logMessage);
	}

	/**
	 * Instantiates a new ValidationException.
	 * 
	 * @param userMessage
	 *            the message to display to users
	 * @param logMessage
	 *            the message logged
	 * @param cause
	 *            the cause
	 */
	public ValidationException(String userMessage, String logMessage, Throwable cause) {
		super(userMessage, logMessage, cause);
	}

	/**
	 * Creates a new instance of ValidationException.
	 * 
	 * @param userMessage
	 *            the message to display to users
	 * @param logMessage
	 *            the message logged
	 * @param context
	 *            the source that caused this exception
	 */
	public ValidationException(String userMessage, String logMessage, String context) {
		super(userMessage, logMessage);
	}

	/**
	 * Instantiates a new ValidationException.
	 * 
	 * @param userMessage
	 *            the message to display to users
	 * @param logMessage
	 *            the message logged
	 * @param cause
	 *            the cause
	 * @param context
	 *            the source that caused this exception
	 */
	public ValidationException(String userMessage, String logMessage, Throwable cause, String context) {
		super(userMessage, logMessage, cause);
	}
}
