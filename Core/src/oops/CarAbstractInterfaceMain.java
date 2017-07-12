package oops;

public class CarAbstractInterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarBasicInterface interface1=new CarBasicInterface() {
			
			@Override
			public String getCarNames() {
				// TODO Auto-generated method stub
				return "Inside CarAbstractInterfaceMain";
			}
		};
		System.out.println(interface1.getCarNames());
	} 

}
