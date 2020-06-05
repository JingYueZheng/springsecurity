package com.jyz.bootproject.utils;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 *  统一返回结果类
 */
public class R {
    /**
     * 放置状态码
     */
    private int code;
    /**
     * 放置错误信息
     */
    private String msg;

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

    public Object getData() {
        return data;
    }

    /**
     *  放置返回数据
     */
    private Object data;

    public R() {

    }

    public R(HttpStatus httpStatus) {
        this.code = httpStatus.getCode();
        this.msg = httpStatus.getMsg();
    }

    public  R setData(Object data){
        this.data = data;
        return this;
    }

    /**
     *  默认操作成功
     * @return
     */
    public R ok(){
        this.code = HttpStatus.SUCCESS.getCode();
        this.msg = HttpStatus.SUCCESS.getMsg();
        return this;
    }

    /**
     *  默认操作失败
     * @return
     */
    public R error(){
        this.code = HttpStatus.SERVER_ERROR.getCode();
        this.msg = HttpStatus.SERVER_ERROR.getMsg();
        return this;
    }

    /**
     *  操作失败附带状态信息
     * @return
     */
    public R error(HttpStatus httpStatus){
        this.code = httpStatus.getCode();
        this.msg = httpStatus.getMsg();
        return  this;
    }


    /**
     *  操作成功附带返回数据
     * @return
     */
    public R ok(Object data){
        this.code = HttpStatus.SUCCESS.getCode();
        this.msg = HttpStatus.SUCCESS.getMsg();
        this.data = data;
        return  this;
    }


}
