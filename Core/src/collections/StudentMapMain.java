package collections;

import java.util.HashMap;

public class StudentMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap studentMap=new HashMap<>(); 
		studentMap.put("Murugan", "Poonamallee");
		
		System.out.println("Location of Murugan: "+studentMap.get("Murugan"));
	}

}
