package chatop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chatop.model.Rental;
import chatop.repository.RentalRepository;

@Service
public class RentalService {

  @Autowired
  private RentalRepository rentalRepository;
  
  public List<Rental> getAllRentals() {
	    return rentalRepository.findAll();
	}

  public Optional<Rental> getOneRentalById(final Integer id) {
      return rentalRepository.findById(id);
  }

  public Rental createRental(Rental Rental) {
      Rental savedRental = rentalRepository.save(Rental);
      return savedRental;
  }

}
