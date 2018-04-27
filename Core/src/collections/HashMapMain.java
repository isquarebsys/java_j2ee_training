package collections;

import java.util.HashMap;
import java.util.Iterator;

import inheritance.Car;
import to.Student;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap carMap = new HashMap();
		Car wagonR=new Car();
		wagonR.setBrakeType("ECB");
		
		Car altoVxi=new Car();
		wagonR.setBrakeType("ABS");
		carMap.put("AltoVxi", altoVxi);
		carMap.put("WagonR", wagonR);
		
		Car mapInstance=(Car) carMap.get("WagonR");
		
		
		System.out.println(mapInstance.getBrakeType());
		Iterator carsIterator=carMap.keySet().iterator();
		while(carsIterator.hasNext()){
			String key=(String) carsIterator.next();
			System.out.println("Key: "+key);
			Car value=(Car)carMap.get(key);
			System.out.println("Value: "+value.getBrakeType());
		}
		
	    //studentMap.put("name", "lenova");
		//System.out.println("Name: " + studentMap.get("name"));
		//studentMap.put("brakeT", "16");
		//System.out.println("age:" + studentMap.get("age"));
		
		//Student student=new Student();
		//student.setName("Pooja");
		//student.setCourseName("Java");
		
		//studentMap.put("Pooja", student);
		
		//Object valueInHashMap=studentMap.get("Pooja"); 
		//System.out.println("Student Name: "+studentMap.get("Pooja"));
		
		//try{
			
		
		//if(valueInHashMap instanceof String){
			//System.out.println("Object is NOT a STRING");
		//}else if(valueInHashMap instanceof Student){
			//int studentInHasMap=(int)valueInHashMap;
			//System.out.println("Student Name: "+studentInHasMap);
		//}
		//}catch(Exception e){
			//System.out.println("Exception: "+e.toString());
			//if(valueInHashMap instanceof Student){
				//Student studentInHasMap=(Student)valueInHashMap;
				//System.out.println("Student Name: "+studentInHasMap.getName());
			//}			
		//}
		
//		Iterator<String> studentMapIterator = studentMap.keySet().iterator();
//		while (studentMapIterator.hasNext()) {
//			String key = studentMapIterator.next();
//			System.out.println("Key: " + key+", Value: "+studentMap.get(key));
//			
//		}
//		Car wagonR=new Car();
//		wagonR.setBrakeType("ECB");
//		studentMap.put("WagonR", wagonR);
//		Car hashMapInstance=(Car) studentMap.get("WagonR");
//		System.out.println("Brake Type: "+hashMapInstance.getBrakeType());
		
		
	}

}
