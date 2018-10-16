package com.amvue.amvueserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.amvue.amvueserver.*.*Mapper.xml")
public class AmvueServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmvueServerApplication.class, args);
    }
}
