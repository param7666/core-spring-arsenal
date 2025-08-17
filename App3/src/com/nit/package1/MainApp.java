package com.nit.package1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext("AppConfig.class");
		Object obj=ctx.getBean("GreetingService.class");
		GreetingService grt=(GreetingService)obj;
		grt.printMessage();
	}
}
