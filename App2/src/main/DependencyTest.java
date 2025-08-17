package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import sbeans.WishMessage;

public class DependencyTest {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessage generate=(WishMessage)ctx.getBean("wmg");
		String message=generate.generateMessage("Param");
		System.out.println(message);
	}
}
