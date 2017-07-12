package inheritance;

public class TwoBedroomInstance extends TwoBedroomDesign{
	
	public static void main(String[] args){
		TwoBedroomDesign instance=new TwoBedroomInstance();
		System.out.println(instance.noOfRestRooms());
		TwoBedroomDesign instance1=new TwoBedroomInstance();
		System.out.println(instance.noOfRestRooms());
	}
}
