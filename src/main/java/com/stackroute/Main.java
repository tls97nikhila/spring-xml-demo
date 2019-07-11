package com.stackroute;
import com.stackroute.Domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.security.cert.X509Certificate;

public class Main {
    public static void main(String[] args) {

        //using XmlBeanFactory
        XmlBeanFactory factory= new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie one= (Movie)factory.getBean("one");

        System.out.println(one.getActor());
        //using Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie two = context.getBean("two",Movie.class);

        System.out.println(two.getActor());
    }
}
