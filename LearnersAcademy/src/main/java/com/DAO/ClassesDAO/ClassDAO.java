package com.DAO.ClassesDAO;

import java.util.Set;

import com.classes.Classes;

public interface ClassDAO {
	public int AddClass(Classes class1);
	public  Set<Classes> DisplayClassDetails();
	public void DeleteClass(int classid);
	public void AssignTeacher(int teacherid, int classid);
	public void AssignSubject(int subjectid, int classid);
}
