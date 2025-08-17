package config;

import java.time.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "sbeans")
public class AppConfig{
	public AppConfig() {
		
	}
	
	@Bean(name="ltime")
	public LocalTime createLtime() {
		return LocalTime.now();
	}
	
	@Bean(name = "ldate")
	public LocalDate createLDate() {
		return LocalDate.now();
	}
}
