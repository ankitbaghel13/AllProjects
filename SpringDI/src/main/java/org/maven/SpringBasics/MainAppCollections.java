package org.maven.SpringBasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainAppCollections 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context-collections.xml");
        
        JavaCollection javaCollections = (JavaCollection) context.getBean("javaCollection");
        javaCollections.getAddressList();
        javaCollections.getAddressSet();
        javaCollections.getAddressMap();
        javaCollections.getAddressProp();
        
    }
}
