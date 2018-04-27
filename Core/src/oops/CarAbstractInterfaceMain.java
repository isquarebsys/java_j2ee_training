package oops;

public class CarAbstractInterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DealerInterface interface1=new DealerInterface() {
			
			@Override
			public String getBrandName() {
				// TODO Auto-generated method stub
				return "Inside CarAbstractInterfaceMain";
			}
		};
		System.out.println(interface1.getBrandName());
	} 

}
