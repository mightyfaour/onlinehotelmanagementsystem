package com.philip.mtimoduleonlinehotelmanagementsystem.exception;

public class AuthenticationException extends RuntimeException {
    private String errorCode;

    public AuthenticationException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
