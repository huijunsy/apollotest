package com.hsj.apollotest.controller;

import com.hsj.apollotest.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apollo")
public class ApolloController {

    @Autowired
    private MyConfig myConfig;

    @RequestMapping("/get")
    public String test(){
        return myConfig.getNode();
    }


}
