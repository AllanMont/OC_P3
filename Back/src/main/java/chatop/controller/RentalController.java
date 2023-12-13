package chatop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rentals")
public class RentalController {

	@GetMapping	
	public void getAllRentals() {
		
	}
	
	@GetMapping("/{id}")
	public void getOneRentalById(Integer id) {
		
	}
	
	@PostMapping
	public void newRental() {
		
	}
	
	@PutMapping("/{id}")
	public void updateRentalById(Integer id) {
		
	}
}
