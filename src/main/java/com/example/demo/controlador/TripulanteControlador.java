package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TripulanteControlador {

	@GetMapping("/gesTrip")
	public String selTripulante() {
		return "/admin/trip/index";
	}
	
	@GetMapping("/addTripulante")
	public String addTripulante() {
		return "/admin/trip/addTrip";
	}
}
