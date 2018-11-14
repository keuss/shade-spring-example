package com.keuss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class SpringDemo {

    public static void main(String... args) {

        // test with spring-app.xml in maven resources folder
    	// OK ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-app.xml");
        // OK ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-app.xml");

        // test with spring-app.xml shaded in com/keuss
        // OK ApplicationContext context = new ClassPathXmlApplicationContext("spring-app.xml", SpringDemo.class);
        // OK ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:com/keuss/spring-app.xml");
        // OK ApplicationContext context = new FileSystemXmlApplicationContext("classpath*:com/keuss/spring-app.xml");

        // test with java -jar target/spring-test-shade-0.0.1-SNAPSHOT-shaded.jar
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:com/keuss/spring-app.xml");
    	MyBean bean=(MyBean) context.getBean("myBean");
        System.out.println(bean.getName());
        Resource template = context.getResource("com/keuss/test.txt");
        System.out.println(template.getFilename());
    }
}