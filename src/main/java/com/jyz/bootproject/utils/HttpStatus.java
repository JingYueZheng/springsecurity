package com.jyz.bootproject.utils;

/**
 *  返回状态枚举类
 */
public enum  HttpStatus {

    SERVER_ERROR(500,"服务器内部异常"),
    SUCCESS(200,"success");   //操作成功

    /**
     *  状态码
     */
    private  int code;
    /**
     * 错误信息
     */
    private  String msg;

    HttpStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
