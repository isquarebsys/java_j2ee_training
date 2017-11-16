package special.lambda;

import java.time.LocalDate;
import java.time.Month;
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
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

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
	
	public static int compareByName(Person a, Person b) {
		return b.name.compareTo(a.name);
	}	
	
	  public void printPerson() {
		  System.out.println("Person: "+this.name);
	  }
	  
	  public static List<Person> createRoster() {
		  ArrayList<Person> list=new ArrayList();
		  Person person1=new Person();
		  person1.setName("Vijay");
		  LocalDate person1Date=LocalDate.now();
		  person1.setBirthday(person1Date);
		  list.add(person1);
		  Person person2=new Person();
		  LocalDate person2Date=LocalDate.of(2014, Month.DECEMBER, 17);
		  person2.setName("Ajay");
		  person2.setBirthday(person2Date);
		  list.add(person2);
		  return list;
	  }
}