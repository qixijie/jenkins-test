package com.ytf;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yuantongfeng
 * @Date 2020/11/26 19:38
 */
@SpringBootApplication
@RestController
public class DemoAppilication {

    public static void main(String[] args) {

        SpringApplication.run(DemoAppilication.class,args);

    }

    @GetMapping("demo/test")
    public  String nacosProvider(String name){
        return  "demo==="+name;
    }


}
