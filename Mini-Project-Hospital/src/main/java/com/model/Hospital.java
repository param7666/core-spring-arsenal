package com.model;

import lombok.Data;

@Data
public class Hospital {
	private long id;
	private String name;
	private String location;
	private int beds;
}
