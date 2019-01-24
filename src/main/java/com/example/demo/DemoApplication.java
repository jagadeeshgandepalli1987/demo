package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.domain.Employee;

@SpringBootApplication
@RestController
public class DemoApplication {
	
	@Autowired
	RestTemplate restTemplate;

	public static void main(String[] args) {
		System.out.println("Rest application Starter");
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping(value = "/")
	   public String hello() {
		System.out.println("Rest controller starter");
	      return "Hello World Jagadeesh";
	   }
	
	@RequestMapping(value = "/hello")
	   public String hello1() {
		System.out.println("Rest controller Hello world");
	      return "May be your world is different";
	   }
	
	@RequestMapping(value = "/employee")
	   public String employeeDatails() {
			Employee e=new Employee(1, "ram", "HYD");
	      return "No:"+e.getEmpNo()+"\n Name: "+e.geteName()+"\n Address: "+e.geteAdd();
	   }
	
	@Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();   
	   }
}
