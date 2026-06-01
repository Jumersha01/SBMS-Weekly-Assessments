package com.nt;

import com.nt.emp.EmployeConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExamEmployeeConfigProjApplication {

	private final EmployeConfig employeConfig;

	ExamEmployeeConfigProjApplication(EmployeConfig employeConfig) {
		this.employeConfig = employeConfig;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(ExamEmployeeConfigProjApplication.class, args);
		EmployeConfig c =ctx.getBean(EmployeConfig.class);
		System.out.println(c);
	}

}
