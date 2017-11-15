package special.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
	public enum Sex {
		MALE, FEMALE
	}

	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public int getAge() {
		return 30;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public static int compareByAge(Person a, Person b) {
		return a.birthday.compareTo(b.birthday);
	}
	
	  public void printPerson() {
	        // ...
	    }
	  
	  public static List<Person> createRoster() {
		  ArrayList<Person> list=new ArrayList();
		  Person person=new Person();
		  person.setName("Vijay");
		  list.add(person);
		  return list;
	  }
}