package com.spc.util;

import java.io.Serializable;

/**
 * <p>  </p>
 *
 * @author Young
 * @since 2019-01-14
 */
public class Ret implements Serializable {

    private int code;

    private String msg;

    private Object id;

    private Object data;

    public Ret() {
    }

    public Ret(int code, String msg, Object id, Object data) {
        this.code = code;
        this.msg = msg;
        this.id = id;
        this.data = data;
    }

    public Ret(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Ret(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Ret build(int code, String msg) {
        return new Ret(code, msg, null, null);
    }

    public static Ret build(int code, String msg, Object data) {
        return new Ret(code, msg, null, data);
    }

    public static Ret build(int code, String msg, Object id, Object data) {
        return new Ret(code, msg, id, data);
    }

    public static Ret ok() {
        return new Ret(RetCode.SUCCESS, RetMsg.SUCCESS, null, null);
    }

    public static Ret ok(String msg) {
        return new Ret(RetCode.SUCCESS, msg, null, null);
    }

    public static Ret ok(Object data) {
        return new Ret(RetCode.SUCCESS, RetMsg.SUCCESS, null, data);
    }

    public static Ret ok(Object id, Object data) {
        return new Ret(RetCode.SUCCESS, RetMsg.SUCCESS, id, data);
    }

    public static Ret ok(String msg, Object data) {
        return new Ret(RetCode.SUCCESS, msg, null, data);
    }

    public static Ret ok(String msg, Object id, Object data) {
        return new Ret(RetCode.SUCCESS, msg, id, data);
    }

    public static Ret error() {
        return new Ret(RetCode.ERROR, RetMsg.ERROR, null, null);
    }

    public static Ret error(String msg) {
        return new Ret(RetCode.ERROR, msg, null, null);
    }

    public static Ret error(Object data) {
        return new Ret(RetCode.ERROR, RetMsg.ERROR, null, data);
    }

    public static Ret error(Object id, Object data) {
        return new Ret(RetCode.ERROR, RetMsg.ERROR, id, data);
    }

    public static Ret error(String msg, Object data) {
        return new Ret(RetCode.ERROR, msg, null, data);
    }

    public static Ret error(String msg, Object id, Object data) {
        return new Ret(RetCode.ERROR, msg, id, data);
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

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Ret{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", id=" + id +
                ", data=" + data +
                '}';
    }
}
