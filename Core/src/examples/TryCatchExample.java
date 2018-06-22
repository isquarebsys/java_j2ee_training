package examples;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String four="four";
//		int fourInt=Integer.parseInt(four);

		try {
			String four="four";
			int fourInt=Integer.parseInt(four);
		}catch(NumberFormatException e) {
			System.out.println("Number Format Exception occurred");
		}catch(Exception e) {
			System.out.println("This block will NOT be reached");
		}
		

	}

}
