package hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import to.StudentAddress;

public class StreetQueryTest {
	public static void main(String[] args) {
		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the configuration file

		// creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();
		// creating session object
		Session session = factory.openSession();
		String hql = "from StudentAddress";
		Query query = session.createQuery(hql);
		List<StudentAddress> objectList = query.list();
		 
		for (StudentAddress object : objectList) {
		    System.out.println("Street Address: "+ object.getStreetAddress());
		    System.out.println("City: "+ object.getCity());
		}
		session.close();
	}
}
