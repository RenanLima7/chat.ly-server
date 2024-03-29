package com.chatly.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO{
	@NotBlank(message = "The 'name' is required")
	@NotNull(message = "The 'name' is required")
	private String name;
	
	@NotBlank(message = "The 'email' is required")
	@NotNull(message = "The 'email' is required")
	@Email(message = "The 'email' is invalided")
	private String email;
	
	@NotBlank(message = "The 'password' is required")
	@NotNull(message = "The 'password' is required")
	@Size(message = "The 'password' must be at least 8 characters long", min = 8) 
	private String password;
	
	@NotBlank(message = "The 'occupation' is required")
	@NotNull(message = "The 'occupation' is required")
	private String occupation;
	
	private MultipartFile avatar;
}
