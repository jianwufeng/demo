package com.example.demo.common.res;

/**
 * CRM端拋的异常对应的错误码枚�?
 *
 * @author MZ
 * @see [相关�?/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public enum CrmErrorCode {

    SYSTEM_ERROR("crm00001"),

    ILLEGAL_OPERATION("crm00002"),

    CONTACT_EMAIL_EXISTS("crm00003"),

    CONTACT_MOBILE_EXISTS("crm00004"),

    NO_PERMISSION("crm00071");

    private String errorCode;

    private CrmErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

}
