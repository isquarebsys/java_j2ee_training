package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import to.Person;

@Component
public class PersonDAOImplWithTemplate {

	HibernateTemplate template;  

	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	//method to save person  
	public void savePerson(Person e){  
	    template.save(e);  
	}  
	//method to update person  
	public void updatePerson(Person e){  
	    template.update(e);  
	}  
	//method to delete person  
	public void deletePerson(Person e){  
	    template.delete(e);  
	}  
	//method to return one person of given id  
	public Person getById(int id){  
		Person e=(Person)template.get(Person.class,id);  
	    return e;  
	}  
	//method to return all persons  
	public List<Person> getPersons(){  
	    List<Person> list=new ArrayList<Person>();  
	    list=template.loadAll(Person.class);  
	    return list;  
	}  
}
