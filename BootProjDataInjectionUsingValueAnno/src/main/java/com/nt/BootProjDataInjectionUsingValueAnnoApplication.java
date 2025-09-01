package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.PetientInfo;

@SpringBootApplication
public class BootProjDataInjectionUsingValueAnnoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProjDataInjectionUsingValueAnnoApplication.class, args);
		PetientInfo pinfo=ctx.getBean("pinfo",PetientInfo.class);
		System.out.println(pinfo);
	}

}
