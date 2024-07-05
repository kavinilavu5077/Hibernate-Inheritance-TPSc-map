package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TPSc{

	public static void main(String[] args) {
		Transaction tr=null;
		try (Session ses = HBUtil.getSessionFactory().openSession()){
			
			
			tr = ses.beginTransaction();
			Employee e1= new Employee("Ramesh");
			Reg_Employee1 e2 = new Reg_Employee1(5500,"sales","Suresh");
			Trainee2 e3 = new Trainee2(200,"6","Umesh");
			ses.persist(e1);
			ses.persist(e2);
			ses.persist(e3);
			tr.commit();
			ses.close();

			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
