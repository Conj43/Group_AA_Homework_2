package edu.mu;

public class StudentManager {
	
	private Student[] studentArray;
	
	public StudentManager() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	public boolean searchStudentById(int id) {
		int currentId;
		boolean value = false;
		
		for(Student student : studentArray) {
			currentId = student.getId();
			if(currentId == id) {
				value = true;
				student.toString();
			}
		}
		if(!value) {
			System.out.println("Error, Student cannot be found!");
		}
		return value;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
