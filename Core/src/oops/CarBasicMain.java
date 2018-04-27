package oops;

public class CarBasicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DealerInterface carInterface=new BasicCar();
		System.out.println("Car Names: "+carInterface.getBrandName());
	}

}
