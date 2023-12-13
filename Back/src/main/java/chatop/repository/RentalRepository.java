package chatop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import chatop.model.rental;

@Repository
public interface RentalRepository extends CrudRepository<rental, Long> {

}
