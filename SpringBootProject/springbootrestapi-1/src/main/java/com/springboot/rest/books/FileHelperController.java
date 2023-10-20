package com.springboot.rest.books;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
public class FileHelperController {

	public final String UPLOAD_DIR="xyz";
	
	public boolean filehelper(MultipartFile multipartFile) {
		boolean f=false;
		try {
		if(f) {
			Files.copy(multipartFile.getInputStream(),Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
		}
		
		f=true;
		
	}
		catch (Exception e) {
			e.printStackTrace();
		}
		return true;
}
}