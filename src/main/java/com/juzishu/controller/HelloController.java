package com.juzishu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright 2022 juzishu.com Inc. All Rights Reserved.
 *
 * @author sunzhen
 * @date 2022/7/13 17:28
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/helloController")
    public String helloController(){
        return "jenkins自动化部署~";
    }
}
