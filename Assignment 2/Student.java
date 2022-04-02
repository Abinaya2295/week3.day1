package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name is Abinaya");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student department is IT");
	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student Id is IT001");
	}

	//Calling all class methods in main using multilevel inheritance
	public static void main(String[] args) {
		Student stud = new Student();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.deptName();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
	}

}
