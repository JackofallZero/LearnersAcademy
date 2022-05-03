package com.DAO.teacherDAO;

import java.util.Set;

import com.classes.Teachers;

public interface TeacherDAO {
	
	
	
	public int assignClass();
	public Set<Teachers> ListofTeachers();
	public int AddTeacher(Teachers teacher);
	void DeleteTeacher(int teacher_ID);
}
