package com.commons.exception;


import com.commons.Enum.ErrorCode;

public class UnauthorizedException extends AbstractException{

    public UnauthorizedException() {
        super();
    }

    public UnauthorizedException(String message) {
        super(message);
    }

    public UnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnauthorizedException(ErrorCode error) {
        super(error);
    }

    public UnauthorizedException(ErrorCode error, String msg) {
        super(error, msg);
    }

    public UnauthorizedException(ErrorCode error, String msg, Object info) {
        super(error, msg, info);
    }
}
