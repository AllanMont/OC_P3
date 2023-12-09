package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

	@GetMapping("/me")
	public getMyInfosUser() {
		
	}
	
	@PostMapping("/register")
	public registerUser() {
		
	}
	
	@PostMapping("/login")
	public loginUser() {
		
	}
}
