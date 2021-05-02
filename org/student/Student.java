package org.student;

import org.college.College;
//import org.department.Department;

public class Student extends College {
	public void studentName() {
		System.out.println("Jananee");
	}
	
	public void studentDept() {
		System.out.println("IT");
	}
	
	public void studentID() {
		System.out.println("1001");
	}
	

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.studentDept();
		stu.studentID();
		stu.studentName();
		

	}

}
