package com.client;

import com.DAO.StudentDAO.StudentDAOImpl;
import com.DAO.SubjectDAO.SubjectDAO;
import com.DAO.SubjectDAO.SubjectDAOImpl;
import com.DAO.teacherDAO.TeacherDAO;
import com.DAO.teacherDAO.TeacherDAOImpl;
import com.classes.Classes;
import com.classes.Students;
import com.classes.Subjects;
import com.classes.Teachers;

import java.util.ArrayList;
import java.util.List;

import com.DAO.ClassesDAO.ClassDAO;
import com.DAO.ClassesDAO.ClassesDAOImpl;
import com.DAO.StudentDAO.*;

public class Client {

	public static void main(String[] args) {
		
		
		StudentDao studentdao = new StudentDAOImpl();
		Students student1 = new Students("Ram");
		Students student2 = new Students("Sham");
		Students student3 = new Students("Seeta");
		Students student4 = new Students("Geeta");
		
		
		System.out.println(studentdao.getAllStudents());
		
		TeacherDAO teacherdao = new TeacherDAOImpl();
		Teachers teacher1 = new Teachers("Ram");
		Teachers teacher2 = new Teachers("Sham");
		
		Integer teacherid1 = teacherdao.AddTeacher(teacher1);
		Integer teacherid2 = teacherdao.AddTeacher(teacher2);
		System.out.println("rollNo1 : " + teacherid1);
		System.out.println("rollNo2 : " + teacherid2);
		System.out.println(teacherdao.ListofTeachers());
		
		Subjects subject1=new Subjects("Eng");
		Subjects subject2=new Subjects("Hindi");
		
		SubjectDAO subjectdao=new SubjectDAOImpl();
		int subjectid1 = subjectdao.AddSubject(subject1);
		int subjectid2 = subjectdao.AddSubject(subject2);
		System.out.println("rollNo1 : " + subjectid2);
		System.out.println("rollNo2 : " + subjectid1);
		
		
		List<Students> employees = new ArrayList<>();
		employees.add(new Students("Radha"));
		employees.add(new Students("Neeta"));
		Classes class1 = new Classes("Class1");
		class1.setSubject(subject2);
		class1.setStudent_list(employees);
		class1.setTeacher(teacher2);
		ClassDAO classdao= new ClassesDAOImpl();
		classdao.AddClass(class1);
		System.out.println(class1.getClass_name()+class1.getClass_ID()+class1.getStudent_list());
		
		
	}

}
