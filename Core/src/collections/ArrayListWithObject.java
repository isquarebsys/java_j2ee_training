package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import to.Student;

public class ArrayListWithObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List studentList=new ArrayList();
		
		Student student=new Student();
		student.setName("Surya");
		student.setCourseName("Java");

		studentList.add(student);
		
		Iterator studentIterator=studentList.iterator();
		while(studentIterator.hasNext()){
			Student studentInList=(Student)studentIterator.next();
			System.out.println("Student Name: "+studentInList.getName());
			System.out.println("Student Name: "+studentInList.getCourseName());
		}
	}
}
