package domains.education;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollegeClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeClass class1=new CollegeClass();
		
		
		Student student1=new Student();
		student1.setFirstName("Dinesh");
		
		
		Student student2=new Student();
		student2.setFirstName("Aakash");
		
		List studentList=new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		
		class1.setStudentList(studentList);
		class1.setNoOfStudents(studentList.size());
		
		System.out.println("Class Size: "+class1.getNoOfStudents());
		
		Iterator studentIterator=studentList.iterator();
		System.out.println("Line after Iterator");
		while(studentIterator.hasNext()) {
			Student student=(Student)studentIterator.next();
			System.out.println("Students first name: "+student.getFirstName());
		}
		
	}

}
