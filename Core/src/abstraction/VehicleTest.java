package abstraction;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle vehicle=new Vehicle();
		Vehicle vehicle=new TwoWheeler();
		System.out.println("No of wheels: "+vehicle.noOfWheels());
		vehicle=new FourWheeler();
		System.out.println("No of wheels: "+vehicle.noOfWheels());
	}
}
