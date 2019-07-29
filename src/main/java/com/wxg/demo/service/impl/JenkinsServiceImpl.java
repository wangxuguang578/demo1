package com.wxg.demo.service.impl;

import com.wxg.demo.dao.JenkinsDao;
import com.wxg.demo.service.JenkinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JenkinsServiceImpl implements JenkinsService {

    @Autowired
    private JenkinsDao jenkinsDao;
    @Override
    public String test1() {
        return jenkinsDao.test1();
    }
}
