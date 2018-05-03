package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> studentList=new ArrayList();
		studentList.add("Surya");
		studentList.add("Sanjana");
		Iterator<String> studentIterator=studentList.iterator();
		int counter=1;
		while(studentIterator.hasNext()){
			String studentName=(String)studentIterator.next();
			System.out.println("Student Name: "+counter+": "+studentName);
			counter++;
		}
		List<Student> studentObjectList=new ArrayList<>();
		Student student1=new Student();
		student1.setFirstName("Murugan K");
		student1.setLocation("Poonamallee");
		studentObjectList.add(student1);
		
		Student student2=new Student();
		student1.setFirstName("Murugan T");
		student1.setLocation("Porur");
		studentObjectList.add(student2);
		
		Iterator studentObjectIterator=studentObjectList.iterator();
		while(studentObjectIterator.hasNext()) {
			Student student=(Student)studentObjectIterator.next();
			if(student.getFirstName().contains("Murugan")) {
				System.out.println("Student Name: "+student.getFirstName());
				System.out.println("Students Location: "+student.getLocation());
			}
		}
		
		
	}

}
