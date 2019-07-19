package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie{
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
}
