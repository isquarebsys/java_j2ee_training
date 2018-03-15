package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PersonDAO;
import to.Person;

@Service
public class PersonService {
	@Autowired
	private PersonDAO autoWiredPersonDao;
	
	public void save(Person p) {
		autoWiredPersonDao.save(p);
	}
}
