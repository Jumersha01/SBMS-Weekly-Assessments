package com.nt.sbeans;

public class Project {
    int projectId;
    
   String projectName;
   public int getProjectId() {
	return projectId;
   }
   public void setProjectId(int projectId) {
	this.projectId = projectId;
   }
   public String getProjectName() {
	return projectName;
   }
   public void setProjectName(String projectName) {
	this.projectName = projectName;
   }
   @Override
   public String toString() {
	return "Project [projectId=" + projectId + ", projectName=" + projectName + "]";
   }
   
   
   
   
   
   
	
}
