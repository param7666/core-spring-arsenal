package com.param;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInjection {
	
	@Bean(name="ld")
	public LocalDate createDate() {
		return LocalDate.now();
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DependencyInjection.class, args);
		SeasonFinder f=ctx.getBean("sf",SeasonFinder.class);
		String result=f.findSeason();
		System.out.println(result);
	}
}
