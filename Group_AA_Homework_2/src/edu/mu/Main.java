package edu.mu;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		StudentManager manager = new StudentManager();
		
		
		
		try {
			boolean fileStatus = manager.readFromFile("studentData.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
