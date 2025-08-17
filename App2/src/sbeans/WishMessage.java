package sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessage {
	@Autowired
	private LocalTime lt;
	@Autowired
	private LocalDate dt;
	
	public WishMessage() {
		System.out.println("0 param const");
	}
	
	//method to genenrate message
	public String generateMessage(String name) {
		int hour=lt.getHour();
		if(hour<12) return "Good Morning"+name;
		else if(hour<16) return "Good Afternoon: "+name;
		else if(hour<20) return "Good Evenining"+name;
		else return "Good Night: "+name;
	}
}
