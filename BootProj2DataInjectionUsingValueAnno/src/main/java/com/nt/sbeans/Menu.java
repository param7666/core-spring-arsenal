package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("mn")
@Data
public class Menu {
	@Value("${h.pizza}")
	private double pizza;
	@Value("${h.vadapaw}")
	private double vadapaw;
	@Value("${h.manchurian}")
	private double manchurian;
	@Value("${h.cocacola}")
	private double cocacola;
	@Value("${h.burger}")
	private double burger;
	@Value("${h.samosa}")
	private double samosa;
}
