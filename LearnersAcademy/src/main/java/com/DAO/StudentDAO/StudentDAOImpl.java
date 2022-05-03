package com.DAO.StudentDAO;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Hibernate.util.HibernateUtil;
import com.classes.Classes;
import com.classes.Students;



public class StudentDAOImpl implements StudentDao{
	
	private SessionFactory factory;

	public StudentDAOImpl() {
		factory = HibernateUtil.getSessionFactory();
	}

	@Override
	public Integer addStudent(Students student, int Classes_ID) {
		Session session = factory.openSession();
		org.hibernate.Transaction txn = session.beginTransaction();
		Classes cls = session.get(Classes.class, Classes_ID);
		Integer rollNo = (Integer) session.save(student);
		cls.getStudent_list().add(student);
		txn.commit();
		session.close();
		return rollNo;	
	}

	@Override
	public void addStudentClass() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteStudent(Integer rollNo) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Students student = session.get(Students.class,rollNo);
		session.delete(student);
		
		txn.commit();
		session.close();
		
	}

	@Override
	public Set<Students> getAllStudents() {
		Set<Students> allStudents = null;
		// select * from studentdata;
		String hql = "from Students";
		
		Session session = factory.openSession();
		TypedQuery<Students> typedQuery = session.createQuery(hql);
		allStudents =  new HashSet<Students>(typedQuery.getResultList());
		
		session.close();
		return allStudents;
		
	}

}
