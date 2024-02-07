package edu.mu;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class StudentManager {
	
	private Student[] studentArray;

	public StudentManager() {
		
		
		
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



public boolean readFromFile(String fileName)
{
	
	try
	{
		Scanner scan = new Scanner(new FileInputStream(fileName));
		
		
		for(int i = 0; i < 5; i++)
		{
			int id = scan.nextInt();
			String name = scan.next();
			double grade = scan.nextDouble();
			scan.next();
			
			Student student = new Student();
			student.setId(id);
			student.setName(name);
			student.setGrade(grade);
			
			studentArray[i] = student;
			student.toString();
			
		}
		
		return true;
	}catch(FileNotFoundException e)
	{
		e.printStackTrace();
		return false;
	}
	
	
	
	
	
}

}