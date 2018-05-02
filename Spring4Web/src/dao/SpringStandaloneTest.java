package dao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonDAO;
import to.Person;

public class SpringStandaloneTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4_standalone.xml");
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		Person person = new Person();
		person.setName("Vijay"); person.setCountry("India");
		personDAO.save(person);
		
		System.out.println("Person::"+person);
		List<Person> list = personDAO.list();
		for(Person p : list){
			System.out.println("Person List::"+p);
		}
		context.close();		
	}
}