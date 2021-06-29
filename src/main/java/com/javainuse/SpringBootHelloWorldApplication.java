package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.javainuse.*")
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(
				SpringBootHelloWorldApplication.class, args);

//		JmsTemplate jms = ctx.getBean(JmsTemplate.class);
//		jms.convertAndSend("test.foo", "test message");
	}
}
