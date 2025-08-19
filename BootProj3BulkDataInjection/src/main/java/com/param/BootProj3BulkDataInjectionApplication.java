package com.param;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.param.sbeans.ParamInfo;

@SpringBootApplication
public class BootProj3BulkDataInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj3BulkDataInjectionApplication.class, args);
		ParamInfo p=ctx.getBean("pr",ParamInfo.class);
		System.out.println(p);
	}

}
