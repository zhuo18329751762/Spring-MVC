package com.yangzhuo.controller;

public class Result {
    private Object object;
    private Integer code;
    private String msg;

    public Result() {
    }
    public Result(Integer code,Object object) {
        this.object = object;
        this.code = code;
    }

    public Result(Integer code,Object object,  String msg) {
        this.object = object;
        this.code = code;
        this.msg = msg;
    }

    /**
     * 获取
     * @return object
     */
    public Object getObject() {
        return object;
    }

    /**
     * 设置
     * @param object
     */
    public void setObject(Object object) {
        this.object = object;
    }

    /**
     * 获取
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "Result{object = " + object + ", code = " + code + ", msg = " + msg + "}";
    }
}
