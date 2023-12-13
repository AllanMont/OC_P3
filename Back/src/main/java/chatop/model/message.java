package chatop.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "message")
public class message {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;
	  private Integer rental_id;
	  private Integer user_id;
	  private String message;
	  private LocalDateTime created_at;
	  private LocalDateTime updated_at;
	  
	public Integer getId() {
		return id;
	}
	public Integer getRental_id() {
		return rental_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public String getMessage() {
		return message;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
}
