package com;

import javax.transaction.Transaction;

import org.hibernate.Session;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tr=null;
		try(Session ses=HibernateUtil.getSessionFactory().openSession()){
			tr=ses.beginTransaction();
			Emp e=new Emp();
			e.setName("Ramesh");
			e.setEmail("ram@gmail.com");
			Address a=new Address("VSB college","Covai Road","Karur","TamilNadu",626123);
			e.setAddr(a);
			a.setEmp(e);
			ses.persist(e);
			
			
			tr.commit();
			ses.close();
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
