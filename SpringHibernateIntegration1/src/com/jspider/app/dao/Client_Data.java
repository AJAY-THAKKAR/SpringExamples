package com.jspider.app.dao;

import java.io.File;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspider.app.dto.SignUpDto;

public class Client_Data {
		
	public static void main(String[] args) {
				
		Configuration cfg=new Configuration().configure(new File("G:/Java/Spring_Practice/SpringHibernateIntegration1/WebContent/WEB-INF/hibernate.cfg.xml"));
		SessionFactory sess=cfg.buildSessionFactory();	
		String capitalLetter=new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String smallLetter=new String("abcdefghijklmnopqrstuvwxyz");
		String digit=new String("0123456789");
		String splChar=new String("@!#$&^_");
		String str=capitalLetter+smallLetter+digit+splChar;
		String username="";
		String password="";
		Random rand=new Random();
		int r=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<12;j++){
				r= rand.nextInt(str.length());
				username+=str.charAt(r);
			}
			System.out.println(username);
			for(int j=0;j<8;j++){
				r= rand.nextInt(str.length());
				password+=str.charAt(r);
			}
			
			Session session = sess.openSession();
			Transaction transaction = session.beginTransaction();
			SignUpDto dto=new SignUpDto();
			dto.setName(capitalLetter.charAt(22)+"");
			dto.setUserName(username);
			dto.setPassword(password);
			session.save(dto);
			transaction.commit();
			session.close();
			username="";
			password="";
		}
	}

}
