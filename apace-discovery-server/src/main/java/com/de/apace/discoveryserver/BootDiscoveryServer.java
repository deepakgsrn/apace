/**
 * 
 */
package com.de.apace.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Deepak Gunasekaran
 * @since 28-Jun-2020 4:39:48 PM
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class BootDiscoveryServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BootDiscoveryServer.class, args);
	}

}
