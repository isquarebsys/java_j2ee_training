package oops;

public class PolymorphismMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DealerInterface basicInterface=new BasicCar();
		System.out.println("Car Names: "+basicInterface.getBrandName());
		basicInterface=new HighEndCar();
		System.out.println("Car Names: "+basicInterface.getBrandName());
	}
}
