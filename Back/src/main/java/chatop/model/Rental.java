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
@Table(name = "RENTALS")
public class Rental {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;
    
	  private String name;
	  private Double price;
	  private Double surface;
	  private String picture;
	  private String description;
	  private Integer owner_id;
	  private LocalDateTime created_at;
	  private LocalDateTime updated_at;
	  
}
