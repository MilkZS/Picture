package com.milkz.picture.receive;

import com.milkz.picture.bean.ReCode;
import com.milkz.picture.bean.ResultBean;
import com.milkz.picture.bean.SavePicBean;
import com.milkz.picture.util.ImageUtil;
import com.milkz.picture.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Decoder;

import java.util.Base64;

@Controller
@RequestMapping("/api")
public class SaveClicnet {

    // 47.98.217.144:10022

    @Autowired
    private ImageUtil imageUtil;

    @Autowired
    private StringUtil stringUtil;

    @ResponseBody
    @RequestMapping("/save")
    public String doSave(SavePicBean bean) {
        if (stringUtil.checkParam(bean.getName())
                || stringUtil.checkParam(bean.getTime())
                || stringUtil.checkParam(bean.getValue())) {
            return new ResultBean(ReCode.PARAM_ERROR, "参数为空").toJson().toString();
        }

        byte[] data = Base64.getDecoder().decode(bean.getValue());
//        String path = "E:\\github\\keepPic\\1543898924124.png";
//        byte[] b = imageUtil.imageToByte(path);
        imageUtil.byteToImage(data, bean.getTime() + "-" + bean.getName());
        return new ResultBean(ReCode.SUCCESS, "").toJson().toString();
    }
}
