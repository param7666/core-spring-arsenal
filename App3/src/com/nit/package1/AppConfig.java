package com.nit.package1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public MessageProvider msgProvider() {
		return new EnglishMessageProvider();
	}
	@Bean 
	public GreetingService grtService(MessageProvider msg) {
		return new GreetingService(msg);
	}
	
}
