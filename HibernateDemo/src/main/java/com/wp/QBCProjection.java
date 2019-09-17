package com.wp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCProjection {

	public static void main(String[] args) {
		Criteria cr = Util.getSF().openSession().createCriteria(Employee.class);
		
		ProjectionList plist=Projections.projectionList();
		Projection pr1=Projections.property("ename");
		Projection pr2=Projections.property("sal");
		
		plist.add(pr1);
		plist.add(pr2);
		cr.setProjection(plist);
		
		List<Object[]> emps = cr.list();
		for (Object emp[] : emps) {
			for(Object obj:emp)
			{
				System.out.println(obj);
			}
			System.out.println("_____________________________________");

		}

	}

}
