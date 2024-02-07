package edu.mu;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class StudentManager {
	
	public Student[] studentArray = new Student[5];

	public StudentManager() {
		
		
		
	}
	

	
	
	
	
	public boolean searchStudentById(int id) {
		int currentId;
		boolean value = false;
		
		for(Student student : studentArray) {
			currentId = student.getId();
			if(currentId == id) {
				value = true;
				String info = student.toString();
				System.out.println(info);
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
		int i = 0;
		
		while(scan.hasNextLine())
		{
			int id = scan.nextInt();
			String firstName = scan.next();
			String lastName = scan.next();
			double grade = scan.nextDouble();

			scan.nextLine();
			
			String name = firstName + " " + lastName;
			
			Student student = new Student();
			student.setId(id);
			student.setName(name);
			student.setGrade(grade);
			
			studentArray[i] = student;
			student.toString();
			i++;
			
		}
		
		return true;
	}catch(FileNotFoundException e)
	{
		e.printStackTrace();
		return false;
	}
	
	
	
	
	
}

}