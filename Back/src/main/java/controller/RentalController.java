package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rentals")
public class RentalController {

	@GetMapping	
	public getAllRentals() {
		
	}
	
	@GetMapping("/{id}")
	public getOneRentalById(id Integer) {
		
	}
	
	@PostMapping
	public newRental() {
		
	}
	
	@PutMapping("/{id}")
	public updateRentalById(id Integer) {
		
	}
}
