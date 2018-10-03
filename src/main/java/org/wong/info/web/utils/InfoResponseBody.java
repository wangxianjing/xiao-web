package org.wong.info.web.utils;

import com.alibaba.fastjson.JSONObject;

import static org.wong.info.web.constants.ApiErrorCode.RESULT_CODE_NOT_SUCCESS;
import static org.wong.info.web.constants.ApiErrorCode.RESULT_CODE_SUCCESS;

/**
 * Created by wong on 2018\8\19 0019
 */
public class InfoResponseBody {
    private int code = -1;
    private String desc = "";
    private String status = "";
    private Object data = new JSONObject();

    public void success(String desc) {
        success(desc, null);
    }

    public void success(String desc, Object data) {
        this.desc = desc;
        this.code = RESULT_CODE_SUCCESS;
        this.status = "succ";
        this.data = data;
    }

    public void fail(String desc) {
        fail(desc, RESULT_CODE_NOT_SUCCESS);
    }

    public void fail(String desc, int errorCode) {
        this.desc = desc;
        this.code = errorCode;
        this.status = "fail";
    }

    public InfoResponseBody() {
    }

    public InfoResponseBody(int code, String desc, String status) {
        this.code = code;
        this.desc = desc;
        this.status = status;
    }

    public InfoResponseBody(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static InfoResponseBody createError(int code, String desc) {
        return new InfoResponseBody(code, desc);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "InfoResponseBody{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}