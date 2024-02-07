package edu.mu;

public class StudentManager {

	public StudentManager() {
		// TODO Auto-generated constructor stub
		
		 public Student search(int id) {
			 // using a loop to iterate through the students to find the right one
			 for (Student student : students) {
				 if (student.getId() == id) {
					 return student; // find the right student using their id
					 }
				 }
			 }
		        return null; // Student not found
		    
	}
	// using the id we just got to identify the student we are going to update their grade
	public boolean updateStudentGradeById(int id, double grade) {
        Student student = search(id);
        if (student != null) {
            student.setGrade(grade);
            return true; // Student found and updated
        }
        return false; // Student ID not found
    }

	
	
	
}
