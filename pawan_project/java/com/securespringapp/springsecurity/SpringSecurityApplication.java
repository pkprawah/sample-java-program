package com.securespringapp.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackages = "com.happiestminds.springsecurity")
//@SpringBootApplication
@SpringBootApplication
@ComponentScan
public class SpringSecurityApplication {

	public static void main(String[] args) {
		System.out.println("main method is called");
		SpringApplication.run(SpringSecurityApplication.class, args);
		System.out.println("main method is calling to controller");
		
	}
}
