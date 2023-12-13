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
@Table(name = "user")
public class user {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;
	  private String name;
	  private String email;
	  private String password;
	  private LocalDateTime created_at;
	  private LocalDateTime updated_at;
	  
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
	  
	  
}
