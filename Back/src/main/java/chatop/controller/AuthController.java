package chatop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chatop.register.RegisterRequest;
import chatop.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    
    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    
	@GetMapping("/me")
	public void getMyInfosUser() {
		
	}
	
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterRequest registerRequest) {
    	boolean registrationResult = authService.registerUser(registerRequest);

        if (registrationResult) {
            return ResponseEntity.ok("Inscription réussie !");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Échec de l'inscription.");
        
    }
    
    
	
	@PostMapping("/login")
	public void loginUser() {
		
	}
}
