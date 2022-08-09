package com.santosystem.invest.exceptions;

/**
 * Responsible for representing a system business error.
 *
 * @author Anderson Santo
 * @see java.lang.RuntimeException
 */
public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
