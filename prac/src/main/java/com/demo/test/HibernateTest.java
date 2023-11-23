package com.demo.test;

import java.io.FileInputStream;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.classes.Student;

public class HibernateTest {

	
		public static void main(String[] args) throws Exception {
			
			
			Properties properties = new Properties();
			properties.load(new FileInputStream("src//main//java//hibernate.properties"));
			
			
			SessionFactory factory=new Configuration().setProperties(properties).configure("hibernate.cfg.xml").buildSessionFactory();
			Session openSession = factory.openSession();
			
			
			Student student = (Student)openSession.get(Student.class, 12);
			System.out.println(student);
			
			
			
			
		/*
		 * Transaction transaction = openSession.beginTransaction();
		 * 
		 * openSession.createSQLQuery("insert into address values(2,'vasai',40070,'ll')"
		 * ).executeUpdate();
		 * 
		 * transaction.commit();
		 * 
		 * openSession.close();
		 */
			
			
			
		}
	
}	
