package com.wp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

public class QBCOrdering {

	public static void main(String[] args) {
		
	Criteria cr=Util.getSF().openSession().createCriteria(Employee.class);
		
		Order order1=Order.desc("sal");
		Order order2=Order.asc("ename");
		cr.addOrder(order1);
		cr.addOrder(order2);
		List<Employee> emps=cr.list();
		for(Employee emp:emps){
			System.out.println(emp.getEno());
			System.out.println(emp.getEname());
			System.out.println(emp.getSal());
		
		}

	}

}
