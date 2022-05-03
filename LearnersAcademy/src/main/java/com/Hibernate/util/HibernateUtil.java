package com.Hibernate.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.bean.Loginbean;
import com.classes.Classes;
import com.classes.Students;
import com.classes.Subjects;
import com.classes.Teachers;



public class HibernateUtil {
private static SessionFactory factory;
	
	public static SessionFactory getSessionFactory() {
		if(factory == null) {
			Configuration configuration = new Configuration();
			
			Properties properties = new Properties();
			
			properties.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/newdbtrg");
			properties.setProperty(Environment.USER, "root");
			properties.setProperty(Environment.PASS, "root");
			properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			
			properties.setProperty(Environment.SHOW_SQL, "true");
			properties.setProperty(Environment.HBM2DDL_AUTO, "update");
			
			configuration.setProperties(properties);
			configuration.addAnnotatedClass(Students.class);
			configuration.addAnnotatedClass(Teachers.class);
			configuration.addAnnotatedClass(Classes.class);
			configuration.addAnnotatedClass(Subjects.class);
			configuration.addAnnotatedClass(Loginbean.class);
			ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			factory = configuration.buildSessionFactory(registry);
			return factory;
		}
		
		return factory;
	}
}
