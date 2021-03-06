package hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import to.StudentAddress;
import to.StudentWithMultipleAddress;

public class StudentMultipleAddressInsertTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating configuration object
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
		
		//creating session factory object
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating session object
		Session session=factory.openSession();
		
		//creating transaction object
		Transaction t=session.beginTransaction();
		StudentAddress address=new StudentAddress();
		address.setCity("Chennai");
		session.persist(address);
		
		List<StudentAddress> addressList=new ArrayList<>();
		addressList.add(address);
			
		StudentWithMultipleAddress person = new StudentWithMultipleAddress("Vijay",addressList);
		person.setCountry("India");
		session.persist(person);//persisting the object

		t.commit();//transaction is commited
		session.close();
		System.out.println("successfully saved");		
	}
}
