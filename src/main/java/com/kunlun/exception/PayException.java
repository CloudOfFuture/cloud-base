package com.kunlun.exception;

/**
 * @author by hws
 * @created on 2017/12/27.
 */
public class PayException extends RuntimeException{
    public PayException(String message) {
        super(message);
    }

    public PayException(String message, Throwable cause) {
        super(message, cause);
    }
}
