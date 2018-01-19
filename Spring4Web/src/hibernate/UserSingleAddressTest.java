package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import to.UserAddress;
import to.UserWithSingleAddress;

public class UserSingleAddressTest {
	public static void main(String[] args) {
		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the configuration file

		// creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();
		// creating session object
		Session session = factory.openSession();
		// creating transaction object
		Transaction t = session.beginTransaction();
		UserAddress address = new UserAddress();
		address.setCity("Chennai");
		address.setStreetAddress("Madha Town Extension");
		session.persist(address);

		UserWithSingleAddress person = new UserWithSingleAddress("Vijay", address);
		session.persist(person);// persisting the object

		t.commit();// transaction is commited
		session.close();
		System.out.println("successfully saved");
	}
}
