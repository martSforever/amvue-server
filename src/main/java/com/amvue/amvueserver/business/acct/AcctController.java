package com.amvue.amvueserver.business.acct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("acct")
public class AcctController {

    @RequestMapping("sayHello")
    public String sayHello() {
        return "hello world";
    }

}
