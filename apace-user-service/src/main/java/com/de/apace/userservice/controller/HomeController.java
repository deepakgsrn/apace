/**
 * 
 */
package com.de.apace.userservice.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Deepak Gunasekaran
 * @since  28-Jun-2020 10:20:31 PM
 *
 */

@RestController
@RequestMapping(value = "/api/user")
public class HomeController {
	
	
	@Value("${spring.application.name}")
	private String applicationName;
	
	@Value("${server.port}")
	private String serverPort;
	
	@Value("${spring.profiles.active:default}")
	private String activeProfile;
	
	@GetMapping("/ping")
	@Produces(value = MediaType.TEXT_PLAIN)
	public String getHome() {
		return "Welcome to User Service! [from "+applicationName+"@"+serverPort+" with active "+activeProfile+" profile ]";
	}
}
