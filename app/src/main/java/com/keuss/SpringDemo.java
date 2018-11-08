package com.keuss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class SpringDemo {

    public static void main(String... args) {
    	 
    	// OK ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-app.xml");
        // OK ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-app.xml");
        // test with java -jar target/spring-test-shade-0.0.1-SNAPSHOT-shaded.jar
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-app.xml");
    	MyBean bean=(MyBean) context.getBean("myBean");
        System.out.println(bean.getName());
        Resource template = context.getResource("com/keuss/test.txt");
        System.out.println(template.getFilename());
    } 
}