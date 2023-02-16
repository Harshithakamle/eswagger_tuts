package com.eswagger.eswagger_tuts.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eswagger.eswagger_tuts.reponse.TicketInfo;
import com.eswagger.eswagger_tuts.request.PassengerInfo;

@RestController
public class AirIndiaRestController {

	@PostMapping("/bookFlightTicket")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo pinfo){
		
		TicketInfo tic = new TicketInfo();
            tic.setName(pinfo.getFname()+""+pinfo.getLname());
            tic.setFrom(pinfo.getFrom());
            tic.setTo(pinfo.getTo());
            tic.setTicketStatus("CONFIRMED");
            tic.setTicketPrice("5000.00 INR");
            tic.setJourneyDate(pinfo.getJourneyDate());
		return new ResponseEntity<>(tic,HttpStatus.CREATED);		         
	}
}
