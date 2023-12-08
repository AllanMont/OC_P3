package oc.projet3.chatop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DBUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String email;
	private String name;
	private String password;
	private String role;
	private String created_at;
	private String updated_at;
	
	public Integer getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getCreated_at() {
		return created_at;
	}
	
	public String getUpdated_at() {
		return updated_at;
	}	
	
	public String getRole() {
		return role;
	}
}