package hibernate.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import to.StudentAddress;

public class AddressNamedQueryTest {
	public static void main(String[] args) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sFactory = configuration.buildSessionFactory();
		Session session = sFactory.openSession();
		// Hibernate Named Query
		Query query = session.getNamedQuery("findAddressByCity");
		query.setString("city", "Chennai");
		List<StudentAddress> employees = query.list();

		Iterator<StudentAddress> itr = employees.iterator();
		while (itr.hasNext()) {
			StudentAddress e = itr.next();
			System.out.println(e);
		}
		session.close();
	}
}
