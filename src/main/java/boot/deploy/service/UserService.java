package boot.deploy.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.deploy.entity.User;
import boot.deploy.form.UserForm;
import boot.deploy.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void register(UserForm form) {
		User user = new User();
		BeanUtils.copyProperties(form, user);
		userRepository.save(user);
	}
	
}
