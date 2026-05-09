package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	@Value("${s.id}")
	private int studentId;

	@Value("${s.name}")
	private String studentName;

	@Value("${s.course}")
	private String course;

	public void studentDetails() {
		System.out.println("Student id: "+this.studentId+"\nStuden Name: "+this.studentName+"\nCourse: "+this.course);
	}
}
