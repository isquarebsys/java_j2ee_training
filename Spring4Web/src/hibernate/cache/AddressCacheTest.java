package hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import to.StudentAddress;

public class AddressCacheTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session1 = factory.openSession();
		// Load the StudentAddress with id as 1
		StudentAddress address = (StudentAddress) session1.load(StudentAddress.class, 1);
		System.out.println(address.getId() + " " + address.getCity());
		session1.close();
	}
}
