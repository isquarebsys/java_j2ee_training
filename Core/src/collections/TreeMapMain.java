package collections;

import java.util.Iterator;
import java.util.TreeMap;

import inheritance.Car;

public class TreeMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap carMap=new TreeMap();
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
	}
}
