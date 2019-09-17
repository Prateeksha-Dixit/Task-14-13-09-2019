package com.wp;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLForDMLParametrized {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount : ");
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		double amt=sc.nextDouble();
		Query query=session.createQuery("update Employee set sal=sal+:amount");
		query.setParameter("amount", amt);
		int n=query.executeUpdate();
		System.out.println(n+"rows updated");
		session.close();
	}

}
