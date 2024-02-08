package edu.mu;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		StudentManager manager = new StudentManager();
		
		boolean fileStatus = false;

        
        String name = "studentData.txt";
		
		fileStatus = manager.readFromFile(name);
		
		System.out.println(fileStatus);
		
		boolean status = false;
		
		 status =manager.searchStudentById(101);
		
		 status =manager.searchStudentById(102);
		
		 status =manager.searchStudentById(103);
		
		 status =manager.searchStudentById(104);
		
		 status =manager.searchStudentById(105);
		
		 
	}

}
