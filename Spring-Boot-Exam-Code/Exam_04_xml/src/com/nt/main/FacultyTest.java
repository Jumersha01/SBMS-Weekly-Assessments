package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Facutly;

public class FacultyTest {
 public static void main(String [] args) {
FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	 Object obj = context.getBean("fac");
	 
	 Facutly fac =(Facutly) obj;
	 IO.println(fac);
 }
}
