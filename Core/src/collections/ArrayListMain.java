package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List studentList=new ArrayList();
		studentList.add("Surya");
		studentList.add("Sanjana");
		Iterator studentIterator=studentList.iterator();
		while(studentIterator.hasNext()){
			String studentName=(String)studentIterator.next();
			System.out.println("Student Name: "+studentName);
		}

	}

}
