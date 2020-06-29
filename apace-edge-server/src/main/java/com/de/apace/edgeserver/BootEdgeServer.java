/**
 * 
 */
package com.de.apace.edgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Deepak Gunasekaran
 * @since 28-Jun-2020 10:44:17 PM
 *
 */

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class BootEdgeServer {

	public static void main(String[] args) {
		SpringApplication.run(BootEdgeServer.class, args);
	}
}
