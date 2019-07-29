package com.wxg.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class JenkinsDao {

    public String test1() {
        return "从数据库中获取数据";
    }
}
