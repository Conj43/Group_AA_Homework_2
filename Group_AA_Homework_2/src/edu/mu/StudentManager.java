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
		Scanner scan = new Scanner(new FileInputStream(fileName)); //sets new scanner object that reads from fileName
		int i = 0; // increment value to assign students to the array
		
		while(scan.hasNextLine()) //goes until the end of the file is reached
		{
			int id = scan.nextInt(); //grabs the ID from the line
			String firstName = scan.next(); //grabs the students first name
			String lastName = scan.next();  //grabs the students last name
			double grade = scan.nextDouble(); //grabs the students grade

			scan.nextLine(); //uses up the next line character
			
			String name = firstName + " " + lastName; //Concatenates the first and last name
			
			Student student = new Student(); //makes a student object for each input
			//sets all information for the student
			student.setId(id);
			student.setName(name);
			student.setGrade(grade);
			
			studentArray[i] = student; //puts each student into the array
			student.toString(); //prints out the current student
			i++; //increments the position in the array for next time
			
		}
		
		return true; //if all information is found correct it returns true
	}catch(FileNotFoundException e)
	{
		e.printStackTrace(); //if try fails it will print error
		return false; //if the file is not read correctly it will return false
	}
	
	
	
	
	
}

}