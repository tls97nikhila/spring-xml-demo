package com.stackroute;
import com.stackroute.Domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
    public static void main(String[] args) {

        //using XmlBeanFactory
        XmlBeanFactory factory= new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie one= (Movie)factory.getBean("one");
        Movie dubOne= (Movie)factory.getBean("one");

        //using Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie two = context.getBean("two",Movie.class);
        Movie remakeTwo= context.getBean("two",Movie.class);

        Movie three = context.getBean("three",Movie.class);
        // actor 1 data
        System.out.println(one.getActor());

        // actor 2 data

        System.out.println(two.getActor());
        // actor 3 data
        System.out.println(three.getActor());

        System.out.println("For Singleton Scope" );
        System.out.println(one==dubOne);
        System.out.println("For Prototype Scope" );
        System.out.println(two==remakeTwo);

    }
}
