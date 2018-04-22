package org.maven.SpringBasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainApp 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        
        HelloWorld helloWorldA = (HelloWorld) context.getBean("helloWorld");
        //helloWorldA.setMessage("I'm object A");
        helloWorldA.getMessage();
       /* 
        HelloWorld helloWorldB = (HelloWorld) context.getBean("helloWorld");
        helloWorldB.getMessage();*/
        
        HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
        helloIndia.getMessage();
        helloIndia.getMessage1();
        
        context.registerShutdownHook();
    }
}
