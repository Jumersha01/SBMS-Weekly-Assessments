package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext  context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		Object obj = context.getBean("emp");
		
		Employee emp = (Employee) obj;
		IO.println(emp);

	}

}
