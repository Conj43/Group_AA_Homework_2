package edu.mu;

public class Student {
	
	
	private int id;
	private String name;
	private Double grade;
	
	public Student() {
		
	}
	
	public Student(int id, String name, Double grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
		


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getGrade() {
		return grade;
	}


	public void setGrade(Double grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
