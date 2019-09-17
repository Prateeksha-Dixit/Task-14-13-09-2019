package com.wp;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddEmployee {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure("myconfig.xml");
		Session session=config.buildSessionFactory().openSession();
		
		Employee emp1=new Employee(100,"Prateeksha",80000);
	//	Employee emp2=new Employee(101,"Prats",60000);
	//	Employee emp3=new Employee(102,"Pd",70000);
		Transaction tr=session.beginTransaction();
		
		session.save(emp1);
	//	session.save(emp2);
	//	session.save(emp3);
		
		tr.commit();
		session.close();
		
		System.out.println("Employee data entered successfully");
		
		
		

	}

}
