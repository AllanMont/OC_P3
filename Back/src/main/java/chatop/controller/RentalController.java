package chatop.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chatop.model.rental;
import chatop.service.RentalService;

@RestController
@RequestMapping("/api/rentals")
public class RentalController {

  private final RentalService rentalService;
	  
  	@Autowired
  	public RentalController(RentalService rentalService) {
      this.rentalService = rentalService;
  	}
  
	@GetMapping	
	public ResponseEntity<Map<String, List<rental>>> getAllRentals() {
	    return ResponseEntity.ok(rentalService.getAllRentals());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<rental> getOneRentalById(@PathVariable Long id) {
	    Optional<rental> optionalRental = rentalService.getOneRentalById(id);

	    if (optionalRental.isPresent()) {
	        rental foundRental = optionalRental.get();
	        return ResponseEntity.ok(foundRental);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

	
	@PostMapping
	public void newRental() {
		
	}
	
	@PutMapping("/{id}")
	public void updateRentalById(Integer id) {
		
	}
}
