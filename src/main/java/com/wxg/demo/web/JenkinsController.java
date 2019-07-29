package com.wxg.demo.web;

import com.wxg.demo.service.JenkinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {

    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    @Autowired
    private JenkinsService jenkinsService;
    @RequestMapping("test1")
    public String test() {
        return jenkinsService.test1();
    }

}
