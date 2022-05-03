package com.DAO.teacherDAO;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Hibernate.util.HibernateUtil;
import com.classes.Students;
import com.classes.Teachers;

public class TeacherDAOImpl implements TeacherDAO{
	private SessionFactory factory;
	
	
	
	public TeacherDAOImpl() {
		factory = HibernateUtil.getSessionFactory();
	}

	@Override
	public int AddTeacher(Teachers teacher) {
		Session session=factory.openSession();
		Transaction txn =session.beginTransaction();
		Integer Teacher_ID= (Integer) session.save(teacher);
		txn.commit();
		session.close();
		return Teacher_ID;
	}

	@Override
	public void DeleteTeacher(int Teacher_ID) {
		Session session=factory.openSession();
		Transaction txn =session.beginTransaction();
		Teachers teacher= session.get(Teachers.class, Teacher_ID);
		session.delete(teacher);
		txn.commit();
		session.close();
		
	}

	@Override
	public int assignClass() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<Teachers> ListofTeachers() {
		Set<Teachers> allteachers = null;
		// select * from Teachers_table;
		String hql = "from Teachers";
		Session session = factory.openSession();
		TypedQuery<Teachers> typedQuery = session.createQuery(hql);
		allteachers =  new HashSet<Teachers>(typedQuery.getResultList());		
		session.close();
		return allteachers;
	
	}

}
