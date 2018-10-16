package com.amvue.amvueserver.core;

import java.util.HashMap;
import java.util.Map;

public class ControllerUtils {

    public static Map<String, Object> success(Object obj) {
        Map<String, Object> ret = new HashMap<>();
        ret.put("ret", obj);
        ret.put("code", 0);
        return ret;
    }

    public static Map<String, Object> error(Object obj) {
        Map<String, Object> ret = new HashMap<>();
        ret.put("code", 1);
        return ret;
    }

}
