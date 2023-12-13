package chatop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chatop.model.rental;
import chatop.repository.RentalRepository;
import lombok.Data;

@Data
@Service
public class RentalService {

  @Autowired
  private RentalRepository rentalRepository;
  
  public Iterable<rental> getAllRentals() {
      return rentalRepository.findAll();
  }

  public Optional<rental> getOneRentalById(final Long id) {
      return rentalRepository.findById(id);
  }

  public rental newRental(rental Rental) {
      rental savedRental = rentalRepository.save(Rental);
      return savedRental;
  }

}
