package com.sollers.course.jf.error;

public class EnterpriseSecurityException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */
	protected String logMessage = null;

	/**
	 * Instantiates a new security exception.
	 */
	protected EnterpriseSecurityException() {
		// hidden
	}

	/**
	 * Creates a new instance of EnterpriseSecurityException.
	 * 
	 * @param userMessage
	 *            the message displayed to the user
	 * @param logMessage
	 *            the message logged
	 */
	public EnterpriseSecurityException(String userMessage, String logMessage) {
		super(logMessage);
		this.logMessage = logMessage;
	}

	/**
	 * Creates a new instance of EnterpriseSecurityException that includes a root
	 * cause Throwable.
	 *
	 * @param userMessage
	 *            the message displayed to the user
	 * @param logMessage
	 *            the message logged
	 * @param cause
	 *            the cause
	 */
	public EnterpriseSecurityException(String userMessage, String logMessage, Throwable cause) {
		super(userMessage, cause);
		this.logMessage = logMessage;
	}

	/**
	 * Returns message meant for display to users
	 *
	 * @return a String containing a message that is safe to display to users
	 */
	public String getUserMessage() {
		return getMessage();
	}

	/**
	 * Returns a message that is safe to display in logs, but may contain sensitive
	 * information and therefore probably should not be displayed to users.
	 * 
	 * @return a String containing a message that is safe to display in logs, but
	 *         probably not to users as it may contain sensitive information.
	 */
	public String getLogMessage() {
		return logMessage;
	}
}
