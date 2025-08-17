package com.nit.package01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	
	public Speaker s;
	
	@Autowired //Setter based annotation injection
	public void setSpeaker(Speaker s) {
		this.s=s;
	}
	
	public void openMusicPlayer() {
		System.out.println("Music Player Opened");
		s.playSound();
	}
}
