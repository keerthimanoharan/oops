package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
public void studentName() {
	System.out.println("student name is: Keerthi");
}
public void studentDept() {
	System.out.println("student dept is: EEE");
}
public void studentId() {
	System.out.println("student id is: 1039015159321");
}
public static void main(String[] args) {
	Student details=new Student();
	College info=new College();
	info.collegeName();
	info.collegeCode();
	info.collegeRank();
	details.deptName();
	details.studentName();
	details.studentDept();
	details.studentId();
}}
