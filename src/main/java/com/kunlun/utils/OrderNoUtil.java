package com.kunlun.utils;

import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

/**
 * @author by hws
 * @created on 2017/12/26.
 */
public class OrderNoUtil {


    /**
     * 自动生成订单编号
     * @return
     */
    public static String getOrderNo(){
        String orderNo = "";
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        String year = calendar.get(Calendar.YEAR) + "";
        String month = (calendar.get(Calendar.MONTH) + 1) + "";
        String day = calendar.get(Calendar.DATE) + "";
        String hour = calendar.get(Calendar.HOUR) + "";
        String miniter = calendar.get(Calendar.MINUTE) + "";
        String seconds = calendar.get(Calendar.SECOND) + "";
        orderNo = year + month + day + "000" + hour + miniter + seconds + get4Random();
        return orderNo;
    }

    /**
     * 产生4位随机数
     *
     * @return
     */
    private static String get4Random() {
        Random random = new Random();
        String fourRandom = random.nextInt(10000) + "";
        int len = fourRandom.length();
        if (len < 4) {
            for (int i = 0; i <= 4 - len; i++) {
                fourRandom = "0" + fourRandom;
            }
        }
        return fourRandom;
    }
}
