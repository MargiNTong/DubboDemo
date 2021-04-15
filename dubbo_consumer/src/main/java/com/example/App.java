package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo_consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.sayHello("Tong"));
        System.out.println(demoService.Add(12,56));
        try{
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println( "Byebye,Consumer!" );
    }
}
