package model;

import java.time.LocalDateTime;

public class message {
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
