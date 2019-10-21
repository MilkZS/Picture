package com.milkz.picture.util;

import org.springframework.stereotype.Component;

@Component
public class StringUtil {

    public boolean checkParam(String param) {
        return param == null || param.equals("");
    }

}
