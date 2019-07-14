package com.jspider.app.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.app.dto.StudentDto;

@Repository
public class StudentDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public int saveStudent(StudentDto dto){
		
		System.out.println("save method called....");
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		 Serializable id = session.save(dto);
		
		transaction.commit();
		 
		 System.out.println((Integer) id);
		
		
		return (Integer) id;
	}
}
