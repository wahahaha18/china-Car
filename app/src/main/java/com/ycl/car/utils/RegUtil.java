package com.ycl.car.utils;

import java.util.regex.Pattern;

/**
 * Created by y11621546 on 2017/3/8.
 */

public class RegUtil {
    /**
     * 校验IP
     *
     * @param ip
     * @return
     */
    public static boolean isIP(String ip) {
        String rexp = "([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}";
        Pattern pattern = Pattern.compile(rexp);
        return pattern.matcher(ip).find();
    }
}
