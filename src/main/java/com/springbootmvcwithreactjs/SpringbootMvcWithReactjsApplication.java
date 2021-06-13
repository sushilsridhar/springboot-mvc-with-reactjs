package com.springbootmvcwithreactjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
public class SpringbootMvcWithReactjsApplication extends SpringBootServletInitializer {

	/* SpringBootServletInitializer - Initializes Servlet 'dispatcherServlet' */

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcWithReactjsApplication.class, args);
	}

}
