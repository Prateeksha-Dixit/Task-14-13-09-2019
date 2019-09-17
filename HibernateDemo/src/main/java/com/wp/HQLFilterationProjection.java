package com.wp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLFilterationProjection {

	public static void main(String[] args) {
		
		Session session=Util.getSF().openSession();
		Query query=session.createQuery("select ename,sal from Employee where eno>102");
		
		List<Object[]> emps = query.list();
		for (Object emp[] : emps) {
			for(Object obj:emp)
			{
				System.out.println(obj);
			}
			System.out.println("_____________________________________");

		}
		
		/*List<Double> sal=query.list();
		for(Double s:sal)
			System.out.println(s);*/
	}

}
