package com.bupt.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {

    /**
     * String 表示传入进来的字符串
     * @param s
     * @return
     */
    @Override
    public Date convert(String s) {
        // 判断是否有参数
        if(s == null){
            throw new RuntimeException("请传入数据！");
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // 字符串转换成日期
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换错误");
        }
    }
}
