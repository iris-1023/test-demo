package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
// @Scope("prototype") //一个或多个实例，默认为一个
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService() {
        // System.out.println("实例化AlphaService");
    }

    @PostConstruct // 代表这个方法会在构造器之后调用
    public void init() {
        // System.out.println("初始化AlphaService");
    }

    @PreDestroy // 代表在销毁之前调用
    public void destroy() {
        // System.out.println("销毁AlphaService");
    }

    public String find() {
        return alphaDao.select();
    }

}
