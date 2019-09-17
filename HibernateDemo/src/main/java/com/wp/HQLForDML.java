package com.wp;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLForDML {

	public static void main(String[] args) {
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		Query query=session.createQuery("update Employee set sal=sal+1000");
		int n=query.executeUpdate();
		System.out.println(n+"rows updated");
		session.close();

	}

}
