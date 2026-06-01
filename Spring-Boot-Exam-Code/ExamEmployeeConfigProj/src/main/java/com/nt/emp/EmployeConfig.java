package com.nt.emp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("employee")
@Data
public class EmployeConfig {
	
	private int id;
	private String name;
	private String dept;
	private double salary;

}
