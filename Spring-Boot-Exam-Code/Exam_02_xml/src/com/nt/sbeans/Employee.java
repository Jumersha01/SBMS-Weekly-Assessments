package com.nt.sbeans;

public class Employee {
Project project;
int empId;
String name;

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Project getProject() {
	return project;
}
public void setProject(Project project) {
	this.project = project;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", project=" + project + "]";
}





}
