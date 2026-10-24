package hibernate;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.Scanner;
public class hibernatemain {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate-cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
			Scanner s=new Scanner(System.in);
		String bankname=s.nextLine();
		s.nextLine();
		System.out.println("enter bankname: ");
		int accno=s.nextInt();
		s.nextInt();
		System.out.println("enter accno: ");
		String accname=s.nextLine();
		System.out.println("enter accname: ");
		
		Bank b=new Bank("SBI",1234,"revanth");
		session.persist(b);
		tx.commit();
			System.out.println("value inserted successfully");

		
	
		
	}

	
}
