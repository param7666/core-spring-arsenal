package package02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public Engine eng;
	
	@Autowired //constructor based injection
	public Car(Engine eng) {
		this.eng=eng;
	}
	
	public void Start() {
		eng.run();
		System.out.println("Car is Running");
	}
}
