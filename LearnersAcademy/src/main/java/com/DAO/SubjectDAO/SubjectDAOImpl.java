package com.DAO.SubjectDAO;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Hibernate.util.HibernateUtil;
import com.classes.Students;
import com.classes.Subjects;

public class SubjectDAOImpl implements SubjectDAO{
	private static SessionFactory factory; 
	
	
	
	public SubjectDAOImpl() {
		factory= HibernateUtil.getSessionFactory();
		}

	@Override
	public int AddSubject(Subjects subject) {
		Session session=factory.openSession();
		Transaction txn = session.beginTransaction();
		int subjectid=(int) session.save(subject);
		txn.commit();
		session.close();
		return subjectid;
	}

	@Override
	public Set<Subjects> DisplaySubjectDetails() {
		Set<Subjects> sublist=null;
		Session session=factory.openSession();
		String hql="from Subjects";
		TypedQuery<Subjects> typedquery = session.createQuery(hql);
		sublist=new HashSet<Subjects>(typedquery.getResultList());
		session.close();
		return sublist;
	}

	@Override
	public void DeleteSubject(int Subject_ID) {
		Session session=factory.openSession();
		Transaction txn = session.beginTransaction();
		Subjects subject = session.get(Subjects.class,Subject_ID);
		session.delete(subject);
		txn.commit();
		session.close();
	}

}
