package com.wp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class QBCFilteration {

	public static void main(String[] args) {
		Criteria cr=Util.getSF().openSession().createCriteria(Employee.class);
		
		Criterion crt=Restrictions.gt("sal",75000.0);
		cr.add(crt);
		List<Employee> emps=cr.list();
		for(Employee emp:emps){
			System.out.println(emp);
			
			
		}
		

}

	}


