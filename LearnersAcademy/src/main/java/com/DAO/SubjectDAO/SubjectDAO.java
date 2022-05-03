package com.DAO.SubjectDAO;

import java.util.Set;

import com.classes.*;

public interface SubjectDAO {

	
	public int AddSubject(Subjects subject);
	public void DeleteSubject(int  subject_ID);
	public Set<Subjects> DisplaySubjectDetails();
}