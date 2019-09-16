package com.wp;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteEmployee {

	public static void main(String[] args) {
		
		Session session=Util.getSF().openSession();
		Employee emp=new Employee();
		emp.setEno(100);
		
		Transaction tr=session.beginTransaction();
		session.delete(emp);
		
		tr.commit();
		session.close();
		System.out.println("Employee deleted successfully");

	}

}
