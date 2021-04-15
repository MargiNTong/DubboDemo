package com.example;

import com.sun.org.apache.bcel.internal.util.ClassPath;
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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo_provider.xml");
        context.start();
        System.out.println("dubbo_provider Running!");
        try{
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println( "Byebye!" );
    }
}
