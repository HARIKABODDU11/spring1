package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    public void customInit(){
        System.out.println("customInt");
    }
public void customDestroy(){
    System.out.println("customDestroy");
}
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean");

    }
}
