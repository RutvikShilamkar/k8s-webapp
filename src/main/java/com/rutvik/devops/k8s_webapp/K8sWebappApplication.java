package com.rutvik.devops.k8s_webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sWebappApplication {

	@GetMapping("/hello")
	public String hello() {
		return "hello world!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(K8sWebappApplication.class, args);
	}

}
