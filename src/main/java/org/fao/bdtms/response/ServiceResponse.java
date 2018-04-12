package org.fao.bdtms.response;


import java.io.Serializable;

/**
 * The Class ServiceResponse.
 *
 * @param <T>
 *            the generic type
 */
public class ServiceResponse<T extends Serializable> implements Serializable {
	
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4588320146579899784L;

	/** The result. */
	private T result;

	/** The service message. */
	private String serviceMessage;

	/** The status code. */
	private int statusCode;

	/** The is successfull. */
	private boolean isSuccessful = Boolean.FALSE;

	/** The User id. */
	private int UserId;

	/** The validation status. */
	private String validationStatus;

	/** The is authenticated. */
	private boolean isAuthenticated = Boolean.FALSE;

	/** The user token. */
	private String userToken;

	/**
	 * Gets the result.
	 *
	 * @return the result
	 */
	public T getResult() {
		return result;
	}

	/**
	 * Sets the result.
	 *
	 * @param result
	 *            the new result
	 */
	public void setResult(T result) {
		this.result = result;
	}

	/**
	 * Gets the service message.
	 *
	 * @return the service message
	 */
	public String getServiceMessage() {
		return serviceMessage;
	}

	/**
	 * Sets the service message.
	 *
	 * @param serviceMessage
	 *            the new service message
	 */
	public void setServiceMessage(String serviceMessage) {
		this.serviceMessage = serviceMessage;
	}

	/**
	 * Checks if is successful.
	 *
	 * @return true, if is successful
	 */
	public boolean isSuccessful() {
		return isSuccessful;
	}

	/**
	 * Sets the successful.
	 *
	 * @param isSuccessfull
	 *            the new successful
	 */
	public void setSuccessful(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}

	/**
	 * Gets the status code.
	 *
	 * @return the status code
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * Sets the status code.
	 *
	 * @param statusCode
	 *            the new status code
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return UserId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId
	 *            the new user id
	 */
	public void setUserId(int userId) {
		UserId = userId;
	}

	/**
	 * Gets the single instance of ServiceResponse.
	 *
	 * @return single instance of ServiceResponse
	 */
	public static ServiceResponse getInstance() {
		return new ServiceResponse();
	}

	/**
	 * Gets the validation status.
	 *
	 * @return the validation status
	 */
	public String getValidationStatus() {
		return validationStatus;
	}

	/**
	 * Sets the validation status.
	 *
	 * @param validationStatus
	 *            the new validation status
	 */
	public void setValidationStatus(String validationStatus) {
		this.validationStatus = validationStatus;
	}

	/**
	 * Checks if is authenticated.
	 *
	 * @return true, if is authenticated
	 */
	public boolean isAuthenticated() {
		return isAuthenticated;
	}

	/**
	 * Sets the authenticated.
	 *
	 * @param isAuthenticated
	 *            the new authenticated
	 */
	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}

	/**
	 * Gets the user token.
	 *
	 * @return the user token
	 */
	public String getUserToken() {
		return userToken;
	}

	/**
	 * Sets the user token.
	 *
	 * @param userToken
	 *            the new user token
	 */
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}
