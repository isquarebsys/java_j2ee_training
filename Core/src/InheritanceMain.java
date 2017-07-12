import inheritance.AltoVXi;
import inheritance.Car;
import inheritance.WagonR;

public class InheritanceMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
//		Car i20=new Car();
//		i20.setBrakeType("ABS");
//		System.out.println(i20.getBrakeType());
//		Car wagonR=new Car();
//		wagonR.setBrakeType("ECB");
//		System.out.println(wagonR.getBrakeType());
		Car wagonR=new WagonR();
		System.out.println(wagonR.getBrakeType());
		Car altoLxi=new AltoVXi();
		System.out.println("Before Overriding: "+ altoLxi.getBrakeType());
		altoLxi.setBrakeType("ABS");
		System.out.println("After Overriding: "+altoLxi.getBrakeType());
	}

}
