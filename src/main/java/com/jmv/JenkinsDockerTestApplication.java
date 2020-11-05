package com.jmv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JenkinsDockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerTestApplication.class, args);
	}

}


@RestController
@RequestMapping
class Hello {
	
	@GetMapping
	public String hello() {
		return "Hello";
	}
}