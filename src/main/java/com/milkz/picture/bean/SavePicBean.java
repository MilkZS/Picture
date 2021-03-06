package com.milkz.picture.bean;

import lombok.Data;

@Data
public class SavePicBean {

    // 手机型号（例如 x20）
    private String type;
    // 手机厂商（例如 小米）
    private String brand;
    // 图片内容
    private String value;
    // 上传时间
    private String time;
    // 测试结果
    private String result;
    // 系统版本
    private String version;
    // 蓝牙盾类型
    private String keyType;

}
