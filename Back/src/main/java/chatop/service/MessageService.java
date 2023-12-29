package chatop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chatop.model.Message;
import chatop.repository.MessageRepository;
import lombok.Data;

@Data
@Service
public class MessageService {
	
	  @Autowired
	  private MessageRepository messageRepository;

	  public Message newMessages(Message message) {
	    return messageRepository.save(message);
	  }
}
