package br.com.eodontodigital.eodontodigitalAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class EodontodigitalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EodontodigitalApiApplication.class, args);
	}

	@GetMapping("/")
    public String hello() {
        return "E-odonto-digital API";
    }
	
}
