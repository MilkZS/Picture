package com.milkz.picture.bean;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

@Data
public class ResultBean {

    private int code;
    private String msg;

    public ResultBean(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JSONObject toJson() {
        JSONObject headObj = new JSONObject();
        headObj.put("code", code);
        headObj.put("msg", msg);
        return headObj;
    }

}
