package com.wxg.demo.web;

import com.wxg.demo.service.impl.JenkinsServiceImpl;
import javafx.scene.input.TouchEvent;
import jdk.nashorn.internal.ir.LiteralNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsControllerTest {

    @Autowired
    private JenkinsServiceImpl JenkinsService;
    @Autowired
    private JenkinsController jenkinsController;

    @Test
    public void test3() {
        String test = jenkinsController.test();
        List list = null;
//        list.add("张三");
        Assert.notEmpty(list,"list is empty");
    }
    @Test
    public void test1() {
        String str = JenkinsService.test1();
        int i = 1 / 0;
//        System.out.println();
        System.out.println(str);
        Assert.notNull(null, "查询结果 is null");
    }

    @Test
    public void test2() {
        String str = JenkinsService.test1();
        System.out.println(str);
        Assert.notNull(str, "str is null");
    }

}
