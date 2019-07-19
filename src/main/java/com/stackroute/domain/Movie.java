package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//Implementation of ApplicationContextAware, BeanFactoryAware, BeanNameAware in the Movie class

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    Actor actor;

    public Movie(){ }


    public void displayActor()

        {
        actor.display();
        }


    public void setActor(Actor actor) {
        this.actor = actor;
    }
    //Override the required methods to print out messages

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanName");

    }
}
