package dao;

import java.util.List;

import org.springframework.stereotype.Component;

import to.Person;

public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}
