package chatop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chatop.model.user;

@Repository
public interface UserRepository extends JpaRepository<user, Long> {

}
