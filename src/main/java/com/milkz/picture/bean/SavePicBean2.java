package com.milkz.picture.bean;

import lombok.Data;
@Data
public class SavePicBean2 {

    // 手机型号（例如 x20）
    public String type;
    // 手机厂商（例如 小米）
    public String brand;
    // 图片内容
    public String value;
    // 上传时间
    public String time;
    // 测试结果
    public String result;
    // 系统版本
    public String version;
    // 蓝牙盾类型
    public String keyType;

    public String url;

}
