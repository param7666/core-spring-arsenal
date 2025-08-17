package package03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	
	public Engine eng;
	
	@Autowired
	public Bike(Engine eng) {
		this.eng=eng;
	}
	
	public void run() {
		eng.Start();
		System.out.println("Bike is Running");
	}
}
