package package05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {
	public Liabraby lib;
	
	@Autowired
	public Book(Liabraby lib) {
		this.lib=lib;
	}
	
	public void checkBook() {
		lib.liabrary();
		System.out.println("Book is availble");
	}
}
