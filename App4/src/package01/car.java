package package01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car {
	@Autowired
	public Engine engine;
	
	public void startCar() {
		engine.start();
		System.out.println("Car Started");
	}
}
