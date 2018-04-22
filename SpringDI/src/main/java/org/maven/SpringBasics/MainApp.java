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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
        
    }
}
