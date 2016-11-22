package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class A21Application {

	@Value("${weikun.username}")
	private String username;

	@RequestMapping("/")
	public String index(){
		return username+"你好吗？";
	}
	public static void main(String[] args) {
		SpringApplication.run(A21Application.class, args);
	}
}
