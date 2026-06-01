package com.nt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("university")
public class UniversityConfig {
 
	private String name;
	private String location;
	private int admissionFee;
	private String contact;
	
	
}
