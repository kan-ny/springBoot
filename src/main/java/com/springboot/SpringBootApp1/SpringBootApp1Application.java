package com.springboot.SpringBootApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class Phone{

	public void respondCall(){
		System.out.println("Hello, who is there.");
	}
}
//
//@Configuration
//@ComponentScan(basePackages = "com.springboot.SpringBootApp1" )
//class AppConfig{
////
////	@Bean
////	Phone phone(){
////		return new Phone();
////	}
//
//}

@SpringBootApplication
public class SpringBootApp1Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootApp1Application.class, args);

//		 = new AnnotationConfigApplicationContext(AppConfig.class);
		Phone p = applicationContext.getBean(Phone.class);
		p.respondCall();
	}



}
