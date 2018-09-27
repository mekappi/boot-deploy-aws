package boot.deploy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import boot.deploy.form.UserForm;
import boot.deploy.service.UserService;

@Controller
@RequestMapping("user/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("new/")
	public String inputUser() {
		return "user/input_user";
	}
	
	@PostMapping("new/")
	public String newUser(@Valid UserForm form, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "user/input_user";
		}
		
		userService.register(form);
		
		return "redirect:/user/complete/";
	}
	
	
	@GetMapping("complete/")
	public String complete() {
		return "user/complete";
	}
}
