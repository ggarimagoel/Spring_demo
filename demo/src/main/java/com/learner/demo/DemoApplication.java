package com.learner.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("hello world");
		ApplicationContext context = new ClassPathXmlApplicationContext("confi.xml");
		// create confi.xml file in resources
		Student student1 = (Student) context.getBean("student1");
		Student student2 = (Student) context.getBean("student2");

		// property injection
		System.out.println(student1);
		System.out.println(student2);

//		SpringApplication.run(DemoApplication.class, args);
	}

}
