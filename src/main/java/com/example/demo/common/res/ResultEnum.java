package com.example.demo.common.res;

public interface ResultEnum {

	/** 是否成功 **/
	public Boolean getSuccess();
	
    /** 获取错误码 **/
    public String getErrCode();

    /** 获取错误信息 **/
    public String getMessage();

}
