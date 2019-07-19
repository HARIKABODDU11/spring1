package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//BeanLifecycleDemoBean class  that implementsInitializingBean and DisposableBean.

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    public void customInit(){
        System.out.println("customInt");
    }
public void customDestroy(){
    System.out.println("customDestroy");
}
    
    //Override the required methods to print out messages
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean");

    }
}
