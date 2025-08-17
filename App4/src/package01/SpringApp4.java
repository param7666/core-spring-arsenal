package package01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "package01")
public class SpringApp4 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext("SpringApp4.class");
		car c=(car) cont.getBean("car.class");
		c.startCar();
	}
}
