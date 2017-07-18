package com.ums.web.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jianggp on 2017/4/28.
 */
public class Response {


    public static Map<String, Object> errorResponse(String errorMsg){

        Map<String, Object> map = new HashMap();
        map.put("success", false);
        map.put("errorMsg", errorMsg);

        return map;
    }

    public static Map<String, Object> successResponse(Object data){

        Map<String, Object> map = new HashMap();
        map.put("success", true);
        map.put("errorMsg", "");
        map.put("data", data);

        return map;
    }

    public static Map<String, Object> successResponse(){

        Map<String, Object> map = new HashMap();
        map.put("success", true);
        map.put("errorMsg", "");

        return map;
    }

    public static Map<String, Object> pageData(Object data, int total){

        Map<String, Object> dataMap = new HashMap();
        dataMap.put("list", data);
        dataMap.put("total", total);

        return dataMap;
    }
}
