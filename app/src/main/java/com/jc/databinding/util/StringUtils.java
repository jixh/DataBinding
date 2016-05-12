package com.jc.databinding.util;

/**
 * Created by jc on 2016-5-12.
 */
public class StringUtils {

    public static boolean isEmpty(Object object){
        return object == null || object.toString() == "";
    }

    public static String trimString(String str){
        return isEmpty(str)?"":str.trim();
    }

}
