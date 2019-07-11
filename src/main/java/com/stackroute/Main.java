package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie  movie=context.getBean("movie",Movie.class);
        movie.displayActor();


        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1=(Movie) beanFactory.getBean("movie");
        movie1.displayActor();

        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        BeanDefinitionRegistry registry=new GenericApplicationContext(factory);
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        reader.loadBeanDefinitions("beans.xml");
        Movie picture1 = (Movie) factory.getBean("movie");
        picture1.displayActor();


    }
}
