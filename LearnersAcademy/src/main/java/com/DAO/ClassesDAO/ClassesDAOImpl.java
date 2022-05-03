package com.DAO.ClassesDAO;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Hibernate.util.HibernateUtil;
import com.classes.Classes;
import com.classes.Students;
import com.classes.Subjects;
import com.classes.Teachers;

public class ClassesDAOImpl implements ClassDAO {

	private SessionFactory factory;

	public ClassesDAOImpl() {
		 factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public Set<Classes> DisplayClassDetails() {
		Set<Classes> classlist=null;
		Session session=factory.openSession();
		String hql="from Classes";
		TypedQuery<Classes> typedquery = session.createQuery(hql);
		classlist=new HashSet<Classes>( typedquery.getResultList());
		return classlist;
		
	}

	

	@Override
	public int AddClass(Classes class1) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		int session_id=(int) session.save(class1);
		transaction.commit();
		session.close();
		return session_id;
	}

	@Override
	public void DeleteClass(int classid) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Classes classes = session.get(Classes.class,classid);
		session.delete(classes);
		transaction.commit();
		session.close();
		
	}
		@Override
		public void AssignTeacher(int teacherid, int classid) {
		Session session = factory.openSession();
		org.hibernate.Transaction txn = session.beginTransaction();
		Classes class1 = session.get(Classes.class, classid);
		Teachers teacher = session.get(Teachers.class, teacherid);
		class1.setTeacher(teacher);
		txn.commit();
		session.close();
	}

		@Override
		public void AssignSubject(int subjectid, int classid) {
			Session session = factory.openSession();
			org.hibernate.Transaction txn = session.beginTransaction();
			Classes class1 = session.get(Classes.class, classid);
			Subjects subject = session.get(Subjects.class, subjectid);
			class1.setSubject(subject);
			txn.commit();
			session.close();
		}

}
