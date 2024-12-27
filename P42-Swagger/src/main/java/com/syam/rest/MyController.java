package com.syam.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.syam.request.Passenger;
import com.syam.response.Train;

@RestController
public class MyController {
	
	@GetMapping("/")
	public ResponseEntity<String> welcome(){
		String msg="This my first SWAGGER and REST Client Project";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	
	
	@PostMapping("/booking")
	public ResponseEntity<Train> booking(@RequestBody Passenger passengerInfo){
		
		Train train = new Train();
		train.setName(passengerInfo.getFirstName()+" "+passengerInfo.getLastName());
		train.setTrainName("Vss12345");
		train.setDatee(passengerInfo.getDate());
		train.setTrainNo(12345);
		train.setCost(500);
		
		return new ResponseEntity<>(train,HttpStatus.CREATED);
		
		
	}

}
