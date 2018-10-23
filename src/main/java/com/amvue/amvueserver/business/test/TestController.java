package com.amvue.amvueserver.business.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("test")
    public Map<String, Object> test() {
        Map<String, Object> ret = new HashMap<>();
        ret.put("code", 0);
        ret.put("ret", "hello world");
        return ret;
    }

}
