package com.stackroute;

import com.stackroute.Domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie one = context.getBean("one",Movie.class);
        System.out.println(one.getActor());



    }
}
