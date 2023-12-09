package model;

import java.time.LocalDateTime;

public class rental {
	
	  private Integer id;
	  private String name;
	  private Double price;
	  private Double surface;
	  private String picture;
	  private String description;
	  private Integer owner_id;
	  private LocalDateTime created_at;
	  private LocalDateTime updated_at;
	  
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public Double getSurface() {
		return surface;
	}
	public String getPicture() {
		return picture;
	}
	public String getDescription() {
		return description;
	}
	public Integer getOwner_id() {
		return owner_id;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
}
