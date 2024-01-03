package chatop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chatop.model.User;
import chatop.repository.UserRepository;
import lombok.Data;

@Data
@Service
public class UserService {

	  @Autowired
	  private UserRepository userRepository;
	  
	  public Optional<User> getInfosUserById(final Long id) {
	      return userRepository.findById(id);
	  }
}
