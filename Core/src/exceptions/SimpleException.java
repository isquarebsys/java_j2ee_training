package exceptions;

public class SimpleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try{
//		String geoLocation="Hello";
//		double latitude=Double.parseDouble(geoLocation);
//		}catch(NumberFormatException ne){
//			System.out.println("Number Format Exception: "+ne.toString());
//		}catch(Exception e){
//			System.out.println("Exception: "+e.toString());
//		}
		
		Calculator calcuator=new Calculator();
		int addedNumber;
		try {
			addedNumber = calcuator.add("a", "2");
			System.out.println("Added Number: "+addedNumber);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
