package com.nt.sbeans;

public class Faculty {
int facultyId;
String name;
Course course;

public Faculty(Course course) {
	this.course=course;
}
public int getFacultyId() {
	return facultyId;
}
public void setFacultyId(int facultyId) {
	this.facultyId = facultyId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
@Override
public String toString() {
	return "Faculty [facultyId=" + facultyId + ", name=" + name + ", course=" + course + "]";
}


}
