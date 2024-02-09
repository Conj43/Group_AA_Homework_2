package edu.mu;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class StudentManager {
	
	public Student[] studentArray = new Student[5]; //creates an array of type Student

	public StudentManager() {
		
	}
	
	
	//searchStudentById receives an int that is a valid id number and then uses that int to locate if
	//that student exists in the class, if found it will return true, it also prints out the students info
	
	public boolean searchStudentById(int id) {
		int currentId;
		boolean value = false; //defaults to returning false
		
		for(Student student : studentArray) { //goes through each student in the array
			currentId = student.getId(); //sets currentId to whichever student is currently being looked at
			if(currentId == id) { //if the id is found it enters
				value = true; //sets the boolean return to true
				String info = student.toString(); //prints out the students info
				System.out.println(info);
			}
		}
		if(!value) { //handles if the student is not found
			System.out.println("Error, Student cannot be found!");
		}
		return value; //returns true or false
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
	

		//search method used by updateStudentGradeByID
		//made this function because it returns type Student, which makes more sense than returning type boolean 

		 public Student search(int id) {
			 // using a loop to iterate through the students to find the right one
			 for (Student student : studentArray) {
				 if (student.getId() == id) {
					 return student; // find the right student using their id
					 }
				 }
			 

		        return null; // Student not found
		       } 

		    
	
	// using the id we just got to identify the student we are going to update their grade 
	public boolean updateStudentGradeById(int id, double grade) {
		boolean test = searchStudentById(id); //use searchbystudentId function to make sure it exists
		if(test) {
        Student student = search(id); //call the search function that returns a Student
        if (student != null) {
            student.setGrade(grade);
            return true; // Student found and updated
        }
        return false; // Student ID not found
		}
		else return false;
    }


			}

//Display for Students:
//method to display the details of all students in the current StudentManager class
public void displayStudents() {
	if (studentArray.length == 0) {
		System.out.println("No Students found."); //checks if the array is empty or not. Outputs this error message if so 
	} else 
	{
		for (Student student : studentArray) { //loop through each element in the array and use toString method to print their info
			if (student != null) {
				System.out.println(student.toString());			
				
			
				}
			}
		}
	}

}