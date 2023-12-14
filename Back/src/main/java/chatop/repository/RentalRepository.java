package chatop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chatop.model.rental;

@Repository
public interface RentalRepository extends JpaRepository<rental, Long> {

}
