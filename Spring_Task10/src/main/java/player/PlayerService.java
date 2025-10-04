package player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	
	@Autowired
	private Player player;
	
	public void displayInfo() {
		System.out.println(player.getName());
		System.out.println(player.getPlayerId());
		System.out.println(player.getPlayerNum());
		System.out.println(player.getTeamName());
	}
}
