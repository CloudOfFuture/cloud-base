package com.kunlun.result;

import java.io.Serializable;

/**
 * @author by kunlun
 * @version <0.1>
 * @created on 2017/12/19.
 */
public class DataRet<T> implements Serializable {

    private static final long serialVersionUID = 7294025168689095197L;

    private String errorCode;

    private String message;

    private T body;
    private String token;

    public DataRet(T body) {
        super();
        this.body = body;
    }
    public DataRet(String errorCode,String message) {
        this.errorCode=errorCode;
        this.message=message;
    }
    public DataRet() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public boolean isSuccess() {
        return errorCode==null||"".equals(errorCode.trim());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
