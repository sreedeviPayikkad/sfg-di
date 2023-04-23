package com.example.springdi;

import com.example.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		HelloController c = (HelloController)ctx.getBean("helloController");
		System.out.println(c.sayHello());
		System.out.println("via property...");
		System.out.println(((PropertyInjectedController)ctx.getBean("propertyInjectedController")).getGreeting());
		System.out.println("via setter...");
		System.out.println(((SetterInjectedController)ctx.getBean("setterInjectedController")).getGreeting());
		System.out.println("via constructor");
		System.out.println(((ConstructorInjectedController)ctx.getBean("constructorInjectedController")).getGreeting());
		System.out.println("from i18ncontroller...");
		System.out.println(((i18nController)ctx.getBean("i18nController")).sayHello());

	}


}
