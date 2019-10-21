package com.milkz.picture.receive;

import com.alibaba.fastjson.JSONObject;
import com.milkz.picture.bean.ReCode;
import com.milkz.picture.bean.ResultBean;
import com.milkz.picture.bean.SavePicBean;
import com.milkz.picture.bean.SavePicBean2;
import com.milkz.picture.dao.PictureDao;
import com.milkz.picture.service.DBService;
import com.milkz.picture.util.ImageUtil;
import com.milkz.picture.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Decoder;

import javax.annotation.Resource;
import java.util.Base64;

@Controller
@RequestMapping("/api")
public class SaveClicnet {

    // 47.98.217.144:10022

    @Autowired
    private ImageUtil imageUtil;

    @Autowired
    private StringUtil stringUtil;

    @Resource
    private DBService dbService;

    @ResponseBody
    @RequestMapping("/save")
    public String doSave(SavePicBean bean) {
        if (stringUtil.checkParam(bean.getTime())
                || stringUtil.checkParam(bean.getValue())
                || stringUtil.checkParam(bean.getBrand())
                || stringUtil.checkParam(bean.getResult())
                || stringUtil.checkParam(bean.getVersion())
                || stringUtil.checkParam(bean.getType())) {
            return new ResultBean(ReCode.PARAM_ERROR, "参数为空").toJson().toString();
        }

//        byte[] data = Base64.getDecoder().decode(bean.getValue());
        byte[] data = Base64.getUrlDecoder().decode(bean.getValue());
        SavePicBean2 savePicBean2 = new SavePicBean2();
        savePicBean2.setBrand(bean.getBrand());
        savePicBean2.setKeyType(bean.getKeyType());
        savePicBean2.setResult(bean.getResult());
        savePicBean2.setTime(bean.getTime());
        String name = bean.getTime() + ".png";
        imageUtil.byteToImage(data, name);
        savePicBean2.setUrl(name);
        savePicBean2.setVersion(bean.getVersion());
        savePicBean2.setValue(bean.getValue());
        dbService.insert(savePicBean2);
        return new ResultBean(ReCode.SUCCESS, "").toJson().toString();
    }
}
