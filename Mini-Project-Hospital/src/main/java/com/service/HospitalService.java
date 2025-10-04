package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repo.HospitalRepo;
import com.model.Hospital;

@Service
public class HospitalService {
	
	@Autowired
	private HospitalRepo hsrepo;
	
	public List<Hospital> getHospitalByLocation(String Location) {
		return hsrepo.findByLocation(Location);
	}
}
