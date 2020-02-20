package com.rbasystems.learn.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="sendLocalInfo")
	public String sayHello() {
		return restTemplate.getForObject("http://localhost:8081/respond",String.class);
	}
	
	private String sendLocalInfo() {
		return "This is local info";
	}
}
