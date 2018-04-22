package org.apache.camel.bindy.model;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("camelContext.xml");
    
        CamelContext camelContext = context.getBean(CamelContext.class);
        
        camelContext.start();
        Thread.sleep(5000);
        camelContext.stop();
        System.out.println("Done");
        
        
    }
}
