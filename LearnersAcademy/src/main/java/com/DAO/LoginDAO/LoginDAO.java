package com.DAO.LoginDAO;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Hibernate.util.HibernateUtil;
import com.bean.Loginbean;

public class LoginDAO {
	
	public static boolean validate(Loginbean bean){  
		boolean status=false;
		  SessionFactory factory;
		  factory=HibernateUtil.getSessionFactory();
		  Session session = factory.openSession();
		  System.out.println(bean.getPassword()+bean.getUsername());
		  String hql = "FROM Loginbean WHERE username = :username and password=:password";
		  TypedQuery<Loginbean> query = session.createQuery(hql);
		  query.setParameter("username", bean.getUsername());
		  query.setParameter("password",bean.getPassword());
		  int result=query.getMaxResults();
		  if(result>0)
		  {
			  status=true;
		  }
		  
		return status;  
		  
	}
	
	
	public static boolean Adduser(Loginbean loginbean) {
		  
		boolean status=false;
		  SessionFactory factory;
		  factory=HibernateUtil.getSessionFactory();
		  Session session =factory.openSession();
		  Transaction transaction=session.beginTransaction();
		  System.out.println(loginbean.getUsername()+loginbean.getPassword());
		  int result=(int) session.save(loginbean);
		  if(result>0)
		  {
			  status=true;
		  }
		  transaction.commit();
		  session.close();
		return status;  
		
		
	}
}
