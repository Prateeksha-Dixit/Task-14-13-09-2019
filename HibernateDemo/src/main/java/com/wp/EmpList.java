package com.wp;

import java.util.List;

import org.hibernate.Criteria;


public class EmpList {

	public static void main(String[] args) {
		Criteria cr=Util.getSF().openSession().createCriteria(Employee.class);
		List<Employee> emps=cr.list();
		for(Employee emp:emps){
			System.out.println(emp.getEno());
			System.out.println(emp.getEname());
			System.out.println(emp.getSal());
			System.out.println("___________________________________");
		}
		

}

	}


