package examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Calculator> stringList=new ArrayList<Calculator>();
		Iterator<Calculator> stringListIterator=stringList.iterator();
		while(stringListIterator.hasNext()) {
			Calculator calculator=(Calculator)stringListIterator.next();
		}

	}

}
