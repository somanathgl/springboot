package com.springboot.rest.books;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.servlet.Servlet;

@RestController
public class FileUploadontroller {
	
	private FileHelperController fileHelperController;
	@PostMapping("/file")
	
	
	
	public ResponseEntity<String> uploadfile(@RequestParam("file") MultipartFile file){
		try {
		if(file.isEmpty()) {
			ResponseEntity.status(HttpStatus.CREATED).body(file);
		}
		
		if(file.getContentType().equals("images/png")) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("only png file allowed");
		}
		
		boolean f = fileHelperController.filehelper(file);
		if(f) {
			return ResponseEntity.status(HttpStatus.CREATED).body("file successfully created");
			//return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename().toString()));
		}
		
		
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
	}
}
