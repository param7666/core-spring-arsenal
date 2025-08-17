package com.nit.package01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nit.package01")
public class Listener {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Listener.class);
		MusicPlayer m=context.getBean(MusicPlayer.class);
		m.openMusicPlayer();
		System.out.println("Dancing on this song");
		System.out.println("Beacuse my program run successfully..!");
	}
}
