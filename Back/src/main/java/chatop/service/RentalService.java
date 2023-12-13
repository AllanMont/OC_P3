package chatop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chatop.repository.RentalRepository;
import lombok.Data;

@Data
@Service
public class RentalService {

  @Autowired
  private RentalRepository rentalRepository;
  
    public void getAllRentals() {
        
    }


}
