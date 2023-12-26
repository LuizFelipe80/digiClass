package com.asset.digiclass.resources;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asset.digiclass.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		User u = new User(
				1L,
				"Felipe",
				"felipe@marques.com",
				"(12)99610-9696",
				LocalDate.parse("04/04/1994", formatter),
				"Fellippao",
				"123456");
		return ResponseEntity.ok(u);
				
	}

}
