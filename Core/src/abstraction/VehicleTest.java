package abstraction;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle vehicle=new Vehicle();
		Vehicle twoWheeler=new TwoWheeler();
		System.out.println("No of wheels: "+twoWheeler.noOfWheels());
	}
}
