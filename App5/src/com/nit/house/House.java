package com.nit.house;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class House {
	
	private Room r;
	private Furniture f;
	private Applience a;
	
	@Autowired
	public void setRoom(Room r) {
		this.r=r;
	}
	
	@Autowired
	 public void setFurniture(Furniture f) {
		 this.f=f;
	 }
	 
	@Autowired
	 public void setApplience (Applience a) {
		 this.a=a;
	 }
	 
	 public void doSomething() {
		 System.out.println("Marrige Complete");
		 System.out.println("its time to go in room");
		 r.describe();
		 f.setUp();
		 a.lightOff();
		 System.out.println("Something Doing Aaaa yesss");
	 }
}
