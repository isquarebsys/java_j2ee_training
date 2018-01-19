package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import to.Person;

public class PersonTest {

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
			
		Person person = new Person();
		person.setName("Ayyappan"); 
		person.setCountry("Chennai");
		
		session.persist(person);//persisting the object
		
		t.commit();//transaction is commited
		session.close();
		System.out.println("successfully saved");		

	}

}
