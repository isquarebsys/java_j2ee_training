package objects;

import examples.Calculator;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		Calculator calc1=new Calculator();
		System.out.println(calc1.equals(calc));
		System.out.println("Result: "+calc.add(1, 2));
		String s1="Akash";
		String s2=s1;
		System.out.println(s2.equals(s1));
		Object obj1=new Object();
		Object obj2=new Object();
		System.out.println(obj1.equals(obj2));
	}
}
