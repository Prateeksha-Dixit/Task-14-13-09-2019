package com.wp;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateEmployee {

	public static void main(String[] args) {
		Session session=Util.getSF().openSession();
		Employee emp=new Employee();
		emp.setEno(101);
		emp.setEname("Prateeksha");
		
		Transaction tr=session.beginTransaction();
		session.update(emp);
		
		tr.commit();
		session.close();
		System.out.println("Employee update successfully");

	}

}
