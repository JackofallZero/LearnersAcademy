package com.DAO.StudentDAO;

import java.util.Set;

import com.classes.Students;


public interface StudentDao {
	
	
	
	public void addStudentClass();
	public Set<Students> getAllStudents();
	public Integer addStudent(Students student,int class_ID);
	public void DeleteStudent(Integer rollno);
}
