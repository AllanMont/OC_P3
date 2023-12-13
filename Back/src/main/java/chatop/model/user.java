package chatop.model;

import java.time.LocalDateTime;

public class user {

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
