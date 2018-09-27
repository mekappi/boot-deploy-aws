package boot.deploy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	private long id;
	
	private String name;
	
	private String email;
	
	
}
