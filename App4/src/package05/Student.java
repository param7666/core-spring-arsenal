package package05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "package05")
public class Student {
	public static void main(String[]args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Student.class);
		Book b=context.getBean(Book.class);
		b.checkBook();
		System.out.println("Student reading Book");
	}
}
