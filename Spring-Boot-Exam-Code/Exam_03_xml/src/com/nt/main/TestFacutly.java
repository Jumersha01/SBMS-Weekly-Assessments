package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Faculty;

public class TestFacutly {
  public static void main(String[] args) {
	  FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/nt/cfgs/applicationContext.xml");
	  
	  Object obj = context.getBean("fac");
	  Faculty facs = (Faculty) obj;
	  IO.println(facs);
  }
}
