package com.skilldistillery.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CodeConnectionsApplication extends SpringBootServletInitializer{

	@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(CodeConnectionsApplication.class);
	  }
	
	
	public static void main(String[] args) {
		SpringApplication.run(CodeConnectionsApplication.class, args);
	}

}
