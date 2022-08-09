package com.santosystem.invest.validation;

import com.santosystem.invest.exceptions.BusinessException;

/**
 * Responsible for centralizing all validation messages.
 *
 * @author Anderson Santo
 * @see BusinessException
 */
public class BusinessError {
    private BusinessError() {
        throw new IllegalStateException("Business error static class");
    }

    public static void required(String text) {
        throw new BusinessException(text + " is required.");
    }

    public static void notExist(String text) {
        throw new BusinessException(text + " not exist.");
    }

    public static void notRead(String text) {
        throw new BusinessException("could not read the website " + text);
    }
}
