package com.anil.ff4j.example.demo.controller;

import org.ff4j.FF4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/")
public class HomeController {


     @Autowired
    public FF4j ff4j;


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String get1() {

        String sd = "";

        if (ff4j.exist("feature_1")) {
            if (ff4j.check("feature_1")) {
                sd = "Hello world";

            }
        }
         else{
            sd ="none";
        }

        return sd;
    }
}
