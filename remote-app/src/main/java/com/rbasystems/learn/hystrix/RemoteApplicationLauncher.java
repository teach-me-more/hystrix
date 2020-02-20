package com.rbasystems.learn.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class RemoteApplicationLauncher {

	public static void main(String[] args) {
		SpringApplication.run(RemoteApplicationLauncher.class,args);
	}


	
	@GetMapping("/respond")
	public String checkHystrix() {
		return "RemoteServiceResponse";
	}
}
