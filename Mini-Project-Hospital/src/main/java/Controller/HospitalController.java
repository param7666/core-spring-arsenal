package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.model.Hospital;
import com.service.HospitalService;


@Controller

public class HospitalController {
	@Autowired
	private HospitalService hser;
	
	 public String showHospital(Hospital hos) {
		 
	 }
	
}
