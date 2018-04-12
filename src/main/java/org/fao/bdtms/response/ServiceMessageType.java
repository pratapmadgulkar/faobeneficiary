package org.fao.bdtms.response;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * The Class ServiceMessageType.
 */
@Component
public class ServiceMessageType {

	/** The email not update message. */
	// email messages
	@Value("${messages.en.user.failure.email.not.update}")
	private String emailNotUpdateMessage;

	/** The user email udated. */
	@Value("${messages.en.sucess.user.email.updated}")
	private String emailUpdateMessage;

	/** The account not create message. */
	@Value("${messages.en.user.failure.account.not.create}")
	private String accountNotCreateMessage;

	/** The account create message. */
	@Value("${messages.en.sucess.user.account.create}")
	private String accountCreateMessage;

	/** The customer validation message. */
	@Value("${messages.en.sucess.customer.account.validate}")
	private String customerValidationMessage;

	/** The customer not validation message. */
	@Value("${messages.en.failure.customer.account.validate}")
	private String customerNotValidationMessage;

	/** The validated acount updated message. */
	@Value("${messages.en.sucess.customer.account.updated}")
	private String validatedAcountUpdatedMessage;

	/** The validated acount not updated message. */
	@Value("${messages.en.failure.customer.account.not.updated}")
	private String validatedAcountNotUpdatedMessage;

	/** The user details found message. */
	@Value("${messages.en.sucess.account.details.found}")
	private String userDetailsFoundMessage;

	/** The user details not found message. */
	@Value("${messages.en.failure.account.details.not.found}")
	private String userDetailsNotFoundMessage;

	/** The user input parameter null measaage. */
	@Value("${messages.en.user.parameter.not.null}")
	private String userInputParameterNullMeasaage;

	/** The user input parameter equal measaage. */
	@Value("${messages.en.user.parameter.equal}")
	private String userInputParameterEqualMeasaage;

	/** The update email validation status. */
	@Value("${messages.en.sucess.user.email.validation.status}")
	private String updateEmailValidationStatus;

	/** The update email not validation status. */
	@Value("${messages.en.sucess.user.email.not.validation.status}")
	private String updateEmailNotValidationStatus;

	/** The already inserted in ldap. */
	@Value("${messages.en.error.user.already.inserted.in.ldap}")
	private String alreadyInsertedInLdap;

	/** The already updated in ldap. */
	@Value("${messages.en.error.user.already.updated.in.ldap}")
	private String alreadyUpdatedInLdap;

	/** Unauthorized User. */
	@Value("${mesaage.en.error.user.unauthorized.access}")
	private String unauthorizeUser;

	/** The client ip address request header. */
	@Value("${mesaage.en.client.ipaddress}")
	private String clientIpAddressRequestHeader;

	/** The user input parameter null message. */
	@Value("${messages.en.customer.parameter.not.null}")
	private String userInputParameterNullMessage;

	/** The validation status message. */
	@Value("${messages.en.success.validation.status}")
	private String validationStatusMessage;

	/** The not validation status message. */
	@Value("${messages.en.failure.validation.status}")
	private String notValidationStatusMessage;

	/** The ldap success message. */
	@Value("${messages.en.account.success.fetch.Ldap.details}")
	private String ldapSuccessMessage;

	/** The ldap failed message. */
	@Value("${messages.en.account.failure.fetch.Ldap.details}")
	private String ldapFailedMessage;

	/** The external user ID search base. */
	@Value("${messages.en.account.Ldap.details}")
	private String externalUserIDSearchBase;

	/** The invalid. */
	@Value("${messages.en.account.wsr.invalid}")
	private String invalid;

	/** The valid. */
	@Value("${messages.en.account.wsr.valid}")
	private String valid;

	/** The not found. */
	@Value("${messages.en.account.wsr.data}")
	private String notFound;

	/** The invalid input. */
	@Value("${messages.en.failure.invalid.input}")
	private String invalidInput;

	/** The no contracts found. */
	@Value("${messages.en.failure.no.contracts.found}")
	private String noContractsFound;

	/** The currency value. */
	@Value("${messages.en.price.currency.value}")
	private String currencyValue;

	/** The sql exception. */
	@Value("${messages.en.failure.sql.exception}")
	private String sqlException;

	/** The region info unavailable. */
	@Value("${messages.en.region.info.unavailable}")
	private String regionInfoUnavailable;

	/** The unable to fetch region info. */
	@Value("${messages.en.failure.fetch.region.info}")
	private String unableToFetchRegionInfo;

	/** The contract rquired input missing. */
	@Value("${messages.en.contract.required.input.missing}")
	private String requiredInputsForContractsMissing;

	/** The email not update message. */
	@Value("${messages.en.sucess.price.details}")
	private String successMessage;

	/** The price details not found. */
	@Value("${messages.en.price.details.not.found}")
	private String priceDetailsNotFound;

	/** The in valid customer details message. */
	@Value("${messages.en.failure.customer.details.not.found}")
	private String inValidCustomerDetailsMessage;

	/** The user details found message. */
	@Value("${messages.en.sucess.account.details.not.found}")
	private String inValidUserDetailsFoundMessage;

	/** The Customer userName, AccountNumber details found message. */
	@Value("${messages.en.sucess.customer.account.details.found}")
	private String customerAccountDetailsFoundMessage;

	/** The Customer details Not found message. */
	@Value("${messages.en.sucess.customer.account.not.details.found}")
	private String customerAccountDetailsNotFoundMessage;
	
	/** The item details found. */
	@Value("${messages.en.price.item.details.not.found}") 
	private String itemDetailsFound;
	
	/** The item not for sale. */
	@Value("${messages.en.price.item.not.salable}") 
	private String itemNotForSale;
	
	/** The login required for item. */
	@Value("${messages.en.price.item.login.required}") 
	private String loginRequiredForItem;
	
	/** The invalid item. */
	@Value("${messages.en.price.invalid.item}") 
	private String invalidItem;
	
	/**  Unable to fetch customer details. */
	@Value("${messages.en.fail.customer.account.not.details.found}")
	private String unableToFetchCustomerDetails;
	
	/**  Unable to fetch customer details. */
	@Value("${messages.en.sucess.customer.details}")
	private String customerDetailsFound;
	
	@Value("${messages.en.account.password.not.change}")
	private String passdwordNotChanged;
	
	@Value("${messages.en.account.password.change}")
	private String passdwordChanged; 	
	
	@Value("${messages.en.account.parameter.not.either}")
	private String OnlyOneInputParamRequired;
	
	@Value("${messages.en.account.parameter.not.blank}")
	private String eitherParamBlank; 
	
	@Value("${messages.en.account.result.active}")
	private String InputResetParamActive;
	
	@Value("${messages.en.account.result.not.active}")
	private String InputResetParamInActive;
	

	@Value("${messages.en.account.parameter.email}")
	private String validInputEmail; 
	
	@Value("${messages.en.account.parameter.not.email}")
	private String invalidInputEmail; 
	
	@Value("${messages.en.account.user.notExist}")
	private String userNotFound;
	
	/** The order history details found. */
	@Value("${messages.en.order.history.details.found}")
	private String orderHistoryDetailsFound;
	
	/** The unable to fetch order history. */
	@Value("${messages.en.order.history.details.not.found}")
	private String unableToFetchOrderHistory;
	
	@Value("${messages.en.order.history.line.item.not.found}")
	private String lineItemNotFound;
	
	@Value("${messages.en.order.history.line.item.found}")
	private String lineItemFound;
	
	
	@Value("${messages.en.order.history.line.item.not.fetch}")
	private String lineItemnotfetch;
	
	/**
	 * Gets the unable to fetch order history.
	 *
	 * @return the unable to fetch order history
	 */
	public String getUnableToFetchOrderHistory() {
		return unableToFetchOrderHistory;
	}
	
	/**
	 * Sets the unable to fetch order history.
	 *
	 * @param unableToFetchOrderHistory the new unable to fetch order history
	 */
	public void setUnableToFetchOrderHistory(String unableToFetchOrderHistory) {
		this.unableToFetchOrderHistory = unableToFetchOrderHistory;
	}
	/**
	 * @return the eitherParamBlank
	 */
	public String getEitherParamBlank() {
		return eitherParamBlank;
	}
	/**
	 * @param eitherParamBlank the eitherParamBlank to set
	 */
	public void setEitherParamBlank(String eitherParamBlank) {
		this.eitherParamBlank = eitherParamBlank;
	}
	/**
	 * @return the userNotFound
	 */
	public String getUserNotFound() {
		return userNotFound;
	}
	/**
	 * @param userNotFound the userNotFound to set
	 */
	public void setUserNotFound(String userNotFound) {
		this.userNotFound = userNotFound;
	}
	/**
	 * @return the inputResetParamInActive
	 */
	public String getInputResetParamInActive() {
		return InputResetParamInActive;
	}
	/**
	 * @param inputResetParamInActive the inputResetParamInActive to set
	 */
	public void setInputResetParamInActive(String inputResetParamInActive) {
		InputResetParamInActive = inputResetParamInActive;
	}


	
	/**
	 * @return the onlyOneInputParamRequired
	 */
	public String getOnlyOneInputParamRequired() {
		return OnlyOneInputParamRequired;
	}
	
	/**
	 * @return the inputResetParamActive
	 */
	public String getInputResetParamActive() {
		return InputResetParamActive;
	}
	/**
	 * @return the validInputEmail
	 */
	public String getValidInputEmail() {
		return validInputEmail;
	}
	/**
	 * @return the invalidInputEmail
	 */
	public String getInvalidInputEmail() {
		return invalidInputEmail;
	}
	/**
	 * @param onlyOneInputParamRequired the onlyOneInputParamRequired to set
	 */
	public void setOnlyOneInputParamRequired(String onlyOneInputParamRequired) {
		OnlyOneInputParamRequired = onlyOneInputParamRequired;
	}
	
	/**
	 * @param inputResetParamActive the inputResetParamActive to set
	 */
	public void setInputResetParamActive(String inputResetParamActive) {
		InputResetParamActive = inputResetParamActive;
	}
	/**
	 * @param validInputEmail the validInputEmail to set
	 */
	public void setValidInputEmail(String validInputEmail) {
		this.validInputEmail = validInputEmail;
	}
	/**
	 * @param invalidInputEmail the invalidInputEmail to set
	 */
	public void setInvalidInputEmail(String invalidInputEmail) {
		this.invalidInputEmail = invalidInputEmail;
	}

	/**
	 * Gets the order history details found.
	 *
	 * @return the order history details found
	 */
	public String getOrderHistoryDetailsFound() {
		return orderHistoryDetailsFound;
	}
	
	
	/**
	 * Sets the order history details found.
	 *
	 * @param orderHistoryDetailsFound the new order history details found
	 */
	public void setOrderHistoryDetailsFound(String orderHistoryDetailsFound) {
		this.orderHistoryDetailsFound = orderHistoryDetailsFound;
	}
	
	/**
	 * Instantiates a new service message type.
	 */
	private ServiceMessageType() {

	}
	/**
	 * Gets the unable to fetch customer details.
	 *
	 * @return the unable to fetch customer details
	 */
	public String getUnableToFetchCustomerDetails() {
		return unableToFetchCustomerDetails;
	}
	
	/**
	 * Sets the unable to fetch customer details.
	 *
	 * @param unableToFetchCustomerDetails the new unable to fetch customer details
	 */
	public void setUnableToFetchCustomerDetails(String unableToFetchCustomerDetails) {
		this.unableToFetchCustomerDetails = unableToFetchCustomerDetails;
	}

	/**
	 * Gets the customer account details not found message.
	 *
	 * @return the customer account details not found message
	 */
	public String getCustomerAccountDetailsNotFoundMessage() {
		return customerAccountDetailsNotFoundMessage;
	}

	/**
	 * Sets the customer account details not found message.
	 *
	 * @param customerAccountDetailsNotFoundMessage the new customer account details not found message
	 */
	public void setCustomerAccountDetailsNotFoundMessage(
			String customerAccountDetailsNotFoundMessage) {
		this.customerAccountDetailsNotFoundMessage = customerAccountDetailsNotFoundMessage;
	}

	/**
	 * Gets the customer account details found message.
	 *
	 * @return the customer account details found message
	 */
	public String getCustomerAccountDetailsFoundMessage() {
		return customerAccountDetailsFoundMessage;
	}

	/**
	 * Sets the customer account details found message.
	 *
	 * @param customerAccountDetailsFoundMessage the new customer account details found message
	 */
	public void setCustomerAccountDetailsFoundMessage(
			String customerAccountDetailsFoundMessage) {
		this.customerAccountDetailsFoundMessage = customerAccountDetailsFoundMessage;
	}

	/**
	 * Gets the in valid user details found message.
	 *
	 * @return the in valid user details found message
	 */
	public String getInValidUserDetailsFoundMessage() {
		return inValidUserDetailsFoundMessage;
	}

	/**
	 * Sets the in valid user details found message.
	 *
	 * @param inValidUserDetailsFoundMessage the new in valid user details found message
	 */
	public void setInValidUserDetailsFoundMessage(
			String inValidUserDetailsFoundMessage) {
		this.inValidUserDetailsFoundMessage = inValidUserDetailsFoundMessage;
	}

	/**
	 * Gets the in valid customer details message.
	 *
	 * @return the in valid customer details message
	 */
	public String getInValidCustomerDetailsMessage() {
		return inValidCustomerDetailsMessage;
	}

	/**
	 * Sets the in valid customer details message.
	 *
	 * @param inValidCustomerDetailsMessage the new in valid customer details message
	 */
	public void setInValidCustomerDetailsMessage(
			String inValidCustomerDetailsMessage) {
		this.inValidCustomerDetailsMessage = inValidCustomerDetailsMessage;
	}


	/**
	 * Gets the email not update message.
	 *
	 * @return the email not update message
	 */
	public String getEmailNotUpdateMessage() {
		return emailNotUpdateMessage;
	}

	/**
	 * Sets the email not update message.
	 *
	 * @param emailNotUpdateMessage
	 *            the new email not update message
	 */
	public void setEmailNotUpdateMessage(String emailNotUpdateMessage) {
		this.emailNotUpdateMessage = emailNotUpdateMessage;
	}

	/**
	 * Gets the email update message.
	 *
	 * @return the email update message
	 */
	public String getEmailUpdateMessage() {
		return emailUpdateMessage;
	}

	/**
	 * Sets the email update message.
	 *
	 * @param emailUpdateMessage
	 *            the new email update message
	 */
	public void setEmailUpdateMessage(String emailUpdateMessage) {
		this.emailUpdateMessage = emailUpdateMessage;
	}

	/**
	 * Gets the account not create message.
	 *
	 * @return the account not create message
	 */
	public String getAccountNotCreateMessage() {
		return accountNotCreateMessage;
	}

	/**
	 * Sets the account not create message.
	 *
	 * @param accountNotCreateMessage
	 *            the new account not create message
	 */
	public void setAccountNotCreateMessage(String accountNotCreateMessage) {
		this.accountNotCreateMessage = accountNotCreateMessage;
	}

	/**
	 * Gets the account create message.
	 *
	 * @return the account create message
	 */
	public String getAccountCreateMessage() {
		return accountCreateMessage;
	}

	/**
	 * Sets the account create message.
	 *
	 * @param accountCreateMessage
	 *            the new account create message
	 */
	public void setAccountCreateMessage(String accountCreateMessage) {
		this.accountCreateMessage = accountCreateMessage;
	}

	/**
	 * Gets the customer validation message.
	 *
	 * @return the customer validation message
	 */
	public String getCustomerValidationMessage() {
		return customerValidationMessage;
	}

	/**
	 * Sets the customer validation message.
	 *
	 * @param customerValidationMessage
	 *            the new customer validation message
	 */
	public void setCustomerValidationMessage(String customerValidationMessage) {
		this.customerValidationMessage = customerValidationMessage;
	}

	/**
	 * Gets the validated acount not updated message.
	 *
	 * @return the validated acount not updated message
	 */
	public String getValidatedAcountNotUpdatedMessage() {
		return validatedAcountNotUpdatedMessage;
	}

	/**
	 * Sets the validated acount not updated message.
	 *
	 * @param validatedAcountNotUpdatedMessage
	 *            the new validated acount not updated message
	 */
	public void setValidatedAcountNotUpdatedMessage(
			String validatedAcountNotUpdatedMessage) {
		this.validatedAcountNotUpdatedMessage = validatedAcountNotUpdatedMessage;
	}

	/**
	 * Gets the validated acount updated message.
	 *
	 * @return the validated acount updated message
	 */
	public String getValidatedAcountUpdatedMessage() {
		return validatedAcountUpdatedMessage;
	}

	/**
	 * Sets the validated acount updated message.
	 *
	 * @param validatedAcountUpdatedMessage
	 *            the new validated acount updated message
	 */
	public void setValidatedAcountUpdatedMessage(
			String validatedAcountUpdatedMessage) {
		this.validatedAcountUpdatedMessage = validatedAcountUpdatedMessage;
	}

	/**
	 * Gets the user details found message.
	 *
	 * @return the user details found message
	 */
	public String getUserDetailsFoundMessage() {
		return userDetailsFoundMessage;
	}

	/**
	 * Sets the user details found message.
	 *
	 * @param userDetailsFoundMessage
	 *            the new user details found message
	 */
	public void setUserDetailsFoundMessage(String userDetailsFoundMessage) {
		this.userDetailsFoundMessage = userDetailsFoundMessage;
	}

	/**
	 * Gets the user details not found message.
	 *
	 * @return the user details not found message
	 */
	public String getUserDetailsNotFoundMessage() {
		return userDetailsNotFoundMessage;
	}

	/**
	 * @return the passdwordNotChanged
	 */
	public String getPassdwordNotChanged() {
		return passdwordNotChanged;
	}
	/**
	 * @param passdwordNotChanged the passdwordNotChanged to set
	 */
	public void setPassdwordNotChanged(String passdwordNotChanged) {
		this.passdwordNotChanged = passdwordNotChanged;
	}
	/**
	 * @return the passdwordChanged
	 */
	public String getPassdwordChanged() {
		return passdwordChanged;
	}
	/**
	 * @param passdwordChanged the passdwordChanged to set
	 */
	public void setPassdwordChanged(String passdwordChanged) {
		this.passdwordChanged = passdwordChanged;
	}
	/**
	 * Sets the user details not found message.
	 *
	 * @param userDetailsNotFoundMessage
	 *            the new user details not found message
	 */
	public void setUserDetailsNotFoundMessage(String userDetailsNotFoundMessage) {
		this.userDetailsNotFoundMessage = userDetailsNotFoundMessage;
	}

	/**
	 * Gets the customer not validation message.
	 *
	 * @return the customer not validation message
	 */
	public String getCustomerNotValidationMessage() {
		return customerNotValidationMessage;
	}

	/**
	 * Sets the customer not validation message.
	 *
	 * @param customerNotValidationMessage
	 *            the new customer not validation message
	 */
	public void setCustomerNotValidationMessage(
			String customerNotValidationMessage) {
		this.customerNotValidationMessage = customerNotValidationMessage;
	}

	/**
	 * Gets the customer details found.
	 *
	 * @return the customer details found
	 */
	public String getCustomerDetailsFound() {
		return customerDetailsFound;
	}

	/**
	 * Sets the customer details found.
	 *
	 * @param customerDetailsFound the new customer details found
	 */
	public void setCustomerDetailsFound(String customerDetailsFound) {
		this.customerDetailsFound = customerDetailsFound;
	}

	/**
	 * Gets the user input parameter null measaage.
	 *
	 * @return the user input parameter null measaage
	 */
	public String getUserInputParameterNullMeasaage() {
		return userInputParameterNullMeasaage;
	}

	/**
	 * Sets the user input parameter null measaage.
	 *
	 * @param userInputParameterNullMeasaage
	 *            the new user input parameter null measaage
	 */
	public void setUserInputParameterNullMeasaage(
			String userInputParameterNullMeasaage) {
		this.userInputParameterNullMeasaage = userInputParameterNullMeasaage;
	}

	/**
	 * Gets the user input parameter equal measaage.
	 *
	 * @return the user input parameter equal measaage
	 */
	public String getUserInputParameterEqualMeasaage() {
		return userInputParameterEqualMeasaage;
	}

	/**
	 * Sets the user input parameter equal measaage.
	 *
	 * @param userInputParameterEqualMeasaage
	 *            the new user input parameter equal measaage
	 */
	public void setUserInputParameterEqualMeasaage(
			String userInputParameterEqualMeasaage) {
		this.userInputParameterEqualMeasaage = userInputParameterEqualMeasaage;
	}

	/**
	 * Gets the external user ID search base.
	 *
	 * @return the external user ID search base
	 */
	public String getExternalUserIDSearchBase() {
		return externalUserIDSearchBase;
	}

	/**
	 * Sets the external user ID search base.
	 *
	 * @param externalUserIDSearchBase the new external user ID search base
	 */
	public void setExternalUserIDSearchBase(String externalUserIDSearchBase) {
		this.externalUserIDSearchBase = externalUserIDSearchBase;
	}

	/**
	 * Gets the invalid input.
	 *
	 * @return the invalid input
	 */
	public String getInvalidInput() {
		return invalidInput;
	}

	/**
	 * Gets the currency value.
	 *
	 * @return the currency value
	 */
	public String getCurrencyValue() {
		return currencyValue;
	}

	/**
	 * Gets the region info unavailable.
	 *
	 * @return the region info unavailable
	 */
	public String getRegionInfoUnavailable() {
		return regionInfoUnavailable;
	}

	/**
	 * Sets the region info unavailable.
	 *
	 * @param regionInfoUnavailable the new region info unavailable
	 */
	public void setRegionInfoUnavailable(String regionInfoUnavailable) {
		this.regionInfoUnavailable = regionInfoUnavailable;
	}

	/**
	 * Gets the unable to fetch region info.
	 *
	 * @return the unable to fetch region info
	 */
	public String getUnableToFetchRegionInfo() {
		return unableToFetchRegionInfo;
	}

	/**
	 * Sets the unable to fetch region info.
	 *
	 * @param unableToFetchRegionInfo the new unable to fetch region info
	 */
	public void setUnableToFetchRegionInfo(String unableToFetchRegionInfo) {
		this.unableToFetchRegionInfo = unableToFetchRegionInfo;
	}

	/**
	 * Gets the required inputs for contracts missing.
	 *
	 * @return the required inputs for contracts missing
	 */
	public String getRequiredInputsForContractsMissing() {
		return requiredInputsForContractsMissing;
	}

	/**
	 * Sets the required inputs for contracts missing.
	 *
	 * @param requiredInputsForContractsMissing the new required inputs for contracts missing
	 */
	public void setRequiredInputsForContractsMissing(
			String requiredInputsForContractsMissing) {
		this.requiredInputsForContractsMissing = requiredInputsForContractsMissing;
	}

	/**
	 * Gets the success message.
	 *
	 * @return the success message
	 */
	public String getSuccessMessage() {
		return successMessage;
	}

	/**
	 * Sets the success message.
	 *
	 * @param successMessage the new success message
	 */
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}

	/**
	 * Gets the price details not found.
	 *
	 * @return the price details not found
	 */
	public String getPriceDetailsNotFound() {
		return priceDetailsNotFound;
	}

	/**
	 * Sets the price details not found.
	 *
	 * @param priceDetailsNotFound the new price details not found
	 */
	public void setPriceDetailsNotFound(String priceDetailsNotFound) {
		this.priceDetailsNotFound = priceDetailsNotFound;
	}

	/**
	 * Sets the currency value.
	 *
	 * @param currencyValue the new currency value
	 */
	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}

	/**
	 * Gets the sql exception.
	 *
	 * @return the sql exception
	 */
	public String getSqlException() {
		return sqlException;
	}

	/**
	 * Sets the sql exception.
	 *
	 * @param sqlException the new sql exception
	 */
	public void setSqlException(String sqlException) {
		this.sqlException = sqlException;
	}

	/**
	 * Gets the no contracts found.
	 *
	 * @return the no contracts found
	 */
	public String getNoContractsFound() {
		return noContractsFound;
	}

	/**
	 * Sets the no contracts found.
	 *
	 * @param noContractsFound the new no contracts found
	 */
	public void setNoContractsFound(String noContractsFound) {
		this.noContractsFound = noContractsFound;
	}

	/**
	 * Sets the invalid input.
	 *
	 * @param invalidInput the new invalid input
	 */
	public void setInvalidInput(String invalidInput) {
		this.invalidInput = invalidInput;
	}

	/**
	 * Gets the invalid.
	 *
	 * @return the invalid
	 */
	public String getInvalid() {
		return invalid;
	}

	/**
	 * Sets the invalid.
	 *
	 * @param invalid the new invalid
	 */
	public void setInvalid(String invalid) {
		this.invalid = invalid;
	}

	/**
	 * Gets the valid.
	 *
	 * @return the valid
	 */
	public String getValid() {
		return valid;
	}

	/**
	 * Sets the valid.
	 *
	 * @param valid the new valid
	 */
	public void setValid(String valid) {
		this.valid = valid;
	}

	/**
	 * Gets the not found.
	 *
	 * @return the not found
	 */
	public String getNotFound() {
		return notFound;
	}

	/**
	 * Sets the not found.
	 *
	 * @param notFound the new not found
	 */
	public void setNotFound(String notFound) {
		this.notFound = notFound;
	}

	/**
	 * Gets the update email validation status.
	 *
	 * @return the update email validation status
	 */
	public String getUpdateEmailValidationStatus() {
		return updateEmailValidationStatus;
	}

	/**
	 * Sets the update email validation status.
	 *
	 * @param updateEmailValidationStatus
	 *            the new update email validation status
	 */
	public void setUpdateEmailValidationStatus(
			String updateEmailValidationStatus) {
		this.updateEmailValidationStatus = updateEmailValidationStatus;
	}

	/**
	 * Gets the update email not validation status.
	 *
	 * @return the update email not validation status
	 */
	public String getUpdateEmailNotValidationStatus() {
		return updateEmailNotValidationStatus;
	}

	/**
	 * Gets the ldap success message.
	 *
	 * @return the ldap success message
	 */
	public String getLdapSuccessMessage() {
		return ldapSuccessMessage;
	}

	/**
	 * Sets the ldap success message.
	 *
	 * @param ldapSuccessMessage the new ldap success message
	 */
	public void setLdapSuccessMessage(String ldapSuccessMessage) {
		this.ldapSuccessMessage = ldapSuccessMessage;
	}

	/**
	 * Gets the ldap failed message.
	 *
	 * @return the ldap failed message
	 */
	public String getLdapFailedMessage() {
		return ldapFailedMessage;
	}

	/**
	 * Sets the ldap failed message.
	 *
	 * @param ldapFailedMessage the new ldap failed message
	 */
	public void setLdapFailedMessage(String ldapFailedMessage) {
		this.ldapFailedMessage = ldapFailedMessage;
	}

	/**
	 * Gets the already inserted in ldap.
	 *
	 * @return the already inserted in ldap
	 */
	public String getAlreadyInsertedInLdap() {
		return alreadyInsertedInLdap;
	}

	/**
	 * Gets the not validation status message.
	 *
	 * @return the not validation status message
	 */
	public String getNotValidationStatusMessage() {
		return notValidationStatusMessage;
	}

	/**
	 * Sets the not validation status message.
	 *
	 * @param notValidationStatusMessage the new not validation status message
	 */
	public void setNotValidationStatusMessage(String notValidationStatusMessage) {
		this.notValidationStatusMessage = notValidationStatusMessage;
	}

	/**
	 * Gets the validation status message.
	 *
	 * @return the validation status message
	 */
	public String getValidationStatusMessage() {
		return validationStatusMessage;
	}

	/**
	 * Sets the validation status message.
	 *
	 * @param validationStatusMessage the new validation status message
	 */
	public void setValidationStatusMessage(String validationStatusMessage) {
		this.validationStatusMessage = validationStatusMessage;
	}

	/**
	 * Gets the user input parameter null message.
	 *
	 * @return the user input parameter null message
	 */
	public String getUserInputParameterNullMessage() {
		return userInputParameterNullMessage;
	}

	/**
	 * Sets the user input parameter null message.
	 *
	 * @param userInputParameterNullMessage the new user input parameter null message
	 */
	public void setUserInputParameterNullMessage(
			String userInputParameterNullMessage) {
		this.userInputParameterNullMessage = userInputParameterNullMessage;
	}

	/**
	 * Gets the unauthorize user.
	 *
	 * @return the unauthorize user
	 */
	public String getUnauthorizeUser() {
		return unauthorizeUser;
	}

	/**
	 * Sets the unauthorize user.
	 *
	 * @param unauthorizeUser
	 *            the new unauthorize user
	 */
	public void setUnauthorizeUser(String unauthorizeUser) {
		this.unauthorizeUser = unauthorizeUser;
	}

	/**
	 * Gets the already updated in ldap.
	 *
	 * @return the already updated in ldap
	 */
	public String getAlreadyUpdatedInLdap() {
		return alreadyUpdatedInLdap;
	}

	/**
	 * Sets the already updated in ldap.
	 *
	 * @param alreadyUpdatedInLdap
	 *            the new already updated in ldap
	 */
	public void setAlreadyUpdatedInLdap(String alreadyUpdatedInLdap) {
		this.alreadyUpdatedInLdap = alreadyUpdatedInLdap;
	}

	/**
	 * Sets the already inserted in ldap.
	 *
	 * @param alreadyInsertedInLdap
	 *            the new already inserted in ldap
	 */
	public void setAlreadyInsertedInLdap(String alreadyInsertedInLdap) {
		this.alreadyInsertedInLdap = alreadyInsertedInLdap;
	}

	/**
	 * Sets the update email not validation status.
	 *
	 * @param updateEmailNotValidationStatus
	 *            the new update email not validation status
	 */
	public void setUpdateEmailNotValidationStatus(
			String updateEmailNotValidationStatus) {
		this.updateEmailNotValidationStatus = updateEmailNotValidationStatus;
	}

	/**
	 * Gets the client ip address request header.
	 *
	 * @return the client ip address request header
	 */
	public String getClientIpAddressRequestHeader() {
		return clientIpAddressRequestHeader;
	}

	/**
	 * Sets the client ip address request header.
	 *
	 * @param clientIpAddressRequestHeader
	 *            the new client ip address request header
	 */
	public void setClientIpAddressRequestHeader(
			String clientIpAddressRequestHeader) {
		this.clientIpAddressRequestHeader = clientIpAddressRequestHeader;
	}

	/**
	 * Gets the item details found.
	 *
	 * @return the item details found
	 */
	public String getItemDetailsFound() {
		return itemDetailsFound;
	}

	/**
	 * Gets the item not for sale.
	 *
	 * @return the item not for sale
	 */
	public String getItemNotForSale() {
		return itemNotForSale;
	}

	/**
	 * Gets the login required for item.
	 *
	 * @return the login required for item
	 */
	public String getLoginRequiredForItem() {
		return loginRequiredForItem;
	}

	/**
	 * Gets the invalid item.
	 *
	 * @return the invalid item
	 */
	public String getInvalidItem() {
		return invalidItem;
	}

	/**
	 * Sets the item details found.
	 *
	 * @param itemDetailsFound the new item details found
	 */
	public void setItemDetailsFound(String itemDetailsFound) {
		this.itemDetailsFound = itemDetailsFound;
	}

	/**
	 * Sets the item not for sale.
	 *
	 * @param itemNotForSale the new item not for sale
	 */
	public void setItemNotForSale(String itemNotForSale) {
		this.itemNotForSale = itemNotForSale;
	}

	/**
	 * Sets the login required for item.
	 *
	 * @param loginRequiredForItem the new login required for item
	 */
	public void setLoginRequiredForItem(String loginRequiredForItem) {
		this.loginRequiredForItem = loginRequiredForItem;
	}

	/**
	 * Sets the invalid item.
	 *
	 * @param invalidItem the new invalid item
	 */
	public void setInvalidItem(String invalidItem) {
		this.invalidItem = invalidItem;
	}
	
	/**
	 * Gets Line item not found.
	 *
	 * @return message Line item not found
	 */
	public String getLineItemNotFound() {
		return lineItemNotFound;
	}	
	
	/**
	 * Sets Line item not found.
	 *
	 * @param message Line item not found
	 */
	public void setLineItemNotFound(String lineItemNotFound) {
		this.lineItemNotFound = lineItemNotFound;
	}
	/**
	 * Gets Line item  found.
	 *
	 * @return message Line item  found.
	 */
	public String getLineItemFound() {
		return lineItemFound;
	}
	/**
	 * Sets Line item  found.
	 *
	 * @param message Line item  found.
	 */
	public void setLineItemFound(String lineItemFound) {
		this.lineItemFound = lineItemFound;
	}
	
	/**
	 * Gets Line item details not fetch.
	 *
	 * @return message Line item details not  fetch.
	 */
	public String getLineItemnotfetch() {
		return lineItemnotfetch;
	}
	/**
	 * Sets Line item details not fetch.
	 *
	 * @param message Line item not fetch.
	 */
	public void setLineItemnotfetch(String lineItemnotfetch) {
		this.lineItemnotfetch = lineItemnotfetch;
	}

}
