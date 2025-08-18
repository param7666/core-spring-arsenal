package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class BootProj2DataInjectionUsingValueAnnoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj2DataInjectionUsingValueAnnoApplication.class, args);
		Hotel h=ctx.getBean("ht",Hotel.class);
		System.out.println(h);
	}

}
