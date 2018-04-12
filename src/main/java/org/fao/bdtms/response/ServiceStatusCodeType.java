package org.fao.bdtms.response;

/**
 * The Class ServiceStatusCodeType.
 */
public class ServiceStatusCodeType {

	/** The Constant SUCCESS. */
	public static final int SUCCESS = 200;

	/** The Constant SUCCESS. */
	public static final int FAILURE = 300;

	/** The Constant UNABLE_TO_UPDATE. */
	public static final int UNABLE_TO_UPDATE = 304;

	/** The Constant UNABLE_TO_SAVE. */
	public static final int UNABLE_TO_SAVE = 301;

	/** The Constant UNABLE_TO_FETCH_DETAILS_FOR_REQUEST. */
	public static final int UNABLE_TO_FETCH_DETAILS_FOR_REQUEST = 302;
	
	/** The Constant UNABLE_TO_FETCH_DETAILS_FOR_REQUEST. */
	public static final int UNABLE_TO_FETCH_CUSTOMER_DETAILS = 350;

	/** The Constant FAILURE_DUE_TO_EXCEPTION_ON_SERVER. */
	public static final int FAILURE_DUE_TO_EXCEPTION_ON_SERVER = 500;

	/** The Constant REQUIRED_INPUT_PARAM_IS_MISSING. */
	public static final int REQUIRED_INPUT_PARAM_IS_MISSING = 400;

	public static final int REQUIRED_INPUT_PARAM_ARE_EQUAL = 400;
	
	public static final int REQUIRED_ONLY_ONE_INPUT_PARAM= 400;

	/** The Constant OK. */
	public static final int OK = 200;

	/** The Constant CREATED. */
	public static final int CREATED = 201;

	/** The Constant NO_CONTENT. */
	public static final int NO_CONTENT = 204;

	/** The Constant NOT_MODIFIED. */
	public static final int NOT_MODIFIED = 304;

	/** The Constant BAD_REQUEST. */
	public static final int BAD_REQUEST = 400;

	/** The Constant UNAUTHORIZED. */
	public static final int UNAUTHORIZED = 401;

	/** The Constant FORBIDDEN. */
	public static final int FORBIDDEN = 403;

	/** The Constant NOT_FOUND. */
	public static final int NOT_FOUND = 404;

	/** The Constant CONFLICT. */
	public static final int CONFLICT = 409;

	/** The Constant INTERNAL. */
	public static final int INTERNAL = 500;

	/** The Constant INVALID. */
	public static final int INVALID = 203;

	/** The Constant DETAILS_NOT_FOUND. */
	public static final int DETAILS_NOT_FOUND = 100;

	/** The Constant REQUIRED_INFO_MISSING. */
	public static final int REQUIRED_INFO_MISSING = 1001;

	/** The Constant DETAILS_NOT_FOUND. */
	public static final int INVALID_INPUTS = 1002;
	
	/** The Constant UNABLE_TO_FETCH_ORDER_HISTORY. */
	public static final int UNABLE_TO_FETCH_ORDER_HISTORY = 455;
	
	public static final int ORDER_HISTORY_CANNOT_BE_RETRIEVED = 465;

	/**
	 * Instantiates a new service status code type.
	 */
	private ServiceStatusCodeType() {

	}

}
