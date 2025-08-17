package package04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Printer {
	
	public Ink ink;
	
	@Autowired
	public Printer(Ink ink) {
		this.ink=ink;
	}
	
	public void print() {
		ink.ink();
		System.out.println("Printing Document");
	}
}
