package player;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainPlayerApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
		PlayerService p=con.getBean(PlayerService.class);
		p.displayInfo();
		con.close();
	}
}
