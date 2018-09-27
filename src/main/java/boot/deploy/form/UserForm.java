package boot.deploy.form;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class UserForm {
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String email;
	
}
