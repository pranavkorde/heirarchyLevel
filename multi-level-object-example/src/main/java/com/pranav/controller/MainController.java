package com.pranav.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pranav.model.Address;
import com.pranav.model.Lane;
import com.pranav.model.StudentDetails;

@RestController
public class MainController {


	@RequestMapping(value = "/getStudent", method = RequestMethod.GET)
	public StudentDetails hello() {
		List<Lane> laneList = new ArrayList<Lane>();
		Lane ln=new Lane();
		ln.setFirstLane("Gamma Block");
		ln.setSecondLane("SSPDL");
		ln.setThirdLane("Navalur");
		laneList.add(ln);

		List<Address> adList = new ArrayList<Address>();
		Address ad=new Address();
		ad.setCity("Chennai");
		ad.setPincode(603103);
		ad.setState("Goa");
		ad.setLane(laneList);
		adList.add(ad);

		StudentDetails stuDetails=new StudentDetails();
		stuDetails.setRollNo("s1");
		stuDetails.setStuName("Pranav");
		stuDetails.setContact("9850148118");
		stuDetails.setAddress(adList);

		return stuDetails;
	}
}
