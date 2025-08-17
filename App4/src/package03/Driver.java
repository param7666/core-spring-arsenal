package package03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "package03")
public class Driver {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Driver.class);
		Bike b=context.getBean(Bike.class);
		System.out.println("Driver plug the key");
		b.run();
	}
}
