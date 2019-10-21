package com.milkz.picture.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

    public static String getName(long times) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(times);
        return format.format(date);
    }

}
