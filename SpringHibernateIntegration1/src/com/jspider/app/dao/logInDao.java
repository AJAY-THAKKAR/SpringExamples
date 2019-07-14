package com.jspider.app.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.app.dto.LogInDto;
import com.jspider.app.dto.SignUpDto;

@Repository
public class logInDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public Long saveSignUpData(SignUpDto signup){
	
		Session session = sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		Serializable serializable = session.save(signup);
		tx.commit();
		session.close();
		System.out.println("@LogInDao      "+ signup + "        "+ (Long) serializable);
		return (Long) serializable;
	}

	public boolean checkLogin(LogInDto logIn) {
		
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("select userName,password from SignUpDto where userName =:userName and password =:password");
		query.setParameter("userName",logIn.getUserName());
		query.setParameter("password",logIn.getPassword());
		List<SignUpDto> list=(List<SignUpDto>) query.list();
		System.out.println(list);
		return list.size()>0;
	}
	
	/*public boolean checkLogIn(LogInDto logIn){
		
	}*/
	
	
}
