package oops;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
//		Car car=new Car("WagonR","EBS","Blue");
//		System.out.println("Colour of the car: "+car.getColour());
//		
//		DealerInterface carInterface=new MarutiDealer();
//		System.out.println(carInterface.getBrandName());
//		
//		carInterface=new ToyotaDealer();
//		System.out.println(carInterface.getBrandName());
		
		CarAbstract parentClass=new AbstractCar();
		System.out.println(parentClass.getBrakeType());
	}

}
