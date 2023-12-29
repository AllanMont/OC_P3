package chatop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import chatop.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
