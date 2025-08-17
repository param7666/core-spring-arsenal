package package04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "package04")
public class User {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(User.class);
		System.out.println("User press power Button");
		Printer pr=context.getBean(Printer.class);
		pr.print();
				
	}
}
