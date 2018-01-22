package hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import to.StudentAddress;
import to.StudentWithMultipleAddress;
import to.UserWithSingleAddress;

public class StudentMultipleAddressQueryTest {
	public static void main(String[] args) {
		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the configuration file

		// creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();
		// creating session object
		Session session = factory.openSession();
		String hql = "from StudentWithMultipleAddress";
		Query query = session.createQuery(hql);
		List<StudentWithMultipleAddress> objectList = query.list();
		 
		for (StudentWithMultipleAddress object : objectList) {
		    System.out.println("Name: "+ object.getName());
		    System.out.println("Country: "+ object.getCountry());
		}
		session.close();
	}
}
