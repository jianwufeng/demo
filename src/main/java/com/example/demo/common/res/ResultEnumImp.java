package com.example.demo.common.res;

public enum ResultEnumImp implements ResultEnum {

    OK(true, "", "SUCCESS"),

    SYSTEM_ERROR("500", " system error "),
    OPERATION_ERROR("OPERATION_ERROR", "操作失败"),
    ILLEGAL_OPERATION("ILLEGAL_OPERATION", "非法操作"),

    LOGIN_ACCOUNT_PASSWORD_MATCH("100001", "Login account and password do not match"),
    NOT_LOGIN_AUTHORITY("100002", " Not login authority "),
    LOGIN_ERROR("100003", " Login error "),
    ACCOUNT_NOT_LOGIN("100004", "Account is not loggin"),
    NO_PERMISSION("100005", " 没有操作权限 "),
    TOKEN_ERROR("100101"," token is error "),
    TOKEN_NOT_AUTHORITY("100100", " token not authority "),
    ACCESS_TOKEN_EXPIRED(false, "15006", "登录已超时，请重新登录！");


    private Boolean success;

    private String errCode;

    /** 消息 **/
    private String message;

    /** 构造函数 默认false **/
    private ResultEnumImp(String errCode, String message) {
        this.success = false;
        this.errCode = errCode;
        this.message = message;
    }

    private ResultEnumImp(Boolean success, String errCode, String message) {
        this.success = success;
        this.errCode = errCode;
        this.message = message;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getMessage() {
        return message;
    }

    public Boolean getSuccess() {
        return success;
    }
}
