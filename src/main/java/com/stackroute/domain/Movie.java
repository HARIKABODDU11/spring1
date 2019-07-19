package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//Implement ApplicationContextAware, BeanFactoryAware, BeanNameAware in the movie class
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    //Movie “has a” Actor that can be initialized via the corresponding setter method.
    Actor actor;

    public Movie(){ }


    public void displayActor()

        {
        actor.display();
        }


    public void setActor(Actor actor) {
        this.actor = actor;
    }

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
