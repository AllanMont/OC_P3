package chatop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

	@GetMapping("/me")
	public void getMyInfosUser() {
		
	}
	
	@PostMapping("/register")
	public void registerUser() {
		
	}
	
	@PostMapping("/login")
	public void loginUser() {
		
	}
}
