/**
 * 
 */
package com.de.apace.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Deepak Gunasekaran
 * @since  28-Jun-2020 10:02:09 PM
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class BootUserService {

	public static void main(String[] args) {
		SpringApplication.run(BootUserService.class, args);
	}
}
