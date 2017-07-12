package oops;

public class PolymorphismMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarBasicInterface basicInterface=new BasicCar();
		System.out.println("Car Names: "+basicInterface.getCarNames());
		basicInterface=new HighEndCar();
		System.out.println("Car Names: "+basicInterface.getCarNames());
	}
}
