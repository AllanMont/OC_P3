package oc.projet3.chatop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P3JavaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(P3JavaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application Started");
	}

}
